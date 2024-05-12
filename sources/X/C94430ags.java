package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* renamed from: X.ags, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94430ags implements IFetchProviderEffect {
    public final /* synthetic */ XJL LIZ;

    public C94430ags(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exc;
        XJL xjl = this.LIZ;
        if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
            exc = new Exception();
        }
        C3C4 LIZ = C141335gf.LIZ(exc);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffectModel providerEffectModel) {
        if (providerEffectModel != null) {
            XJL xjl = this.LIZ;
            C3C5.m7constructorimpl(providerEffectModel);
            xjl.resumeWith(providerEffectModel);
        } else {
            XJL xjl2 = this.LIZ;
            C3C4 LIZ = C141335gf.LIZ(new Exception());
            C3C5.m7constructorimpl(LIZ);
            xjl2.resumeWith(LIZ);
        }
    }
}
