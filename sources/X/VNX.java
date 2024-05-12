package X;

import android.content.Context;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class VNX {
    public static final String LJFF = C16880lQ.LJLLJ(VNX.class);
    public InterfaceC79644VNo LIZ;
    public InterfaceC79637VNh LIZIZ;
    public final InterfaceC79642VNm LIZJ;
    public final C79631VNb LIZLLL;
    public final InterfaceC79640VNk LJ;

    public final void LIZ(TemplateData templateData) {
        C79631VNb c79631VNb = this.LIZLLL;
        if (c79631VNb != null) {
            c79631VNb.LIZ.getClass();
            c79631VNb.LIZ.getClass();
            c79631VNb.LIZ.LIZ = templateData;
        }
        InterfaceC79642VNm interfaceC79642VNm = this.LIZJ;
        if (interfaceC79642VNm != null) {
            interfaceC79642VNm.LIZIZ();
        }
        InterfaceC79644VNo interfaceC79644VNo = this.LIZ;
        if (interfaceC79644VNo != null) {
            interfaceC79644VNo.LJIIJJI();
        }
    }

    public VNX(VNS vns, LynxTemplateRender lynxTemplateRender) {
        boolean z;
        boolean z2;
        try {
            String str = LJFF;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Initialize LynxDevtool, lynxDebugEnabled:");
            LIZ.append(LynxEnv.LJIIIZ().LJIIJJI());
            LLog.LIZLLL(2, str, X1D.LIZIZ(LIZ));
            new WeakReference(vns);
            new WeakReference(lynxTemplateRender);
            if (LynxEnv.LJIIIZ().LJIIJJI()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("devtoolEnabled:");
                LIZ2.append(LynxEnv.LJIIIZ().LJIIJ());
                LIZ2.append(", redBoxEnabled:");
                LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
                if (LJIIIZ.LJII && LJIIIZ.LJ("enable_redbox", true)) {
                    z = true;
                } else {
                    z = false;
                }
                LIZ2.append(z);
                LLog.LIZLLL(2, str, X1D.LIZIZ(LIZ2));
                if (!LynxEnv.LJIIIZ().LJIIJ()) {
                    LynxEnv.LJIIIZ().LJ("enable_devtool_for_debuggable_view", false);
                } else {
                    Object newInstance = Class.forName("com.lynx.devtool.LynxInspectorOwner").getConstructor(VNS.class).newInstance(vns);
                    if (newInstance instanceof VNZ) {
                        this.LIZ = (InterfaceC79644VNo) newInstance;
                    }
                }
                LynxEnv LJIIIZ2 = LynxEnv.LJIIIZ();
                if (!LJIIIZ2.LJII || !LJIIIZ2.LJ("enable_redbox", true)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    LynxEnv LJIIIZ3 = LynxEnv.LJIIIZ();
                    if (!LJIIIZ3.LJII || !LJIIIZ3.LJ("enable_redbox_next", true)) {
                        Object newInstance2 = Class.forName("com.lynx.devtool.redbox.RedBoxManager").getConstructor(Context.class, LynxTemplateRender.class).newInstance(lynxTemplateRender.mLynxContext.getBaseContext(), lynxTemplateRender);
                        if (newInstance2 instanceof InterfaceC79637VNh) {
                            this.LIZIZ = (InterfaceC79637VNh) newInstance2;
                            InterfaceC79644VNo interfaceC79644VNo = this.LIZ;
                            if (interfaceC79644VNo != null) {
                                interfaceC79644VNo.LJI();
                            }
                        }
                    }
                }
                LynxEnv LJIIIZ4 = LynxEnv.LJIIIZ();
                if (LJIIIZ4.LJII && LJIIIZ4.LJ("enable_redbox", true)) {
                    LynxEnv LJIIIZ5 = LynxEnv.LJIIIZ();
                    if (LJIIIZ5.LJII && LJIIIZ5.LJ("enable_redbox_next", true)) {
                        Object newInstance3 = Class.forName("com.lynx.devtool.logbox.LynxLogBoxProxy").getConstructor(VNX.class).newInstance(this);
                        if (newInstance3 instanceof InterfaceC79642VNm) {
                            this.LIZJ = (InterfaceC79642VNm) newInstance3;
                            InterfaceC79644VNo interfaceC79644VNo2 = this.LIZ;
                            if (interfaceC79644VNo2 != null) {
                                interfaceC79644VNo2.LJI();
                            }
                        }
                    }
                }
                if (LynxEnv.LJIIIZ().LJ("enable_perf_monitor_debug", false) && this.LIZ != null) {
                    Object newInstance4 = Class.forName("com.lynx.devtool.monitor.FPSMonitorManager").getConstructor(Context.class, VNZ.class).newInstance(lynxTemplateRender.mLynxContext.getBaseContext(), this.LIZ);
                    if (newInstance4 instanceof InterfaceC79640VNk) {
                        InterfaceC79640VNk interfaceC79640VNk = (InterfaceC79640VNk) newInstance4;
                        this.LJ = interfaceC79640VNk;
                        lynxTemplateRender.mLynxContext.getBaseContext();
                        interfaceC79640VNk.LIZ();
                    }
                }
                InterfaceC79644VNo interfaceC79644VNo3 = this.LIZ;
                if (interfaceC79644VNo3 != null) {
                    interfaceC79644VNo3.LJIIL();
                }
            }
            if (this.LIZ != null || this.LIZIZ != null || this.LIZJ != null) {
                this.LIZLLL = new C79631VNb(lynxTemplateRender);
            }
            InterfaceC79644VNo interfaceC79644VNo4 = this.LIZ;
            if (interfaceC79644VNo4 != null) {
                interfaceC79644VNo4.LIZIZ();
            }
            InterfaceC79637VNh interfaceC79637VNh = this.LIZIZ;
            if (interfaceC79637VNh != null) {
                interfaceC79637VNh.LIZIZ();
            }
        } catch (Exception e) {
            String str2 = LJFF;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("failed to init LynxDevtool: ");
            LIZ3.append(e.toString());
            LLog.LIZLLL(4, str2, X1D.LIZIZ(LIZ3));
            this.LIZ = null;
            this.LIZIZ = null;
            this.LIZJ = null;
            this.LIZLLL = null;
        }
    }
}
