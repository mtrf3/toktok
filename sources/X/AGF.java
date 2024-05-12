package X;

import Y.ACListenerS26S0100000_6;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public abstract class AGF extends Dialog {
    public boolean LJLIL;

    public abstract void LIZ();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AGF(Context context) {
        super(context, R.style.a95);
        o.LJIIIZ(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.5f;
            }
            if (window != null) {
                window.addFlags(2);
                window.setAttributes(attributes);
            }
        }
    }

    public final void LIZIZ(String str) {
        String str2;
        int i;
        if (AGI.LIZ()) {
            ICompliancePolicyService LJII = a.LJII();
            if (LJII != null) {
                LJII.LIZIZ(new O0X(AGJ.CONSENT_BOX_ROW_OLD.getValue(), str, true, false, 20), new AGG());
                return;
            }
            return;
        }
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        String LJIILL = AccountService.LJIJ().LJIILL();
        if (LJIILL != null) {
            Locale locale = Locale.ROOT;
            str2 = C141415gn.LIZIZ(locale, "ROOT", LJIILL, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            str2 = null;
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("https://www.tiktok.com/in_app/redirect?region=", str2, "&language=", appLanguage, "&projectKey=");
        LIZLLL.append(str);
        C38281F0r c38281F0r = new C38281F0r(X1D.LIZIZ(LIZLLL));
        c38281F0r.LIZLLL("lang", LocalServiceImpl.LIZIZ().LIZ(getContext()));
        int hashCode = str.hashCode();
        if (hashCode != -1694110974) {
            if (hashCode != -565301353) {
                if (hashCode == -498638057 && str.equals("privacy-policy")) {
                    i = R.string.du_;
                    SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "aweme://webview");
                    buildRoute.withParam("url", c38281F0r.LJ());
                    buildRoute.withParam("title", getContext().getString(i));
                    buildRoute.open();
                }
                i = 0;
                SmartRoute buildRoute2 = SmartRouter.buildRoute(getContext(), "aweme://webview");
                buildRoute2.withParam("url", c38281F0r.LJ());
                buildRoute2.withParam("title", getContext().getString(i));
                buildRoute2.open();
            }
            if (str.equals("terms-of-use")) {
                i = R.string.dua;
                SmartRoute buildRoute22 = SmartRouter.buildRoute(getContext(), "aweme://webview");
                buildRoute22.withParam("url", c38281F0r.LJ());
                buildRoute22.withParam("title", getContext().getString(i));
                buildRoute22.open();
            }
            i = 0;
            SmartRoute buildRoute222 = SmartRouter.buildRoute(getContext(), "aweme://webview");
            buildRoute222.withParam("url", c38281F0r.LJ());
            buildRoute222.withParam("title", getContext().getString(i));
            buildRoute222.open();
        }
        if (str.equals("cookie-policy-eu")) {
            i = R.string.du9;
            SmartRoute buildRoute2222 = SmartRouter.buildRoute(getContext(), "aweme://webview");
            buildRoute2222.withParam("url", c38281F0r.LJ());
            buildRoute2222.withParam("title", getContext().getString(i));
            buildRoute2222.open();
        }
        i = 0;
        SmartRoute buildRoute22222 = SmartRouter.buildRoute(getContext(), "aweme://webview");
        buildRoute22222.withParam("url", c38281F0r.LJ());
        buildRoute22222.withParam("title", getContext().getString(i));
        buildRoute22222.open();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.amx);
        setCancelable(false);
        LIZ();
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.auo), new ACListenerS26S0100000_6(this, 10));
    }
}
