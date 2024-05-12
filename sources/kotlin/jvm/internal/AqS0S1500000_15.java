package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.XF5;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.Map;

/* loaded from: classes16.dex */
public class AqS0S1500000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S1500000_15 aqS0S1500000_15) {
        XF5 xf5 = (XF5) aqS0S1500000_15.l1;
        String LIZJ = ((NLELokiResourceProtocol) aqS0S1500000_15.l2).LIZJ();
        o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
        xf5.LIZ(LIZJ);
        Map<String, Effect> map = ((XF5) aqS0S1500000_15.l1).LIZIZ;
        String LIZJ2 = ((NLELokiResourceProtocol) aqS0S1500000_15.l2).LIZJ();
        o.LJIIIIZZ(LIZJ2, "lokiResourceProtocol.effectId");
        map.put(LIZJ2, (Effect) aqS0S1500000_15.l3);
        NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aqS0S1500000_15.l4;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onSuccess(aqS0S1500000_15.s0, ((Effect) aqS0S1500000_15.l5).getUnzipPath(), false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S1500000_15 aqS0S1500000_15) {
        XF5 xf5 = (XF5) aqS0S1500000_15.l1;
        String LIZJ = ((NLELokiResourceProtocol) aqS0S1500000_15.l2).LIZJ();
        o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
        xf5.LIZ(LIZJ);
        Map<String, Effect> map = ((XF5) aqS0S1500000_15.l1).LIZIZ;
        String LIZJ2 = ((NLELokiResourceProtocol) aqS0S1500000_15.l2).LIZJ();
        o.LJIIIIZZ(LIZJ2, "lokiResourceProtocol.effectId");
        map.put(LIZJ2, (Effect) aqS0S1500000_15.l3);
        NLEResourceCallback nLEResourceCallback = (NLEResourceCallback) aqS0S1500000_15.l4;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onSuccess(aqS0S1500000_15.s0, ((Effect) aqS0S1500000_15.l5).getUnzipPath(), false);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S1500000_15(XF5 xf5, NLELokiResourceProtocol nLELokiResourceProtocol, Effect effect, NLEResourceCallback nLEResourceCallback, String str, Effect effect2, int i) {
        super(0);
        this.$t = i;
        this.l1 = xf5;
        this.l2 = nLELokiResourceProtocol;
        this.l3 = effect;
        this.l4 = nLEResourceCallback;
        this.s0 = str;
        this.l5 = effect2;
    }
}
