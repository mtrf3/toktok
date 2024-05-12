package X;

import android.graphics.LinearGradient;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS52S0110000_9;

/* renamed from: X.Kyh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53471Kyh extends AbstractC53588L1k<AbstractC53477Kyn, C53592L1o> {
    public final C53592L1o LIZJ;
    public LinearGradient LIZLLL;
    public Float LJ;
    public Float LJFF;

    @Override // X.AbstractC53588L1k
    public final /* bridge */ /* synthetic */ C53592L1o LJFF() {
        return this.LIZJ;
    }

    public C53471Kyh(C53592L1o c53592L1o) {
        this.LIZJ = c53592L1o;
    }

    public static int LJI(boolean z) {
        if (z) {
            return ((Number) C53491Kz1.LIZJ.getValue()).intValue();
        }
        return ((Number) C53491Kz1.LIZLLL.getValue()).intValue();
    }

    @Override // X.AbstractC53588L1k
    public final C53469Kyf LIZ(AbstractC53477Kyn abstractC53477Kyn) {
        C53592L1o c53592L1o = this.LIZJ;
        if (c53592L1o != null && c53592L1o.LJIIJJI) {
            if (abstractC53477Kyn instanceof C53474Kyk) {
                return LJII(false, false);
            }
            return LJII(true, true);
        }
        return null;
    }

    @Override // X.AbstractC53588L1k
    public final C53467Kyd LIZLLL(AbstractC53477Kyn abstractC53477Kyn) {
        if (abstractC53477Kyn instanceof C53538Kzm) {
            return null;
        }
        return new C53467Kyd(C53463KyZ.LIZIZ);
    }

    @Override // X.AbstractC53588L1k
    public final C53468Kye LJ(AbstractC53477Kyn abstractC53477Kyn) {
        C26308AUe c26308AUe;
        int i;
        Integer num;
        C26308AUe c26308AUe2;
        AbstractC53477Kyn abstractC53477Kyn2 = abstractC53477Kyn;
        if (abstractC53477Kyn2 instanceof C53473Kyj) {
            InterfaceC100393wp interfaceC100393wp = ((C53473Kyj) abstractC53477Kyn2).LJLJJI;
            C53592L1o c53592L1o = this.LIZJ;
            if (c53592L1o != null) {
                c26308AUe2 = c53592L1o.LJIIIZ;
            } else {
                c26308AUe2 = null;
            }
            return LJIIIIZZ(this, interfaceC100393wp, -16777216, null, true, c26308AUe2, 4);
        }
        if (abstractC53477Kyn2 instanceof C53472Kyi) {
            InterfaceC100393wp interfaceC100393wp2 = ((C53472Kyi) abstractC53477Kyn2).LJLJJI;
            C53592L1o c53592L1o2 = this.LIZJ;
            if (c53592L1o2 != null && (num = c53592L1o2.LJI) != null) {
                i = num.intValue();
            } else {
                i = R.attr.dw;
            }
            return LJIIIIZZ(this, interfaceC100393wp2, null, Integer.valueOf(i), false, null, 18);
        }
        if (abstractC53477Kyn2 instanceof C53476Kym) {
            InterfaceC100393wp interfaceC100393wp3 = ((C53476Kym) abstractC53477Kyn2).LJLJJL;
            C53592L1o c53592L1o3 = this.LIZJ;
            if (c53592L1o3 != null) {
                c26308AUe = c53592L1o3.LJIIIZ;
            } else {
                c26308AUe = null;
            }
            return LJIIIIZZ(this, interfaceC100393wp3, -16777216, null, true, c26308AUe, 4);
        }
        if (!(abstractC53477Kyn2 instanceof C53474Kyk)) {
            return null;
        }
        return LJIIIIZZ(this, ((C53474Kyk) abstractC53477Kyn2).LJLJJI, Integer.valueOf(C53691L5j.LL), null, false, null, 20);
    }

    public final C53469Kyf LJII(boolean z, boolean z2) {
        return new C53469Kyf(new C53461KyX(new C53513KzN(new C53470Kyg(0, new AqS52S0110000_9(this, z, 6), 5), new C53455KyR(new AqS52S0110000_9(this, z, 7), new AqS52S0110000_9(this, z, 8)), new C53455KyR(C53440KyC.LJLIL, C53441KyD.LJLIL), false, C53494Kz4.LJLIL, new AqS175S0100000_9(this, 574), new C53490Kz0(z, this, z2), true, true, new AqS52S0110000_9(this, z, 9), null, 3080)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        if (r2 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C53468Kye LJIIIIZZ(X.C53471Kyh r11, X.InterfaceC100393wp r12, java.lang.Integer r13, java.lang.Integer r14, boolean r15, X.C26308AUe r16, int r17) {
        /*
            r10 = r16
            r5 = r13
            r6 = r14
            r0 = r17 & 2
            r7 = 0
            if (r0 == 0) goto La
            r5 = r7
        La:
            r0 = r17 & 4
            if (r0 == 0) goto Lf
            r6 = r7
        Lf:
            r0 = r17 & 8
            if (r0 == 0) goto L14
            r15 = 0
        L14:
            r0 = r17 & 16
            if (r0 == 0) goto L19
            r10 = r7
        L19:
            X.L1o r2 = r11.LIZJ
            boolean r0 = r2 instanceof X.C53592L1o
            if (r0 != 0) goto L5f
            X.TMC r1 = new X.TMC
            r1.<init>()
            if (r2 == 0) goto L5a
        L26:
            java.lang.Float r0 = r2.LJIIIIZZ
            if (r0 == 0) goto L5a
            float r3 = r0.floatValue()
        L2e:
            X.Kye r2 = new X.Kye
            X.KyX r1 = new X.KyX
            X.Kyo r4 = new X.Kyo
            if (r15 == 0) goto L3d
            kotlin.jvm.internal.AqS175S0100000_9 r7 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 575(0x23f, float:8.06E-43)
            r7.<init>(r11, r0)
        L3d:
            X.KyM r8 = new X.KyM
            r8.<init>(r3)
            kotlin.jvm.internal.AqS175S0100000_9 r9 = new kotlin.jvm.internal.AqS175S0100000_9
            r0 = 576(0x240, float:8.07E-43)
            r9.<init>(r12, r0)
            if (r10 == 0) goto L58
            r11 = 1
        L4c:
            r12 = 8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.<init>(r4)
            r2.<init>(r1)
            return r2
        L58:
            r11 = 0
            goto L4c
        L5a:
            float r3 = r1.LIZIZ()
            goto L2e
        L5f:
            boolean r0 = r2.LJII
            if (r0 == 0) goto L69
            X.TMC r1 = new X.TMC
            r1.<init>()
            goto L26
        L69:
            X.PkE r1 = new X.PkE
            r1.<init>()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53471Kyh.LJIIIIZZ(X.Kyh, X.3wp, java.lang.Integer, java.lang.Integer, boolean, X.AUe, int):X.Kye");
    }
}
