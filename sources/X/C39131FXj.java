package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FXj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39131FXj {
    public final String LIZ;
    public final Integer LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final String LJI;
    public final Integer LJII;
    public final Long LJIIIIZZ;
    public final Long LJIIIZ;
    public final Long LJIIJ;
    public final Long LJIIJJI;
    public final Integer LJIIL;
    public final Long LJIILIIL;
    public final Long LJIILJJIL;
    public final Long LJIILL;
    public final Long LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39131FXj)) {
            return false;
        }
        C39131FXj c39131FXj = (C39131FXj) obj;
        return o.LJ(this.LIZ, c39131FXj.LIZ) && o.LJ(this.LIZIZ, c39131FXj.LIZIZ) && o.LJ(this.LIZJ, c39131FXj.LIZJ) && o.LJ(this.LIZLLL, c39131FXj.LIZLLL) && o.LJ(this.LJ, c39131FXj.LJ) && o.LJ(this.LJFF, c39131FXj.LJFF) && o.LJ(this.LJI, c39131FXj.LJI) && o.LJ(this.LJII, c39131FXj.LJII) && o.LJ(this.LJIIIIZZ, c39131FXj.LJIIIIZZ) && o.LJ(this.LJIIIZ, c39131FXj.LJIIIZ) && o.LJ(this.LJIIJ, c39131FXj.LJIIJ) && o.LJ(this.LJIIJJI, c39131FXj.LJIIJJI) && o.LJ(this.LJIIL, c39131FXj.LJIIL) && o.LJ(this.LJIILIIL, c39131FXj.LJIILIIL) && o.LJ(this.LJIILJJIL, c39131FXj.LJIILJJIL) && o.LJ(this.LJIILL, c39131FXj.LJIILL) && o.LJ(this.LJIILLIIL, c39131FXj.LJIILLIIL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.LIZIZ;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.LJFF;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        String str5 = this.LJI;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.LJII;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Long l2 = this.LJIIIIZZ;
        int hashCode9 = (hashCode8 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.LJIIIZ;
        int hashCode10 = (hashCode9 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.LJIIJ;
        int hashCode11 = (hashCode10 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Long l5 = this.LJIIJJI;
        int hashCode12 = (hashCode11 + (l5 != null ? l5.hashCode() : 0)) * 31;
        Integer num3 = this.LJIIL;
        int hashCode13 = (hashCode12 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Long l6 = this.LJIILIIL;
        int hashCode14 = (hashCode13 + (l6 != null ? l6.hashCode() : 0)) * 31;
        Long l7 = this.LJIILJJIL;
        int hashCode15 = (hashCode14 + (l7 != null ? l7.hashCode() : 0)) * 31;
        Long l8 = this.LJIILL;
        int hashCode16 = (hashCode15 + (l8 != null ? l8.hashCode() : 0)) * 31;
        Long l9 = this.LJIILLIIL;
        return hashCode16 + (l9 != null ? l9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MonitorModel(method=");
        LIZ.append(this.LIZ);
        LIZ.append(", code=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", appID=");
        LIZ.append(this.LIZJ);
        LIZ.append(", channel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", containerType=");
        LIZ.append(this.LJ);
        LIZ.append(", duration=");
        LIZ.append(this.LJFF);
        LIZ.append(", url=");
        LIZ.append(this.LJI);
        LIZ.append(", request_data_length=");
        LIZ.append(this.LJII);
        LIZ.append(", request_send_timestamp=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", request_receive_timestamp=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", request_decode_duration=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", request_duration=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", response_data_length=");
        LIZ.append(this.LJIIL);
        LIZ.append(", response_encode_duration=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", response_send_timestamp=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", response_receive_timestamp=");
        LIZ.append(this.LJIILL);
        LIZ.append(", response_duration=");
        LIZ.append(this.LJIILLIIL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C39131FXj(String str, Integer num, String str2, String str3, String str4, Long l, String str5, Integer num2, Long l2, Long l3, Long l4, Long l5, Integer num3, Long l6, Long l7, Long l8, Long l9) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = l;
        this.LJI = str5;
        this.LJII = num2;
        this.LJIIIIZZ = l2;
        this.LJIIIZ = l3;
        this.LJIIJ = l4;
        this.LJIIJJI = l5;
        this.LJIIL = num3;
        this.LJIILIIL = l6;
        this.LJIILJJIL = l7;
        this.LJIILL = l8;
        this.LJIILLIIL = l9;
    }
}
