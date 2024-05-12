package com.ss.android.ugc.aweme.common;

import X.C16880lQ;
import X.C64797Pbt;
import X.E8L;
import X.E8M;
import X.ENW;
import X.ENX;
import X.EZX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36395EQd;
import X.InterfaceC37276Ek4;
import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NaviEffectNetworkerImpl implements IEffectNetWorker {

    /* loaded from: classes7.dex */
    public interface EffectNetworkAPI {
        @ENX
        @E8L
        InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) LinkedHashMap<String, String> linkedHashMap);

        @ENX
        @E8M
        InterfaceC37276Ek4<TypedInput> doPost(@InterfaceC30951CCt boolean z, @ENW int i, @InterfaceC195747mE String str, @InterfaceC195727mC Map<String, ? extends Object> map);
    }

    public static InputStream LIZ(EffectRequest effectRequest) {
        C64797Pbt<TypedInput> execute;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        InputStream inputStream = null;
        try {
            Pair<String, String> LIZJ = EZX.LIZJ(effectRequest.getUrl(), linkedHashMap);
            String baseUrl = (String) LIZJ.first;
            String str = (String) LIZJ.second;
            boolean isUseCommonParams = effectRequest.isUseCommonParams();
            InterfaceC36395EQd networkService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService();
            o.LJIIIIZZ(baseUrl, "baseUrl");
            EffectNetworkAPI effectNetworkAPI = (EffectNetworkAPI) networkService.createRetrofit(baseUrl, isUseCommonParams, EffectNetworkAPI.class);
            if (isUseCommonParams) {
                linkedHashMap.put("game_version", "1.0");
            }
            if (o.LJ("POST", effectRequest.getHttpMethod())) {
                InterfaceC37276Ek4<TypedInput> doPost = effectNetworkAPI.doPost(isUseCommonParams, Integer.MAX_VALUE, str, effectRequest.getParams());
                o.LJI(doPost);
                execute = doPost.execute();
                o.LJIIIIZZ(execute, "{\n                mEffec…!.execute()\n            }");
            } else {
                InterfaceC37276Ek4<TypedInput> doGet = effectNetworkAPI.doGet(isUseCommonParams, Integer.MAX_VALUE, str, linkedHashMap);
                o.LJI(doGet);
                execute = doGet.execute();
                o.LJIIIIZZ(execute, "{\n                mEffec…!.execute()\n            }");
            }
            if (!execute.LIZIZ()) {
                return null;
            }
            inputStream = execute.LIZIZ.in();
            effectRequest.setContentLength(execute.LIZIZ.length());
            return inputStream;
        } catch (IOException e) {
            effectRequest.setErrorMsg(e.getMessage());
            return inputStream;
        } catch (Exception e2) {
            effectRequest.setErrorMsg(e2.getMessage());
            return inputStream;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker
    public final InputStream execute(EffectRequest effectRequest) {
        InputStream inputStream = null;
        if (effectRequest == null) {
            return null;
        }
        try {
            inputStream = LIZ(effectRequest);
            return inputStream;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return inputStream;
        }
    }
}
