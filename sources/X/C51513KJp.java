package X;

import X.InterfaceC63694OzC;
import java.util.HashMap;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.KJp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51513KJp<T extends InterfaceC63694OzC<T>> extends AbstractC50059Jkl<T> {
    public final KJU LIZ;
    public final EnumC51518KJu LIZIZ;
    public final AbstractC51517KJt<T> LIZJ;

    @Override // X.AbstractC50059Jkl
    public final T LIZJ() {
        return (T) this.LIZJ.LIZ.LIZJ(this.LIZ, this.LIZIZ);
    }

    @Override // X.AbstractC50059Jkl
    public final void LIZ(KK7 kk7) {
        C51515KJr.LIZ(kk7, this.LIZ);
    }

    @Override // X.AbstractC50059Jkl
    public final void LIZIZ(C65776Prg c65776Prg, InterfaceC88471Ynr reducer) {
        o.LJIIIZ(reducer, "reducer");
        AbstractC51517KJt<T> abstractC51517KJt = this.LIZJ;
        synchronized (abstractC51517KJt) {
            C51514KJq c51514KJq = (C51514KJq) abstractC51517KJt.LIZIZ.getValue();
            c51514KJq.getClass();
            HashMap<String, InterfaceC88471Ynr<T, KK7, T>> hashMap = c51514KJq.LIZ;
            String LIZLLL = c65776Prg.LIZLLL();
            if (LIZLLL == null) {
                LIZLLL = "";
            }
            hashMap.put(LIZLLL, new AqS188S0100000_6(reducer, (InterfaceC88471Ynr<InterfaceC63694OzC<Object>, Object, InterfaceC63694OzC<Object>>) 7));
        }
    }

    public C51513KJp(KJU bindTo, EnumC51518KJu scope, AbstractC51517KJt<T> m) {
        o.LJIIIZ(bindTo, "bindTo");
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(m, "m");
        this.LIZ = bindTo;
        this.LIZIZ = scope;
        this.LIZJ = m;
    }
}
