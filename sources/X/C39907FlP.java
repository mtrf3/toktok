package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FlP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39907FlP implements InterfaceC39901FlJ {
    @Override // X.InterfaceC39901FlJ
    public final void LIZ(C61295O3v response) {
        o.LJIIIZ(response, "response");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r4 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r4 = (java.lang.String[]) ujb.s.LJLJJL(X.C31461Li.LIZJ("forest_switch_ttnet_allow_list", "", "getInstance().getStringV…ngs::class.java\n        )"), new java.lang.String[]{","}, 0, 6).toArray(new java.lang.String[0]);
        X.C39908FlQ.LIZ = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        r3 = r4.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r2 >= r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r1 = r4[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if ((!ujb.o.LJJJJJL(r1)) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (ujb.o.LJJJJIZL(r8.getChannel(), r1, true) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (ujb.s.LJJJLZIJ(r7, r1, true) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        r0 = X.EnumC39910FlS.Downloader;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r8.setNetWorker(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        r0 = X.EnumC39910FlS.TTNet;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r8.getNetWorker() == X.EnumC39910FlS.TTNet) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r1.booleanValue() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r1.booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        r4 = X.C39908FlQ.LIZ;
     */
    @Override // X.InterfaceC39901FlJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r7, com.bytedance.forest.model.RequestParams r8) {
        /*
            r6 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.String r0 = "requestParams"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "forest_switch_ttnet"
            r3 = 0
            int r1 = X.Q7K.LIZIZ(r0, r3)
            r0 = -1
            r5 = 1
            if (r1 == r0) goto L85
            if (r1 == 0) goto L8a
            if (r1 == r5) goto L82
            java.lang.Boolean r1 = r8.getNeedLocalFile()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L8a
        L2d:
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L76
        L33:
            java.lang.String[] r4 = X.C39908FlQ.LIZ
            if (r4 != 0) goto L56
            java.lang.String r2 = "forest_switch_ttnet_allow_list"
            java.lang.String r1 = ""
            java.lang.String r0 = "getInstance().getStringV…ngs::class.java\n        )"
            java.lang.String r2 = X.C31461Li.LIZJ(r2, r1, r0)
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r1 = ujb.s.LJLJJL(r2, r1, r3, r0)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r4 = r1.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            X.C39908FlQ.LIZ = r4
        L56:
            int r3 = r4.length
            r2 = 0
        L58:
            if (r2 >= r3) goto L7f
            r1 = r4[r2]
            boolean r0 = ujb.o.LJJJJJL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L7c
            java.lang.String r0 = r8.getChannel()
            boolean r0 = ujb.o.LJJJJIZL(r0, r1, r5)
            if (r0 != 0) goto L74
            boolean r0 = ujb.s.LJJJLZIJ(r7, r1, r5)
            if (r0 == 0) goto L7c
        L74:
            if (r1 == 0) goto L7f
        L76:
            X.FlS r0 = X.EnumC39910FlS.TTNet
        L78:
            r8.setNetWorker(r0)
            return
        L7c:
            int r2 = r2 + 1
            goto L58
        L7f:
            X.FlS r0 = X.EnumC39910FlS.Downloader
            goto L78
        L82:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L87
        L85:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L87:
            if (r1 == 0) goto L8a
            goto L2d
        L8a:
            X.FlS r1 = r8.getNetWorker()
            X.FlS r0 = X.EnumC39910FlS.TTNet
            if (r1 != r0) goto L33
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39907FlP.LIZIZ(java.lang.String, com.bytedance.forest.model.RequestParams):void");
    }
}
