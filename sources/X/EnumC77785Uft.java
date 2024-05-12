package X;

/* renamed from: X.Uft, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC77785Uft {
    UNKNOWN_JUMP_TYPE(-1, "Unknown jumpType (authType)"),
    NO_GOOGLE_PLAY_STORE_INSTALLED(-2, "No Google Play Store installed."),
    URL_EMPTY(-3, "Url is empty");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC77785Uft valueOf(String str) {
        return (EnumC77785Uft) V0N.LJJJ(EnumC77785Uft.class, str);
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMessage() {
        return this.LJLILLLLZI;
    }

    EnumC77785Uft(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
