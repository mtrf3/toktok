package X;

/* loaded from: classes12.dex */
public enum PWT {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    public final int httpCode;

    public static PWT fromHttp2(int i) {
        for (PWT pwt : values()) {
            if (pwt.httpCode == i) {
                return pwt;
            }
        }
        return null;
    }

    public static PWT valueOf(String str) {
        return (PWT) V0N.LJJJ(PWT.class, str);
    }

    PWT(int i) {
        this.httpCode = i;
    }
}
