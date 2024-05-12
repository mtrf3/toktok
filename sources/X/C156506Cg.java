package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C156506Cg {
    public final int LIZ;
    public final int LIZIZ;
    public final InterfaceC156516Ch LIZJ;
    public final InterfaceC150675vj LIZLLL;
    public final InterfaceC156476Cd LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;

    public C156506Cg() {
        this(0, 0, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C156506Cg)) {
            return false;
        }
        C156506Cg c156506Cg = (C156506Cg) obj;
        return this.LIZ == c156506Cg.LIZ && this.LIZIZ == c156506Cg.LIZIZ && o.LJ(this.LIZJ, c156506Cg.LIZJ) && o.LJ(this.LIZLLL, c156506Cg.LIZLLL) && o.LJ(this.LJ, c156506Cg.LJ) && o.LJ(this.LJFF, c156506Cg.LJFF);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        InterfaceC156516Ch interfaceC156516Ch = this.LIZJ;
        int hashCode = (i + (interfaceC156516Ch == null ? 0 : interfaceC156516Ch.hashCode())) * 31;
        InterfaceC150675vj interfaceC150675vj = this.LIZLLL;
        int hashCode2 = (hashCode + (interfaceC150675vj == null ? 0 : interfaceC150675vj.hashCode())) * 31;
        InterfaceC156476Cd interfaceC156476Cd = this.LJ;
        int hashCode3 = (hashCode2 + (interfaceC156476Cd == null ? 0 : interfaceC156476Cd.hashCode())) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJFF;
        return hashCode3 + (interfaceC65784Pro != null ? interfaceC65784Pro.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditStickerConfig(defaultVideoWidth=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultVideoHeight=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", stickerDeleteViewFactory=");
        LIZ.append(this.LIZJ);
        LIZ.append(", borderLineViewFactory=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fakeFeedViewFactory=");
        LIZ.append(this.LJ);
        LIZ.append(", textStickerConvertToQaSticker=");
        return C06540Nm.LIZJ(LIZ, this.LJFF, ')', LIZ);
    }

    public C156506Cg(int i, int i2, C48693J9d c48693J9d, C32151Nz c32151Nz, int i3) {
        QCU qcu;
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 4) != 0) {
            qcu = new QCU();
        } else {
            qcu = null;
        }
        InterfaceC150675vj c78855Ux9 = (i3 & 8) != 0 ? new C78855Ux9() : c48693J9d;
        c32151Nz = (i3 & 16) != 0 ? null : c32151Nz;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = qcu;
        this.LIZLLL = c78855Ux9;
        this.LJ = c32151Nz;
        this.LJFF = null;
    }
}
