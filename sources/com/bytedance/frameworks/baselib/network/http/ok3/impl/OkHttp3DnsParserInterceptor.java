package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import X.C16880lQ;
import X.C64608PXg;
import X.InterfaceC48118IuY;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class OkHttp3DnsParserInterceptor implements InterfaceC48118IuY {
    public static volatile OkHttp3DnsParserInterceptor LIZJ;
    public final ConcurrentMap<String, CopyOnWriteArrayList<C64608PXg>> LIZIZ;

    public static OkHttp3DnsParserInterceptor LIZJ() {
        if (LIZJ == null) {
            synchronized (OkHttp3DnsParserInterceptor.class) {
                if (LIZJ == null) {
                    LIZJ = new OkHttp3DnsParserInterceptor();
                }
            }
        }
        return LIZJ;
    }

    public OkHttp3DnsParserInterceptor() {
        C16880lQ.LJLLJ(OkHttp3DnsParserInterceptor.class);
        this.LIZIZ = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
    
        if (((r2.LIZLLL * 1000) + r2.LJ) <= (java.lang.System.currentTimeMillis() + r6.LJLJLJ.get())) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a0  */
    @Override // X.InterfaceC48118IuY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.net.InetAddress> LIZ(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3DnsParserInterceptor.LIZ(java.lang.String):java.util.List");
    }

    public final void LIZIZ(String str, C64608PXg c64608PXg) {
        if (c64608PXg == null) {
            return;
        }
        if (((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            ((CopyOnWriteArrayList) ((ConcurrentHashMap) this.LIZIZ).get(str)).add(c64608PXg);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(c64608PXg);
        ((ConcurrentHashMap) this.LIZIZ).put(str, copyOnWriteArrayList);
    }

    public final void LIZLLL(String str, C64608PXg c64608PXg) {
        if (c64608PXg != null && !TextUtils.isEmpty(str) && ((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            synchronized (this.LIZIZ) {
                List list = (List) ((ConcurrentHashMap) this.LIZIZ).get(str);
                if (list == null) {
                    return;
                }
                list.remove(c64608PXg);
                if (list.isEmpty()) {
                    ((ConcurrentHashMap) this.LIZIZ).remove(str);
                }
            }
        }
    }
}
