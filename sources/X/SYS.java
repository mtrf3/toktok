package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SYS extends F9E {
    public final LifecycleOwner LJLIL;
    public final AbstractC73672Svk<C57939MoZ> LJLILLLLZI;
    public final InterfaceC88472Yns<SZZ, C76800UCe> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public SYS(LifecycleOwner lifecycleOwner, C73849Syb observable, AqS178S0100000_12 aqS178S0100000_12) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(observable, "observable");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = observable;
        this.LJLJI = aqS178S0100000_12;
    }
}
