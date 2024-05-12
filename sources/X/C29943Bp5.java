package X;

import java.util.List;

/* renamed from: X.Bp5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29943Bp5 implements InterfaceC29947Bp9 {
    public final /* synthetic */ C29944Bp6 LIZ;

    public C29943Bp5(C29944Bp6 c29944Bp6) {
        this.LIZ = c29944Bp6;
    }

    @Override // X.InterfaceC29947Bp9
    public final void LIZ(long j) {
        C29944Bp6 c29944Bp6 = this.LIZ;
        List<C29946Bp8> list = c29944Bp6.LJLIL;
        if (list != null) {
            int i = 0;
            for (C29946Bp8 c29946Bp8 : list) {
                int i2 = i + 1;
                Long l = c29946Bp8.LIZLLL;
                if (l == null || l.longValue() != j) {
                    i = i2;
                } else {
                    c29946Bp8.LIZ = !c29946Bp8.LIZ;
                    c29944Bp6.notifyItemChanged(i, c29946Bp8);
                    InterfaceC29942Bp4 interfaceC29942Bp4 = c29944Bp6.LJLILLLLZI;
                    if (interfaceC29942Bp4 != null) {
                        interfaceC29942Bp4.j8();
                        return;
                    }
                    return;
                }
            }
        }
    }
}
