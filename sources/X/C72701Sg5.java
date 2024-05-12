package X;

import Y.IDObjectS387S0100000_12;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;

/* renamed from: X.Sg5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72701Sg5 implements ICheckChannelListener {
    public final /* synthetic */ EffectManager LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ IDObjectS387S0100000_12 LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            C16880lQ.LLLLIIL(exception);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            this.LIZ.fetchEffectList(this.LIZIZ, false, (IFetchEffectChannelListener) this.LIZJ);
        } else {
            this.LIZ.fetchEffectListFromCache(this.LIZIZ, this.LIZJ);
        }
    }

    public C72701Sg5(EffectManager effectManager, String str, IDObjectS387S0100000_12 iDObjectS387S0100000_12) {
        this.LIZ = effectManager;
        this.LIZIZ = str;
        this.LIZJ = iDObjectS387S0100000_12;
    }
}
