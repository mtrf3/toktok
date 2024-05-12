package kotlin.jvm.internal;

import X.AbstractC274515x;
import X.AbstractC39201gK;
import X.AbstractC65781Prl;
import X.C06470Nf;
import X.C0O0;
import X.C10430b1;
import X.C14720hw;
import X.C162476Zf;
import X.C1I3;
import X.C1I8;
import X.C1JK;
import X.C21490sr;
import X.C21540sw;
import X.C23450w1;
import X.C23490w5;
import X.C2B8;
import X.C2BA;
import X.C33681Tw;
import X.C514920j;
import X.C76800UCe;
import X.C78939UyV;
import X.EnumC06630Nv;
import X.EnumC23500w6;
import X.InterfaceC07760Se;
import X.InterfaceC09420Yo;
import X.InterfaceC24760y8;
import X.InterfaceC33691Tx;
import X.InterfaceC43021mU;
import X.InterfaceC88472Yns;

/* loaded from: classes.dex */
public class IDqS4S0100100 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS4S0100100 iDqS4S0100100, Object obj) {
        InterfaceC88472Yns<C23490w5, C23450w1> interfaceC88472Yns;
        C23450w1 invoke;
        long j;
        InterfaceC88472Yns<C23490w5, C23450w1> interfaceC88472Yns2;
        C23450w1 invoke2;
        long j2;
        EnumC06630Nv it = (EnumC06630Nv) obj;
        o.LJIIIZ(it, "it");
        C2B8 c2b8 = (C2B8) iDqS4S0100100.l0;
        long j3 = iDqS4S0100100.j1;
        c2b8.getClass();
        C1I3 value = c2b8.LJLILLLLZI.getValue();
        if (value == null || (interfaceC88472Yns = value.LJLIL) == null || (invoke = interfaceC88472Yns.invoke(new C23490w5(j3))) == null) {
            j = C23450w1.LIZIZ;
        } else {
            j = invoke.LIZ;
        }
        C1I3 value2 = c2b8.LJLJI.getValue();
        if (value2 == null || (interfaceC88472Yns2 = value2.LJLIL) == null || (invoke2 = interfaceC88472Yns2.invoke(new C23490w5(j3))) == null) {
            j2 = C23450w1.LIZIZ;
        } else {
            j2 = invoke2.LIZ;
        }
        int i = C06470Nf.LIZ[it.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j = j2;
                } else {
                    throw new C162476Zf();
                }
            }
        } else {
            j = C23450w1.LIZIZ;
        }
        return new C23450w1(j);
    }

    public static final Object invoke$1(IDqS4S0100100 iDqS4S0100100, Object layout) {
        o.LJIIIZ(layout, "$this$layout");
        AbstractC274515x.LJ((AbstractC39201gK) iDqS4S0100100.l0, iDqS4S0100100.j1, 0.0f);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS4S0100100 iDqS4S0100100, Object obj) {
        long j;
        long j2;
        EnumC06630Nv it = (EnumC06630Nv) obj;
        o.LJIIIZ(it, "it");
        C2BA c2ba = (C2BA) iDqS4S0100100.l0;
        long j3 = iDqS4S0100100.j1;
        c2ba.getClass();
        C1I8 value = c2ba.LJLJI.getValue();
        if (value == null) {
            j = j3;
        } else {
            j = value.LJLILLLLZI.invoke(new C23490w5(j3)).LIZ;
        }
        C1I8 value2 = c2ba.LJLJJI.getValue();
        if (value2 == null) {
            j2 = j3;
        } else {
            j2 = value2.LJLILLLLZI.invoke(new C23490w5(j3)).LIZ;
        }
        int i = C0O0.LIZ[it.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    j3 = j2;
                } else {
                    throw new C162476Zf();
                }
            } else {
                j3 = j;
            }
        }
        return new C23490w5(j3);
    }

    public static final Object invoke$3(IDqS4S0100100 iDqS4S0100100, Object obj) {
        long j;
        EnumC06630Nv it = (EnumC06630Nv) obj;
        o.LJIIIZ(it, "it");
        C2BA c2ba = (C2BA) iDqS4S0100100.l0;
        long j2 = iDqS4S0100100.j1;
        c2ba.getClass();
        if (c2ba.LJLJJLL == null) {
            j = C23450w1.LIZIZ;
        } else if (c2ba.LJLJJL.getValue() == null) {
            j = C23450w1.LIZIZ;
        } else if (o.LJ(c2ba.LJLJJLL, c2ba.LJLJJL.getValue())) {
            j = C23450w1.LIZIZ;
        } else {
            int i = C0O0.LIZ[it.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C1I8 value = c2ba.LJLJJI.getValue();
                        if (value == null) {
                            j = C23450w1.LIZIZ;
                        } else {
                            long j3 = value.LJLILLLLZI.invoke(new C23490w5(j2)).LIZ;
                            InterfaceC07760Se value2 = c2ba.LJLJJL.getValue();
                            o.LJI(value2);
                            EnumC23500w6 enumC23500w6 = EnumC23500w6.Ltr;
                            long q = value2.q(j2, j3, enumC23500w6);
                            InterfaceC07760Se interfaceC07760Se = c2ba.LJLJJLL;
                            o.LJI(interfaceC07760Se);
                            long q2 = interfaceC07760Se.q(j2, j3, enumC23500w6);
                            j = new C23450w1(C78939UyV.LIZ(((int) (q >> 32)) - ((int) (q2 >> 32)), C23450w1.LIZJ(q) - C23450w1.LIZJ(q2))).LIZ;
                        }
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    j = C23450w1.LIZIZ;
                }
            } else {
                j = C23450w1.LIZIZ;
            }
        }
        return new C23450w1(j);
    }

    public static final Object invoke$4(IDqS4S0100100 iDqS4S0100100, Object obj) {
        String targetKey = (String) obj;
        o.LJIIIZ(targetKey, "targetKey");
        super/*X.1mf*/.LIZJ(targetKey, iDqS4S0100100.j1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS4S0100100 iDqS4S0100100, Object obj) {
        float f;
        InterfaceC43021mU drawWithContent = (InterfaceC43021mU) obj;
        o.LJIIIZ(drawWithContent, "$this$drawWithContent");
        float LIZLLL = C10430b1.LIZLLL(iDqS4S0100100.j1);
        float f2 = 0.0f;
        if (LIZLLL > 0.0f) {
            float LJJJJIZL = drawWithContent.LJJJJIZL(C21490sr.LIZ);
            float LJJJJIZL2 = drawWithContent.LJJJJIZL(((InterfaceC09420Yo) iDqS4S0100100.l0).LIZJ(drawWithContent.getLayoutDirection())) - LJJJJIZL;
            float f3 = 2;
            float f4 = (LJJJJIZL * f3) + LIZLLL + LJJJJIZL2;
            EnumC23500w6 layoutDirection = drawWithContent.getLayoutDirection();
            int[] iArr = C21540sw.LIZ;
            if (iArr[layoutDirection.ordinal()] == 1) {
                f = C10430b1.LIZLLL(drawWithContent.LIZIZ()) - f4;
            } else if (LJJJJIZL2 < 0.0f) {
                f = 0.0f;
            } else {
                f = LJJJJIZL2;
            }
            if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                float LIZLLL2 = C10430b1.LIZLLL(drawWithContent.LIZIZ());
                if (LJJJJIZL2 >= 0.0f) {
                    f2 = LJJJJIZL2;
                }
                f4 = LIZLLL2 - f2;
            }
            float LIZIZ = C10430b1.LIZIZ(iDqS4S0100100.j1);
            C33681Tw LJJIII = drawWithContent.LJJIII();
            long LIZIZ2 = LJJIII.LIZIZ();
            LJJIII.LIZ().LJIIL();
            LJJIII.LIZ.LIZIZ(f, (-LIZIZ) / f3, f4, LIZIZ / f3, 0);
            drawWithContent.LJJLIIIIJ();
            LJJIII.LIZ().LJIIJ();
            LJJIII.LIZJ(LIZIZ2);
        } else {
            drawWithContent.LJJLIIIIJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS4S0100100 iDqS4S0100100, Object obj) {
        InterfaceC33691Tx Canvas = (InterfaceC33691Tx) obj;
        o.LJIIIZ(Canvas, "$this$Canvas");
        C14720hw.LJIIIIZZ(Canvas, iDqS4S0100100.j1, 0L, 0L, ((Number) ((InterfaceC24760y8) iDqS4S0100100.l0).getValue()).floatValue(), null, 118);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0100100(long j, InterfaceC09420Yo interfaceC09420Yo, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = interfaceC09420Yo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0100100(long j, C1JK c1jk, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c1jk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0100100(long j, C514920j c514920j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c514920j;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0100100(AbstractC39201gK abstractC39201gK, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC39201gK;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0100100(C2B8 c2b8, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2b8;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS4S0100100(C2BA c2ba, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c2ba;
        this.j1 = j;
    }
}
