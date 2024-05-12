package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: X.TNe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74538TNe implements IFetchEffectListListener {
    public final /* synthetic */ IFetchEffectListListener LIZ;

    public C74538TNe(IFetchEffectListListener iFetchEffectListListener) {
        this.LIZ = iFetchEffectListListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
    public final void onFail(ExceptionResult exceptionResult) {
        IFetchEffectListListener iFetchEffectListListener = this.LIZ;
        if (iFetchEffectListListener != null) {
            iFetchEffectListListener.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(List<Effect> list) {
        IFetchEffectListListener iFetchEffectListListener = this.LIZ;
        if (iFetchEffectListListener != null) {
            iFetchEffectListListener.onSuccess(list);
        }
    }
}
