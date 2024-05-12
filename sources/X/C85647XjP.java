package X;

import android.os.Bundle;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XjP, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85647XjP extends R4M {
    public final /* synthetic */ C85648XjQ LIZ;

    public C85647XjP(C85648XjQ c85648XjQ) {
        this.LIZ = c85648XjQ;
    }

    @Override // X.R4M
    /* renamed from: LIZIZ */
    public final void onSuccess(R40<R7E> r40) {
        String enterMethod = this.LIZ.LJLILLLLZI.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
        C85649XjR.LIZ(true, enterMethod, null, 0, this.LIZ.LJLILLLLZI.getEnterFrom(), 12);
        this.LIZ.LJLJJL.LIZ(true);
        C85648XjQ c85648XjQ = this.LIZ;
        String enterFrom = this.LIZ.LJLILLLLZI.getEnterFrom();
        o.LJIIIIZZ(enterFrom, "dependencies.enterFrom");
        String enterMethod2 = this.LIZ.LJLILLLLZI.getEnterMethod();
        o.LJIIIIZZ(enterMethod2, "dependencies.enterMethod");
        String str = (String) this.LIZ.LJLILLLLZI.LJLJLLL.getValue();
        o.LJIIIIZZ(str, "dependencies.enterType");
        String lv0 = this.LIZ.LJLILLLLZI.lv0();
        o.LJIIIIZZ(lv0, "dependencies.loginPanelType");
        C85648XjQ.L(c85648XjQ, 0, enterFrom, enterMethod2, str, lv0);
        C85648XjQ c85648XjQ2 = this.LIZ;
        SmartRoute buildRoute = SmartRouter.buildRoute(c85648XjQ2.LJLIL.getContext(), "//account/login/signup_or_login");
        buildRoute.withParam("current_scene", EnumC69116RAq.LOGIN.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.PHONE_SMS_LOGIN.getValue());
        Bundle kv0 = c85648XjQ2.LJLILLLLZI.kv0();
        kv0.putBoolean("code_sent", true);
        kv0.putSerializable("args_phone_number", c85648XjQ2.LJLJI.getPhoneNumberObject());
        buildRoute.withParam(kv0);
        buildRoute.withParam("enter_from", c85648XjQ2.LJLILLLLZI.getEnterFrom());
        buildRoute.withParam("enter_method", c85648XjQ2.LJLILLLLZI.getEnterMethod());
        buildRoute.open();
    }

    @Override // X.R4M
    /* renamed from: LIZ */
    public final void onError(R40<R7E> r40, int i) {
        String LIZ;
        String enterMethod = this.LIZ.LJLILLLLZI.getEnterMethod();
        o.LJIIIIZZ(enterMethod, "dependencies.enterMethod");
        C85649XjR.LIZ(false, enterMethod, null, 0, this.LIZ.LJLILLLLZI.getEnterFrom(), 12);
        this.LIZ.LJLJJL.LIZ(true);
        if (i != 1002 && i != 1003) {
            if (i != 1011 && i != 1054) {
                C85648XjQ c85648XjQ = this.LIZ;
                if (r40 == null || (LIZ = r40.LJFF) == null) {
                    LIZ = C88913eJ.LIZ(c85648XjQ.LJLIL, R.string.gqr, "item.context.getString(R…client_servererror_toast)");
                }
                c85648XjQ.LJLJJI.LIZIZ(LIZ);
                return;
            }
            C85648XjQ c85648XjQ2 = this.LIZ;
            c85648XjQ2.LJLJJI.LIZIZ(C88913eJ.LIZ(c85648XjQ2.LJLIL, R.string.dp6, "item.context.getString(R…_reset_phone_input_error)"));
            return;
        }
        C85648XjQ c85648XjQ3 = this.LIZ;
        c85648XjQ3.LJLJJI.LIZIZ(C88913eJ.LIZ(c85648XjQ3.LJLIL, R.string.dqf, "item.context.getString(R…ration_phone_input_error)"));
    }
}
