package X;

import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class BL9 implements Runnable {
    public final /* synthetic */ C28601BKj LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public BL9(C28601BKj c28601BKj, long j, String str, boolean z) {
        this.LJLIL = c28601BKj;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = z;
    }

    public final void LIZ() {
        BLA bla;
        if (this.LJLIL.LJ.containsKey(Long.valueOf(this.LJLILLLLZI))) {
            String str = this.LJLIL.LJ.get(Long.valueOf(this.LJLILLLLZI));
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(this.LJLJI, str) && this.LJLIL.LIZJ.containsKey(str) && (bla = this.LJLIL.LIZJ.get(str)) != null) {
                synchronized (bla) {
                    if (bla.LIZIZ == 0) {
                        bla.LIZIZ = SystemClock.elapsedRealtime();
                    }
                }
            }
        }
        this.LJLIL.LJ.put(Long.valueOf(this.LJLILLLLZI), this.LJLJI);
        if (this.LJLJJI) {
            if (!this.LJLIL.LIZJ.containsKey(this.LJLJI)) {
                BLA bla2 = new BLA();
                bla2.LIZ = SystemClock.elapsedRealtime();
                bla2.LIZLLL = this.LJLILLLLZI;
                bla2.LJ = 0;
                this.LJLIL.LIZJ.put(this.LJLJI, bla2);
                return;
            }
            BLA bla3 = this.LJLIL.LIZJ.get(this.LJLJI);
            if (bla3 == null) {
                return;
            }
            synchronized (bla3) {
                long j = bla3.LIZIZ;
                long j2 = bla3.LIZ;
                if (j > j2) {
                    bla3.LIZJ = (j - j2) + bla3.LIZJ;
                    bla3.LIZ = SystemClock.elapsedRealtime();
                    bla3.LIZIZ = 0L;
                    bla3.LJ++;
                }
            }
            return;
        }
        BLA bla4 = this.LJLIL.LIZJ.get(this.LJLJI);
        if (bla4 == null) {
            return;
        }
        synchronized (bla4) {
            bla4.LIZIZ = SystemClock.elapsedRealtime();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
