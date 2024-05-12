package X;

/* loaded from: classes5.dex */
public enum ACI {
    LANGUAGE_NOT_SUPPORTED("language_not_supported"),
    NO_AUTHORIZATION("no_authorization"),
    OTHERS("others"),
    SPEECH_NOT_RECOGNIZED("speech_not_recognized");

    public final String LJLIL;

    public static ACI valueOf(String str) {
        return (ACI) V0N.LJJJ(ACI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    ACI(String str) {
        this.LJLIL = str;
    }
}
