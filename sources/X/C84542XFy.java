package X;

import android.os.Process;
import java.io.File;

/* renamed from: X.XFy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84542XFy extends RunnableC39007FSp {
    public final /* synthetic */ C84541XFx LJLJJL;

    public final void LIZJ() {
        Process.setThreadPriority(10);
        System.currentTimeMillis();
        try {
            Thread.sleep(10000L);
            System.currentTimeMillis();
            C84541XFx c84541XFx = this.LJLJJL;
            int i = c84541XFx.LIZ;
            int i2 = c84541XFx.LIZIZ;
            try {
                C36980EfI.LIZ(C84541XFx.LJ);
            } catch (Exception unused) {
            }
            C84541XFx.LIZIZ(i, new File(C84541XFx.LIZLLL));
            if (!C38354F3m.LJ(C84541XFx.LJFF)) {
                C84541XFx.LIZIZ(i2, new File(C84541XFx.LJFF));
            }
        } catch (Exception unused2) {
        }
        System.currentTimeMillis();
        C84541XFx.LJIIIIZZ = false;
        try {
            XG3.LJLL.LIZ(this.LJLJJL);
        } catch (Exception unused3) {
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
    public C84542XFy(C84541XFx c84541XFx) {
        super((Object) null);
        this.LJLJJL = c84541XFx;
    }
}
