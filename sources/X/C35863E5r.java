package X;

import kotlin.jvm.internal.o;

/* renamed from: X.E5r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35863E5r {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, String str, boolean z) {
        int i2;
        C188727au c188727au = new C188727au();
        Boolean LIZLLL = C38987FRv.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "isFirstInstallAndFirstLaunch()");
        c188727au.LIZLLL(LIZLLL.booleanValue() ? 1 : 0, "is_cold_start_first_launch");
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c188727au.LIZLLL(i2, "is_success");
        c188727au.LIZLLL(i, "error_code");
        c188727au.LJIIIZ("error_message", str);
        FMX.LJIIL("did_vid_info_upload_result", c188727au.LIZ);
    }
}
