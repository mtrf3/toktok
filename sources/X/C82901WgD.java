package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WgD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82901WgD implements InterfaceC58666N0s {
    public final /* synthetic */ C82899WgB LIZ;

    public C82901WgD(C82899WgB c82899WgB) {
        this.LIZ = c82899WgB;
    }

    @Override // X.InterfaceC58666N0s
    public final void LIZ(HBV mapping) {
        o.LJIIIZ(mapping, "mapping");
        C82899WgB c82899WgB = this.LIZ;
        c82899WgB.LIZIZ();
        InterfaceC88472Yns<? super HBV, C76800UCe> interfaceC88472Yns = c82899WgB.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(mapping);
        }
    }
}
