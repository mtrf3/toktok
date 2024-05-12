package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHW {
    public final String LIZ;
    public final EnumC43804HHc LIZIZ;
    public final EnumC43804HHc LIZJ;
    public final EnumC43804HHc LIZLLL;
    public final int LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HHW)) {
            return false;
        }
        HHW hhw = (HHW) obj;
        return o.LJ(this.LIZ, hhw.LIZ) && this.LIZIZ == hhw.LIZIZ && this.LIZJ == hhw.LIZJ && this.LIZLLL == hhw.LIZLLL && this.LJ == hhw.LJ && o.LJ(this.LJFF, hhw.LJFF);
    }

    public final int hashCode() {
        return this.LJFF.hashCode() + ((((this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31) + this.LJ) * 31);
    }

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tag: ");
        LIZ.append(this.LIZ);
        LIZ.append(" \nOrigin File Exit: ");
        LIZ.append(this.LIZIZ.getStatus());
        LIZ.append(" \nRecord File Exit: ");
        LIZ.append(this.LIZJ.getStatus());
        LIZ.append(" \nOutput File Exit: ");
        LIZ.append(this.LIZLLL.getStatus());
        LIZ.append(" \nExtra: ");
        LIZ.append(this.LJFF);
        return X1D.LIZIZ(LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeparatorReport(separatorTag=");
        LIZ.append(this.LIZ);
        LIZ.append(", originFileStatus=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", recordFileStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", outputFileStatus=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", checkResult=");
        LIZ.append(this.LJ);
        LIZ.append(", extra=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public /* synthetic */ HHW(String str, EnumC43804HHc enumC43804HHc, EnumC43804HHc enumC43804HHc2, EnumC43804HHc enumC43804HHc3, int i) {
        this(str, enumC43804HHc, enumC43804HHc2, enumC43804HHc3, i, "");
    }

    public HHW(String str, EnumC43804HHc originFileStatus, EnumC43804HHc recordFileStatus, EnumC43804HHc outputFileStatus, int i, String extra) {
        o.LJIIIZ(originFileStatus, "originFileStatus");
        o.LJIIIZ(recordFileStatus, "recordFileStatus");
        o.LJIIIZ(outputFileStatus, "outputFileStatus");
        o.LJIIIZ(extra, "extra");
        this.LIZ = str;
        this.LIZIZ = originFileStatus;
        this.LIZJ = recordFileStatus;
        this.LIZLLL = outputFileStatus;
        this.LJ = i;
        this.LJFF = extra;
    }
}
