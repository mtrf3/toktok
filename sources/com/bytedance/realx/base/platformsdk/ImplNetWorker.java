package com.bytedance.realx.base.platformsdk;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C39745Fin;
import X.C64587PWl;
import X.C64598PWw;
import X.C64600PWy;
import X.C64601PWz;
import X.C64605PXd;
import X.C64606PXe;
import X.C64618PXq;
import X.C65300Pk0;
import X.InterfaceC48133Iun;
import X.PVM;
import X.PVP;
import X.X1D;
import android.accounts.NetworkErrorException;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Request;

/* loaded from: classes33.dex */
public class ImplNetWorker implements IEffectNetWorker {
    public C64601PWz mDownloadBuilder;

    public static C64598PWw com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute(InterfaceC48133Iun interfaceC48133Iun) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", interfaceC48133Iun, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "14034232948339324"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : interfaceC48133Iun.execute();
    }

    public static C64600PWy com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_OkHttpClient$Builder_build(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "14034232948339324"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    private InputStream request(EffectRequest effectRequest) {
        PVM pvm;
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(effectRequest.getUrl());
        if (!effectRequest.getHeaders().isEmpty()) {
            c64618PXq.LIZJ = setHeaders(effectRequest.getHeaders()).LJI();
        }
        if (effectRequest.getHttpMethod().equals("GET")) {
            c64618PXq.LJ("GET", null);
        } else if (!effectRequest.getParams().isEmpty()) {
            c64618PXq.LJ(effectRequest.getHttpMethod(), setRequestBody(effectRequest.getContentType(), effectRequest.getParams()));
        }
        Request LIZIZ = c64618PXq.LIZIZ();
        if (this.mDownloadBuilder == null) {
            this.mDownloadBuilder = new C64601PWz();
        }
        C64600PWy com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_OkHttpClient$Builder_build = com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_OkHttpClient$Builder_build(this.mDownloadBuilder);
        com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_OkHttpClient$Builder_build.getClass();
        C64598PWw com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute = com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute(C64587PWl.LIZJ(com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_OkHttpClient$Builder_build, LIZIZ, false));
        if (com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute.LJLJI == 200 && (pvm = com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute.LJLJL) != null) {
            effectRequest.setContentLength(pvm.contentLength());
            return com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute.LJLJL.byteStream();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Http response code:");
        LIZ.append(com_bytedance_realx_base_platformsdk_ImplNetWorker_okhttp3_Call_execute.LJLJI);
        throw new NetworkErrorException(X1D.LIZIZ(LIZ));
    }

    private C64606PXe setHeaders(Map<String, String> map) {
        C64605PXd c64605PXd = new C64605PXd();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c64605PXd.LIZ(entry.getKey(), entry.getValue());
            }
        }
        return new C64606PXe(c64605PXd);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public InputStream execute(EffectRequest effectRequest) {
        try {
            return request(effectRequest);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    private PVP setRequestBody(String str, Map<String, Object> map) {
        return PVP.LIZJ(C39745Fin.LIZJ(str), GsonProtectorUtils.toJson(new Gson(), map));
    }
}
