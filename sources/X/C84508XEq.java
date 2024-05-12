package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XEq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84508XEq implements IFetchEffectListener {
    public final /* synthetic */ C84507XEp LIZ;
    public final /* synthetic */ Effect LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        this.LIZ.LJII(this.LIZIZ, effect);
    }

    public C84508XEq(C84507XEp c84507XEp, Effect effect) {
        this.LIZ = c84507XEp;
        this.LIZIZ = effect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJI(this.LIZIZ, effect, e);
    }
}
