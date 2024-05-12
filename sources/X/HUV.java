package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HUV implements IFetchEffectListByIdsListener {
    public final /* synthetic */ IFetchEffectListener LIZ;
    public final /* synthetic */ InterfaceC84498XEg LIZIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        if (exceptionResult != null) {
            this.LIZ.onFail(null, exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse response = effectListResponse;
        o.LJIIIZ(response, "response");
        if (response.getData().isEmpty()) {
            this.LIZ.onSuccess(null);
        } else {
            this.LIZIZ.LJJIIZI((Effect) ListProtector.get(response.getData(), 0), this.LIZ);
        }
    }

    public HUV(IFetchEffectListener iFetchEffectListener, InterfaceC84498XEg interfaceC84498XEg) {
        this.LIZ = iFetchEffectListener;
        this.LIZIZ = interfaceC84498XEg;
    }
}
