package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.L2c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53606L2c implements InterfaceC73131Sn1<Object> {
    public final String LJLIL;

    public C53606L2c() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C53606L2c) && o.LJ(this.LJLIL, ((C53606L2c) obj).LJLIL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveShowDescGuidanceItemData(extra=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C53606L2c(int i) {
        this.LJLIL = null;
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLILLIZIL(Object obj) {
        return obj instanceof C53606L2c;
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLLLLLZ(Object obj) {
        return obj instanceof C53606L2c;
    }
}
