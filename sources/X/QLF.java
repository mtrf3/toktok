package X;

import com.ss.android.common.applog.AppLog;

/* loaded from: classes12.dex */
public final class QLF extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ QLJ LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ AppLog LJLJLJ;

    public final void LIZJ() {
        super.run();
        try {
            if (!this.LJLJLJ.sendTimelyEvent(this.LJLJJL)) {
                QLJ qlj = new QLJ();
                QLJ qlj2 = this.LJLJJLL;
                qlj.LIZ = qlj2.LIZ;
                qlj.LIZIZ = qlj2.LIZIZ;
                qlj.LIZJ = qlj2.LIZJ;
                qlj.LIZLLL = qlj2.LIZLLL;
                qlj.LJ = qlj2.LJ;
                qlj.LJIILL = true;
                qlj.LJI = qlj2.LJI;
                qlj.LJIIIIZZ = qlj2.LJIIIIZZ;
                qlj.LJFF = qlj2.LJFF;
                qlj.LJIIIZ = qlj2.LJIIIZ;
                qlj.LJIILIIL = qlj2.LJIILIIL;
                qlj.LJIILJJIL = qlj2.LJIILJJIL;
                qlj.LJIIJJI = qlj2.LJIIJJI;
                QLQ qlq = new QLQ(QLI.EVENT);
                qlq.LIZIZ = qlj;
                this.LJLJLJ.enqueue(qlq);
                QIV.LIZ(QIU.real_event, QIL.f_net);
            } else {
                QIU qiu = QIU.real_event;
                QIL qil = QIL.success;
                QIV.LIZ(qiu, qil);
                QIV.LIZ(QIU.event_v3, qil);
                if (QJY.LJFF(this.LJLJL)) {
                    QIV.LIZ(qiu, QIL.f_device_none);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QLF(AppLog appLog, String str, QLJ qlj, String str2) {
        super((Object) null);
        this.LJLJLJ = appLog;
        this.LJLJJL = str;
        this.LJLJJLL = qlj;
        this.LJLJL = str2;
    }
}
