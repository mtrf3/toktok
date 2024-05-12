package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WgB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82899WgB implements InterfaceC82913WgP {
    public InterfaceC88472Yns<? super HBV, C76800UCe> LIZ;
    public InterfaceC88472Yns<? super InterfaceC82913WgP, C76800UCe> LIZIZ;

    public final void LIZIZ() {
        if (this.LIZIZ != null) {
            synchronized (this) {
                InterfaceC88472Yns<? super InterfaceC82913WgP, C76800UCe> interfaceC88472Yns = this.LIZIZ;
                if (interfaceC88472Yns != null) {
                    o.LJI(interfaceC88472Yns);
                    interfaceC88472Yns.invoke(this);
                }
                this.LIZIZ = null;
            }
        }
    }

    @Override // X.InterfaceC82913WgP
    public final void LIZ(HBU mapper) {
        o.LJIIIZ(mapper, "mapper");
        this.LIZ = mapper;
    }
}
