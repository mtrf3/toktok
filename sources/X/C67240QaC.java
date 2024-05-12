package X;

import android.app.NotificationManager;

/* renamed from: X.QaC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67240QaC {
    public final int LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{id=");
        LIZ.append(this.LIZ);
        LIZ.append(", postTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", tag=");
        LIZ.append(this.LIZJ);
        LIZ.append("}, pushLabel=");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(NotificationManager notificationManager) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushMsgManager cancel notify item:  ");
        LIZ.append(this);
        QSI.LIZIZ(X1D.LIZIZ(LIZ));
        notificationManager.cancel(this.LIZJ, this.LIZ);
        int i = this.LIZ;
        long j = this.LIZIZ;
        String str = this.LIZLLL;
        int i2 = C67241QaD.LJFF;
        int i3 = C67241QaD.LJI;
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, "rule_id");
        c188727au.LJ(j, "post_time");
        c188727au.LJIIIZ("push_label", str);
        c188727au.LIZLLL(i2, "group_cnt");
        c188727au.LIZLLL(i3, "msg_cnt");
        FMX.LJIIL("push_cancel_msg", c188727au.LIZ);
    }

    public C67240QaC(int i, String str, String str2, long j) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
