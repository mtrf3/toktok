package X;

/* renamed from: X.I4s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46030I4s {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01aa, code lost:
    
        if (r3 != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r17, X.I0N r18) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46030I4s.LIZ(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, X.I0N):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a5, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        r6 = r8.creativeModel.reuseSoundAndEffectModel.getEffectId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.sCurPropSource;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
    
        if (X.C78685UuP.LJJJZ(r7.LIZIZ) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r5 = r7.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        r4 = X.C43119Gw7.LIZ();
        r3 = r7.LIZ;
        r2 = new X.C145995oB();
        r2.LJI("creation_id", r8.LJI());
        r2.LJI("shoot_way", r8.shootWay);
        r2.LJI("enter_from", "video_shoot_page");
        r2.LJI("prop_id", r6);
        r2.LJI("prop_selected_from", r5);
        r2.LJI("music_id", r7.LIZJ);
        r2.LIZ(r4 ? 1 : 0, "is_story");
        X.FMX.LJIIL(r3, r2.LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r6.length() != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        if (r6 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (r6.length() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        r0 = r8.recordPresetResource;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        r0 = r0.getEffectId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C46032I4u r7, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "entranceMobData"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "shortVideoContext"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r6 = r7.LIZLLL
            r1 = 0
            if (r6 == 0) goto L15
            int r0 = r6.length()
            if (r0 != 0) goto L33
        L15:
            java.lang.String r6 = r8.presetEffectId
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.isDuetAutoApplyEffectEnabled()
            if (r0 == 0) goto L31
            boolean r0 = r8.LJJJI()
            if (r0 == 0) goto L31
            java.lang.String r6 = r8.fromPropId
        L31:
            if (r6 == 0) goto L39
        L33:
            int r0 = r6.length()
            if (r0 != 0) goto L46
        L39:
            com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource r0 = r8.recordPresetResource
            if (r0 == 0) goto L43
            java.lang.String r0 = r0.getEffectId()
            if (r0 != 0) goto La5
        L43:
            r6 = r9
            if (r9 == 0) goto L4c
        L46:
            int r0 = r6.length()
            if (r0 != 0) goto L54
        L4c:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r8.creativeModel
            com.ss.android.ugc.aweme.creative.model.ReuseSoundAndEffectModel r0 = r0.reuseSoundAndEffectModel
            java.lang.String r6 = r0.getEffectId()
        L54:
            java.lang.String r5 = com.ss.android.ugc.aweme.sticker.model.FaceStickerBean.sCurPropSource
            java.lang.String r0 = r7.LIZIZ
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L60
            java.lang.String r5 = r7.LIZIZ
        L60:
            com.ss.android.ugc.aweme.services.IAVServiceProxy r0 = com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(r1)
            r0.getStoryService()
            boolean r4 = X.C43119Gw7.LIZ()
            java.lang.String r3 = r7.LIZ
            X.5oB r2 = new X.5oB
            r2.<init>()
            java.lang.String r1 = r8.LJI()
            java.lang.String r0 = "creation_id"
            r2.LJI(r0, r1)
            java.lang.String r1 = r8.shootWay
            java.lang.String r0 = "shoot_way"
            r2.LJI(r0, r1)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "video_shoot_page"
            r2.LJI(r1, r0)
            java.lang.String r0 = "prop_id"
            r2.LJI(r0, r6)
            java.lang.String r0 = "prop_selected_from"
            r2.LJI(r0, r5)
            java.lang.String r1 = r7.LIZJ
            java.lang.String r0 = "music_id"
            r2.LJI(r0, r1)
            java.lang.String r0 = "is_story"
            r2.LIZ(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.LIZ
            X.FMX.LJIIL(r3, r0)
            return
        La5:
            r9 = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46030I4s.LIZIZ(X.I4u, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):void");
    }
}
