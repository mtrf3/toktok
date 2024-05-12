package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes16.dex */
public final class XFH implements IFetchEffectListener {
    public final /* synthetic */ n<Effect> LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public XFH(n<Effect> nVar) {
        this.LIZ = nVar;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect response = effect;
        o.LJIIIZ(response, "response");
        response.setEffectId("123456");
        this.LIZ.LIZJ(response);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        if (e.getException() != null) {
            this.LIZ.LIZIZ(e.getException());
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        this.LIZ.LIZIZ(new Exception("download effect failed: unknown exception"));
    }
}
