package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import v5.n;

/* renamed from: X.HPn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44023HPn implements IFetchEffectListByIdsListener {
    public final /* synthetic */ ProgressDialogC43239Gy3 LIZ;
    public final /* synthetic */ n LIZIZ;
    public final /* synthetic */ InterfaceC84498XEg LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ Bundle LJ;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
    public final void onFail(ExceptionResult exceptionResult) {
        C44018HPi.LIZLLL(this.LIZ, exceptionResult, this.LIZIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectListResponse effectListResponse) {
        EffectListResponse effectListResponse2 = effectListResponse;
        if (effectListResponse2 == null || effectListResponse2.getData().isEmpty()) {
            C44018HPi.LIZLLL(this.LIZ, null, this.LIZIZ);
        } else {
            C44018HPi.LJI(this.LIZJ, this.LIZ, this.LIZLLL, this.LJ, this.LIZIZ, effectListResponse2);
        }
    }

    public C44023HPn(ProgressDialogC43239Gy3 progressDialogC43239Gy3, n nVar, InterfaceC84498XEg interfaceC84498XEg, String str, Bundle bundle) {
        this.LIZ = progressDialogC43239Gy3;
        this.LIZIZ = nVar;
        this.LIZJ = interfaceC84498XEg;
        this.LIZLLL = str;
        this.LJ = bundle;
    }
}
