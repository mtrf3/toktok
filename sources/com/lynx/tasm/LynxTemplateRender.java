package com.lynx.tasm;

import X.AbstractC61008Nwy;
import X.C03880Dg;
import X.C07780Sg;
import X.C1DD;
import X.C39523FfD;
import X.C39942Fly;
import X.C40197Fq5;
import X.C47523Ikx;
import X.C58667N0t;
import X.C60540NpQ;
import X.C60682Nri;
import X.C60740Nse;
import X.C65300Pk0;
import X.C79359VCp;
import X.C79402VEg;
import X.C79403VEh;
import X.C79411VEp;
import X.C79462VGo;
import X.C79600VLw;
import X.C79631VNb;
import X.C79636VNg;
import X.C79646VNq;
import X.C79655VNz;
import X.EnumC59959Ng3;
import X.EnumC79630VNa;
import X.EnumC79647VNr;
import X.EnumC79692VPk;
import X.InterfaceC79637VNh;
import X.InterfaceC79640VNk;
import X.InterfaceC79641VNl;
import X.InterfaceC79644VNo;
import X.OB1;
import X.PPQ;
import X.RunnableC79632VNc;
import X.V9Y;
import X.VEY;
import X.VF1;
import X.VNG;
import X.VNL;
import X.VNS;
import X.VNT;
import X.VNU;
import X.VNV;
import X.VNW;
import X.VNX;
import X.VNY;
import X.VOE;
import X.VOL;
import X.VON;
import X.VOR;
import X.VPV;
import X.VPY;
import X.X1D;
import Y.ARunnableS1S1101000_6;
import Y.ARunnableS21S0300000_10;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS50S0100000_14;
import Y.ARunnableS7S1300000_10;
import Y.ARunnableS9S1200000_10;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.jsbridge.LynxAccessibilityModule;
import com.lynx.jsbridge.LynxExposureModule;
import com.lynx.jsbridge.LynxIntersectionObserverModule;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.jsbridge.LynxResourceModule;
import com.lynx.jsbridge.LynxSetModule;
import com.lynx.jsbridge.LynxUIMethodModule;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class LynxTemplateRender {
    public static boolean LJJIJLIJ = true;
    public static final boolean LJJIL = LynxEnv.LIZLLL("enable_vsync_aligned_flush");
    public TemplateAssembler LIZ;
    public VOR LIZIZ;
    public VOL LIZJ;
    public VNY LIZLLL;
    public C79359VCp LJ;
    public int LJFF;
    public int LJI;
    public String LJII;
    public boolean LJIIIIZZ;
    public C79636VNg LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public EnumC59959Ng3 LJIIL;
    public C79403VEh LJIILIIL;
    public final VNV LJIILJJIL;
    public VPV LJIILL;
    public C60682Nri LJIILLIIL;
    public C60540NpQ LJIIZILJ;
    public LynxModuleManager LJIJ;
    public C79646VNq LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public VNS LJIL;
    public boolean LJJ;
    public PaintingContext LJJI;
    public VNG LJJIFFI;
    public TemplateData LJJII;
    public ExternalSourceLoader LJJIII;
    public long LJJIIJ;
    public VNX LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public boolean LJJIJ;
    public float LJJIJIIJI;
    public C60740Nse LJJIJIIJIL;
    public boolean LJJIJIL;
    public final VEY LJJIJL;
    public Context mContext;
    public VNU mLynxContext;

    public final void LIZ() {
        C79636VNg c79636VNg = this.LJIIIZ;
        if (c79636VNg != null) {
            EnumC79630VNa enumC79630VNa = c79636VNg.LIZ;
            EnumC79630VNa enumC79630VNa2 = EnumC79630VNa.PENDING;
            if (enumC79630VNa == enumC79630VNa2) {
                this.LJIIIIZZ = false;
                c79636VNg.getClass();
                c79636VNg.LIZ = enumC79630VNa2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        VF1 vf1;
        InterfaceC79644VNo interfaceC79644VNo;
        if (!this.LJIJJ) {
            return;
        }
        if (this.LJIIL == EnumC59959Ng3.ALL_ON_UI) {
            C79359VCp c79359VCp = new C79359VCp(this.LJIL);
            this.LJ = c79359VCp;
            vf1 = c79359VCp;
        } else {
            vf1 = new VF1();
        }
        this.LIZLLL = new VNY(this);
        boolean z = true;
        if (!C39942Fly.LIZJ.booleanValue()) {
            VOR vor = this.LIZIZ;
            if (this.LJIIL != EnumC59959Ng3.MULTI_THREADS && !this.LJIIZILJ.LJIIJ) {
                z = false;
            }
            this.LJJI = new PaintingContext(vor, z);
            VOL vol = new VOL(this.mLynxContext, this.LJIIZILJ.LIZIZ, vf1, this.LIZLLL);
            this.LIZJ = vol;
            VNU vnu = this.mLynxContext;
            vnu.getClass();
            vnu.LJLLLLLL = new WeakReference<>(vol);
            PaintingContext paintingContext = this.LJJI;
            VOL vol2 = this.LIZJ;
            DynamicComponentLoader dynamicComponentLoader = new DynamicComponentLoader(this.LJIIZILJ.LJI, this);
            C60682Nri c60682Nri = this.LJIILLIIL;
            EnumC59959Ng3 enumC59959Ng3 = this.LJIIL;
            C60540NpQ c60540NpQ = this.LJIIZILJ;
            boolean z2 = c60540NpQ.LJ;
            boolean z3 = c60540NpQ.LJIIIIZZ;
            boolean z4 = c60540NpQ.LJIIIZ;
            boolean booleanValue = Boolean.valueOf(c60540NpQ.LJIILIIL).booleanValue();
            C60540NpQ c60540NpQ2 = this.LJIIZILJ;
            TemplateAssembler templateAssembler = new TemplateAssembler(paintingContext, vol2, dynamicComponentLoader, c60682Nri, enumC59959Ng3, z2, z3, z4, booleanValue, c60540NpQ2.LJIILJJIL, c60540NpQ2.LJIILL, c60540NpQ2.LJIIJJI, false);
            this.LIZ = templateAssembler;
            this.LIZIZ.LJIILIIL = templateAssembler;
        } else {
            try {
                LayoutContext layoutContext = (LayoutContext) Class.forName("com.lynx.tasm.behavior.LayoutContextRenderkit").getConstructor(VON.class).newInstance(this.LIZLLL);
                long nativePaintingContextPtr = this.LJIL.getNativePaintingContextPtr();
                VNU vnu2 = this.mLynxContext;
                DynamicComponentLoader dynamicComponentLoader2 = new DynamicComponentLoader(this.LJIIZILJ.LJI, this);
                C60682Nri c60682Nri2 = this.LJIILLIIL;
                EnumC59959Ng3 enumC59959Ng32 = this.LJIIL;
                C60540NpQ c60540NpQ3 = this.LJIIZILJ;
                this.LIZ = new TemplateAssembler(nativePaintingContextPtr, vnu2, layoutContext, dynamicComponentLoader2, c60682Nri2, enumC59959Ng32, c60540NpQ3.LJ, c60540NpQ3.LJIILJJIL, c60540NpQ3.LJIILL, this.LIZIZ.LJIIIIZZ);
            } catch (Exception e) {
                throw new RuntimeException(C1DD.LJ("Fatal: find LayoutContextRenderkit error: ", e));
            }
        }
        this.mLynxContext.LJLJJL = new VNL(this.LIZ);
        VNU vnu3 = this.mLynxContext;
        VNS vns = this.LJIL;
        vnu3.getClass();
        vnu3.LJLLLL = new WeakReference<>(vns);
        this.mLynxContext.LJLJL = new C79655VNz(this.LIZ);
        VNX vnx = this.LJJIIJZLJL;
        if (vnx != null && (interfaceC79644VNo = vnx.LIZ) != null) {
            interfaceC79644VNo.LJIIIZ();
        }
        C47523Ikx c47523Ikx = new C47523Ikx();
        for (Map.Entry entry : ((HashMap) LynxEnv.LJIIIZ().LJJI).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(str)) {
                ((Map) c47523Ikx.LIZ).put(str, value);
            }
        }
        for (Map.Entry entry2 : ((HashMap) this.LJIIZILJ.LJII).entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (!TextUtils.isEmpty(str2)) {
                ((Map) c47523Ikx.LIZ).put(str2, value2);
            }
        }
        this.mLynxContext.LL = c47523Ikx;
        this.LJIIZILJ.getClass();
        TemplateAssembler templateAssembler2 = this.LIZ;
        VNU vnu4 = this.mLynxContext;
        templateAssembler2.getClass();
        templateAssembler2.LJIIJJI = new WeakReference<>(vnu4);
        LynxModuleManager lynxModuleManager = new LynxModuleManager(this.mLynxContext);
        this.LJIJ = lynxModuleManager;
        List<C39523FfD> list = this.LJIIZILJ.LIZJ;
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C39523FfD c39523FfD = (C39523FfD) it.next();
                    String str3 = c39523FfD.LIZ;
                    Object obj = ((HashMap) lynxModuleManager.LIZ).get(str3);
                    if (obj != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Duplicated LynxModule For Name: ");
                        LIZ.append(str3);
                        LIZ.append(", ");
                        LIZ.append(obj);
                        LIZ.append(" will be override");
                        LLog.LIZLLL(4, "LynxModuleManager", X1D.LIZIZ(LIZ));
                    }
                    ((HashMap) lynxModuleManager.LIZ).put(str3, c39523FfD);
                }
            }
        }
        Long l = null;
        this.LJIJ.LIZJ(LynxIntersectionObserverModule.NAME, LynxIntersectionObserverModule.class, null);
        this.LJIJ.LIZJ(LynxUIMethodModule.NAME, LynxUIMethodModule.class, null);
        this.LJIJ.LIZJ(LynxAccessibilityModule.NAME, LynxAccessibilityModule.class, null);
        this.LJIJ.LIZJ(LynxSetModule.NAME, LynxSetModule.class, null);
        this.LJIJ.LIZJ(LynxResourceModule.NAME, LynxResourceModule.class, null);
        this.LJIJ.LIZJ(LynxExposureModule.NAME, LynxExposureModule.class, null);
        this.LJJIII = new ExternalSourceLoader((AbstractC61008Nwy) ((HashMap) this.LJIIZILJ.LJII).get("EXTERNAL_JS_SOURCE"), (AbstractC61008Nwy) ((HashMap) this.LJIIZILJ.LJII).get("DYNAMIC_COMPONENT"), this.LJIIZILJ.LJI, this);
        if (C60682Nri.LIZIZ(this.LJIILLIIL)) {
            C60740Nse c60740Nse = this.LJJIJIIJIL;
            if (c60740Nse == null) {
                LLog.LIZLLL(4, "LynxTemplateRender", "LynxKryptonHelper null");
            } else if (c60740Nse.LIZ == null) {
                LLog.LIZLLL(4, "LynxTemplateRender", "LynxKryptonHelper getCanvasManager null");
            } else {
                LLog.LIZLLL(2, "LynxTemplateRender", "LynxKryptonHelper init");
                this.LIZ.LJJIIZ();
                C60740Nse c60740Nse2 = this.LJJIJIIJIL;
                C60540NpQ c60540NpQ4 = this.LJIIZILJ;
                C60682Nri c60682Nri3 = c60540NpQ4.LIZLLL;
                C58667N0t c58667N0t = c60540NpQ4.LIZIZ;
                PPQ ppq = c60740Nse2.LIZ;
                if (ppq != null) {
                    ppq.init(this, c60682Nri3, c58667N0t);
                } else {
                    LLog.LIZLLL(4, "LynxKryptonHelper", "LynxKrypton init error: no mICanvasManagerInstance");
                }
                if (this.LJJIJIIJIL.LIZ.isNativeCanvasAppReady()) {
                    this.LIZ.LJJIIZ();
                } else {
                    LLog.LIZLLL(4, "LynxTemplateRender", "LynxKryptonHelper canvas app native not ready");
                }
            }
        }
        TemplateAssembler templateAssembler3 = this.LIZ;
        LynxModuleManager lynxModuleManager2 = this.LJIJ;
        ExternalSourceLoader externalSourceLoader = this.LJJIII;
        this.LJIIZILJ.getClass();
        this.LJIIZILJ.getClass();
        templateAssembler3.LJI(lynxModuleManager2, externalSourceLoader, this.LJIIZILJ.LJIIL);
        VNX vnx2 = this.LJJIIJZLJL;
        if (vnx2 != null) {
            LynxModuleManager lynxModuleManager3 = this.LJIJ;
            try {
                Class<?> cls = Class.forName("com.lynx.devtool.module.LynxDevtoolSetModule");
                lynxModuleManager3.LIZJ((String) cls.getField("NAME").get(null), cls, null);
                LLog.LIZLLL(2, VNX.LJFF, "register LynxDevtoolSetModule!");
            } catch (Exception unused) {
                LLog.LIZLLL(4, VNX.LJFF, "failed to register LynxDevtoolSetModule!");
            }
            InterfaceC79644VNo interfaceC79644VNo2 = vnx2.LIZ;
            if (interfaceC79644VNo2 != null) {
                interfaceC79644VNo2.LJ();
            }
        }
        VNU vnu5 = this.mLynxContext;
        JSProxy jSProxy = this.LIZ.LJFF;
        vnu5.getClass();
        vnu5.LJLJLJ = new WeakReference<>(jSProxy);
        ExternalSourceLoader externalSourceLoader2 = this.LJJIII;
        JSProxy jSProxy2 = this.LIZ.LJFF;
        externalSourceLoader2.getClass();
        externalSourceLoader2.LJ = new WeakReference<>(jSProxy2);
        C79646VNq c79646VNq = new C79646VNq(this.mLynxContext, this.LIZ.LJFF);
        this.LJIJI = c79646VNq;
        VNU vnu6 = this.mLynxContext;
        vnu6.getClass();
        vnu6.LJLLILLLL = new WeakReference<>(c79646VNq);
        VNL vnl = this.mLynxContext.LJLJJL;
        C79646VNq c79646VNq2 = this.LJIJI;
        if (!vnl.LIZIZ.contains(c79646VNq2)) {
            vnl.LIZIZ.add(c79646VNq2);
        }
        VNG vng = this.LJJIFFI;
        if (vng != null) {
            this.LIZ.LJJIJIIJIL(vng);
        }
        TemplateData templateData = this.LJJII;
        if (templateData != null) {
            this.LIZ.LJJJIL(templateData);
        }
        float f = this.LJJIJIIJI;
        if (f != 1.0f) {
            this.LIZ.LJJIIZI(f);
        }
        TemplateAssembler templateAssembler4 = this.LIZ;
        C58667N0t c58667N0t2 = this.LJIIZILJ.LIZIZ;
        c58667N0t2.getClass();
        HashSet hashSet = new HashSet();
        Iterator it2 = ((HashMap) c58667N0t2.LIZ).values().iterator();
        while (it2.hasNext()) {
            hashSet.add(((C40197Fq5) it2.next()).LIZ);
        }
        templateAssembler4.LJIILJJIL = hashSet;
        if (this.LJJIIJZLJL != null && this.mLynxContext != null && Boolean.valueOf(this.LJIIZILJ.LJIILIIL).booleanValue()) {
            VNX vnx3 = this.LJJIIJZLJL;
            JSProxy jSProxy3 = this.mLynxContext.LJLJLJ.get();
            if (jSProxy3 != null) {
                l = Long.valueOf(jSProxy3.LIZIZ);
            }
            l.longValue();
            InterfaceC79637VNh interfaceC79637VNh = vnx3.LIZIZ;
            if (interfaceC79637VNh != null) {
                interfaceC79637VNh.LIZJ();
            }
        }
    }

    public final void LJ() {
        LynxModuleManager lynxModuleManager = this.LJIJ;
        if (lynxModuleManager != null) {
            lynxModuleManager.LJFF = true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroyNative url ");
        LIZ.append(LJIIIIZZ());
        LIZ.append(" in ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxTemplateRender", X1D.LIZIZ(LIZ));
        VNX vnx = this.LJJIIJZLJL;
        if (vnx != null) {
            InterfaceC79644VNo interfaceC79644VNo = vnx.LIZ;
            if (interfaceC79644VNo != null) {
                interfaceC79644VNo.destroy();
                vnx.LIZ = null;
            }
            InterfaceC79637VNh interfaceC79637VNh = vnx.LIZIZ;
            if (interfaceC79637VNh != null) {
                interfaceC79637VNh.destroy();
                vnx.LIZIZ = null;
            }
            this.LJJIIJZLJL = null;
        }
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LIZ();
            this.LIZ = null;
        }
        this.LJIIJ = true;
    }

    public final String LJIIIIZZ() {
        String str = this.LJII;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void LJIILJJIL() {
        if (!this.LJIJJ) {
            LJIILIIL(100, "LynxEnv has not been prepared successfully!");
            return;
        }
        this.LJIJJLI = true;
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIILIIL();
        }
        LJIIZILJ();
        TemplateAssembler templateAssembler2 = this.LIZ;
        if (templateAssembler2 != null) {
            templateAssembler2.LIZJ = this.LJIILJJIL;
            LJFF(this.LJII);
        }
    }

    public final void LJIIZILJ() {
        WeakReference<C79646VNq> weakReference;
        C79646VNq c79646VNq;
        InterfaceC79644VNo interfaceC79644VNo;
        if (this.LJIIJ) {
            return;
        }
        if (this.LJIIIIZZ) {
            this.LJIIJJI = false;
            this.LJIIIZ = null;
            if (this.LJIL != null) {
                if (C79411VEp.LIZ()) {
                    this.LJIL.reloadAndInit();
                } else {
                    C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 33));
                }
            }
            TemplateData templateData = this.LJJII;
            if (templateData != null) {
                this.LJJII = templateData.LIZ();
            }
            PaintingContext paintingContext = this.LJJI;
            if (paintingContext != null) {
                paintingContext.LIZIZ = true;
            }
            VNX vnx = this.LJJIIJZLJL;
            if (vnx != null && (interfaceC79644VNo = vnx.LIZ) != null) {
                interfaceC79644VNo.LJFF();
            }
            TemplateAssembler templateAssembler = this.LIZ;
            if (templateAssembler != null) {
                templateAssembler.LIZ();
                this.LIZ = null;
            }
            int i = this.LJFF;
            int i2 = this.LJI;
            this.LJFF = 0;
            this.LJI = 0;
            VOR vor = this.LIZIZ;
            vor.LJIIJJI = true;
            vor.LIZ = -1;
            HashMap<Integer, LynxBaseUI> hashMap = vor.LJI;
            if (hashMap != null) {
                Iterator<LynxBaseUI> it = hashMap.values().iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                vor.LJI.clear();
                vor.LJ.clear();
            }
            UIBody uIBody = vor.LIZIZ;
            if (uIBody != null) {
                uIBody.removeAll();
            }
            HashMap<Integer, Integer> hashMap2 = vor.LJIIIZ;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            C79600VLw c79600VLw = vor.LJIIIIZZ;
            c79600VLw.getClass();
            C79411VEp.LJ(new ARunnableS50S0100000_14(c79600VLw, 45));
            VNU vnu = this.mLynxContext;
            if (vnu != null) {
                synchronized (vnu.LJLJJI) {
                    ((HashMap) vnu.LJLJJI).clear();
                }
                VPV vpv = vnu.LJLJJLL;
                if (vpv != null) {
                    vpv.LIZJ = null;
                    vpv.LJ = null;
                    vpv.LJFF.clear();
                }
                VOE voe = vnu.LLFZ;
                if (voe != null) {
                    C79411VEp.LJ(new ARunnableS50S0100000_14(voe, 40));
                }
                if (vnu.LLIIJI && (weakReference = vnu.LJLLILLLL) != null && (c79646VNq = weakReference.get()) != null) {
                    C79411VEp.LJ(new ARunnableS50S0100000_14(c79646VNq, 197));
                }
            }
            LIZLLL();
            LJJII(i, i2);
            this.LIZIZ.LJIIIIZZ.LJIIIIZZ("setup_create_lynx_start", this.LJJIIZ, null);
            this.LIZIZ.LJIIIIZZ.LJIIIIZZ("setup_create_lynx_end", this.LJJIIZI, null);
            this.LIZIZ.LJIIIIZZ.LIZ = this.LJIIL;
            return;
        }
        this.LJIIIIZZ = true;
    }

    public final void LJIIIZ() {
        UIBody uIBody;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxview onDetachedFromWindow ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxTemplateRender", X1D.LIZIZ(LIZ));
        TraceEvent.LJII("onDetachedFromWindow", "#fff59d");
        TraceEvent.LIZIZ("Client.onReportComponentInfo");
        VNV vnv = this.LJIILJJIL;
        this.LIZIZ.getClass();
        vnv.LJJ(new HashSet());
        TraceEvent.LJ("Client.onReportComponentInfo");
        VOR vor = this.LIZIZ;
        if (vor != null && (uIBody = vor.LIZIZ) != null) {
            uIBody.onDetach();
        }
        LJIIJ(false);
    }

    public final void finalize() {
        super.finalize();
        LJ();
    }

    public static String[] LJIILLIIL(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("=|&");
        String str2 = "";
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 < split.length) {
                if (split[i].equalsIgnoreCase("compile_path") || split[i].equalsIgnoreCase("compilePath")) {
                    str = split[i2];
                } else if (split[i].equalsIgnoreCase("post_url") || split[i].equalsIgnoreCase("postUrl")) {
                    str2 = split[i2];
                }
                i += 2;
            } else {
                arrayList.add(str);
                arrayList.add(str2);
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
        }
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        VPY vpy = this.LJIILL.LIZJ;
        if (vpy == null) {
            return false;
        }
        while (vpy.parent() != vpy) {
            if (vpy.blockNativeEvent(motionEvent)) {
                return true;
            }
            vpy = vpy.parent();
            if (vpy == null) {
                return false;
            }
        }
        return false;
    }

    public final boolean LIZJ(MotionEvent motionEvent) {
        VPV vpv = this.LJIILL;
        boolean z = false;
        if (!vpv.LJI) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float x = motionEvent.getX() - vpv.LJIIIIZZ.x;
                float y = motionEvent.getY() - vpv.LJIIIIZZ.y;
                if (Math.abs(x) <= V9Y.LIZ(10.0f) && Math.abs(y) <= V9Y.LIZ(10.0f)) {
                    return vpv.LJFF(true);
                }
                if (vpv.LJII == EnumC79647VNr.Undefined) {
                    vpv.LJII = EnumC79647VNr.Disable;
                    double atan2 = (Math.atan2(y, x) * 180.0f) / 3.141592653589793d;
                    VPY vpy = vpv.LIZJ;
                    while (true) {
                        if (vpy == null || vpy.parent() == vpy) {
                            break;
                        }
                        if (vpy.consumeSlideEvent((float) atan2)) {
                            vpv.LJII = EnumC79647VNr.Enable;
                            break;
                        }
                        vpy = vpy.parent();
                    }
                }
            }
        } else {
            vpv.LJII = EnumC79647VNr.Undefined;
        }
        if (vpv.LJII == EnumC79647VNr.Enable) {
            z = true;
        }
        return vpv.LJFF(z);
    }

    public final void LJFF(String str) {
        if (new C03880Dg(2).LIZJ(300004, "com/lynx/tasm/LynxTemplateRender", "dispatchOnPageStart", this, new Object[]{str}, "void", new C65300Pk0(false, "(Ljava/lang/String;)V", "6767503895215439909")).LIZ) {
            return;
        }
        StringBuilder LIZIZ = C07780Sg.LIZIZ("dispatchOnPageStart url ", str, " in ");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxTemplateRender", LIZIZ.toString());
        if (this.LJIIJJI || this.LJIILJJIL == null) {
            return;
        }
        this.LJIIJJI = true;
        TraceEvent.LJII("StartLoad", "#4caf50");
        TraceEvent.LIZIZ("Client.onPageStart");
        this.LJIILJJIL.LJIILL(str);
        TraceEvent.LJ("Client.onPageStart");
    }

    public final LynxBaseUI LJI(String str) {
        for (LynxBaseUI lynxBaseUI : this.LIZIZ.LJI.values()) {
            if (lynxBaseUI != null && str.equals(lynxBaseUI.mName)) {
                return lynxBaseUI;
            }
        }
        return null;
    }

    public final String LJII(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(currentTimeMillis));
        sb.append(" ");
        sb.append(str);
        sb.append(" LynxView ");
        C79403VEh c79403VEh = this.LJIILIIL;
        if (c79403VEh != null) {
            sb.append(c79403VEh.LJFF);
            sb.append(" ");
            String str2 = this.LJIILIIL.LIZIZ;
            if (str2 != null) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public final void LJIIJ(boolean z) {
        List<InterfaceC79641VNl> list;
        VNX vnx = this.LJJIIJZLJL;
        if (vnx != null) {
            InterfaceC79644VNo interfaceC79644VNo = vnx.LIZ;
            if (interfaceC79644VNo != null) {
                interfaceC79644VNo.LJIIIIZZ();
            }
            InterfaceC79640VNk interfaceC79640VNk = vnx.LJ;
            if (interfaceC79640VNk != null) {
                interfaceC79640VNk.hide();
            }
        }
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIILLIIL(z);
        }
        VOR vor = this.LIZIZ;
        if (vor == null || (list = vor.LJFF) == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((InterfaceC79641VNl) it.next()).LJIJJ();
        }
    }

    public final void LJIIJJI(boolean z) {
        List<InterfaceC79641VNl> list;
        InterfaceC79640VNk interfaceC79640VNk;
        VNX vnx = this.LJJIIJZLJL;
        if (vnx != null) {
            InterfaceC79644VNo interfaceC79644VNo = vnx.LIZ;
            if (interfaceC79644VNo != null) {
                interfaceC79644VNo.LIZLLL();
            }
            if (LynxEnv.LJIIIZ().LJ("enable_perf_monitor_debug", false) && (interfaceC79640VNk = vnx.LJ) != null) {
                interfaceC79640VNk.show();
            }
        }
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIIZILJ(z);
        }
        VOR vor = this.LIZIZ;
        if (vor == null || (list = vor.LJFF) == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((InterfaceC79641VNl) it.next()).LJIILJJIL();
        }
    }

    public final boolean LJIILL(TemplateData templateData) {
        C79631VNb c79631VNb;
        if (!this.LJIJJ || this.LIZ == null) {
            return false;
        }
        if (templateData == null) {
            LLog.LIZLLL(4, "LynxTemplateRender", "updateData with null TemplateData");
            return false;
        }
        templateData.LIZLLL();
        if (templateData.LIZ == 0) {
            LLog.LIZLLL(4, "LynxTemplateRender", "updateData with TemplateData after flush is nullptr");
            return false;
        }
        VNX vnx = this.LJJIIJZLJL;
        if (vnx != null && (c79631VNb = vnx.LIZLLL) != null) {
            c79631VNb.LIZ.LIZ = templateData;
        }
        this.LJIJJLI = true;
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIILIIL();
        }
        return true;
    }

    public final void LJJI(String str) {
        File externalCacheDir;
        File filesDir;
        this.LJII = str;
        LynxEnv.LJIIIZ().getClass();
        VNU vnu = this.mLynxContext;
        if (vnu != null) {
            String str2 = this.LJII;
            vnu.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setTemplateUrl: ");
            LIZ.append(str2);
            LLog.LIZLLL(4, "LynxContext", X1D.LIZIZ(LIZ));
            vnu.LJLLJ = str2;
        }
        C79403VEh c79403VEh = this.LJIILIIL;
        if (c79403VEh != null) {
            VNU vnu2 = this.mLynxContext;
            String str3 = this.LJII;
            c79403VEh.getClass();
            if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, c79403VEh.LIZ)) {
                c79403VEh.LIZ = str3;
                TraceEvent.LIZIZ("LynxGenericInfo.updateRelativeURL");
                c79403VEh.LIZIZ = c79403VEh.LIZ;
                String str4 = C79403VEh.LJIIJ;
                if ((str4 == null || str4.isEmpty()) && vnu2 != null && (externalCacheDir = vnu2.getExternalCacheDir()) != null) {
                    C79403VEh.LJIIJ = externalCacheDir.getPath();
                }
                String str5 = C79403VEh.LJIIJJI;
                if ((str5 == null || str5.isEmpty()) && vnu2 != null && (filesDir = vnu2.getFilesDir()) != null) {
                    C79403VEh.LJIIJJI = filesDir.getPath();
                }
                String str6 = C79403VEh.LJIIJ;
                if (str6 != null && !str6.isEmpty()) {
                    c79403VEh.LIZIZ = c79403VEh.LIZIZ.replace(C79403VEh.LJIIJ, "");
                }
                String str7 = C79403VEh.LJIIJJI;
                if (str7 != null && !str7.isEmpty()) {
                    c79403VEh.LIZIZ = c79403VEh.LIZIZ.replace(C79403VEh.LJIIJJI, "");
                }
                String str8 = c79403VEh.LIZIZ;
                if (!TextUtils.isEmpty(str8)) {
                    try {
                        Uri parse = UriProtector.parse(str8);
                        if (parse.isHierarchical()) {
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme(parse.getScheme()).encodedAuthority(parse.getEncodedAuthority()).encodedPath(parse.getEncodedPath());
                            Iterator it = ((HashSet) C79403VEh.LJIIIZ).iterator();
                            while (it.hasNext()) {
                                String str9 = (String) it.next();
                                String queryParameter = UriProtector.getQueryParameter(parse, str9);
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    builder.appendQueryParameter(str9, queryParameter);
                                }
                            }
                            str8 = builder.toString();
                        }
                    } catch (IllegalArgumentException | IndexOutOfBoundsException | NullPointerException | UnsupportedOperationException e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Parsing hierarchical schema failed for url is null with ");
                        LIZ2.append(e.getMessage());
                        LLog.LIZLLL(3, "LynxGenericInfo", X1D.LIZIZ(LIZ2));
                    }
                }
                c79403VEh.LIZIZ = str8;
                c79403VEh.LIZIZ = PatternProtector.compile("/offlineX/[a-z0-9A-Z]+").matcher(c79403VEh.LIZIZ).replaceFirst("");
                TraceEvent.LJ("LynxGenericInfo.updateRelativeURL");
            }
        }
        VEY vey = this.LJJIJL;
        if (vey != null) {
            vey.LIZ("last_lynx_url", this.LJIILIIL.LIZIZ);
        }
        LLog.LIZLLL(2, "LynxTemplateRender", LJII("renderTemplate"));
    }

    public final void LJJIFFI(TemplateData templateData) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateGlobalProps with url: ");
        LIZ.append(LJIIIIZZ());
        LLog.LIZLLL(1, "LynxTemplateRender", X1D.LIZIZ(LIZ));
        TraceEvent.LIZIZ("TemplateRender.setGlobalProps");
        if (this.LJIJJ && this.LIZ != null && templateData != null) {
            if (this.LJJII == null) {
                this.LJJII = TemplateData.LJ(new HashMap());
            }
            this.LJJII.LJIIIZ(templateData);
            this.LIZ.LJJJIL(this.LJJII);
        }
        TraceEvent.LJ("TemplateRender.setGlobalProps");
    }

    public final void LJIILIIL(int i, String str) {
        LJIIL(-3, i, str, null, null);
    }

    public final void LJIJI(String str, byte[] bArr) {
        if ((!this.LJJ || this.LJIIIIZZ) && !C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS9S1200000_10(this, bArr, str, 0));
            return;
        }
        LJIILJJIL();
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIIJ(bArr, str, LJIIIIZZ(), new VNT(this, this.LIZ.LJI));
        }
    }

    public final void LJIJJ(byte[] bArr, TemplateData templateData) {
        if ((!this.LJJ || this.LJIIIIZZ) && !C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS25S0300000_14(this, bArr, templateData, 1));
            return;
        }
        LJIILJJIL();
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIIIZ(bArr, templateData, LJIIIIZZ(), new VNT(this, this.LIZ.LJI));
        }
    }

    public final void LJIJJLI(byte[] bArr, Map<String, Object> map) {
        if ((!this.LJJ || this.LJIIIIZZ) && !C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS21S0300000_10(bArr, map, this, 1));
            return;
        }
        LJIILJJIL();
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIIJJI(bArr, map, LJIIIIZZ(), new VNT(this, this.LIZ.LJI));
        }
    }

    public final void LJJ(String str, VNW vnw) {
        if (!this.LJIJJ) {
            LJIILIIL(100, "LynxEnv has not been prepared successfully!");
            return;
        }
        LJJI(LJIILLIIL(str)[0]);
        if (this.LJIIZILJ.LIZ != null && !TextUtils.isEmpty(str)) {
            LJFF(this.LJII);
            C79600VLw c79600VLw = this.LIZIZ.LJIIIIZZ;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis != 0) {
                c79600VLw.LJIIIIZZ("prepare_template_start", currentTimeMillis, null);
            } else {
                c79600VLw.getClass();
            }
            this.LJIIZILJ.LIZ.LIZ(vnw, this.LJII);
            return;
        }
        throw new IllegalArgumentException("LynxTemplateRender template url is null or TemplateProvider is not init");
    }

    public final void LJJII(int i, int i2) {
        if (!this.LJIJJ || this.LIZ == null) {
            return;
        }
        if (this.LJFF == i && this.LJI == i2 && !this.LJJIJ) {
            return;
        }
        if (this.LJJIJ) {
            this.LJJIJ = false;
        }
        int fromMeasureSpec = EnumC79692VPk.fromMeasureSpec(i);
        int size = View.MeasureSpec.getSize(i);
        int fromMeasureSpec2 = EnumC79692VPk.fromMeasureSpec(i2);
        this.LIZ.LJJJJI(size, fromMeasureSpec, View.MeasureSpec.getSize(i2), fromMeasureSpec2);
        this.LJFF = i;
        this.LJI = i2;
    }

    public void updateData(Map<String, Object> map, String str) {
        TemplateData LJ = TemplateData.LJ(map);
        LJ.LIZLLL = str;
        LJ.LJFF = true;
        if (LJIILL(LJ)) {
            this.LIZ.LJJJ(LJ);
        }
        LLog.LIZLLL(2, "LynxTemplateRender", LJII("update"));
    }

    public LynxTemplateRender(Context context, VNS vns, C60540NpQ c60540NpQ) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        EnumC59959Ng3 enumC59959Ng3;
        VNV vnv = new VNV();
        this.LJIILJJIL = vnv;
        this.LJJIIJ = -1L;
        this.LJJIJ = true;
        this.LJJIJIIJI = 1.0f;
        this.LJJIJIL = true;
        this.LJJIJL = new VEY();
        TraceEvent.LIZIZ("TemplateRender.init");
        this.LJJIIZ = System.currentTimeMillis();
        this.mContext = context;
        this.LJIL = vns;
        this.LJIILIIL = new C79403VEh(this.LJIL);
        LLog.LIZLLL(2, "LynxTemplateRender", LJII("create"));
        this.LJIILLIIL = c60540NpQ.LIZLLL;
        EnumC59959Ng3 enumC59959Ng32 = c60540NpQ.LJIILLIIL;
        this.LJIIL = enumC59959Ng32;
        if (enumC59959Ng32 == EnumC59959Ng3.MULTI_THREADS) {
            z = true;
        } else {
            z = false;
        }
        this.LJJ = z;
        C79403VEh c79403VEh = this.LJIILIIL;
        c79403VEh.getClass();
        c79403VEh.LIZJ = enumC59959Ng32.id();
        this.LJIIZILJ = c60540NpQ;
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        this.LJIJJ = LJIIIZ.LJIILIIL;
        if (LJJIL && LynxEnv.LJIIIZ().LJIIJJI && ((enumC59959Ng3 = this.LJIIL) == EnumC59959Ng3.ALL_ON_UI || enumC59959Ng3 == EnumC59959Ng3.PART_ON_LAYOUT)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJJIJIL = z2;
        this.LJJIJIIJI = c60540NpQ.LJIJJLI;
        Float f = c60540NpQ.LJFF;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        DisplayMetrics LIZIZ = DisplayMetricsHolder.LIZIZ();
        if (LIZIZ != null && (displayMetrics.widthPixels != LIZIZ.widthPixels || displayMetrics.heightPixels != LIZIZ.heightPixels)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f != null) {
            displayMetrics.density = f.floatValue();
        }
        synchronized (DisplayMetricsHolder.class) {
            if (DisplayMetricsHolder.LIZ == null) {
                DisplayMetricsHolder.LIZ = new DisplayMetrics();
            }
            DisplayMetricsHolder.LIZ.setTo(displayMetrics);
        }
        int i2 = context.getResources().getConfiguration().orientation;
        if (DisplayMetricsHolder.LIZJ != i2) {
            z4 = true;
        } else {
            z4 = false;
        }
        DisplayMetricsHolder.LIZJ = i2;
        float f2 = DisplayMetricsHolder.LIZLLL;
        float f3 = displayMetrics.scaledDensity;
        boolean z5 = f2 != f3;
        DisplayMetricsHolder.LIZLLL = f3;
        if (DisplayMetricsHolder.LIZIZ() == null || z4 || z5 || z3 || !DisplayMetricsHolder.LJ) {
            DisplayMetrics LIZ = DisplayMetricsHolder.LIZ(context);
            if (f != null) {
                LIZ.density = f.floatValue();
            }
            DisplayMetricsHolder.LIZLLL(LIZ);
        }
        DisplayMetrics LIZIZ2 = DisplayMetricsHolder.LIZIZ();
        int i3 = c60540NpQ.LJIJI;
        if (i3 != -1 && (i = c60540NpQ.LJIJJ) != -1) {
            LIZIZ2.widthPixels = i3;
            LIZIZ2.heightPixels = i;
            DisplayMetricsHolder.LJ(i3, i);
        }
        this.mLynxContext = new C79462VGo(this, context, LIZIZ2);
        this.LJIIZILJ.getClass();
        LynxEnv LJIIIZ2 = LynxEnv.LJIIIZ();
        if (!LJIIIZ2.LJIILJJIL) {
            C79411VEp.LJ(new ARunnableS42S0100000_6(LJIIIZ2, 24));
        }
        this.LJIIIIZZ = false;
        this.LJIIJJI = false;
        this.LJIIJ = false;
        VNU vnu = this.mLynxContext;
        vnu.LJLIL = vnv;
        vnu.LJLLL = vnv;
        if (C60682Nri.LIZIZ(this.LJIILLIIL)) {
            C60740Nse c60740Nse = new C60740Nse();
            this.LJJIJIIJIL = c60740Nse;
            VNU vnu2 = this.mLynxContext;
            vnu2.getClass();
            vnu2.LLFII = new WeakReference<>(c60740Nse);
        }
        VOR vor = new VOR(this.mLynxContext, this.LJIIZILJ.LIZIZ, this.LJIL);
        this.LIZIZ = vor;
        VNU vnu3 = this.mLynxContext;
        vnu3.getClass();
        vnu3.LJLLI = new WeakReference<>(vor);
        VOE voe = vnu3.LLFZ;
        UIBody uIBody = vor.LIZIZ;
        voe.getClass();
        voe.LIZ = new WeakReference<>(uIBody);
        voe.LJIJ = voe.LJFF(uIBody.mContext);
        VPV vpv = new VPV(this.LIZIZ);
        this.LJIILL = vpv;
        this.mLynxContext.LJLJJLL = vpv;
        VNS vns2 = this.LJIL;
        this.LJIIZILJ.getClass();
        VNX vnx = new VNX(vns2, this);
        this.LJJIIJZLJL = vnx;
        InterfaceC79644VNo interfaceC79644VNo = vnx.LIZ;
        if (interfaceC79644VNo != null) {
            interfaceC79644VNo.LJIIJ();
        }
        InterfaceC79644VNo interfaceC79644VNo2 = this.LJJIIJZLJL.LIZ;
        if (interfaceC79644VNo2 != null) {
            interfaceC79644VNo2.LJII();
        }
        LIZLLL();
        LJJII(c60540NpQ.LJIIZILJ, c60540NpQ.LJIJ);
        vnv.LJJIIZI(LynxEnv.LJIIIZ().LJIIZILJ);
        vnv.LJJIIZI(new OB1());
        vnv.LJJIIZI(new C79402VEg(this.LJIILIIL));
        long currentTimeMillis = System.currentTimeMillis();
        this.LJJIIZI = currentTimeMillis;
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJJIJ(this.LJJIIZ, currentTimeMillis);
        }
        this.LIZIZ.LJIIIIZZ.LJIIIIZZ("setup_create_lynx_start", this.LJJIIZ, null);
        this.LIZIZ.LJIIIIZZ.LJIIIIZZ("setup_create_lynx_end", this.LJJIIZI, null);
        C79600VLw c79600VLw = this.LIZIZ.LJIIIIZZ;
        c79600VLw.LIZ = this.LJIIL;
        c79600VLw.LIZJ = this.LJII;
        c79600VLw.LIZIZ = Boolean.valueOf(this.LJIIZILJ.LJIILIIL);
        TraceEvent.LJ("TemplateRender.init");
    }

    public final void LJIJ(byte[] bArr, String str, Map<String, Object> map) {
        if (this.LJJIIJZLJL != null) {
            this.LJJIIJZLJL.LIZ(TemplateData.LJ(map));
        }
        if ((!this.LJJ || this.LJIIIIZZ) && !C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new ARunnableS7S1300000_10(map, this, bArr, str, 0));
            return;
        }
        LJJI(str);
        if (!this.LJIJJ) {
            LJIILIIL(10002, "LynxEnv has not been prepared successfully!");
            return;
        }
        this.LJIJJLI = true;
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIILIIL();
        }
        LJIIZILJ();
        C79636VNg c79636VNg = new C79636VNg();
        this.LJIIIZ = c79636VNg;
        c79636VNg.LIZ = EnumC79630VNa.PENDING;
        C79600VLw c79600VLw = this.LIZIZ.LJIIIIZZ;
        int length = bArr.length;
        c79600VLw.getClass();
        C79411VEp.LJ(new ARunnableS1S1101000_6(c79600VLw, str, length, 0));
        TemplateAssembler templateAssembler2 = this.LIZ;
        if (templateAssembler2 != null) {
            templateAssembler2.LJIIIIZZ(bArr, map, new VNT(this, templateAssembler2.LJI));
        }
    }

    public final void LJIL(TemplateBundle templateBundle, TemplateData templateData, String str) {
        if ((!this.LJJ || this.LJIIIIZZ) && !C79411VEp.LIZ()) {
            C79411VEp.LIZJ(new RunnableC79632VNc(this, templateBundle, templateData, str));
            return;
        }
        LJJI(str);
        LJIILJJIL();
        TemplateAssembler templateAssembler = this.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJIIL(templateBundle, str, templateData, new VNT(this, templateAssembler.LJI));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(1:(17:49|(1:51)|52|4|5|6|(3:8|(1:10)(1:12)|11)|13|(1:15)|17|(1:46)(1:20)|21|(1:23)(2:42|(1:44)(1:45))|24|(2:26|(1:28)(2:29|(1:31)))|32|(2:34|(2:39|40)(1:37))(1:41))(1:53))|3|4|5|6|(0)|13|(0)|17|(0)|46|21|(0)(0)|24|(0)|32|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x0029, B:8:0x0037, B:10:0x003d, B:11:0x0044, B:12:0x0056, B:13:0x0047, B:15:0x005b), top: B:5:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:6:0x0029, B:8:0x0037, B:10:0x003d, B:11:0x0044, B:12:0x0056, B:13:0x0047, B:15:0x005b), top: B:5:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(int r9, int r10, java.lang.String r11, java.lang.Throwable r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.LynxTemplateRender.LJIIL(int, int, java.lang.String, java.lang.Throwable, org.json.JSONObject):void");
    }
}
