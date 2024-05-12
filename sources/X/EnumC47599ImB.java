package X;

/* renamed from: X.ImB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC47599ImB {
    BYTEVC1_HARDWARE(1, "bytevc1"),
    BYTEVC1_SOFTWARE(0, "bytevc1"),
    BYTEVC2_SOFTWARE(0, "bytevc2"),
    H264_HARDWARE(1, "h264"),
    H264_SOFTWARE(0, "h264");

    public final int decoder;
    public final String encodeType;

    public static EnumC47599ImB valueOf(String str) {
        return (EnumC47599ImB) V0N.LJJJ(EnumC47599ImB.class, str);
    }

    EnumC47599ImB(int i, String str) {
        this.decoder = i;
        this.encodeType = str;
    }
}
