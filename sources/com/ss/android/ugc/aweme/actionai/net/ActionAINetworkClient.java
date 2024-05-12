package com.ss.android.ugc.aweme.actionai.net;

import X.C221108m2;
import X.C36321ENh;
import X.C36335ENv;
import X.C60903NvH;
import X.C62822Ol8;
import X.C62848OlY;
import X.C64797Pbt;
import X.C65083PgV;
import X.E8L;
import X.E8M;
import X.EJ6;
import X.ENX;
import X.EZZ;
import X.HG3;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC36334ENu;
import X.InterfaceC37276Ek4;
import X.PVJ;
import X.PVP;
import X.RBX;
import com.bytedance.ies.actionai.jni.UnorderedMapStrStr;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAINetworkClient extends EZZ {
    public static final ActionAINetworkClient LIZ = new ActionAINetworkClient();
    public static final ConcurrentHashMap<String, ICommonApi> LIZIZ = new ConcurrentHashMap<>();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C36321ENh.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C36335ENv.INSTANCE);

    /* loaded from: classes7.dex */
    public interface ICommonApi {
        @ENX
        @E8L
        InterfaceC37276Ek4<TypedInput> get(@InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC30951CCt boolean z);

        @ENX
        @E8M
        InterfaceC37276Ek4<TypedInput> postBodyData(@InterfaceC195747mE String str, @InterfaceC195727mC PVP pvp, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list, @InterfaceC30951CCt boolean z);

        @ENX
        @E8M
        InterfaceC37276Ek4<TypedInput> postBodyMap(@InterfaceC195747mE String str, @InterfaceC195727mC Map<String, String> map, @InterfaceC36228EJs(encode = true) Map<String, String> map2, @InterfaceC195767mG List<EJ6> list, @InterfaceC30951CCt boolean z);
    }

    public static ICommonApi LIZJ(String str) {
        ConcurrentHashMap<String, ICommonApi> concurrentHashMap = LIZIZ;
        ICommonApi iCommonApi = concurrentHashMap.get(str);
        if (iCommonApi == null) {
            ICommonApi api = (ICommonApi) C65083PgV.LJIIIIZZ(ICommonApi.class, str);
            o.LJIIIIZZ(api, "api");
            concurrentHashMap.put(str, api);
            return api;
        }
        return iCommonApi;
    }

    public static void LIZLLL(String str, String str2, PVJ pvj, Map map, UnorderedMapStrStr unorderedMapStrStr, InterfaceC36334ENu interfaceC36334ENu) {
        C64797Pbt<TypedInput> execute;
        InputStream in;
        ICommonApi LIZJ2 = LIZJ(str);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : unorderedMapStrStr.entrySet()) {
            arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.putAll(map);
        C60903NvH.LJIIJJI().getNetworkService().putCommonParams(hashMap, true);
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        hashMap.put("user_id", curUserId);
        InterfaceC37276Ek4<TypedInput> postBodyData = LIZJ2.postBodyData(str2, pvj, hashMap, arrayList, true);
        if (postBodyData != null && (execute = postBodyData.execute()) != null) {
            byte[] bArr = null;
            if (execute.LIZIZ()) {
                TypedInput typedInput = execute.LIZIZ;
                if (typedInput != null && (in = typedInput.in()) != null) {
                    bArr = C62848OlY.LJFF(in);
                }
                TypedInput typedInput2 = execute.LIZIZ;
                if (typedInput2 != null) {
                    typedInput2.length();
                }
                interfaceC36334ENu.LIZ(bArr);
                return;
            }
            interfaceC36334ENu.LIZIZ(execute.LIZ.LIZIZ, null);
        }
    }

    @Override // X.EZZ
    public final void LIZIZ(String originUrl, String str, boolean z, String str2, Map map, Map map2, InterfaceC36334ENu interfaceC36334ENu) {
        C64797Pbt<TypedInput> execute;
        InputStream in;
        o.LJIIIZ(originUrl, "originUrl");
        ICommonApi LIZJ2 = LIZJ(str);
        ArrayList arrayList = new ArrayList();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.putAll(map);
        if (z) {
            C60903NvH.LJIIJJI().getNetworkService().putCommonParams(hashMap, true);
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            hashMap.put("user_id", curUserId);
        }
        InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4 = LIZJ2.get(str2, hashMap, arrayList, z);
        if (interfaceC37276Ek4 != null && (execute = interfaceC37276Ek4.execute()) != null) {
            byte[] bArr = null;
            if (execute.LIZIZ()) {
                TypedInput typedInput = execute.LIZIZ;
                if (typedInput != null && (in = typedInput.in()) != null) {
                    bArr = C62848OlY.LJFF(in);
                }
                TypedInput typedInput2 = execute.LIZIZ;
                if (typedInput2 != null) {
                    typedInput2.length();
                }
                interfaceC36334ENu.LIZ(bArr);
                return;
            }
            interfaceC36334ENu.LIZIZ(execute.LIZ.LIZIZ, null);
        }
    }
}
