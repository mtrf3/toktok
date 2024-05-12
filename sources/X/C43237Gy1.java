package X;

/* renamed from: X.Gy1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43237Gy1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, int i3) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "download_video");
        c188727au.LIZLLL(i3, "aweme_type");
        c188727au.LIZLLL(i, "pic_cnt");
        c188727au.LIZLLL(i2, "type");
        FMX.LJIIL("add_watermark", c188727au.LIZ);
    }

    public static void LIZIZ(int i, int i2, int i3, long j, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis() - j, "end_watermark");
        c188727au.LJIIIZ("watermark_id", str);
        c188727au.LIZLLL(0, "watermark_sdk");
        c188727au.LIZLLL(1, "is_self_video");
        c188727au.LIZLLL(i3, "aweme_type");
        c188727au.LIZLLL(i, "pic_cnt");
        c188727au.LIZLLL(i2, "type");
        FMX.LJIIL("client_watermark_end", c188727au.LIZ);
    }

    public static void LIZJ(int i, int i2, int i3, long j, String str) {
        C188727au LJ = C169696lJ.LJ(j, "start_watermark");
        LJ.LJIIIZ("watermark_id", str);
        LJ.LIZLLL(0, "watermark_sdk");
        LJ.LIZLLL(1, "is_self_video");
        LJ.LIZLLL(i3, "aweme_type");
        LJ.LIZLLL(i, "pic_cnt");
        LJ.LIZLLL(i2, "type");
        FMX.LJIIL("client_watermark_start", LJ.LIZ);
    }
}
