package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.PuG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class HandlerThreadC65936PuG extends HandlerThread {
    public static volatile HandlerThreadC65936PuG LJLIL;
    public static Handler LJLILLLLZI;
    public static ExecutorC64417PPx LJLJI;

    public HandlerThreadC65936PuG() {
        super("helios.worker", 0);
    }

    public static void LIZ() {
        if (LJLIL == null) {
            synchronized (HandlerThreadC64418PPy.class) {
                if (LJLIL == null) {
                    HandlerThreadC65936PuG handlerThreadC65936PuG = new HandlerThreadC65936PuG();
                    handlerThreadC65936PuG.start();
                    Handler handler = new Handler(handlerThreadC65936PuG.getLooper());
                    LJLILLLLZI = handler;
                    LJLJI = new ExecutorC64417PPx(handler);
                    LJLIL = handlerThreadC65936PuG;
                }
            }
        }
    }
}
