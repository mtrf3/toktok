package X;

/* loaded from: classes5.dex */
public enum ACH {
    LANGUAGE_NOT_SUPPORTED("language_not_supported"),
    NO_AUTHORIZATION("no_authorization"),
    OTHERS("others"),
    SPEECH_NOT_RECOGNIZED("speech_not_recognized");

    public final String LJLIL;

    public static ACH valueOf(String str) {
        return (ACH) V0N.LJJJ(ACH.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    ACH(String str) {
        this.LJLIL = str;
    }
}
