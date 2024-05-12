package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ah1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94439ah1 implements IFetchProviderEffect {
    public final /* synthetic */ XJL<ProviderEffectModel> LIZ;

    public C94439ah1(XKS xks) {
        this.LIZ = xks;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
        XJL<ProviderEffectModel> xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(new Exception());
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffectModel response) {
        o.LJIIIZ(response, "response");
        XJL<ProviderEffectModel> xjl = this.LIZ;
        C3C5.m7constructorimpl(response);
        xjl.resumeWith(response);
    }
}
