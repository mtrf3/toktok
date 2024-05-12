package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.GzN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43321GzN implements IFetchEffectListener {
    public final /* synthetic */ XJL<Effect> LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C43321GzN(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect response) {
        o.LJIIIZ(response, "response");
        XJL<Effect> xjl = this.LIZ;
        C3C5.m7constructorimpl(response);
        xjl.resumeWith(response);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        XJL<Effect> xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Throwable("download effect failed", e.getException()));
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }
}
