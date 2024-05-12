package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.strategies.source.CanvasCompileConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HfT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44635HfT extends AbstractC44652Hfk<CanvasCompileConfigParams> {
    public final C44639HfX LIZIZ;
    public final C44628HfM LIZJ;
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
        C44629HfN c44629HfN = this.LIZJ.LIZ;
        CompileConfigResolution LJIIIIZZ = C86793Y4n.LJIIIIZZ();
        c44629HfN.getClass();
        c44629HfN.LIZ = LJIIIIZZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44635HfT(InterfaceC44653Hfl strategy, C44639HfX initParams, C44628HfM strategiesResult) {
        super(strategy);
        C44636HfU c44636HfU = C44636HfU.LIZ;
        String name = c44636HfU.key;
        int i = c44636HfU.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(strategiesResult, "strategiesResult");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = strategiesResult;
        this.LIZLLL = "source";
        this.LJ = name;
        this.LJFF = i;
    }
}
