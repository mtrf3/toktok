package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes16.dex */
public final class XEY implements IFetchEffectChannelListener {
    public final /* synthetic */ InterfaceC88472Yns<Effect, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC84498XEg LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2 == null || effectChannelResponse2.getAllCategoryEffects() == null || effectChannelResponse2.getAllCategoryEffects().isEmpty()) {
            C84492XEa.LIZJ = new Effect(null, 1, null);
            this.LIZ.invoke(null);
        } else {
            C84492XEa.LIZ = effectChannelResponse2;
            C84492XEa.LIZIZ(effectChannelResponse2, this.LIZIZ, this.LIZ);
        }
    }

    public XEY(InterfaceC84498XEg interfaceC84498XEg, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC84498XEg;
    }
}
