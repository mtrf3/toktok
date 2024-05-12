package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;

/* loaded from: classes8.dex */
public final class I1D implements IFetchEffectListByIdsListener {
    public final /* synthetic */ I1C LIZ;

    public I1D(I1C i1c) {
        this.LIZ = i1c;
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
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (Effect) ListProtector.get(data, 0)) != null) {
            this.LIZ.LIZIZ(effect);
        } else {
            this.LIZ.LIZLLL();
        }
    }
}
