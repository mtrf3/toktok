package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HeA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44554HeA extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44539Hdv LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        C78857UxB.LJIILLIIL(this.LIZIZ.LIZ, new Integer[]{Integer.valueOf(vEVideoEncodeConfigParams2.getOutputSize().getWidth()), Integer.valueOf(vEVideoEncodeConfigParams2.getOutputSize().getHeight())}, this.LIZIZ.LJFF, new AqS189S0100000_7(vEVideoEncodeConfigParams2, 2));
        vEVideoEncodeConfigParams2.setWatermarkParam(this.LIZIZ.LJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44554HeA(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44572HeS c44572HeS = C44572HeS.LIZ;
        String name = c44572HeS.key;
        int i = c44572HeS.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}