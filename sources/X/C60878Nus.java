package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;

/* renamed from: X.Nus, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60878Nus extends LynxViewClient {
    public LynxViewClient LIZ;

    public C60878Nus() {
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

    public C60878Nus(int i) {
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
