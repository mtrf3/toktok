package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.lynx.hybrid.webkit.pia.PiaFetcher;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NrK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60658NrK extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public InterfaceC60656NrI LJLJL;
    public final C60657NrJ LJLJLJ = new C60657NrJ(this);

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        C37500Eng c37500Eng;
        Forest forest;
        C37952Euy c37952Euy;
        C60640Nr2 extendable = (C60640Nr2) LIZ();
        o.LJFF(extendable, "extendable");
        C60631Nqt.LIZ(extendable.getExtendableWebViewClient(), new C60430Nne(this));
        LJ("loadUrl", this.LJLJLJ, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("destroy", this.LJLJLJ, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        OM1 om1 = (OM1) LIZ();
        InterfaceC61488OBg interfaceC61488OBg = null;
        if (!(om1 instanceof WebKitView)) {
            om1 = null;
        }
        WebKitView webKitView = (WebKitView) om1;
        if (webKitView != null) {
            InterfaceC37604EpM interfaceC37604EpM = (InterfaceC37604EpM) EXP.LIZIZ(InterfaceC37604EpM.class);
            if (interfaceC37604EpM != null && (c37500Eng = interfaceC37604EpM.LIZLLL(new C37531EoB(webKitView.getHybridContext(), webKitView.getInitParams$hybrid_web_release()))) != null) {
                JSONObject LJ = C47135Ieh.LJ("hybrid_module", PiaFetcher.NAME, "infra_service", "vmsdk");
                C79605VMb c79605VMb = new C79605VMb("bd_hybrid_monitor_infra_service");
                c79605VMb.LIZLLL = LJ;
                c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
                c79605VMb.LJIIIIZZ = webKitView.getHybridContext().containerId;
                C79604VMa LIZ = c79605VMb.LIZ();
                OFH.LIZLLL.getClass();
                OFH.LIZLLL(LIZ);
            } else {
                c37500Eng = null;
            }
            this.LJLJL = c37500Eng;
            if (c37500Eng != null) {
                c37500Eng.LJIIIZ(webKitView);
            }
            InterfaceC60656NrI interfaceC60656NrI = this.LJLJL;
            if (interfaceC60656NrI != null) {
                InterfaceC60614Nqc bridgeService$hybrid_web_release = webKitView.getBridgeService$hybrid_web_release();
                if (bridgeService$hybrid_web_release != null) {
                    c37952Euy = bridgeService$hybrid_web_release.LJIILIIL();
                } else {
                    c37952Euy = null;
                }
                if (!(c37952Euy instanceof InterfaceC37589Ep7)) {
                    c37952Euy = null;
                }
                interfaceC60656NrI.LJ(c37952Euy);
            }
            InterfaceC61488OBg resource$hybrid_web_release = webKitView.getResource$hybrid_web_release();
            if (resource$hybrid_web_release instanceof C39902FlK) {
                interfaceC61488OBg = resource$hybrid_web_release;
            }
            C39902FlK c39902FlK = (C39902FlK) interfaceC61488OBg;
            if (c39902FlK != null && (forest = c39902FlK.LIZ) != null) {
                forest.registerCustomFetcher(PiaFetcher.NAME, PiaFetcher.class);
            }
        }
    }
}
