package defpackage;

import X.AbstractC65781Prl;
import X.C252709vu;
import X.C76800UCe;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class r1 {

    /* loaded from: classes5.dex */
    public final class a extends AbstractC65781Prl implements InterfaceC88472Yns<Context, C252709vu> {
        public static final a LJLIL = new a();

        public a() {
            super(1);
        }

        @Override // X.InterfaceC88472Yns
        public final C252709vu invoke(Context context) {
            Context it = context;
            o.LJIIIZ(it, "it");
            return new C252709vu(it, null, 6);
        }
    }

    /* loaded from: classes5.dex */
    public final class c extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
        public final /* synthetic */ boolean LJLIL;
        public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
        public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
        public final /* synthetic */ int LJLJJI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, int i) {
            super(2);
            this.LJLIL = z;
            this.LJLILLLLZI = interfaceC65784Pro;
            this.LJLJI = interfaceC65784Pro2;
            this.LJLJJI = i;
        }

        @Override // X.InterfaceC88471Ynr
        public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
            num.intValue();
            r1.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC24520xk, this.LJLJJI | 1);
            return C76800UCe.LIZ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r6 == X.C24500xi.LIZIZ) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(boolean r13, X.InterfaceC65784Pro<X.C76800UCe> r14, X.InterfaceC65784Pro<X.C76800UCe> r15, X.InterfaceC24520xk r16, int r17) {
        /*
            java.lang.String r0 = "onTouchReload"
            r8 = r14
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "onTouchDismiss"
            r9 = r15
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r0 = -371746030(0xffffffffe9d79b12, float:-3.2581419E25)
            r1 = r16
            X.1b3 r15 = r1.LJIL(r0)
            r2 = r17
            r0 = r2 & 14
            r6 = 4
            r4 = 2
            r10 = r13
            if (r0 != 0) goto L83
            boolean r0 = r15.LJI(r10)
            if (r0 == 0) goto L81
            r1 = 4
        L25:
            r1 = r1 | r2
        L26:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L33
            boolean r0 = r15.LJIJJ(r8)
            if (r0 == 0) goto L7e
            r0 = 32
        L32:
            r1 = r1 | r0
        L33:
            r0 = r2 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L40
            boolean r0 = r15.LJIJJ(r9)
            if (r0 == 0) goto L7b
            r0 = 256(0x100, float:3.59E-43)
        L3f:
            r1 = r1 | r0
        L40:
            r1 = r1 & 731(0x2db, float:1.024E-42)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L4c
            boolean r0 = r15.LIZ()
            if (r0 != 0) goto Lab
        L4c:
            r0 = 2131847900(0x7f116adc, float:1.932929E38)
            java.lang.String r7 = X.V2B.LJIILLIIL(r0, r15)
            r1$a r12 = r1.a.LJLIL
            r13 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r3 = 0
            r5[r3] = r0
            r0 = 1
            r5[r0] = r8
            r5[r4] = r7
            r0 = 3
            r5[r0] = r9
            r0 = -568225417(0xffffffffde219177, float:-2.9105543E18)
            r15.LJJIIJ(r0)
            r4 = 0
            r1 = 0
        L6f:
            r0 = r5[r4]
            boolean r0 = r15.LJIJJ(r0)
            r1 = r1 | r0
            int r4 = r4 + 1
            if (r4 >= r6) goto L85
            goto L6f
        L7b:
            r0 = 128(0x80, float:1.8E-43)
            goto L3f
        L7e:
            r0 = 16
            goto L32
        L81:
            r1 = 2
            goto L25
        L83:
            r1 = r2
            goto L26
        L85:
            java.lang.Object r6 = r15.LJJJZ()
            if (r1 != 0) goto L94
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r6 != r0) goto L9d
        L94:
            kotlin.jvm.internal.AqS6S1210000_4 r6 = new kotlin.jvm.internal.AqS6S1210000_4
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            r15.LJLJLLL(r6)
        L9d:
            r15.LJJJJJ(r3)
            X.Yns r6 = (X.InterfaceC88472Yns) r6
            r16 = 6
            r17 = 2
            r14 = r6
            X.C24920yO.LIZ(r12, r13, r14, r15, r16, r17)
            goto Lae
        Lab:
            r15.LIZLLL()
        Lae:
            X.1b9 r1 = r15.LJJJJLI()
            if (r1 != 0) goto Lb5
        Lb4:
            return
        Lb5:
            r1$c r0 = new r1$c
            r0.<init>(r10, r8, r9, r2)
            r1.LIZLLL = r0
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1.LIZ(boolean, X.Pro, X.Pro, X.0xk, int):void");
    }
}
