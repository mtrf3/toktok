package X;

import Y.ARunnableS39S0100000_3;
import android.os.Looper;
import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8XF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XF extends C8XD {
    public boolean LJZL;

    @Override // X.C8XD, X.C8XE
    public final void LJIILL() {
        C8XO c8xo;
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            ReusedAssem<? extends C3C8> reusedAssem = this.LJLJI;
            if (reusedAssem != null) {
                C16880lQ.LJLLJ(reusedAssem.getClass());
            }
            c8v8.LIZIZ("assem_unbind_");
        }
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLJI;
        String str = null;
        if ((interfaceC55235Lm3 instanceof C8XO) && (c8xo = (C8XO) interfaceC55235Lm3) != null) {
            c8xo.LLLZIIL();
        }
        super.LJIILL();
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            ReusedAssem<? extends C3C8> reusedAssem2 = this.LJLJI;
            if (reusedAssem2 != null) {
                str = C16880lQ.LJLLJ(reusedAssem2.getClass());
            }
            c8v82.end(str, "assem_unbind_");
        }
    }

    @Override // X.C8XD, X.C8XE
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        if (!this.LJZL) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                C214368bA.LIZ().execute(new ARunnableS39S0100000_3(this, 155));
                return;
            }
            ReusedAssem<? extends C3C8> reusedAssem = this.LJLJI;
            if (reusedAssem != null) {
                reusedAssem.F3();
            }
            this.LJZL = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8XE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.bytedance.assem.arch.reused.ReusedAssem<? extends X.C3C8>, ITEM> void LJI(T r12, X.C8XE r13, ITEM r14, java.util.List<? extends java.lang.Object> r15, X.InterfaceC88472Yns<? super ITEM, X.C76800UCe> r16, X.InterfaceC65784Pro<java.lang.Integer> r17) {
        /*
            r11 = this;
            java.lang.String r0 = "currentHost"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            java.lang.String r0 = "currentProxy"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.util.List r0 = r12.getChildren()
            if (r0 == 0) goto L90
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r5 = r3.next()
            X.8W0 r5 = (X.C8W0) r5
            boolean r0 = r5 instanceof com.bytedance.assem.arch.reused.ReusedAssem
            if (r0 == 0) goto L85
            java.util.concurrent.CopyOnWriteArrayList<X.8XE> r0 = r13.LJLJLLL
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L4c
            java.lang.Object r4 = r2.next()
            r1 = r4
            X.8XE r1 = (X.C8XE) r1
            boolean r0 = r1 instanceof X.C8XF
            if (r0 == 0) goto L2a
            X.Prg r1 = r1.LJLJJI
            java.lang.Class r0 = r5.getClass()
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2a
        L4c:
            boolean r0 = r4 instanceof X.C8XF
            if (r0 == 0) goto L54
            X.8XD r4 = (X.C8XD) r4
            if (r4 != 0) goto L68
        L54:
            X.8XF r4 = new X.8XF
            r4.<init>()
            java.lang.Class r0 = r5.getClass()
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            r4.LJLJJI = r0
            java.util.concurrent.CopyOnWriteArrayList<X.8XE> r0 = r13.LJLJLLL
            r0.add(r4)
        L68:
            r1 = r5
            com.bytedance.assem.arch.reused.ReusedAssem r1 = (com.bytedance.assem.arch.reused.ReusedAssem) r1
            r1.LJLJLJ = r4
            X.Pro<java.lang.Integer> r0 = r11.LJLJJL
            r8 = r15
            r7 = r14
            r4.LJIILLIIL(r8, r1, r7, r0)
            boolean r0 = r5.getHasChildren()
            if (r0 == 0) goto L14
            com.bytedance.assem.arch.reused.ReusedAssem r5 = (com.bytedance.assem.arch.reused.ReusedAssem) r5
            r10 = r17
            r9 = r16
            r6 = r4
            r4.LJI(r5, r6, r7, r8, r9, r10)
            goto L14
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r0.toString()
            r1.<init>(r0)
            throw r1
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8XF.LJI(com.bytedance.assem.arch.reused.ReusedAssem, X.8XE, java.lang.Object, java.util.List, X.Yns, X.Pro):void");
    }
}
