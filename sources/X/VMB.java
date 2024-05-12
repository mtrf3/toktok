package X;

import android.view.View;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VMB extends AbstractC79603VLz implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLLILLLL;
    public static final VMB LJLLJ;
    public static final WeakHashMap<View, VMB> LJLLL;
    public static final VMC LJLLLL;
    public final WeakReference<VNS> LJLILLLLZI;
    public C60888Nv2 LJLJI;
    public WeakReference<LynxViewClient> LJLJJI;
    public VM9 LJLJJL;
    public VN8 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public final C62822Ol8 LJLLI;

    static {
        VMH vmh;
        TBT tbt = new TBT(C65352Pkq.LIZ(VMB.class), "commonProps", "getCommonProps()Lcom/bytedance/android/monitorV2/lynx/data/entity/LynxCommonData;");
        C65352Pkq.LIZ.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt};
        LJLLLL = new VMC();
        C76800UCe c76800UCe = null;
        VMB vmb = new VMB(null);
        try {
            VM9 vm9 = new VM9(vmb);
            vmb.LJLJJL = vm9;
            vmb.LJLJJLL = new VN8(vm9);
            VM9 vm92 = vmb.LJLJJL;
            if (vm92 != null && (vmh = vm92.LJLLILLLL) != null) {
                vmh.LIZ();
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        LJLLJ = vmb;
        LJLLL = new WeakHashMap<>();
    }

    public final VMF LJIILJJIL() {
        return (VMF) this.LJLLI.getValue();
    }

    @Override // X.AbstractC79603VLz
    public final void LIZ() {
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LIZ();
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LIZJ() {
        VNS vns = this.LJLIL.get();
        if (vns != null) {
            C79592VLo.LJ.getClass();
            C79592VLo.LIZ(vns);
        }
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LIZJ();
        }
        VNS vns2 = this.LJLIL.get();
        if (vns2 != null) {
            vns2.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJ() {
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LJ();
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJI() {
        String str;
        C79592VLo c79592VLo = C79592VLo.LJ;
        VNS vns = this.LJLIL.get();
        c79592VLo.getClass();
        C79592VLo.LIZ(vns);
        VMF LJIILJJIL = LJIILJJIL();
        VNS vns2 = this.LJLILLLLZI.get();
        if (vns2 == null || (str = vns2.getPageVersion()) == null) {
            str = "";
        }
        LJIILJJIL.getClass();
        LJIILJJIL.LJLLLL = str;
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LJI();
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIJ() {
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LJIIJ();
        }
    }

    public VMB(VNS vns) {
        super(vns);
        this.LJLILLLLZI = new WeakReference<>(vns);
        this.LJLJI = new C60888Nv2("__hybrid_default", new C38218EzG());
        this.LJLL = -1;
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 438));
    }

    @Override // X.AbstractC79603VLz
    public final void LIZIZ(java.util.Map<String, ? extends Object> map) {
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LIZIZ(map);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LIZLLL(C79601VLx lynxPerf) {
        o.LJIIJ(lynxPerf, "lynxPerf");
        C79592VLo c79592VLo = C79592VLo.LJ;
        VNS vns = this.LJLIL.get();
        c79592VLo.getClass();
        C79592VLo.LIZ(vns);
        JSONObject jSONObject = lynxPerf.LJLLJ;
        if (jSONObject != null) {
            try {
                LJIILJJIL().LJLJLLL = JSONObjectProtectorUtils.getLong(JSONObjectProtectorUtils.getJSONObject(jSONObject, "timing"), "init_end");
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LIZLLL(lynxPerf);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJFF(java.util.Map<String, ? extends Object> map) {
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LJFF(map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r1.booleanValue() != false) goto L11;
     */
    @Override // X.AbstractC79603VLz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            X.VMF r1 = r5.LJIILJJIL()
            X.VMF r0 = r5.LJIILJJIL()
            java.lang.String r0 = r0.LJLIL
            r3 = 1
            r4 = 0
            if (r0 == 0) goto La6
            r0 = 1
        L12:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LJLLILLLL = r0
            X.VMF r0 = r5.LJIILJJIL()
            r0.LJLIL = r6
            X.VMF r2 = r5.LJIILJJIL()
            long r0 = X.C78840Uwu.LJIILL()
            r2.LJLJJL = r0
            boolean r0 = r5.LJLJL
            if (r0 == 0) goto L3d
            X.VMF r0 = r5.LJIILJJIL()
            java.lang.Boolean r1 = r0.LJLLILLLL
            java.lang.String r0 = "commonProps.containerReuse"
            kotlin.jvm.internal.o.LJFF(r1, r0)
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L6f
        L3d:
            X.VM9 r0 = r5.LJLJJL
            if (r0 == 0) goto L44
            r0.LIZJ()
        L44:
            X.VM9 r1 = new X.VM9
            r1.<init>(r5)
            r5.LJLJJL = r1
            X.VN8 r0 = new X.VN8
            r0.<init>(r1)
            r5.LJLJJLL = r0
            X.VM9 r2 = r5.LJLJJL
            if (r2 == 0) goto L65
            X.VNS r1 = r2.LJIILJJIL()
            if (r1 == 0) goto L65
        L5d:
            X.VMl r0 = new X.VMl
            r0.<init>(r2)
            X.OFI.LJIIJJI(r1, r0)
        L65:
            X.VMF r1 = r5.LJIILJJIL()
            java.lang.String r0 = X.C3DQ.LIZ()
            r1.LJLILLLLZI = r0
        L6f:
            r5.LJLJL = r4
            X.VN8 r0 = r5.LJLJJLL
            if (r0 == 0) goto L78
            r0.LJII(r6)
        L78:
            java.lang.ref.WeakReference<X.VNS> r0 = r5.LJLIL
            java.lang.Object r2 = r0.get()
            X.VNS r2 = (X.VNS) r2
            if (r2 == 0) goto La3
            boolean r0 = r2.isAttachedToWindow()
            r5.LJLJLJ = r0
            int r0 = r2.getVisibility()
            if (r0 != 0) goto La4
        L8e:
            r5.LJLJLLL = r3
            X.VLo r0 = X.C79592VLo.LJ
            r0.getClass()
            X.C79592VLo.LIZ(r2)
            kotlin.jvm.internal.AqS164S0100000_14 r1 = new kotlin.jvm.internal.AqS164S0100000_14
            r0 = 437(0x1b5, float:6.12E-43)
            r1.<init>(r2, r0)
            X.C38045EwT.LIZ(r1)
        La3:
            return
        La4:
            r3 = 0
            goto L8e
        La6:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VMB.LJII(java.lang.String):void");
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIIIZZ(VM0 data) {
        o.LJIIJ(data, "data");
        String str = LJIILJJIL().LJLIL;
        if (str == null || str.length() == 0) {
            LJIILJJIL().LJLIL = C77123UOp.LJJJJLI("url", C77123UOp.LJJJLL(data.LJLJJI));
        }
        VNS vns = this.LJLIL.get();
        if (vns != null) {
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor lynxViewMonitor = LynxViewMonitor.INSTANCE;
            VM4.LJIILL.getClass();
            lynxViewMonitor.reportError(vns, data, VM3.LIZ("nativeError", data));
        }
        int i = data.LJLJI;
        if (i == 100 || i == 103) {
            if (this.LJLJJLL == null) {
                this.LJLJJLL = new VN8(new VM9(this));
            }
            VN8 vn8 = this.LJLJJLL;
            if (vn8 != null) {
                vn8.LJIIIIZZ(data);
            }
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIIZ(VMD vmd) {
        int i;
        if (vmd != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pageVersion", vmd.LIZ);
                jSONObject.put("pageType", vmd.LIZIZ);
                jSONObject.put("cliVersion", vmd.LIZJ);
                jSONObject.put("customData", vmd.LIZLLL);
                jSONObject.put("templateUrl", vmd.LJ);
                jSONObject.put("targetSdkVersion", vmd.LJFF);
                jSONObject.put("lepusVersion", vmd.LJI);
                jSONObject.put("isEnableLepusNG", vmd.LJIIIIZZ);
                jSONObject.put("isEnableCanvas", vmd.LJIIIZ);
                jSONObject.put("radonMode", vmd.LJIIJ);
                jSONObject.put("reactVersion", vmd.LJIIJJI);
                EnumC59959Ng3 enumC59959Ng3 = vmd.LJII;
                if (enumC59959Ng3 != null) {
                    i = enumC59959Ng3.id();
                } else {
                    i = 0;
                }
                jSONObject.put("threadStrategyForRendering", i);
                jSONObject.put("registeredComponent", vmd.LJIIL);
                jSONObject.put("cssAlignWithLegacyW3c", vmd.LJIILIIL);
                jSONObject.put("cssParser", vmd.LJIILJJIL);
            } catch (Throwable unused) {
            }
            C79605VMb c79605VMb = new C79605VMb("hybrid_lynx_config_info");
            c79605VMb.LIZLLL = jSONObject;
            C79604VMa LIZ = c79605VMb.LIZ();
            LynxViewMonitor.Companion.getClass();
            LynxViewMonitor.INSTANCE.reportCustom(this.LJLIL.get(), LIZ);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIJJI(java.util.Map<String, Object> map) {
        if (VMS.lynxMonitor.isEnabled()) {
            C38192Eyq.LIZIZ(new AqS153S0200000_6(this, map, 26));
        }
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LJIIJJI(map);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJIIL(java.util.Map<String, Object> map) {
        if (VMS.lynxMonitor.isEnabled()) {
            C38192Eyq.LIZIZ(new AqS153S0200000_6(this, map, 27));
        }
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LJIIL(map);
        }
    }

    @Override // X.AbstractC79603VLz
    public final void LJIILIIL(LynxPerfMetric metric) {
        o.LJIIJ(metric, "metric");
        C79592VLo c79592VLo = C79592VLo.LJ;
        VNS vns = this.LJLIL.get();
        c79592VLo.getClass();
        C79592VLo.LIZ(vns);
        C62822Ol8 c62822Ol8 = C79592VLo.LIZJ;
        if (((C79583VLf) c62822Ol8.getValue()).LIZ() != null) {
            C79583VLf c79583VLf = (C79583VLf) c62822Ol8.getValue();
            c79583VLf.getClass();
            c79583VLf.LIZIZ = new WeakReference<>(metric);
            Object LIZIZ = c79583VLf.LIZIZ(new Object[0]);
            if (LIZIZ != null && ((Boolean) LIZIZ).booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                C77123UOp.LJJJLIIL(jSONObject, "actualFMPDuration", Double.valueOf(metric.getActualFMPDuration()));
                C77123UOp.LJJJLIIL(jSONObject, "actualFirstScreenEndTimeStamp", Double.valueOf(metric.getActualFirstScreenEndTimeStamp()));
                C79605VMb c79605VMb = new C79605VMb("lynx_actual_fmp");
                c79605VMb.LJ = jSONObject;
                C79604VMa LIZ = c79605VMb.LIZ();
                LynxViewMonitor.Companion.getClass();
                LynxViewMonitor.INSTANCE.reportCustom(this.LJLIL.get(), LIZ);
            }
        }
    }

    @Override // X.AbstractC79603VLz
    public void onEventPost(VMM event) {
        o.LJIIJ(event, "event");
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.onEventPost(event);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LJIILJJIL().LJLL = System.currentTimeMillis();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        LJIILJJIL().LJLLI = System.currentTimeMillis();
        VN8 vn8 = this.LJLJJLL;
        if (vn8 != null) {
            vn8.LIZJ();
        }
    }
}
