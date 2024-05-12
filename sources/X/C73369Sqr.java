package X;

import Y.AfS64S0100000_12;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73369Sqr<S> implements InterfaceC73372Squ<S> {
    public final C73849Syb<S> LIZ;
    public final C73849Syb<C76800UCe> LIZIZ;
    public final C73370Sqs<S> LIZJ;
    public final C73426Srm LIZLLL;

    public final void LJ() {
        C73370Sqs<S> c73370Sqs = this.LIZJ;
        synchronized (c73370Sqs) {
            if (!c73370Sqs.LIZIZ.isEmpty()) {
                LinkedList<InterfaceC88472Yns<S, S>> linkedList = c73370Sqs.LIZIZ;
                c73370Sqs.LIZIZ = new LinkedList<>();
                if (linkedList == null) {
                    return;
                }
                S state = getState();
                Iterator<InterfaceC88472Yns<S, S>> it = linkedList.iterator();
                while (it.hasNext()) {
                    state = it.next().invoke(state);
                }
                this.LIZ.onNext(state);
            }
        }
    }

    @Override // X.InterfaceC73372Squ
    public final S getState() {
        S LJJZZIII = this.LIZ.LJJZZIII();
        o.LJI(LJJZZIII);
        return LJJZZIII;
    }

    @Override // X.InterfaceC73372Squ
    public final C73426Srm LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC73372Squ
    public final void LIZ(InterfaceC88472Yns<? super S, ? extends S> interfaceC88472Yns) {
        C73370Sqs<S> c73370Sqs = this.LIZJ;
        synchronized (c73370Sqs) {
            c73370Sqs.LIZIZ.add(interfaceC88472Yns);
        }
        this.LIZIZ.onNext(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC73372Squ
    public final void LIZJ(InterfaceC88472Yns<? super S, ? extends S> stateReducer) {
        o.LJIIIZ(stateReducer, "stateReducer");
        this.LIZ.onNext(stateReducer.invoke(getState()));
    }

    @Override // X.InterfaceC73372Squ
    public final void LIZLLL(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        C73370Sqs<S> c73370Sqs = this.LIZJ;
        synchronized (c73370Sqs) {
            c73370Sqs.LIZ.add(block);
        }
        this.LIZIZ.onNext(C76800UCe.LIZ);
    }

    public C73369Sqr(C33Q c33q, C73950T0o c73950T0o) {
        C73849Syb<S> LJJZZI = C73849Syb.LJJZZI(c33q);
        this.LIZ = LJJZZI;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        C73849Syb<C76800UCe> c73849Syb = new C73849Syb<>();
        this.LIZIZ = c73849Syb;
        this.LIZJ = new C73370Sqs<>();
        this.LIZLLL = new C73426Srm(LJJZZI);
        c73318Sq2.LIZ(c73849Syb.LJJJ(c73950T0o).LJJJLIIL(new AfS64S0100000_12(this, 129), new AfS64S0100000_12(this, 130)));
    }
}
