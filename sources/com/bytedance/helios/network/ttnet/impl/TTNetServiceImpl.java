package com.bytedance.helios.network.ttnet.impl;

import X.C113554cx;
import X.C141335gf;
import X.C141415gn;
import X.C1FJ;
import X.C36910EeA;
import X.C39536FfQ;
import X.C39556Ffk;
import X.C39745Fin;
import X.C3C5;
import X.C47261Igj;
import X.C61878OQg;
import X.C64656PZc;
import X.C64657PZd;
import X.C64658PZe;
import X.C64659PZf;
import X.C64668PZo;
import X.C64709PaT;
import X.C64738Paw;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C65064PgC;
import X.C65777Prh;
import X.C65896Ptc;
import X.C65901Pth;
import X.C65902Pti;
import X.C65922Pu2;
import X.C65926Pu6;
import X.C66226Pyw;
import X.C68322mC;
import X.C76800UCe;
import X.EJ6;
import X.FBZ;
import X.InterfaceC64660PZg;
import X.InterfaceC88472Yns;
import X.ORY;
import X.PVC;
import X.X1D;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.helios.api.consumer.OperatePairs;
import com.bytedance.helios.api.consumer.ReportParam;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.service.ITTNetService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.helios.network.ttnet.TTNetMonitorInterceptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.AqS100S0300000_11;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS78S1100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes12.dex */
public final class TTNetServiceImpl implements ITTNetService {
    public static Field argsField;
    public static boolean isInitRequestFactoryField;
    public static Field requestFactoryField;
    public static Field requestFactoryRelativeUrl1Field;
    public static Field requestFactoryRelativeUrlField;
    public static Field requestFactoryServiceField;
    public static final C64659PZf Companion = new C64659PZf();
    public static final LruCache<String, Map<String, List<String>>> queryLruCache = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> cookieLruCache = new LruCache<>(100);

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void copyResponseBody(C65902Pti event) {
        o.LJIIIZ(event, "event");
    }

