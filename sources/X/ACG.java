package X;

/* loaded from: classes5.dex */
public enum ACG {
    LANGUAGE_NOT_SUPPORTED("language_not_supported"),
    NO_AUTHORIZATION("no_authorization"),
    OTHERS("others"),
    SPEECH_NOT_RECOGNIZED("speech_not_recognized");

    public final String LJLIL;

    public static ACG valueOf(String str) {
        return (ACG) V0N.LJJJ(ACG.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    ACG(String str) {
        this.LJLIL = str;
    }
}
