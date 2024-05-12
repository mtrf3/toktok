package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.strategies.source.CanvasCompileConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44643Hfb extends AbstractC44652Hfk<CanvasCompileConfigParams> {
    public final C44648Hfg LIZIZ;
    public final C44647Hff LIZJ;
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

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(CanvasCompileConfigParams canvasCompileConfigParams) {
        CompileConfigResolution LJIILLIIL = C77123UOp.LJIILLIIL();
        C44646Hfe c44646Hfe = this.LIZJ.LIZ;
        c44646Hfe.getClass();
        c44646Hfe.LIZ = LJIILLIIL;
        canvasCompileConfigParams.setOutputSize(LJIILLIIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44643Hfb(InterfaceC44653Hfl strategy, C44648Hfg initParams, C44647Hff strategiesResult) {
        super(strategy);
        C44638HfW c44638HfW = C44638HfW.LIZ;
        String name = c44638HfW.key;
        int i = c44638HfW.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(strategiesResult, "strategiesResult");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = strategiesResult;
        this.LIZLLL = "preview";
        this.LJ = name;
        this.LJFF = i;
    }
}