    private final Map<String, List<String>> convertHeaderListToMap(List<EJ6> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (EJ6 ej6 : list) {
                ArrayList arrayList = (ArrayList) hashMap.get(ej6.LIZ);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ej6.LIZIZ);
                String str = ej6.LIZ;
                o.LJIIIIZZ(str, "it.name");
                hashMap.put(str, arrayList);
            }
        }
        return hashMap;
    }

    private final Request getRequestObj(C65902Pti c65902Pti) {
        Object obj;
        C65901Pth c65901Pth = c65902Pti.LJLIL;
        C64709PaT c64709PaT = c65901Pth.LJZI;
        if (c64709PaT.LJLJI) {
            Object obj2 = c64709PaT.LJLJJL;
            if (obj2 instanceof Request) {
                if (obj2 != null) {
                    return (Request) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.retrofit2.client.Request");
            }
        }
        Object[] objArr = c65901Pth.LJLIL.LJFF;
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        if (!(obj instanceof FBZ)) {
            return null;
        }
        return ((FBZ) obj).request();
    }

    private final C64797Pbt<?> getResponseObj(C65902Pti c65902Pti) {
        Object obj;
        Object[] objArr = c65902Pti.LJLIL.LJLIL.LJFF;
        if (objArr != null) {
            obj = ORY.LJJJJI(1, objArr);
        } else {
            obj = null;
        }
        if (!(obj instanceof C64797Pbt)) {
            return null;
        }
        return (C64797Pbt) obj;
    }

    private final void initRequestFactoryField(SsHttpCall<?> ssHttpCall) {
        try {
            if (!isInitRequestFactoryField) {
                isInitRequestFactoryField = true;
                Field declaredField = ssHttpCall.getClass().getDeclaredField("args");
                argsField = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
                Field declaredField2 = ssHttpCall.getClass().getDeclaredField("requestFactory");
                requestFactoryField = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Class<?> cls = Class.forName("com.bytedance.retrofit2.RequestFactory");
                Field declaredField3 = cls.getDeclaredField("server");
                requestFactoryServiceField = declaredField3;
                if (declaredField3 != null) {
                    declaredField3.setAccessible(true);
                }
                Field declaredField4 = cls.getDeclaredField("relativeUrl");
                requestFactoryRelativeUrlField = declaredField4;
                if (declaredField4 != null) {
                    declaredField4.setAccessible(true);
                }
                try {
                    Field declaredField5 = cls.getDeclaredField("relativeUrl1");
                    requestFactoryRelativeUrl1Field = declaredField5;
                    if (declaredField5 != null) {
                        declaredField5.setAccessible(true);
                    }
                } catch (Throwable th) {
                    C65926Pu6.LIZ("Helios:Network-Service", C64657PZd.LJLIL, 5, th);
                }
            }
        } catch (Throwable th2) {
            isInitRequestFactoryField = true;
            C65926Pu6.LIZ("Helios:Network-Service", C64658PZe.LJLIL, 6, th2);
        }
    }

    private final C39745Fin parseMediaType(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return C39745Fin.LIZJ(str);
    }

    private final boolean shouldReadReqBody(C39745Fin c39745Fin) {
        if (c39745Fin == null) {
            return false;
        }
        String str = c39745Fin.LIZIZ;
        String str2 = c39745Fin.LIZJ;
        if ((!o.LJ(str, "application") || (!o.LJ(str2, "json") && !o.LJ(str2, "x-www-form-urlencoded"))) && (!o.LJ(str, "text") || !o.LJ(str2, "plain"))) {
            return false;
        }
        return true;
    }

    private final boolean shouldReadResBody(C39745Fin c39745Fin) {
        if (c39745Fin == null) {
            return false;
        }
        String str = c39745Fin.LIZIZ;
        String str2 = c39745Fin.LIZJ;
        if (!o.LJ(str, "application") || !o.LJ(str2, "json")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Object addInterceptor(Object obj) {
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns;
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns2;
        if (obj != null && (obj instanceof C65064PgC)) {
            NetworkComponent networkComponent = NetworkComponent.INSTANCE;
            C66226Pyw commonProxy = networkComponent.getCommonProxy();
            if (commonProxy != null && (interfaceC88472Yns2 = commonProxy.LJLLL) != null) {
                interfaceC88472Yns2.invoke(obj);
            }
            ((C65064PgC) obj).LIZJ(new TTNetMonitorInterceptor());
            C66226Pyw commonProxy2 = networkComponent.getCommonProxy();
            if (commonProxy2 != null && (interfaceC88472Yns = commonProxy2.LJLLLL) != null) {
                interfaceC88472Yns.invoke(obj);
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentSubType(C65902Pti event) {
        TypedOutput body;
        String mimeType;
        C39745Fin parseMediaType;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj == null || (body = requestObj.getBody()) == null || (mimeType = body.mimeType()) == null || (parseMediaType = parseMediaType(mimeType)) == null) {
            return null;
        }
        return parseMediaType.LIZJ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentType(C65902Pti event) {
        TypedOutput body;
        String mimeType;
        C39745Fin parseMediaType;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj == null || (body = requestObj.getBody()) == null || (mimeType = body.mimeType()) == null || (parseMediaType = parseMediaType(mimeType)) == null) {
            return null;
        }
        return parseMediaType.LIZIZ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, String> getCookies(C65902Pti event) {
        List<EJ6> headers;
        o.LJIIIZ(event, "event");
        HashMap hashMap = new HashMap();
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (headers = requestObj.headers("cookie")) != null) {
            for (EJ6 header : headers) {
                LruCache<String, Map<String, String>> lruCache = cookieLruCache;
                o.LJIIIIZZ(header, "header");
                Map<String, String> map = lruCache.get(header.LIZIZ);
                if (map != null) {
                    hashMap.putAll(map);
                    C65926Pu6.LIZIZ("Helios:Network-Service", new AqS158S0200000_11(map, header, 4), 2, null, 8);
                } else {
                    String str = header.LIZIZ;
                    o.LJIIIIZZ(str, "header.value");
                    List LJLJJL = s.LJLJJL(str, new String[]{";"}, 0, 6);
                    HashMap hashMap2 = new HashMap();
                    Iterator it = LJLJJL.iterator();
                    while (it.hasNext()) {
                        Object[] array = s.LJLJJL((String) it.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length > 1) {
                                hashMap2.put(strArr[0], strArr[1]);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    cookieLruCache.put(header.LIZIZ, hashMap2);
                    hashMap.putAll(hashMap2);
                    C65926Pu6.LIZIZ("Helios:Network-Service", new AqS158S0200000_11(hashMap2, header, 5), 2, null, 8);
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getDomain(C65902Pti event) {
        o.LJIIIZ(event, "event");
        try {
            Request requestObj = getRequestObj(event);
            if (requestObj != null) {
                return requestObj.getHost();
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getHeaders(C65902Pti event) {
        List<EJ6> list;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            list = requestObj.getHeaders();
        } else {
            list = null;
        }
        return convertHeaderListToMap(list);
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getMethod(C65902Pti event) {
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            return requestObj.getMethod();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getPath(C65902Pti event) {
        o.LJIIIZ(event, "event");
        try {
            Request requestObj = getRequestObj(event);
            if (requestObj != null) {
                return requestObj.getPath();
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return "";
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getQueries(C65902Pti event) {
        String url;
        o.LJIIIZ(event, "event");
        HashMap hashMap = new HashMap();
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (url = requestObj.getUrl()) != null) {
            Map<String, List<String>> map = queryLruCache.get(url);
            if (map != null) {
                C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(map, url, 4), 2, null, 8);
                return map;
            }
            List<UrlQuerySanitizer.ParameterValuePair> parameterList = new UrlQuerySanitizer(url).getParameterList();
            o.LJIIIIZZ(parameterList, "UrlQuerySanitizer(url).parameterList");
            for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : parameterList) {
                String str = parameterValuePair.mParameter;
                o.LJIIIIZZ(str, "it.mParameter");
                List list = (List) hashMap.get(parameterValuePair.mParameter);
                if (list == null) {
                    list = new ArrayList();
                }
                String str2 = parameterValuePair.mValue;
                o.LJIIIIZZ(str2, "it.mValue");
                list.add(str2);
                hashMap.put(str, list);
            }
            queryLruCache.put(url, hashMap);
            C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(url, hashMap, 3), 2, null, 8);
        }
        return hashMap;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getRequestBody(C65902Pti event) {
        TypedOutput body;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (body = requestObj.getBody()) != null && shouldReadReqBody(parseMediaType(body.mimeType()))) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            body.writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toString(C64656PZc.LIZIZ.name());
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentSubType(C65902Pti event) {
        C36910EeA c36910EeA;
        TypedInput typedInput;
        String mimeType;
        C39745Fin parseMediaType;
        o.LJIIIZ(event, "event");
        C64797Pbt<?> responseObj = getResponseObj(event);
        if (responseObj == null || (c36910EeA = responseObj.LIZ) == null || (typedInput = c36910EeA.LJ) == null || (mimeType = typedInput.mimeType()) == null || (parseMediaType = parseMediaType(mimeType)) == null) {
            return null;
        }
        return parseMediaType.LIZJ;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentType(C65902Pti event) {
        C36910EeA c36910EeA;
        TypedInput typedInput;
        String mimeType;
        C39745Fin parseMediaType;
        o.LJIIIZ(event, "event");
        C64797Pbt<?> responseObj = getResponseObj(event);
        if (responseObj == null || (c36910EeA = responseObj.LIZ) == null || (typedInput = c36910EeA.LJ) == null || (mimeType = typedInput.mimeType()) == null || (parseMediaType = parseMediaType(mimeType)) == null) {
            return null;
        }
        return parseMediaType.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResponseBody(C65902Pti event) {
        Object LIZ;
        T t;
        String str;
        o.LJIIIZ(event, "event");
        C64797Pbt<?> responseObj = getResponseObj(event);
        if (responseObj != null) {
            try {
                t = responseObj.LIZIZ;
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (t instanceof String) {
                return (String) t;
            }
            C36910EeA c36910EeA = responseObj.LIZ;
            o.LJIIIIZZ(c36910EeA, "it.raw()");
            TypedInput typedInput = c36910EeA.LJ;
            if (typedInput != null) {
                str = typedInput.mimeType();
            } else {
                str = null;
            }
            if (shouldReadResBody(parseMediaType(str))) {
                if (t instanceof TypedByteArray) {
                    byte[] bytes = ((TypedByteArray) t).getBytes();
                    o.LJIIIIZZ(bytes, "body.bytes");
                    return new String(bytes, PVC.LIZ);
                }
                int i = 0;
                ConcurrentModificationException e = null;
                String str2 = null;
                while (i >= 0 && 3 >= i) {
                    try {
                        str2 = C39536FfQ.LIZ(t);
                        i = -1;
                        e = null;
                    } catch (ConcurrentModificationException e2) {
                        e = e2;
                        i++;
                    }
                }
                if (e != null) {
                    C65926Pu6.LIZ("Helios:Network-Service", new AqS100S0300000_11(e, t, event, 0), 6, e);
                }
                return str2;
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C65926Pu6.LIZ("Helios:Network-Service", new AqS100S0300000_11(m10exceptionOrNullimpl, responseObj, event, 1), 6, m10exceptionOrNullimpl);
            }
            C3C5.m6boximpl(LIZ);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getResponseHeaders(C65902Pti event) {
        List<EJ6> list;
        o.LJIIIZ(event, "event");
        C64797Pbt<?> responseObj = getResponseObj(event);
        if (responseObj != null) {
            list = responseObj.LIZ.LIZLLL;
        } else {
            list = null;
        }
        return convertHeaderListToMap(list);
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getScheme(C65902Pti event) {
        String url;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (url = requestObj.getUrl()) != null) {
            Uri parse = UriProtector.parse(url);
            o.LJIIIIZZ(parse, "Uri.parse(it)");
            return parse.getScheme();
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.ITTNetService
    public List<ReportParam> getTTNetGuardCallbackInfo(C65922Pu2 originalInvokeContext) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        boolean z2;
        boolean z3;
        JSONArray jSONArray;
        String str;
        String str2;
        JSONObject jSONObject;
        boolean z4;
        Map<String, Object> map;
        o.LJIIIZ(originalInvokeContext, "originalInvokeContext");
        int i2 = originalInvokeContext.LIZ;
        if (i2 == 400201 || i2 == 400202) {
            Object[] objArr = originalInvokeContext.LJFF;
            boolean z5 = false;
            if (objArr != null) {
                i = objArr.length;
            } else {
                i = 0;
            }
            if (i >= 5) {
                if (objArr != null) {
                    obj = objArr[4];
                } else {
                    obj = null;
                }
                if (obj instanceof C64668PZo) {
                    if (objArr != null) {
                        obj2 = objArr[4];
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        C64668PZo c64668PZo = (C64668PZo) obj2;
                        C64738Paw c64738Paw = c64668PZo.LJJIJIIJIL;
                        if (c64738Paw != null && (map = c64738Paw.LJJJLL) != null) {
                            obj3 = ((HashMap) map).get("pns_network");
                        } else {
                            obj3 = null;
                        }
                        Map LIZJ = C65777Prh.LIZJ(obj3);
                        if (LIZJ != null) {
                            obj4 = LIZJ.get("uuid");
                        } else {
                            obj4 = null;
                        }
                        String str3 = (String) obj4;
                        if (str3 == null || ujb.o.LJJJJJL(str3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new ReportParam("uuid", str3, "log_extra", false, false, 8, null));
                        try {
                            String str4 = c64668PZo.LJIL;
                            if (str4 == null || ujb.o.LJJJJJL(str4)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                JSONObject jSONObject2 = new JSONObject(str4);
                                JSONObject optJSONObject = jSONObject2.optJSONObject("base");
                                if (optJSONObject != null) {
                                    jSONArray = optJSONObject.optJSONArray("redirect_info");
                                } else {
                                    jSONArray = null;
                                }
                                if (jSONArray != null && jSONArray.length() > 0) {
                                    int length = jSONArray.length() - 1;
                                    while (true) {
                                        if (length >= 0) {
                                            if (jSONArray.get(length) instanceof JSONObject) {
                                                Object obj5 = jSONArray.get(length);
                                                if (obj5 != null) {
                                                    jSONObject = (JSONObject) obj5;
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                                                }
                                            } else {
                                                length--;
                                            }
                                        } else {
                                            jSONObject = null;
                                            break;
                                        }
                                    }
                                    if (jSONObject != null) {
                                        String optString = jSONObject.optString("url");
                                        if (optString == null || ujb.o.LJJJJJL(optString)) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (!z4) {
                                            arrayList.add(new ReportParam("method", jSONObject.optString("method"), null, false, false, 28, null));
                                            Uri uri = UriProtector.parse(optString);
                                            o.LJIIIIZZ(uri, "uri");
                                            arrayList.add(new ReportParam("redirect_scheme", uri.getScheme(), null, false, false, 28, null));
                                            z5 = false;
                                            arrayList.add(new ReportParam("redirect_domain", uri.getAuthority(), null, false, false, 28, null));
                                            arrayList.add(new ReportParam("redirect_path", uri.getPath(), "log_extra", false, false, 24, null));
                                        }
                                    }
                                }
                                JSONObject optJSONObject2 = jSONObject2.optJSONObject("header");
                                if (optJSONObject2 != null) {
                                    str = optJSONObject2.optString("x-tt-logid");
                                } else {
                                    str = null;
                                }
                                arrayList.add(new ReportParam("logid", str, "log_extra", z5, z5, 24, null));
                                JSONObject optJSONObject3 = jSONObject2.optJSONObject("base");
                                if (optJSONObject3 != null) {
                                    str2 = optJSONObject3.optString("net_error");
                                } else {
                                    str2 = null;
                                }
                                arrayList.add(new ReportParam("error_code", str2, null, z5, z5, 28, null));
                            }
                            String str5 = c64668PZo.LJJIFFI;
                            if (str5 == null || ujb.o.LJJJJJL(str5)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                try {
                                    C3C5.m7constructorimpl(Boolean.valueOf(arrayList.add(new ReportParam("redirect_headers_keys", C39556Ffk.LIZJ(new JSONObject(c64668PZo.LJJIFFI)), "log_extra", z5, z5, 24, null))));
                                } catch (Throwable th) {
                                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                }
                            }
                            String str6 = c64668PZo.LJJII;
                            if (str6 == null || ujb.o.LJJJJJL(str6)) {
                                z5 = true;
                            }
                            if (!z5) {
                                try {
                                    C3C5.m7constructorimpl(Boolean.valueOf(arrayList.add(new ReportParam("redirect_res_headers_keys", C39556Ffk.LIZJ(new JSONObject(c64668PZo.LJJII)), "log_extra", false, false, 24, null))));
                                } catch (Throwable th2) {
                                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                                }
                            }
                        } catch (Throwable th3) {
                            C65926Pu6.LIZ("Helios:Network-Service", null, 6, th3);
                        }
                        return arrayList;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo<*>");
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getUrl(C65902Pti event) {
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            return requestObj.getUrl();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void initNetworkStackEvent(C65896Ptc networkStackEvent) {
        Object obj;
        Object obj2;
        Field field;
        Object obj3;
        Object obj4;
        ?? r2;
        Object obj5;
        o.LJIIIZ(networkStackEvent, "networkStackEvent");
        C68322mC c68322mC = new C68322mC();
        Object obj6 = "";
        c68322mC.element = "";
        try {
            Object obj7 = networkStackEvent.LJLIL.LJLIL.LJ;
            if (obj7 instanceof SsHttpCall) {
                Field field2 = argsField;
                Object obj8 = null;
                if (field2 != null) {
                    obj = field2.get(obj7);
                } else {
                    obj = null;
                }
                Object[] objArr = (Object[]) obj;
                if (objArr != null) {
                    for (Object obj9 : objArr) {
                        if (!(obj9 instanceof String) || (!ujb.o.LJJJLIIL((String) obj9, "https://", false) && !ujb.o.LJJJLIIL((String) obj9, "http://", false))) {
                        }
                        obj8 = obj9;
                        break;
                    }
                }
                String str = (String) obj8;
                T t = str;
                if (str == null) {
                    t = "";
                }
                c68322mC.element = t;
                initRequestFactoryField((SsHttpCall) obj7);
                networkStackEvent.LJLJLJ = ((SsHttpCall) obj7).getRetrofitMetrics().LJJJLL;
                Field field3 = requestFactoryField;
                if (field3 != null && (obj2 = field3.get(obj7)) != null && (field = requestFactoryServiceField) != null && (obj3 = field.get(obj2)) != null) {
                    Field field4 = requestFactoryRelativeUrlField;
                    if (field4 != null && (obj5 = field4.get(obj2)) != null) {
                        obj6 = obj5;
                    } else {
                        Field field5 = requestFactoryRelativeUrl1Field;
                        if (field5 != null && (obj4 = field5.get(obj2)) != null) {
                            obj6 = obj4;
                        }
                    }
                    String str2 = (String) obj6;
                    String baseUrl = ((InterfaceC64660PZg) obj3).getUrl();
                    o.LJIIIIZZ(baseUrl, "baseUrl");
                    if (ujb.o.LJJJJ(baseUrl, "/", false) || ujb.o.LJJJLIIL(str2, "/", false)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(baseUrl);
                        LIZ.append(str2);
                        r2 = X1D.LIZIZ(LIZ);
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(baseUrl);
                        LIZ2.append('/');
                        LIZ2.append(str2);
                        r2 = X1D.LIZIZ(LIZ2);
                    }
                    if (r2.length() > ((String) c68322mC.element).length()) {
                        c68322mC.element = r2;
                    }
                }
            }
            Uri uri = UriProtector.parse((String) c68322mC.element);
            List<Uri> list = networkStackEvent.LJLILLLLZI;
            o.LJIIIIZZ(uri, "uri");
            list.add(uri);
        } catch (Throwable th) {
            C65926Pu6.LIZ("Helios:Network-Service", new AqS161S0100000_11(c68322mC, 4), 5, th);
        }
    }

    private final List<String> convertCanonicalListByIgnoreCase(boolean z, List<String> list) {
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                Locale locale = Locale.ROOT;
                o.LJIIIIZZ(locale, "Locale.ROOT");
                if (str != null) {
                    String lowerCase = str.toLowerCase(locale);
                    o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    arrayList.add(lowerCase);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        return list;
    }

    private final Map<String, ReplaceConfig> convertCanonicalMapByIgnoreCase(boolean z, Map<String, ReplaceConfig> map) {
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : map.keySet()) {
                ReplaceConfig replaceConfig = map.get(str);
                if (replaceConfig != null) {
                    Locale locale = Locale.ROOT;
                    o.LJIIIIZZ(locale, "Locale.ROOT");
                    if (str != null) {
                        String lowerCase = str.toLowerCase(locale);
                        o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        linkedHashMap.put(lowerCase, replaceConfig);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        return map;
    }

    private final String convertCanonicalStrByIgnoreCase(boolean z, String str) {
        if (z) {
            Locale locale = Locale.ROOT;
            o.LJIIIIZZ(locale, "Locale.ROOT");
            if (str != null) {
                String lowerCase = str.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return str;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addCookies(C65902Pti event, Map<String, String> cookies) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(cookies, "cookies");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            List<EJ6> headers = requestObj.headers("cookie");
            if (headers != null) {
                for (EJ6 cookies2 : headers) {
                    o.LJIIIIZZ(cookies2, "cookies");
                    arrayList2.add(cookies2.LIZIZ);
                }
            }
            for (Map.Entry<String, String> entry : cookies.entrySet()) {
                sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), "=", entry));
                sb.append(";");
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            arrayList2.add(sb.toString());
            Map<String, ? extends List<String>> LJJLIL = C113554cx.LJJLIL(getHeaders(event));
            LJJLIL.remove("cookie");
            LJJLIL.put("cookie", arrayList2);
            onHeaderChanged(event, LJJLIL, "add", "cookie", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addHeaders(C65902Pti event, Map<String, String> headers) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(headers, "headers");
        if (getRequestObj(event) != null) {
            Map<String, ? extends List<String>> LJJLIL = C113554cx.LJJLIL(getHeaders(event));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                Collection collection = (Collection) ((LinkedHashMap) LJJLIL).get(entry.getKey());
                ArrayList LJII = C47261Igj.LJII(entry.getValue());
                if (collection == null) {
                    LJJLIL.put(entry.getKey(), LJII);
                } else {
                    String key = entry.getKey();
                    LJII.addAll(collection);
                    LJJLIL.put(key, LJII);
                }
                arrayList.add(new OperatePairs(null, null, entry.getKey(), TextUtils.join(";", LJII)));
            }
            onHeaderChanged(event, LJJLIL, "add", "header", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addQueries(C65902Pti event, Map<String, String> queries) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(queries, "queries");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri.Builder buildUpon = UriProtector.parse(requestObj.getUrl()).buildUpon();
            for (Map.Entry<String, String> entry : queries.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "uriBuilder.build().toString()");
            onUrlChanged(event, uri, "add", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceDomain(C65902Pti event, Map<String, ReplaceConfig> keys) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            Uri uri = UriProtector.parse(requestObj.getUrl());
            o.LJIIIIZZ(uri, "uri");
            String host = uri.getHost();
            ReplaceConfig replaceConfig = keys.get(host);
            if (replaceConfig == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
                return;
            }
            String uri2 = uri.buildUpon().authority(value).build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            onUrlChanged(event, uri2, "replace", C47261Igj.LJJIJ(new OperatePairs(host, null, value, null, 10, null)), "domain");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replacePath(C65902Pti event, Map<String, ReplaceConfig> keys) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            Uri uri = UriProtector.parse(requestObj.getUrl());
            o.LJIIIIZZ(uri, "uri");
            String path = uri.getPath();
            ReplaceConfig replaceConfig = keys.get(path);
            if (replaceConfig == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
                return;
            }
            String uri2 = uri.buildUpon().path(value).build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            onUrlChanged(event, uri2, "replace", C47261Igj.LJJIJ(new OperatePairs(path, null, value, null, 10, null)), "path");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceScheme(C65902Pti event, Map<String, ReplaceConfig> keys) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            Uri uri = UriProtector.parse(requestObj.getUrl());
            o.LJIIIIZZ(uri, "uri");
            String scheme = uri.getScheme();
            ReplaceConfig replaceConfig = keys.get(scheme);
            if (replaceConfig == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
                return;
            }
            String uri2 = uri.buildUpon().scheme(value).build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            onUrlChanged(event, uri2, "replace", C47261Igj.LJJIJ(new OperatePairs(scheme, null, value, null, 10, null)), "scheme");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void dropRequest(C65902Pti event, int i, String message) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(message, "message");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            event.LJLIL.LJZI.LJLJJI = true;
            String url = requestObj.getUrl();
            List<EJ6> headers = requestObj.getHeaders();
            byte[] bytes = message.getBytes(PVC.LIZ);
            o.LJIIIIZZ(bytes, "(this as java.lang.String).getBytes(charset)");
            C36910EeA c36910EeA = new C36910EeA(url, i, "drop by pns", headers, new TypedByteArray("application/json; charset=utf-8", bytes, new String[0]));
            event.LJLIL.LJZI.LJLJJL = C64797Pbt.LIZ(c36910EeA.LJ, c36910EeA);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void removeCookies(C65902Pti event, List<String> keys, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            convertCanonicalListByIgnoreCase(z, keys);
            ArrayList arrayList2 = new ArrayList();
            List<EJ6> headers = requestObj.headers("cookie");
            if (headers != null) {
                for (EJ6 cookies : headers) {
                    StringBuilder sb = new StringBuilder();
                    o.LJIIIIZZ(cookies, "cookies");
                    String str = cookies.LIZIZ;
                    o.LJIIIIZZ(str, "cookies.value");
                    int i = 0;
                    int i2 = 6;
                    for (String str2 : s.LJLJJL(str, new String[]{";"}, 0, 6)) {
                        Object[] array = s.LJLJJL(str2, new String[]{"="}, i, i2).toArray(new String[i]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length < 2) {
                                sb.append(str2);
                                sb.append(";");
                            } else {
                                String str3 = strArr[i];
                                if (z) {
                                    Locale locale = Locale.ROOT;
                                    o.LJIIIIZZ(locale, "Locale.ROOT");
                                    if (str3 != null) {
                                        str3 = str3.toLowerCase(locale);
                                        o.LJIIIIZZ(str3, "(this as java.lang.String).toLowerCase(locale)");
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                                if (keys.contains(str3)) {
                                    i = 0;
                                    arrayList2.add(new OperatePairs(strArr[0], strArr[1], null, null, 12, null));
                                } else {
                                    i = 0;
                                    sb.append(str2);
                                    sb.append(";");
                                }
                            }
                            i2 = 6;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    arrayList.add(sb.toString());
                }
            }
            Map<String, ? extends List<String>> LJJLIL = C113554cx.LJJLIL(getHeaders(event));
            LJJLIL.remove("cookie");
            LJJLIL.put("cookie", arrayList);
            onHeaderChanged(event, LJJLIL, "remove", "cookie", arrayList2);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void removeHeaders(C65902Pti event, List<String> keys, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        if (getRequestObj(event) != null) {
            ArrayList arrayList = new ArrayList();
            Map LJJLIL = C113554cx.LJJLIL(getHeaders(event));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            convertCanonicalListByIgnoreCase(z, keys);
            for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
                String str = (String) entry.getKey();
                if (z) {
                    Locale locale = Locale.ROOT;
                    o.LJIIIIZZ(locale, "Locale.ROOT");
                    if (str != null) {
                        str = str.toLowerCase(locale);
                        o.LJIIIIZZ(str, "(this as java.lang.String).toLowerCase(locale)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (keys.contains(str)) {
                    String str2 = (String) entry.getKey();
                    Iterable iterable = (Iterable) entry.getValue();
                    if (iterable == null) {
                        iterable = C61878OQg.INSTANCE;
                    }
                    arrayList.add(new OperatePairs(str2, TextUtils.join(";", iterable), null, null, 12, null));
                } else {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            onHeaderChanged(event, linkedHashMap, "remove", "header", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void removeQueries(C65902Pti event, List<String> keys, boolean z) {
        String str;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri uri = UriProtector.parse(requestObj.getUrl());
            o.LJIIIIZZ(uri, "uri");
            Set<String> queryNameSet = UriProtector.getQueryParameterNames(uri);
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            convertCanonicalListByIgnoreCase(z, keys);
            o.LJIIIIZZ(queryNameSet, "queryNameSet");
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : queryNameSet) {
                String it = str2;
                o.LJIIIIZZ(it, "it");
                if (z) {
                    Locale locale = Locale.ROOT;
                    str = C141415gn.LIZIZ(locale, "Locale.ROOT", it, locale, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    str = it;
                }
                boolean contains = keys.contains(str);
                if (contains) {
                    arrayList.add(new OperatePairs(it, UriProtector.getQueryParameter(uri, it), null, null, 12, null));
                    if (!contains) {
                    }
                }
                arrayList2.add(str2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                clearQuery.appendQueryParameter(str3, UriProtector.getQueryParameter(uri, str3));
            }
            String uri2 = clearQuery.build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            onUrlChanged(event, uri2, "remove", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceCookies(C65902Pti event, Map<String, ReplaceConfig> keys, boolean z) {
        String value;
        char c;
        boolean z2;
        String str;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            convertCanonicalMapByIgnoreCase(z, keys);
            ArrayList arrayList2 = new ArrayList();
            List<EJ6> headers = requestObj.headers("cookie");
            if (headers != null) {
                for (EJ6 cookies : headers) {
                    StringBuilder sb = new StringBuilder();
                    o.LJIIIIZZ(cookies, "cookies");
                    String str2 = cookies.LIZIZ;
                    o.LJIIIIZZ(str2, "cookies.value");
                    int i = 0;
                    int i2 = 6;
                    for (String str3 : s.LJLJJL(str2, new String[]{";"}, 0, 6)) {
                        Object[] array = s.LJLJJL(str3, new String[]{"="}, i, i2).toArray(new String[i]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            if (strArr.length < 2) {
                                sb.append(str3);
                                sb.append(";");
                            } else {
                                String str4 = strArr[0];
                                if (z) {
                                    Locale locale = Locale.ROOT;
                                    o.LJIIIIZZ(locale, "Locale.ROOT");
                                    if (str4 != null) {
                                        str4 = str4.toLowerCase(locale);
                                        o.LJIIIIZZ(str4, "(this as java.lang.String).toLowerCase(locale)");
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                                ReplaceConfig replaceConfig = keys.get(str4);
                                if (replaceConfig == null) {
                                    sb.append(str3);
                                    sb.append(";");
                                } else {
                                    if (o.LJ(replaceConfig.getTarget(), "value")) {
                                        sb.append(strArr[0]);
                                        sb.append("=");
                                        sb.append(replaceConfig.getValue());
                                        sb.append(";");
                                        str = replaceConfig.getValue();
                                        z2 = !TextUtils.equals(strArr[1], str);
                                        c = 0;
                                        value = null;
                                    } else {
                                        sb.append(replaceConfig.getValue());
                                        sb.append("=");
                                        sb.append(strArr[1]);
                                        sb.append(";");
                                        value = replaceConfig.getValue();
                                        c = 0;
                                        z2 = !TextUtils.equals(strArr[0], value);
                                        str = null;
                                    }
                                    if (z2) {
                                        arrayList.add(new OperatePairs(strArr[c], strArr[1], value, str));
                                    }
                                }
                            }
                            i = 0;
                            i2 = 6;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    arrayList2.add(sb.toString());
                }
            }
            Map<String, ? extends List<String>> LJJLIL = C113554cx.LJJLIL(getHeaders(event));
            LJJLIL.remove("cookie");
            LJJLIL.put("cookie", arrayList2);
            onHeaderChanged(event, LJJLIL, "replace", "cookie", arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceHeaders(C65902Pti event, Map<String, ReplaceConfig> keys, boolean z) {
        Iterable iterable;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        if (getRequestObj(event) != null) {
            ArrayList arrayList = new ArrayList();
            Map LJJLIL = C113554cx.LJJLIL(getHeaders(event));
            convertCanonicalMapByIgnoreCase(z, keys);
            LinkedHashMap linkedHashMap = (LinkedHashMap) LJJLIL;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                if (z) {
                    Locale locale = Locale.ROOT;
                    o.LJIIIIZZ(locale, "Locale.ROOT");
                    if (str != null) {
                        str = str.toLowerCase(locale);
                        o.LJIIIIZZ(str, "(this as java.lang.String).toLowerCase(locale)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                ReplaceConfig replaceConfig = keys.get(str);
                if (replaceConfig != null && (iterable = (Iterable) linkedHashMap.get(entry.getKey())) != null) {
                    String str2 = null;
                    if (o.LJ(replaceConfig.getTarget(), "value")) {
                        ArrayList LJII = C47261Igj.LJII(replaceConfig.getValue());
                        LJJLIL.put(entry.getKey(), LJII);
                        value = replaceConfig.getValue();
                        if (!Objects.deepEquals(iterable, LJII)) {
                            arrayList.add(new OperatePairs((String) entry.getKey(), TextUtils.join(";", iterable), str2, value));
                        }
                    } else {
                        LJJLIL.put(replaceConfig.getValue(), iterable);
                        String value2 = replaceConfig.getValue();
                        if (!TextUtils.equals((CharSequence) entry.getKey(), value2)) {
                            value = null;
                            str2 = value2;
                            if (1 != 0) {
                                arrayList.add(new OperatePairs((String) entry.getKey(), TextUtils.join(";", iterable), str2, value));
                            }
                        }
                    }
                }
            }
            onHeaderChanged(event, LJJLIL, "replace", "header", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceQueries(C65902Pti event, Map<String, ReplaceConfig> keys, boolean z) {
        String str;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri uri = UriProtector.parse(requestObj.getUrl());
            o.LJIIIIZZ(uri, "uri");
            Set<String> queryNameSet = UriProtector.getQueryParameterNames(uri);
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            convertCanonicalMapByIgnoreCase(z, keys);
            o.LJIIIIZZ(queryNameSet, "queryNameSet");
            for (String it : queryNameSet) {
                o.LJIIIIZZ(it, "it");
                if (z) {
                    Locale locale = Locale.ROOT;
                    str = C141415gn.LIZIZ(locale, "Locale.ROOT", it, locale, "(this as java.lang.String).toLowerCase(locale)");
                } else {
                    str = it;
                }
                ReplaceConfig replaceConfig = keys.get(str);
                if (replaceConfig == null) {
                    clearQuery.appendQueryParameter(it, UriProtector.getQueryParameter(uri, it));
                } else {
                    String queryParameter = UriProtector.getQueryParameter(uri, it);
                    String str2 = null;
                    if (o.LJ(replaceConfig.getTarget(), "value")) {
                        clearQuery.appendQueryParameter(it, replaceConfig.getValue());
                        value = replaceConfig.getValue();
                        if (!TextUtils.equals(queryParameter, value)) {
                            arrayList.add(new OperatePairs(it, UriProtector.getQueryParameter(uri, it), str2, value));
                        }
                    } else {
                        clearQuery.appendQueryParameter(replaceConfig.getValue(), queryParameter);
                        String value2 = replaceConfig.getValue();
                        value = null;
                        str2 = value2;
                        if (true ^ TextUtils.equals(it, value2)) {
                            arrayList.add(new OperatePairs(it, UriProtector.getQueryParameter(uri, it), str2, value));
                        }
                    }
                }
            }
            String uri2 = clearQuery.build().toString();
            o.LJIIIIZZ(uri2, "uriBuilder.build().toString()");
            onUrlChanged(event, uri2, "replace", arrayList, "query");
        }
    }

    private final void onHeaderChanged(C65902Pti c65902Pti, Map<String, ? extends List<String>> map, String str, String str2, List<OperatePairs> list) {
        Request request;
        C64908Pdg newBuilder;
        if (list == null || list.isEmpty()) {
            return;
        }
        Request requestObj = getRequestObj(c65902Pti);
        C64709PaT c64709PaT = c65902Pti.LJLIL.LJZI;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(new EJ6(entry.getKey(), it.next()));
                }
            }
        }
        if (requestObj != null && (newBuilder = requestObj.newBuilder()) != null) {
            newBuilder.LIZJ = arrayList;
            request = newBuilder.LIZ();
        } else {
            request = null;
        }
        c64709PaT.LJLJJL = request;
        c64709PaT.LJLJI = true;
        c65902Pti.LJLIL.LJLZ.add(new OperateHistory(str, str2, list));
        c65902Pti.LJLLLLLL = C113554cx.LJJLIL(map);
        c65902Pti.LJLZ = null;
    }

    private final void onUrlChanged(C65902Pti c65902Pti, String str, String str2, List<OperatePairs> list, String str3) {
        Request request;
        C64908Pdg newBuilder;
        if (list == null || list.isEmpty()) {
            return;
        }
        Request requestObj = getRequestObj(c65902Pti);
        C64709PaT c64709PaT = c65902Pti.LJLIL.LJZI;
        if (requestObj != null && (newBuilder = requestObj.newBuilder()) != null) {
            newBuilder.LIZJ(str);
            request = newBuilder.LIZ();
        } else {
            request = null;
        }
        c64709PaT.LJLJJL = request;
        c64709PaT.LJLJI = true;
        c65902Pti.LJLIL.LJLZ.add(new OperateHistory(str2, str3, list));
        c65902Pti.LJLJJI = str;
        switch (str3.hashCode()) {
            case -1326197564:
                if (!str3.equals("domain")) {
                    return;
                }
                c65902Pti.LJLJJLL = null;
                return;
            case -907987547:
                if (!str3.equals("scheme")) {
                    return;
                }
                c65902Pti.LJLJJL = null;
                return;
            case 3433509:
                if (!str3.equals("path")) {
                    return;
                }
                c65902Pti.LJLJL = null;
                return;
            case 107944136:
                if (!str3.equals("query")) {
                    return;
                }
                c65902Pti.LJLLLL = null;
                return;
            default:
                return;
        }
    }
}
