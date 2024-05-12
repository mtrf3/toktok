package com.bytedance.frameworks.baselib.network.http.retrofit;

import X.C0EM;
import X.C64735Pat;
import X.C64738Paw;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.InterfaceC64715PaZ;
import android.os.SystemClock;
import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class RequestVertifyInterceptor implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        C64738Paw c64738Paw = f7s.LJFF;
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request request = f7s.LIZJ;
        if (request != null && !request.isResponseStreaming()) {
            try {
                String url = request.getUrl();
                Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
                request.isAddCommonParam();
                Object[] objArr = {request.getBody()};
                InterfaceC64715PaZ interfaceC64715PaZ = C64735Pat.LJI;
                if (interfaceC64715PaZ != null) {
                    interfaceC64715PaZ.LIZJ(url, objArr);
                }
                if (request.getMetrics() != null) {
                    request.getMetrics().LJJIIJZLJL = SystemClock.uptimeMillis() - valueOf2.longValue();
                }
                C64908Pdg newBuilder = request.newBuilder();
                newBuilder.LIZJ(url);
                request = newBuilder.LIZ();
            } catch (Throwable unused) {
            }
        }
        if (c64738Paw != null) {
            ((ConcurrentHashMap) c64738Paw.LJJIFFI).put("RequestVerifyInterceptor", C0EM.LIZIZ(valueOf, SystemClock.uptimeMillis()));
        }
        return f7s.LIZ(request);
    }
}
