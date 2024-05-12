package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SKe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71912SKe extends AbstractC71915SKh {
    public final SL4 LIZIZ;
    public boolean LIZJ;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return C71912SKe.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71912SKe(SL4 builder) {
        super(builder);
        o.LJIIIZ(builder, "builder");
        this.LIZIZ = builder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r2.intValue() != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    @Override // X.AbstractC71915SKh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.AI8 r6) {
        /*
            r5 = this;
            X.AI9 r0 = r6.getAccessory()
            boolean r0 = r0 instanceof X.C25991AHz
            if (r0 != 0) goto L19
            X.AHz r2 = new X.AHz
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = "tuxTextCell.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r6.setAccessory(r2)
        L19:
            X.SL4 r0 = r5.LIZIZ
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LJIILIIL
            r4 = 1
            if (r0 == 0) goto L2c
            java.lang.Object r2 = r0.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.SL4 r0 = r5.LIZIZ
            int r1 = r0.LJIILLIIL
            if (r2 != 0) goto L8c
        L2c:
            r0 = 0
        L2d:
            r6.setLoading(r0)
            X.AI9 r3 = r6.getAccessory()
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio"
            kotlin.jvm.internal.o.LJII(r3, r0)
            X.AEY r3 = (X.AEY) r3
            X.SL4 r0 = r5.LIZIZ
            X.SOw r1 = r0.LJIILL
            if (r1 == 0) goto L73
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LJIILIIL
            if (r0 == 0) goto L71
            java.lang.Object r0 = r0.getValue()
        L49:
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
        L53:
            r3.LJIILIIL(r4)
            X.SL4 r0 = r5.LIZIZ
            X.Pro<X.UCe> r0 = r0.LJIIIZ
            r3.LJFF(r0)
            kotlin.jvm.internal.AqS162S0100000_12 r1 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 1124(0x464, float:1.575E-42)
            r1.<init>(r5, r0)
            r3.LJIILJJIL(r1)
            Y.IDCListenerS208S0100000_12 r1 = new Y.IDCListenerS208S0100000_12
            r0 = 0
            r1.<init>(r5, r0)
            r3.LJIILL(r1)
            return
        L71:
            r0 = 0
            goto L49
        L73:
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LJIILIIL
            if (r0 == 0) goto L83
            java.lang.Object r2 = r0.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.SL4 r0 = r5.LIZIZ
            int r1 = r0.LJIILLIIL
            if (r2 != 0) goto L85
        L83:
            r4 = 0
            goto L53
        L85:
            int r0 = r2.intValue()
            if (r0 != r1) goto L83
            goto L53
        L8c:
            int r0 = r2.intValue()
            if (r0 != r1) goto L2c
            X.SL4 r0 = r5.LIZIZ
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = r0.LJIILJJIL
            if (r0 == 0) goto L2c
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71912SKe.LJIIIIZZ(X.AI8):void");
    }
}
