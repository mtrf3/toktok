package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.PPy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerThreadC64418PPy extends HandlerThread {
    public static volatile HandlerThreadC64418PPy LJLJI;
    public static Handler LJLJJI;
    public static ExecutorC64417PPx LJLJJL;
    public final ConcurrentLinkedQueue<Pair<Long, Runnable>> LJLIL;
    public volatile boolean LJLILLLLZI;

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        this.LJLILLLLZI = true;
        while (!this.LJLIL.isEmpty()) {
            Pair<Long, Runnable> poll = this.LJLIL.poll();
            if (poll != null) {
                if (((Long) poll.first).longValue() < 0) {
                    LIZ();
                    LJLJJI.post((Runnable) poll.second);
                } else {
                    LIZ();
                    LJLJJI.postAtTime((Runnable) poll.second, ((Long) poll.first).longValue());
                }
            }
        }
    }

    public HandlerThreadC64418PPy() {
        super("helios.monitor", 0);
        this.LJLIL = new ConcurrentLinkedQueue<>();
        this.LJLILLLLZI = false;
    }

    public static void LIZ() {
        if (LJLJI == null) {
            synchronized (HandlerThreadC64418PPy.class) {
                if (LJLJI == null) {
                    HandlerThreadC64418PPy handlerThreadC64418PPy = new HandlerThreadC64418PPy();
                    handlerThreadC64418PPy.start();
                    Handler handler = new Handler(handlerThreadC64418PPy.getLooper());
                    LJLJJI = handler;
                    LJLJJL = new ExecutorC64417PPx(handler);
                    LJLJI = handlerThreadC64418PPy;
                }
            }
        }
    }

    public final void LIZIZ(Runnable runnable) {
        if (this.LJLILLLLZI) {
            LIZ();
            LJLJJI.post(runnable);
        } else {
            this.LJLIL.add(new Pair<>(-1L, runnable));
        }
    }
}
