package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;

/* renamed from: X.WfC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82838WfC implements IFetchEffectListByIdsListener {
    public final /* synthetic */ InterfaceC82842WfG LIZ;

    public C82838WfC(C82824Wey c82824Wey) {
        this.LIZ = c82824Wey;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> data;
        Effect effect;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (Effect) ORZ.LJLLLL(data)) != null) {
            this.LIZ.LIZIZ(effect);
        } else {
            this.LIZ.LIZLLL();
        }
    }
}
