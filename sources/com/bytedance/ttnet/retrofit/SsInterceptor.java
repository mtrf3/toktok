package com.bytedance.ttnet.retrofit;

import X.C16880lQ;
import X.C17N;
import X.C36910EeA;
import X.C38299F1j;
import X.C38354F3m;
import X.C48153Iv7;
import X.C48870JFy;
import X.C64672PZs;
import X.C64759PbH;
import X.C64797Pbt;
import X.C78949Uyf;
import X.EJ6;
import X.EZX;
import X.EZY;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class SsInterceptor extends BaseSsInterceptor {
    public static volatile boolean LJLIL;

    /* JADX WARN: Removed duplicated region for block: B:22:0x018d A[Catch: all -> 0x0197, TRY_LEAVE, TryCatch #2 {all -> 0x0197, blocks: (B:16:0x0165, B:20:0x0187, B:22:0x018d), top: B:15:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.retrofit2.client.Request LIZ(com.bytedance.retrofit2.client.Request r13) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.retrofit.SsInterceptor.LIZ(com.bytedance.retrofit2.client.Request):com.bytedance.retrofit2.client.Request");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.retrofit.BaseSsInterceptor
    public final void LIZIZ(Request request, C64797Pbt c64797Pbt) {
        String str;
        C64672PZs c64672PZs;
        String str2;
        String url;
        Uri parse;
        String host;
        String str3;
        int i;
        String str4;
        if (c64797Pbt == null) {
            return;
        }
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIL = SystemClock.uptimeMillis() - valueOf.longValue();
        }
        ClientKeyManager LJFF = ClientKeyManager.LJFF();
        synchronized (LJFF) {
            str = null;
            if (ClientKeyManager.LJII != null && ClientKeyManager.LJIIIIZZ) {
                Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
                try {
                    URI LIZJ = EZY.LIZJ(request.getUrl());
                    if (LIZJ != null && LIZJ.getScheme().equals("https")) {
                        if (!((CopyOnWriteArrayList) LJFF.LIZ).isEmpty()) {
                            Iterator it = ((CopyOnWriteArrayList) LJFF.LIZ).iterator();
                            while (it.hasNext()) {
                                if (EZX.LIZIZ(LIZJ.getHost(), (String) it.next())) {
                                }
                            }
                        }
                        if (!((CopyOnWriteArrayList) LJFF.LIZIZ).isEmpty()) {
                            Iterator it2 = ((CopyOnWriteArrayList) LJFF.LIZIZ).iterator();
                            while (it2.hasNext()) {
                                if (EZX.LIZIZ(LIZJ.getPath(), (String) it2.next())) {
                                    String str5 = "";
                                    List<EJ6> LIZIZ = c36910EeA.LIZIZ("Set-Cookie");
                                    if (LIZIZ != null && !LIZIZ.isEmpty()) {
                                        Iterator<EJ6> it3 = LIZIZ.iterator();
                                        while (it3.hasNext()) {
                                            str3 = it3.next().LIZIZ.trim();
                                            if (str3.toLowerCase().startsWith("sessionid=")) {
                                                break;
                                            }
                                        }
                                    }
                                    str3 = "";
                                    String[] split = str3.split(";");
                                    if (split != null && split.length > 0) {
                                        str5 = split[0].trim();
                                    }
                                    if (!TextUtils.isEmpty(str5)) {
                                        Logger.debug();
                                        String str6 = "";
                                        String str7 = "";
                                        EJ6 LIZ = c36910EeA.LIZ("x-bd-lanusk");
                                        EJ6 LIZ2 = c36910EeA.LIZ("x-bd-lanusv");
                                        if (LIZ != null && LIZ2 != null) {
                                            str6 = LIZ.LIZIZ;
                                            str7 = LIZ2.LIZIZ;
                                            if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
                                                str6 = "";
                                                str7 = "";
                                                i = 1;
                                            } else {
                                                i = 0;
                                            }
                                        } else if (str5.equals(LJFF.LIZLLL)) {
                                            str6 = LJFF.LIZJ;
                                            str7 = LJFF.LJFF;
                                            i = 2;
                                        } else {
                                            i = 3;
                                        }
                                        try {
                                            str4 = str6;
                                            try {
                                                ClientKeyManager.LJI(i, LJFF.LIZLLL, str5, LJFF.LIZJ, str6, LJFF.LJFF, str7, c36910EeA, LIZJ.getPath());
                                            } catch (Throwable unused) {
                                            }
                                        } catch (Throwable unused2) {
                                            str4 = str6;
                                        }
                                        LJFF.LIZJ = str4;
                                        LJFF.LJFF = str7;
                                        String url2 = request.getUrl();
                                        LJFF.LJ = url2;
                                        LJFF.LIZLLL = str5;
                                        ClientKeyManager.LJII.storeString("session_url", url2);
                                        ClientKeyManager.LJII.storeString("session_id", str3);
                                        ClientKeyManager.LJII.storeString("client_key", LJFF.LIZJ);
                                        ClientKeyManager.LJII.storeString("kms_version", LJFF.LJFF);
                                        ClientKeyManager.LJII.storeLong("session_time", System.currentTimeMillis());
                                        ClientKeyManager.LJIIJ = ClientKeyManager.LJ(LJFF.LIZJ, LJFF.LJFF);
                                        if (request.getMetrics() != null) {
                                            request.getMetrics().LJJIJL = SystemClock.uptimeMillis() - valueOf2.longValue();
                                        }
                                        Logger.debug();
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        Long valueOf3 = Long.valueOf(SystemClock.uptimeMillis());
        Object obj = c36910EeA.LJFF;
        if (obj instanceof C64672PZs) {
            c64672PZs = (C64672PZs) obj;
            if (c64672PZs.LIZIZ != 0) {
                JSONObject jSONObject = new JSONObject();
                List<EJ6> list = c36910EeA.LIZLLL;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    try {
                        EJ6 ej6 = (EJ6) ListProtector.get(list, i2);
                        if (ej6 != null && !TextUtils.isEmpty(ej6.LIZ)) {
                            jSONObject.put(ej6.LIZ.toUpperCase(), ej6.LIZIZ);
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                T t = c64672PZs.LIZIZ;
                if (t instanceof C48153Iv7) {
                    t.getClass();
                }
                T t2 = c64672PZs.LIZIZ;
                t2.LIZIZ = c36910EeA.LIZIZ;
                t2.LIZ = c64672PZs.LIZ;
            }
        } else {
            c64672PZs = null;
        }
        try {
            request.getFirstHeader("X-SS-REQ-TICKET");
            c36910EeA.LIZ("X-SS-REQ-TICKET");
        } catch (Throwable unused4) {
        }
        try {
            url = request.getUrl();
            parse = UriProtector.parse(url);
            host = parse.getHost();
            C17N.LJIL();
        } catch (Throwable unused5) {
        }
        if (!host.endsWith(".tiktokv.com")) {
            return;
        }
        String[] strArr = {"sessionid", "tt_sessionid"};
        List<EJ6> LIZIZ2 = c36910EeA.LIZIZ(new String[]{"Set-Cookie"}[0]);
        if (LIZIZ2 != null && LIZIZ2.size() > 0) {
            for (EJ6 ej62 : LIZIZ2) {
                int i3 = 0;
                do {
                    String LJIL = C78949Uyf.LJIL(ej62.LIZIZ, strArr[i3]);
                    Logger.debug();
                    if (!C38354F3m.LJ(LJIL)) {
                        int i4 = c36910EeA.LIZIZ;
                        c64672PZs.getClass();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            String encodedQuery = parse.getEncodedQuery();
                            if (!C38354F3m.LJ(encodedQuery)) {
                                jSONObject2.put("url_query", encodedQuery);
                            }
                        } catch (Throwable unused6) {
                        }
                        if (!C38354F3m.LJ(c64672PZs.LIZ)) {
                            jSONObject2.put("remote_ip", c64672PZs.LIZ);
                        }
                        List<EJ6> list2 = c36910EeA.LIZLLL;
                        if (list2 != null) {
                            jSONObject2.put("header_list", list2.toString());
                        }
                        int indexOf = url.indexOf("?");
                        if (indexOf == -1) {
                            indexOf = url.length();
                        }
                        C64759PbH.LIZ(i4, url.substring(0, indexOf), jSONObject2);
                    }
                    i3++;
                } while (i3 < 2);
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIJIIJI = SystemClock.uptimeMillis() - valueOf3.longValue();
        }
        Long valueOf4 = Long.valueOf(SystemClock.uptimeMillis());
        if (C48870JFy.LIZ && c64672PZs != null) {
            EJ6 firstHeader = request.getFirstHeader("X-TT-VERIFY-ID");
            if (firstHeader != null) {
                str2 = firstHeader.LIZIZ;
            } else {
                str2 = null;
            }
            EJ6 LIZ3 = c36910EeA.LIZ("X-TT-VERIFY-ID");
            if (LIZ3 != null) {
                str = LIZ3.LIZIZ;
            }
            if (str2 != null) {
                if (str == null) {
                    c64672PZs.LJJIJL = 1;
                } else if (str2.equals(str)) {
                    c64672PZs.LJJIJL = 2;
                } else {
                    c64672PZs.LJJIJL = 3;
                    try {
                        c36910EeA.LJ.in().close();
                    } catch (Throwable unused7) {
                    }
                }
                if (c64672PZs.LJJIJL == 3) {
                    throw new C38299F1j("Fail to verify cdn cache");
                }
            }
        }
        if (request.getMetrics() != null) {
            request.getMetrics().LJJIJLIJ = SystemClock.uptimeMillis() - valueOf4.longValue();
        }
    }
}
