package kotlin.jvm.internal;

import X.AbstractC06580Nq;
import X.AbstractC06620Nu;
import X.AbstractC13490fx;
import X.AbstractC65781Prl;
import X.C06670Nz;
import X.C07070Pn;
import X.C0O4;
import X.C0SU;
import X.C0VD;
import X.C0X9;
import X.C10370av;
import X.C111074Xn;
import X.C11F;
import X.C13570g5;
import X.C13590g7;
import X.C13640gC;
import X.C1ID;
import X.C1J4;
import X.C1JK;
import X.C1JX;
import X.C1M1;
import X.C1OF;
import X.C1OH;
import X.C20300qw;
import X.C24380xW;
import X.C24400xY;
import X.C24490xh;
import X.C24500xi;
import X.C24570xp;
import X.C24610xt;
import X.C25730zh;
import X.C27C;
import X.C2B6;
import X.C2FM;
import X.C2FW;
import X.C35821as;
import X.C35851av;
import X.C35871ax;
import X.C35931b3;
import X.C521923b;
import X.C54722Cu;
import X.C76732zl;
import X.C76800UCe;
import X.C78840Uwu;
import X.C78966Uyw;
import X.EnumC06630Nv;
import X.InterfaceC07150Pv;
import X.InterfaceC07790Sh;
import X.InterfaceC24350xT;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC24760y8;
import X.InterfaceC25720zg;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.MBB;
import android.graphics.Typeface;
import android.os.Trace;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDqS180S0200000 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2, obj3);
            case 17:
                return invoke$17(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDqS180S0200000(java.lang.Object r3, X.InterfaceC88471Ynr r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 7: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 3
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS180S0200000.<init>(java.lang.Object, X.Ynr, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(AbstractC06580Nq abstractC06580Nq, AbstractC06620Nu abstractC06620Nu, int i) {
        super(3);
        this.$t = i;
        this.l0 = abstractC06580Nq;
        this.l1 = abstractC06620Nu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(C0SU c0su, C0X9 c0x9, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0su;
        this.l1 = c0x9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(InterfaceC25720zg interfaceC25720zg, C25730zh c25730zh, int i) {
        super(3);
        this.$t = i;
        this.l0 = c25730zh;
        this.l1 = interfaceC25720zg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(C1J4 c1j4, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC88471Ynr;
        this.l1 = c1j4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(C35871ax c35871ax, C24400xY c24400xY, int i) {
        super(3);
        this.$t = i;
        this.l0 = c35871ax;
        this.l1 = c24400xY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(C35931b3 c35931b3, C24380xW c24380xW, int i) {
        super(3);
        this.$t = i;
        this.l0 = c35931b3;
        this.l1 = c24380xW;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(C521923b c521923b, C1OH c1oh, int i) {
        super(3);
        this.$t = i;
        this.l0 = c521923b;
        this.l1 = c1oh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(C76732zl c76732zl, C24400xY c24400xY, int i) {
        super(3);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = c24400xY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(Spannable spannable, IDqS447S0100000 iDqS447S0100000, int i) {
        super(3);
        this.$t = i;
        this.l0 = spannable;
        this.l1 = iDqS447S0100000;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(List list, C76732zl c76732zl, int i) {
        super(3);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(IDqS176S0200000 iDqS176S0200000, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(3);
        this.$t = i;
        this.l0 = iDqS176S0200000;
        this.l1 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(IDqS4S0201000 iDqS4S0201000, C35931b3 c35931b3, int i) {
        super(3);
        this.$t = i;
        this.l0 = iDqS4S0201000;
        this.l1 = c35931b3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS180S0200000(Object[] objArr, C54722Cu c54722Cu, int i) {
        super(3);
        this.$t = i;
        this.l0 = objArr;
        this.l1 = c54722Cu;
    }

    public static final Object invoke$0(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC07790Sh composed = (InterfaceC07790Sh) obj;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(composed, "$this$composed");
        interfaceC24520xk.LJJIIJ(996776706);
        interfaceC24520xk.LJJIIJ(-723524056);
        interfaceC24520xk.LJJIIJ(-3687241);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJIILL == c24490xh) {
            LJIILL = new C35821as(C24610xt.LJII(MBB.INSTANCE, interfaceC24520xk));
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJIILL).LJLIL;
        interfaceC24520xk.LJJIJIIJIL();
        C1J4 c1j4 = (C1J4) iDqS180S0200000.l1;
        interfaceC24520xk.LJJIIJ(-3686930);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(interfaceC70422pa);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL2 == c24490xh) {
            LJIILL2 = new C2B6(c1j4, interfaceC70422pa);
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C2B6 c2b6 = (C2B6) LJIILL2;
        c2b6.LJLJI = (InterfaceC88471Ynr) iDqS180S0200000.l0;
        InterfaceC07790Sh LLLIIIL = C78840Uwu.LJII(composed).LLLIIIL(c2b6);
        interfaceC24520xk.LJJIJIIJIL();
        return LLLIIIL;
    }

    public static final Object invoke$1(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        Object obj4;
        InterfaceC07150Pv animateFloat = (InterfaceC07150Pv) obj;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(animateFloat, "$this$animateFloat");
        interfaceC24520xk.LJJIIJ(-9520302);
        EnumC06630Nv enumC06630Nv = EnumC06630Nv.PreEnter;
        EnumC06630Nv enumC06630Nv2 = EnumC06630Nv.Visible;
        if (animateFloat.LIZ(enumC06630Nv, enumC06630Nv2)) {
            C1ID c1id = ((AbstractC06580Nq) iDqS180S0200000.l0).LIZ().LIZ;
            if (c1id == null || (obj4 = c1id.LJLILLLLZI) == null) {
                obj4 = C06670Nz.LIZJ;
            }
        } else if (animateFloat.LIZ(enumC06630Nv2, EnumC06630Nv.PostExit)) {
            C1ID c1id2 = ((AbstractC06620Nu) iDqS180S0200000.l1).LIZ().LIZ;
            if (c1id2 == null || (obj4 = c1id2.LJLILLLLZI) == null) {
                obj4 = C06670Nz.LIZJ;
            }
        } else {
            obj4 = C06670Nz.LIZJ;
        }
        interfaceC24520xk.LJJIJIIJIL();
        return obj4;
    }

    public static final Object invoke$10(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", (C24570xp) obj2, "<anonymous parameter 1>", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        C76732zl c76732zl = (C76732zl) iDqS180S0200000.l0;
        List list = (List) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:nodesToInsert");
        try {
            int i = c76732zl.element;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj4 = list.get(i2);
                int i3 = i + i2;
                interfaceC24420xa.LIZJ(i3, obj4);
                interfaceC24420xa.LJII(i3, obj4);
            }
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$11(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C24570xp c24570xp = (C24570xp) obj2;
        InterfaceC24350xT interfaceC24350xT = (InterfaceC24350xT) obj3;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", c24570xp, "slots", interfaceC24350xT, "rememberManager");
        C76732zl c76732zl = (C76732zl) iDqS180S0200000.l0;
        List list = (List) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:offsetChanges-fastForEach");
        try {
            int i = c76732zl.element;
            if (i > 0) {
                interfaceC24420xa = new C35851av(interfaceC24420xa, i);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC88473Ynt) list.get(i2)).invoke(interfaceC24420xa, c24570xp, interfaceC24350xT);
            }
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$12(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        C24570xp c24570xp = (C24570xp) obj2;
        C1JX.LJIIIZ((InterfaceC24420xa) obj, "<anonymous parameter 0>", c24570xp, "slots", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        C35931b3 c35931b3 = (C35931b3) iDqS180S0200000.l0;
        C24380xW c24380xW = (C24380xW) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:releaseMovableGroupAtCurrent");
        try {
            C35931b3.LJJIL(c35931b3, c24380xW, c24570xp);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$13(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        C1JX.LJIIIZ((InterfaceC24420xa) obj, "<anonymous parameter 0>", (C24570xp) obj2, "<anonymous parameter 1>", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDqS180S0200000.l0;
        C35931b3 c35931b3 = (C35931b3) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:it(composition)");
        try {
            interfaceC88472Yns.invoke(c35931b3.LJII);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$14(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        C24570xp c24570xp = (C24570xp) obj2;
        C1JX.LJIIIZ((InterfaceC24420xa) obj, "<anonymous parameter 0>", c24570xp, "slots", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        C35871ax slots = (C35871ax) iDqS180S0200000.l0;
        C24400xY c24400xY = (C24400xY) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:slots_ime");
        try {
            c24570xp.LJ();
            c24400xY.getClass();
            o.LJIIIZ(slots, "slots");
            c24570xp.LJIJJLI(slots, slots.LJII(c24400xY));
            c24570xp.LJIIIZ();
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$15(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        C111074Xn.LIZIZ((Number) obj3, (InterfaceC07790Sh) obj, "$this$composed", interfaceC24520xk, 410346167);
        interfaceC24520xk.LJJIIJ(773894976);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJIILL == c24490xh) {
            LJIILL = new C35821as(C24610xt.LJII(MBB.INSTANCE, interfaceC24520xk));
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJIILL).LJLIL;
        interfaceC24520xk.LJJIJIIJIL();
        C25730zh c25730zh = (C25730zh) iDqS180S0200000.l0;
        interfaceC24520xk.LJJIIJ(100475956);
        if (c25730zh == null) {
            interfaceC24520xk.LJJIIJ(-492369756);
            Object LJIILL2 = interfaceC24520xk.LJIILL();
            if (LJIILL2 == c24490xh) {
                LJIILL2 = new C25730zh();
                interfaceC24520xk.LJJIII(LJIILL2);
            }
            interfaceC24520xk.LJJIJIIJIL();
            c25730zh = (C25730zh) LJIILL2;
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC25720zg interfaceC25720zg = (InterfaceC25720zg) iDqS180S0200000.l1;
        interfaceC24520xk.LJJIIJ(1618982084);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(interfaceC25720zg) | interfaceC24520xk.LJIJJ(c25730zh) | interfaceC24520xk.LJIJJ(interfaceC70422pa);
        Object LJIILL3 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL3 == c24490xh) {
            c25730zh.LIZIZ = interfaceC70422pa;
            LJIILL3 = new C27C(interfaceC25720zg, c25730zh);
            interfaceC24520xk.LJJIII(LJIILL3);
        }
        interfaceC24520xk.LJJIJIIJIL();
        interfaceC24520xk.LJJIJIIJIL();
        return LJIILL3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$16(kotlin.jvm.internal.IDqS180S0200000 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0Sh r6 = (X.InterfaceC07790Sh) r6
            X.0xk r7 = (X.InterfaceC24520xk) r7
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.String r1 = "$this$composed"
            r0 = -906157935(0xffffffffc9fd2091, float:-2073618.1)
            X.C111074Xn.LIZIZ(r8, r6, r1, r7, r0)
            X.1o7 r0 = X.AnonymousClass057.LJ
            java.lang.Object r2 = r7.LJIILLIIL(r0)
            X.0vt r2 = (X.InterfaceC23370vt) r2
            X.1o7 r0 = X.AnonymousClass057.LJIILJJIL
            java.lang.Object r1 = r7.LJIILLIIL(r0)
            X.04g r1 = (X.InterfaceC015404g) r1
            r0 = 1157296644(0x44faf204, float:2007.563)
            r7.LJJIIJ(r0)
            boolean r0 = r7.LJIJJ(r2)
            java.lang.Object r4 = r7.LJIILL()
            if (r0 != 0) goto L37
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r4 != r0) goto L3f
        L37:
            X.27m r4 = new X.27m
            r4.<init>(r1, r2)
            r7.LJJIII(r4)
        L3f:
            r7.LJJIJIIJIL()
            java.lang.Object r3 = r5.l0
            java.lang.Object r2 = r5.l1
            X.Ynr r2 = (X.InterfaceC88471Ynr) r2
            X.27m r4 = (X.C533427m) r4
            X.2Gr r1 = new X.2Gr
            r0 = 0
            r1.<init>(r4, r2, r0)
            X.C24610xt.LIZLLL(r4, r3, r1, r7)
            r7.LJJIJIIJIL()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS180S0200000.invoke$16(kotlin.jvm.internal.IDqS180S0200000, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$17(kotlin.jvm.internal.IDqS180S0200000 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            X.0Sh r4 = (X.InterfaceC07790Sh) r4
            X.0xk r5 = (X.InterfaceC24520xk) r5
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.String r1 = "$this$composed"
            r0 = 664422852(0x279a49c4, float:4.2823563E-15)
            X.C111074Xn.LIZIZ(r6, r4, r1, r5, r0)
            X.1o7 r0 = X.AnonymousClass057.LJ
            java.lang.Object r2 = r5.LJIILLIIL(r0)
            X.0vt r2 = (X.InterfaceC23370vt) r2
            X.1o7 r0 = X.AnonymousClass057.LJIILJJIL
            java.lang.Object r1 = r5.LJIILLIIL(r0)
            X.04g r1 = (X.InterfaceC015404g) r1
            r0 = 1157296644(0x44faf204, float:2007.563)
            r5.LJJIIJ(r0)
            boolean r0 = r5.LJIJJ(r2)
            java.lang.Object r4 = r5.LJIILL()
            if (r0 != 0) goto L37
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r4 != r0) goto L3f
        L37:
            X.27m r4 = new X.27m
            r4.<init>(r1, r2)
            r5.LJJIII(r4)
        L3f:
            r5.LJJIJIIJIL()
            java.lang.Object r2 = r3.l0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object r3 = r3.l1
            X.Ynr r3 = (X.InterfaceC88471Ynr) r3
            X.27m r4 = (X.C533427m) r4
            X.QSQ r1 = new X.QSQ
            r0 = 2
            r1.<init>(r0)
            r1.LIZ(r4)
            r1.LJ(r2)
            int r0 = r1.LJFF()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r1.LJIIIZ(r0)
            X.2Gt r1 = new X.2Gt
            r0 = 0
            r1.<init>(r4, r3, r0)
            X.C24610xt.LJFF(r2, r1, r5)
            r5.LJJIJIIJIL()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS180S0200000.invoke$17(kotlin.jvm.internal.IDqS180S0200000, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        Object obj4;
        InterfaceC07150Pv animateFloat = (InterfaceC07150Pv) obj;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        ((Number) obj3).intValue();
        o.LJIIIZ(animateFloat, "$this$animateFloat");
        interfaceC24520xk.LJJIIJ(-9519413);
        EnumC06630Nv enumC06630Nv = EnumC06630Nv.PreEnter;
        EnumC06630Nv enumC06630Nv2 = EnumC06630Nv.Visible;
        if (animateFloat.LIZ(enumC06630Nv, enumC06630Nv2)) {
            C0O4 c0o4 = ((AbstractC06580Nq) iDqS180S0200000.l0).LIZ().LIZLLL;
            if (c0o4 == null || (obj4 = c0o4.LIZJ) == null) {
                obj4 = C06670Nz.LIZJ;
            }
        } else if (animateFloat.LIZ(enumC06630Nv2, EnumC06630Nv.PostExit)) {
            C0O4 c0o42 = ((AbstractC06620Nu) iDqS180S0200000.l1).LIZ().LIZLLL;
            if (c0o42 == null || (obj4 = c0o42.LIZJ) == null) {
                obj4 = C06670Nz.LIZJ;
            }
        } else {
            obj4 = C06670Nz.LIZJ;
        }
        interfaceC24520xk.LJJIJIIJIL();
        return obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.IDqS180S0200000 r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            X.0Sh r3 = (X.InterfaceC07790Sh) r3
            X.0xk r4 = (X.InterfaceC24520xk) r4
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.String r1 = "$this$composed"
            r0 = -353972293(0xffffffffeae6cfbb, float:-1.3951696E26)
            X.C111074Xn.LIZIZ(r5, r3, r1, r4, r0)
            java.lang.Object r1 = r2.l0
            X.0SU r1 = (X.C0SU) r1
            if (r1 != 0) goto L16
            X.1Lp r1 = new X.C0SU() { // from class: X.1Lp
                static {
                    /*
                        X.1Lp r0 = new X.1Lp
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.1Lp) X.1Lp.LIZ X.1Lp
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C31531Lp.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C31531Lp.<init>():void");
                }

                @Override // X.C0SU
                public final X.C0SW LIZ(X.C0X9 r2, X.InterfaceC24520xk r3) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "interactionSource"
                        kotlin.jvm.internal.o.LJIIIZ(r2, r0)
                        r0 = 285654452(0x1106bdb4, float:1.0629193E-28)
                        r3.LJJIIJ(r0)
                        X.1Lo r0 = new X.C0SW() { // from class: X.1Lo
                            static {
                                /*
                                    X.1Lo r0 = new X.1Lo
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT (r0 I:X.1Lo) X.1Lo.LJLIL X.1Lo
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C31521Lo.<clinit>():void");
                            }

                            {
                                /*
                                    r0 = this;
                                    r0.<init>()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C31521Lo.<init>():void");
                            }

                            @Override // X.C0SW
                            public final void LIZ(X.InterfaceC43021mU r2) {
                                /*
                                    r1 = this;
                                    java.lang.String r0 = "<this>"
                                    kotlin.jvm.internal.o.LJIIIZ(r2, r0)
                                    r2.LJJLIIIIJ()
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C31521Lo.LIZ(X.1mU):void");
                            }
                        }
                        r3.LJJIJIIJIL()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C31531Lp.LIZ(X.0X9, X.0xk):X.0SW");
                }
            }
        L16:
            java.lang.Object r0 = r2.l1
            X.0X9 r0 = (X.C0X9) r0
            X.0SW r2 = r1.LIZ(r0, r4)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r4.LJJIIJ(r0)
            boolean r0 = r4.LJIJJ(r2)
            java.lang.Object r1 = r4.LJIILL()
            if (r0 != 0) goto L37
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L3f
        L37:
            X.1wc r1 = new X.1wc
            r1.<init>(r2)
            r4.LJJIII(r1)
        L3f:
            r4.LJJIJIIJIL()
            r4.LJJIJIIJIL()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS180S0200000.invoke$3(kotlin.jvm.internal.IDqS180S0200000, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        C111074Xn.LIZIZ((Number) obj3, (InterfaceC07790Sh) obj, "$this$composed", interfaceC24520xk, -102778667);
        interfaceC24520xk.LJJIIJ(773894976);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJIILL == c24490xh) {
            LJIILL = new C35821as(C24610xt.LJII(MBB.INSTANCE, interfaceC24520xk));
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJIILL).LJLIL;
        interfaceC24520xk.LJJIJIIJIL();
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIILL2 == c24490xh) {
            LJIILL2 = C78966Uyw.LJJJIL(null);
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL2;
        InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL((InterfaceC88472Yns) iDqS180S0200000.l0, interfaceC24520xk);
        C1OH c1oh = (C1OH) iDqS180S0200000.l1;
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(interfaceC35811ar) | interfaceC24520xk.LJIJJ(c1oh);
        Object LJIILL3 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL3 == c24490xh) {
            LJIILL3 = new IDqS172S0200000(interfaceC35811ar, (InterfaceC35811ar<C1OF>) c1oh, (C1OH) 66);
            interfaceC24520xk.LJJIII(LJIILL3);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C24610xt.LIZIZ(c1oh, (InterfaceC88472Yns) LJIILL3, interfaceC24520xk);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        C1OH c1oh2 = (C1OH) iDqS180S0200000.l1;
        InterfaceC07790Sh LIZIZ = C11F.LIZIZ(c1m1, c1oh2, new C2FM(interfaceC70422pa, interfaceC35811ar, c1oh2, LJJJJIZL, null));
        interfaceC24520xk.LJJIJIIJIL();
        return LIZIZ;
    }

    public static final Object invoke$5(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        C0VD spanStyle = (C0VD) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        o.LJIIIZ(spanStyle, "spanStyle");
        Spannable spannable = (Spannable) iDqS180S0200000.l0;
        InterfaceC88474Ynu interfaceC88474Ynu = (InterfaceC88474Ynu) iDqS180S0200000.l1;
        AbstractC13490fx abstractC13490fx = spanStyle.LJFF;
        C13640gC c13640gC = spanStyle.LIZJ;
        if (c13640gC == null) {
            c13640gC = C13640gC.LJLJJLL;
        }
        C13570g5 c13570g5 = spanStyle.LIZLLL;
        if (c13570g5 != null) {
            i = c13570g5.LIZ;
        } else {
            i = 0;
        }
        C13570g5 c13570g52 = new C13570g5(i);
        C13590g7 c13590g7 = spanStyle.LJ;
        if (c13590g7 != null) {
            i2 = c13590g7.LIZ;
        } else {
            i2 = 1;
        }
        final Typeface typeface = (Typeface) interfaceC88474Ynu.invoke(abstractC13490fx, c13640gC, c13570g52, new C13590g7(i2));
        spannable.setSpan(new MetricAffectingSpan(typeface) { // from class: X.0bF
            public final Typeface LJLIL;

            {
                o.LJIIIZ(typeface, "typeface");
                this.LJLIL = typeface;
            }

            @Override // android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setTypeface(this.LJLIL);
            }

            @Override // android.text.style.MetricAffectingSpan
            public final void updateMeasureState(TextPaint paint) {
                o.LJIIIZ(paint, "paint");
                paint.setTypeface(this.LJLIL);
            }
        }, intValue, intValue2, 33);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        C111074Xn.LIZIZ((Number) obj3, (InterfaceC07790Sh) obj, "$this$composed", interfaceC24520xk, 759876635);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDqS180S0200000.l0;
        interfaceC24520xk.LJJIIJ(-1589795249);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        Object obj4 = C24500xi.LIZIZ;
        if (LJIILL == obj4) {
            LJIILL = C78966Uyw.LJIJI(interfaceC65784Pro);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC24760y8 interfaceC24760y8 = (InterfaceC24760y8) LJIILL;
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIILL2 == obj4) {
            LJIILL2 = new C07070Pn(new C10370av(((C10370av) interfaceC24760y8.getValue()).LIZ), C20300qw.LIZIZ, new C10370av(C20300qw.LIZJ));
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C07070Pn c07070Pn = (C07070Pn) LJIILL2;
        C24610xt.LJ(C76800UCe.LIZ, new C2FW(interfaceC24760y8, c07070Pn, null), interfaceC24520xk);
        C1JK<T, V> c1jk = c07070Pn.LIZJ;
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDqS180S0200000.l1;
        interfaceC24520xk.LJJIIJ(1157296644);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(c1jk);
        Object LJIILL3 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL3 == obj4) {
            LJIILL3 = new IDqS420S0100000(c1jk, 156);
            interfaceC24520xk.LJJIII(LJIILL3);
        }
        interfaceC24520xk.LJJIJIIJIL();
        Object invoke = interfaceC88472Yns.invoke(LJIILL3);
        interfaceC24520xk.LJJIJIIJIL();
        return invoke;
    }

    public static final Object invoke$7(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", (C24570xp) obj2, "<anonymous parameter 1>", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) iDqS180S0200000.l0;
        Object obj4 = iDqS180S0200000.l1;
        Trace.beginSection("change:blockOp");
        try {
            interfaceC88471Ynr.invoke(interfaceC24420xa.LIZ(), obj4);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$8(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C24570xp c24570xp = (C24570xp) obj2;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", c24570xp, "slots", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        C76732zl c76732zl = (C76732zl) iDqS180S0200000.l0;
        C24400xY c24400xY = (C24400xY) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:positionToInsert");
        try {
            c76732zl.element = C35931b3.LJJIJL(c24570xp, c24400xY, interfaceC24420xa);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$9(IDqS180S0200000 iDqS180S0200000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C24570xp c24570xp = (C24570xp) obj2;
        InterfaceC24350xT interfaceC24350xT = (InterfaceC24350xT) obj3;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", c24570xp, "slots", interfaceC24350xT, "rememberManager");
        C76732zl c76732zl = (C76732zl) iDqS180S0200000.l0;
        List list = (List) iDqS180S0200000.l1;
        Trace.beginSection("composeChange:offsetChanges");
        try {
            int i = c76732zl.element;
            if (i > 0) {
                interfaceC24420xa = new C35851av(interfaceC24420xa, i);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC88473Ynt) list.get(i2)).invoke(interfaceC24420xa, c24570xp, interfaceC24350xT);
            }
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
