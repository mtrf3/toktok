package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes15.dex */
public final class VML {
    public static String LJIJI = "";
    public static Boolean LJIJJ = Boolean.TRUE;
    public String LIZ;
    public long LIZIZ;
    public String LIZJ;
    public JSONObject LIZLLL;
    public final VMT LJ;
    public C35894E6w LJFF;
    public C35893E6v LJI;
    public C79578VLa LJII;
    public VM4 LJIIIIZZ;
    public final String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public volatile boolean LJIILJJIL;
    public final String LJIILL;
    public final int LJIILLIIL;
    public final VN7<VMM> LJIIZILJ;
    public final VMK LJIJ;

    public final C79578VLa LIZIZ() {
        if (this.LJII == null) {
            this.LJII = new C79578VLa(this.LJ);
        }
        LIZJ();
        C79578VLa c79578VLa = this.LJII;
        if (c79578VLa != null) {
            return c79578VLa;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.webview.cache.impl.WebPerfReportData");
    }

    public final VM4 LIZJ() {
        if (this.LJIIIIZZ == null) {
            VM4 vm4 = new VM4("perf");
            vm4.LIZLLL(LJIJI, "parent_url");
            vm4.LIZLLL(LJIJJ, "first_load");
            vm4.LIZIZ();
            vm4.LIZJ();
            this.LJIIIIZZ = vm4;
        }
        VM4 vm42 = this.LJIIIIZZ;
        if (vm42 != null) {
            return vm42;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.event.CommonEvent");
    }

    public final void LIZLLL() {
        if (this.LIZ == null || this.LJIILJJIL) {
            return;
        }
        this.LJIILJJIL = true;
        LIZIZ().LJIIIZ = System.currentTimeMillis();
        LJIIIIZZ();
        LJII();
        LJIIIIZZ();
        this.LJIIZILJ.LIZ(LIZJ());
        this.LJIIZILJ.LIZIZ();
        LJIJI = this.LIZ;
        LJIJJ = Boolean.FALSE;
    }

    public final void LJII() {
        VMK vmk = this.LJIJ;
        vmk.getClass();
        JSONObject jSONObject = new JSONObject();
        C77123UOp.LJJJLIIL(jSONObject, "attach_ts", vmk.LIZLLL.get(EnumC79613VMj.ATTACHED));
        C77123UOp.LJJJLIIL(jSONObject, "detach_ts", vmk.LIZLLL.get(EnumC79613VMj.DETACHED));
        C77123UOp.LJJJLIIL(jSONObject, "container_init_ts", vmk.LIZLLL.get(EnumC79613VMj.CREATED));
        boolean z = true;
        if (vmk.LJ <= 1) {
            z = false;
        }
        C77123UOp.LJJJLIIL(jSONObject, "container_reuse", Boolean.valueOf(z));
        C77123UOp.LJJJJZI("web_version", vmk.LJIIJJI, jSONObject);
        VMT vmt = this.LJ;
        vmt.getClass();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C77123UOp.LJJJLIIL(vmt.LJLLLLLL, next, C77123UOp.LJJJJJL(next, jSONObject));
        }
        VMT vmt2 = this.LJ;
        vmt2.LJLJI = this.LJIIIZ;
        vmt2.LJLLLL = this.LJIIJ;
        vmt2.LJLIL = this.LIZ;
        vmt2.LJLJJL = C78840Uwu.LJIILL();
        VMT vmt3 = this.LJ;
        vmt3.LJLLL = this.LIZIZ;
        vmt3.LJLILLLLZI = this.LJIILL;
        JSONObject jSONObject2 = new JSONObject();
        if (this.LJIJ.LIZLLL() != null) {
            VMI vmi = VMI.LJ;
            if (vmi != null) {
                vmi.LJJI();
                jSONObject2.put("use_ttweb", false);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.android.monitorV2.webview.WebViewMonitorHelper");
            }
        }
        if (vmt3.LJLJL == null) {
            vmt3.LJLJL = new JSONObject();
        }
        C77123UOp.LJIJJLI(vmt3.LJLJL, jSONObject2);
        WebView LIZLLL = this.LJIJ.LIZLLL();
        if (LIZLLL != null) {
            VMT vmt4 = this.LJ;
            Context context = LIZLLL.getContext();
            vmt4.getClass();
            Activity LJIIIZ = C77119UOl.LJIIIZ(context);
            if (LJIIIZ != null) {
                HybridMultiMonitor.getInstance().wrapTouchTraceCallback(LJIIIZ);
                vmt4.LJLJJI = LJIIIZ.getClass().getName();
            }
        }
    }

    public final void LJIIIIZZ() {
        LIZJ().LJI = this.LJFF;
        LIZJ().LJIILIIL = this.LJI;
        LIZJ().LJ(this.LJ);
        LIZJ().LJIIL = LIZIZ().LIZLLL;
        LIZJ().LIZJ();
    }

    public VML(VMK vmk) {
        C35894E6w c35894E6w;
        this.LJIJ = vmk;
        this.LIZJ = "";
        this.LIZLLL = new JSONObject();
        this.LJ = new VMT();
        this.LJIIIZ = "web";
        this.LJIIJ = "web";
        this.LJIILIIL = true;
        this.LJIILL = C1XY.LJIILJJIL();
        this.LJIILLIIL = 15;
        this.LJIIZILJ = new VN7<>(new VMN(this));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buildNewNavigation cache new url : ");
        LIZ.append(this.LIZ);
        X1D.LIZIZ(LIZ);
        VMI vmi = VMI.LJ;
        o.LJFF(vmi, "WebViewMonitorHelper.getInstance()");
        VN2 vn2 = vmi.LIZLLL;
        vmk.LIZLLL();
        vn2.getClass();
        this.LJIIJ = "web";
        java.util.Map LJJLIIIJLLLLLLLZ = C113554cx.LJJLIIIJLLLLLLLZ(vmk.LJIIJ);
        for (String str : LJJLIIIJLLLLLLLZ.keySet()) {
            Integer num = (Integer) LJJLIIIJLLLLLLLZ.get(str);
            if (num != null) {
                C77123UOp.LJJJLIIL(this.LJ.LJLZ, str, Integer.valueOf(num.intValue()));
            }
        }
        WebView LIZLLL = this.LJIJ.LIZLLL();
        if (LIZLLL != null) {
            c35894E6w = OFI.LJFF(LIZLLL);
        } else {
            c35894E6w = null;
        }
        this.LJFF = c35894E6w;
        WebView LIZLLL2 = this.LJIJ.LIZLLL();
        this.LJI = LIZLLL2 != null ? OFI.LJI(LIZLLL2) : null;
        LJII();
    }

    public final void LIZ(String str) {
        C79578VLa LIZIZ = LIZIZ();
        JSONObject LJJJLL = C77123UOp.LJJJLL(str);
        LIZIZ.LIZIZ = new JSONObject();
        LIZIZ.LIZJ = new JSONObject();
        C77123UOp.LJIJJLI(LIZIZ.LIZIZ, LJJJLL.optJSONObject("jsBase"));
        C77123UOp.LJIJJLI(LIZIZ.LIZJ, LJJJLL.optJSONObject("jsInfo"));
        JSONObject LJJJLL2 = C77123UOp.LJJJLL(str);
        if (this.LJIILJJIL) {
            return;
        }
        LIZJ().LJFF = LJJJLL2.optJSONObject("jsBase");
        LIZJ().LJIILJJIL = LJJJLL2.optJSONObject("jsInfo");
        LIZJ().LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("coverPerf ");
        LIZ.append(LIZJ().hashCode());
        X1D.LIZIZ(LIZ);
    }

    public final boolean LJ(String str) {
        List LJLJJL;
        if (!this.LJIILIIL) {
            return false;
        }
        try {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJFF(parse, "Uri.parse(url)");
            String host = parse.getHost();
            if (host == null) {
                LJLJJL = null;
            } else {
                LJLJJL = s.LJLJJL(host, new String[]{"."}, 0, 6);
            }
            String str2 = "";
            if (LJLJJL != null) {
                int size = LJLJJL.size();
                if (size >= 2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((String) ListProtector.get(LJLJJL, size - 2));
                    LIZ.append(".");
                    LIZ.append((String) ListProtector.get(LJLJJL, size - 1));
                    str2 = X1D.LIZIZ(LIZ);
                } else {
                    str2 = (String) ORZ.LLFF(LJLJJL);
                }
            }
            if (str2.length() > 0) {
                HybridMultiMonitor hybridMultiMonitor = HybridMultiMonitor.getInstance();
                o.LJFF(hybridMultiMonitor, "HybridMultiMonitor.getInstance()");
                InterfaceC40069Fo1 hybridSettingManager = hybridMultiMonitor.getHybridSettingManager();
                o.LJFF(hybridSettingManager, "HybridMultiMonitor.getIn…ce().hybridSettingManager");
                if (hybridSettingManager.LJ().contains(str2)) {
                    this.LJIILIIL = true;
                    return true;
                }
            }
            this.LJIILIIL = false;
            return false;
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
            this.LJIILIIL = false;
            return false;
        }
    }

    public VML(VMK vmk, String str) {
        this(vmk);
        this.LIZ = str;
        this.LJ.LJLIL = str;
    }

    public final void LJFF(String str, String str2) {
        String str3;
        if (str != null) {
            VM4 vm4 = new VM4(str);
            vm4.LIZIZ();
            java.util.Map<String, Object> map = vm4.LIZLLL;
            C60601NqP c60601NqP = this.LJIJ.LIZIZ;
            if (c60601NqP != null) {
                str3 = c60601NqP.LJFF;
            } else {
                str3 = null;
            }
            map.put("config_bid", str3);
            vm4.LJ(this.LJ);
            vm4.LJIILJJIL = C77123UOp.LJJJLL(str2).optJSONObject("jsInfo");
            vm4.LJFF = C77123UOp.LJJJLL(str2).optJSONObject("jsBase");
            this.LJIIZILJ.LIZ(vm4);
        }
        LIZIZ().LIZ(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        LIZIZ().LJIIJJI = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.VM4 r4, org.json.JSONObject r5) {
        /*
            r3 = this;
            java.lang.String r2 = r4.LJIIJ
            int r1 = r2.hashCode()
            r0 = 93819220(0x5979154, float:1.4253357E-35)
            if (r1 == r0) goto L53
            r0 = 831602183(0x31913e07, float:4.227107E-9)
            if (r1 == r0) goto L3a
            r0 = 1727072305(0x66f10831, float:5.691207E23)
            if (r1 == r0) goto L43
        L15:
            X.VMT r0 = r3.LJ
            r4.LJ(r0)
            X.VLs r1 = new X.VLs
            java.lang.String r0 = r4.LJIIJ
            if (r5 == 0) goto L34
        L20:
            r1.<init>(r0, r5)
            r4.LJIIL = r1
            X.VN7<X.VMM> r0 = r3.LJIIZILJ
            r0.LIZ(r4)
            X.VLa r1 = r3.LIZIZ()
            java.lang.String r0 = r4.LJIIJ
            r1.LIZ(r0)
            return
        L34:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            goto L20
        L3a:
            java.lang.String r0 = "containerError"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            goto L4b
        L43:
            java.lang.String r0 = "nativeError"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
        L4b:
            X.VLa r1 = r3.LIZIZ()
            r0 = 2
            r1.LJIIJJI = r0
            goto L15
        L53:
            java.lang.String r0 = "blank"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            X.VLa r0 = r3.LIZIZ()
            long r1 = r0.LJ
            java.lang.String r0 = "enter_page_time"
            X.C77123UOp.LJJJJZ(r0, r1, r5)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VML.LJI(X.VM4, org.json.JSONObject):void");
    }
}
