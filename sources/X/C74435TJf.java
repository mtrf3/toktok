package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TJf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74435TJf implements IFetchEffectListByIdsListener {
    public final /* synthetic */ List LIZ;
    public final /* synthetic */ TJZ LIZIZ;
    public final /* synthetic */ Effect LIZJ;
    public final /* synthetic */ FetchFavoriteListResponse LIZLLL;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        ListProtector.add(this.LIZ, 0, this.LIZJ);
        this.LIZIZ.LLLLZIL(this.LIZLLL, this.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> list;
        EffectListResponse effectListResponse2 = effectListResponse;
        Object obj = this.LIZJ;
        if (effectListResponse2 != null) {
            list = effectListResponse2.getData();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            o.LJI(effectListResponse2);
            obj = ListProtector.get(effectListResponse2.getData(), 0);
        }
        ListProtector.add(this.LIZ, 0, obj);
        this.LIZIZ.LLLLZIL(this.LIZLLL, this.LIZ);
    }

    public C74435TJf(List list, TJZ tjz, Effect effect, FetchFavoriteListResponse fetchFavoriteListResponse) {
        this.LIZ = list;
        this.LIZIZ = tjz;
        this.LIZJ = effect;
        this.LIZLLL = fetchFavoriteListResponse;
    }
}
