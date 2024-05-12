package com.ss.android.ugc.aweme.feed.api;

import X.C35515Dwl;
import X.C36910EeA;
import X.C36922EeM;
import X.C38322F2g;
import X.C64668PZo;
import X.C64797Pbt;
import X.C65314PkE;
import X.F1W;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import com.bytedance.retrofit2.client.Request;
import ujb.s;

/* loaded from: classes7.dex */
public final class FetchNetworkInfoInterceptor implements InterfaceC37216Ej6 {
    public volatile boolean LJLIL;
    public volatile int LJLILLLLZI;

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        String url;
        Object obj;
        int i;
        String url2;
        String url3;
        int i2 = 1;
        String str = null;
        try {
            Request request = ((F7S) fbz).LIZJ;
            C64797Pbt<?> LIZ = ((F7S) fbz).LIZ(request);
            if (!C65314PkE.LJIIIZ(request)) {
                return LIZ;
            }
            C36910EeA c36910EeA = LIZ.LIZ;
            if (c36910EeA != null) {
                obj = c36910EeA.LJFF;
            } else {
                obj = null;
            }
            if (obj instanceof C64668PZo) {
                long j = ((C64668PZo) obj).LIZJ;
                if (j <= 0) {
                    return LIZ;
                }
                String str2 = ((C64668PZo) obj).LJIL;
                if (request != null && (url3 = request.getUrl()) != null && s.LJJJLZIJ(url3, "first_retry", false)) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.LJLIL && request != null && (url2 = request.getUrl()) != null && s.LJJJLZIJ(url2, "pull_type=0", false)) {
                    this.LJLIL = false;
                    this.LJLILLLLZI = 0;
                    i += this.LJLILLLLZI;
                }
                Integer valueOf = Integer.valueOf(i);
                if (request != null) {
                    str = request.getUrl();
                }
                C38322F2g.LIZ.putIfAbsent(Long.valueOf(j), new C35515Dwl(str2, valueOf, str));
                T t = LIZ.LIZIZ;
                if (t instanceof F1W) {
                    ((F1W) t).setNetworkInfoKey(Long.valueOf(j));
                }
            } else {
                C36922EeM.LIZLLL(4, "FetchNetworkInfoInterceptor", "isn't BaseHttpRequestInfo:" + obj);
            }
            return LIZ;
        } catch (Throwable th) {
            Request request2 = ((F7S) fbz).LIZJ;
            if (C65314PkE.LJIIIZ(request2) && request2 != null && (url = request2.getUrl()) != null && s.LJJJLZIJ(url, "is_cold_start=1", false)) {
                this.LJLIL = true;
                if (s.LJJJLZIJ(url, "first_retry", false)) {
                    i2 = 2;
                }
                this.LJLILLLLZI = i2;
            }
            throw th;
        }
    }
}
