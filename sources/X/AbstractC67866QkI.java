package X;

import android.content.Context;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: X.QkI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67866QkI {
    public static final Object LIZ = new Object();
    public static C67868QkK LIZIZ;
    public static HandlerThread LIZJ;

    public abstract boolean LIZLLL(C65428Pm4 c65428Pm4, ServiceConnectionC67871QkN serviceConnectionC67871QkN, String str, Executor executor);

    public static HandlerThread LIZIZ() {
        synchronized (LIZ) {
            HandlerThread handlerThread = LIZJ;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            LIZJ = handlerThread2;
            handlerThread2.start();
            return LIZJ;
        }
    }

    public static C67868QkK LIZ(Context context) {
        synchronized (LIZ) {
            if (LIZIZ == null) {
                LIZIZ = new C67868QkK(C16880lQ.LLLLL(context), context.getMainLooper());
            }
        }
        return LIZIZ;
    }

    public final void LIZJ(String str, String str2, int i, ServiceConnectionC67871QkN serviceConnectionC67871QkN, boolean z) {
        C65428Pm4 c65428Pm4 = new C65428Pm4(str, str2, i, z);
        C67868QkK c67868QkK = (C67868QkK) this;
        synchronized (c67868QkK.LIZLLL) {
            ServiceConnectionC67867QkJ serviceConnectionC67867QkJ = c67868QkK.LIZLLL.get(c65428Pm4);
            if (serviceConnectionC67867QkJ != null) {
                if (((HashMap) serviceConnectionC67867QkJ.LJLIL).containsKey(serviceConnectionC67871QkN)) {
                    ((HashMap) serviceConnectionC67867QkJ.LJLIL).remove(serviceConnectionC67871QkN);
                    if (((HashMap) serviceConnectionC67867QkJ.LJLIL).isEmpty()) {
                        c67868QkK.LJFF.sendMessageDelayed(c67868QkK.LJFF.obtainMessage(0, c65428Pm4), c67868QkK.LJII);
                    }
                } else {
                    String c65428Pm42 = c65428Pm4.toString();
                    StringBuilder sb = new StringBuilder(c65428Pm42.length() + 76);
                    sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb.append(c65428Pm42);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                String c65428Pm43 = c65428Pm4.toString();
                StringBuilder sb2 = new StringBuilder(c65428Pm43.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(c65428Pm43);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
