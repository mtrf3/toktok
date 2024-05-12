package X;

import com.ss.android.ugc.aweme.legoImp.task.CovodeCollectTask;

/* loaded from: classes7.dex */
public final class F3L implements F3J {
    public final /* synthetic */ CovodeCollectTask LJLIL;

    @Override // X.F3J
    public final void onSuccess() {
        this.LJLIL.LJLIL.storeLong("covode_upload_time", System.currentTimeMillis());
        int i = this.LJLIL.LJLIL.getInt("upload_interval_day", 0);
        int i2 = 1;
        if (i != 0 && (i2 = i << 1) > 8) {
            i2 = 8;
        }
        this.LJLIL.LJLIL.storeInt("upload_interval_day", i2);
    }

    public F3L(CovodeCollectTask covodeCollectTask) {
        this.LJLIL = covodeCollectTask;
    }

    @Override // X.F3J
    public final void LIZ(String str) {
        C78983UzD.LJIILL(str);
    }
}
