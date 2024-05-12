package X;

import kotlin.jvm.internal.o;

/* renamed from: X.acY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94162acY implements InterfaceC93786aWU {
    public final /* synthetic */ java.util.Map LIZ;

    public C94162acY(java.util.Map map) {
        this.LIZ = map;
    }

    @Override // X.InterfaceC93786aWU
    public final void LIZ(C94252ae0 functionItem, int i) {
        o.LJIIIZ(functionItem, "functionItem");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.LIZ.get(Integer.valueOf(functionItem.LJLJI));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
    }
}
