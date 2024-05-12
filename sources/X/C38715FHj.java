package X;

import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

/* renamed from: X.FHj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38715FHj {
    public static volatile PthreadThread LIZ;
    public static final BlockingQueue<String> LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    static {
        BlockingQueue<String> linkedBlockingQueue;
        if (Build.VERSION.SDK_INT > 21) {
            linkedBlockingQueue = new LinkedTransferQueue<>();
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue<>();
        }
        LIZIZ = linkedBlockingQueue;
    }
}
