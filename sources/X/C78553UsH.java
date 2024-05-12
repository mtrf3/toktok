package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UsH, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78553UsH extends C78546UsA {
    public Double LJIILLIIL;
    public Long LJIIZILJ;
    public Double LJIJ;
    public final Float LJIJI;
    public final Float LJIJJ;
    public Float LJIJJLI;
    public Long LJIL;
    public Long LJJ;
    public Long LJJI;
    public Long LJJIFFI;
    public Long LJJII;
    public Long LJJIII;
    public Long LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;
    public Integer LJJIJ;
    public Integer LJJIJIIJI;
    public boolean LJJIJIIJIL;

    public C78553UsH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78553UsH)) {
            return false;
        }
        C78553UsH c78553UsH = (C78553UsH) obj;
        return o.LJ(this.LJIILLIIL, c78553UsH.LJIILLIIL) && o.LJ(this.LJIIZILJ, c78553UsH.LJIIZILJ) && o.LJ(this.LJIJ, c78553UsH.LJIJ) && o.LJ(this.LJIJI, c78553UsH.LJIJI) && o.LJ(this.LJIJJ, c78553UsH.LJIJJ) && o.LJ(this.LJIJJLI, c78553UsH.LJIJJLI) && o.LJ(this.LJIL, c78553UsH.LJIL) && o.LJ(this.LJJ, c78553UsH.LJJ) && o.LJ(this.LJJI, c78553UsH.LJJI) && o.LJ(this.LJJIFFI, c78553UsH.LJJIFFI) && o.LJ(this.LJJII, c78553UsH.LJJII) && o.LJ(this.LJJIII, c78553UsH.LJJIII) && o.LJ(this.LJJIIJ, c78553UsH.LJJIIJ) && o.LJ(this.LJJIIJZLJL, c78553UsH.LJJIIJZLJL) && o.LJ(this.LJJIIZ, c78553UsH.LJJIIZ) && o.LJ(this.LJJIIZI, c78553UsH.LJJIIZI) && o.LJ(this.LJJIJ, c78553UsH.LJJIJ) && o.LJ(this.LJJIJIIJI, c78553UsH.LJJIJIIJI) && this.LJJIJIIJIL == c78553UsH.LJJIJIIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Double d = this.LJIILLIIL;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Long l = this.LJIIZILJ;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Double d2 = this.LJIJ;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Float f = this.LJIJI;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LJIJJ;
        int hashCode5 = (hashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.LJIJJLI;
        int hashCode6 = (hashCode5 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Long l2 = this.LJIL;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.LJJ;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.LJJI;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.LJJIFFI;
        int hashCode10 = (hashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.LJJII;
        int hashCode11 = (hashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l7 = this.LJJIII;
        int hashCode12 = (hashCode11 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l8 = this.LJJIIJ;
        int hashCode13 = (hashCode12 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.LJJIIJZLJL;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJJIIZ;
        int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJJIIZI;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LJJIJ;
        int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJJIJIIJI;
        int hashCode18 = (hashCode17 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.LJJIJIIJIL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode18 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ToolsBaseInfoEvent(cpuRate=");
        sb.append(this.LJIILLIIL);
        sb.append(", cpuCost=");
        sb.append(this.LJIIZILJ);
        sb.append(", cpuSpeed=");
        sb.append(this.LJIJ);
        sb.append(", gpuUsage=");
        sb.append(this.LJIJI);
        sb.append(", gpuCost=");
        sb.append(this.LJIJJ);
        sb.append(", memoryRate=");
        sb.append(this.LJIJJLI);
        sb.append(", memoryUsage=");
        sb.append(this.LJIL);
        sb.append(", memoryCost=");
        sb.append(this.LJJ);
        sb.append(", memoryPssTotal=");
        sb.append(this.LJJI);
        sb.append(", memoryPssNative=");
        sb.append(this.LJJIFFI);
        sb.append(", memoryPssDalvik=");
        sb.append(this.LJJII);
        sb.append(", memoryPssGraphics=");
        sb.append(this.LJJIII);
        sb.append(", memoryVmSize=");
        sb.append(this.LJJIIJ);
        sb.append(", thermal=");
        sb.append(this.LJJIIJZLJL);
        sb.append(", thermalTemp=");
        sb.append(this.LJJIIZ);
        sb.append(", batteryLevel=");
        sb.append(this.LJJIIZI);
        sb.append(", batteryState=");
        sb.append(this.LJJIJ);
        sb.append(", batteryLowPower=");
        sb.append(this.LJJIJIIJI);
        sb.append(", isFirstReport=");
        return C08880Wm.LIZJ(sb, this.LJJIJIIJIL, ')');
    }

    public C78553UsH(int i) {
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ = null;
        this.LJJIIJZLJL = null;
        this.LJJIIZ = null;
        this.LJJIIZI = null;
        this.LJJIJ = null;
        this.LJJIJIIJI = null;
        this.LJJIJIIJIL = false;
    }
}
