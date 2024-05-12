package X;

import android.os.Process;
import java.io.File;

/* renamed from: X.XFz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84543XFz extends RunnableC39007FSp {
    public final /* synthetic */ C84541XFx LJLJJL;

    public final void LIZJ() {
        Process.setThreadPriority(10);
        System.currentTimeMillis();
        try {
            System.currentTimeMillis();
            this.LJLJJL.getClass();
            try {
                C36980EfI.LIZ(C84541XFx.LJ);
            } catch (Exception unused) {
            }
            long j = 0;
            try {
                j = 0 + C36980EfI.LIZLLL(new File(C84541XFx.LIZJ));
            } catch (Throwable unused2) {
            }
            if (j > 20971520) {
                long LIZ = C84541XFx.LIZ(20971520L, C84541XFx.LIZLLL);
                if (LIZ < 20971520) {
                    C84541XFx.LIZ(20971520 - LIZ, C84541XFx.LJFF);
                }
            }
        } catch (Exception unused3) {
        }
        System.currentTimeMillis();
        C84541XFx.LJIIIIZZ = false;
        try {
            XG3.LJLL.LIZ(this.LJLJJL);
        } catch (Exception unused4) {
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
    public C84543XFz(C84541XFx c84541XFx) {
        super((Object) null);
        this.LJLJJL = c84541XFx;
    }
}
