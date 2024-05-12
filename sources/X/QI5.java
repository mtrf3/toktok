package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public final class QI5 {
    public static final List<String> LJIILIIL = Collections.singletonList("Session");
    public static QJ7 LJIILJJIL;
    public volatile long LIZ;
    public final QI4 LIZIZ;
    public QID LIZJ;
    public QID LIZLLL;
    public String LJ;
    public final AtomicLong LJFF = new AtomicLong(1000);
    public long LJI = -1;
    public volatile boolean LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJ;
    public volatile String LJIIJJI;
    public volatile long LJIIL;

    public final synchronized void LIZJ() {
        this.LIZIZ.LJLJJI.LIZIZ.getClass();
    }

    public QI5(QI4 qi4) {
        this.LIZIZ = qi4;
        this.LJIIL = qi4.LJLJJI.LIZLLL.getLong("latest_forground_session_time", 0L);
    }

    public final void LIZ(QI2 qi2) {
        if (qi2 != null) {
            LIZIZ(qi2, this.LIZ);
            QI3 qi3 = this.LIZIZ.LJLJI;
            qi2.LJLLJ = qi3.LJIIIZ;
            qi2.LJLJL = qi3.LJI();
            qi2.LJLJJI = this.LJ;
            qi2.LJLJI = this.LJFF.incrementAndGet();
            qi2.LJLJLLL = C16880lQ.LLJJI(this.LIZIZ.LJLJI.LJIIJ).getValue();
        }
    }

    public final void LIZIZ(QI2 qi2, long j) {
        String str;
        this.LIZIZ.LJLJI.getClass();
        this.LIZIZ.LJLJI.getClass();
        qi2.LJLJJL = j;
        QI3 qi3 = this.LIZIZ.LJLJI;
        String.valueOf(j);
        if (qi3.LJIIL != null) {
            str = qi3.LJIIL.LIZJ.LIZJ.getString("ab_sdk_version", "");
        } else {
            str = null;
        }
        qi2.LJLJLJ = str;
    }

    public final synchronized QIH LIZLLL(QI2 qi2, ArrayList<QI2> arrayList, boolean z) {
        long j;
        QIH qih;
        String str;
        String str2;
        long j2 = 0;
        if (qi2 != null) {
            if (qi2 instanceof QJ7) {
                j = -1;
            } else {
                j = qi2.LJLILLLLZI;
            }
        } else {
            j = 0;
        }
        this.LJ = UUID.randomUUID().toString();
        if (z) {
            this.LJIIL = j;
            this.LIZIZ.LJLJJI.LIZLLL.edit().putLong("latest_forground_session_time", this.LJIIL).apply();
            this.LIZIZ.getClass();
            if (TextUtils.isEmpty(this.LJIIJJI)) {
                this.LJIIJJI = this.LJ;
            }
        }
        this.LJFF.set(10000L);
        this.LJI = j;
        this.LJII = z;
        this.LJIIIIZZ = 0L;
        boolean z2 = true;
        if (z) {
            Calendar calendar = Calendar.getInstance();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(calendar.get(1));
            LIZ.append(calendar.get(2));
            LIZ.append(calendar.get(5));
            String LIZIZ = X1D.LIZIZ(LIZ);
            QH9 qh9 = this.LIZIZ.LJLJJI;
            if (TextUtils.isEmpty(this.LJIIJ)) {
                this.LJIIJ = qh9.LIZLLL.getString("session_last_day", "");
                this.LJIIIZ = qh9.LIZLLL.getInt("session_order", 0);
            }
            if (!LIZIZ.equals(this.LJIIJ)) {
                this.LJIIJ = LIZIZ;
                this.LJIIIZ = 1;
            } else {
                this.LJIIIZ++;
            }
            qh9.LIZLLL.edit().putString("session_last_day", LIZIZ).putInt("session_order", this.LJIIIZ).apply();
        }
        if (j == -1) {
            qih = null;
        } else {
            qih = new QIH();
            qih.LJLLJ = this.LIZIZ.LJLJI.LJIIIZ;
            qih.LJLJJI = this.LJ;
            if (this.LJII) {
                z2 = false;
            }
            qih.LLF = z2;
            qih.LJLJI = this.LJFF.incrementAndGet();
            qih.LJIIL(this.LJI);
            QIF qif = ((C66760QIa) this.LIZIZ.LJLJLJ.LIZ).LIZIZ;
            if (qif != null) {
                str2 = qif.LJ();
            } else {
                str2 = "";
            }
            qih.LLD = str2;
            QIF qif2 = ((C66760QIa) this.LIZIZ.LJLJLJ.LIZ).LIZIZ;
            if (qif2 != null) {
                j2 = qif2.LJFF();
            }
            qih.LL = j2;
            LIZIZ(qih, this.LIZ);
            qih.LJLJL = this.LIZIZ.LJLJI.LJI();
            arrayList.add(qih);
            this.LIZIZ.LJLJI.LJJIJIL.LIZ(qih.LJLILLLLZI, qih.LJLJJI, qih.LLF);
        }
        QI3 qi3 = this.LIZIZ.LJLJI;
        if (qi3.LJIIIIZZ <= 0) {
            qi3.LJIIIIZZ = 6;
        }
        QIX qix = qi3.LJJIZ;
        List<String> list = LJIILIIL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("startSession, ");
        if (this.LJII) {
            str = "fg";
        } else {
            str = "bg";
        }
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append(this.LJ);
        LIZ2.append(", ");
        LIZ2.append(j);
        qix.LJIIIZ(0, list, X1D.LIZIZ(LIZ2), new Object[0]);
        return qih;
    }
}
