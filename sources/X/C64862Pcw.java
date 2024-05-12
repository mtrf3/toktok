package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import ee1.e;
import ee1.l;
import ee1.m;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Request;

/* renamed from: X.Pcw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64862Pcw implements WeakHandler.IHandler {
    public final Context LJLIL;
    public final C64865Pcz LJLILLLLZI;
    public C48130Iuk LJLJI;
    public C64600PWy LJLJJI;
    public Request LJLJJLL;
    public boolean LJLJL;
    public final WeakHandler LJLJLLL;
    public final C64863Pcx LJLL;
    public C64869Pd3 LJLLI;
    public PXI LJLLILLLL;
    public boolean LJLLJ;
    public final AbstractC64867Pd1 LJLLL;
    public final C64866Pd0 LJLLLL;
    public int LJLJJL = 3;
    public final java.util.Map<String, Object> LJLJLJ = new ConcurrentHashMap();

    public final synchronized int LIZLLL() {
        return this.LJLJJL;
    }

    public final void LJI() {
        C64869Pd3 c64869Pd3;
        Request request = this.LJLJJLL;
        if (request != null && (c64869Pd3 = this.LJLLI) != null) {
            c64869Pd3.LIZ(request.url().LJIIIIZZ, 3, "heatbeat timeout");
        }
        Pair<String, Long> LIZIZ = this.LJLJI.LIZIZ(null);
        LJIIJJI();
        PXI pxi = this.LJLLILLLL;
        if (pxi != null) {
            pxi.LIZ = null;
            try {
                pxi.LIZ(1000, "normal close");
            } catch (Throwable unused) {
            }
        }
        LJIILIIL(0L, (String) LIZIZ.first, true);
    }

    public final void LJIIJJI() {
        this.LJLJLLL.removeMessages(2);
        this.LJLJLLL.removeMessages(1);
        this.LJLJLLL.removeMessages(3);
        this.LJLJLLL.removeMessages(5);
        C48130Iuk c48130Iuk = this.LJLJI;
        if (c48130Iuk != null) {
            c48130Iuk.LIZLLL();
        }
        this.LJLJLLL.removeMessages(1);
        LIZ();
    }

    public final boolean LIZ() {
        int LIZLLL = LIZLLL();
        if (LIZLLL == 3 || LIZLLL == 2 || LIZLLL == 5) {
            return true;
        }
        this.LJLLL.LIZLLL();
        PXI pxi = this.LJLLILLLL;
        if (pxi == null) {
            return true;
        }
        this.LJLJLLL.sendMessageDelayed(this.LJLJLLL.obtainMessage(6, pxi), 1000L);
        if (LIZLLL == 4) {
            this.LJLLILLLL.LIZ(1000, "normal close");
            LJIIJ(6);
            return false;
        }
        this.LJLLILLLL.LJIIIIZZ.LIZ(-1);
        LJIIJ(3);
        if (LIZLLL != 1) {
            return true;
        }
        return false;
    }

    public C64862Pcw(C64865Pcz c64865Pcz) {
        WeakHandler weakHandler = new WeakHandler(Looper.myLooper(), this);
        this.LJLJLLL = weakHandler;
        this.LJLL = new C64863Pcx(this);
        this.LJLILLLLZI = c64865Pcz;
        this.LJLIL = c64865Pcz.LIZ;
        this.LJLJJI = null;
        AbstractC64867Pd1 abstractC64867Pd1 = c64865Pcz.LIZLLL;
        this.LJLLL = abstractC64867Pd1;
        if (abstractC64867Pd1 == null) {
            new C64873Pd7();
            this.LJLLL = new C64870Pd4(new C64876PdA());
        }
        this.LJLLL.LIZ(new C64874Pd8(this), weakHandler);
        this.LJLLLL = new C64866Pd0(new C64875Pd9(this), weakHandler);
    }

    public static String LIZIZ(String str) {
        if (!((ArrayList) l.LJ().LIZLLL).isEmpty()) {
            e LIZ = l.LJ().LIZ(new m(str, "GET"));
            if (LIZ != null && !str.equals(LIZ.LIZ)) {
                if (!LIZ.LIZ.isEmpty() || ((ArrayList) LIZ.LIZIZ).isEmpty()) {
                    if (EZX.LIZ(LIZ.LIZ)) {
                        return LIZ.LIZ;
                    }
                } else {
                    throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555 ");
                }
            }
        } else {
            String LIZLLL = l.LJ().LIZLLL(str);
            if (!str.equals(LIZLLL) && EZX.LIZ(LIZLLL)) {
                return LIZLLL;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x01f9, code lost:
    
        if (r7 != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64862Pcw.LJ(java.lang.String):void");
    }

    public final void LJII(Runnable runnable) {
        this.LJLJLLL.post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJIIIIZZ(byte[] bArr) {
        C64537PUn of = C64537PUn.of(bArr);
        if (this.LJLLILLLL == null || LIZLLL() != 4) {
            return false;
        }
        if (of instanceof String) {
            return this.LJLLILLLL.LIZIZ((String) of);
        }
        if (!(of instanceof C64537PUn)) {
            return false;
        }
        PXI pxi = this.LJLLILLLL;
        if (of != 0) {
            return pxi.LJIIIZ(of, 2);
        }
        pxi.getClass();
        throw new NullPointerException("bytes == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r3 = new java.util.ArrayList();
        r1 = new X.Q3O();
        r1.LIZLLL = "is_ack";
        r1.LJ = "1";
        r3.add(r1.build());
        r1 = new X.Q3O();
        r1.LIZLLL = "ack_id";
        r1.LJ = (java.lang.String) com.squareup.wire.Wire.get(r5.logidnew, "");
        r3.add(r1.build());
        r1 = new X.Q3O();
        r1.LIZLLL = "ack_code";
        r1.LJ = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
        r3.add(r1.build());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        r0 = new X.Q3O();
        r0.LIZLLL = "x_frontier_msgid";
        r0.LJ = r6;
        r3.add(r0.build());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        r2 = new X.C66510Q8k();
        r2.LIZLLL = (java.lang.Long) com.squareup.wire.Wire.get(r5.seqid, com.bytedance.common.wschannel.model.Frame.DEFAULT_SEQID);
        r2.LJ = (java.lang.Long) com.squareup.wire.Wire.get(r5.logid, com.bytedance.common.wschannel.model.Frame.DEFAULT_LOGID);
        r2.LJFF = (java.lang.Integer) com.squareup.wire.Wire.get(r5.service, com.bytedance.common.wschannel.model.Frame.DEFAULT_SERVICE);
        r2.LJI = (java.lang.Integer) com.squareup.wire.Wire.get(r5.method, com.bytedance.common.wschannel.model.Frame.DEFAULT_METHOD);
        r2.LJIIJJI = (java.lang.String) com.squareup.wire.Wire.get(r5.logidnew, "");
        X.C63685Oz3.LIZ(r3);
        r2.LJII = r3;
        LJIIIIZZ(com.bytedance.common.wschannel.model.Frame.ADAPTER.encode(r2.build()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(byte[] r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64862Pcw.LJIIIZ(byte[]):void");
    }

    public final synchronized void LJIIJ(int i) {
        this.LJLJJL = i;
        if (i != 1 && i != 2 && i != 3 && i != 4 && i == 5) {
        }
    }

    public final void LJIIL(String str) {
        if (!C48005Isj.LIZJ(this.LJLIL)) {
            LJFF(1, str, "network error", true);
            return;
        }
        int LIZLLL = LIZLLL();
        if (LIZLLL != 4 && LIZLLL != 1) {
            try {
                LJ(str);
            } catch (Throwable th) {
                if (this.LJLLI != null) {
                    this.LJLLI.LIZ(str, 4, android.util.Log.getStackTraceString(th));
                }
                if ("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555 ".equals(th.getMessage())) {
                    String LIZ = this.LJLJI.LIZ();
                    if (!TextUtils.isEmpty(LIZ)) {
                        LJIILIIL(0L, LIZ, true);
                    } else {
                        this.LJLJI.LIZLLL();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        FYD fyd;
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            if (LIZLLL() == 4) {
                return;
            }
            this.LJLJLLL.removeMessages(1);
            this.LJLJLLL.removeMessages(2);
            LJIIL((String) message.obj);
            return;
        }
        try {
            if (i == 2) {
                this.LJLJLLL.removeMessages(2);
                this.LJLJLLL.removeMessages(1);
                C64865Pcz c64865Pcz = this.LJLILLLLZI;
                List<String> list = (List) message.obj;
                c64865Pcz.LIZIZ = list;
                this.LJLJL = false;
                C48130Iuk c48130Iuk = new C48130Iuk(list, c64865Pcz.LIZJ);
                this.LJLJI = c48130Iuk;
                c48130Iuk.LIZLLL();
                this.LJLJLLL.removeMessages(1);
                LJIIL(this.LJLJI.LIZJ());
            } else {
                if (i == 3) {
                    this.LJLJLLL.removeMessages(2);
                    this.LJLJLLL.removeMessages(1);
                    if (LIZLLL() == 4) {
                        return;
                    }
                    C48130Iuk c48130Iuk2 = this.LJLJI;
                    if (c48130Iuk2 != null) {
                        c48130Iuk2.LIZLLL();
                    }
                    this.LJLJLLL.removeMessages(1);
                    if (C48005Isj.LIZJ(this.LJLIL)) {
                        if (LIZ()) {
                            C48130Iuk c48130Iuk3 = this.LJLJI;
                            if (c48130Iuk3 == null) {
                                return;
                            }
                            LJIIL(c48130Iuk3.LIZJ());
                            return;
                        }
                        this.LJLLJ = true;
                        return;
                    }
                    return;
                }
                if (i == 5) {
                    if (((Boolean) message.obj).booleanValue()) {
                        fyd = FYD.STATE_FOREGROUND;
                    } else {
                        fyd = FYD.STATE_BACKGROUND;
                    }
                    C64866Pd0 c64866Pd0 = this.LJLLLL;
                    if (!c64866Pd0.LIZIZ.get() && c64866Pd0.LIZ == FYD.STATE_BACKGROUND && fyd == FYD.STATE_FOREGROUND) {
                        try {
                            PXI pxi = c64866Pd0.LIZJ;
                            if (pxi != null) {
                                PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = pxi.LJIIJJI;
                                if (pThreadScheduledThreadPoolExecutor != null) {
                                    pThreadScheduledThreadPoolExecutor.execute(new PXM(pxi));
                                }
                                c64866Pd0.LIZIZ.set(true);
                                c64866Pd0.LJ.removeCallbacks(c64866Pd0.LJFF);
                                c64866Pd0.LJ.postDelayed(c64866Pd0.LJFF, 5000L);
                            }
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    c64866Pd0.LIZ = fyd;
                    this.LJLLL.LIZIZ();
                    return;
                }
                if (i == 7) {
                    this.LJLJLLL.removeMessages(2);
                    this.LJLJLLL.removeMessages(1);
                    C64865Pcz c64865Pcz2 = this.LJLILLLLZI;
                    List<String> list2 = (List) message.obj;
                    c64865Pcz2.LIZIZ = list2;
                    this.LJLJL = false;
                    C48130Iuk c48130Iuk4 = new C48130Iuk(list2, c64865Pcz2.LIZJ);
                    this.LJLJI = c48130Iuk4;
                    c48130Iuk4.LIZLLL();
                    this.LJLJLLL.removeMessages(1);
                    if (LIZ()) {
                        LJIIL(this.LJLJI.LIZJ());
                    } else {
                        this.LJLLJ = true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void LIZJ(C64601PWz c64601PWz, SSLContext sSLContext) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                c64601PWz.sslSocketFactory(new C63999P9v(sSLContext.getSocketFactory()), (X509TrustManager) trustManager);
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unexpected default trust managers:");
        LIZ.append(Arrays.toString(trustManagers));
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public final void LJIILIIL(long j, String str, boolean z) {
        this.LJLJLLL.removeMessages(1);
        if (!C48005Isj.LIZJ(this.LJLIL)) {
            LJFF(1, str, "network error", z);
            return;
        }
        if (this.LJLJL) {
            return;
        }
        if (j == -1 || C38354F3m.LJ(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("method", "tryReconnect");
            bundle.putLong("interval", j);
            LJFF(2, str, "retry failed", z);
            str = this.LJLJI.LIZJ();
        } else {
            LJIIJ(5);
        }
        Message message = new Message();
        message.what = 1;
        message.obj = str;
        this.LJLJLLL.sendMessageDelayed(message, j);
    }

    public final void LJFF(int i, String str, String str2, boolean z) {
        LJIIJ(2);
        C48130Iuk c48130Iuk = this.LJLJI;
        if (c48130Iuk != null) {
            c48130Iuk.LIZLLL();
        }
        C64869Pd3 c64869Pd3 = this.LJLLI;
        if (c64869Pd3 != null && z) {
            c64869Pd3.LIZ(str, i, str2);
        }
    }
}
