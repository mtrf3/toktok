package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R67 {
    public static final /* synthetic */ int LIZ = 0;

    public static final SmartRoute LIZ(Context context) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
        buildRoute.withParam("current_scene", EnumC69116RAq.LOGIN.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.PHONE_EMAIL_LOGIN.getValue());
        o.LJIIIIZZ(buildRoute, "buildRoute(context, SIGN….PHONE_EMAIL_LOGIN.value)");
        return buildRoute;
    }

    public static final SmartRoute LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/ftc");
        buildRoute.withParam("current_scene", EnumC69116RAq.SIGN_UP.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.FTC_CREATE_ACCOUNT.getValue());
        o.LJIIIIZZ(buildRoute, "buildRoute(context, FTC_…FTC_CREATE_ACCOUNT.value)");
        return buildRoute;
    }

    public static final SmartRoute LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
        buildRoute.withParam("current_scene", EnumC69116RAq.SIGN_UP.getValue());
        buildRoute.withParam("next_page", EnumC69113RAn.PHONE_EMAIL_SIGN_UP.getValue());
        o.LJIIIIZZ(buildRoute, "buildRoute(context, SIGN…HONE_EMAIL_SIGN_UP.value)");
        return buildRoute;
    }
}
