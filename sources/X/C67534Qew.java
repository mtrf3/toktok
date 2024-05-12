package X;

/* renamed from: X.Qew, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67534Qew extends AbstractC67535Qex {
    public final Integer LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        Integer num = this.LIZ;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.LIZLLL;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.LJ;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str5 = this.LJFF;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        String str6 = this.LJI;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode7) * 1000003;
        String str7 = this.LJII;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 ^ hashCode8) * 1000003;
        String str8 = this.LJIIIIZZ;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 ^ hashCode9) * 1000003;
        String str9 = this.LJIIIZ;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 ^ hashCode10) * 1000003;
        String str10 = this.LJIIJ;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 ^ hashCode11) * 1000003;
        String str11 = this.LJIIJJI;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i12 ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AndroidClientInfo{sdkVersion=");
        LIZ.append(this.LIZ);
        LIZ.append(", model=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", hardware=");
        LIZ.append(this.LIZJ);
        LIZ.append(", device=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", product=");
        LIZ.append(this.LJ);
        LIZ.append(", osBuild=");
        LIZ.append(this.LJFF);
        LIZ.append(", manufacturer=");
        LIZ.append(this.LJI);
        LIZ.append(", fingerprint=");
        LIZ.append(this.LJII);
        LIZ.append(", locale=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", country=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", mccMnc=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", applicationBuild=");
        return JBR.LJFF(LIZ, this.LJIIJJI, "}", LIZ);
    }

    @Override // X.AbstractC67535Qex
    public final String LIZ() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC67535Qex
    public final String LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.AbstractC67535Qex
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67535Qex
    public final String LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC67535Qex
    public final String LJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67535Qex
    public final String LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC67535Qex
    public final String LJI() {
        return this.LJI;
    }

    @Override // X.AbstractC67535Qex
    public final String LJII() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC67535Qex
    public final String LJIIIIZZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67535Qex
    public final String LJIIIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC67535Qex
    public final String LJIIJ() {
        return this.LJ;
    }

    @Override // X.AbstractC67535Qex
    public final Integer LJIIJJI() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67535Qex)) {
            return false;
        }
        AbstractC67535Qex abstractC67535Qex = (AbstractC67535Qex) obj;
        Integer num = this.LIZ;
        if (num != null ? num.equals(abstractC67535Qex.LJIIJJI()) : abstractC67535Qex.LJIIJJI() == null) {
            String str = this.LIZIZ;
            if (str != null ? str.equals(abstractC67535Qex.LJIIIIZZ()) : abstractC67535Qex.LJIIIIZZ() == null) {
                String str2 = this.LIZJ;
                if (str2 != null ? str2.equals(abstractC67535Qex.LJ()) : abstractC67535Qex.LJ() == null) {
                    String str3 = this.LIZLLL;
                    if (str3 != null ? str3.equals(abstractC67535Qex.LIZJ()) : abstractC67535Qex.LIZJ() == null) {
                        String str4 = this.LJ;
                        if (str4 != null ? str4.equals(abstractC67535Qex.LJIIJ()) : abstractC67535Qex.LJIIJ() == null) {
                            String str5 = this.LJFF;
                            if (str5 != null ? str5.equals(abstractC67535Qex.LJIIIZ()) : abstractC67535Qex.LJIIIZ() == null) {
                                String str6 = this.LJI;
                                if (str6 != null ? str6.equals(abstractC67535Qex.LJI()) : abstractC67535Qex.LJI() == null) {
                                    String str7 = this.LJII;
                                    if (str7 != null ? str7.equals(abstractC67535Qex.LIZLLL()) : abstractC67535Qex.LIZLLL() == null) {
                                        String str8 = this.LJIIIIZZ;
                                        if (str8 != null ? str8.equals(abstractC67535Qex.LJFF()) : abstractC67535Qex.LJFF() == null) {
                                            String str9 = this.LJIIIZ;
                                            if (str9 != null ? str9.equals(abstractC67535Qex.LIZIZ()) : abstractC67535Qex.LIZIZ() == null) {
                                                String str10 = this.LJIIJ;
                                                if (str10 != null ? str10.equals(abstractC67535Qex.LJII()) : abstractC67535Qex.LJII() == null) {
                                                    String str11 = this.LJIIJJI;
                                                    if (str11 == null) {
                                                        if (abstractC67535Qex.LIZ() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(abstractC67535Qex.LIZ())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public C67534Qew(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
    }
}
