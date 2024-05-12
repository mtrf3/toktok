package X;

/* loaded from: classes6.dex */
public final class C61 {
    public final C25260yw LIZ;
    public final C25260yw LIZIZ;
    public final C25260yw LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r9 = new X.C25260yw(com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY, r6, r4);
        r10.LIZ = r9;
        r2 = new X.C25260yw(com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD, r8, r5);
        r10.LIZIZ = r2;
        r1 = new X.C25260yw(com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO, r7, r3);
        r10.LIZJ = r1;
        r11.rv0(com.bytedance.android.live.broadcast.banner.ObsBannerWidgetManagerChannel.class, r9);
        r11.rv0(com.bytedance.android.live.broadcast.banner.GameBannerWidgetManagerChannel.class, r2);
        r11.rv0(com.bytedance.android.live.broadcast.banner.LiveStudioBannerWidgetManagerChannel.class, r1);
        r2 = X.X1D.LIZ();
        X.C1EU.LIZJ(r2, "gameBannerCount", r8, "obsBannerCount", r6);
        r2.append("liveStudioBannerCount");
        r2.append(r7);
        r2.append("gameBannerInfoList");
        r2.append(r5.size());
        r2.append("obsBannerInfoList");
        r2.append(r4.size());
        r2.append("liveStudioBannerInfoList");
        r2.append(r3.size());
        X.C0NB.LIZ(X.X1D.LIZIZ(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r3 = new java.util.LinkedList<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r4 = r0.obsBannerInfoList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r5 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        r4 = new java.util.LinkedList<>();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r7 = r0.liveStudioBannerCount;
        r3 = r0.liveStudioBannerInfoList;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61(com.bytedance.ies.sdk.datachannel.DataChannel r11) {
        /*
            r10 = this;
            r10.<init>()
            com.bytedance.android.livesdk.livesetting.game.BannerPriorityJsonSetting r0 = com.bytedance.android.livesdk.livesetting.game.BannerPriorityJsonSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.game.BannerPriorityConfig r0 = r0.getBannerPriorityConfig()
            r7 = 1
            if (r0 == 0) goto L9a
            int r8 = r0.gameBannerCount
            int r6 = r0.obsBannerCount
            java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo> r5 = r0.gameBannerInfoList
            if (r5 != 0) goto L1b
        L14:
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            if (r0 == 0) goto L1f
        L1b:
            java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo> r4 = r0.obsBannerInfoList
            if (r4 != 0) goto L26
        L1f:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            if (r0 == 0) goto L2c
        L26:
            int r7 = r0.liveStudioBannerCount
            java.util.LinkedList<com.bytedance.android.livesdk.livesetting.game.BannerInfo> r3 = r0.liveStudioBannerInfoList
            if (r3 != 0) goto L31
        L2c:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L31:
            X.0yw r9 = new X.0yw
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            r9.<init>(r0, r6, r4)
            r10.LIZ = r9
            X.0yw r2 = new X.0yw
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            r2.<init>(r0, r8, r5)
            r10.LIZIZ = r2
            X.0yw r1 = new X.0yw
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            r1.<init>(r0, r7, r3)
            r10.LIZJ = r1
            java.lang.Class<com.bytedance.android.live.broadcast.banner.ObsBannerWidgetManagerChannel> r0 = com.bytedance.android.live.broadcast.banner.ObsBannerWidgetManagerChannel.class
            r11.rv0(r0, r9)
            java.lang.Class<com.bytedance.android.live.broadcast.banner.GameBannerWidgetManagerChannel> r0 = com.bytedance.android.live.broadcast.banner.GameBannerWidgetManagerChannel.class
            r11.rv0(r0, r2)
            java.lang.Class<com.bytedance.android.live.broadcast.banner.LiveStudioBannerWidgetManagerChannel> r0 = com.bytedance.android.live.broadcast.banner.LiveStudioBannerWidgetManagerChannel.class
            r11.rv0(r0, r1)
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = "gameBannerCount"
            java.lang.String r0 = "obsBannerCount"
            X.C1EU.LIZJ(r2, r1, r8, r0, r6)
            java.lang.String r0 = "liveStudioBannerCount"
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = "gameBannerInfoList"
            r2.append(r0)
            int r0 = r5.size()
            r2.append(r0)
            java.lang.String r0 = "obsBannerInfoList"
            r2.append(r0)
            int r0 = r4.size()
            r2.append(r0)
            java.lang.String r0 = "liveStudioBannerInfoList"
            r2.append(r0)
            int r0 = r3.size()
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            X.C0NB.LIZ(r0)
            return
        L9a:
            r8 = 1
            r6 = 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61.<init>(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
