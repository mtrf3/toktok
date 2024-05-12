package com.bytedance.frameworks.baselib.network.http.retrofit;

import X.C0EM;
import X.C64697PaH;
import X.C64735Pat;
import X.C64789Pbl;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.InterfaceC64715PaZ;
import android.os.SystemClock;
import com.bytedance.retrofit2.client.Request;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class BaseSsInterceptor implements InterfaceC37216Ej6 {
    public void LIZIZ(Request request, C64797Pbt c64797Pbt) {
    }

    public Request LIZ(Request request) {
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        String url = request.getUrl();
        if (request.getExtraInfo() instanceof C64697PaH) {
            request.getExtraInfo();
            C64735Pat.LIZ(url);
        } else {
            C64735Pat.LIZ(url);
        }
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIII = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        if (request.getUrl().startsWith("https:") && url.startsWith("http:")) {
            try {
                URL url2 = new URL(url);
                C64735Pat.LIZJ(url2.getHost(), url2.getPath(), true);
            } catch (Throwable unused) {
            }
        }
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        if (request.isAddCommonParam()) {
            C64789Pbl.LIZ().getClass();
            try {
                InterfaceC64715PaZ interfaceC64715PaZ = C64735Pat.LJI;
                if (interfaceC64715PaZ != null) {
                    url = interfaceC64715PaZ.LIZLLL(url);
                }
            } catch (Throwable unused2) {
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIIJ = SystemClock.uptimeMillis() - valueOf2.longValue();
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ(url);
        return newBuilder.LIZ();
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        try {
            URL url = new URL(request.getUrl());
            if (url.getProtocol().equals("http")) {
                C64735Pat.LIZJ(url.getHost(), url.getPath(), false);
            }
        } catch (MalformedURLException unused) {
        }
        Request LIZ = LIZ(request);
        if (LIZ.getMetrics() != null) {
            ((ConcurrentHashMap) LIZ.getMetrics().LJJIFFI).put("BaseSsInterceptor", C0EM.LIZIZ(valueOf, SystemClock.uptimeMillis()));
        }
        C64797Pbt LIZ2 = f7s.LIZ(LIZ);
        Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
        LIZIZ(LIZ, LIZ2);
        if (LIZ.getMetrics() != null) {
            ((ConcurrentHashMap) LIZ.getMetrics().LJJII).put("BaseSsInterceptor", C0EM.LIZIZ(valueOf2, SystemClock.uptimeMillis()));
        }
        return LIZ2;
    }
}
