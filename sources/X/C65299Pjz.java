package X;

import android.os.SystemClock;
import com.bytedance.helios.network.NetworkInvoker;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Pjz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65299Pjz {
    public static void LIZIZ(HttpURLConnection urlConnection) {
        o.LJIIIZ(urlConnection, "urlConnection");
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        NetworkInvoker.Companion.getClass();
        Object obj = NetworkInvoker.networkInvoker.preInvoke(400001, "java.net.HttpURLConnection", "onConnect", urlConnection, null, "void", new C65300Pk0()).LIZIZ;
        if (obj instanceof C65902Pti) {
            if (urlConnection instanceof PYW) {
                PYW pyw = (PYW) urlConnection;
                pyw.LJ = (C65902Pti) obj;
                pyw.LJII = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + pyw.LJII;
            } else if (urlConnection instanceof PYV) {
                PYV pyv = (PYV) urlConnection;
                pyv.LJ = (C65902Pti) obj;
                pyv.LJII = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + pyv.LJII;
            }
            C65926Pu6.LIZIZ("HttpURLConnectionWrapper", new AqS161S0100000_11(urlConnection, 94), 2, null, 8);
        }
    }

    public static void LIZ(HttpURLConnection urlConnection, byte[] bArr, C65902Pti c65902Pti) {
        o.LJIIIZ(urlConnection, "urlConnection");
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        NetworkInvoker.Companion.getClass();
        NetworkInvoker networkInvoker = NetworkInvoker.networkInvoker;
        networkInvoker.postInvoke(400001, "java.net.HttpURLConnection", "onConnect", urlConnection, new Object[]{bArr, c65902Pti}, null, new C65300Pk0(), true);
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = 0L;
        if (urlConnection instanceof PYW) {
            PYW pyw = (PYW) urlConnection;
            long elapsedRealtimeNanos2 = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + pyw.LJII;
            pyw.LJII = elapsedRealtimeNanos2;
            c72242sW.element = elapsedRealtimeNanos2;
        } else if (urlConnection instanceof PYV) {
            PYV pyv = (PYV) urlConnection;
            long elapsedRealtimeNanos3 = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + pyv.LJII;
            pyv.LJII = elapsedRealtimeNanos3;
            c72242sW.element = elapsedRealtimeNanos3;
        }
        C65939PuJ.LIZ(c72242sW.element / 1000, "UrlConnection_onConnect");
        networkInvoker.statisticsApiCost(400001, c72242sW.element / 1000000);
        C65926Pu6.LIZIZ("Helios:Network-Cost", new AqS158S0200000_11(c72242sW, c65902Pti, 18), 2, null, 8);
    }
}
