import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jg")
@Implements("MusicPatch")
public class MusicPatch extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1740181359)
	int field3247;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "[Laf;")
	@Export("rawSounds")
	RawSound[] rawSounds;

	@ObfuscatedName("q")
	short[] field3250;

	@ObfuscatedName("f")
	byte[] field3253;

	@ObfuscatedName("j")
	byte[] field3251;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "[Ljv;")
	MusicPatchNode2[] field3252;

	@ObfuscatedName("g")
	byte[] field3249;

	@ObfuscatedName("w")
	int[] field3254;

	MusicPatch(byte[] var1) {
		this.rawSounds = new RawSound[128];
		this.field3250 = new short[128];
		this.field3253 = new byte[128];
		this.field3251 = new byte[128];
		this.field3252 = new MusicPatchNode2[128];
		this.field3249 = new byte[128];
		this.field3254 = new int[128];
		Buffer var2 = new Buffer(var1);
		int var3;
		for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
		}
		byte[] var4 = new byte[var3];
		int var5;
		for (var5 = 0; var5 < var3; ++var5) {
			var4[var5] = var2.readByte();
		}
		++var2.offset;
		++var3;
		var5 = var2.offset;
		var2.offset += var3;
		int var6;
		for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
		}
		byte[] var7 = new byte[var6];
		int var8;
		for (var8 = 0; var8 < var6; ++var8) {
			var7[var8] = var2.readByte();
		}
		++var2.offset;
		++var6;
		var8 = var2.offset;
		var2.offset += var6;
		int var9;
		for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
		}
		byte[] var10 = new byte[var9];
		for (int var11 = 0; var11 < var9; ++var11) {
			var10[var11] = var2.readByte();
		}
		++var2.offset;
		++var9;
		byte[] var38 = new byte[var9];
		int var12;
		int var14;
		if (var9 > 1) {
			var38[1] = 1;
			int var13 = 1;
			var12 = 2;
			for (var14 = 2; var14 < var9; ++var14) {
				int var43 = var2.readUnsignedByte();
				if (var43 == 0) {
					var13 = var12++;
				} else {
					if (var43 <= var13) {
						--var43;
					}
					var13 = var43;
				}
				var38[var14] = ((byte) (var13));
			}
		} else {
			var12 = var9;
		}
		MusicPatchNode2[] var39 = new MusicPatchNode2[var12];
		MusicPatchNode2 var15;
		for (var14 = 0; var14 < var39.length; ++var14) {
			var15 = var39[var14] = new MusicPatchNode2();
			int var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field3184 = new byte[var42 * 2];
			}
			var42 = var2.readUnsignedByte();
			if (var42 > 0) {
				var15.field3181 = new byte[var42 * 2 + 2];
				var15.field3181[1] = 64;
			}
		}
		var14 = var2.readUnsignedByte();
		byte[] var44 = (var14 > 0) ? new byte[var14 * 2] : null;
		var14 = var2.readUnsignedByte();
		byte[] var16 = (var14 > 0) ? new byte[var14 * 2] : null;
		int var17;
		for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
		}
		byte[] var18 = new byte[var17];
		int var19;
		for (var19 = 0; var19 < var17; ++var19) {
			var18[var19] = var2.readByte();
		}
		++var2.offset;
		++var17;
		var19 = 0;
		int var20;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			this.field3250[var20] = ((short) (var19));
		}
		var19 = 0;
		short[] var50;
		for (var20 = 0; var20 < 128; ++var20) {
			var19 += var2.readUnsignedByte();
			var50 = this.field3250;
			var50[var20] = ((short) (var50[var20] + (var19 << 8)));
		}
		var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23;
		for (var23 = 0; var23 < 128; ++var23) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}
				var22 = var2.readVarInt();
			}
			var50 = this.field3250;
			var50[var23] = ((short) (var50[var23] + ((var22 - 1 & 2) << 14)));
			this.field3254[var23] = var22;
			--var20;
		}
		var20 = 0;
		var21 = 0;
		var23 = 0;
		int var24;
		for (var24 = 0; var24 < 128; ++var24) {
			if (this.field3254[var24] != 0) {
				if (var20 == 0) {
					if (var21 < var4.length) {
						var20 = var4[var21++];
					} else {
						var20 = -1;
					}
					var23 = var2.array[var5++] - 1;
				}
				this.field3249[var24] = ((byte) (var23));
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		var24 = 0;
		for (int var25 = 0; var25 < 128; ++var25) {
			if (this.field3254[var25] != 0) {
				if (var20 == 0) {
					if (var21 < var7.length) {
						var20 = var7[var21++];
					} else {
						var20 = -1;
					}
					var24 = var2.array[var8++] + 16 << 2;
				}
				this.field3251[var25] = ((byte) (var24));
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		MusicPatchNode2 var40 = null;
		int var26;
		for (var26 = 0; var26 < 128; ++var26) {
			if (this.field3254[var26] != 0) {
				if (var20 == 0) {
					var40 = var39[var38[var21]];
					if (var21 < var10.length) {
						var20 = var10[var21++];
					} else {
						var20 = -1;
					}
				}
				this.field3252[var26] = var40;
				--var20;
			}
		}
		var20 = 0;
		var21 = 0;
		var26 = 0;
		int var27;
		for (var27 = 0; var27 < 128; ++var27) {
			if (var20 == 0) {
				if (var21 < var18.length) {
					var20 = var18[var21++];
				} else {
					var20 = -1;
				}
				if (this.field3254[var27] > 0) {
					var26 = var2.readUnsignedByte() + 1;
				}
			}
			this.field3253[var27] = ((byte) (var26));
			--var20;
		}
		this.field3247 = var2.readUnsignedByte() + 1;
		int var29;
		MusicPatchNode2 var41;
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3184 != null) {
				for (var29 = 1; var29 < var41.field3184.length; var29 += 2) {
					var41.field3184[var29] = var2.readByte();
				}
			}
			if (var41.field3181 != null) {
				for (var29 = 3; var29 < var41.field3181.length - 2; var29 += 2) {
					var41.field3181[var29] = var2.readByte();
				}
			}
		}
		if (var44 != null) {
			for (var27 = 1; var27 < var44.length; var27 += 2) {
				var44[var27] = var2.readByte();
			}
		}
		if (var16 != null) {
			for (var27 = 1; var27 < var16.length; var27 += 2) {
				var16[var27] = var2.readByte();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3181 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var41.field3181.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var41.field3181[var29] = ((byte) (var19));
				}
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3184 != null) {
				var19 = 0;
				for (var29 = 2; var29 < var41.field3184.length; var29 += 2) {
					var19 = 1 + var19 + var2.readUnsignedByte();
					var41.field3184[var29] = ((byte) (var19));
				}
			}
		}
		byte var30;
		int var32;
		int var33;
		int var34;
		int var35;
		int var36;
		int var47;
		byte var49;
		if (var44 != null) {
			var19 = var2.readUnsignedByte();
			var44[0] = ((byte) (var19));
			for (var27 = 2; var27 < var44.length; var27 += 2) {
				var19 = var19 + 1 + var2.readUnsignedByte();
				var44[var27] = ((byte) (var19));
			}
			var49 = var44[0];
			byte var28 = var44[1];
			for (var29 = 0; var29 < var49; ++var29) {
				this.field3253[var29] = ((byte) (var28 * this.field3253[var29] + 32 >> 6));
			}
			for (var29 = 2; var29 < var44.length; var29 += 2) {
				var30 = var44[var29];
				byte var31 = var44[var29 + 1];
				var32 = var28 * (var30 - var49) + (var30 - var49) / 2;
				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var32 + var36) / var35 - var36;
					this.field3253[var33] = ((byte) (var34 * this.field3253[var33] + 32 >> 6));
					var32 += var31 - var28;
				}
				var49 = var30;
				var28 = var31;
			}
			for (var47 = var49; var47 < 128; ++var47) {
				this.field3253[var47] = ((byte) (var28 * this.field3253[var47] + 32 >> 6));
			}
			var15 = null;
		}
		if (var16 != null) {
			var19 = var2.readUnsignedByte();
			var16[0] = ((byte) (var19));
			for (var27 = 2; var27 < var16.length; var27 += 2) {
				var19 = 1 + var19 + var2.readUnsignedByte();
				var16[var27] = ((byte) (var19));
			}
			var49 = var16[0];
			int var46 = var16[1] << 1;
			for (var29 = 0; var29 < var49; ++var29) {
				var47 = var46 + (this.field3251[var29] & 255);
				if (var47 < 0) {
					var47 = 0;
				}
				if (var47 > 128) {
					var47 = 128;
				}
				this.field3251[var29] = ((byte) (var47));
			}
			int var48;
			for (var29 = 2; var29 < var16.length; var29 += 2) {
				var30 = var16[var29];
				var48 = var16[var29 + 1] << 1;
				var32 = var46 * (var30 - var49) + (var30 - var49) / 2;
				for (var33 = var49; var33 < var30; ++var33) {
					var35 = var30 - var49;
					var36 = var32 >>> 31;
					var34 = (var36 + var32) / var35 - var36;
					int var37 = var34 + (this.field3251[var33] & 255);
					if (var37 < 0) {
						var37 = 0;
					}
					if (var37 > 128) {
						var37 = 128;
					}
					this.field3251[var33] = ((byte) (var37));
					var32 += var48 - var46;
				}
				var49 = var30;
				var46 = var48;
			}
			for (var47 = var49; var47 < 128; ++var47) {
				var48 = var46 + (this.field3251[var47] & 255);
				if (var48 < 0) {
					var48 = 0;
				}
				if (var48 > 128) {
					var48 = 128;
				}
				this.field3251[var47] = ((byte) (var48));
			}
			Object var45 = null;
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3182 = var2.readUnsignedByte();
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3184 != null) {
				var41.field3190 = var2.readUnsignedByte();
			}
			if (var41.field3181 != null) {
				var41.field3185 = var2.readUnsignedByte();
			}
			if (var41.field3182 > 0) {
				var41.field3183 = var2.readUnsignedByte();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var39[var27].field3187 = var2.readUnsignedByte();
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3187 > 0) {
				var41.field3186 = var2.readUnsignedByte();
			}
		}
		for (var27 = 0; var27 < var12; ++var27) {
			var41 = var39[var27];
			if (var41.field3186 > 0) {
				var41.field3188 = var2.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Laq;[B[II)Z", garbageValue = "-348736464")
	boolean method5424(SoundCache var1, byte[] var2, int[] var3) {
		boolean var4 = true;
		int var5 = 0;
		RawSound var6 = null;
		for (int var7 = 0; var7 < 128; ++var7) {
			if (var2 == null || var2[var7] != 0) {
				int var8 = this.field3254[var7];
				if (var8 != 0) {
					if (var8 != var5) {
						var5 = var8--;
						if ((var8 & 1) == 0) {
							var6 = var1.getSoundEffect(var8 >> 2, var3);
						} else {
							var6 = var1.getMusicSample(var8 >> 2, var3);
						}
						if (var6 == null) {
							var4 = false;
						}
					}
					if (var6 != null) {
						this.rawSounds[var7] = var6;
						this.field3254[var7] = 0;
					}
				}
			}
		}
		return var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "31189")
	@Export("clear")
	void clear() {
		this.field3254 = null;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)[Lka;", garbageValue = "-1569941202")
	public static GameBuild[] method5433() {
		return new GameBuild[]{ GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE };
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([BB)[B", garbageValue = "1")
	static byte[] method5432(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}
}