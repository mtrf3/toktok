package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WnY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83356WnY extends AbstractC83369Wnl {
    public final C83351WnT LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: ");
        LIZ.append(EnumC83358Wna.OPTIONS_CLICK.name());
        LIZ.append(" isUnselect: ");
        LIZ.append(this.LJ);
        LIZ.append("  isUndo: ");
        LIZ.append(this.LJFF);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC83369Wnl
    public final EnumC83358Wna LIZ() {
        return EnumC83358Wna.OPTIONS_CLICK;
    }

    public C83356WnY(C83351WnT parentMessage, int i, boolean z, boolean z2, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        z2 = (i2 & 8) != 0 ? false : z2;
        o.LJIIIZ(parentMessage, "parentMessage");
        this.LIZJ = parentMessage;
        this.LIZLLL = i;
        this.LJ = z;
        this.LJFF = z2;
    }
}
