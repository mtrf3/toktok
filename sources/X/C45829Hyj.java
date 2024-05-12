package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Hyj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45829Hyj {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(String shootWay, String str, C45828Hyi errorStatus, int i) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(errorStatus, "errorStatus");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_method", shootWay);
        c188727au.LIZLLL(errorStatus.LIZ, "error_code");
        c188727au.LIZLLL(errorStatus.LIZIZ, "sub_error_code");
        String str2 = errorStatus.LIZLLL;
        if (str2.length() == 0) {
            str2 = errorStatus.LIZJ;
        }
        c188727au.LJIIIZ("error_msg", str2);
        c188727au.LIZLLL(i, "share_media_type");
        if (str != null) {
            c188727au.LJI("channel", str);
        }
        FMX.LJIIL("open_share_after_check_result", c188727au.LIZ);
    }

    public static final C188727au LIZ(String shootWay, String str, C45828Hyi errorStatus, String str2, String sdkName, String sdkVersion, int i, int i2) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(errorStatus, "errorStatus");
        o.LJIIIZ(sdkName, "sdkName");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("launch_method", shootWay);
        c188727au.LIZLLL(i, "share_media_type");
        c188727au.LIZLLL(i2, "share_media_count");
        c188727au.LIZLLL(errorStatus.LIZ, "error_code");
        c188727au.LIZLLL(errorStatus.LIZIZ, "sub_error_code");
        String str3 = errorStatus.LIZLLL;
        if (str3.length() == 0) {
            str3 = errorStatus.LIZJ;
        }
        c188727au.LJIIIZ("error_msg", str3);
        if (sdkName.length() > 0) {
            c188727au.LJI("sdk_name", sdkName);
        }
        if (sdkVersion.length() > 0) {
            c188727au.LJI("sdk_version", sdkVersion);
        }
        if (str != null) {
            c188727au.LJI("result", str);
        }
        if (str2 != null) {
            c188727au.LJI("channel", str2);
        }
        return c188727au;
    }
}
