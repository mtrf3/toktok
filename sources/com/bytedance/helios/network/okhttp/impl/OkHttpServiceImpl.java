package com.bytedance.helios.network.okhttp.impl;

import X.C113554cx;
import X.C141335gf;
import X.C141415gn;
import X.C1FJ;
import X.C39745Fin;
import X.C3C5;
import X.C47261Igj;
import X.C64532PUi;
import X.C64533PUj;
import X.C64597PWv;
import X.C64598PWw;
import X.C64601PWz;
import X.C64605PXd;
import X.C64606PXe;
import X.C64618PXq;
import X.C64626PXy;
import X.C64627PXz;
import X.C64656PZc;
import X.C64709PaT;
import X.C65298Pjy;
import X.C65896Ptc;
import X.C65901Pth;
import X.C65902Pti;
import X.C65922Pu2;
import X.C65926Pu6;
import X.C68322mC;
import X.C76800UCe;
import X.EnumC64572PVw;
import X.InterfaceC48121Iub;
import X.InterfaceC48133Iun;
import X.ORY;
import X.PU7;
import X.PUL;
import X.PVM;
import X.PVP;
import X.PW3;
import X.PXZ;
import X.PZO;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.helios.api.consumer.OperateHistory;
import com.bytedance.helios.api.consumer.OperatePairs;
import com.bytedance.helios.network.api.service.IOkHttpService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.AqS78S1100000_11;
import kotlin.jvm.internal.o;
import okhttp3.Request;
import ujb.s;

/* loaded from: classes12.dex */
public final class OkHttpServiceImpl implements IOkHttpService {
    public static final PZO Companion = new PZO();
    public static final LruCache<String, Map<String, List<String>>> queryLruCache = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> cookieLruCache = new LruCache<>(100);

    private final void addInterceptorBySort(C64601PWz c64601PWz) {
        List<InterfaceC48121Iub> interceptors = c64601PWz.interceptors;
        o.LJIIIIZZ(interceptors, "interceptors");
        int i = -1;
        int i2 = 0;
        for (InterfaceC48121Iub interfaceC48121Iub : interceptors) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (o.LJ(interfaceC48121Iub.getClass().getName(), "com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor")) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (i >= 0) {
            ListProtector.add(interceptors, i, new C65298Pjy());
        } else {
            interceptors.add(new C65298Pjy());
        }
    }

    private final Request getRequestObj(C65902Pti c65902Pti) {
        Object obj;
        C65901Pth c65901Pth = c65902Pti.LJLIL;
        Object[] objArr = c65901Pth.LJLIL.LJFF;
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        C64709PaT c64709PaT = c65901Pth.LJZI;
        if (c64709PaT.LJLJI) {
            Object obj2 = c64709PaT.LJLJJL;
            if (obj2 instanceof Request) {
                if (obj2 != null) {
                    return (Request) obj2;
                }
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.Request");
            }
        }
        if (!(obj instanceof PXZ)) {
            return null;
        }
        return ((PXZ) obj).request();
    }

