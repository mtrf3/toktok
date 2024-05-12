package X;

import Y.AfS64S0200000_15;
import Y.AfS67S0100000_15;
import com.bytedance.android.livesdk.client.IMessageApi;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class YMC implements IMessageWsClient {
    public final IMessageApi LIZ = (IMessageApi) Q7L.LIZIZ(IMessageApi.class);
    public final String LIZIZ = "AbsMessageClient";

    public static String LIZ(C36910EeA c36910EeA) {
        EJ6 ej6;
        String str;
        List<EJ6> list = c36910EeA.LIZLLL;
        if (list != null) {
            Iterator<EJ6> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    ej6 = it.next();
                    if (o.LJ("x-tt-logid", ej6.LIZ)) {
                        break;
                    }
                } else {
                    ej6 = null;
                    break;
                }
            }
            EJ6 ej62 = ej6;
            if (ej62 != null && (str = ej62.LIZIZ) != null) {
                return str;
            }
        }
        return "";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final XM9<YME, Exception> executeMessagePost(C64972Pei request) {
        o.LJIIIZ(request, "request");
        try {
            HashMap hashMap = new HashMap();
            java.util.Map<String, String> map = request.LJII;
            if (map != null) {
                hashMap.putAll(map);
            }
            IMessageApi iMessageApi = this.LIZ;
            String str = request.LIZIZ;
            o.LJIIIIZZ(str, "request.url");
            java.util.Map<String, String> map2 = request.LIZJ;
            if (map2 == null) {
                map2 = new HashMap<>();
            }
            java.util.Map<String, String> map3 = request.LIZLLL;
            if (map3 == null) {
                map3 = new HashMap<>();
            }
            C36910EeA c36910EeA = iMessageApi.doPost(str, map2, map3, hashMap).execute().LIZ;
            if (c36910EeA.LIZJ()) {
                TypedInput typedInput = c36910EeA.LJ;
                o.LJII(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
                byte[] bytes = ((TypedByteArray) typedInput).getBytes();
                List<EJ6> list = c36910EeA.LIZLLL;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                for (EJ6 ej6 : list) {
                    arrayList.add(new C87247YLz(ej6.LIZ, ej6.LIZIZ));
                }
                YMH ymh = new YMH();
                int i = c36910EeA.LIZIZ;
                YME yme = ymh.LIZ;
                yme.LIZ = i;
                yme.LIZIZ = c36910EeA.LIZJ;
                yme.LIZJ = arrayList;
                yme.LIZLLL = bytes;
                return new XMB(yme);
            }
            String LIZ = LIZ(c36910EeA);
            String str2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("http post response failed, code: ");
            LIZ2.append(c36910EeA.LIZIZ);
            LIZ2.append(". logId: ");
            LIZ2.append(LIZ);
            C0NB.LJ(str2, X1D.LIZIZ(LIZ2));
            String str3 = this.LIZIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("status: ");
            LIZ3.append(c36910EeA.LIZIZ);
            LIZ3.append(", response: ");
            LIZ3.append(LIZ(c36910EeA));
            C0NB.LJ(str3, X1D.LIZIZ(LIZ3));
            return new XM8(new Exception("response failed"));
        } catch (Exception unused) {
            return new XM8(new Exception("http exception"));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient, X.YMT
    public final void get(C64972Pei request, YMF callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        IMessageApi iMessageApi = this.LIZ;
        String str = request.LIZIZ;
        o.LJIIIIZZ(str, "request.url");
        java.util.Map<String, String> map = request.LIZJ;
        if (map == null) {
            map = new HashMap<>();
        }
        java.util.Map<String, String> map2 = request.LIZLLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        C1EW.LIZ(iMessageApi.doGetAsync(str, map, map2)).LJJJLIIL(new AfS64S0200000_15(this, callback, 9), new AfS67S0100000_15(callback, 72));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient, X.YMT
    public final void post(C64972Pei request, YMF callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        TypedByteArray typedByteArray = new TypedByteArray(request.LJI, request.LIZ(), new String[0]);
        IMessageApi iMessageApi = this.LIZ;
        String str = request.LIZIZ;
        o.LJIIIIZZ(str, "request.url");
        java.util.Map<String, String> map = request.LIZJ;
        if (map == null) {
            map = new HashMap<>();
        }
        java.util.Map<String, String> map2 = request.LIZLLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        C1EW.LIZ(iMessageApi.doPostAsync(str, map, map2, typedByteArray)).LJJJLIIL(new AfS64S0200000_15(this, callback, 10), new AfS67S0100000_15(callback, 73));
    }
}
