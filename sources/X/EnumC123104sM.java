package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC123104sM {
    public static final EnumC123104sM IS_DIRECT_LIVE;
    public static final /* synthetic */ EnumC123104sM[] LJLILLLLZI;
    public final int LJLIL = 1;

    public static EnumC123104sM valueOf(String str) {
        return (EnumC123104sM) V0N.LJJJ(EnumC123104sM.class, str);
    }

    public static EnumC123104sM[] values() {
        return (EnumC123104sM[]) LJLILLLLZI.clone();
    }

    static {
        EnumC123104sM enumC123104sM = new EnumC123104sM();
        IS_DIRECT_LIVE = enumC123104sM;
        LJLILLLLZI = new EnumC123104sM[]{enumC123104sM};
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
