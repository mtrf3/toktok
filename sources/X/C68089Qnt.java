package X;

import X.C0M9;
import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.Qnt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68089Qnt extends C68052QnI {
    public final C1HQ LIZIZ;
    public final C1HQ LIZJ;
    public long LIZLLL;

    public C68089Qnt(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZJ = new C1HQ();
        this.LIZIZ = new C1HQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(long j) {
        C68132Qoa LJIIL = this.LIZ.LJIJI().LJIIL(false);
        Iterator it = ((C0M9.c) this.LIZIZ.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LJIIJ(str, j - ((Long) this.LIZIZ.getOrDefault(str, null)).longValue(), LJIIL);
        }
        if (!this.LIZIZ.isEmpty()) {
            LJIIIZ(j - this.LIZLLL, LJIIL);
        }
        LJIIJJI(j);
    }

    public final void LJIIJJI(long j) {
        Iterator it = ((C0M9.c) this.LIZIZ.keySet()).iterator();
        while (it.hasNext()) {
            this.LIZIZ.put(it.next(), Long.valueOf(j));
        }
        if (!this.LIZIZ.isEmpty()) {
            this.LIZLLL = j;
        }
    }

    public final void LJI(long j, String str) {
        if (str == null || str.length() == 0) {
            this.LIZ.LIZJ().LJFF.LIZ("Ad unit id must be a non-empty string");
        } else {
            this.LIZ.LIZIZ().LJIILIIL(new RunnableC68097Qo1(this, str, j));
        }
    }

    public final void LJII(long j, String str) {
        if (str == null || str.length() == 0) {
            this.LIZ.LIZJ().LJFF.LIZ("Ad unit id must be a non-empty string");
        } else {
            this.LIZ.LIZIZ().LJIILIIL(new RunnableC68093Qnx(this, str, j));
        }
    }

    public final void LJIIIZ(long j, C68132Qoa c68132Qoa) {
        if (c68132Qoa == null) {
            this.LIZ.LIZJ().LJIILIIL.LIZ("Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        C68083Qnn.LJIJ(c68132Qoa, bundle, true);
        this.LIZ.LJIJ().LJIIL("am", "_xa", bundle);
    }

    public final void LJIIJ(String str, long j, C68132Qoa c68132Qoa) {
        if (c68132Qoa == null) {
            this.LIZ.LIZJ().LJIILIIL.LIZ("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.LIZ.LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        C68083Qnn.LJIJ(c68132Qoa, bundle, true);
        this.LIZ.LJIJ().LJIIL("am", "_xu", bundle);
    }
}
