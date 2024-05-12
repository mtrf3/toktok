package X;

import android.os.SystemClock;
import com.bytedance.helios.network.NetworkInvoker;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;
import okhttp3.Request;

/* renamed from: X.Pjy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65298Pjy implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        C64709PaT c64709PaT;
        Object obj;
        Request request;
        C65901Pth c65901Pth;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = 0L;
        NetworkInvoker.Companion.getClass();
        NetworkInvoker networkInvoker = NetworkInvoker.networkInvoker;
        C39519Ff9 preInvoke = networkInvoker.preInvoke(400101, "okhttp3.Interceptor", "intercept", this, new Object[]{pxz}, "okhttp3.Response", new C65300Pk0());
        C65902Pti c65902Pti = (C65902Pti) preInvoke.LIZIZ;
        if (c65902Pti != null && (c65901Pth = c65902Pti.LJLIL) != null) {
            c64709PaT = c65901Pth.LJZI;
            if (c64709PaT != null) {
                obj = c64709PaT.LJLJJL;
                if (!preInvoke.LIZ && (obj instanceof C64598PWw)) {
                    try {
                        C64618PXq newBuilder = ((PW8) pxz).LJFF.newBuilder();
                        newBuilder.LJII("https:127.0.0.1");
                        C3C5.m7constructorimpl(((PW8) pxz).LIZ(newBuilder.LIZIZ()));
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    return (C64598PWw) obj;
                }
                if (c64709PaT == null && c64709PaT.LJLJI && (obj instanceof Request)) {
                    request = (Request) obj;
                } else {
                    request = ((PW8) pxz).LJFF;
                }
                c72242sW.element = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + c72242sW.element;
                C64598PWw response = ((PW8) pxz).LIZ(request);
                long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                o.LJIIIIZZ(response, "response");
                networkInvoker.postInvoke(400101, "okhttp3.Interceptor", "intercept", this, new Object[]{pxz, response, c65902Pti}, response, new C65300Pk0(), true);
                long elapsedRealtimeNanos3 = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos2) + c72242sW.element;
                c72242sW.element = elapsedRealtimeNanos3;
                C65939PuJ.LIZ(elapsedRealtimeNanos3 / 1000, "OkHttp_intercept");
                networkInvoker.statisticsApiCost(400101, c72242sW.element / 1000000);
                C65926Pu6.LIZIZ("Helios:Network-Cost", new AqS158S0200000_11(c72242sW, c65902Pti, 11), 2, null, 8);
                return response;
            }
        } else {
            c64709PaT = null;
        }
        obj = null;
        if (!preInvoke.LIZ) {
        }
        if (c64709PaT == null) {
        }
        request = ((PW8) pxz).LJFF;
        c72242sW.element = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) + c72242sW.element;
        C64598PWw response2 = ((PW8) pxz).LIZ(request);
        long elapsedRealtimeNanos22 = SystemClock.elapsedRealtimeNanos();
        o.LJIIIIZZ(response2, "response");
        networkInvoker.postInvoke(400101, "okhttp3.Interceptor", "intercept", this, new Object[]{pxz, response2, c65902Pti}, response2, new C65300Pk0(), true);
        long elapsedRealtimeNanos32 = (SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos22) + c72242sW.element;
        c72242sW.element = elapsedRealtimeNanos32;
        C65939PuJ.LIZ(elapsedRealtimeNanos32 / 1000, "OkHttp_intercept");
        networkInvoker.statisticsApiCost(400101, c72242sW.element / 1000000);
        C65926Pu6.LIZIZ("Helios:Network-Cost", new AqS158S0200000_11(c72242sW, c65902Pti, 11), 2, null, 8);
        return response2;
    }
}
