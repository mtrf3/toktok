package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;

/* renamed from: X.WVp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82401WVp implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C82399WVn LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null) {
            this.LIZ.LIZ(effectListResponse2);
        }
    }

    public C82401WVp(C82399WVn c82399WVn, InterfaceC82403WVr interfaceC82403WVr) {
        this.LIZ = c82399WVn;
    }
}
