package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;

/* loaded from: classes8.dex */
public final class I13 implements IFetchEffectListByIdsListener {
    public final /* synthetic */ I15 LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
    }

    public I13(I15 i15) {
        this.LIZ = i15;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> data;
        Object obj;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (obj = ListProtector.get(data, 0)) != null) {
            C82398WVm.LJ(this.LIZ.LIZJ, C47261Igj.LJJIJ(obj), true, false, null, false, null, 0, 16376);
        }
    }
}
