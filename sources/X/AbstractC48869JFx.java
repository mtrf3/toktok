package X;

import android.content.Context;

/* renamed from: X.JFx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC48869JFx {
    public final Context LIZ;
    public final QIF LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final C66765QIf LJ;
    public boolean LJFF;
    public C48867JFv LJI;

    public abstract void LIZ();

    public abstract boolean LIZIZ();

    public abstract String LIZJ();

    public abstract long[] LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract long LJI();

    public abstract void LJII(boolean z);

    public abstract void LJIIIIZZ(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final C48868JFw LJIIIZ() {
        long j;
        int i;
        LJFF();
        boolean LJJIL = C78886Uxe.LJJIL(this.LIZ);
        int i2 = 1;
        boolean z = 0;
        z = 0;
        C48868JFw c48868JFw = new C48868JFw();
        if (!LJJIL) {
            j = 60000;
            StringBuilder LIZJ = V10.LIZJ("network not ready. delay ", 60000L, " ms do ");
            LIZJ.append(LIZJ());
            X1D.LIZIZ(LIZJ);
        } else {
            long LJI = LJI() + this.LIZLLL;
            long currentTimeMillis = System.currentTimeMillis();
            if (LJI <= 1000 + currentTimeMillis) {
                if (LIZIZ()) {
                    c48868JFw.LIZLLL = this.LIZJ;
                    this.LIZJ = 0;
                    this.LIZLLL = System.currentTimeMillis();
                    j = LJI();
                    i = 0;
                    LIZJ();
                    z = i2;
                    i2 = i;
                }
                long[] LIZLLL = LIZLLL();
                int i3 = this.LIZJ;
                int i4 = i3 + 1;
                this.LIZJ = i4;
                int length = i3 % LIZLLL.length;
                j = LIZLLL[length];
                if (length == LIZLLL.length - 1) {
                    c48868JFw.LIZLLL = i4;
                    i = 4;
                } else {
                    i = 3;
                }
                i2 = 0;
                LIZJ();
                z = i2;
                i2 = i;
            } else {
                j = LJI - currentTimeMillis;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("time not ready. need ");
                LIZ.append(j);
                X1D.LIZIZ(LIZ);
                i2 = 2;
            }
        }
        c48868JFw.LIZIZ = i2;
        c48868JFw.LIZ = z;
        c48868JFw.LIZJ = j;
        return c48868JFw;
    }

    public AbstractC48869JFx(Context context, QIF qif) {
        this.LIZ = context;
        this.LIZIZ = qif;
        this.LJ = C66765QIf.LJFF(String.valueOf(qif.LIZ));
    }

    public AbstractC48869JFx(Context context, QIF qif, long j) {
        this.LIZ = context;
        this.LIZIZ = qif;
        this.LIZLLL = j;
        this.LJ = C66765QIf.LJFF(String.valueOf(qif.LIZ));
    }
}
