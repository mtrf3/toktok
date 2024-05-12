package X;

import com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.CyberbullyingApi;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class GIJ {
    public CyberbullyingApi.CyberBullyingSettingsResp LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ BaseAntiBullyingFragment LIZJ;

    public abstract String LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public GIJ(BaseAntiBullyingFragment baseAntiBullyingFragment) {
        this.LIZJ = baseAntiBullyingFragment;
    }

    public final void LIZ(C188727au c188727au) {
        String str;
        Boolean value = this.LIZJ.xl().LJLIL.getValue();
        if (value == null) {
            return;
        }
        if (value.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJI("care_mode_valid_status", str);
    }

    public final void LIZIZ(C188727au c188727au) {
        o.LJIIIZ(c188727au, "<this>");
        c188727au.LJI("enter_from", this.LIZJ.getEnterFrom());
    }

    public final void LJI(C188727au c188727au) {
        Boolean bool;
        String str;
        CyberbullyingApi.CyberBullyingSettingsResp cyberBullyingSettingsResp = this.LIZ;
        if (cyberBullyingSettingsResp != null && (bool = cyberBullyingSettingsResp.careMode) != null) {
            boolean booleanValue = bool.booleanValue();
            String str2 = "on";
            if (booleanValue) {
                str = "on";
            } else {
                str = "off";
            }
            c188727au.LJI("original_care_mode_valid_status", str);
            CyberbullyingApi.CyberBullyingSettingsResp cyberBullyingSettingsResp2 = this.LIZ;
            if ((cyberBullyingSettingsResp2 == null || !o.LJ(cyberBullyingSettingsResp2.hasUpdateBullyingSettings, Boolean.FALSE)) && !booleanValue) {
                str2 = "off";
            }
            c188727au.LJI("original_care_mode_show_status", str2);
        }
    }
}
