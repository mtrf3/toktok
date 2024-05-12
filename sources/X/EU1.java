package X;

import com.ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.PolicyNoticeApproveResponseUPSdk;

/* loaded from: classes7.dex */
public final /* synthetic */ class EU1 implements C10I {
    public final /* synthetic */ int LIZ;

    public /* synthetic */ EU1(int i) {
        this.LIZ = i;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.LIZ) {
            case 0:
                C36093EEn.LIZ.getClass();
                C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
                LJIIIZ.LIZIZ(new GetGoogleAIdTask(EFK.IDLE), true);
                LJIIIZ.LIZJ();
                return c10k.LJIIJJI();
            default:
                if (c10k.LJIILIIL() && c10k.LJIIJJI() != null) {
                    if (((PolicyNoticeApproveResponseUPSdk) c10k.LJIIJJI()).getStatus_code() == 0) {
                        return C76800UCe.LIZ;
                    }
                    throw new Exception(String.valueOf(((PolicyNoticeApproveResponseUPSdk) c10k.LJIIJJI()).getStatus_code()));
                }
                throw new Exception("-1");
        }
    }
}
