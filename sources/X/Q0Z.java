package X;

import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0Z {
    public static final java.util.Set<InterfaceC66315Q0x> LIZ = new LinkedHashSet();
    public static final java.util.Map<String, java.util.Set<InterfaceC66315Q0x>> LIZIZ = new LinkedHashMap();
    public static final HandlerThreadC66294Q0c LIZJ;
    public static Handler LIZLLL;
    public static final ConcurrentLinkedQueue<C66297Q0f> LJ;

    static {
        HandlerThreadC66294Q0c handlerThreadC66294Q0c = new HandlerThreadC66294Q0c();
        LIZJ = handlerThreadC66294Q0c;
        LJ = new ConcurrentLinkedQueue<>();
        handlerThreadC66294Q0c.start();
    }

    public static void LIZ(C66297Q0f c66297Q0f) {
        String str;
        Cert cert;
        if (Q0O.LIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            OHW ohw = c66297Q0f.LIZ;
            if (ohw != null && (cert = ohw.LIZIZ) != null) {
                str = cert.certToken();
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append('|');
            LIZ2.append(c66297Q0f.LIZIZ);
            LIZ2.append('|');
            LIZ2.append(c66297Q0f.LIZJ);
            LIZ2.append(" >> ");
            LIZ2.append(c66297Q0f);
            String msg = X1D.LIZIZ(LIZ2);
            int i = C66306Q0o.LIZ[c66297Q0f.LJFF.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    o.LJIIJ(msg, "msg");
                } else {
                    o.LJIIJ(msg, "msg");
                }
            } else {
                o.LJIIJ(msg, "msg");
            }
        }
        Handler handler = LIZLLL;
        if (handler == null) {
            if (Q0O.LIZ) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("event handler is not ready now ,save event in cacheQueue. current cache queue size is ");
                LIZ3.append(LJ.size());
                o.LJIIJ(X1D.LIZIZ(LIZ3), "msg");
            }
            ConcurrentLinkedQueue<C66297Q0f> concurrentLinkedQueue = LJ;
            if (concurrentLinkedQueue.size() >= 1024) {
                return;
            }
            concurrentLinkedQueue.add(c66297Q0f);
            return;
        }
        handler.sendMessage(handler.obtainMessage(1, c66297Q0f));
    }
}
