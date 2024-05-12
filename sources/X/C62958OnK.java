package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.OnK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62958OnK extends AbstractC40941G4z {
    public final Context LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC40941G4z
    public final boolean onCancel() {
        AgeGateServiceImpl.LJIIJJI = false;
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onDeviceBlocked() {
        AgeGateServiceImpl.LJIIJJI = false;
        return false;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onError(PNSErrorModel error) {
        o.LJIIIZ(error, "error");
        AgeGateServiceImpl.LJIIJJI = false;
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onSuccess(C62962OnO result) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(result, "result");
        Date date = result.LIZIZ;
        String str4 = "";
        if (date == null || (str = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(date)) == null) {
            str = "";
        }
        AgeGateServiceImpl.LJI = str;
        if (o.LJ(result.LJ, Boolean.TRUE)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ, "aweme://hyd_action/mixed_age_user_consent");
            if (o.LJ(this.LIZIZ, "from_edit_age")) {
                str3 = "from_edit_dob";
            } else {
                str3 = "from_existing_agegate";
            }
            buildRoute.withParam("enter_from", str3);
            buildRoute.withParam("is_prompt", result.LIZJ);
            buildRoute.open();
            KevaImpl.getRepo("age_gate", 1).storeString("mixed_age_seen", "1");
            return true;
        }
        if (result.LIZJ) {
            if (this.LIZJ) {
                str2 = "aweme://hyd_action/delete_video_us";
            } else {
                str2 = "aweme://hyd_action/delete_video";
            }
            SmartRoute buildRoute2 = SmartRouter.buildRoute(this.LIZ, str2);
            buildRoute2.withParam("enter_from", this.LIZIZ);
            buildRoute2.withParam("is_prompt", 1);
            buildRoute2.withParam("age_gate_post_action", result.LIZ.getValue());
            buildRoute2.withParam("is_kids", 0);
            buildRoute2.open();
        } else {
            String str5 = AgeGateServiceImpl.LJI;
            if (str5 != null) {
                str4 = str5;
            }
            AgeGateServiceImpl.LJIIIZ = false;
            C62964OnQ c62964OnQ = AgeGateServiceImpl.LJII;
            if (c62964OnQ != null) {
                c62964OnQ.LIZ(str4, true);
            }
            AgeGateServiceImpl.LJII = null;
            InterfaceC62969OnV interfaceC62969OnV = AgeGateServiceImpl.LJIIIIZZ;
            if (interfaceC62969OnV != null) {
                interfaceC62969OnV.LIZ(str4, true);
            }
            AgeGateServiceImpl.LJIIIIZZ = null;
        }
        AgeGateServiceImpl.LJIIJJI = false;
        return true;
    }

    @Override // X.AbstractC40941G4z
    public final boolean onUnderage(C62962OnO result) {
        o.LJIIIZ(result, "result");
        EnumC63002Oo2 enumC63002Oo2 = result.LIZ;
        if (enumC63002Oo2 == EnumC63002Oo2.US_FTC) {
            a.LJI().LJIILLIIL(RunnableC62963OnP.LJLIL, true);
            Bundle bundle = new Bundle();
            bundle.putInt("next_page", 1);
            bundle.putBoolean("is_existing_user", true);
            bundle.putInt("is_prompt", result.LIZJ ? 1 : 0);
            bundle.putInt("age_gate_post_action", EnumC62956OnI.US_FTC.getValue());
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZ, "//account/ftc");
            buildRoute.withParam(bundle);
            buildRoute.open();
        } else if (enumC63002Oo2 == EnumC63002Oo2.EU_EEA) {
            SmartRoute buildRoute2 = SmartRouter.buildRoute(this.LIZ, "aweme://hyd_action/account_deleted");
            buildRoute2.withParam("age_gate_time", HG3.LJIILL().getCurUser().getAgeGateTime());
            buildRoute2.withParam("is_prompt", result.LIZJ ? 1 : 0);
            buildRoute2.withParam("age_gate_post_action", result.LIZ.getValue());
            buildRoute2.open();
        }
        AgeGateServiceImpl.LJIIJJI = false;
        return true;
    }

    public C62958OnK(Context context, String str, boolean z) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
