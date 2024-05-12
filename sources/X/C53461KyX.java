package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KyX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53461KyX extends AbstractC53462KyY {
    public final L50 LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarNodeActive(uiData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC53462KyY
    public final L50 LIZ() {
        return this.LIZIZ;
    }

    public C53461KyX(L50 l50) {
        super(l50);
        this.LIZIZ = l50;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C53461KyX) && o.LJ(this.LIZIZ, ((C53461KyX) obj).LIZIZ)) {
            return true;
        }
        return false;
    }
}
