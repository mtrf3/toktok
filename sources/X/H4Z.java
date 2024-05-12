package X;

/* loaded from: classes8.dex */
public enum H4Z {
    UPLOAD_SDK("upload_sdk"),
    VESDK("vesdk"),
    SERVER("server"),
    CLIENT("client"),
    USER("user");

    public final String LJLIL;

    public static H4Z valueOf(String str) {
        return (H4Z) V0N.LJJJ(H4Z.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    H4Z(String str) {
        this.LJLIL = str;
    }
}
