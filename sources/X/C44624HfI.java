package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HfI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44624HfI extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44628HfM LIZIZ;
    public final C44630HfO LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0211  */
    @Override // X.AbstractC44652Hfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams r17) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44624HfI.LIZIZ(com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44624HfI(InterfaceC44653Hfl strategy, C44628HfM strategiesResult, C44630HfO initParams) {
        super(strategy);
        C44631HfP c44631HfP = C44631HfP.LIZ;
        String name = c44631HfP.key;
        int i = c44631HfP.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(strategiesResult, "strategiesResult");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = strategiesResult;
        this.LIZJ = initParams;
        this.LIZLLL = "source";
        this.LJ = name;
        this.LJFF = i;
    }
}
