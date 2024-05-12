package X;

import Y.ARunnableS42S0100000_6;
import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.ies.actionai.jni.ActionAIHttpClientCallbackDelegate;
import com.bytedance.ies.actionai.jni.ActionAIHttpType;
import com.bytedance.ies.actionai.jni.IActionAIHTTPClientDelegateWrapper;
import com.bytedance.ies.actionai.jni.SWIGTYPE_p_void;
import com.bytedance.ies.actionai.jni.UnorderedMapStrStr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.actionai.net.ActionAINetworkClient;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class EZZ extends IActionAIHTTPClientDelegateWrapper {
    public abstract void LIZIZ(String str, String str2, boolean z, String str3, java.util.Map map, java.util.Map map2, InterfaceC36334ENu interfaceC36334ENu);

    public final void LIZ(String str, ActionAIHttpType actionAIHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, byte[] bArr, String str2, SWIGTYPE_p_void sWIGTYPE_p_void, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate) {
        PVJ pvj;
        java.util.Map<String, String> LJJJLIIL;
        String str3;
        C64797Pbt<TypedInput> execute;
        InputStream in;
        if (str != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair LIZ = EZW.LIZ(str, linkedHashMap);
            String baseUrl = (String) LIZ.first;
            String str4 = (String) LIZ.second;
            InterfaceC36334ENu ytr = new YTR(actionAIHttpType, j, str, actionAIHttpClientCallbackDelegate, sWIGTYPE_p_void);
            if (actionAIHttpType == ActionAIHttpType.HTTP_POST) {
                byte[] bArr2 = null;
                if (str2 == null || bArr == null || bArr.length == 0) {
                    pvj = null;
                } else {
                    pvj = PVP.LIZLLL(C39745Fin.LIZJ(str2), bArr);
                }
                o.LJIIIIZZ(baseUrl, "baseUrl");
                ActionAINetworkClient.ICommonApi LIZJ = ActionAINetworkClient.LIZJ(baseUrl);
                ArrayList arrayList = new ArrayList();
                if (unorderedMapStrStr != null) {
                    for (Map.Entry<String, String> entry : unorderedMapStrStr.entrySet()) {
                        arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
                    }
                }
                Type type = new TypeToken<java.util.Map<String, ? extends String>>() { // from class: X.2Qs
                }.getType();
                o.LJIIIIZZ(type, "object : TypeToken<Map<S…ng?, String?>?>() {}.type");
                if (pvj == null) {
                    LJJJLIIL = C113554cx.LJJJLIIL();
                } else {
                    try {
                        Gson gson = (Gson) ActionAINetworkClient.LIZJ.getValue();
                        try {
                            C64533PUj c64533PUj = new C64533PUj();
                            pvj.LJ(c64533PUj);
                            str3 = c64533PUj.LJIILL();
                        } catch (IOException unused) {
                            str3 = "did not work";
                        }
                        LJJJLIIL = (java.util.Map) GsonProtectorUtils.fromJson(gson, str3, type);
                    } catch (s unused2) {
                        LJJJLIIL = C113554cx.LJJJLIIL();
                    }
                }
                HashMap<String, String> hashMap = new HashMap<>();
                if (!linkedHashMap.isEmpty()) {
                    hashMap.putAll(linkedHashMap);
                }
                C60903NvH.LJIIJJI().getNetworkService().putCommonParams(hashMap, true);
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                o.LJIIIIZZ(curUserId, "userService().curUserId");
                hashMap.put("user_id", curUserId);
                InterfaceC37276Ek4<TypedInput> postBodyMap = LIZJ.postBodyMap(str4, LJJJLIIL, hashMap, arrayList, true);
                if (postBodyMap != null && (execute = postBodyMap.execute()) != null) {
                    if (execute.LIZIZ()) {
                        TypedInput typedInput = execute.LIZIZ;
                        if (typedInput != null && (in = typedInput.in()) != null) {
                            bArr2 = C62848OlY.LJFF(in);
                        }
                        TypedInput typedInput2 = execute.LIZIZ;
                        if (typedInput2 != null) {
                            typedInput2.length();
                        }
                        ytr.LIZ(bArr2);
                        return;
                    }
                    ytr.LIZIZ(execute.LIZ.LIZIZ, null);
                    return;
                }
                return;
            }
            o.LJIIIIZZ(baseUrl, "baseUrl");
            LIZIZ(str, baseUrl, !ujb.s.LJJJLZIJ(baseUrl, "cdn", false), str4, linkedHashMap, unorderedMapStrStr, ytr);
            return;
        }
        throw new NetworkErrorException("url or item is null");
    }

    @Override // com.bytedance.ies.actionai.jni.IActionAIHTTPClientDelegateWrapper
    public final boolean requestNet(String str, ActionAIHttpType actionAIHttpType, long j, UnorderedMapStrStr unorderedMapStrStr, UnorderedMapStrStr unorderedMapStrStr2, String str2, byte[] bArr, SWIGTYPE_p_void sWIGTYPE_p_void, ActionAIHttpClientCallbackDelegate actionAIHttpClientCallbackDelegate) {
        ((ExecutorService) ActionAINetworkClient.LIZLLL.getValue()).submit(new ARunnableS42S0100000_6((Object) new YTQ(this, str, actionAIHttpType, j, unorderedMapStrStr, bArr, str2, sWIGTYPE_p_void, actionAIHttpClientCallbackDelegate), 28));
        return true;
    }
}
