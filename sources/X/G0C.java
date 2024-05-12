package X;

import X.C35656Dz2;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public abstract class G0C<T extends C35656Dz2> implements G04<T> {
    public final G0D LIZ;
    public final G15 LIZIZ;
    public InterfaceC88472Yns<? super C40745Fyv, C76800UCe> LIZJ;

    @Override // X.G04
    public boolean LIZJ() {
        return !(this instanceof G06);
    }

    public void LIZLLL() {
        InterfaceC88472Yns<? super C40745Fyv, C76800UCe> interfaceC88472Yns = this.LIZJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(null);
        }
        this.LIZJ = null;
    }

    public G0C(G0D context, G15 flowEngine) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
        this.LIZ = context;
        this.LIZIZ = flowEngine;
    }

    @Override // X.G04
    public void LIZ(G0D context, T t, InterfaceC88472Yns<? super C40745Fyv, C76800UCe> onComplete) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(onComplete, "onComplete");
        this.LIZJ = onComplete;
    }
}
