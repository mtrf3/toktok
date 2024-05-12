package X;

import com.bytedance.keva.Keva;

/* renamed from: X.9La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235229La {
    public static String LIZIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static C235229La LIZJ;
    public final Keva LIZ;

    public final boolean LIZ() {
        int i = this.LIZ.getInt("unclick_times", 0);
        int i2 = this.LIZ.getInt("unclick_times_threshold", 20);
        if (i == i2 - 1) {
            this.LIZ.storeInt("without_notice_days", (int) (System.currentTimeMillis() / 60000));
        }
        if (i < i2) {
            return false;
        }
        return true;
    }

    public C235229La() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("profile_new_follower_notification");
        LIZ.append(LIZIZ);
        this.LIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }

    public final boolean LIZIZ() {
        if (!LIZ()) {
            return true;
        }
        if (System.currentTimeMillis() / 60000 > (this.LIZ.getInt("without_notice_days_threshold", 90) * 1440) + this.LIZ.getInt("without_notice_days", (int) System.currentTimeMillis())) {
            this.LIZ.storeInt("unclick_times", 0);
            this.LIZ.storeInt("without_notice_days", 0);
        }
        return false;
    }
}
