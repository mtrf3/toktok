package X;

import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.ss.ugc.effectplatform.model.Effect;
import kotlin.jvm.internal.AqS0S1500000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XF9 implements XCP {
    public final /* synthetic */ NLEResourceCallback LIZ;
    public final /* synthetic */ XF5 LIZIZ;
    public final /* synthetic */ NLELokiResourceProtocol LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.XCP
    public final void onProgress(Effect effect, int i, long j) {
    }

    @Override // X.XCP
    public final void onStart(Effect effect) {
    }

    @Override // X.XDR
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        if (effect2 != null) {
            C6QQ.LIZ(new AqS0S1500000_15(this.LIZIZ, this.LIZJ, effect2, this.LIZ, this.LIZLLL, effect2, 0));
        }
    }

    @Override // X.XDR
    public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
    }

    @Override // X.XDR
    public final void onFail(Effect effect, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        NLEResourceCallback nLEResourceCallback = this.LIZ;
        if (nLEResourceCallback != null) {
            nLEResourceCallback.onError(exception.LIZ, exception.LIZIZ);
        }
    }

    public XF9(NLELokiResourceProtocol nLELokiResourceProtocol, NLEResourceCallback nLEResourceCallback, XF5 xf5, String str) {
        this.LIZ = nLEResourceCallback;
        this.LIZIZ = xf5;
        this.LIZJ = nLELokiResourceProtocol;
        this.LIZLLL = str;
    }
}
