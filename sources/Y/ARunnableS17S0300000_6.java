package Y;

import X.AbstractC38114Exa;
import X.ActivityC45651qj;
import X.BQ6;
import X.C16880lQ;
import X.C198517qh;
import X.C32037Chl;
import X.C34710Djm;
import X.C35661Dz7;
import X.C36754Ebe;
import X.C36982EfK;
import X.C36997EfZ;
import X.C37000Efc;
import X.C37012Efo;
import X.C37236EjQ;
import X.C37238EjS;
import X.C37360ElQ;
import X.C37613EpV;
import X.C37804Esa;
import X.C38117Exd;
import X.C38138Exy;
import X.C38185Eyj;
import X.C38995FSd;
import X.C39479FeV;
import X.C68322mC;
import X.C79081V1x;
import X.C79605VMb;
import X.C85693Xx;
import X.C8HX;
import X.FSW;
import X.InterfaceC36488ETs;
import X.InterfaceC37146Ehy;
import X.InterfaceC40880G2q;
import X.InterfaceC78280Uns;
import X.OSJ;
import X.RunnableC37237EjR;
import X.RunnableC39002FSk;
import X.VMI;
import X.X1D;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;
import com.bytedance.common.jato.fastnative.FastNative;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.pia.snapshot.bridge.PiaRemoveSnapshot;
import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.play.core.appupdate.u;
import com.google.gson.m;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.compliance.sandbox.webview.TTHYBRIDXHR;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public class ARunnableS17S0300000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((AbstractC38114Exa) this.l2).LJFF) {
            return;
        }
        C38117Exd c38117Exd = (C38117Exd) this.l0;
        if (c38117Exd != null) {
            ((CopyOnWriteArrayList) c38117Exd.LJIIL).add((TimeLineEvent) this.l1);
        }
        if (C38117Exd.LIZ((C38117Exd) this.l0)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("By pass invalid call: ");
            LIZ.append((C38117Exd) this.l0);
            X1D.LIZIZ(LIZ);
            if (((C38117Exd) this.l0) != null) {
                C38185Eyj c38185Eyj = new C38185Eyj();
                c38185Eyj.LIZJ("call_invalid_2", "reason");
                c38185Eyj.LIZ("label_abstract_bridge_reject", ((C38117Exd) this.l0).LJIIL);
                AbstractC38114Exa abstractC38114Exa = (AbstractC38114Exa) this.l2;
                String LJI = abstractC38114Exa.LJI();
                C38117Exd c38117Exd2 = (C38117Exd) this.l0;
                abstractC38114Exa.LIZ(3, LJI, c38117Exd2.LIZLLL, "call_invalid_2", c38117Exd2.LJIIL);
                ((AbstractC38114Exa) this.l2).LIZJ(C79081V1x.LJIILIIL(new C38138Exy(((C38117Exd) this.l0).LIZ, "Failed to parse invocation.")), (C38117Exd) this.l0);
            }
            ((AbstractC38114Exa) this.l2).LJIILJJIL((C38117Exd) this.l0);
            return;
        }
        ((AbstractC38114Exa) this.l2).LJII((C38117Exd) this.l0);
    }

    public final void LIZ$1() {
        VMI vmi = VMI.LJ;
        WebView webView = ((TTHYBRIDXHR) this.l0).LIZ;
        C79605VMb c79605VMb = new C79605VMb("ajax_hook_failed");
        c79605VMb.LIZIZ = "ajax_hook_native";
        c79605VMb.LIZIZ(0);
        JSONObject jSONObject = new JSONObject();
        C68322mC c68322mC = (C68322mC) this.l1;
        TTHYBRIDXHR tthybridxhr = (TTHYBRIDXHR) this.l0;
        Exception exc = (Exception) this.l2;
        jSONObject.put("phase", "jsb_request");
        jSONObject.put("request_url", c68322mC.element);
        jSONObject.put("main_frame_url", C37804Esa.LIZ(tthybridxhr.LIZ));
        jSONObject.put("errorCode", -1);
        jSONObject.put("errorDesc", exc.getMessage());
        c79605VMb.LIZLLL = jSONObject;
        vmi.LJIILL(webView, c79605VMb.LIZ());
    }

    public final void LIZ$2() {
        VMI vmi = VMI.LJ;
        WebView webView = ((TTHYBRIDXHR) this.l0).LIZ;
        C79605VMb c79605VMb = new C79605VMb("ajax_hook_failed");
        c79605VMb.LIZIZ = "ajax_hook_native";
        c79605VMb.LIZIZ(0);
        JSONObject jSONObject = new JSONObject();
        C68322mC c68322mC = (C68322mC) this.l1;
        TTHYBRIDXHR tthybridxhr = (TTHYBRIDXHR) this.l0;
        Exception exc = (Exception) this.l2;
        jSONObject.put("phase", "parse_jsb");
        jSONObject.put("request_url", c68322mC.element);
        jSONObject.put("main_frame_url", C37804Esa.LIZ(tthybridxhr.LIZ));
        jSONObject.put("errorCode", -1);
        jSONObject.put("errorDesc", exc.getMessage());
        c79605VMb.LIZLLL = jSONObject;
        vmi.LJIILL(webView, c79605VMb.LIZ());
    }

    public final void LIZ$3() {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("phase", "ttnet_send");
        c198517qh.LIZ.put("request_url", ((Uri) this.l0).toString());
        String url = ((WebView) this.l1).getUrl();
        if (url == null) {
            url = "";
        }
        c198517qh.LIZ.put("main_frame_url", url);
        c198517qh.LIZ.put("errorCode", Integer.valueOf(((C35661Dz7) this.l2).LIZJ));
        c198517qh.LIZ.put("errorDesc", ((C35661Dz7) this.l2).LIZLLL);
        C8HX.LIZIZ("web_request_ttnet", "", c198517qh.LJ());
    }

    public final void LIZ$4() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            Runnable runnable = (Runnable) this.l0;
            if (!(runnable instanceof RunnableC39002FSk)) {
                jSONObject.put("task_name", runnable);
            } else {
                jSONObject.put("task_name", ((RunnableC39002FSk) runnable).LJLIL);
            }
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.l1;
            if (threadPoolExecutor instanceof FSW) {
                jSONObject.put("pool_type", ((FSW) threadPoolExecutor).LJLIL.name());
                jSONObject.put("pool_size", ((ThreadPoolExecutor) this.l1).getPoolSize());
                Exception exc = (Exception) this.l2;
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        exc.printStackTrace(printWriter);
                        str = stringWriter.toString();
                    } finally {
                        printWriter.close();
                    }
                } else {
                    str = "";
                }
                jSONObject.put("task_stack", str);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        C38995FSd.LIZIZ.LJII(jSONObject);
    }

    public final void LIZ$6() {
        String LJJIJIL;
        long j;
        C36997EfZ c36997EfZ;
        C36982EfK c36982EfK = C36982EfK.LJII;
        OSJ<String, Long, ? extends C36754Ebe> osj = C36982EfK.LIZLLL;
        if (osj != null) {
            LJJIJIL = u.LJJIJIL((InterfaceC78280Uns) this.l0, "url", "");
            if (s.LJJJLZIJ(LJJIJIL, osj.getFirst(), false)) {
                if (osj.getThird() != null) {
                    long currentTimeMillis = System.currentTimeMillis() - osj.getSecond().longValue();
                    C37000Efc c37000Efc = C36982EfK.LJ;
                    if (c37000Efc != null && (c36997EfZ = c37000Efc.LIZ) != null) {
                        j = c36997EfZ.LIZIZ;
                    } else {
                        j = 0;
                    }
                    if (currentTimeMillis < j * 1000) {
                        C37012Efo c37012Efo = (C37012Efo) this.l1;
                        C36754Ebe third = osj.getThird();
                        if (third != null) {
                            JSONObject LIZIZ = third.LIZIZ();
                            LIZIZ.put("cached", 2);
                            c37012Efo.LJ(LIZIZ);
                            return;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    Runnable runnable = (Runnable) this.l2;
                    o.LJIIJ(runnable, "runnable");
                    C36982EfK.LJFF = runnable;
                    return;
                }
            } else {
                synchronized (c36982EfK) {
                    C36982EfK.LIZLLL = null;
                    C36982EfK.LJ = null;
                    C36982EfK.LJFF = null;
                }
            }
        }
        ((Runnable) this.l2).run();
    }

    public final void LIZ$5() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[SnapShot] pia.removeSnapshot called (Query: ");
        LIZ.append(((PiaRemoveSnapshot.Params) this.l0).query);
        LIZ.append(", URL: ");
        LIZ.append(((PiaRemoveSnapshot.Params) this.l0).url);
        LIZ.append(", SDK: ");
        LIZ.append(((PiaRemoveSnapshot.Params) this.l0).sdk);
        LIZ.append(')');
        C37238EjS.LIZ(X1D.LIZIZ(LIZ));
        Number number = ((PiaRemoveSnapshot.Params) this.l0).sdk;
        if (number != null) {
            number.intValue();
        }
        PiaRemoveSnapshot.Params params = (PiaRemoveSnapshot.Params) this.l0;
        String str2 = params.url;
        m mVar = params.query;
        if (mVar == null || (str = mVar.toString()) == null) {
            str = "";
        }
        if (str2 == null) {
            ((BQ6) this.l1).accept(new C32037Chl());
            return;
        }
        JSONObject jSONObject = (JSONObject) GsonUtils.LIZ(str, JSONObject.class);
        if (jSONObject != null) {
            C37360ElQ.LIZIZ.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[SnapShot] Remove a snapshot (URL: ");
            LIZ2.append(str2);
            LIZ2.append(", Query: ");
            LIZ2.append(jSONObject);
            LIZ2.append(')');
            C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
            C37613EpV.LIZ().post(RunnableC37237EjR.LJLIL);
            ((BQ6) this.l2).accept(new PiaRemoveSnapshot.Result(C37236EjQ.LJFF(C85693Xx.LIZ(UriProtector.parse(str2)), jSONObject, C37236EjQ.LIZLLL(jSONObject))));
            return;
        }
        ((BQ6) this.l1).accept(new C32037Chl(""));
    }

    public static final void run$0(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            String[] strArr = (String[]) aRunnableS17S0300000_6.l0;
            String[] strArr2 = (String[]) aRunnableS17S0300000_6.l1;
            String[] strArr3 = (String[]) aRunnableS17S0300000_6.l2;
            if (FastNative.LIZ == null) {
                FastNative.LIZ = C16880lQ.LLLLZLLIL();
            }
            FastNative.LIZ.execute(new ARunnableS5S0310000_6(strArr, strArr2, strArr3, 8));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            IEventMonitor iEventMonitor = ((C39479FeV) aRunnableS17S0300000_6.l1).LIZJ;
            if (iEventMonitor != null) {
                iEventMonitor.monitorCommonLog("hybrid_security_monitor_navigationStart", (JSONObject) aRunnableS17S0300000_6.l0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$2(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            C68322mC c68322mC = (C68322mC) aRunnableS17S0300000_6.l0;
            String url = ((TTHYBRIDXHR) aRunnableS17S0300000_6.l1).LIZ.getUrl();
            T t = url;
            if (url == null) {
                t = "";
            }
            c68322mC.element = t;
            ((CountDownLatch) aRunnableS17S0300000_6.l2).countDown();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            InterfaceC36488ETs interfaceC36488ETs = (InterfaceC36488ETs) aRunnableS17S0300000_6.l0;
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZIZ((JSONObject) aRunnableS17S0300000_6.l1);
            }
            InterfaceC37146Ehy interfaceC37146Ehy = (InterfaceC37146Ehy) aRunnableS17S0300000_6.l2;
            if (interfaceC37146Ehy != null) {
                interfaceC37146Ehy.LIZIZ((JSONObject) aRunnableS17S0300000_6.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            ((InterfaceC40880G2q) aRunnableS17S0300000_6.l0).LIZ((ReadableMap) aRunnableS17S0300000_6.l1, (Callback) aRunnableS17S0300000_6.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            if (((Boolean) C34710Djm.LJJIJL.getValue()).booleanValue()) {
                ((ActivityC45651qj) aRunnableS17S0300000_6.l0).getWindow().getDecorView().requestLayout();
            }
            ((Handler) aRunnableS17S0300000_6.l1).handleMessage((Message) aRunnableS17S0300000_6.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS17S0300000_6 aRunnableS17S0300000_6) {
        boolean LIZ;
        try {
            aRunnableS17S0300000_6.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS17S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
