package X;

import com.bytedance.keva.Keva;

/* loaded from: classes14.dex */
public final class UQ3 implements UQA {
    public static String LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static UQ3 LIZJ;
    public final Keva LIZ;

    @Override // X.UQA
    public final boolean LIZIZ() {
        return this.LIZ.getBoolean("after_login_permission_pop_up", false);
    }

    @Override // X.UQA
    public final void LIZLLL() {
        this.LIZ.erase("after_login_permission_pop_up");
    }

    @Override // X.UQA
    public final void LJ() {
        this.LIZ.storeLong("contact_did_pop_up_time", System.currentTimeMillis());
    }

    public UQ3() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permission_dialog");
        LIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }

    @Override // X.UQA
    public final void LIZ(int i) {
        if (i != 1) {
            if (i == 2) {
                this.LIZ.storeBoolean("finish_facebook_permission_process", true);
            }
        } else {
            this.LIZ.storeBoolean("finish_contact_permission_process", true);
        }
        if (this.LIZ.getBoolean("finish_facebook_permission_process", false) && this.LIZ.getBoolean("finish_contact_permission_process", false)) {
            this.LIZ.storeBoolean("has_go_through_process", true);
        }
    }

    @Override // X.UQA
    public final void LIZJ(int i, long j) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LIZ.storeLong("sync_off_facebook_time", j);
            return;
        }
        this.LIZ.storeLong("sync_off_contact_time", j);
    }
}
