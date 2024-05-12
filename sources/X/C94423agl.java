package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.agl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94423agl implements IFetchEffectListener {
    public final /* synthetic */ XJL LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C94423agl(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        if (effect != null) {
            XJL xjl = this.LIZ;
            C3C5.m7constructorimpl(effect);
            xjl.resumeWith(effect);
        } else {
            XJL xjl2 = this.LIZ;
            C3C5.m7constructorimpl(null);
            xjl2.resumeWith(null);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        XJL xjl = this.LIZ;
        Exception exception = e.getException();
        o.LJIIIIZZ(exception, "e.exception");
        C3C4 LIZ = C141335gf.LIZ(exception);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }
}
