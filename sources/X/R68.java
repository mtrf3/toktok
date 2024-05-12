package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;

/* loaded from: classes12.dex */
public final class R68 implements View.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ R6A LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ Bundle LJLJJI;

    public R68(String str, R6A r6a, Context context, Bundle bundle) {
        this.LJLIL = str;
        this.LJLILLLLZI = r6a;
        this.LJLJI = context;
        this.LJLJJI = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", this.LJLIL);
        c35936E8m.LIZLLL("login_panel_type", "login");
        FMX.LJIIL("click_phone_email", c35936E8m.LIZ);
        this.LJLILLLLZI.LJJLIL("click_platform");
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) C58725N2z.LIZIZ(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.log("click_login");
            iFeed0VVManagerService.LIZ("LOGIN");
        }
        SmartRoute LIZ = R67.LIZ(this.LJLJI);
        Bundle bundle = this.LJLJJI;
        if (bundle != null) {
            LIZ.withParam(bundle);
        }
        LIZ.open();
    }
}
