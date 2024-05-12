package X;

import java.util.Iterator;

/* renamed from: X.Wy3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84007Wy3 implements InterfaceC84052Wym {
    public final /* synthetic */ C84004Wy0 LIZ;
    public final /* synthetic */ InterfaceC88472Yns LIZIZ;

    public C84007Wy3(C84004Wy0 c84004Wy0, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = c84004Wy0;
        this.LIZIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC84052Wym
    public final void LIZ(int i) {
        InterfaceC88472Yns interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        Iterator<InterfaceC84052Wym> it = this.LIZ.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i);
        }
    }
}
