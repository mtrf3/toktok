package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Kyx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53487Kyx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        String str;
        try {
            LHR.LIZ.LIZ();
            if (!FMX.LIZJ("verify_precise_exp")) {
                return;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ(WM7.SCENE_SERVICE, "e_cold_boot");
            FFL.LJIIIZ().getClass();
            String str2 = "1";
            if (FFL.LJ(31744, "tt_did_precise_exposure_exp_verify_cold_boot", true, true)) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("d_val", str);
            FFL.LJIIIZ().getClass();
            if (!FFL.LJ(31744, "tt_uid_precise_exposure_exp_verify_cold_boot", true, true)) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c188727au.LJIIIZ("u_val", str2);
            FMX.LJIIL("verify_precise_exp", c188727au.LIZ);
        } catch (Throwable unused) {
        }
    }

    public static void LIZIZ(AWY awy) {
        int i;
        String str;
        String str2;
        String str3;
        if (!FMX.LIZJ("verify_precise_exp")) {
            return;
        }
        try {
            C188727au c188727au = new C188727au();
            if (awy == null) {
                i = -1;
            } else {
                i = AWZ.LIZ[awy.ordinal()];
            }
            String str4 = "1";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    c188727au.LJIIIZ(WM7.SCENE_SERVICE, "e_personal_homepage");
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "tt_did_precise_exposure_exp_verify_personal_homepage", true, true)) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJIIIZ("d_val", str3);
                    FFL.LJIIIZ().getClass();
                    if (!FFL.LJ(31744, "tt_uid_precise_exposure_exp_verify_personal_homepage", true, true)) {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJI("u_val", str4);
                } else {
                    c188727au.LJIIIZ(WM7.SCENE_SERVICE, "e_personal_detail");
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "tt_did_precise_exposure_exp_verify_personal_detail", true, true)) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJIIIZ("d_val", str2);
                    FFL.LJIIIZ().getClass();
                    if (!FFL.LJ(31744, "tt_uid_precise_exposure_exp_verify_personal_detail", true, true)) {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c188727au.LJI("u_val", str4);
                }
            } else {
                c188727au.LJIIIZ(WM7.SCENE_SERVICE, "e_discovery_page");
                FFL.LJIIIZ().getClass();
                if (FFL.LJ(31744, "tt_did_precise_exposure_exp_verify_discovery", true, true)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("d_val", str);
                FFL.LJIIIZ().getClass();
                if (!FFL.LJ(31744, "tt_uid_precise_exposure_exp_verify_discovery", true, true)) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJI("u_val", str4);
            }
            FMX.LJIIL("verify_precise_exp", c188727au.LIZ);
        } catch (Throwable unused) {
        }
    }
}
