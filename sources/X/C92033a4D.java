package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment;
import com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpRouteArg;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinSetRouteArg;
import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.verify.PinVerifyFragment;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a4D */
/* loaded from: classes20.dex */
public final class C92033a4D {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//verify_center/forget_pin");
        buildRoute.withParam("previous_page_id", str);
        buildRoute.open();
    }

    public static /* synthetic */ void LIZLLL(ActivityC45651qj activityC45651qj, String str, String str2, InterfaceC88473Ynt interfaceC88473Ynt) {
        LIZJ(activityC45651qj, APL.FULL_PAGE, str, str2, interfaceC88473Ynt);
    }

    public static void LIZIZ(Context context, EnumC92072a4q pinSetMode, List pinRule, String str, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(pinSetMode, "pinSetMode");
        o.LJIIIZ(pinRule, "pinRule");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//verify_center/set_pin");
        buildRoute.withNavArg(new PinSetRouteArg(pinSetMode, pinRule, str));
        buildRoute.open();
        C92031a4B.LIZIZ = interfaceC88472Yns;
    }

    public static void LIZJ(ActivityC45651qj activity, APL pageStyle, String verifyInfo, String previousPageId, InterfaceC88473Ynt interfaceC88473Ynt) {
        String str;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(verifyInfo, "verifyInfo");
        o.LJIIIZ(pageStyle, "pageStyle");
        o.LJIIIZ(previousPageId, "previousPageId");
        try {
            str = new JSONObject(verifyInfo).optString("verify_type");
            o.LJIIIIZZ(str, "{\n            JSONObject…(\"verify_type\")\n        }");
        } catch (Exception unused) {
            C91924a2S.LIZ.LIZLLL("unknown", EnumC91923a2R.PARAM, "parse verify type fail", "");
            str = "";
        }
        if (str.length() == 0) {
            interfaceC88473Ynt.invoke("REJECT", "", "");
            C91924a2S.LIZ.LIZLLL("unknown", EnumC91923a2R.PARAM, "verify type is empty", "");
            return;
        }
        if (o.LJ(str, "OTP")) {
            C92031a4B.LIZJ = interfaceC88473Ynt;
            if (C92032a4C.LIZ[pageStyle.ordinal()] == 1) {
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
                OtpFragment otpFragment = new OtpFragment();
                Bundle bundle = new Bundle();
                bundle.putString("KEY_VERIFY_INFO", verifyInfo);
                bundle.putBoolean("is_half_page", true);
                bundle.putString("previous_page_id", previousPageId);
                otpFragment.setArguments(bundle);
                ASL asl = new ASL();
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLILLLL = otpFragment;
                tuxSheet.LJLLJ = true;
                asl.LJI(1);
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(592));
                TuxSheet tuxSheet2 = asl.LIZ;
                tuxSheet2.LJLLLLLL = LJJIIZ;
                tuxSheet2.LLD = false;
                tuxSheet2.LJLJI = false;
                asl.LJFF(48);
                TuxSheet tuxSheet3 = asl.LIZ;
                tuxSheet3.LJZL = true;
                tuxSheet3.LJZI = false;
                tuxSheet3.LJLIL = otpFragment;
                tuxSheet3.show(supportFragmentManager, (String) null);
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//verify_center/verify_otp");
            buildRoute.withNavArg(new OtpRouteArg(verifyInfo, previousPageId));
            buildRoute.open();
            return;
        }
        if (!o.LJ(str, "PIN")) {
            return;
        }
        if (pageStyle == APL.HALF_PAGE) {
            FragmentManager supportFragmentManager2 = activity.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager2, "activity.supportFragmentManager");
            PinVerifyFragment pinVerifyFragment = new PinVerifyFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("KEY_VERIFY_INFO", verifyInfo);
            bundle2.putSerializable("KEY_VERIFY_PAGE_STYLE", pageStyle);
            bundle2.putString("previous_page_id", previousPageId);
            pinVerifyFragment.setArguments(bundle2);
            ASL asl2 = new ASL();
            TuxSheet tuxSheet4 = asl2.LIZ;
            tuxSheet4.LJLLILLLL = pinVerifyFragment;
            tuxSheet4.LJLLJ = true;
            asl2.LJI(1);
            int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(592));
            TuxSheet tuxSheet5 = asl2.LIZ;
            tuxSheet5.LJLLLLLL = LJJIIZ2;
            tuxSheet5.LLD = false;
            tuxSheet5.LJLJI = false;
            asl2.LJFF(48);
            TuxSheet tuxSheet6 = asl2.LIZ;
            tuxSheet6.LJZL = true;
            tuxSheet6.LJZI = false;
            tuxSheet6.show(supportFragmentManager2, (String) null);
        } else {
            SmartRoute buildRoute2 = SmartRouter.buildRoute(activity, "//verify_center/verify_pin");
            buildRoute2.withParam("KEY_VERIFY_INFO", verifyInfo);
            buildRoute2.withParam("KEY_VERIFY_PAGE_STYLE", pageStyle);
            buildRoute2.withParam("previous_page_id", previousPageId);
            buildRoute2.open();
        }
        C92031a4B.LIZ = interfaceC88473Ynt;
    }
}
