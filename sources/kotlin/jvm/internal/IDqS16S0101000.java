package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08370Un;
import X.C1JX;
import X.C24400xY;
import X.C24570xp;
import X.C35991b9;
import X.C43991o3;
import X.C514920j;
import X.C76800UCe;
import X.InterfaceC24350xT;
import X.InterfaceC24390xX;
import X.InterfaceC24420xa;
import X.InterfaceC88473Ynt;
import android.os.Trace;

/* loaded from: classes.dex */
public class IDqS16S0101000 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S0101000(int i, C08370Un c08370Un, int i2) {
        super(3);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c08370Un;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S0101000(int i, C24400xY c24400xY, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = c24400xY;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S0101000(int i, C514920j c514920j, int i2) {
        super(3);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c514920j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS16S0101000(int i, Object obj, int i2) {
        super(3);
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }

    public static final Object invoke$0(IDqS16S0101000 iDqS16S0101000, Object obj, Object obj2, Object obj3) {
        String targetKey = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(targetKey, "targetKey");
        int i = iDqS16S0101000.i1;
        if (booleanValue) {
            i = ((C514920j) iDqS16S0101000.l0).LIZIZ.getInt(targetKey, i);
        } else if (!booleanValue2) {
            i = super/*X.1mf*/.getInt(targetKey, i);
        } else {
            String LJIIZILJ = ((C514920j) iDqS16S0101000.l0).LJIIZILJ(targetKey);
            if (((C514920j) iDqS16S0101000.l0).LIZIZ.contains(LJIIZILJ) && (i = ((C514920j) iDqS16S0101000.l0).LIZIZ.getInt(LJIIZILJ, iDqS16S0101000.i1)) != iDqS16S0101000.i1) {
                ((C514920j) iDqS16S0101000.l0).LJIJI(targetKey, Integer.valueOf(i), new IDqS443S0100000((C514920j) iDqS16S0101000.l0, 24));
            }
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r7 == X.C24500xi.LIZIZ) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e5, code lost:
    
        if (r9 == X.C24500xi.LIZIZ) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.IDqS16S0101000 r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDqS16S0101000.invoke$1(kotlin.jvm.internal.IDqS16S0101000, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(IDqS16S0101000 iDqS16S0101000, Object obj, Object obj2, Object obj3) {
        InterfaceC24420xa interfaceC24420xa = (InterfaceC24420xa) obj;
        C24570xp c24570xp = (C24570xp) obj2;
        C1JX.LJIIIZ(interfaceC24420xa, "applier", c24570xp, "slots", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        C24400xY anchor = (C24400xY) iDqS16S0101000.l0;
        int i = iDqS16S0101000.i1;
        Trace.beginSection("composer:createNode:nodeApplier");
        try {
            o.LJIIIZ(anchor, "anchor");
            Object LJJIII = c24570xp.LJJIII(c24570xp.LIZJ(anchor));
            interfaceC24420xa.LJIIIIZZ();
            interfaceC24420xa.LIZJ(i, LJJIII);
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final Object invoke$3(IDqS16S0101000 iDqS16S0101000, Object obj, Object obj2, Object obj3) {
        C43991o3 c43991o3;
        C24570xp c24570xp = (C24570xp) obj2;
        InterfaceC24350xT interfaceC24350xT = (InterfaceC24350xT) obj3;
        C1JX.LJIIIZ((InterfaceC24420xa) obj, "<anonymous parameter 0>", c24570xp, "slots", interfaceC24350xT, "rememberManager");
        Object obj4 = iDqS16S0101000.l0;
        int i = iDqS16S0101000.i1;
        Trace.beginSection("change:slottable_updatevalue");
        try {
            if (obj4 instanceof InterfaceC24390xX) {
                interfaceC24350xT.LIZJ((InterfaceC24390xX) obj4);
            }
            Object LJJIJIL = c24570xp.LJJIJIL(i, obj4);
            if (LJJIJIL instanceof InterfaceC24390xX) {
                interfaceC24350xT.LIZIZ((InterfaceC24390xX) LJJIJIL);
            } else if ((LJJIJIL instanceof C35991b9) && (c43991o3 = ((C35991b9) LJJIJIL).LIZIZ) != null) {
                C35991b9 c35991b9 = (C35991b9) LJJIJIL;
                c35991b9.LIZIZ = null;
                c35991b9.LJFF = null;
                c35991b9.LJI = null;
                c43991o3.LJLLL = true;
            }
            Trace.endSection();
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
