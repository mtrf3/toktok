package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Fiw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39754Fiw implements Runnable {
    public static RunnableC39754Fiw LJLLI;
    public Application LJLIL;
    public HandlerC39757Fiz LJLILLLLZI;
    public boolean LJLJI;
    public Looper LJLJJI;
    public InterfaceC39753Fiv LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public MessageQueue LJLJLJ;
    public Field LJLJLLL;
    public Field LJLL;

    public static RunnableC39754Fiw LIZIZ() {
        if (LJLLI == null) {
            synchronized (RunnableC39754Fiw.class) {
                if (LJLLI == null) {
                    LJLLI = new RunnableC39754Fiw();
                }
            }
        }
        return LJLLI;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[Catch: all -> 0x00d2, TryCatch #0 {, blocks: (B:15:0x0045, B:17:0x0053, B:19:0x0057, B:20:0x0062, B:22:0x0068, B:23:0x0083, B:26:0x0090), top: B:14:0x0045, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[Catch: all -> 0x00d2, DONT_GENERATE, TryCatch #0 {, blocks: (B:15:0x0045, B:17:0x0053, B:19:0x0057, B:20:0x0062, B:22:0x0068, B:23:0x0083, B:26:0x0090), top: B:14:0x0045, outer: #3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:20:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC39754Fiw.LIZ():void");
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

    public final void LIZJ(Application application, String str, InterfaceC39753Fiv interfaceC39753Fiv, boolean z) {
        if (this.LJLJI) {
            return;
        }
        this.LJLJJLL = str;
        this.LJLJJL = interfaceC39753Fiv;
        this.LJLJI = true;
        this.LJLIL = application;
        this.LJLJL = z;
        HandlerThread LIZ = C06M.LIZ(str);
        C39756Fiy c39756Fiy = C39756Fiy.LJLJJI;
        c39756Fiy.getClass();
        try {
            if (!c39756Fiy.LJLJI) {
                Handler handler = (Handler) EWB.LIZJ();
                Field LJIIL = C78934UyQ.LJIIL(Handler.class, "mCallback");
                c39756Fiy.LJLILLLLZI = (Handler.Callback) LJIIL.get(handler);
                LJIIL.set(handler, c39756Fiy);
                c39756Fiy.LJLJI = true;
            }
        } catch (Throwable unused) {
        }
        this.LJLJJI = LIZ.getLooper();
        this.LJLILLLLZI = new HandlerC39757Fiz(this.LJLJJI);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.LJLILLLLZI.post(new ARunnableS25S0200000_6(this, countDownLatch, 33));
        new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS42S0100000_6(countDownLatch, 79));
        this.LJLILLLLZI.postDelayed(this, 2000L);
    }
}
