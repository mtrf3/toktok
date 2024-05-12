package X;

import Y.AfS64S0100000_12;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Spc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73292Spc<S> implements InterfaceC73163SnX<S> {
    public final C73849Syb<S> LIZ;
    public final C73849Syb<C76800UCe> LIZIZ;
    public final C73294Spe<S> LIZJ;
    public final C73426Srm LIZLLL;

    public final void LIZ() {
        C73294Spe<S> c73294Spe = this.LIZJ;
        synchronized (c73294Spe) {
            if (!c73294Spe.LIZIZ.isEmpty()) {
                LinkedList<InterfaceC88472Yns<S, S>> linkedList = c73294Spe.LIZIZ;
                c73294Spe.LIZIZ = new LinkedList<>();
                if (linkedList != null) {
                    S state = getState();
                    Iterator<InterfaceC88472Yns<S, S>> it = linkedList.iterator();
                    while (it.hasNext()) {
                        state = it.next().invoke(state);
                    }
                    this.LIZ.onNext(state);
                }
            }
        }
    }

    @Override // X.InterfaceC73163SnX
    public final S getState() {
        S LJJZZIII = this.LIZ.LJJZZIII();
        if (LJJZZIII != null) {
            return LJJZZIII;
        }
        o.LJIIZILJ();
        throw null;
    }

    @Override // X.InterfaceC73163SnX
    public final AbstractC73672Svk<S> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC73163SnX
    public final void LIZJ(InterfaceC88472Yns<? super S, ? extends S> stateReducer) {
        o.LJIIJ(stateReducer, "stateReducer");
        this.LIZ.onNext(stateReducer.invoke(getState()));
    }

    @Override // X.InterfaceC73163SnX
    public final void LIZLLL(InterfaceC88472Yns<? super S, ? extends S> stateReducer) {
        o.LJIIJ(stateReducer, "stateReducer");
        C73294Spe<S> c73294Spe = this.LIZJ;
        synchronized (c73294Spe) {
            c73294Spe.LIZIZ.add(stateReducer);
        }
        this.LIZIZ.onNext(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC73163SnX
    public final void LJ(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIJ(block, "block");
        C73294Spe<S> c73294Spe = this.LIZJ;
        synchronized (c73294Spe) {
            c73294Spe.LIZ.add(block);
        }
        this.LIZIZ.onNext(C76800UCe.LIZ);
    }

    public C73292Spc(S initialState, AbstractC73946T0k scheduler) {
        o.LJIIJ(initialState, "initialState");
        o.LJIIJ(scheduler, "scheduler");
        C73849Syb<S> LJJZZI = C73849Syb.LJJZZI(initialState);
        this.LIZ = LJJZZI;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        C73849Syb<C76800UCe> c73849Syb = new C73849Syb<>();
        this.LIZIZ = c73849Syb;
        this.LIZJ = new C73294Spe<>();
        this.LIZLLL = new C73426Srm(LJJZZI);
        c73318Sq2.LIZ(c73849Syb.LJJJ(scheduler).LJJJLIIL(new AfS64S0100000_12(this, 97), new AfS64S0100000_12((Object) new C73293Spd(this), 98)));
    }
}
