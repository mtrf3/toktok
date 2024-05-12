package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hey, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44604Hey extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
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
        C78915Uy7.LJIIJJI(this.LIZIZ.LIZ, new AqS173S0100000_7(vEVideoEncodeConfigParams, 20));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44604Hey(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44610Hf4 c44610Hf4 = C44610Hf4.LIZ;
        String name = c44610Hf4.key;
        int i = c44610Hf4.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
