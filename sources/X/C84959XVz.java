package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XVz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84959XVz implements IEffectDownloadProgressListener {
    public final /* synthetic */ AbstractC73851Syd<C84768XOq> LIZ;
    public final /* synthetic */ InterfaceC73573Su9<C84767XOp> LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ.onNext(new C84768XOq(-101, -102, effect, 0L, null, 24));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        o.LJIIIZ(effect2, "effect");
        C84952XVs.LIZIZ(this.LIZ, this.LIZIZ, effect2, false);
    }

    public C84959XVz(AbstractC73851Syd<C84768XOq> abstractC73851Syd, InterfaceC73573Su9<C84767XOp> interfaceC73573Su9) {
        this.LIZ = abstractC73851Syd;
        this.LIZIZ = interfaceC73573Su9;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        C84952XVs.LIZ(this.LIZ, this.LIZIZ, effect, e, 16);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i, long j) {
        o.LJIIIZ(effect, "effect");
        this.LIZ.onNext(new C84768XOq(-101, i, effect, j, null, 16));
    }
}
