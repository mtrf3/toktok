package X;

/* renamed from: X.aaI, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public enum EnumC94022aaI {
    JPG("image/jpg"),
    JPEG("image/jpeg"),
    PNG("image/png"),
    GIF("image/gif"),
    WEBP("image/webp"),
    HEIC("image/heic"),
    HEIF("image/heif"),
    BMP("image/x-ms-bmp"),
    MP4("video/mp4"),
    MKV("video/x-matroska"),
    TS("video/mp2ts"),
    AVI("video/avi"),
    MPEG("video/mpeg"),
    THREEGPP("video/3gpp"),
    THREEGPP2("video/3gpp2"),
    QUICKTIME("video/quicktime"),
    WEBM("video/webm");

    public final String LJLIL;

    public static EnumC94022aaI valueOf(String str) {
        return (EnumC94022aaI) V0N.LJJJ(EnumC94022aaI.class, str);
    }

    public final String getMimeType() {
        return this.LJLIL;
    }

    EnumC94022aaI(String str) {
        this.LJLIL = str;
    }
}
