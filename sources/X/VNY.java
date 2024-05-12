package X;

import Y.ARunnableS50S0100000_14;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public class VNY implements VON {
    public final /* synthetic */ LynxTemplateRender LIZ;

    @Override // X.VON
    public final void LIZJ() {
        InterfaceC79644VNo interfaceC79644VNo;
        LLog.LIZLLL(2, "LynxTemplateRender", "onFirstScreen");
        this.LIZ.LIZIZ.LJIIJJI = false;
        try {
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 34));
            VNX vnx = this.LIZ.LJJIIJZLJL;
            if (vnx != null && (interfaceC79644VNo = vnx.LIZ) != null) {
                interfaceC79644VNo.LIZJ();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.VON
    public final void LIZ() {
        InterfaceC79644VNo interfaceC79644VNo;
        try {
            LLog.LIZLLL(2, "LynxTemplateRender", "onPageUpdate");
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 35));
            VNX vnx = this.LIZ.LJJIIJZLJL;
            if (vnx != null && (interfaceC79644VNo = vnx.LIZ) != null) {
                interfaceC79644VNo.LIZ();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.VON
    public final void LIZLLL() {
        try {
            C79411VEp.LIZJ(new ARunnableS50S0100000_14(this, 36));
        } catch (Throwable unused) {
        }
    }

    public VNY(LynxTemplateRender lynxTemplateRender) {
        this.LIZ = lynxTemplateRender;
    }
}
