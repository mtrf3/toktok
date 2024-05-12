package X;

import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.VzR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81545VzR implements IFetchEffectListener {
    public final /* synthetic */ C81544VzQ LIZ;
    public final /* synthetic */ Effect LIZIZ;
    public final /* synthetic */ DuetContext LIZJ;
    public final /* synthetic */ int LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.LLJJIII(this.LIZIZ, this.LIZJ, this.LIZLLL);
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

    public C81545VzR(C81544VzQ c81544VzQ, Effect effect, DuetContext duetContext, int i) {
        this.LIZ = c81544VzQ;
        this.LIZIZ = effect;
        this.LIZJ = duetContext;
        this.LIZLLL = i;
    }
}
