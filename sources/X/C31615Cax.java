package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog;

/* renamed from: X.Cax, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31615Cax implements InterfaceC18450nx {
    public final /* synthetic */ SubscriptionGiftSendDialog LIZ;

    public C31615Cax(SubscriptionGiftSendDialog subscriptionGiftSendDialog) {
        this.LIZ = subscriptionGiftSendDialog;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r1 != null) goto L24;
     */
    @Override // X.InterfaceC18450nx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1Z5 r11) {
        /*
            r10 = this;
            java.util.Map<java.lang.String, com.bytedance.android.live.iap.model.response.iap.IapProductDetail> r0 = r11.LIZLLL
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L54
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L13:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r8 = r9.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r0 = r8.getValue()
            com.bytedance.android.live.iap.model.response.iap.IapProductDetail r0 = (com.bytedance.android.live.iap.model.response.iap.IapProductDetail) r0
            X.1a9 r0 = r0.oneTimePurchaseProduct
            if (r0 == 0) goto L31
            long r0 = r0.priceAmountMicros
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r7 != 0) goto L3d
        L31:
            java.lang.Object r1 = r8.getKey()
            java.lang.Object r0 = r8.getValue()
            r5.put(r1, r0)
            goto L13
        L3d:
            long r3 = r7.longValue()
            r1 = 111000000(0x69db9c0, double:5.48412867E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L13
            long r3 = r7.longValue()
            r1 = 111110000(0x69f6770, double:5.4895634E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L31
        L54:
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog r0 = r10.LIZ
            X.Cay r1 = r0.LJLLILLLL
            if (r1 == 0) goto L9f
            X.Cb1 r0 = r1.LJLJJL
            if (r0 == 0) goto L64
            X.1Z5 r0 = r0.LIZIZ
            if (r0 != 0) goto L97
        L62:
            if (r1 == 0) goto L9f
        L64:
            X.Cb1 r5 = r1.LJLJJL
            if (r5 == 0) goto L9f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List<webcast.api.sub.GiftSubTemplateInfo> r0 = r5.LIZ
            java.util.Iterator r3 = r0.iterator()
        L73:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r2 = r3.next()
            webcast.api.sub.GiftSubTemplateInfo r2 = (webcast.api.sub.GiftSubTemplateInfo) r2
            X.1Z5 r0 = r5.LIZIZ
            java.util.Map<java.lang.String, com.bytedance.android.live.iap.model.response.iap.IapProductDetail> r0 = r0.LIZLLL
            if (r0 == 0) goto L73
            java.util.Set r1 = r0.keySet()
            if (r1 == 0) goto L73
            java.lang.String r0 = r2.iapId
            boolean r0 = r1.contains(r0)
            if (r0 != r6) goto L73
            r4.add(r2)
            goto L73
        L97:
            if (r5 != 0) goto L9a
            return
        L9a:
            r0.LIZLLL = r5
            goto L62
        L9d:
            r5.LIZ = r4
        L9f:
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog r0 = r10.LIZ
            X.Cay r0 = r0.LJLLILLLL
            if (r0 == 0) goto La8
            r0.notifyDataSetChanged()
        La8:
            com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog r0 = r10.LIZ
            r0.xl()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31615Cax.LIZ(X.1Z5):void");
    }

    @Override // X.InterfaceC18450nx
    public final void LIZIZ(C21240sS c21240sS) {
        SubscriptionGiftSendDialog subscriptionGiftSendDialog = this.LIZ;
        subscriptionGiftSendDialog.getClass();
        C31620Cb2.LIZ(c21240sS.LIZ, subscriptionGiftSendDialog.getContext());
        C223338pd c223338pd = subscriptionGiftSendDialog.LJLJI;
        if (c223338pd != null) {
            c223338pd.setVisibility(8);
        }
        C223338pd c223338pd2 = subscriptionGiftSendDialog.LJLJI;
        if (c223338pd2 != null) {
            c223338pd2.LIZJ();
        }
        BEQ beq = subscriptionGiftSendDialog.LJLJJI;
        if (beq != null) {
            beq.LIZJ();
        }
    }
}
