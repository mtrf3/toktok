package X;

import java.io.Serializable;

/* renamed from: X.7fG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191427fG extends F9E implements Serializable {
    public final double LJLIL;
    public final double LJLILLLLZI;

    public static /* synthetic */ C191427fG copy$default(C191427fG c191427fG, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = c191427fG.LJLIL;
        }
        if ((i & 2) != 0) {
            d2 = c191427fG.LJLILLLLZI;
        }
        return c191427fG.copy(d, d2);
    }

    public final C191427fG copy(double d, double d2) {
        return new C191427fG(d, d2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Double.valueOf(this.LJLIL), Double.valueOf(this.LJLILLLLZI)};
    }

    public final double getLat() {
        return this.LJLIL;
    }

    public final double getLon() {
        return this.LJLILLLLZI;
    }

    public C191427fG(double d, double d2) {
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
    }
}
