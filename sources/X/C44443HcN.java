package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: X.HcN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44443HcN implements IFetchEffectListByIdsListener {
    public final /* synthetic */ HXT LIZ;
    public final /* synthetic */ IFetchEffectListByIdsListener LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        this.LIZ.getClass();
        this.LIZIZ.onFail(exceptionResult);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        this.LIZ.getClass();
        this.LIZIZ.onSuccess(effectListResponse);
    }

    public C44443HcN(HXT hxt, C44438HcI c44438HcI) {
        this.LIZ = hxt;
        this.LIZIZ = c44438HcI;
    }
}
