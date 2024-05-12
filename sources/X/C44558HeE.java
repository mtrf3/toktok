package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HeE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44558HeE extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44537Hdt LIZIZ;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    @Override // X.AbstractC44652Hfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams r15) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44558HeE.LIZIZ(com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44558HeE(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44582Hec c44582Hec = C44582Hec.LIZ;
        String name = c44582Hec.key;
        int i = c44582Hec.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
