package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMConvLoadAnalytics$tryReportUnreadPerfEvent$1", f = "IMConvLoadAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3K6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3K5 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3K6(C3K5 c3k5, boolean z, InterfaceC67352kd<? super C3K6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3k5;
        this.LJLILLLLZI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3K6(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (kotlin.jvm.internal.o.LJ(X.C3K5.LJLLL, com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting.DEFAULT) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013d, code lost:
    
        if (kotlin.jvm.internal.o.LJ(X.C3K5.LJLLL, com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting.DEFAULT) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0205 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0231 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0289 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b4 A[Catch: all -> 0x0306, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000e, B:11:0x0014, B:13:0x0028, B:17:0x002d, B:19:0x0050, B:21:0x005f, B:22:0x0066, B:24:0x006b, B:27:0x00ad, B:29:0x00bc, B:31:0x00cb, B:32:0x00d2, B:34:0x00d7, B:38:0x00e6, B:41:0x0101, B:43:0x011a, B:45:0x0129, B:46:0x0130, B:48:0x0135, B:51:0x0177, B:53:0x0186, B:55:0x0195, B:56:0x019c, B:58:0x01a1, B:64:0x01c4, B:66:0x01d9, B:67:0x01de, B:69:0x0205, B:70:0x020a, B:72:0x0231, B:73:0x0236, B:75:0x025d, B:76:0x0262, B:78:0x0289, B:79:0x028e, B:81:0x02b4, B:82:0x02b9, B:85:0x02d7, B:105:0x013f, B:107:0x014e, B:109:0x015d, B:110:0x0164, B:112:0x0169, B:128:0x0075, B:130:0x0084, B:132:0x0093, B:133:0x009a, B:135:0x009f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3K6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
