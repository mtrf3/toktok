package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.Us6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78542Us6 extends C78546UsA {
    public Long LJIILLIIL;
    public Double LJIIZILJ;
    public Integer LJIJ;
    public Integer LJIJI;
    public Long LJIJJ;
    public Integer LJIJJLI;
    public Integer LJIL;
    public Integer LJJ;
    public Integer LJJI;
    public Integer LJJIFFI;

    public C78542Us6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78542Us6)) {
            return false;
        }
        C78542Us6 c78542Us6 = (C78542Us6) obj;
        return o.LJ(this.LJIILLIIL, c78542Us6.LJIILLIIL) && o.LJ(this.LJIIZILJ, c78542Us6.LJIIZILJ) && o.LJ(this.LJIJ, c78542Us6.LJIJ) && o.LJ(this.LJIJI, c78542Us6.LJIJI) && o.LJ(this.LJIJJ, c78542Us6.LJIJJ) && o.LJ(this.LJIJJLI, c78542Us6.LJIJJLI) && o.LJ(this.LJIL, c78542Us6.LJIL) && o.LJ(this.LJJ, c78542Us6.LJJ) && o.LJ(this.LJJI, c78542Us6.LJJI) && o.LJ(this.LJJIFFI, c78542Us6.LJJIFFI);
    }

    public final int hashCode() {
        Long l = this.LJIILLIIL;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.LJIIZILJ;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.LJIJ;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIJI;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.LJIJJ;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.LJIJJLI;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.LJIL;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.LJJ;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.LJJI;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.LJJIFFI;
        return hashCode9 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ToolsFluencyEvent(duration=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(", fps=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(", dropMax=");
        LIZ.append(this.LJIJ);
        LIZ.append(", weightedDropCount=");
        LIZ.append(this.LJIJI);
        LIZ.append(", blockDuration=");
        LIZ.append(this.LJIJJ);
        LIZ.append(", blockCount=");
        LIZ.append(this.LJIJJLI);
        LIZ.append(", level1=");
        LIZ.append(this.LJIL);
        LIZ.append(", level2=");
        LIZ.append(this.LJJ);
        LIZ.append(", level3=");
        LIZ.append(this.LJJI);
        LIZ.append(", level4=");
        return s0.LIZJ(LIZ, this.LJJIFFI, ')', LIZ);
    }

    public /* synthetic */ C78542Us6(int i) {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public C78542Us6(Long l, Double d, Integer num, Integer num2, Long l2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.LJIILLIIL = l;
        this.LJIIZILJ = d;
        this.LJIJ = num;
        this.LJIJI = num2;
        this.LJIJJ = l2;
        this.LJIJJLI = num3;
        this.LJIL = num4;
        this.LJJ = num5;
        this.LJJI = num6;
        this.LJJIFFI = num7;
    }
}
