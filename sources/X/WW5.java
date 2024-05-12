package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WW5 implements IFetchEffectListener {
    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        String str;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect, preload onStart: ");
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZLLL.d(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        String str;
        Effect effect2 = effect;
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect, preload on Success ");
        if (effect2 != null) {
            str = effect2.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZLLL.d(X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Effect, preload onFail: ");
        if (effect != null) {
            str = effect.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append("  ");
        LIZ.append(e.getMsg());
        LIZLLL.d(X1D.LIZIZ(LIZ));
    }
}
