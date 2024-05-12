package X;

import android.content.res.Resources;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.TraceEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VM9 extends AbstractC79603VLz {
    public String LJLILLLLZI;
    public String LJLJI;
    public JSONObject LJLJJI;
    public final C79580VLc LJLJJL;
    public C79601VLx LJLJJLL;
    public final VM4 LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public String LJLLI;
    public final VMH LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public QKL LJLZ;
    public final VMB LJZ;

    @Override // X.AbstractC79603VLz
    public final void LJIIIZ(VMD vmd) {
    }

    @Override // X.AbstractC79603VLz
    public final void LJIILIIL(LynxPerfMetric metric) {
        o.LJIIJ(metric, "metric");
    }

    @Override // X.AbstractC79603VLz
    public final void LIZ() {
        if (this.LJLL) {
            return;
        }
        C40048Fng.LIZJ(LJIILL(), "blank_check", null, null, 12);
        this.LJLL = true;
        LJIILLIIL();
    }

    public final VNS LJIILJJIL() {
        VNS vns = this.LJZ.LJLILLLLZI.get();
        if (vns == null) {
            new Throwable();
            return null;
        }
        return vns;
    }

    public final String LJIILL() {
        String str = this.LJZ.LJIILJJIL().LJLILLLLZI;
        o.LJFF(str, "lynxViewDataManager.commonProps.navigationId");
        return str;
    }

    public final void LJIILLIIL() {
        VM4.LJIILL.getClass();
        Object obj = null;
        VM4 LIZ = VM3.LIZ("blank", null);
        boolean not = VMS.lynxBlank.not();
        LIZ.LJFF(not, EnumC65355Pkt.SWITCH_OFF);
        if (not) {
            return;
        }
        VNS LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL == null) {
            LIZ.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            return;
        }
        if (LJIILJJIL.getWidth() == 0 || LJIILJJIL.getHeight() == 0) {
            LIZ.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return;
        }
        try {
            Field declaredField = VNS.class.getDeclaredField("mLynxTemplateRender");
            o.LJFF(declaredField, "LynxView::class.java.get…ld(\"mLynxTemplateRender\")");
            declaredField.setAccessible(true);
            if (((LynxTemplateRender) declaredField.get(LJIILJJIL())) == null) {
                LIZ.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
                return;
            }
        } catch (Exception e) {
            LIZ.onEventTerminated(EnumC65355Pkt.CATCH_EXCEPTION);
            C77117UOj.LJIIZILJ(e);
        }
        long currentTimeMillis = System.currentTimeMillis();
        VMQ vmq = new VMQ();
        vmq.LJLJLJ = 2;
        float height = LJIILJJIL.getHeight();
        Resources resources = LJIILJJIL.getResources();
        o.LJFF(resources, "view.resources");
        vmq.LJLJI = O6R.LJJIIZ(height / resources.getDisplayMetrics().density);
        float width = LJIILJJIL.getWidth();
        Resources resources2 = LJIILJJIL.getResources();
        o.LJFF(resources2, "view.resources");
        vmq.LJLJJI = O6R.LJJIIZ(width / resources2.getDisplayMetrics().density);
        vmq.LJLLLL = O6R.LJJIIZ(LJIILJJIL.getAlpha() * 100);
        WeakReference weakReference = new WeakReference(LJIILJJIL());
        Object obj2 = ((ConcurrentHashMap) C36745EbV.LIZ).get(VMA.class);
        if (obj2 == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Cannot find service implementation of ");
            LIZ2.append(VMA.class);
            X1D.LIZIZ(LIZ2);
            new Throwable();
        } else if (obj2 instanceof VMA) {
            obj = obj2;
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Internal error, service is not instance of ");
            LIZ3.append(VMA.class);
            LIZ3.append(", ");
            LIZ3.append("is that call register and get in different classloader?");
            X1D.LIZIZ(LIZ3);
            new Throwable();
        }
        VMA vma = (VMA) obj;
        if (vma != null) {
            vma.detect(LJIILJJIL(), new VMO(this, vmq, currentTimeMillis, LIZ, weakReference));
        }
    }

    public final void LJIJ() {
        boolean z;
        if (this.LJLLJ && this.LJLLL) {
            z = true;
        } else {
            z = false;
        }
        C79592VLo.LJ.getClass();
        if (((C79583VLf) C79592VLo.LIZLLL.getValue()).LIZ() != null) {
            if (z && this.LJLLLLLL) {
                this.LJLLILLLL.LIZ();
                return;
            }
            return;
        }
        if (!z || !this.LJLLLL) {
            return;
        }
        LJIIZILJ();
        this.LJLLILLLL.LIZ();
    }

    public final void LJIJI() {
        C79601VLx c79601VLx = this.LJLJJLL;
        c79601VLx.LJLLILLLL = this.LJLJJL;
        VM4 vm4 = this.LJLJL;
        vm4.LJIIL = c79601VLx;
        vm4.LJ(this.LJZ.LJIILJJIL());
        this.LJLJL.LJIILIIL = new C35893E6v((java.util.Map<String, ? extends Object>) this.LJLZ.LIZIZ);
        this.LJLJL.LJI = new C35894E6w((java.util.Map<String, ? extends Object>) this.LJLZ.LIZ);
        this.LJLJL.LIZJ();
    }

    @Override // X.AbstractC79603VLz
    public final void LIZJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDestroy: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        this.LJLJJL.LJLJJI = System.currentTimeMillis();
        if (!this.LJLJLJ) {
            if (!this.LJLJLLL) {
                VMB vmb = this.LJZ;
                if (vmb.LJLJLJ && vmb.LJLJLLL) {
                    this.LJLJJLL.LLLLZ(2);
                } else {
                    this.LJLJJLL.LLLLZ(3);
                }
            }
            this.LJLJJLL.LJLLILLLL = this.LJLJJL;
            LJIJI();
            LJIIZILJ();
            this.LJLLILLLL.LIZ();
        }
        OFI.LIZ(this.LJLJI);
    }

    @Override // X.AbstractC79603VLz
    public final void LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstScreen: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        this.LJLLL = true;
        this.LJLJJL.LJLJJL = System.currentTimeMillis();
        LJIJI();
        LJIJ();
    }

    @Override // X.AbstractC79603VLz
    public final void LJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        this.LJLJJL.LJLILLLLZI = System.currentTimeMillis();
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRuntimeReady: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        this.LJLLJ = true;
        this.LJLJJL.LJLJJLL = System.currentTimeMillis();
        LJIJI();
        LJIJ();
    }

    public final void LJIIZILJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportPerf: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        if (VMS.lynxPerf.not()) {
            this.LJLJL.onEventTerminated(EnumC65355Pkt.SWITCH_OFF);
            return;
        }
        if (this.LJLJLJ) {
            this.LJLJL.onEventTerminated(EnumC65355Pkt.EVENT_REPEATED);
        } else {
            this.LJLJLJ = true;
            VMH vmh = this.LJLLILLLL;
            VM4 event = this.LJLJL;
            vmh.getClass();
            o.LJIIJ(event, "event");
            vmh.LIZ.LIZ(event);
        }
        VNS LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            for (Map.Entry entry : ((LinkedHashMap) OFI.LJI(LJIILJJIL).LLLLZ()).entrySet()) {
                if (entry.getValue() instanceof Long) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        long longValue = ((Long) value).longValue();
                        long j = 1000;
                        LynxViewMonitor.Companion.getClass();
                        TraceEvent.LJFF(0L, ((longValue * j) * j) - LynxViewMonitor.JVM_DIFF, str);
                    } else {
                        throw new C37692Eqm("null cannot be cast to non-null type kotlin.Long");
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VM9(VMB lynxViewDataManager) {
        super(lynxViewDataManager.LJLIL.get());
        String str;
        o.LJIIJ(lynxViewDataManager, "lynxViewDataManager");
        this.LJZ = lynxViewDataManager;
        this.LJLILLLLZI = "";
        this.LJLJI = "";
        this.LJLJJI = new JSONObject();
        this.LJLJJL = new C79580VLc();
        C79601VLx c79601VLx = new C79601VLx();
        this.LJLJJLL = c79601VLx;
        VM4.LJIILL.getClass();
        this.LJLJL = VM3.LIZ("performance", c79601VLx);
        VNS LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            str = LJIILJJIL.getTemplateUrl();
        } else {
            str = null;
        }
        this.LJLLI = str;
        this.LJLLILLLL = new VMH(this);
        this.LJLZ = new QKL(this.LJLJI);
    }

    @Override // X.AbstractC79603VLz
    public final void LIZIZ(java.util.Map<String, ? extends Object> map) {
        VM4 vm4 = new VM4("jsbPerfV2");
        vm4.LIZIZ();
        if (map == null) {
            vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return;
        }
        vm4.LJIIL = new C38358F3q("jsbPerfV2", new JSONObject(map));
        boolean not = VMS.lynxJsb.not();
        vm4.LJFF(not, EnumC65355Pkt.SWITCH_OFF);
        if (not) {
            return;
        }
        onEventPost(vm4);
    }

    @Override // X.AbstractC79603VLz
    public final void LIZLLL(C79601VLx lynxPerf) {
        o.LJIIJ(lynxPerf, "lynxPerf");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstLoadPerfReady: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        this.LJLLLL = true;
        C79601VLx c79601VLx = this.LJLJJLL;
        C79580VLc c79580VLc = this.LJLJJL;
        c79601VLx.LJLLILLLL = c79580VLc;
        if (c79580VLc != null) {
            c79580VLc.LJLJL = 3;
        }
        lynxPerf.LLLLZ(0);
        LJIJI();
        java.util.Map<String, Object> map = this.LJLJJLL.LJLLLLLL;
        this.LJLJJLL = lynxPerf;
        lynxPerf.LJLLLLLL = map;
        LJIJ();
    }

    @Override // X.AbstractC79603VLz
    public final void LJFF(java.util.Map<String, ? extends Object> map) {
        VM4 vm4 = new VM4("jsbPv");
        vm4.LIZIZ();
        if (map == null) {
            vm4.onEventTerminated(EnumC65355Pkt.PARAM_EXCEPTION);
            return;
        }
        vm4.LJIIL = new C38358F3q("jsbPv", new JSONObject(map));
        boolean not = VMS.lynxJsb.not();
        vm4.LJFF(not, EnumC65355Pkt.SWITCH_OFF);
        if (not) {
            return;
        }
        onEventPost(vm4);
    }

    @Override // X.AbstractC79603VLz
    public final void LJII(String str) {
        VNS LJIILJJIL = LJIILJJIL();
        if (LJIILJJIL != null) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("onPageStart: ", str, ", view: ");
            LIZIZ.append(LJIILJJIL());
            X1D.LIZIZ(LIZIZ);
            this.LJLJJLL.LJLLILLLL = this.LJLJJL;
            this.LJLLI = LJIILJJIL.getTemplateUrl();
            this.LJLJJL.LJLIL = System.currentTimeMillis();
            C79580VLc c79580VLc = this.LJLJJL;
            c79580VLc.LJLJI = c79580VLc.LJLIL;
            c79580VLc.LJLJL = 1;
            VM3 vm3 = VM4.LJIILL;
            C79597VLt c79597VLt = new C79597VLt();
            vm3.getClass();
            VM4 LIZ = VM3.LIZ("navigationStart", c79597VLt);
            VMG vmg = LIZ.LJ;
            vmg.LJLIL = str;
            vmg.LJLJI = "lynx";
            VMH vmh = this.LJLLILLLL;
            vmh.getClass();
            vmh.LIZ.LIZ(LIZ);
            VMF LJIILJJIL2 = this.LJZ.LJIILJJIL();
            String LJIILL = LJIILL();
            String str2 = LJIILJJIL2.LJLJI;
            o.LJFF(str2, "viewCommonProps.containerType");
            C40048Fng.LIZ(LJIILL, "engine_type", str2);
            String LJIILL2 = LJIILL();
            String str3 = LJIILJJIL2.LJLLLLLL;
            o.LJFF(str3, "viewCommonProps.lynxVersion");
            C40048Fng.LIZ(LJIILL2, "lynx_version", str3);
            String LJIILL3 = LJIILL();
            String str4 = LJIILJJIL2.LJLIL;
            if (str4 == null) {
                str4 = "";
            }
            C40048Fng.LIZ(LJIILL3, "url", str4);
            VNS LJIILJJIL3 = LJIILJJIL();
            if (LJIILJJIL3 != null) {
                List LIZLLL = OFI.LIZLLL(LJIILJJIL3);
                if (!LIZLLL.isEmpty()) {
                    String containerId = (String) ListProtector.get(LIZLLL, 0);
                    o.LJIIJ(containerId, "containerId");
                    Object obj = OFI.LIZIZ(containerId).get("container_name");
                    if (obj != null) {
                        C40048Fng.LIZ(LJIILL(), "container_name", (String) obj);
                    }
                }
            }
            C40048Fng.LIZJ(LJIILL(), "url_load", null, null, 12);
            C40048Fng.LIZJ(LJIILL(), "page_start", null, null, 12);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIIIZZ(VM0 data) {
        o.LJIIJ(data, "data");
        this.LJLJJLL.LLLLZ(1);
        C79601VLx c79601VLx = this.LJLJJLL;
        C79580VLc c79580VLc = this.LJLJJL;
        c79601VLx.LJLLILLLL = c79580VLc;
        if (c79580VLc != null) {
            c79580VLc.LJLJL = 2;
            c79580VLc.LJLJJI = System.currentTimeMillis();
        }
        this.LJLLILLLL.LIZ();
        LJIJI();
        LJIIZILJ();
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIJJI(java.util.Map<String, Object> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTimingSetup: ");
        LIZ.append(this.LJLLI);
        LIZ.append(", view: ");
        LIZ.append(LJIILJJIL());
        X1D.LIZIZ(LIZ);
        this.LJLLLLLL = true;
        C79592VLo c79592VLo = C79592VLo.LJ;
        VNS vns = this.LJLIL.get();
        c79592VLo.getClass();
        C79592VLo.LIZ(vns);
        C79601VLx c79601VLx = this.LJLJJLL;
        c79601VLx.LJLLLLLL = map;
        C79580VLc c79580VLc = c79601VLx.LJLLILLLL;
        if (c79580VLc != null) {
            c79580VLc.LJLJL = 3;
        }
        c79601VLx.LLLLZ(0);
        this.LJLJLLL = true;
        LJIJI();
        LJIJ();
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIL(java.util.Map<String, Object> map) {
        this.LJLJJLL.LJLLLLLL = map;
        LJIJI();
        if (o.LJ(this.LJZ.LJLJI.LJ, "perf_ready") && map != null) {
            Object obj = map.get("update_timings");
            if (!(obj instanceof java.util.Map)) {
                obj = null;
            }
            java.util.Map map2 = (java.util.Map) obj;
            if (map2 != null && map2.containsKey("__lynx_timing_actual_fmp")) {
                LJIIZILJ();
                this.LJLLILLLL.LIZ();
            }
        }
    }

    @Override // X.AbstractC79603VLz
    public void onEventPost(VMM event) {
        o.LJIIJ(event, "event");
        VMH vmh = this.LJLLILLLL;
        vmh.getClass();
        vmh.LIZ.LIZ(event);
    }
}
