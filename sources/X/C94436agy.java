package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.agy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94436agy implements IDownloadProviderEffectListener {
    public final /* synthetic */ XJL<ProviderEffect> LIZ;

    public C94436agy(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffect response) {
        o.LJIIIZ(response, "response");
        XJL<ProviderEffect> xjl = this.LIZ;
        C3C5.m7constructorimpl(response);
        xjl.resumeWith(response);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener
    public final void onFail(ProviderEffect failedEffect, ExceptionResult e) {
        o.LJIIIZ(failedEffect, "failedEffect");
        o.LJIIIZ(e, "e");
        XJL<ProviderEffect> xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }
}
