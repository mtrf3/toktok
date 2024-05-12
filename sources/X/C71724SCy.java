package X;

/* renamed from: X.SCy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71724SCy extends C96493qX {
    public final /* synthetic */ C71723SCx LJLJJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71724SCy(X.C71723SCx r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            r2.LJLJJL = r3
            android.widget.EditText r4 = (android.widget.EditText) r4
            java.lang.String r0 = "inputWithIndicatorEditText"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            r1 = 4
            java.lang.String r0 = " "
            r2.<init>(r4, r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71724SCy.<init>(X.SCx, android.view.View, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L35;
     */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            java.lang.String r0 = "s"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            r0 = 1
            if (r1 == 0) goto Lee
            X.SCx r1 = r7.LJLJJL
            java.lang.String r0 = ""
            r1.setInputType(r0)
        L13:
            X.16n r1 = X.C22780uw.LIZ
            X.SCx r0 = r7.LJLJJL
            java.util.List r0 = r0.getValue()
            r2 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            java.lang.String r0 = r0.getParamValue()
            X.0wz r0 = r1.LIZIZ(r0)
            r6 = 0
            if (r0 == 0) goto Leb
            java.lang.String r5 = r0.LJI
        L2f:
            X.SCx r0 = r7.LJLJJL
            r0.LJFF(r5)
            X.SCx r0 = r7.LJLJJL
            java.lang.String r0 = r0.getCurrentPaymentId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 != 0) goto L6b
            X.SCx r0 = r7.LJLJJL
            X.Yns r4 = r0.getOnPaymentMethodIdentify()
            X.SCx r0 = r7.LJLJJL
            java.util.List r0 = r0.getPaymentList()
            if (r0 == 0) goto L68
            java.util.Iterator r3 = r0.iterator()
        L52:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r0 = r0.id
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto L52
            r6 = r1
        L68:
            r4.invoke(r6)
        L6b:
            X.SCx r0 = r7.LJLJJL
            r0.setCurrentPaymentId(r5)
            X.SCx r0 = r7.LJLJJL
            X.Yns r1 = r0.getOnValueChange()
            X.SCx r0 = r7.LJLJJL
            java.util.List r0 = r0.getValue()
            r1.invoke(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r3 = 8
            r1 = 2131368293(0x7f0a1965, float:1.8356532E38)
            if (r0 == 0) goto Ld6
            X.SCx r0 = r7.LJLJJL
            android.view.View r0 = r0.LIZIZ(r1)
            r0.setVisibility(r3)
            X.SCx r0 = r7.LJLJJL
            X.Yns r1 = r0.getOnDeleteIconVisibleChange()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.invoke(r0)
        L9e:
            X.SCx r0 = r7.LJLJJL
            android.view.View r1 = r0.getOcrView()
            if (r1 != 0) goto Lb8
        La6:
            X.SCx r0 = r7.LJLJJL
            java.lang.String r0 = r0.getCurrentPaymentId()
            if (r0 == 0) goto Lb7
            X.SCx r1 = r7.LJLJJL
            java.lang.String r0 = r1.getCurrentPaymentId()
            r1.LJFF(r0)
        Lb7:
            return
        Lb8:
            boolean r0 = X.C52969Kqb.LIZ()
            if (r0 == 0) goto Ld3
            X.B1x r0 = X.C28121B1x.LIZ
            r0.getClass()
            boolean r0 = X.C28121B1x.LIZ()
            if (r0 != 0) goto Lcf
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto Ld3
        Lcf:
            r1.setVisibility(r2)
            goto La6
        Ld3:
            r2 = 8
            goto Lcf
        Ld6:
            X.SCx r0 = r7.LJLJJL
            android.view.View r0 = r0.LIZIZ(r1)
            r0.setVisibility(r2)
            X.SCx r0 = r7.LJLJJL
            X.Yns r1 = r0.getOnDeleteIconVisibleChange()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0)
            goto L9e
        Leb:
            r5 = r6
            goto L2f
        Lee:
            if (r10 == r0) goto Lf2
            if (r11 != r0) goto L13
        Lf2:
            X.SCx r1 = r7.LJLJJL
            java.lang.String r0 = "normal"
            r1.setInputType(r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71724SCy.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
