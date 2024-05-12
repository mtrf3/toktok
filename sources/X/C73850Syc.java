package X;

import java.io.Serializable;

/* renamed from: X.Syc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73850Syc implements Serializable {
    public static final long serialVersionUID = -1322257508628817540L;
    public final InterfaceC73651SvP LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NotificationLite.Subscription[");
        LIZ.append(this.LJLIL);
        LIZ.append("]");
        return X1D.LIZIZ(LIZ);
    }

    public C73850Syc(InterfaceC73651SvP interfaceC73651SvP) {
        this.LJLIL = interfaceC73651SvP;
    }
}
