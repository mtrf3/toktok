package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jz8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC50950Jz8 implements InterfaceC65644PpY<Object, String> {
    public static final EnumC50950Jz8 LJLIL;
    public static final /* synthetic */ EnumC50950Jz8[] LJLILLLLZI;

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.toStringFunction()";
    }

    static {
        EnumC50950Jz8 enumC50950Jz8 = new EnumC50950Jz8();
        LJLIL = enumC50950Jz8;
        LJLILLLLZI = new EnumC50950Jz8[]{enumC50950Jz8};
    }

    public static EnumC50950Jz8[] values() {
        return (EnumC50950Jz8[]) LJLILLLLZI.clone();
    }

    public static EnumC50950Jz8 valueOf(String str) {
        return (EnumC50950Jz8) V0N.LJJJ(EnumC50950Jz8.class, str);
    }

    @Override // X.InterfaceC65644PpY
    public final String apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }
}
