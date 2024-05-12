package X;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.retrofit2.client.Request;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.TreeMap;

/* renamed from: X.Pa8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64688Pa8 implements InterfaceC64803Pbz, InterfaceC64703PaN, InterfaceC37818Eso, InterfaceC48115IuV {
    public static ICronetClient LJLLILLLL;
    public HttpURLConnection LJLIL;
    public final C64668PZo LJLILLLLZI;
    public final long LJLJI;
    public String LJLJJI;
    public final Request LJLJJL;
    public boolean LJLJJLL;
    public final C64738Paw LJLJL;
    public volatile long LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public String LJLLI;

    static {
        C16880lQ.LJLLJ(C64688Pa8.class);
    }

    @Override // X.InterfaceC64803Pbz
    public final void cancel() {
        HttpURLConnection httpURLConnection = this.LJLIL;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            if (this.LJLJJL.isResponseStreaming() && !this.LJLJJLL) {
                doCollect();
                this.LJLILLLLZI.LJJIJIIJI = C64693PaD.LJIIIZ(this.LJLJLLL);
                this.LJLILLLLZI.LJII = System.currentTimeMillis();
                C64668PZo c64668PZo = this.LJLILLLLZI;
                T t = c64668PZo.LIZIZ;
                if (t == 0 || t.LJIILL) {
                    long j = c64668PZo.LJII;
                    long j2 = this.LJLJI;
                    C64735Pat.LIZLLL(j - j2, j2, this.LJLJJL.getUrl(), this.LJLJJI, this.LJLILLLLZI);
                }
                PNI LIZ = PNI.LIZ();
                String url = this.LJLJJL.getUrl();
                C64668PZo c64668PZo2 = this.LJLILLLLZI;
                LIZ.LIZIZ(c64668PZo2.LJIIZILJ, c64668PZo2.LJIJ, url, c64668PZo2.LJJIJIIJI, c64668PZo2.LJIL);
            }
            this.LJLJJLL = true;
        }
    }

    @Override // X.InterfaceC37818Eso
    public final void doCollect() {
        C64693PaD.LJIIJJI(this.LJLIL, this.LJLILLLLZI, this.LJLJL);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0153 A[Catch: all -> 0x01f5, Exception -> 0x01f9, TryCatch #7 {Exception -> 0x01f9, all -> 0x01f5, blocks: (B:17:0x0040, B:19:0x0052, B:20:0x0056, B:23:0x008d, B:25:0x00a1, B:27:0x00b3, B:35:0x00fd, B:37:0x0101, B:39:0x0105, B:41:0x0109, B:43:0x0147, B:44:0x010d, B:46:0x0116, B:47:0x011b, B:49:0x0123, B:50:0x0128, B:62:0x0153, B:64:0x0159, B:65:0x015d, B:66:0x00f5, B:68:0x0184, B:74:0x01d2, B:75:0x01f4, B:80:0x01b2, B:83:0x01bf, B:84:0x00c5, B:85:0x0069, B:87:0x0081, B:89:0x0085, B:90:0x0087, B:70:0x018a, B:72:0x0190, B:73:0x019d, B:78:0x0197), top: B:16:0x0040, inners: #2 }] */
    @Override // X.InterfaceC64803Pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C36910EeA execute() {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64688Pa8.execute():X.EeA");
    }

    @Override // X.InterfaceC48115IuV
    public final Object getRequestInfo() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC64803Pbz
    public final boolean LIZIZ(long j) {
        this.LJLJLJ = j;
        HttpURLConnection httpURLConnection = this.LJLIL;
        if (httpURLConnection != null) {
            try {
                Reflect.on(httpURLConnection).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public final int LIZLLL(java.util.Map<String, String> map) {
        HttpURLConnection httpURLConnection = this.LJLIL;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        String url = this.LJLJJL.getUrl();
        try {
            HttpURLConnection LJ = C64693PaD.LJ(url, this.LJLJJL, this.LJLILLLLZI, this.LJLJLJ);
            this.LJLIL = LJ;
            C64693PaD.LIZIZ(LJ, map);
            return C64693PaD.LJIJJ(this.LJLJJL, this.LJLIL);
        } catch (Exception e) {
            C64693PaD.LJIJI(url, this.LJLILLLLZI, e, this.LJLIL, this.LJLJL);
            this.LJLJJLL = true;
            if (e instanceof C64800Pbw) {
                throw e;
            }
            C64800Pbw c64800Pbw = new C64800Pbw(e.getMessage(), e.getCause());
            c64800Pbw.setInfo(true, false, true, url, this.LJLJJI, this.LJLILLLLZI);
            throw c64800Pbw;
        }
    }

    public final int LJ(int i) {
        HttpURLConnection httpURLConnection = this.LJLIL;
        C64668PZo c64668PZo = this.LJLILLLLZI;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(httpURLConnection.getHeaderFields());
        C64687Pa7 LJI = C64735Pat.LJI(c64668PZo, i, new C64691PaB(httpURLConnection), treeMap);
        if (LJI.LIZ) {
            return LIZLLL(LJI.LIZJ);
        }
        if (!C38354F3m.LJ(this.LJLILLLLZI.LJJIIZ) && LJI.LIZIZ) {
            this.LJLLI = this.LJLILLLLZI.LJJIIZ;
        }
        return i;
    }

    public final int LJFF(int i) {
        C64687Pa7 LJJIFFI = C64693PaD.LJJIFFI(this.LJLIL, this.LJLILLLLZI, i);
        if (LJJIFFI.LIZ) {
            this.LJLILLLLZI.LJJIIJZLJL = true;
            java.util.Map<String, String> map = LJJIFFI.LIZJ;
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("x-tt-bdturing-retry", "1");
            return LIZLLL(map);
        }
        if (this.LJLILLLLZI.LJJIII) {
            this.LJLL = true;
        }
        return i;
    }

    public C64688Pa8(Request request, ICronetClient iCronetClient) {
        C64668PZo create = C64668PZo.LJJIJIL.create();
        this.LJLILLLLZI = create;
        this.LJLJJI = null;
        this.LJLJJLL = false;
        this.LJLJLJ = 0L;
        this.LJLL = false;
        this.LJLJJL = request;
        LJLLILLLL = iCronetClient;
        String url = request.getUrl();
        this.LJLIL = null;
        C64738Paw metrics = request.getMetrics();
        this.LJLJL = metrics;
        create.LJJIJIIJIL = metrics;
        if (metrics != null) {
            create.LIZJ = metrics.LJII;
            create.LIZLLL = metrics.LJIIIIZZ;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJI = currentTimeMillis;
        create.LJ = currentTimeMillis;
        create.LJIJI = 0;
        if (request.isResponseStreaming()) {
            create.LJJI = true;
        } else {
            create.LJJI = false;
        }
        if (request.getExtraInfo() instanceof C64697PaH) {
            T t = (T) request.getExtraInfo();
            create.LIZIZ = t;
            t.getClass();
        }
        try {
            this.LJLIL = C64693PaD.LJ(url, request, create, this.LJLJLJ);
        } catch (Exception e) {
            C64693PaD.LJIJI(url, this.LJLILLLLZI, e, this.LJLIL, this.LJLJL);
            this.LJLJJLL = true;
            if (e instanceof C64800Pbw) {
                throw e;
            }
            C64800Pbw c64800Pbw = new C64800Pbw(e.getMessage(), e.getCause());
            c64800Pbw.setInfo(true, false, true, url, this.LJLJJI, this.LJLILLLLZI);
            throw c64800Pbw;
        }
    }

    @Override // X.InterfaceC64703PaN
    public final void LIZ(Throwable th, boolean z) {
        HttpURLConnection httpURLConnection = this.LJLIL;
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.disconnect();
        if (this.LJLJJLL) {
            return;
        }
        doCollect();
        this.LJLILLLLZI.LJJIJIIJI = C64693PaD.LJIIIZ(this.LJLJLLL);
        this.LJLILLLLZI.LJII = System.currentTimeMillis();
        C64668PZo c64668PZo = this.LJLILLLLZI;
        T t = c64668PZo.LIZIZ;
        if (t == 0 || t.LJIILL) {
            C64735Pat.LJ(th, this.LJLJJI, this.LJLJI, this.LJLJJL, c64668PZo, Boolean.valueOf(z));
        }
        if (this.LJLJJL.isResponseStreaming()) {
            PNI LIZ = PNI.LIZ();
            String url = this.LJLJJL.getUrl();
            C64668PZo c64668PZo2 = this.LJLILLLLZI;
            LIZ.LIZIZ(c64668PZo2.LJIIZILJ, c64668PZo2.LJIJ, url, c64668PZo2.LJJIJIIJI, c64668PZo2.LJIL);
        }
        this.LJLJJLL = true;
    }

    public static byte[] LIZJ(String str, int i, HttpURLConnection httpURLConnection, long j, C64668PZo c64668PZo, String str2, int i2, C64738Paw c64738Paw) {
        if (str.indexOf("?") > 0) {
            if (C34577Dhd.LIZ().get(str.substring(0, str.indexOf("?"))) != null) {
                EEE.LIZ();
            }
        }
        return C64693PaD.LJIL(str, i, httpURLConnection, c64668PZo, str2, i2, c64738Paw);
    }
}
