package X;

/* loaded from: classes13.dex */
public enum TEA {
    UNKNOWN,
    NOT_DOWNLOAD,
    DOWNLOADING,
    DOWNLOAD_SUCCESS,
    DOWNLOAD_FAILED;

    public static TEA valueOf(String str) {
        return (TEA) V0N.LJJJ(TEA.class, str);
    }
}
