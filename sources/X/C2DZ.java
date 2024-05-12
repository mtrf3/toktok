package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2DZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DZ extends F9E implements InterfaceC50531yb {
    public final C1OL LJLIL;
    public final InterfaceC88472Yns<C1OL, C0XB> LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.InterfaceC42201lA
    public final void LJIILIIL(InterfaceC43021mU interfaceC43021mU) {
        o.LJIIIZ(interfaceC43021mU, "<this>");
        C0XB c0xb = this.LJLIL.LJLILLLLZI;
        o.LJI(c0xb);
        c0xb.LIZ.invoke(interfaceC43021mU);
    }

    @Override // X.InterfaceC50531yb
    public final void LJJLIIIJLLLLLLLZ(C45791qx params) {
        o.LJIIIZ(params, "params");
        C1OL c1ol = this.LJLIL;
        c1ol.getClass();
        c1ol.LJLIL = params;
        c1ol.LJLILLLLZI = null;
        this.LJLILLLLZI.invoke(c1ol);
        if (c1ol.LJLILLLLZI != null) {
            return;
        }
        "DrawResult not defined, did you forget to call onDraw?".toString();
        throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2DZ(C1OL cacheDrawScope, InterfaceC88472Yns<? super C1OL, C0XB> onBuildDrawCache) {
        o.LJIIIZ(cacheDrawScope, "cacheDrawScope");
        o.LJIIIZ(onBuildDrawCache, "onBuildDrawCache");
        this.LJLIL = cacheDrawScope;
        this.LJLILLLLZI = onBuildDrawCache;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }
}
