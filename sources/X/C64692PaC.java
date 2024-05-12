package X;

import Y.ARunnableS15S0101000_11;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import defpackage.a1;
import defpackage.i0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PaC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64692PaC implements InterfaceC64803Pbz, InterfaceC64703PaN, InterfaceC37818Eso, InterfaceC48115IuV, WeakHandler.IHandler {
    public static final HandlerThread LLIIII;
    public static boolean LLIIIILZ;
    public static final Class LLIIIJ;
    public final C64738Paw LJLIL;
    public volatile long LJLILLLLZI;
    public String LJLJI;
    public volatile boolean LJLJJI;
    public final Request LJLJJL;
    public String LJLJJLL;
    public final long LJLJL;
    public final C64668PZo LJLJLJ;
    public final java.util.Set<String> LJLJLLL;
    public final String LJLL;
    public final String LJLLI;
    public final String LJLLILLLL;
    public final List<String> LJLLJ;
    public final Object LJLLL;
    public volatile AtomicInteger LJLLLL;
    public final List<HttpURLConnection> LJLLLLLL;
    public volatile boolean LJLZ;
    public volatile HttpURLConnection LJZ;
    public volatile int LJZI;
    public volatile HttpURLConnection LJZL;
    public final List<C64695PaF> LL;
    public volatile int LLD;
    public final CountDownLatch LLF;
    public final WeakHandler LLFF;
    public final long LLFFF;
    public final boolean LLFII;
    public long LLFZ;
    public String LLI;
    public boolean LLIFFJFJJ;
    public String LLII;

    static {
        C16880lQ.LJLLJ(C64692PaC.class);
        LLIIII = new HandlerThread("Concurrent-Handler");
        try {
            LLIIIJ = Class.forName("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl");
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
        LLIIII.start();
    }

    public final void LIZLLL() {
        this.LLFF.removeCallbacksAndMessages(null);
        synchronized (this.LJLLL) {
            if (this.LJLZ) {
                return;
            }
            Iterator it = ((CopyOnWriteArrayList) this.LJLLLLLL).iterator();
            while (it.hasNext()) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) it.next();
                if (httpURLConnection != null) {
                    Iterator it2 = ((CopyOnWriteArrayList) this.LL).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C64695PaF c64695PaF = (C64695PaF) it2.next();
                        if (c64695PaF.LIZ == httpURLConnection.hashCode()) {
                            c64695PaF.LIZLLL = System.currentTimeMillis();
                            c64695PaF.LJ = -999;
                            c64695PaF.LJI = new IOException("cleanupMessagesAndPendingConnections");
                            break;
                        }
                    }
                    httpURLConnection.disconnect();
                    ((CopyOnWriteArrayList) this.LJLLLLLL).remove(httpURLConnection);
                }
            }
            this.LJLIL.LIZLLL = LJI();
            this.LJLZ = true;
        }
    }

    public final void LJ() {
        C64834PcU c64834PcU = new C64834PcU("Concurrent-Call", EnumC64807Pc3.IMMEDIATE, 0, new ARunnableS15S0101000_11(3, this, 8));
        if (C64831PcR.LIZJ == null) {
            synchronized (C64831PcR.class) {
                if (C64831PcR.LIZJ == null) {
                    C64831PcR.LIZJ = new C64831PcR();
                }
            }
        }
        C64831PcR.LIZJ.LIZ(c64834PcU);
        long j = this.LLFFF;
        Message obtain = Message.obtain();
        obtain.what = 0;
        obtain.obj = this;
        this.LLFF.sendMessageDelayed(obtain, j);
    }

    public final JSONObject LJI() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("concurrent", ((CopyOnWriteArrayList) this.LL).size() - 1);
            jSONObject.put("duration", System.currentTimeMillis() - this.LJLJL);
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((CopyOnWriteArrayList) this.LL).iterator();
            while (it.hasNext()) {
                jSONArray.put(((C64695PaF) it.next()).LIZ());
            }
            jSONObject.put("tasks", jSONArray);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    @Override // X.InterfaceC37818Eso
    public final void doCollect() {
        C64693PaD.LJIIJJI(this.LJZ, this.LJLJLJ, this.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0102, code lost:
    
        if (r4 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0196 A[Catch: all -> 0x022c, Exception -> 0x022f, TryCatch #1 {Exception -> 0x022f, blocks: (B:28:0x0086, B:30:0x008a, B:32:0x0092, B:37:0x00b1, B:38:0x00b4, B:40:0x00cd, B:41:0x00d1, B:44:0x0110, B:51:0x015f, B:53:0x0163, B:55:0x016c, B:56:0x0171, B:58:0x0179, B:59:0x017e, B:66:0x0196, B:68:0x019c, B:69:0x01a0, B:70:0x0157, B:72:0x01b8, B:78:0x0208, B:79:0x022b, B:84:0x01e8, B:87:0x01f5, B:88:0x012d, B:89:0x00e6, B:93:0x010a, B:99:0x0104, B:101:0x0108), top: B:27:0x0086 }] */
    @Override // X.InterfaceC64803Pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C36910EeA execute() {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64692PaC.execute():X.EeA");
    }

    @Override // X.InterfaceC64803Pbz
    public final void cancel() {
        Logger.debug();
        synchronized (this.LJLLL) {
            this.LLF.countDown();
            LIZLLL();
            if (this.LJZ != null) {
                this.LJZ.disconnect();
                if (this.LJLJJL.isResponseStreaming() && !this.LJLJJI) {
                    doCollect();
                    this.LJLJLJ.LJJIJIIJI = C64693PaD.LJIIIZ(this.LLI);
                    this.LJLJLJ.LJII = System.currentTimeMillis();
                    C64668PZo c64668PZo = this.LJLJLJ;
                    T t = c64668PZo.LIZIZ;
                    if (t == 0 || t.LJIILL) {
                        long j = c64668PZo.LJII;
                        long j2 = this.LJLJL;
                        C64735Pat.LIZLLL(j - j2, j2, this.LJLJJL.getUrl(), this.LJLJI, this.LJLJLJ);
                    }
                    PNI LIZ = PNI.LIZ();
                    String url = this.LJLJJL.getUrl();
                    C64668PZo c64668PZo2 = this.LJLJLJ;
                    LIZ.LIZIZ(c64668PZo2.LJIIZILJ, c64668PZo2.LJIJ, url, c64668PZo2.LJJIJIIJI, c64668PZo2.LJIL);
                }
            }
            this.LJLJJI = true;
        }
    }

    @Override // X.InterfaceC48115IuV
    public final Object getRequestInfo() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC64803Pbz
    public final boolean LIZIZ(long j) {
        this.LJLILLLLZI = j;
        if (this.LJZ != null) {
            try {
                Reflect.on(this.LJZ).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public final int LJII(java.util.Map<String, String> map) {
        if (this.LJZ != null) {
            this.LJZ.disconnect();
        }
        String url = this.LJLJJL.getUrl();
        try {
            this.LJZ = C64693PaD.LJ(url, this.LJLJJL, this.LJLJLJ, this.LJLILLLLZI);
            C64693PaD.LIZIZ(this.LJZ, map);
            return C64693PaD.LJIJJ(this.LJLJJL, this.LJZ);
        } catch (Exception e) {
            C64693PaD.LJIJI(url, this.LJLJLJ, e, this.LJZ, this.LJLIL);
            this.LJLJJI = true;
            if (e instanceof C64800Pbw) {
                throw e;
            }
            C64800Pbw c64800Pbw = new C64800Pbw(e.getMessage(), e.getCause());
            c64800Pbw.setInfo(true, false, true, url, this.LJLJI, this.LJLJLJ);
            throw c64800Pbw;
        }
    }

    public final int LJIIIIZZ(int i) {
        HttpURLConnection httpURLConnection = this.LJZ;
        C64668PZo c64668PZo = this.LJLJLJ;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(httpURLConnection.getHeaderFields());
        C64687Pa7 LJI = C64735Pat.LJI(c64668PZo, i, new C64691PaB(httpURLConnection), treeMap);
        if (LJI.LIZ) {
            return LJII(LJI.LIZJ);
        }
        if (!C38354F3m.LJ(this.LJLJLJ.LJJIIZ) && LJI.LIZIZ) {
            this.LLII = this.LJLJLJ.LJJIIZ;
        }
        return i;
    }

    public final int LJIIIZ(int i) {
        C64687Pa7 LJJIFFI = C64693PaD.LJJIFFI(this.LJZ, this.LJLJLJ, i);
        if (LJJIFFI.LIZ) {
            this.LJLJLJ.LJJIIJZLJL = true;
            java.util.Map<String, String> map = LJJIFFI.LIZJ;
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("x-tt-bdturing-retry", "1");
            return LJII(map);
        }
        if (this.LJLJLJ.LJJIII) {
            this.LLIFFJFJJ = true;
        }
        return i;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (!(obj instanceof C64692PaC)) {
                return;
            }
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        C64692PaC c64692PaC = (C64692PaC) obj;
                        if (c64692PaC.LLFF.obtainMessage(0) != null) {
                            c64692PaC.LLFF.removeMessages(0);
                            c64692PaC.LJ();
                        }
                    }
                } else {
                    ((C64692PaC) obj).LJ();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public C64692PaC(Request request, C64696PaG c64696PaG) {
        C64668PZo create = C64668PZo.LJJIJIL.create();
        this.LJLJLJ = create;
        this.LJLJLLL = new CopyOnWriteArraySet();
        this.LJLLJ = new ArrayList();
        this.LJLLL = new Object();
        this.LJLLLL = new AtomicInteger(0);
        this.LJLLLLLL = new CopyOnWriteArrayList();
        this.LJLZ = false;
        this.LJZ = null;
        this.LJZI = -1;
        this.LJZL = null;
        this.LL = new CopyOnWriteArrayList();
        this.LLD = 0;
        this.LLF = new CountDownLatch(1);
        this.LLFF = new WeakHandler(LLIIII.getLooper(), this);
        this.LLIFFJFJJ = false;
        Logger.debug();
        this.LJLJJL = request;
        C64738Paw metrics = request.getMetrics();
        this.LJLIL = metrics;
        create.LJJIJIIJIL = metrics;
        String url = request.getUrl();
        this.LJLJJLL = url;
        android.net.Uri parse = UriProtector.parse(url);
        String scheme = parse.getScheme();
        String LJ = a1.LJ(scheme, "://", parse.getHost());
        String query = parse.getQuery();
        Iterator<String> it = c64696PaG.LIZIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            String replaceFirst = this.LJLJJLL.replaceFirst(LJ, a1.LJ(scheme, "://", it.next()));
            if (!TextUtils.isEmpty(query)) {
                replaceFirst = query.contains("concurrent=") ? replaceFirst : YE1.LIZIZ(replaceFirst, "&concurrent=", i);
                if (i > 0 && !query.contains("is_retry=")) {
                    replaceFirst = i0.LJFF(replaceFirst, "&is_retry=1");
                }
            }
            i++;
            ((ArrayList) this.LJLLJ).add(replaceFirst);
        }
        String uuid = UUID.randomUUID().toString();
        this.LJLL = uuid;
        this.LJLLI = c64696PaG.LJIIIIZZ;
        this.LJLLILLLL = c64696PaG.LJIILL;
        this.LLFFF = c64696PaG.LJIIL;
        LLIIIILZ = c64696PaG.LJIILIIL;
        this.LLFII = c64696PaG.LJIILJJIL;
        this.LLFZ = 30000;
        if (request.getExtraInfo() instanceof C64697PaH) {
            C64697PaH c64697PaH = (C64697PaH) request.getExtraInfo();
            long j = c64697PaH.LJIIIIZZ;
            if (j > 0) {
                this.LLFZ = j;
            } else {
                long j2 = c64697PaH.LIZJ;
                if (j2 > 0) {
                    long j3 = c64697PaH.LIZLLL;
                    if (j3 > 0) {
                        this.LLFZ = j2 + j3;
                    }
                }
            }
        }
        this.LLFZ += 1000;
        Logger.debug();
        C64738Paw c64738Paw = this.LJLIL;
        if (c64738Paw != null) {
            c64738Paw.LJ = uuid;
            c64738Paw.LJFF = true;
            C64668PZo c64668PZo = this.LJLJLJ;
            c64668PZo.LIZJ = c64738Paw.LJII;
            c64668PZo.LIZLLL = c64738Paw.LJIIIIZZ;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLJL = currentTimeMillis;
        C64668PZo c64668PZo2 = this.LJLJLJ;
        c64668PZo2.LJ = currentTimeMillis;
        c64668PZo2.LJIJI = 0;
        if (this.LJLJJL.isResponseStreaming()) {
            this.LJLJLJ.LJJI = true;
        } else {
            this.LJLJLJ.LJJI = false;
        }
        if (request.getExtraInfo() instanceof C64697PaH) {
            this.LJLJLJ.LIZIZ = (T) request.getExtraInfo();
            this.LJLJLJ.LIZIZ.getClass();
        }
    }

    @Override // X.InterfaceC64703PaN
    public final void LIZ(Throwable th, boolean z) {
        synchronized (this.LJLLL) {
            this.LLF.countDown();
            LIZLLL();
            if (this.LJZ == null) {
                return;
            }
            this.LJZ.disconnect();
            if (this.LJLJJI) {
                return;
            }
            doCollect();
            this.LJLJLJ.LJJIJIIJI = C64693PaD.LJIIIZ(this.LLI);
            this.LJLJLJ.LJII = System.currentTimeMillis();
            C64668PZo c64668PZo = this.LJLJLJ;
            T t = c64668PZo.LIZIZ;
            if (t == 0 || t.LJIILL) {
                C64735Pat.LJ(th, this.LJLJI, this.LJLJL, this.LJLJJL, c64668PZo, Boolean.valueOf(z));
            }
            if (this.LJLJJL.isResponseStreaming()) {
                PNI LIZ = PNI.LIZ();
                String url = this.LJLJJL.getUrl();
                C64668PZo c64668PZo2 = this.LJLJLJ;
                LIZ.LIZIZ(c64668PZo2.LJIIZILJ, c64668PZo2.LJIJ, url, c64668PZo2.LJJIJIIJI, c64668PZo2.LJIL);
            }
            this.LJLJJI = true;
        }
    }

    public final Boolean LJIIJ(String str, C64695PaF c64695PaF) {
        if (QE7.LJJIJ) {
            try {
                new java.net.URL(str).toURI();
                long currentTimeMillis = System.currentTimeMillis();
                String str2 = C64693PaD.LJJIIJ(str).LIZ;
                c64695PaF.LJIIIIZZ = System.currentTimeMillis() - currentTimeMillis;
                c64695PaF.LJII = new java.net.URI(str2).getHost();
                Logger.debug();
                if (((CopyOnWriteArraySet) this.LJLJLLL).contains(c64695PaF.LJII)) {
                    c64695PaF.LJIIIZ = Boolean.TRUE;
                    return Boolean.FALSE;
                }
                ((CopyOnWriteArraySet) this.LJLJLLL).add(c64695PaF.LJII);
                return Boolean.TRUE;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return Boolean.TRUE;
            }
        }
        Logger.debug();
        return Boolean.FALSE;
    }

    public final IOException LJFF(Exception exc, String str, HttpURLConnection httpURLConnection, boolean z) {
        int cronetInternalErrorCode;
        String str2 = str;
        if ((exc instanceof IOException) && exc.getMessage() != null && exc.getMessage().startsWith("request canceled")) {
            return (IOException) exc;
        }
        if ("com.ttnet.org.chromium.net.impl.NetworkExceptionImpl".equals(exc.getClass().getName()) || "com.ttnet.org.chromium.net.impl.o0".equals(exc.getClass().getName())) {
            cronetInternalErrorCode = C64693PaD.LIZLLL.getCronetInternalErrorCode(httpURLConnection);
        } else {
            cronetInternalErrorCode = 0;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.LJLJJLL;
        }
        if (z) {
            C64693PaD.LJIJI(str2, this.LJLJLJ, exc, httpURLConnection, this.LJLIL);
        } else if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        try {
            C64693PaD.LIZLLL(exc.getMessage(), this.LJLJJL.getPath());
            C64799Pbv c64799Pbv = new C64799Pbv(exc, this.LJLJLJ, this.LJLJI, cronetInternalErrorCode);
            if (z) {
                if (this.LJLJJL.isResponseStreaming()) {
                    this.LJLJLJ.LJJIJ.set(true);
                }
                c64799Pbv.setInfo(true, false, true, str2, this.LJLJI, this.LJLJLJ);
            } else {
                c64799Pbv.setInfo(false, false, false, str2, this.LJLJI, this.LJLJLJ);
            }
            return c64799Pbv;
        } catch (C64698PaI e) {
            return e;
        }
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
