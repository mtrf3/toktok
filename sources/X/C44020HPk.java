package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import v5.n;

/* renamed from: X.HPk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44020HPk implements IFetchEffectListener {
    public final /* synthetic */ ProgressDialogC43239Gy3 LIZ;
    public final /* synthetic */ n LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ EffectListResponse LIZLLL;
    public final /* synthetic */ Bundle LJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        Effect effect2 = effect;
        String str = this.LIZJ;
        EffectListResponse effectListResponse = this.LIZLLL;
        if (str != null && effectListResponse != null) {
            C44027HPr.LIZ.put(str, effectListResponse);
        }
        C44018HPi.LJ(effect2, this.LIZ, this.LJ, this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C44018HPi.LIZLLL(this.LIZ, exceptionResult, this.LIZIZ);
    }

    public C44020HPk(ProgressDialogC43239Gy3 progressDialogC43239Gy3, n nVar, String str, EffectListResponse effectListResponse, Bundle bundle) {
        this.LIZ = progressDialogC43239Gy3;
        this.LIZIZ = nVar;
        this.LIZJ = str;
        this.LIZLLL = effectListResponse;
        this.LJ = bundle;
    }
}
