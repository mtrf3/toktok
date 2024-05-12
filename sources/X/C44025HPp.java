package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import v5.n;

/* renamed from: X.HPp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44025HPp implements IFetchEffectListener {
    public final /* synthetic */ ProgressDialogC43239Gy3 LIZ;
    public final /* synthetic */ Bundle LIZIZ;
    public final /* synthetic */ n LIZJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(Effect effect) {
        C44018HPi.LJ(effect, this.LIZ, this.LIZIZ, this.LIZJ);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        C44018HPi.LIZLLL(this.LIZ, exceptionResult, this.LIZJ);
    }

    public C44025HPp(ProgressDialogC43239Gy3 progressDialogC43239Gy3, Bundle bundle, n nVar) {
        this.LIZ = progressDialogC43239Gy3;
        this.LIZIZ = bundle;
        this.LIZJ = nVar;
    }
}
