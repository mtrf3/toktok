package X;

import X.C35656Dz2;
import Y.AObserverS70S0200000_6;
import Y.ARunnableS25S0200000_6;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import kotlin.jvm.internal.AqS110S0300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.G0y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40836G0y<T extends C35656Dz2> extends G0C<T> {
    public abstract NUJComponentFragment LJ(T t);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC40836G0y(G0D context, G15 flowEngine) {
        super(context, flowEngine);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(flowEngine, "flowEngine");
    }

    @Override // X.G0C, X.G04
    public void LIZ(G0D context, T t, InterfaceC88472Yns<? super C40745Fyv, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(context, "context");
        super.LIZ(context, t, interfaceC88472Yns);
        NUJComponentFragment LJ = LJ(t);
        ((InterfaceC40755Fz5) context.LJLILLLLZI).LJ().invoke(LJ, Boolean.TRUE);
        AObserverS70S0200000_6 aObserverS70S0200000_6 = new AObserverS70S0200000_6((AqS110S0300000_6) interfaceC88472Yns, LJ, 8);
        LJ.getClass();
        ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(aObserverS70S0200000_6, LJ, 71);
        if (LJ.mo49getActivity() != null) {
            aRunnableS25S0200000_6.run();
        } else {
            LJ.LJLILLLLZI.add(aRunnableS25S0200000_6);
        }
        EnumC40761FzB componentType = type();
        o.LJIIIZ(componentType, "componentType");
        ARunnableS25S0200000_6 aRunnableS25S0200000_62 = new ARunnableS25S0200000_6(componentType, LJ, 70);
        if (LJ.mo49getActivity() != null) {
            aRunnableS25S0200000_62.run();
        } else {
            LJ.LJLILLLLZI.add(aRunnableS25S0200000_62);
        }
    }
}
