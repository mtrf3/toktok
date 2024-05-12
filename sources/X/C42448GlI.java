package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.GlI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42448GlI implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC73573Su9<Effect> LIZ;
    public final /* synthetic */ Effect LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        if (this.LIZ.isDisposed()) {
            return;
        }
        this.LIZ.onNext(this.LIZIZ);
    }

    public C42448GlI(InterfaceC73573Su9<Effect> interfaceC73573Su9, Effect effect) {
        this.LIZ = interfaceC73573Su9;
        this.LIZIZ = effect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        if (this.LIZ.isDisposed()) {
            return;
        }
        this.LIZ.onError(new Exception("Cannot download head effect"));
    }
}
