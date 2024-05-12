package X;

import com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileConfig.strategies.CompileStrategyJsonStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44651Hfj extends F9E {
    public final CompileStrategyJsonStruct LJLIL;
    public final InterfaceC88472Yns<InterfaceC44653Hfl<BaseCompileConfigParams>, InterfaceC44653Hfl<BaseCompileConfigParams>> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44651Hfj(CompileStrategyJsonStruct jsonStruct, InterfaceC88472Yns<? super InterfaceC44653Hfl<BaseCompileConfigParams>, ? extends InterfaceC44653Hfl<BaseCompileConfigParams>> interfaceC88472Yns) {
        o.LJIIIZ(jsonStruct, "jsonStruct");
        this.LJLIL = jsonStruct;
        this.LJLILLLLZI = interfaceC88472Yns;
    }
}
