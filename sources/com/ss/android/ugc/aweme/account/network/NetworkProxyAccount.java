package com.ss.android.ugc.aweme.account.network;

import X.AbstractC73745Swv;
import X.C1HQ;
import X.C221108m2;
import X.C32I;
import X.C38281F0r;
import X.C38333F2r;
import X.C58725N2z;
import X.C61878OQg;
import X.C62822Ol8;
import X.C64797Pbt;
import X.C66619QCp;
import X.C66967QPz;
import X.C67621QgL;
import X.C73748Swy;
import X.EJ6;
import X.ENW;
import X.HH1;
import X.IKX;
import X.IKY;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC36229EJt;
import X.InterfaceC36484ETo;
import X.JBR;
import X.ORZ;
import X.QQ2;
import X.QQB;
import X.QQC;
import X.T16;
import X.X1D;
import Y.IDhS99S0100000_6;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NetworkProxyAccount implements QQC {
    public static final NetworkProxyAccount LIZ = new NetworkProxyAccount();
    public static final String LIZIZ = "https://api-va.tiktokv.com";
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(QQB.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(IKY.LJLIL);

    public final Gson LJIIJJI() {
        InterfaceC36484ETo interfaceC36484ETo = C58725N2z.LIZIZ;
        if (interfaceC36484ETo != null) {
            return interfaceC36484ETo.LIZ();
        }
        o.LJIJI("sNetworkApi");
        throw null;
    }

    public static List LIZIZ(List list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66967QPz c66967QPz = (C66967QPz) it.next();
            arrayList.add(new EJ6(c66967QPz.LIZ, c66967QPz.LIZIZ));
        }
        return ORZ.LLJILJILJ(arrayList);
    }

    public final String LJ(String url) {
        o.LJIIIZ(url, "url");
        String str = LIZJ(url, new ArrayList()).LIZIZ;
        o.LJIIIIZZ(str, "executeGet(maxLength, url, arrayListOf()).body");
        return str;
    }

    public final String LJFF(String url) {
        o.LJIIIZ(url, "url");
        try {
            String str = sendGetRequest(url, Integer.MAX_VALUE, null).LIZIZ;
            o.LJIIIIZZ(str, "{\n            val respon…  response.body\n        }");
            return str;
        } catch (C38333F2r e) {
            String response = e.getResponse();
            o.LJIIIIZZ(response, "{\n            // 如果底层处理了…     e.response\n        }");
            return response;
        }
    }

    public static String LIZ(String str, Map map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        Uri parse = UriProtector.parse(str);
        Uri.Builder clearQuery = UriProtector.parse(str).buildUpon().clearQuery();
        for (Map.Entry entry : map.entrySet()) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Uri build = clearQuery.build();
        for (String str2 : UriProtector.getQueryParameterNames(parse)) {
            if (TextUtils.isEmpty(UriProtector.getQueryParameter(build, str2))) {
                clearQuery.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
            }
        }
        String uri = clearQuery.build().toString();
        o.LJIIIIZZ(uri, "newUriBuilder.build().toString()");
        return uri;
    }

    public static C73748Swy LJII(String str, Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        return AbstractC73745Swv.LJFF(new C38281F0r(JBR.LJFF(LIZ2, "api-va.tiktokv.com", str, LIZ2)).LJ()).LIZJ(new IDhS99S0100000_6(map, 7)).LJIILJJIL(T16.LIZ());
    }

    public final QQ2 LIZJ(String url, List list) {
        o.LJIIIZ(url, "url");
        try {
            QQ2 sendGetRequest = sendGetRequest(url, Integer.MAX_VALUE, list);
            C1HQ LJIIL = LJIIL(url, sendGetRequest, null);
            if (!LJIIL.isEmpty()) {
                return LIZJ(LIZ(url, LJIIL), list);
            }
            return sendGetRequest;
        } catch (C38333F2r e) {
            return new QQ2(e.getResponse(), list);
        }
    }

    public final C73748Swy LIZLLL(String str, Map map) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        C38281F0r c38281F0r = new C38281F0r(JBR.LJFF(LIZ2, "api-va.tiktokv.com", str, LIZ2));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c38281F0r.LIZLLL((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String LJ = c38281F0r.LJ();
        o.LJIIIIZZ(LJ, "build()");
        return AbstractC73745Swv.LJFF(LJ).LIZJ(C67621QgL.LJLIL).LJIILJJIL(T16.LIZ());
    }

    public final String LJIIIIZZ(String url, Map postParams) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(postParams, "postParams");
        String str = LJI(url, postParams, new ArrayList()).LIZIZ;
        o.LJIIIIZZ(str, "executePost(maxLength, u…rams, arrayListOf()).body");
        return str;
    }

    public final String LJIIJ(String url, Map map) {
        o.LJIIIZ(url, "url");
        try {
            String str = sendPostRequest(url, map, Integer.MAX_VALUE, null).LIZIZ;
            o.LJIIIIZZ(str, "{\n            sendPostRe…maxLength).body\n        }");
            return str;
        } catch (C38333F2r e) {
            String response = e.getResponse();
            o.LJIIIIZZ(response, "e.response");
            return response;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (r12 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.1HQ] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0MA, X.1HQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1HQ LJIIL(java.lang.String r15, X.QQ2 r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount.LJIIL(java.lang.String, X.QQ2, java.util.Map):X.1HQ");
    }

    private final QQ2 sendGetRequest(@InterfaceC195747mE String str, @ENW int i, @InterfaceC195767mG List<C66967QPz> list) {
        List<EJ6> arrayList;
        List list2;
        LIZ(str, ((IKX) LIZLLL.getValue()).LIZ());
        if (list != null && (!list.isEmpty())) {
            arrayList = LIZIZ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        C64797Pbt<String> execute = ((IAccountNetworkApi) LIZJ.getValue()).getResponse(str, i, arrayList).execute();
        List<EJ6> list3 = execute.LIZ.LIZLLL;
        if (list3 != null && list3.size() > 0) {
            List LJLL = ORZ.LJLL(list3);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJLL, 10));
            Iterator it = ((ArrayList) LJLL).iterator();
            while (it.hasNext()) {
                EJ6 ej6 = (EJ6) it.next();
                arrayList2.add(new C66967QPz(ej6.LIZ, ej6.LIZIZ));
            }
            list2 = ORZ.LLJILJILJ(arrayList2);
        } else {
            list2 = C61878OQg.INSTANCE;
        }
        return new QQ2(execute.LIZIZ, list2);
    }

    public final QQ2 LJI(String url, Map postParams, List list) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(postParams, "postParams");
        try {
            QQ2 sendPostRequest = sendPostRequest(url, postParams, Integer.MAX_VALUE, list);
            C1HQ LJIIL = LJIIL(url, sendPostRequest, postParams);
            if (!LJIIL.isEmpty()) {
                HashMap hashMap = new HashMap(postParams);
                hashMap.putAll(LJIIL);
                return LJI(url, hashMap, list);
            }
            return sendPostRequest;
        } catch (C38333F2r e) {
            return new QQ2(e.getResponse(), list);
        }
    }

    private final QQ2 sendPostRequest(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map, @ENW int i, @InterfaceC195767mG List<C66967QPz> list) {
        List<EJ6> arrayList;
        List list2;
        Map<String, String> LIZ2 = ((IKX) LIZLLL.getValue()).LIZ();
        LIZ2.putAll(map);
        if (list != null && (!list.isEmpty())) {
            arrayList = LIZIZ(list);
        } else {
            arrayList = new ArrayList<>();
        }
        C64797Pbt<String> execute = ((IAccountNetworkApi) LIZJ.getValue()).getResponse(str, LIZ2, i, arrayList).execute();
        List<EJ6> list3 = execute.LIZ.LIZLLL;
        if (list3 != null && list3.size() > 0) {
            List LJLL = ORZ.LJLL(list3);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJLL, 10));
            Iterator it = ((ArrayList) LJLL).iterator();
            while (it.hasNext()) {
                EJ6 ej6 = (EJ6) it.next();
                arrayList2.add(new C66967QPz(ej6.LIZ, ej6.LIZIZ));
            }
            list2 = ORZ.LLJILJILJ(arrayList2);
        } else {
            list2 = C61878OQg.INSTANCE;
        }
        return new QQ2(execute.LIZIZ, list2);
    }

    public final <T> T LJIIIZ(String str, int i, String str2, Class<T> cls, String str3, List<? extends C66619QCp> list) {
        HH1.LIZ(str, "url", str2, "path", str3, "key");
        InterfaceC36484ETo interfaceC36484ETo = C58725N2z.LIZIZ;
        if (interfaceC36484ETo != null) {
            return (T) interfaceC36484ETo.LJFF(str, i, str2, cls, str3, list);
        }
        o.LJIJI("sNetworkApi");
        throw null;
    }
}
