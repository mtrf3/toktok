package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Jfa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC49738Jfa {
    public static final EnumC49738Jfa AID;
    public static final /* synthetic */ EnumC49738Jfa[] LJLILLLLZI;
    public final String LJLIL = "Aid";

    public static EnumC49738Jfa valueOf(String str) {
        return (EnumC49738Jfa) V0N.LJJJ(EnumC49738Jfa.class, str);
    }

    public static EnumC49738Jfa[] values() {
        return (EnumC49738Jfa[]) LJLILLLLZI.clone();
    }

    static {
        EnumC49738Jfa enumC49738Jfa = new EnumC49738Jfa();
        AID = enumC49738Jfa;
        LJLILLLLZI = new EnumC49738Jfa[]{enumC49738Jfa};
    }

    public final String getType() {
        return this.LJLIL;
    }
}
