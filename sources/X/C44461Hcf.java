package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;

/* renamed from: X.Hcf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44461Hcf implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C44462Hcg LIZ;
    public final /* synthetic */ IEffectDownloadProgressListener LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        IEffectDownloadProgressListener iEffectDownloadProgressListener = this.LIZIZ;
        if (exceptionResult == null) {
            exceptionResult = new ExceptionResult(new Exception("unknown"));
        }
        iEffectDownloadProgressListener.onFail(null, exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        List<Effect> data;
        Effect effect;
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (Effect) ListProtector.get(data, 0)) != null) {
            C44462Hcg c44462Hcg = this.LIZ;
            IEffectDownloadProgressListener iEffectDownloadProgressListener = this.LIZIZ;
            if (c44462Hcg.LIZ.LLLLL().LJJJJLL().LJ().LIZ(effect)) {
                iEffectDownloadProgressListener.onSuccess(effect);
            } else {
                c44462Hcg.LIZ.LLLLL().fetchEffect(effect, iEffectDownloadProgressListener);
            }
        }
    }

    public C44461Hcf(C44462Hcg c44462Hcg, C44450HcU c44450HcU) {
        this.LIZ = c44462Hcg;
        this.LIZIZ = c44450HcU;
    }
}
