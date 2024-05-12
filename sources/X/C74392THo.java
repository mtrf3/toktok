package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;

/* renamed from: X.THo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74392THo implements IFetchEffectListByIdsListener {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ C74389THl LIZJ;
    public final /* synthetic */ C74390THm LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZLLL.LIZ.onNext(this.LIZJ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        TJ0 tj0;
        TJV LIZ;
        TJ0 tj02;
        TJV LIZ2;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null) {
            List<Effect> collection = effectListResponse2.getCollection();
            if (collection != null && (!collection.isEmpty()) && (tj02 = this.LIZLLL.LIZIZ) != null && (LIZ2 = tj02.LIZ()) != null) {
                LIZ2.LJII(collection);
            }
            List<Effect> bindEffects = effectListResponse2.getBindEffects();
            if (bindEffects != null && (!bindEffects.isEmpty()) && (tj0 = this.LIZLLL.LIZIZ) != null && (LIZ = tj0.LIZ()) != null) {
                LIZ.LJIIL(bindEffects);
            }
            List<Effect> data = effectListResponse2.getData();
            if (data != null && (true ^ data.isEmpty())) {
                ListProtector.set(this.LIZIZ, this.LIZ, ListProtector.get(data, 0));
                this.LIZLLL.LIZ.onNext(this.LIZJ);
            }
        }
    }

    public C74392THo(int i, TJ0 tj0, List list, C74389THl c74389THl, C74390THm c74390THm) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = c74389THl;
        this.LIZLLL = c74390THm;
    }
}
