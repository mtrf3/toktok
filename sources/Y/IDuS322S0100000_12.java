package Y;

import X.AbstractC74508TMa;
import X.C15490jB;
import X.C35794E3a;
import X.C72708SgC;
import X.C72922Sje;
import X.C72971SkR;
import X.C73433Srt;
import X.C74510TMc;
import X.C74511TMd;
import X.C84499XEh;
import X.CFX;
import X.InterfaceC65784Pro;
import X.InterfaceC73573Su9;
import X.InterfaceC84497XEf;
import X.InterfaceC86003Zc;
import X.U15;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDuS322S0100000_12 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C35794E3a<Object>> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS322S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS322S0100000_12 iDuS322S0100000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        C74510TMc c74510TMc = new C74510TMc((C73433Srt) interfaceC73573Su9);
        AbstractC74508TMa abstractC74508TMa = (AbstractC74508TMa) iDuS322S0100000_12.l0;
        InterfaceC65784Pro<InterfaceC84497XEf> effectPlatform = abstractC74508TMa.LIZJ;
        InterfaceC65784Pro<String> panelSupplier = abstractC74508TMa.LIZLLL;
        o.LJIIIZ(effectPlatform, "effectPlatform");
        o.LJIIIZ(panelSupplier, "panelSupplier");
        InterfaceC84497XEf combineFetchListOrCache = effectPlatform.invoke();
        String panel = panelSupplier.invoke();
        IDObjectS387S0100000_12 iDObjectS387S0100000_12 = new IDObjectS387S0100000_12(c74510TMc, 3);
        o.LJIIIZ(combineFetchListOrCache, "$this$combineFetchListOrCache");
        o.LJIIIZ(panel, "panel");
        C84499XEh.LJFF(combineFetchListOrCache, panel, new C74511TMd(iDObjectS387S0100000_12, combineFetchListOrCache, panel), false);
    }

    public static final void subscribe$1(IDuS322S0100000_12 iDuS322S0100000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        C15490jB.LJIIL((U15) iDuS322S0100000_12.l0, CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_interaction_normal_1"), "live_audience_link_mic_panel_apply_lottie.zip", "images", false, new C72971SkR((U15) iDuS322S0100000_12.l0, (C73433Srt) interfaceC73573Su9), null, 64);
    }

    public static final void subscribe$2(IDuS322S0100000_12 iDuS322S0100000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        interfaceC73573Su9.onNext(Boolean.valueOf(((EffectChannelResponse) iDuS322S0100000_12.l0).getAllCategoryEffects().isEmpty()));
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$3(IDuS322S0100000_12 iDuS322S0100000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        C84499XEh.LIZLLL(50, 0, 0, new C72922Sje((C73433Srt) interfaceC73573Su9, (C72708SgC) iDuS322S0100000_12.l0), ((C72708SgC) iDuS322S0100000_12.l0).LIZJ, TiktokAvatarLokiConfig.LIZ().lokiPanelName, TiktokAvatarLokiConfig.LIZ().headCategoryKey, null, null, false);
    }
}