    private final C64598PWw getResponseObj(C65902Pti c65902Pti) {
        Object obj;
        Object[] objArr = c65902Pti.LJLIL.LJLIL.LJFF;
        if (objArr != null) {
            obj = ORY.LJJJJI(1, objArr);
        } else {
            obj = null;
        }
        if (!(obj instanceof C64598PWw)) {
            return null;
        }
        return (C64598PWw) obj;
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
        String str;
        if (obj != null && (obj instanceof C64601PWz)) {
            try {
                Field declaredField = C64601PWz.class.getDeclaredField("dns");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 != null) {
                    str = obj2.getClass().getName();
                } else {
                    str = null;
                }
                if (!o.LJ(str, "com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3DnsParserInterceptor")) {
                    addInterceptorBySort((C64601PWz) obj);
                    return Boolean.TRUE;
                }
            } catch (Throwable th) {
                addInterceptorBySort((C64601PWz) obj);
                C65926Pu6.LIZ("Helios:Network-Service", null, 6, th);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void copyResponseBody(C65902Pti event) {
        PVM pvm;
        PVM pvm2;
        o.LJIIIZ(event, "event");
        C64598PWw responseObj = getResponseObj(event);
        if (responseObj != null && (pvm = responseObj.LJLJL) != null && shouldReadResBody(pvm.contentType())) {
            C64598PWw responseObj2 = getResponseObj(event);
            if (responseObj2 != null) {
                PW3 source = responseObj2.LJLJL.source();
                source.request(Long.MAX_VALUE);
                C64533PUj clone = source.LJJIJ().clone();
                if (clone.LJLILLLLZI > Long.MAX_VALUE) {
                    C64533PUj c64533PUj = new C64533PUj();
                    c64533PUj.LLIIIL(clone, Long.MAX_VALUE);
                    clone.LIZ();
                    clone = c64533PUj;
                }
                pvm2 = PVM.create(responseObj2.LJLJL.contentType(), clone.LJLILLLLZI, clone);
            } else {
                pvm2 = null;
            }
            event.LJLLL = pvm2;
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentSubType(C65902Pti event) {
        PVP body;
        C39745Fin LIZIZ;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (body = requestObj.body()) != null && (LIZIZ = body.LIZIZ()) != null) {
            return LIZIZ.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getContentType(C65902Pti event) {
        PVP body;
        C39745Fin LIZIZ;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (body = requestObj.body()) != null && (LIZIZ = body.LIZIZ()) != null) {
            return LIZIZ.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, String> getCookies(C65902Pti event) {
        String header;
        o.LJIIIZ(event, "event");
        HashMap hashMap = new HashMap();
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (header = requestObj.header("cookie")) != null) {
            Map<String, String> map = cookieLruCache.get(header);
            if (map != null) {
                hashMap.putAll(map);
                C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(map, header, 0), 2, null, 8);
            } else {
                List LJLJJL = s.LJLJJL(header, new String[]{";"}, 0, 6);
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
                cookieLruCache.put(header, hashMap2);
                hashMap.putAll(hashMap2);
                C65926Pu6.LIZIZ("Helios:Network-Service", new AqS78S1100000_11(header, hashMap2, 1), 2, null, 8);
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getDomain(C65902Pti event) {
        C64626PXy url;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (url = requestObj.url()) != null) {
            return url.LIZLLL;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getHeaders(C65902Pti event) {
        C64606PXe headers;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (headers = requestObj.headers()) != null) {
            return headers.LJIIIZ();
        }
        return new HashMap();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getMethod(C65902Pti event) {
        String method;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (method = requestObj.method()) != null) {
            return method;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.IOkHttpService
    public Object getOkHttpCall(C65922Pu2 originalInvokeContext) {
        o.LJIIIZ(originalInvokeContext, "originalInvokeContext");
        Object[] objArr = originalInvokeContext.LJFF;
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof PXZ)) {
            return null;
        }
        return ((PXZ) obj).call();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getPath(C65902Pti event) {
        C64626PXy url;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (url = requestObj.url()) != null) {
            return url.LJFF();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r8 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        r1 = r5.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, (r11 * 2) + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r0 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        r0 = (java.util.List) r6.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r0 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r0.add(r9);
        r6.put(r8, r0);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        throw new java.lang.IndexOutOfBoundsException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r5 != null) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getQueries(X.C65902Pti r13) {
        /*
            r12 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            okhttp3.Request r0 = r12.getRequestObj(r13)
            r7 = 0
            if (r0 == 0) goto L35
            X.PXy r5 = r0.url()
        L15:
            r4 = 8
            java.lang.String r3 = "Helios:Network-Service"
            r2 = 2
            if (r5 == 0) goto L8b
            java.lang.String r9 = r5.LJIIIIZZ
            if (r9 == 0) goto L37
            android.util.LruCache<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl.queryLruCache
            java.lang.Object r8 = r0.get(r9)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L37
        L2b:
            kotlin.jvm.internal.AqS78S1100000_11 r1 = new kotlin.jvm.internal.AqS78S1100000_11
            r0 = 2
            r1.<init>(r8, r9, r0)
            X.C65926Pu6.LIZIZ(r3, r1, r2, r7, r4)
            return r8
        L35:
            r5 = r7
            goto L15
        L37:
            r11 = 0
            if (r5 == 0) goto L8b
            java.util.List<java.lang.String> r0 = r5.LJI
            if (r0 == 0) goto L8b
            int r10 = r0.size()
            int r10 = r10 / r2
        L43:
            if (r11 >= r10) goto L8b
            java.lang.String r9 = ""
            if (r5 == 0) goto L7b
            java.util.List<java.lang.String> r1 = r5.LJI
            if (r1 == 0) goto L85
            int r0 = r11 * 2
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            if (r8 == 0) goto L7b
        L55:
            java.util.List<java.lang.String> r1 = r5.LJI
            if (r1 == 0) goto L7f
            int r0 = r11 * 2
            int r0 = r0 + 1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            if (r0 == 0) goto L64
            r9 = r0
        L64:
            java.lang.Object r0 = r6.get(r8)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L75
        L6c:
            r0.add(r9)
            r6.put(r8, r0)
            int r11 = r11 + 1
            goto L43
        L75:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L6c
        L7b:
            r8 = r9
            if (r5 == 0) goto L64
            goto L55
        L7f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L85:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L8b:
            android.util.LruCache<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r1 = com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl.queryLruCache
            if (r5 == 0) goto L9f
            java.lang.String r0 = r5.LJIIIIZZ
        L91:
            r1.put(r0, r6)
            kotlin.jvm.internal.AqS158S0200000_11 r1 = new kotlin.jvm.internal.AqS158S0200000_11
            r0 = 0
            r1.<init>(r6, r5, r0)
            X.C65926Pu6.LIZIZ(r3, r1, r2, r7, r4)
            return r6
        L9f:
            r0 = r7
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.network.okhttp.impl.OkHttpServiceImpl.getQueries(X.Pti):java.util.Map");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getRequestBody(C65902Pti event) {
        PVP body;
        Charset charset;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (body = requestObj.body()) != null) {
            C39745Fin LIZIZ = body.LIZIZ();
            if (shouldReadReqBody(LIZIZ)) {
                if (LIZIZ == null || (charset = LIZIZ.LIZ(C64656PZc.LIZIZ)) == null) {
                    charset = C64656PZc.LIZIZ;
                }
                o.LJIIIIZZ(charset, "contentType?.charset(Con…nt.UTF8) ?: Constant.UTF8");
                C64533PUj c64533PUj = new C64533PUj();
                body.LJ(c64533PUj);
                return c64533PUj.LLLLL(charset);
            }
            return null;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentSubType(C65902Pti event) {
        PVM pvm;
        C39745Fin contentType;
        o.LJIIIZ(event, "event");
        C64598PWw responseObj = getResponseObj(event);
        if (responseObj != null && (pvm = responseObj.LJLJL) != null && (contentType = pvm.contentType()) != null) {
            return contentType.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResContentType(C65902Pti event) {
        PVM pvm;
        C39745Fin contentType;
        o.LJIIIZ(event, "event");
        C64598PWw responseObj = getResponseObj(event);
        if (responseObj != null && (pvm = responseObj.LJLJL) != null && (contentType = pvm.contentType()) != null) {
            return contentType.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getResponseBody(C65902Pti event) {
        Object LIZ;
        C39745Fin c39745Fin;
        Object obj;
        String str;
        o.LJIIIZ(event, "event");
        C64598PWw responseObj = getResponseObj(event);
        if (responseObj != null) {
            try {
                PVM pvm = responseObj.LJLJL;
                if (pvm != null) {
                    c39745Fin = pvm.contentType();
                } else {
                    c39745Fin = null;
                }
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (shouldReadResBody(c39745Fin) && (obj = event.LJLLL) != null) {
                C64598PWw responseObj2 = getResponseObj(event);
                if (responseObj2 != null) {
                    str = responseObj2.LIZ("Content-Encoding", "");
                } else {
                    str = null;
                }
                if (ujb.o.LJJJJIZL("gzip", str, true)) {
                    PW3 source = ((PVM) obj).source();
                    o.LJIIIIZZ(source, "responseBody.source()");
                    C64532PUi LIZ2 = PU7.LIZ(new PUL(source));
                    LIZ2.LJLILLLLZI.j(LIZ2.LJLJI);
                    return LIZ2.LJLILLLLZI.LJIILL();
                }
                return ((PVM) obj).string();
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C65926Pu6.LIZIZ("Helios:Network-Service", new AqS161S0100000_11(m10exceptionOrNullimpl, 2), 6, null, 8);
            }
            C3C5.m6boximpl(LIZ);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public Map<String, List<String>> getResponseHeaders(C65902Pti event) {
        C64606PXe c64606PXe;
        o.LJIIIZ(event, "event");
        C64598PWw responseObj = getResponseObj(event);
        if (responseObj != null && (c64606PXe = responseObj.LJLJJLL) != null) {
            return c64606PXe.LJIIIZ();
        }
        return new HashMap();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getScheme(C65902Pti event) {
        C64626PXy url;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (url = requestObj.url()) != null) {
            return url.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public String getUrl(C65902Pti event) {
        C64626PXy url;
        o.LJIIIZ(event, "event");
        Request requestObj = getRequestObj(event);
        if (requestObj != null && (url = requestObj.url()) != null) {
            return url.LJIIIIZZ;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object, java.lang.String] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void initNetworkStackEvent(C65896Ptc networkStackEvent) {
        o.LJIIIZ(networkStackEvent, "networkStackEvent");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        try {
            Object obj = networkStackEvent.LJLIL.LJLIL.LJ;
            if (obj != null) {
                InterfaceC48133Iun interfaceC48133Iun = (InterfaceC48133Iun) obj;
                ?? r1 = interfaceC48133Iun.request().url().LJIIIIZZ;
                o.LJIIIIZZ(r1, "thisOrClass.request().url().toString()");
                c68322mC.element = r1;
                Uri uri = UriProtector.parse(r1);
                List<Uri> list = networkStackEvent.LJLILLLLZI;
                o.LJIIIIZZ(uri, "uri");
                list.add(uri);
                networkStackEvent.LJLJLJ = interfaceC48133Iun;
                Map<String, Object> map = networkStackEvent.LJLIL.LJLLI;
                Request request = interfaceC48133Iun.request();
                o.LJIIIIZZ(request, "thisOrClass.request()");
                map.put("request", request);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Call");
        } catch (Throwable th) {
            C65926Pu6.LIZ("Helios:Network-Service", new AqS161S0100000_11(c68322mC, 3), 5, th);
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
        boolean z;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(cookies, "cookies");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            String header = requestObj.header("cookie");
            StringBuilder sb = new StringBuilder();
            if (header == null || header.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                sb.append(header);
                if (!ujb.o.LJJJJ(header, ";", false)) {
                    sb.append(";");
                }
            }
            for (Map.Entry<String, String> entry : cookies.entrySet()) {
                sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), "=", entry));
                sb.append(";");
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            C64605PXd LJI = requestObj.headers().LJI();
            LJI.LJ("cookie", sb.toString());
            onHeaderChanged(event, new C64606PXe(LJI), "add", "cookie", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addHeaders(C65902Pti event, Map<String, String> headers) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(headers, "headers");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            C64605PXd LJI = requestObj.headers().LJI();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                LJI.LIZ(entry.getKey(), entry.getValue());
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            onHeaderChanged(event, new C64606PXe(LJI), "add", "header", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void addQueries(C65902Pti event, Map<String, String> queries) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(queries, "queries");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            Uri.Builder buildUpon = UriProtector.parse(requestObj.url().LJIIIIZZ).buildUpon();
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
        String str;
        ReplaceConfig replaceConfig;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj == null || (replaceConfig = keys.get((str = requestObj.url().LIZLLL))) == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
            return;
        }
        C64627PXz LJIIJ = requestObj.url().LJIIJ();
        LJIIJ.LIZLLL(value);
        String str2 = LJIIJ.LIZJ().LJIIIIZZ;
        o.LJIIIIZZ(str2, "urlBuilder.build().toString()");
        onUrlChanged(event, str2, "replace", C47261Igj.LJJIJ(new OperatePairs(str, null, value, null, 10, null)), "domain");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replacePath(C65902Pti event, Map<String, ReplaceConfig> keys) {
        String LJFF;
        ReplaceConfig replaceConfig;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj == null || (replaceConfig = keys.get((LJFF = requestObj.url().LJFF()))) == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
            return;
        }
        C64627PXz LJIIJ = requestObj.url().LJIIJ();
        if (value != null) {
            if (value.startsWith("/")) {
                LJIIJ.LJI(0, value.length(), value);
                String str = LJIIJ.LIZJ().LJIIIIZZ;
                o.LJIIIIZZ(str, "urlBuilder.build().toString()");
                onUrlChanged(event, str, "replace", C47261Igj.LJJIJ(new OperatePairs(LJFF, null, value, null, 10, null)), "path");
                return;
            }
            throw new IllegalArgumentException(i0.LJFF("unexpected encodedPath: ", value));
        }
        throw new NullPointerException("encodedPath == null");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceScheme(C65902Pti event, Map<String, ReplaceConfig> keys) {
        String str;
        ReplaceConfig replaceConfig;
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj == null || (replaceConfig = keys.get((str = requestObj.url().LIZ))) == null || (value = replaceConfig.getValue()) == null || ujb.o.LJJJJJL(value)) {
            return;
        }
        C64627PXz LJIIJ = requestObj.url().LJIIJ();
        LJIIJ.LJII(value);
        String str2 = LJIIJ.LIZJ().LJIIIIZZ;
        o.LJIIIIZZ(str2, "urlBuilder.build().toString()");
        onUrlChanged(event, str2, "replace", C47261Igj.LJJIJ(new OperatePairs(str, null, value, null, 10, null)), "scheme");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void dropRequest(C65902Pti event, int i, String message) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(message, "message");
        C64709PaT c64709PaT = event.LJLIL.LJZI;
        c64709PaT.LJLJJI = true;
        C64597PWv c64597PWv = new C64597PWv();
        c64597PWv.LIZJ = i;
        c64597PWv.LIZIZ = EnumC64572PVw.HTTP_2;
        c64597PWv.LIZLLL = message;
        c64597PWv.LIZ = getRequestObj(event);
        C39745Fin LIZJ = C39745Fin.LIZJ("application/json; charset=utf-8");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{\"status_code\": ");
        LIZ.append(i);
        LIZ.append('}');
        c64597PWv.LJI = PVM.create(LIZJ, X1D.LIZIZ(LIZ));
        c64709PaT.LJLJJL = c64597PWv.LIZ();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void removeCookies(C65902Pti event, List<String> keys, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            C64605PXd LJI = requestObj.headers().LJI();
            LJI.LIZLLL("cookie");
            convertCanonicalListByIgnoreCase(z, keys);
            ArrayList arrayList = new ArrayList();
            String header = requestObj.header("cookie");
            if (header != null) {
                int i = 6;
                List<String> LJLJJL = s.LJLJJL(header, new String[]{";"}, 0, 6);
                StringBuilder sb = new StringBuilder();
                for (String str : LJLJJL) {
                    Object[] array = s.LJLJJL(str, new String[]{"="}, 0, i).toArray(new String[0]);
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length < 2) {
                            sb.append(str);
                            sb.append(";");
                        } else {
                            String str2 = strArr[0];
                            if (z) {
                                Locale locale = Locale.ROOT;
                                o.LJIIIIZZ(locale, "Locale.ROOT");
                                if (str2 != null) {
                                    str2 = str2.toLowerCase(locale);
                                    o.LJIIIIZZ(str2, "(this as java.lang.String).toLowerCase(locale)");
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                            if (keys.contains(str2)) {
                                arrayList.add(new OperatePairs(strArr[0], strArr[1], null, null, 12, null));
                            } else {
                                sb.append(str);
                                sb.append(";");
                            }
                            i = 6;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                LJI.LIZ("cookie", sb.toString());
            }
            onHeaderChanged(event, new C64606PXe(LJI), "remove", "cookie", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void removeHeaders(C65902Pti event, List<String> keys, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            C64605PXd LJI = requestObj.headers().LJI();
            for (String str : keys) {
                String LIZJ = LJI.LIZJ(str);
                if (LIZJ != null && LIZJ.length() != 0) {
                    arrayList.add(new OperatePairs(str, LJI.LIZJ(str), null, null, 12, null));
                }
                LJI.LIZLLL(str);
            }
            onHeaderChanged(event, new C64606PXe(LJI), "remove", "header", arrayList);
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
            Uri uri = UriProtector.parse(requestObj.url().LJIIIIZZ);
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
        boolean z2;
        String str;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            convertCanonicalMapByIgnoreCase(z, keys);
            String header = requestObj.header("cookie");
            if (header != null) {
                int i = 0;
                int i2 = 6;
                for (String str2 : s.LJLJJL(header, new String[]{";"}, 0, 6)) {
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
                            ReplaceConfig replaceConfig = keys.get(str3);
                            if (replaceConfig == null) {
                                sb.append(str2);
                                sb.append(";");
                                i = 0;
                            } else {
                                if (o.LJ(replaceConfig.getTarget(), "value")) {
                                    sb.append(strArr[0]);
                                    sb.append("=");
                                    sb.append(replaceConfig.getValue());
                                    sb.append(";");
                                    str = replaceConfig.getValue();
                                    z2 = !TextUtils.equals(strArr[1], str);
                                    i = 0;
                                    value = null;
                                } else {
                                    sb.append(replaceConfig.getValue());
                                    sb.append("=");
                                    sb.append(strArr[1]);
                                    sb.append(";");
                                    value = replaceConfig.getValue();
                                    i = 0;
                                    if (!TextUtils.equals(strArr[0], value)) {
                                        z2 = true;
                                        str = null;
                                    }
                                }
                                if (z2) {
                                    arrayList.add(new OperatePairs(strArr[i], strArr[1], value, str));
                                }
                            }
                        }
                        i2 = 6;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                C64605PXd LJI = requestObj.headers().LJI();
                LJI.LIZLLL("cookie");
                LJI.LIZ("cookie", sb.toString());
                onHeaderChanged(event, new C64606PXe(LJI), "replace", "cookie", arrayList);
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public void replaceHeaders(C65902Pti event, Map<String, ReplaceConfig> keys, boolean z) {
        String value;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(keys, "keys");
        Request requestObj = getRequestObj(event);
        if (requestObj != null) {
            ArrayList arrayList = new ArrayList();
            C64605PXd LJI = requestObj.headers().LJI();
            for (Map.Entry<String, ReplaceConfig> entry : keys.entrySet()) {
                String LIZJ = LJI.LIZJ(entry.getKey());
                if (LIZJ != null && LIZJ.length() != 0) {
                    ReplaceConfig value2 = entry.getValue();
                    String str = null;
                    if (o.LJ(value2.getTarget(), "value")) {
                        LJI.LJ(entry.getKey(), value2.getValue());
                        value = value2.getValue();
                        if (!TextUtils.equals(LIZJ, value)) {
                            arrayList.add(new OperatePairs(entry.getKey(), LIZJ, str, value));
                        }
                    } else {
                        LJI.LIZLLL(entry.getKey());
                        LJI.LJ(value2.getValue(), LIZJ);
                        String value3 = value2.getValue();
                        value = null;
                        str = value3;
                        if (true ^ TextUtils.equals(entry.getKey(), value3)) {
                            arrayList.add(new OperatePairs(entry.getKey(), LIZJ, str, value));
                        }
                    }
                }
            }
            onHeaderChanged(event, new C64606PXe(LJI), "replace", "header", arrayList);
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
            Uri uri = UriProtector.parse(requestObj.url().LJIIIIZZ);
            o.LJIIIIZZ(uri, "uri");
            Set<String> queryNameSet = UriProtector.getQueryParameterNames(uri);
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            convertCanonicalMapByIgnoreCase(z, keys);
            ArrayList arrayList = new ArrayList();
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

    private final void onHeaderChanged(C65902Pti c65902Pti, C64606PXe c64606PXe, String str, String str2, List<OperatePairs> list) {
        Request request;
        C64618PXq newBuilder;
        if (list == null || list.isEmpty()) {
            return;
        }
        Request requestObj = getRequestObj(c65902Pti);
        C64709PaT c64709PaT = c65902Pti.LJLIL.LJZI;
        c64709PaT.LJLJI = true;
        if (requestObj != null && (newBuilder = requestObj.newBuilder()) != null) {
            newBuilder.LIZJ = c64606PXe.LJI();
            request = newBuilder.LIZIZ();
        } else {
            request = null;
        }
        c64709PaT.LJLJJL = request;
        c65902Pti.LJLIL.LJLZ.add(new OperateHistory(str, str2, list));
        c65902Pti.LJLLLLLL = C113554cx.LJJLIL(c64606PXe.LJIIIZ());
        c65902Pti.LJLZ = null;
    }

    private final void onUrlChanged(C65902Pti c65902Pti, String str, String str2, List<OperatePairs> list, String str3) {
        Request request;
        C64618PXq newBuilder;
        if (list == null || list.isEmpty()) {
            return;
        }
        Request requestObj = getRequestObj(c65902Pti);
        C64709PaT c64709PaT = c65902Pti.LJLIL.LJZI;
        c64709PaT.LJLJI = true;
        if (requestObj != null && (newBuilder = requestObj.newBuilder()) != null) {
            newBuilder.LJII(str);
            request = newBuilder.LIZIZ();
        } else {
            request = null;
        }
        c64709PaT.LJLJJL = request;
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
