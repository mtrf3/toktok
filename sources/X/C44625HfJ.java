package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HfJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44625HfJ extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44628HfM LIZIZ;
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
        CompileConfigResolution LJJIFFI = C47261Igj.LJJIFFI();
        C44627HfL c44627HfL = this.LIZIZ.LIZIZ;
        c44627HfL.getClass();
        c44627HfL.LIZ = LJJIFFI;
        vEVideoEncodeConfigParams.setOutputSize(LJJIFFI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44625HfJ(InterfaceC44653Hfl strategy, C44628HfM strategiesResult) {
        super(strategy);
        C44632HfQ c44632HfQ = C44632HfQ.LIZ;
        String name = c44632HfQ.key;
        int i = c44632HfQ.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(strategiesResult, "strategiesResult");
        o.LJIIIZ(name, "name");
        this.LIZIZ = strategiesResult;
        this.LIZJ = "source";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
