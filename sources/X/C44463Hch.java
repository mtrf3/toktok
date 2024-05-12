package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Hch, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44463Hch implements IFetchEffectListener {
    public final IFetchEffectListener LIZ;
    public long LIZIZ;

    public C44463Hch(C44367Hb9 c44367Hb9) {
        this.LIZ = c44367Hb9;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        this.LIZIZ = System.currentTimeMillis();
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        C157346Fm.LIZ(effect2, true, this.LIZIZ, null);
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onSuccess(effect2);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        C157346Fm.LIZ(effect, false, this.LIZIZ, e);
        IFetchEffectListener iFetchEffectListener = this.LIZ;
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onFail(effect, e);
        }
    }
}
