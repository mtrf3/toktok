package X;

import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.base.LLog;

/* loaded from: classes11.dex */
public class OB1 extends LynxViewClient {
    public long LIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDataUpdated time:");
        LIZ.append(System.currentTimeMillis() - this.LIZ);
        LLog.LIZLLL(1, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstScreen time: ");
        LIZ.append(System.currentTimeMillis() - this.LIZ);
        LLog.LIZLLL(1, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess time: ");
        LIZ.append(System.currentTimeMillis() - this.LIZ);
        LLog.LIZLLL(1, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILLIIL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageUpdate time:");
        LIZ.append(System.currentTimeMillis() - this.LIZ);
        LLog.LIZLLL(1, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILL(String str) {
        this.LIZ = System.currentTimeMillis();
    }
}
