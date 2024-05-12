package X;

/* renamed from: X.Xvm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public enum EnumC86414Xvm {
    LIGHT(50),
    MEDIUM(125),
    HEAVY(255),
    UNKNOWN(0);

    public static final C86416Xvo Companion = new C86416Xvo();
    public final int LJLIL;

    public static EnumC86414Xvm valueOf(String str) {
        return (EnumC86414Xvm) V0N.LJJJ(EnumC86414Xvm.class, str);
    }

    public final int getAmplitude() {
        return this.LJLIL;
    }

    EnumC86414Xvm(int i) {
        this.LJLIL = i;
    }
}
