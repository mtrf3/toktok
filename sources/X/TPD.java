package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;

/* loaded from: classes13.dex */
public final class TPD implements IFetchProviderEffect {
    public final /* synthetic */ InterfaceC65052gv LIZ;

    public TPD(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect
    public final void onFail(ExceptionResult exceptionResult) {
        ((C73578SuE) this.LIZ).tryOnError(C84499XEh.LJIIIZ(exceptionResult));
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(ProviderEffectModel providerEffectModel) {
        ((C73578SuE) this.LIZ).onSuccess(C1XY.LJJIIJ(providerEffectModel));
    }
}
