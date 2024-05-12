package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import kotlin.jvm.internal.AqS1S0410000_14;

/* renamed from: X.WVq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82402WVq implements IFetchEffectListByIdsListener {
    public final /* synthetic */ AqS1S0410000_14 LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 != null) {
            this.LIZ.LIZ$0(effectListResponse2);
        }
    }

    public C82402WVq(AqS1S0410000_14 aqS1S0410000_14, InterfaceC82403WVr interfaceC82403WVr) {
        this.LIZ = aqS1S0410000_14;
    }
}
