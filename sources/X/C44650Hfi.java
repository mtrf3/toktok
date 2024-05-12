package X;

import Y.IDComparatorS35S0000000_7;
import com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileConfig.strategies.CompileStrategyJsonStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44650Hfi<R extends BaseCompileConfigParams> implements InterfaceC44653Hfl<R> {
    public final InterfaceC44653Hfl<R> LIZ;
    public final List LIZIZ = new ArrayList();

    @Override // X.InterfaceC44653Hfl
    public final R execute() {
        InterfaceC44653Hfl<R> interfaceC44653Hfl = this.LIZ;
        Iterator it = ORZ.LLILII(new IDComparatorS35S0000000_7(22), this.LIZIZ).iterator();
        while (it.hasNext()) {
            interfaceC44653Hfl = (InterfaceC44653Hfl) ((C44651Hfj) it.next()).LJLILLLLZI.invoke(interfaceC44653Hfl);
        }
        return interfaceC44653Hfl.execute();
    }

    public C44650Hfi(InterfaceC44653Hfl interfaceC44653Hfl) {
        this.LIZ = interfaceC44653Hfl;
    }

    public final void LIZIZ(CompileStrategyJsonStruct jsonStruct, InterfaceC88472Yns<? super InterfaceC44653Hfl<R>, ? extends InterfaceC44653Hfl<R>> interfaceC88472Yns) {
        o.LJIIIZ(jsonStruct, "jsonStruct");
        ((ArrayList) this.LIZIZ).add(new C44651Hfj(jsonStruct, interfaceC88472Yns));
    }
}
