package X;

/* loaded from: classes13.dex */
public enum TOM {
    PROVIDER_STICKER_STATE_UNKNOWN,
    PROVIDER_STICKER_STATE_NOT_DOWNLOAD,
    PROVIDER_STICKER_STATE_DOWNLOADING,
    PROVIDER_STICKER_STATE_DOWNLOAD_SUCCESS,
    PROVIDER_STICKER_STATE_DOWNLOAD_FAILED;

    public static TOM valueOf(String str) {
        return (TOM) V0N.LJJJ(TOM.class, str);
    }
}
