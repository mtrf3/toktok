package com.bytedance.android.live.broadcast.mirror;

import X.C16880lQ;
import X.C39745Fin;
import X.C64797Pbt;
import X.C65083PgV;
import X.E8L;
import X.E8M;
import X.EJ6;
import X.FP1;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC30951CCt;
import X.InterfaceC30952CCu;
import X.InterfaceC37276Ek4;
import X.PVP;
import com.byted.cast.common.api.IHttpNetWork;
import com.byted.cast.common.api.Response;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class TTHttpNetImpl implements IHttpNetWork {
    public final ByteCastNetService LIZ = (ByteCastNetService) C65083PgV.LJIIL("https://bytecast.tiktokv.com/").LIZ(ByteCastNetService.class);

    /* loaded from: classes.dex */
    public interface ByteCastNetService {
        @E8L
        InterfaceC37276Ek4<String> get(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC30951CCt boolean z);

        @E8M
        InterfaceC37276Ek4<String> post(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195727mC PVP pvp, @InterfaceC30951CCt boolean z);
    }

    public final String LIZ(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                return sb.toString().trim();
            }
        }
    }

    @Override // com.byted.cast.common.api.IHttpNetWork
    public final Response doGet(String str, Map<String, String> map) {
        String LIZ;
        FP1.LJFF("doGet:", str, C16880lQ.LJLLJ(TTHttpNetImpl.class));
        ByteCastNetService byteCastNetService = this.LIZ;
        if (map == null) {
            map = Collections.emptyMap();
        }
        InterfaceC37276Ek4<String> interfaceC37276Ek4 = byteCastNetService.get(str, map, true);
        try {
            C64797Pbt<String> execute = interfaceC37276Ek4.execute();
            HashMap hashMap = new HashMap();
            for (EJ6 ej6 : execute.LIZ.LIZLLL) {
                hashMap.put(ej6.LIZ, ej6.LIZIZ);
            }
            if (execute.LIZIZ()) {
                LIZ = execute.LIZIZ;
            } else {
                LIZ = LIZ(execute.LIZJ.in());
            }
            Response response = new Response(hashMap, LIZ, execute.LIZ.LIZIZ, "");
            interfaceC37276Ek4.cancel();
            return response;
        } catch (Throwable th) {
            if (interfaceC37276Ek4 != null) {
                interfaceC37276Ek4.cancel();
            }
            throw th;
        }
    }

    @Override // com.byted.cast.common.api.IHttpNetWork
    public final Response doPost(String str, String str2, Map<String, String> map) {
        String LIZ;
        FP1.LJFF("doPost:", str, C16880lQ.LJLLJ(TTHttpNetImpl.class));
        ByteCastNetService byteCastNetService = this.LIZ;
        if (map == null) {
            map = Collections.emptyMap();
        }
        InterfaceC37276Ek4<String> post = byteCastNetService.post(str, map, PVP.LIZJ(C39745Fin.LIZJ("application/json"), str2), true);
        try {
            C64797Pbt<String> execute = post.execute();
            HashMap hashMap = new HashMap();
            for (EJ6 ej6 : execute.LIZ.LIZLLL) {
                hashMap.put(ej6.LIZ, ej6.LIZIZ);
            }
            if (execute.LIZIZ()) {
                LIZ = execute.LIZIZ;
            } else {
                LIZ = LIZ(execute.LIZJ.in());
            }
            Response response = new Response(hashMap, LIZ, execute.LIZ.LIZIZ, "");
            post.cancel();
            return response;
        } catch (Throwable th) {
            if (post != null) {
                post.cancel();
            }
            throw th;
        }
    }
}
