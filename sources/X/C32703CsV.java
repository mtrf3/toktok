package X;

import kotlin.jvm.internal.o;

/* renamed from: X.CsV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32703CsV extends AbstractC03120Ai {
    public final /* synthetic */ C32681Cs9 LIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZ.LJLILLLLZI.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.LJLJI.size();
    }

    public C32703CsV(C32681Cs9 c32681Cs9) {
        this.LIZ = c32681Cs9;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Object obj;
        C32697CsP c32697CsP;
        Object obj2;
        C32697CsP c32697CsP2;
        Long l;
        Long l2;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (i <= this.LIZ.LJLJI.size() - 1 && i2 <= this.LIZ.LJLILLLLZI.size() - 1 && i >= 0 && i2 >= 0) {
            if ((this.LIZ.LJLJI.get(i) instanceof C32726Css) && (this.LIZ.LJLILLLLZI.get(i2) instanceof C32726Css)) {
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = this.LIZ.LJLJI.get(i);
                Boolean bool4 = null;
                if (abstractC32698CsQ != null) {
                    obj = abstractC32698CsQ.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof C32697CsP) {
                    c32697CsP = (C32697CsP) obj;
                } else {
                    c32697CsP = null;
                }
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2 = this.LIZ.LJLILLLLZI.get(i2);
                if (abstractC32698CsQ2 != null) {
                    obj2 = abstractC32698CsQ2.LIZIZ;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof C32697CsP) {
                    c32697CsP2 = (C32697CsP) obj2;
                } else {
                    c32697CsP2 = null;
                }
                if (c32697CsP != null) {
                    l = Long.valueOf(c32697CsP.LIZ);
                } else {
                    l = null;
                }
                if (c32697CsP2 != null) {
                    l2 = Long.valueOf(c32697CsP2.LIZ);
                } else {
                    l2 = null;
                }
                if (o.LJ(l, l2)) {
                    if (c32697CsP != null) {
                        str = c32697CsP.LJ;
                    } else {
                        str = null;
                    }
                    if (c32697CsP2 != null) {
                        str2 = c32697CsP2.LJ;
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str, str2)) {
                        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LIZ.LJLJI.get(i);
                        if (abstractC32698CsQ3 != null) {
                            bool = Boolean.valueOf(abstractC32698CsQ3.LIZJ);
                        } else {
                            bool = null;
                        }
                        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = this.LIZ.LJLILLLLZI.get(i2);
                        if (abstractC32698CsQ4 != null) {
                            bool2 = Boolean.valueOf(abstractC32698CsQ4.LIZJ);
                        } else {
                            bool2 = null;
                        }
                        if (o.LJ(bool, bool2)) {
                            if (c32697CsP != null) {
                                bool3 = Boolean.valueOf(c32697CsP.LJIILIIL);
                            } else {
                                bool3 = null;
                            }
                            if (c32697CsP2 != null) {
                                bool4 = Boolean.valueOf(c32697CsP2.LJIILIIL);
                            }
                            if (o.LJ(bool3, bool4)) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 = this.LIZ.LJLILLLLZI.get(i2);
                if (abstractC32698CsQ5 != null && !abstractC32698CsQ5.LJIIIIZZ) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        Long l;
        Long l2;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2;
        Integer num;
        Integer num2;
        Long l3;
        Object obj;
        C32697CsP c32697CsP;
        C32697CsP c32697CsP2;
        if (i <= this.LIZ.LJLJI.size() - 1 && i2 <= this.LIZ.LJLILLLLZI.size() - 1 && i >= 0 && i2 >= 0) {
            Object obj2 = null;
            if ((this.LIZ.LJLJI.get(i) instanceof C32726Css) && (this.LIZ.LJLILLLLZI.get(i2) instanceof C32726Css)) {
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LIZ.LJLJI.get(i);
                if (abstractC32698CsQ3 != null) {
                    obj = abstractC32698CsQ3.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof C32697CsP) {
                    c32697CsP = (C32697CsP) obj;
                } else {
                    c32697CsP = null;
                }
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = this.LIZ.LJLILLLLZI.get(i2);
                if (abstractC32698CsQ4 != null) {
                    obj2 = abstractC32698CsQ4.LIZIZ;
                }
                if ((obj2 instanceof C32697CsP) && (c32697CsP2 = (C32697CsP) obj2) != null && c32697CsP != null && c32697CsP2.LJIIIZ == c32697CsP.LJIIIZ && c32697CsP2.LJIIJ == c32697CsP.LJIIJ && c32697CsP2.LJIIJJI == c32697CsP.LJIIJJI) {
                    return true;
                }
            } else {
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ5 = this.LIZ.LJLJI.get(i);
                if (abstractC32698CsQ5 != null) {
                    l = Long.valueOf(abstractC32698CsQ5.LIZJ());
                } else {
                    l = null;
                }
                AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ6 = this.LIZ.LJLILLLLZI.get(i2);
                if (abstractC32698CsQ6 != null) {
                    l2 = Long.valueOf(abstractC32698CsQ6.LIZJ());
                } else {
                    l2 = null;
                }
                if (o.LJ(l, l2) && (abstractC32698CsQ = this.LIZ.LJLILLLLZI.get(i2)) != null && !abstractC32698CsQ.LJIIIIZZ && (abstractC32698CsQ2 = this.LIZ.LJLJI.get(i)) != null && !abstractC32698CsQ2.LIZJ) {
                    AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ7 = this.LIZ.LJLJI.get(i);
                    if (abstractC32698CsQ7 != null) {
                        num = Integer.valueOf(abstractC32698CsQ7.LIZ);
                    } else {
                        num = null;
                    }
                    AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ8 = this.LIZ.LJLILLLLZI.get(i2);
                    if (abstractC32698CsQ8 != null) {
                        num2 = Integer.valueOf(abstractC32698CsQ8.LIZ);
                    } else {
                        num2 = null;
                    }
                    if (o.LJ(num, num2)) {
                        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ9 = this.LIZ.LJLJI.get(i);
                        if (abstractC32698CsQ9 != null) {
                            l3 = Long.valueOf(abstractC32698CsQ9.LJIIL);
                        } else {
                            l3 = null;
                        }
                        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ10 = this.LIZ.LJLILLLLZI.get(i2);
                        if (abstractC32698CsQ10 != null) {
                            obj2 = Long.valueOf(abstractC32698CsQ10.LJIIL);
                        }
                        if (o.LJ(l3, obj2)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
