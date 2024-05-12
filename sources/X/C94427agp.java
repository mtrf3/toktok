package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: X.agp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94427agp implements IDownloadProviderEffectListener {
    public final /* synthetic */ XJL LIZ;

    public C94427agp(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffect providerEffect) {
        if (providerEffect != null) {
            XJL xjl = this.LIZ;
            C3C5.m7constructorimpl(providerEffect);
            xjl.resumeWith(providerEffect);
        } else {
            XJL xjl2 = this.LIZ;
            C3C4 LIZ = C141335gf.LIZ(new Exception());
            C3C5.m7constructorimpl(LIZ);
            xjl2.resumeWith(LIZ);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener
    public final void onFail(ProviderEffect providerEffect, ExceptionResult exceptionResult) {
        Exception exc;
        XJL xjl = this.LIZ;
        if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
            exc = new Exception();
        }
        C3C4 LIZ = C141335gf.LIZ(exc);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }
}
