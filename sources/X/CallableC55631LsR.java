package X;

import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.account.main.AccountMainServiceImpl;
import com.ss.android.ugc.aweme.app.services.LauncherService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.EcUgCommonService;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.main.PerformanceActivityAssem;
import com.ss.android.ugc.aweme.main.PerformanceOptAssem;
import com.ss.android.ugc.aweme.main.assems.NewUserOptAssem;
import com.ss.android.ugc.aweme.pipfeed.PipServiceImpl;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.services.ToolsBusinessServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.LsR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class CallableC55631LsR implements Callable<CallableC55631LsR> {
    public C8W0 LJLIL;
    public C8W0 LJLILLLLZI;
    public C8W0 LJLJI;
    public C8W0 LJLJJI;
    public C8W0 LJLJJL;
    public C8W0 LJLJJLL;
    public C8W0 LJLJL;
    public C8W0 LJLJLJ;
    public C8W0 LJLJLLL;
    public C8W0 LJLL;
    public C8W0 LJLLI;
    public C8W0 LJLLILLLL;
    public NewUserOptAssem LJLLJ;
    public C8W0 LJLLL;
    public C8W0 LJLLLL;

    @Override // java.util.concurrent.Callable
    public final CallableC55631LsR call() {
        C8W0 c8w0;
        C65776Prg LIZJ;
        L9J.LIZIZ = false;
        L9J.LIZ = new C64328PMm();
        LauncherTaskApiImpl.LJIIIIZZ();
        Object newInstance = C39557Ffl.LIZ(NewUserJourneyService.LJIILLIIL().LIZIZ()).newInstance();
        o.LJIIIIZZ(newInstance, "get().getService(INewUse…ssem().java.newInstance()");
        this.LJLIL = (C8W0) newInstance;
        IEcUgCommonService LIZLLL = EcUgCommonService.LIZLLL();
        C8W0 c8w02 = null;
        if (LIZLLL != null && (LIZJ = LIZLLL.LIZJ()) != null) {
            c8w0 = (C8W0) C39557Ffl.LIZ(LIZJ).newInstance();
        } else {
            c8w0 = null;
        }
        this.LJLLL = c8w0;
        this.LJLLJ = new NewUserOptAssem();
        Object newInstance2 = C39557Ffl.LIZ(LauncherService.LIZLLL().LIZJ()).newInstance();
        o.LJIIIIZZ(newInstance2, "get().getService(ILaunch…ssem().java.newInstance()");
        this.LJLILLLLZI = (C8W0) newInstance2;
        Object newInstance3 = C39557Ffl.LIZ(ToolsBusinessServiceImpl.createIToolsBusinessServicebyMonsterPlugin(false).getToolsActivityAssem()).newInstance();
        o.LJIIIIZZ(newInstance3, "get().getService(IToolsB…ssem().java.newInstance()");
        this.LJLJI = (C8W0) newInstance3;
        Object newInstance4 = C39557Ffl.LIZ(ProfileServiceImpl.LIZ().getSocialActivityAssem()).newInstance();
        o.LJIIIIZZ(newInstance4, "get().getService(IProfil…ssem().java.newInstance()");
        this.LJLJJI = (C8W0) newInstance4;
        Object newInstance5 = C39557Ffl.LIZ(UgCommonServiceImpl.LJIJ().LJ()).newInstance();
        o.LJIIIIZZ(newInstance5, "get().getService(IUgComm…ssem().java.newInstance()");
        this.LJLJJL = (C8W0) newInstance5;
        Object newInstance6 = C39557Ffl.LIZ(AccountMainServiceImpl.LIZJ().LIZ()).newInstance();
        o.LJIIIIZZ(newInstance6, "get().getService(IAccoun…ssem().java.newInstance()");
        this.LJLJJLL = (C8W0) newInstance6;
        Object newInstance7 = C39557Ffl.LIZ(ToolsBusinessServiceImpl.createIToolsBusinessServicebyMonsterPlugin(false).getTikToktoolsAssem()).newInstance();
        o.LJIIIIZZ(newInstance7, "get().getService(IToolsB…ssem().java.newInstance()");
        this.LJLJL = (C8W0) newInstance7;
        Object newInstance8 = C39557Ffl.LIZ(C88547Yp5.LIZIZ.LJIL()).newInstance();
        o.LJIIIIZZ(newInstance8, "CommonFeedApiServiceGett…ssem().java.newInstance()");
        this.LJLJLJ = (C8W0) newInstance8;
        this.LJLJLLL = new PerformanceActivityAssem();
        this.LJLL = new PerformanceOptAssem();
        InterfaceC65350Pko<? extends C8W0> LJIIJJI = ComplianceBusinessServiceImpl.LJJJJIZL().LJIIJJI();
        if (LJIIJJI != null) {
            c8w02 = (C8W0) C39557Ffl.LIZ(LJIIJJI).newInstance();
        }
        this.LJLLI = c8w02;
        Object newInstance9 = C39557Ffl.LIZ(AccountMainServiceImpl.LIZJ().LIZIZ()).newInstance();
        o.LJIIIIZZ(newInstance9, "get().getService(IAccoun…ssem().java.newInstance()");
        this.LJLLILLLL = (C8W0) newInstance9;
        this.LJLLLL = PipServiceImpl.LJJII().LJIJJ();
        return this;
    }
}
