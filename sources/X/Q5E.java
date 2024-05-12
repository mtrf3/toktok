package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.WebDialog;
import com.facebook.login.WebViewLoginMethodHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q5E extends Q5H {
    public String LJI;
    public Q5O LJII;
    public Q5I LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public String LJIIL;

    public final WebDialog LIZ() {
        String str;
        Bundle bundle = this.LJ;
        if (bundle != null) {
            bundle.putString("redirect_uri", this.LJI);
            bundle.putString("client_id", this.LIZIZ);
            String str2 = this.LJIIJJI;
            if (str2 != null) {
                bundle.putString("e2e", str2);
                if (this.LJIIIIZZ == Q5I.INSTAGRAM) {
                    str = "token,signed_request,graph_domain,granted_scopes";
                } else {
                    str = "token,signed_request,graph_domain";
                }
                bundle.putString("response_type", str);
                bundle.putString("return_scopes", "true");
                String str3 = this.LJIIL;
                if (str3 != null) {
                    bundle.putString("auth_type", str3);
                    bundle.putString("login_behavior", this.LJII.name());
                    if (this.LJIIIZ) {
                        bundle.putString("fx_app", this.LJIIIIZZ.toString());
                    }
                    if (this.LJIIJ) {
                        bundle.putString("skip_dedupe", "true");
                    }
                    Context context = this.LIZ;
                    if (context != null) {
                        Q5I targetApp = this.LJIIIIZZ;
                        InterfaceC66401Q4f interfaceC66401Q4f = this.LIZLLL;
                        o.LJIIIZ(targetApp, "targetApp");
                        WebDialog.LIZIZ(context);
                        return new WebDialog(context, "oauth", bundle, targetApp, interfaceC66401Q4f);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                }
                o.LJIJI("authType");
                throw null;
            }
            o.LJIJI("e2e");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q5E(WebViewLoginMethodHandler this$0, ActivityC45651qj activityC45651qj, String applicationId, Bundle bundle) {
        super(activityC45651qj, applicationId, bundle, 0);
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(applicationId, "applicationId");
        this.LJI = "fbconnect://success";
        this.LJII = Q5O.NATIVE_WITH_FALLBACK;
        this.LJIIIIZZ = Q5I.FACEBOOK;
    }
}
