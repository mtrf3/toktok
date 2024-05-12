package X;

import android.app.Application;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fit, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39751Fit implements Runnable {
    public static final Object LJLLI = new Object();
    public static RunnableC39751Fit LJLLILLLL;
    public Application LJLIL;
    public HandlerC39752Fiu LJLILLLLZI;
    public final List<Message> LJLJI = new ArrayList();
    public long LJLJJI;
    public boolean LJLJJL;
    public InterfaceC39753Fiv LJLJJLL;
    public boolean LJLJL;
    public MessageQueue LJLJLJ;
    public Field LJLJLLL;
    public Field LJLL;

    public static RunnableC39751Fit LIZJ() {
        if (LJLLILLLL == null) {
            synchronized (RunnableC39751Fit.class) {
                if (LJLLILLLL == null) {
                    LJLLILLLL = new RunnableC39751Fit();
                }
            }
        }
        return LJLLILLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: all -> 0x00d0, DONT_GENERATE, TryCatch #0 {, blocks: (B:15:0x0045, B:17:0x0053, B:19:0x0057, B:20:0x0062, B:22:0x006c, B:25:0x008e, B:45:0x0075, B:47:0x0085), top: B:14:0x0045, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:15:0x0045, B:17:0x0053, B:19:0x0057, B:20:0x0062, B:22:0x006c, B:25:0x008e, B:45:0x0075, B:47:0x0085), top: B:14:0x0045, outer: #3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008d -> B:20:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC39751Fit.LIZ():void");
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

    public final void LIZIZ(Message message) {
        long when;
        if (this.LJLIL != null) {
            int i = message.arg2;
            if (i == 9527 || i == 9529) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Current message ");
                LIZ.append(message.what);
                LIZ.append(" is already followed!");
                X1D.LIZIZ(LIZ);
                C39749Fir.LIZ();
                return;
            }
            WeakReference weakReference = new WeakReference(message);
            Message obtainMessage = this.LJLILLLLZI.obtainMessage(100);
            obtainMessage.obj = weakReference;
            message.arg2 = 9527;
            if (SystemClock.uptimeMillis() - message.getWhen() > 1000) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Current follow message ");
                LIZ2.append(message.what);
                LIZ2.append(" is already out of time.");
                X1D.LIZIZ(LIZ2);
                C39749Fir.LIZ();
                when = SystemClock.uptimeMillis();
            } else {
                when = message.getWhen() + 1000;
            }
            long max = Math.max(this.LJLJJI + 30, when);
            this.LJLILLLLZI.sendMessageAtTime(obtainMessage, max);
            this.LJLJJI = max;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Follow message ");
            LIZ3.append(message);
            LIZ3.append(" successful. Trigger at time = ");
            LIZ3.append(this.LJLJJI);
            X1D.LIZIZ(LIZ3);
            C39749Fir.LIZ();
            return;
        }
        throw new RuntimeException("Must call start(Application context) first!!!");
    }
}
