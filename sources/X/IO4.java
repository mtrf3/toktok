package X;

/* loaded from: classes9.dex */
public enum IO4 {
    PROFILE_AD_REQUEST_SOURCE_ENTER_DRAW(1),
    PROFILE_AD_REQUEST_SOURCE_LOAD_MORE(2);

    public final int LJLIL;

    public static IO4 valueOf(String str) {
        return (IO4) V0N.LJJJ(IO4.class, str);
    }

    public final int getSOURCE() {
        return this.LJLIL;
    }

    IO4(int i) {
        this.LJLIL = i;
    }
}
