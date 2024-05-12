package X;

import com.ss.android.ugc.aweme.compliance.business.antibullying.base.CyberbullyingApi;
import com.ss.android.ugc.aweme.compliance.business.antibullying.extremely.AntiBullyingExtremelyFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GIL extends GIJ {
    public final /* synthetic */ AntiBullyingExtremelyFragment LIZLLL;

    @Override // X.GIJ
    public final String LIZJ() {
        return "extreme_anti_bullying_page";
    }

    @Override // X.GIJ
    public final void LIZLLL() {
        C188727au c188727au = new C188727au();
        LJI(c188727au);
        LJIIIIZZ(c188727au);
        LIZIZ(c188727au);
        FMX.LJIIL("comment_extreme_anti_bullying_protection_page_show", c188727au.LIZ);
    }

    @Override // X.GIJ
    public final void LJ() {
        C188727au c188727au = new C188727au();
        LIZ(c188727au);
        LJI(c188727au);
        LJII(c188727au);
        LJIIIIZZ(c188727au);
        c188727au.LIZLLL(this.LIZIZ ? 1 : 0, "is_saved");
        LIZIZ(c188727au);
        FMX.LJIIL("comment_general_anti_bullying_protection_page_back_click", c188727au.LIZ);
    }

    @Override // X.GIJ
    public final void LJFF() {
        C188727au c188727au = new C188727au();
        LIZ(c188727au);
        LJI(c188727au);
        LJII(c188727au);
        LJIIIIZZ(c188727au);
        FMX.LJIIL("comment_extreme_anti_bullying_protection_page_save_click", c188727au.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GIL(AntiBullyingExtremelyFragment antiBullyingExtremelyFragment) {
        super(antiBullyingExtremelyFragment);
        this.LIZLLL = antiBullyingExtremelyFragment;
    }

    public final C188727au LJII(C188727au c188727au) {
        String str;
        Boolean value = this.LIZLLL.xl().LJLJJL.getValue();
        if (value == null) {
            return c188727au;
        }
        boolean booleanValue = value.booleanValue();
        Boolean value2 = this.LIZLLL.xl().LJLJJI.getValue();
        if (value2 == null) {
            return c188727au;
        }
        boolean booleanValue2 = value2.booleanValue();
        String str2 = "on";
        if (booleanValue) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJI("filter_stranger_comments_valid_status", str);
        if (!booleanValue2) {
            str2 = "off";
        }
        c188727au.LJI("filter_unfriendly_comments_valid_status", str2);
        return c188727au;
    }

    public final C188727au LJIIIIZZ(C188727au c188727au) {
        Boolean bool;
        Boolean bool2;
        String str;
        String str2;
        String str3;
        CyberbullyingApi.CyberBullyingSettingsResp cyberBullyingSettingsResp = this.LIZ;
        if (cyberBullyingSettingsResp != null && (bool = cyberBullyingSettingsResp.filterStrangerComments) != null) {
            boolean booleanValue = bool.booleanValue();
            CyberbullyingApi.CyberBullyingSettingsResp cyberBullyingSettingsResp2 = this.LIZ;
            if (cyberBullyingSettingsResp2 != null && (bool2 = cyberBullyingSettingsResp2.filterUnfriendlyUserComments) != null) {
                boolean booleanValue2 = bool2.booleanValue();
                String str4 = "on";
                if (booleanValue) {
                    str = "on";
                } else {
                    str = "off";
                }
                c188727au.LJI("original_filter_stranger_comments_valid_status", str);
                CyberbullyingApi.CyberBullyingSettingsResp cyberBullyingSettingsResp3 = this.LIZ;
                if ((cyberBullyingSettingsResp3 == null || !o.LJ(cyberBullyingSettingsResp3.hasUpdateBullyingSettings, Boolean.FALSE)) && booleanValue) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                c188727au.LJI("original_filter_stranger_comments_show_status", str2);
                if (booleanValue2) {
                    str3 = "on";
                } else {
                    str3 = "off";
                }
                c188727au.LJI("original_filter_unfriendly_comments_valid_status", str3);
                CyberbullyingApi.CyberBullyingSettingsResp cyberBullyingSettingsResp4 = this.LIZ;
                if ((cyberBullyingSettingsResp4 == null || !o.LJ(cyberBullyingSettingsResp4.hasUpdateBullyingSettings, Boolean.FALSE)) && !booleanValue2) {
                    str4 = "off";
                }
                c188727au.LJI("original_filter_unfriendly_comments_show_status", str4);
            }
        }
        return c188727au;
    }
}
