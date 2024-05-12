package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.AppealStatusResponse;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.OnB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62949OnB<T> implements InterfaceC64592gB {
    public final /* synthetic */ ComplianceBusinessActivityAssem LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public C62949OnB(ComplianceBusinessActivityAssem complianceBusinessActivityAssem, String str, String str2, String str3) {
        this.LJLIL = complianceBusinessActivityAssem;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        AppealStatusResponse appealStatusResponse = (AppealStatusResponse) obj;
        PipServiceImpl.LJJII().LJIILJJIL();
        InterfaceC36571c5 LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLIL);
        o.LJII(LJIIIIZZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainActivityService");
        if (!((InterfaceC55452LpY) LJIIIIZZ).isADShowing()) {
            ComplianceBusinessActivityAssem complianceBusinessActivityAssem = this.LJLIL;
            complianceBusinessActivityAssem.LJLILLLLZI = true;
            SmartRoute buildRoute = SmartRouter.buildRoute(C212428Vi.LIZ(complianceBusinessActivityAssem), "//compliance/appeal_dialog");
            buildRoute.withParam("appeal_info", appealStatusResponse);
            if (C78685UuP.LJJJZ(this.LJLILLLLZI)) {
                buildRoute.withParam("token", this.LJLILLLLZI);
            }
            if (C78685UuP.LJJJZ(this.LJLJI)) {
                buildRoute.withParam("user_nick_name", this.LJLJI);
            }
            if (C78685UuP.LJJJZ(this.LJLJJI)) {
                buildRoute.withParam("passport_domain", this.LJLJJI);
            }
            buildRoute.open();
        } else {
            ComplianceBusinessActivityAssem complianceBusinessActivityAssem2 = this.LJLIL;
            complianceBusinessActivityAssem2.LJLJJLL = true;
            complianceBusinessActivityAssem2.LJLJL = appealStatusResponse;
        }
        String str = appealStatusResponse.extra.logid;
        o.LJIIIIZZ(str, "it.extra.logid");
        C25574A1y.LJFF(0, "/aweme/v2/appeal/status/", str, String.valueOf(appealStatusResponse.status_code));
    }
}
