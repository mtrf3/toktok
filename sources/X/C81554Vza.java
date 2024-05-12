package X;

import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.Vza, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81554Vza implements IFetchEffectListener {
    public final /* synthetic */ C81567Vzn LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ DuetContext LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.LLJI(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        String str;
        o.LJIIIZ(e, "e");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("effect download failed: ");
        if (effect != null) {
            str = EHI.LIZJ(effect);
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    public C81554Vza(C81567Vzn c81567Vzn, Effect effect, DuetContext duetContext, int i) {
        this.LIZ = c81567Vzn;
        this.LIZIZ = effect;
        this.LIZJ = duetContext;
        this.LIZLLL = i;
    }
}
