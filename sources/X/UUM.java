package X;

import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.SyncContactStatusEvent;
import ujb.o;

/* loaded from: classes14.dex */
public final class UUM<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ boolean LIZIZ = true;
    public final /* synthetic */ String LIZLLL = "";
    public final /* synthetic */ String LJ = "";

    public UUM(String str, String str2) {
        this.LIZ = str;
        this.LIZJ = str2;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (!C82544WaS.LJ(c10k) || o.LJJJJIZL("error", ((BaseResponse) c10k.LJIIJJI()).message, true)) {
            SyncContactStatusEvent syncContactStatusEvent = new SyncContactStatusEvent(this.LIZ, false, true ^ this.LIZIZ);
            C2U8.LIZ(syncContactStatusEvent);
            return syncContactStatusEvent;
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && C77265UUb.LIZ && this.LIZIZ && ("homepage_hot".equals(this.LIZ) || "homepage_follow".equals(this.LIZ))) {
            LJIIIIZZ.runOnUiThread(new ARunnableS37S0100000_1(LJIIIIZZ, 100));
            C77265UUb.LIZ = false;
        }
        C77266UUc.LIZIZ.LJJII(this.LIZIZ);
        if (this.LIZJ.length() > 0) {
            UQ4.LIZLLL(this.LIZ, this.LIZJ, "contact", this.LIZLLL, this.LJ, "process", null, null, 448);
        }
        SyncContactStatusEvent syncContactStatusEvent2 = new SyncContactStatusEvent(this.LIZ, true, !this.LIZIZ);
        C2U8.LIZ(syncContactStatusEvent2);
        return syncContactStatusEvent2;
    }
}
