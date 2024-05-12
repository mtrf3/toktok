package X;

/* renamed from: X.WpW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83478WpW extends AbstractViewOnClickListenerC55470Lpq {
    public final /* synthetic */ C83477WpV LJLJJI;
    public final /* synthetic */ T49 LJLJJL;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractViewOnClickListenerC55470Lpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r9) {
        /*
            r8 = this;
            X.WpV r0 = r8.LJLJJI
            r0.getClass()
            X.WpV r4 = r8.LJLJJI
            X.HkU r0 = r4.LJLILLLLZI
            if (r0 == 0) goto Ld0
            boolean r0 = r0.LJLJI
            r2 = 1
            if (r0 != r2) goto Ld0
            X.T49 r3 = r8.LJLJJL
            int r1 = r3.getAdapterPosition()
            if (r1 < 0) goto L22
            java.util.List<X.Wph> r0 = r4.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 < r0) goto L33
        L22:
            X.WpV r0 = r8.LJLJJI
            X.Wpd r1 = r0.LJLJL
            if (r1 == 0) goto L32
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LJLL
            if (r0 == 0) goto L2f
            r0.getEffect_id()
        L2f:
            r1.LJIJJLI()
        L32:
            return
        L33:
            java.util.List<X.Wph> r0 = r4.LJLJJI
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            X.Wph r5 = (X.C83489Wph) r5
            int r1 = r5.LJI
            r0 = 3
            if (r1 != r0) goto L4a
            r4.LJLLLLLL()
            r4.LJZL(r3)
            r4.notifyDataSetChanged()
            goto L22
        L4a:
            r7 = -1
            if (r1 != r2) goto L59
            r0 = 0
            r4.LJLJI = r0
            int r0 = r4.LJLIL
            if (r0 < 0) goto L57
            r4.notifyItemChanged(r0)
        L57:
            r4.LJLIL = r7
        L59:
            java.util.Map<X.Wph, java.lang.Integer> r0 = r4.LJLJJL
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L99
            r5.LJIIIZ = r7
            java.util.Map<X.Wph, java.lang.Integer> r0 = r4.LJLJJL
            java.lang.Object r0 = r0.remove(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L22
            int r6 = r0.intValue()
            java.util.List<X.Wph> r0 = r4.LJLJJI
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L79:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r2 = r3.next()
            X.Wph r2 = (X.C83489Wph) r2
            int r0 = r2.LJIIIZ
            if (r0 == r7) goto L79
            if (r0 <= r6) goto L79
            int r0 = r0 + (-1)
            r2.LJIIIZ = r0
            java.util.Map<X.Wph, java.lang.Integer> r1 = r4.LJLJJL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r0)
            goto L79
        L99:
            java.util.Map<X.Wph, java.lang.Integer> r0 = r4.LJLJJL
            int r1 = r0.size()
            X.HkU r0 = r4.LJLILLLLZI
            if (r0 == 0) goto Lbb
            int r0 = r0.LJLJJL
            if (r1 != r0) goto Lbb
        La7:
            X.Ynu<java.lang.Boolean, X.Wph, java.util.List<X.IB3>, java.util.Map<X.Wph, java.lang.Integer>, X.UCe> r3 = r4.LJLLLL
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.List r1 = r4.LJLZ()
            java.util.Map<X.Wph, java.lang.Integer> r0 = r4.LJLJJL
            r3.invoke(r2, r5, r1, r0)
            r4.notifyDataSetChanged()
            goto L22
        Lbb:
            java.util.Map<X.Wph, java.lang.Integer> r0 = r4.LJLJJL
            int r0 = r0.size()
            int r2 = r0 + 1
            java.util.Map<X.Wph, java.lang.Integer> r1 = r4.LJLJJL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.put(r5, r0)
            r5.LJIIIZ = r2
        Lce:
            r2 = 0
            goto La7
        Ld0:
            X.T49 r0 = r8.LJLJJL
            r4.LJZL(r0)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C83478WpW.LIZ(android.view.View):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83478WpW(C83477WpV c83477WpV, T49 t49) {
        super(800L);
        this.LJLJJI = c83477WpV;
        this.LJLJJL = t49;
    }
}
