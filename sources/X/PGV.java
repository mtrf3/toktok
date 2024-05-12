package X;

import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class PGV implements Runnable {
    public final /* synthetic */ int[] LJLILLLLZI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ ThreadGroup LJLJJL;
    public final /* synthetic */ boolean LJLIL = false;
    public final /* synthetic */ String LJLJI = null;

    public final void LIZ() {
        int[] iArr;
        int i;
        if (!this.LJLIL && (i = (iArr = this.LJLILLLLZI)[0]) >= PGU.LJLL && PGU.LJLJLLL) {
            Thread[] threadArr = new Thread[(i / 2) + i];
            iArr[0] = this.LJLJJL.enumerate(threadArr);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                int i3 = this.LJLILLLLZI[0];
                if (i2 < i3) {
                    String name = threadArr[i2].getName();
                    if (!TextUtils.isEmpty(name)) {
                        sb.append(name);
                        sb.append(",");
                    }
                    i2++;
                } else {
                    try {
                        C64089PDh.LJIIJ().LIZLLL(new PEF(PGU.LJIILL(this.LJLJJI, i3, this.LJLJI, sb.toString())));
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        } else {
            try {
                C64089PDh.LJIIJ().LIZLLL(new PEF(PGU.LJIILL(this.LJLJJI, this.LJLILLLLZI[0], this.LJLJI, null)));
            } catch (Exception unused2) {
            }
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

    public PGV(int[] iArr, int i, ThreadGroup threadGroup) {
        this.LJLILLLLZI = iArr;
        this.LJLJJI = i;
        this.LJLJJL = threadGroup;
    }
}
