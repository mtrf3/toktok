package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.opensdk.contants.OPSDK$GreenScreenKitConfig;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HcL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44441HcL implements IFetchEffectListByIdsListener {
    public final /* synthetic */ C44436HcG LIZ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult e) {
        o.LJIIIZ(e, "e");
    }

    public C44441HcL(C44436HcG c44436HcG) {
        this.LIZ = c44436HcG;
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        Bundle bundle;
        EffectListResponse response = effectListResponse;
        o.LJIIIZ(response, "response");
        if (response.getData().isEmpty()) {
            return;
        }
        I0N i0n = this.LIZ.LIZJ;
        List<Effect> data = response.getData();
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = this.LIZ.LIZLLL.greenScreenKitConfig;
        if (oPSDK$GreenScreenKitConfig != null) {
            bundle = oPSDK$GreenScreenKitConfig.toBundle();
        } else {
            bundle = null;
        }
        C82398WVm.LJ(i0n, data, true, false, null, true, bundle, 1, 12792);
    }
}
