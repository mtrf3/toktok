package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.26Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26Y implements InterfaceC44041o8 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public Throwable LJLJI;
    public final Object LJLILLLLZI = new Object();
    public List<C24430xb<?>> LJLJJI = new ArrayList();
    public List<C24430xb<?>> LJLJJL = new ArrayList();

    public final boolean LJII() {
        boolean z;
        synchronized (this.LJLILLLLZI) {
            z = !this.LJLJJI.isEmpty();
        }
        return z;
    }

    @Override // X.MBD
    public final InterfaceC48698J9i getKey() {
        return InterfaceC44041o8.LJJLIL;
    }

    public C26Y(IDqS420S0100000 iDqS420S0100000) {
        this.LJLIL = iDqS420S0100000;
    }

    public final void LJIIIIZZ(long j) {
        Object LIZ;
        synchronized (this.LJLILLLLZI) {
            List<C24430xb<?>> list = this.LJLJJI;
            this.LJLJJI = this.LJLJJL;
            this.LJLJJL = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C24430xb<?> c24430xb = list.get(i);
                InterfaceC67352kd<?> interfaceC67352kd = c24430xb.LIZIZ;
                try {
                    LIZ = c24430xb.LIZ.invoke(Long.valueOf(j));
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                interfaceC67352kd.resumeWith(LIZ);
            }
            list.clear();
        }
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

    public static final void LIZLLL(C26Y c26y, Throwable th) {
        synchronized (c26y.LJLILLLLZI) {
            if (c26y.LJLJI == null) {
                c26y.LJLJI = th;
                List<C24430xb<?>> list = c26y.LJLJJI;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC67352kd<?> interfaceC67352kd = list.get(i).LIZIZ;
                    C3C4 LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                    interfaceC67352kd.resumeWith(LIZ);
                }
                c26y.LJLJJI.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.0xb] */
    @Override // X.InterfaceC44041o8
    public final <R> Object LJIIJ(InterfaceC88472Yns<? super Long, ? extends R> interfaceC88472Yns, InterfaceC67352kd<? super R> interfaceC67352kd) {
        boolean z;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C68322mC c68322mC = new C68322mC();
        synchronized (this.LJLILLLLZI) {
            Throwable th = this.LJLJI;
            if (th != null) {
                C3C4 LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
                xks.resumeWith(LIZ);
            } else {
                c68322mC.element = new C24430xb(interfaceC88472Yns, xks);
                if (!this.LJLJJI.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                List<C24430xb<?>> list = this.LJLJJI;
                T t = c68322mC.element;
                if (t != 0) {
                    list.add((C24430xb) t);
                    boolean z2 = !z;
                    xks.LJIILIIL(new IDqS172S0200000(this, (C26Y) c68322mC, 82));
                    if (z2 && (interfaceC65784Pro = this.LJLIL) != null) {
                        try {
                            interfaceC65784Pro.invoke();
                        } catch (Throwable th2) {
                            LIZLLL(this, th2);
                        }
                    }
                } else {
                    o.LJIJI("awaiter");
                    throw null;
                }
            }
        }
        return xks.LJIIJJI();
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }
}
