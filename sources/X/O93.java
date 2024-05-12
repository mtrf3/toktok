package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;

/* loaded from: classes11.dex */
public final class O93 extends LynxViewClient {
    public LynxViewClient LIZ;

    public O93() {
        this(0);
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        LynxViewClient lynxViewClient = this.LIZ;
        if (lynxViewClient != null) {
            lynxViewClient.LJII();
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        LynxViewClient lynxViewClient = this.LIZ;
        if (lynxViewClient != null) {
            lynxViewClient.LJIIJJI();
        }
    }

    public O93(int i) {
        this.LIZ = null;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
        LynxViewClient lynxViewClient = this.LIZ;
        if (lynxViewClient != null) {
            lynxViewClient.LJI(lynxPerfMetric);
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        LynxViewClient lynxViewClient = this.LIZ;
        if (lynxViewClient != null) {
            lynxViewClient.LJIJ(lynxError);
        }
    }
}
