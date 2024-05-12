package X;

import java.util.ArrayList;

/* renamed from: X.4vu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125304vu {
    public final ArrayList<AbstractC125294vt> LIZ = new ArrayList<>();
    public int LIZIZ;

    public final void LIZ(C125284vs c125284vs, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LIZIZ = 0;
        AbstractC125294vt abstractC125294vt = (AbstractC125294vt) ORZ.LJLLLLLL(0, this.LIZ);
        if (abstractC125294vt != null) {
            abstractC125294vt.LIZIZ(this, c125284vs, interfaceC88472Yns, interfaceC88472Yns2);
        } else {
            if (interfaceC88472Yns == null) {
                return;
            }
            interfaceC88472Yns.invoke(new C125234vn(false, null));
        }
    }
}
