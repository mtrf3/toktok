package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* loaded from: classes13.dex */
public final class TNS implements IFetchEffectListListener {
    public final /* synthetic */ TNR LIZ;
    public final /* synthetic */ IFetchEffectListener LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        IFetchEffectListener iFetchEffectListener = this.LIZIZ;
        if (exceptionResult == null) {
            exceptionResult = new ExceptionResult(-1, new IllegalStateException("get effect info error"));
        }
        iFetchEffectListener.onFail(null, exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        List<Effect> list2 = list;
        if (list2 != null && (!list2.isEmpty())) {
            this.LIZ.LIZIZ((Effect) ListProtector.get(list2, 0), this.LIZIZ);
        } else {
            onFail(new ExceptionResult(-1, new IllegalStateException("get effect info error")));
        }
    }

    public TNS(TNR tnr, IFetchEffectListener iFetchEffectListener) {
        this.LIZ = tnr;
        this.LIZIZ = iFetchEffectListener;
    }
}
