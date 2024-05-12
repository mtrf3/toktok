package X;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.5DP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DP {
    public final C5DQ LIZ;
    public long LIZIZ;
    public int LIZJ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5DQ] */
    public C5DP(final C5DS c5ds) {
        final Looper LLJJJJ = C16880lQ.LLJJJJ();
        this.LIZ = new C5DR(c5ds, LLJJJJ) { // from class: X.5DQ
            @Override // X.C5DR, android.os.Handler
            public final void handleMessage(Message msg) {
                o.LJIIIZ(msg, "msg");
                super.handleMessage(msg);
                this.getClass();
            }
        };
    }

    public final void LIZ(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LIZIZ > 100) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = i;
            sendMessageDelayed(obtain, 0L);
        } else {
            removeMessages(100);
            int i2 = this.LIZJ;
            if (i > i2) {
                Message obtain2 = Message.obtain();
                obtain2.what = 100;
                obtain2.arg1 = (i2 + i) / 2;
                sendMessageDelayed(obtain2, 0L);
                Message obtain3 = Message.obtain();
                obtain3.what = 100;
                obtain3.arg1 = i;
                sendMessageDelayed(obtain3, 16L);
            }
        }
        this.LIZIZ = uptimeMillis;
        this.LIZJ = i;
    }
}
