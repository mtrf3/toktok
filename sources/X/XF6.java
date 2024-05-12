package X;

import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import kotlin.jvm.internal.AqS104S0300000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XF6 implements XDR<EffectListResponse> {
    public final /* synthetic */ NLEResourceCallback LIZ;
    public final /* synthetic */ XF5 LIZIZ;
    public final /* synthetic */ NLELokiResourceProtocol LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.XDR
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse response = effectListResponse;
        o.LJIIIZ(response, "response");
        if (!response.getEffect_list().isEmpty()) {
            Effect effect = (Effect) ListProtector.get(response.getEffect_list(), 0);
            java.util.Map<String, Effect> map = this.LIZIZ.LIZLLL;
            String LIZJ = this.LIZJ.LIZJ();
            o.LJIIIIZZ(LIZJ, "lokiResourceProtocol.effectId");
            map.put(LIZJ, effect);
            C43045Guv.LIZIZ(new AqS104S0300000_15(this.LIZJ, this.LIZIZ, effect, 7));
            XF5 xf5 = this.LIZIZ;
            xf5.LIZ.LIZLLL(effect, true, true, true, new XF9(this.LIZJ, this.LIZ, xf5, this.LIZLLL));
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(EffectListResponse effectListResponse) {
    }

    @Override // X.XDR
    public final void onFail(EffectListResponse effectListResponse, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        NLEResourceCallback nLEResourceCallback = this.LIZ;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onError(exception.LIZ, exception.LIZIZ);
        }
    }

    public XF6(NLELokiResourceProtocol nLELokiResourceProtocol, NLEResourceCallback nLEResourceCallback, XF5 xf5, String str) {
        this.LIZ = nLEResourceCallback;
        this.LIZIZ = xf5;
        this.LIZJ = nLELokiResourceProtocol;
        this.LIZLLL = str;
    }
}
