package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.GzM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43320GzM implements IFetchEffectListener {
    public final /* synthetic */ InterfaceC67352kd<String> LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    public C43320GzM(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect response = effect;
        o.LJIIIZ(response, "response");
        InterfaceC67352kd<String> interfaceC67352kd = this.LIZ;
        String unzipPath = response.getUnzipPath();
        C3C5.m7constructorimpl(unzipPath);
        interfaceC67352kd.resumeWith(unzipPath);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult e) {
        o.LJIIIZ(e, "e");
        OUR.LJ(new Throwable("download effect failed", e.getException()), this.LIZ);
    }
}
