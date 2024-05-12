package X;

import Y.ARunnableS8S0201000_5;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

/* renamed from: X.PNq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64358PNq extends UF5 {
    public static ExecutorService LIZLLL;
    public int LIZIZ;
    public final C1HQ LIZ = new C1HQ();
    public long LIZJ = -1;

    public static void LJIIL() {
        if (LIZLLL == null) {
            synchronized (C64358PNq.class) {
                if (LIZLLL == null) {
                    LIZLLL = C16880lQ.LLLLZI(1, new ThreadFactory() { // from class: X.P3f
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new PthreadThread(runnable, "image-net-requests-monitor");
                        }
                    });
                }
            }
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJ(String str) {
        this.LIZ.remove(str);
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LIZIZ(String str, String str2, java.util.Map<String, String> map) {
        List list = (List) this.LIZ.getOrDefault(str, null);
        if (list != null) {
            list.add(str2);
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIIIZZ(W5O w5o, String str, boolean z) {
        List list = (List) this.LIZ.remove(str);
        if (list != null) {
            final boolean contains = list.contains("NetworkFetchProducer");
            final android.net.Uri uri = w5o.LIZIZ;
            final long j = -1;
            if (this.LIZJ > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.LIZJ;
                this.LIZJ = -1L;
                j = currentTimeMillis;
            }
            LJIIL();
            LIZLLL.submit(new Runnable() { // from class: X.CJt
                @Override // java.lang.Runnable
                public final void run() {
                    String str2;
                    android.net.Uri uri2 = uri;
                    long j2 = j;
                    boolean z2 = contains;
                    if (uri2 != null) {
                        str2 = uri2.toString();
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", str2);
                            jSONObject.put("fromNetwork", z2);
                            jSONObject.put("url_convert", false);
                            if (!TextUtils.isEmpty("")) {
                                jSONObject.put("caller_id", "");
                            }
                            jSONObject.put("duration", j2);
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        C09900aA.LJIIJJI("aweme_image_load_error_rate", 0, jSONObject);
                        if (j2 > 0) {
                            FUA.LJ("aweme_image_load", "load_time", (float) j2);
                        }
                    }
                }
            });
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJFF(W5O w5o, String str, Throwable th, boolean z) {
        this.LIZ.remove(str);
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        if (i == 0) {
            LJIIL();
            LIZLLL.submit(new ARunnableS8S0201000_5(2, w5o, th, 18));
        }
    }

    @Override // X.UF5, X.InterfaceC81754W6s
    public final void LJIIJ(W5O w5o, Object obj, String str, boolean z) {
        this.LIZ.put(str, new LinkedList());
        if (this.LIZJ == -1) {
            this.LIZJ = System.currentTimeMillis();
        }
    }
}
