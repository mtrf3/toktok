package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HW2 implements IFetchEffectListener {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, Effect, C76800UCe> LIZIZ;
    public final /* synthetic */ Effect LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        HW1.LIZ(this.LIZ, effect2, this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        int i = this.LIZ;
        if (i >= 2) {
            this.LIZIZ.invoke(Boolean.TRUE, effect);
        } else {
            HW1.LIZ(i + 1, this.LIZJ, this.LIZIZ);
        }
    }

    public HW2(int i, Effect effect, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = i;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = effect;
    }
}
