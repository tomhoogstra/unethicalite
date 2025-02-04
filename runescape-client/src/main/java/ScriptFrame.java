import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bg")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("cw")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lbi;")
	@Export("script")
	Script script;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1512825097)
	@Export("pc")
	int pc;

	@ObfuscatedName("q")
	@Export("intLocals")
	int[] intLocals;

	@ObfuscatedName("f")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)Lgc;", garbageValue = "12")
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = ((SequenceDefinition) (SequenceDefinition.SequenceDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0);
			var1 = new SequenceDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			SequenceDefinition.SequenceDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(III)Lkb;", garbageValue = "114682209")
	@Export("getWidgetChild")
	public static Widget getWidgetChild(int var0, int var1) {
		Widget var2 = class140.getWidget(var0);
		if (var1 == -1) {
			return var2;
		} else {
			return var2 != null && var2.children != null && var1 < var2.children.length ? var2.children[var1] : null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)Ldf;", garbageValue = "-246877585")
	static class123 method1052(int var0) {
		class123 var1 = ((class123) (Actor.findEnumerated(Interpreter.method1866(), var0)));
		if (var1 == null) {
			var1 = class123.field1528;
		}
		return var1;
	}
}