package X;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M2A implements InterfaceC116954iR<Object> {
    public InterfaceC92693kP LJLIL;
    public Object LJLILLLLZI;
    public boolean LJLJI;
    public final /* synthetic */ XJL<Object> LJLJJI;
    public final /* synthetic */ L8D LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        if (this.LJLJI) {
            if (this.LJLJJI.isActive()) {
                XJL<Object> xjl = this.LJLJJI;
                Object obj = this.LJLILLLLZI;
                C3C5.m7constructorimpl(obj);
                xjl.resumeWith(obj);
                return;
            }
            return;
        }
        if (this.LJLJJL == L8D.FIRST_OR_DEFAULT) {
            XJL<Object> xjl2 = this.LJLJJI;
            Object obj2 = this.LJLJJLL;
            C3C5.m7constructorimpl(obj2);
            xjl2.resumeWith(obj2);
            return;
        }
        if (!this.LJLJJI.isActive()) {
            return;
        }
        XJL<Object> xjl3 = this.LJLJJI;
        C3C4 LIZ = C141335gf.LIZ(new NoSuchElementException(o.LJIILLIIL(this.LJLJJL, "No value received via onNext for ")));
        C3C5.m7constructorimpl(LIZ);
        xjl3.resumeWith(LIZ);
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        XJL<Object> xjl = this.LJLJJI;
        C3C4 LIZ = C141335gf.LIZ(th);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        int ordinal = this.LJLJJL.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                return;
            }
            if (this.LJLJJL == L8D.SINGLE && this.LJLJI) {
                if (this.LJLJJI.isActive()) {
                    XJL<Object> xjl = this.LJLJJI;
                    C3C4 LIZ = C141335gf.LIZ(new IllegalArgumentException(o.LJIILLIIL(this.LJLJJL, "More than one onNext value for ")));
                    C3C5.m7constructorimpl(LIZ);
                    xjl.resumeWith(LIZ);
                }
                InterfaceC92693kP interfaceC92693kP = this.LJLIL;
                if (interfaceC92693kP != null) {
                    interfaceC92693kP.dispose();
                    return;
                } else {
                    o.LJIJI("subscription");
                    throw null;
                }
            }
            this.LJLILLLLZI = obj;
            this.LJLJI = true;
            return;
        }
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        XJL<Object> xjl2 = this.LJLJJI;
        C3C5.m7constructorimpl(obj);
        xjl2.resumeWith(obj);
        InterfaceC92693kP interfaceC92693kP2 = this.LJLIL;
        if (interfaceC92693kP2 != null) {
            interfaceC92693kP2.dispose();
        } else {
            o.LJIJI("subscription");
            throw null;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        this.LJLIL = interfaceC92693kP;
        this.LJLJJI.LJIILIIL(new AqS175S0100000_9(interfaceC92693kP, 17));
    }

    public M2A(XKS xks, L8D l8d, Object obj) {
        this.LJLJJI = xks;
        this.LJLJJL = l8d;
        this.LJLJJLL = obj;
    }
}
