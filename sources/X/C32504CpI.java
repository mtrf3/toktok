package X;

/* renamed from: X.CpI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32504CpI implements InterfaceC32478Cos {
    public final /* synthetic */ C32500CpE LIZ;

    public C32504CpI(C32500CpE c32500CpE) {
        this.LIZ = c32500CpE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    @Override // X.InterfaceC32478Cos
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.gift.model.GiftListResult r12, int r13) {
        /*
            r11 = this;
            X.CpE r6 = r11.LIZ
            r6.LLIFFJFJJ = r12
            if (r12 == 0) goto La2
            X.CpL r7 = new X.CpL
            r7.<init>()
            long r9 = r6.LJJII()
            com.bytedance.android.livesdk.gift.model.GiftListResult r0 = r6.LLIFFJFJJ
            r2 = 0
            r8 = 1
            r1 = 0
            if (r0 == 0) goto Lbc
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftPage> r0 = r0.giftPages
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            com.bytedance.android.livesdk.gift.model.GiftPage r0 = (com.bytedance.android.livesdk.gift.model.GiftPage) r0
            if (r0 == 0) goto Lbc
            java.util.List<com.bytedance.android.livesdk.model.Gift> r0 = r0.gifts
            if (r0 == 0) goto Lbc
            java.util.Iterator r5 = r0.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lba
            java.lang.Object r4 = r5.next()
            r0 = r4
            com.bytedance.android.livesdk.model.Gift r0 = (com.bytedance.android.livesdk.model.Gift) r0
            long r0 = r0.id
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 != 0) goto L2a
        L3d:
            com.bytedance.android.livesdk.model.Gift r4 = (com.bytedance.android.livesdk.model.Gift) r4
            if (r4 == 0) goto Lbd
            com.bytedance.android.livesdk.model.GiftRandomEffectInfo r0 = r4.randomEffectInfo
        L43:
            r7.LIZJ = r0
            r7.LJII = r4
            X.CmD r3 = X.AbstractC32320CmK.LIZ
            if (r4 == 0) goto Lb7
            long r0 = r4.id
        L4d:
            boolean r0 = r3.LJIIZILJ(r0)
            r7.LJIIL = r0
            com.bytedance.android.livesdk.model.GiftRandomEffectInfo r0 = r7.LIZJ
            if (r0 == 0) goto L6b
            X.CqV r1 = r6.LJLJLJ
            boolean r0 = r1 instanceof X.C32676Cs4
            if (r0 == 0) goto L6b
            X.Cs4 r1 = (X.C32676Cs4) r1
            if (r1 == 0) goto L6b
            int r0 = r1.LJJIJIIJI()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto La5
        L6b:
            com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto La2
            com.bytedance.android.livesdk.gift.model.GiftListResult r0 = r6.LLIFFJFJJ
            if (r0 == 0) goto L7d
            com.bytedance.android.livesdk.gift.model.GiftsInfo r0 = r0.giftsInfo
            if (r0 == 0) goto L7d
            com.bytedance.android.livesdk.model.GiftPanelBanner r2 = r0.liveGoalBanner
        L7d:
            r7.LJIILJJIL = r2
            X.Cor r0 = X.C32502CpG.LIZIZ()
            X.CpT r0 = r0.LIZ
            if (r0 == 0) goto La2
            long r4 = r0.LJLIL
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            X.CsQ r3 = r6.LJJIIJZLJL(r0)
            if (r3 == 0) goto La3
            long r1 = r3.LIZJ()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto La3
        L9b:
            r7.LJIILL = r8
            if (r8 == 0) goto La2
            r6.LJJIJIIJIL(r7, r3)
        La2:
            return
        La3:
            r8 = 0
            goto L9b
        La5:
            int r0 = r0.intValue()
            if (r0 != r8) goto L6b
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            X.CsQ r0 = r6.LJJIIJZLJL(r0)
            r6.LJJIJIIJIL(r7, r0)
            return
        Lb7:
            r0 = -1
            goto L4d
        Lba:
            r4 = r2
            goto L3d
        Lbc:
            r4 = r2
        Lbd:
            r0 = r2
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32504CpI.LIZ(com.bytedance.android.livesdk.gift.model.GiftListResult, int):void");
    }
}
