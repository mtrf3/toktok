package X;

import android.util.AndroidRuntimeException;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.ISSPService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Fl8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39890Fl8 {
    public static C39811Fjr LIZ;
    public static volatile InterfaceC65784Pro<C76800UCe> LIZJ;
    public static final C39890Fl8 LJ = new C39890Fl8();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public final synchronized void LIZ() {
        C0FT c0ft;
        C84276X5s c84276X5s;
        C39858Fkc c39858Fkc;
        FD3 fd3;
        InterfaceC39860Fke interfaceC39860Fke;
        InterfaceC38506F9i interfaceC38506F9i;
        InterfaceC39892FlA interfaceC39892FlA;
        if (!LIZLLL.compareAndSet(false, true)) {
            if (C60905NvJ.LIZIZ(null, null) == null) {
                FD5.LJII("hybrid_log_report", C51029K0z.LJJIIZI(new OSZ(WM7.SCENE_SERVICE, "hybrid_resource_null")));
            }
            return;
        }
        C39811Fjr c39811Fjr = LIZ;
        if (c39811Fjr != null && (interfaceC39892FlA = c39811Fjr.LJFF) != null) {
            C61483OBb.LIZJ.getClass();
            C61484OBc.LIZIZ().LIZ("hybridkit_default_bid", InterfaceC39933Flp.class, new C39891Fl9(interfaceC39892FlA));
        }
        C39811Fjr c39811Fjr2 = LIZ;
        if (c39811Fjr2 != null && (interfaceC38506F9i = c39811Fjr2.LJII) != null) {
            C61483OBb.LIZJ.getClass();
            C61484OBc.LIZIZ().LIZ("hybridkit_default_bid", InterfaceC39889Fl7.class, new C39886Fl4(interfaceC38506F9i));
        }
        C39811Fjr c39811Fjr3 = LIZ;
        if (c39811Fjr3 != null && (interfaceC39860Fke = c39811Fjr3.LJIIIIZZ) != null) {
            C61483OBb.LIZJ.getClass();
            C61484OBc.LIZIZ().LIZ("hybridkit_default_bid", ISSPService.class, new C39885Fl3(interfaceC39860Fke));
        }
        C39811Fjr c39811Fjr4 = LIZ;
        if (c39811Fjr4 != null && (fd3 = c39811Fjr4.LIZLLL) != null) {
            if (fd3 instanceof O2J) {
                C61483OBb.LIZJ.getClass();
                C61483OBb LIZIZ2 = C61484OBc.LIZIZ();
                C39836FkG.LJII.getClass();
                O2K o2k = new O2K(C38262Ezy.LIZ().LIZIZ());
                o2k.init(fd3);
                LIZIZ2.LIZ("hybridkit_default_bid", IResourceService.class, o2k);
            } else if (fd3 instanceof C39917FlZ) {
                C61483OBb.LIZJ.getClass();
                C61483OBb LIZIZ3 = C61484OBc.LIZIZ();
                C39836FkG.LJII.getClass();
                LIZIZ3.LIZ("hybridkit_default_bid", C39902FlK.class, new C39902FlK(C38262Ezy.LIZ().LIZIZ(), (C39917FlZ) fd3));
            } else {
                C16880lQ.LLLLIIL(new AndroidRuntimeException("Hybrid Not Work Because Of ResourceConfig invalid."));
            }
        }
        C39811Fjr c39811Fjr5 = LIZ;
        if (c39811Fjr5 != null && (c84276X5s = c39811Fjr5.LIZIZ) != null) {
            HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
            C39836FkG.LJII.getClass();
            hybridMultiMonitor.init(C38262Ezy.LIZ().LIZIZ());
            C40031FnP c40031FnP = new C40031FnP();
            c40031FnP.LIZIZ = (String) c84276X5s.LIZIZ;
            C39811Fjr c39811Fjr6 = LIZ;
            if (c39811Fjr6 != null && (c39858Fkc = c39811Fjr6.LIZ) != null) {
                c40031FnP.LIZLLL = (String) c39858Fkc.get((Object) "channel");
                c40031FnP.LIZ = c39858Fkc.getAppId();
                c40031FnP.LIZJ = c39858Fkc.getDid();
                c40031FnP.LJ = (String) c39858Fkc.get((Object) "appVersion");
                c40031FnP.LJFF = (String) c39858Fkc.get((Object) "updateVersionCode");
                c40031FnP.LJI = c39858Fkc.getRegion();
                c40031FnP.LJII = (String) c39858Fkc.get((Object) "language");
                c40031FnP.LJIIIIZZ = (HybridSettingInitConfig.IThirdConfig) c84276X5s.LIZ;
            }
            HybridMultiMonitor.getInstance().setConfig(c40031FnP.LIZ());
        }
        C39811Fjr c39811Fjr7 = LIZ;
        if (c39811Fjr7 != null && (c0ft = c39811Fjr7.LJI) != null) {
            C39048FUe c39048FUe = C39048FUe.LIZIZ;
            InterfaceC39049FUf interfaceC39049FUf = (InterfaceC39049FUf) c0ft.LIZ;
            c39048FUe.getClass();
            C39048FUe.LIZ = interfaceC39049FUf;
        }
    }

    public final synchronized boolean LIZIZ() {
        boolean z = true;
        if (!LIZIZ.compareAndSet(false, true)) {
            return true;
        }
        try {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = LIZJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } catch (Exception unused) {
            C39048FUe.LIZIZ.LIZ("Call PrepareBlock failed, please check your code.", EnumC39866Fkk.E, "HybridCommon");
            LIZ = null;
            LIZLLL.set(false);
            LIZJ = null;
            LIZIZ.set(false);
            z = false;
        }
        return z;
    }
}
