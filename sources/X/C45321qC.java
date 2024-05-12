package X;

import android.view.Choreographer;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45321qC implements InterfaceC44041o8 {
    public final Choreographer LJLIL;

    @Override // X.MBD
    public final InterfaceC48698J9i getKey() {
        return InterfaceC44041o8.LJJLIL;
    }

    public C45321qC(Choreographer choreographer) {
        this.LJLIL = choreographer;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> key) {
        o.LJIIIZ(key, "key");
        return (E) MBC.LIZ(this, key);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> key) {
        o.LJIIIZ(key, "key");
        return MBC.LIZIZ(this, key);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.04j, android.view.Choreographer$FrameCallback] */
    @Override // X.InterfaceC44041o8
    public final <R> Object LJIIJ(final InterfaceC88472Yns<? super Long, ? extends R> interfaceC88472Yns, InterfaceC67352kd<? super R> interfaceC67352kd) {
        C29Y c29y;
        MBD mbd = interfaceC67352kd.getContext().get(C3CQ.LJJIJLIJ);
        if (mbd instanceof C29Y) {
            c29y = (C29Y) mbd;
        } else {
            c29y = null;
        }
        final XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        ?? r3 = new Choreographer.FrameCallback(xks, this, interfaceC88472Yns) { // from class: X.04j
            public final /* synthetic */ XJL<R> LJLIL;
            public final /* synthetic */ InterfaceC88472Yns<Long, R> LJLILLLLZI;

            {
                this.LJLILLLLZI = interfaceC88472Yns;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object LIZ;
                InterfaceC67352kd interfaceC67352kd2 = this.LJLIL;
                try {
                    LIZ = this.LJLILLLLZI.invoke(Long.valueOf(j));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                interfaceC67352kd2.resumeWith(LIZ);
            }
        };
        if (c29y != null && o.LJ(c29y.LJLIL, this.LJLIL)) {
            synchronized (c29y.LJLJI) {
                c29y.LJLJJL.add(r3);
                if (!c29y.LJLJLJ) {
                    c29y.LJLJLJ = true;
                    c29y.LJLIL.postFrameCallback(c29y.LJLJLLL);
                }
            }
            xks.LJIILIIL(new IDqS172S0200000(c29y, (ChoreographerFrameCallbackC015704j) r3, 1));
        } else {
            this.LJLIL.postFrameCallback(r3);
            xks.LJIILIIL(new IDqS172S0200000(this, (ChoreographerFrameCallbackC015704j) r3, 2));
        }
        return xks.LJIIJJI();
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
