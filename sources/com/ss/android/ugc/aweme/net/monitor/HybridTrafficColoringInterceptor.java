package com.ss.android.ugc.aweme.net.monitor;

import X.C113554cx;
import X.C141335gf;
import X.C37999Evj;
import X.C39489Fef;
import X.C3C5;
import X.C64797Pbt;
import X.C64908Pdg;
import X.EJ6;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class HybridTrafficColoringInterceptor implements InterfaceC37216Ej6 {
    public static final C37999Evj LJLIL = new C37999Evj();

    public static String LIZ(String str) {
        Object LIZ;
        try {
            LIZ = UriProtector.parse(str).buildUpon().clearQuery().toString();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        if (str2 == null) {
            return str;
        }
        return str2;
    }

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        Object obj;
        Object obj2;
        C39489Fef c39489Fef;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        Request request2 = null;
        String str = null;
        String str2 = null;
        Object obj3 = null;
        if (request != null) {
            IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
            if (LJIILIIL != null && (c39489Fef = (C39489Fef) LJIILIIL.LJIIL(C39489Fef.class)) != null) {
                Map<String, Object> map = request.getMetrics().LJJJLL;
                o.LJIIIIZZ(map, "metrics.bizExtraInfo");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str3 = c39489Fef.LJLJLLL;
                if (str3 != null) {
                    str = LIZ(str3);
                }
                linkedHashMap.put("webview_url", str);
                if (o.LJ("H5", c39489Fef.LJLZ)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("webview://jsb/");
                    LIZ.append(c39489Fef.LJLILLLLZI);
                    linkedHashMap.put("webview_channel", X1D.LIZIZ(LIZ));
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("lynxview://jsb/");
                    LIZ2.append(c39489Fef.LJLILLLLZI);
                    linkedHashMap.put("webview_channel", X1D.LIZIZ(LIZ2));
                }
                ((HashMap) map).put("pns_hybrid", linkedHashMap);
            } else {
                EJ6 firstHeader = request.getFirstHeader("X-TT-Hybrid-UA");
                if (firstHeader != null) {
                    SystemClock.uptimeMillis();
                    List<EJ6> headers = request.getHeaders();
                    o.LJIIIIZZ(headers, "request.headers");
                    List<EJ6> LLJILJILJ = ORZ.LLJILJILJ(headers);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("webview_channel", firstHeader.LIZIZ);
                    ArrayList arrayList = (ArrayList) LLJILJILJ;
                    arrayList.remove(firstHeader);
                    EJ6 firstHeader2 = request.getFirstHeader("X-TT-Hybrid-Referer");
                    if (firstHeader2 != null) {
                        String str4 = firstHeader2.LIZIZ;
                        if (str4 != null) {
                            str2 = LIZ(str4);
                        }
                        linkedHashMap2.put("webview_url", str2);
                        arrayList.remove(firstHeader2);
                    }
                    C64908Pdg newBuilder = request.newBuilder();
                    newBuilder.LIZJ = LLJILJILJ;
                    request = newBuilder.LIZ();
                    Map<String, Object> map2 = request.getMetrics().LJJJLL;
                    o.LJIIIIZZ(map2, "metrics.bizExtraInfo");
                    ((HashMap) map2).put("pns_hybrid", linkedHashMap2);
                } else if (request.getUrl() != null) {
                    String url = request.getUrl();
                    o.LJIIIIZZ(url, "request.url");
                    if (s.LJJJLZIJ(url, "__hybrid_ua", false)) {
                        SystemClock.uptimeMillis();
                        try {
                            Uri parse = UriProtector.parse(request.getUrl());
                            if (parse != null) {
                                OSZ LIZIZ = LIZIZ(parse, "__hybrid_ua", "__hybrid_referer");
                                Uri uri = (Uri) LIZIZ.getFirst();
                                Map map3 = (Map) LIZIZ.getSecond();
                                C64908Pdg newBuilder2 = request.newBuilder();
                                newBuilder2.LIZJ(uri.toString());
                                Request LIZ3 = newBuilder2.LIZ();
                                Map<String, Object> map4 = LIZ3.getMetrics().LJJJLL;
                                o.LJIIIIZZ(map4, "metrics.bizExtraInfo");
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                String str5 = (String) map3.get("__hybrid_ua");
                                if (str5 != null) {
                                    linkedHashMap3.put("webview_channel", str5);
                                }
                                String str6 = (String) map3.get("__hybrid_referer");
                                if (str6 != null) {
                                    linkedHashMap3.put("webview_url", LIZ(str6));
                                }
                                ((HashMap) map4).put("pns_hybrid", linkedHashMap3);
                                obj2 = LIZ3;
                            } else {
                                obj2 = null;
                            }
                            C3C5.m7constructorimpl(obj2);
                            obj = obj2;
                        } catch (Throwable th) {
                            Object LIZ4 = C141335gf.LIZ(th);
                            C3C5.m7constructorimpl(LIZ4);
                            obj = LIZ4;
                        }
                        if (!C3C5.m12isFailureimpl(obj)) {
                            obj3 = obj;
                        }
                        Request request3 = (Request) obj3;
                        if (request3 != null) {
                            request = request3;
                        }
                    }
                }
            }
            request2 = request;
        }
        return f7s.LIZ(request2);
    }

    public static OSZ LIZIZ(Uri uri, String... strArr) {
        if (!uri.isHierarchical()) {
            return new OSZ(uri, C113554cx.LJJJLIIL());
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        o.LJIIIIZZ(clearQuery, "this.buildUpon().clearQuery()");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String key : UriProtector.getQueryParameterNames(uri)) {
            if (ORY.LJJIJIIJIL(key, strArr)) {
                String queryParameter = UriProtector.getQueryParameter(uri, key);
                if (queryParameter != null) {
                    o.LJIIIIZZ(key, "key");
                    linkedHashMap.put(key, queryParameter);
                }
            } else {
                Iterator<String> it = UriProtector.getQueryParameters(uri, key).iterator();
                while (it.hasNext()) {
                    clearQuery.appendQueryParameter(key, it.next());
                }
            }
        }
        return new OSZ(clearQuery.build(), linkedHashMap);
    }
}
