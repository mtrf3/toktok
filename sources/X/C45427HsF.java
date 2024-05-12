package X;

import android.os.Process;

/* renamed from: X.HsF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45427HsF extends C163356b5 {
    public final /* synthetic */ C45425HsD LJLIL;

    @Override // X.C163356b5, X.InterfaceC42472Glg
    public final void onAppBackground() {
        C45425HsD c45425HsD = this.LJLIL;
        if (c45425HsD.LJFF) {
            c45425HsD.LIZ.LIZ.storeLong("quick_promo_plus_app_terminated_time", System.currentTimeMillis() / 1000);
            this.LJLIL.LIZ.LIZ.storeInt("last_os_process_id", Process.myPid());
        }
    }

    public C45427HsF(C45425HsD c45425HsD) {
        this.LJLIL = c45425HsD;
    }
}
