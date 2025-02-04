import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jx")
@Implements("LoginPacket")
public class LoginPacket implements class260 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ljx;")
	public static final LoginPacket field3152;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ljx;")
	static final LoginPacket field3149;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ljx;")
	public static final LoginPacket field3145;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ljx;")
	public static final LoginPacket field3146;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ljx;")
	public static final LoginPacket field3147;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Ljx;")
	static final LoginPacket field3148;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "[Ljx;")
	@Export("LoginPacket_indexedValues")
	static final LoginPacket[] LoginPacket_indexedValues;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -92535415)
	@Export("id")
	public final int id;

	static {
		field3152 = new LoginPacket(14, 0);
		field3149 = new LoginPacket(15, 4);
		field3145 = new LoginPacket(16, -2);
		field3146 = new LoginPacket(18, -2);
		field3147 = new LoginPacket(19, -2);
		field3148 = new LoginPacket(27, 0);
		LoginPacket_indexedValues = new LoginPacket[32];
		LoginPacket[] var0 = new LoginPacket[]{ field3149, field3148, field3145, field3146, field3147, field3152 };
		LoginPacket[] var1 = var0;
		for (int var2 = 0; var2 < var1.length; ++var2) {
			LoginPacket_indexedValues[var1[var2].id] = var1[var2];
		}
	}

	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "0")
	LoginPacket(int var1, int var2) {
		this.id = var1;
	}
}