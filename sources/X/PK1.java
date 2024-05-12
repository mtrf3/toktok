package X;

import java.io.File;
import java.util.Date;

/* loaded from: classes12.dex */
public final class PK1 implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C64269PKf LJLJJL;

    public final void LIZ() {
        PK2 pk2;
        try {
            C64269PKf c64269PKf = this.LJLJJL;
            String str = this.LJLIL;
            String str2 = this.LJLILLLLZI;
            long j = this.LJLJI;
            if (c64269PKf.LJ.size() >= c64269PKf.LJIJ && (pk2 = c64269PKf.LJ.poll()) != null) {
                c64269PKf.LJ.add(pk2);
            } else {
                pk2 = new PK2(str, str2, j);
                c64269PKf.LJ.add(pk2);
            }
            pk2.LIZIZ = this.LJLILLLLZI;
            pk2.LIZ = this.LJLIL;
            pk2.LIZJ = this.LJLJI;
        } catch (Throwable unused) {
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append('.');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append('@');
        LIZ.append(Long.toHexString(this.LJLJJI));
        String LIZIZ = X1D.LIZIZ(LIZ);
        long j2 = this.LJLJI;
        try {
            File LIZIZ2 = C64263PJz.LIZIZ();
            if (LIZIZ2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("activityLifeCycle");
                LIZ2.append(' ');
                LIZ2.append(LIZIZ);
                LIZ2.append(' ');
                LIZ2.append(C77123UOp.LJJIII().format(new Date(j2)));
                LIZ2.append('\n');
                PK8.LJIILJJIL(LIZIZ2, X1D.LIZIZ(LIZ2), true);
            }
        } catch (Throwable unused2) {
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

    public PK1(C64269PKf c64269PKf, String str, String str2, long j, int i) {
        this.LJLJJL = c64269PKf;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
        this.LJLJJI = i;
    }
}
