package X;

import com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44652Hfk<R extends BaseCompileConfigParams> implements InterfaceC44653Hfl<R> {
    public final InterfaceC44653Hfl<R> LIZ;

    public abstract void LIZIZ(R r);

    @Override // X.InterfaceC44653Hfl
    public final R execute() {
        R execute = this.LIZ.execute();
        execute.setCurStage(LIZ());
        execute.setCurStrategyName(getName());
        execute.setCurPriority(getPriority());
        LIZIZ(execute);
        return execute;
    }

    public AbstractC44652Hfk(InterfaceC44653Hfl<R> preStrategy) {
        o.LJIIIZ(preStrategy, "preStrategy");
        this.LIZ = preStrategy;
    }
}
