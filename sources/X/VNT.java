package X;

import Y.ARunnableS13S1200000_14;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o3.h0;

/* loaded from: classes15.dex */
public class VNT implements VND {
    public final /* synthetic */ LynxTemplateRender LIZ;

    @Override // X.VND
    public final void LIZ() {
        InterfaceC79644VNo interfaceC79644VNo;
        VMD LJ;
        OCV ocv = C60502Noo.LIZ;
        VNS vns = this.LIZ.LJIL;
        ocv.getClass();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (LynxUI lynxUI : ocv.LIZJ.keySet()) {
            if (lynxUI.mContext.LJLJLLL.LJLIL == vns) {
                atomicInteger.incrementAndGet();
                lynxUI.execEnterAnim(new C79638VNi(atomicInteger));
            }
        }
        atomicInteger.get();
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILJJIL != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dispatchLoadSuccess templateSize in ");
            LIZ.append(lynxTemplateRender.toString());
            LLog.LIZLLL(2, "LynxTemplateRender", X1D.LIZIZ(LIZ));
            if (lynxTemplateRender.LJIILJJIL != null) {
                TraceEvent.LIZIZ("Client.onLoadSuccess");
                lynxTemplateRender.LJIILJJIL.LJIIJJI();
                TraceEvent.LJ("Client.onLoadSuccess");
                TraceEvent.LIZIZ("Client.onReportLynxConfigInfo");
                VNV vnv = lynxTemplateRender.LJIILJJIL;
                TemplateAssembler templateAssembler = lynxTemplateRender.LIZ;
                if (templateAssembler == null) {
                    LJ = new VMD(new VME());
                } else {
                    LJ = templateAssembler.LJ();
                }
                vnv.LJJI(LJ);
                TraceEvent.LJ("Client.onReportLynxConfigInfo");
            }
        }
        VNX vnx = this.LIZ.LJJIIJZLJL;
        if (vnx != null && (interfaceC79644VNo = vnx.LIZ) != null) {
            interfaceC79644VNo.LJLLI();
        }
    }

    @Override // X.VND
    public final void LJFF() {
        C79636VNg c79636VNg = this.LIZ.LJIIIZ;
        if (c79636VNg != null) {
            c79636VNg.getClass();
            c79636VNg.LIZ = EnumC79630VNa.SUCCESSFUL;
        }
    }

    @Override // X.VND
    public final void LJIIIIZZ() {
        if (this.LIZ.LJIILJJIL != null) {
            TraceEvent.LIZIZ("Client.onRuntimeReady");
            this.LIZ.LJIILJJIL.LJJIFFI();
            TraceEvent.LJ("Client.onRuntimeReady");
        }
    }

    @Override // X.VND
    public final void LJIIIZ() {
        if (this.LIZ.LJIILJJIL != null) {
            TraceEvent.LIZIZ("Client.onDataUpdated");
            this.LIZ.LJIILJJIL.LIZLLL();
            TraceEvent.LJ("Client.onDataUpdated");
        }
    }

    @Override // X.VND
    public final void LIZIZ() {
        LynxEnv.LJIIIZ().getClass();
    }

    @Override // X.VND
    public final void LIZJ(LynxPerfMetric lynxPerfMetric) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        lynxPerfMetric.setInitTiming(lynxTemplateRender.LJJIIZ, lynxTemplateRender.LJJIIZI);
        lynxPerfMetric.setIsColdBoot(LynxTemplateRender.LJJIJLIJ);
        VNS vns = this.LIZ.LJIL;
        if (vns != null && vns.getLynxUIRoot() != null && this.LIZ.LJIL.getLynxUIRoot().mView != 0) {
            lynxPerfMetric.correctFirstPageLayout(((VOT) this.LIZ.LJIL.getLynxUIRoot().mView).getMeaningfulPaintTiming());
        }
        LynxTemplateRender.LJJIJLIJ = false;
        if (this.LIZ.LJIILJJIL != null) {
            TraceEvent.LIZIZ("Client.onFirstLoadPerfReady");
            this.LIZ.LJIILJJIL.LJI(lynxPerfMetric);
            TraceEvent.LJ("Client.onFirstLoadPerfReady");
        }
    }

    @Override // X.VND
    public final void LIZLLL(JavaOnlyMap javaOnlyMap) {
        VNV vnv = this.LIZ.LJIILJJIL;
        if (vnv != null) {
            vnv.LJIIIZ(javaOnlyMap);
        }
    }

    @Override // X.VND
    public final void LJ(HashMap<String, Object> hashMap) {
        if (this.LIZ.LJIILJJIL != null) {
            TraceEvent.LIZIZ("Client.onDynamicComponentPerf");
            this.LIZ.LJIILJJIL.LJFF(hashMap);
            TraceEvent.LJ("Client.onDynamicComponentPerf");
        }
    }

    @Override // X.VND
    public final void LJIIJ(VNG vng) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        VNG vng2 = lynxTemplateRender.LJJIFFI;
        if (vng2 == null) {
            lynxTemplateRender.LJJIFFI = vng;
        } else {
            vng2.LIZ = vng.LIZ;
        }
    }

    @Override // X.VND
    public final void LJIIL(java.util.Map<String, Object> map) {
        VNV vnv = this.LIZ.LJIILJJIL;
        if (vnv != null) {
            vnv.LIZJ(map);
        }
    }

    @Override // X.VND
    public final void LJIILIIL(boolean z) {
        if (z) {
            this.LIZ.LIZLLL.LIZJ();
        } else {
            this.LIZ.LIZLLL.LIZ();
        }
    }

    @Override // X.VND
    public final void LJIILJJIL(LynxPerfMetric lynxPerfMetric) {
        if (this.LIZ.LJIILJJIL != null) {
            TraceEvent.LIZIZ("Client.onUpdatePerfReady");
            this.LIZ.LJIILJJIL.LJJIIZ(lynxPerfMetric);
            TraceEvent.LJ("Client.onUpdatePerfReady");
        }
    }

    @Override // X.VND
    public final void LJIILL(VNQ vnq) {
        boolean z;
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        VPV vpv = lynxTemplateRender.LJIILL;
        boolean z2 = false;
        if (vpv != null) {
            vpv.LJIIIZ = VPR.LJ(vnq.LJIIZILJ, 0.0f, lynxTemplateRender.mLynxContext.LJLZ);
            VPV vpv2 = this.LIZ.LJIILL;
            boolean z3 = vnq.LJJIZ;
            if (vpv2.LJIILL || z3) {
                z = true;
            } else {
                z = false;
            }
            vpv2.LJIILL = z;
        }
        UIBody uIBody = this.LIZ.LIZIZ.LIZIZ;
        uIBody.getClass();
        if (vnq.LJJ || vnq.LJJIFFI) {
            z2 = true;
        }
        uIBody.LJLILLLLZI = z2;
        VOT vot = uIBody.LJLIL;
        if (vot != null) {
            boolean z4 = vnq.LJIJJLI;
            boolean z5 = vnq.LJIL;
            vot.setEnableAccessibilityElement(z2);
            if (!uIBody.LJLILLLLZI) {
                VPN vpn = uIBody.LJLJI;
                if (vpn != null) {
                    vpn.LJII = z4;
                    vpn.LJIIIIZZ = z5;
                }
            } else {
                if (uIBody.LJLJJI == null) {
                    uIBody.LJLJJI = new VPJ(uIBody);
                }
                VPJ vpj = uIBody.LJLJJI;
                vpj.LJI = z4;
                vpj.LJIIIIZZ = new C79643VNn();
                h0.LJIJI(uIBody.LJLIL, vpj);
                uIBody.LJLIL.mAccessibilityDelegate = uIBody.LJLJJI;
            }
        }
        VNU vnu = this.LIZ.mLynxContext;
        if (vnu != null) {
            vnu.LJZ = vnq.LIZJ;
            vnu.LLF = vnq.LJJIII;
            vnu.LLFF = vnq.LJJIIJ;
            vnu.LLFFF = vnq.LJJIIJZLJL;
            vnu.LLI = vnq.LJJIIZ;
            vnu.LJZL = vnq.LJ;
            vnu.LLIILII = vnq.LJFF;
            vnu.LLIILZL = vnq.LJI;
            vnu.LLIIZ = vnq.LJII;
            vnu.LLIFFJFJJ = vnq.LJJIJ;
            vnu.LLII = vnq.LJJIJIIJI;
            vnu.LLIIII = vnq.LJJIJIIJIL;
            vnu.LLIIIILZ = vnq.LJJIJIL;
            vnu.LLIIIJ = vnq.LJJIJL;
            vnu.LLIIIL = vnq.LIZIZ;
            vnu.LLIIIZ = vnq.LJJIJLIJ;
            vnu.LLIIJI = vnq.LJJIL;
            vnu.LLIIJLIL = vnq.LJJJ;
            vnu.LLIIL = vnq.LJJJI;
            vnu.LJZI = vnq.LJIIL;
            vnu.LLIL = vnq.LJJJIL;
            vnu.LLILII = vnq.LJJIZ;
        } else {
            LLog.LIZLLL(4, "LynxTemplateRender", "lynx context free in used: LynxUI configs may be not valid");
        }
        C79403VEh c79403VEh = this.LIZ.LJIILIIL;
        if (c79403VEh != null) {
            if (vnq.LJIILL) {
                c79403VEh.LJII = "lepusNG";
            } else {
                c79403VEh.LJII = "lepus";
            }
            c79403VEh.LJ = vnq.LJIILIIL;
            c79403VEh.LJIIIIZZ = vnq.LIZLLL;
            String str = vnq.LJIIIIZZ;
            c79403VEh.LJI = str;
            if (str != null && str.equals("tt")) {
                c79403VEh.LJI = "ttml";
            }
        }
    }

    public VNT(LynxTemplateRender lynxTemplateRender, int i) {
        this.LIZ = lynxTemplateRender;
    }

    @Override // X.VND
    public final void LJII(int i, String str) {
        this.LIZ.LJIIL(-1, i, str, null, null);
    }

    @Override // X.VND
    public final void LJIIJJI(String str, java.util.Map<String, Object> map) {
        C64493PSv.LIZ().execute(new ARunnableS13S1200000_14(this.LIZ.LJIILIIL.LIZ(), map, str, 4));
    }

    @Override // X.VND
    public final void LJI(String str, String str2, int i) {
        if (this.LIZ.LJIILJJIL != null) {
            TraceEvent.LIZIZ("Client.onModuleMethodInvoked");
            this.LIZ.LJIILJJIL.LJIILJJIL(i, str, str2);
            TraceEvent.LJ("Client.onModuleMethodInvoked");
        }
    }
}
