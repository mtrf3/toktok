package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PC6 {
    public static volatile PC6 LJ;
    public PCA LIZIZ;
    public final java.util.Map<String, PCA> LIZ = new ConcurrentHashMap();
    public long LIZJ = -1;
    public long LIZLLL = -1;

    public static PC6 LIZIZ() {
        if (LJ == null) {
            synchronized (PC6.class) {
                if (LJ == null) {
                    LJ = new PC6();
                }
            }
        }
        return LJ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(7:74|75|76|77|78|(3:129|130|131)(2:80|(1:127)(2:84|(4:95|(1:126)(1:99)|100|(1:102)(2:103|(2:108|(7:113|(2:121|(1:125))|115|(1:117)|118|(1:120)|94)(1:112))(1:107)))(3:88|(1:92)|94)))|93)(1:5)|6|(3:8|9|10)|13|14|15|(19:17|18|(3:20|21c|27)|33|34|35|(1:37)|38|(1:40)|41|(1:43)|44|(1:46)|47|(1:49)|51|(2:53|(1:55))|56|(5:61|62|63|64|65)(1:68))|72|18|(0)|33|34|35|(0)|38|(0)|41|(0)|44|(0)|47|(0)|51|(0)|56|(1:58)(6:59|61|62|63|64|65)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0082, code lost:
    
        if (X.C47614ImQ.LIZ(r4, "flyme") != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01a2, code lost:
    
        if (X.C36845Ed7.LIZ == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02b2, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02b3, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("header json exception");
        r1.append(r4.toString());
        X.C64028PAy.LIZIZ("APM", X.X1D.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0277 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:35:0x0267, B:37:0x0277, B:38:0x027d, B:40:0x0285, B:41:0x028a, B:43:0x0292, B:44:0x0297, B:46:0x029f, B:47:0x02a4, B:49:0x02ac), top: B:34:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0285 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:35:0x0267, B:37:0x0277, B:38:0x027d, B:40:0x0285, B:41:0x028a, B:43:0x0292, B:44:0x0297, B:46:0x029f, B:47:0x02a4, B:49:0x02ac), top: B:34:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0292 A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:35:0x0267, B:37:0x0277, B:38:0x027d, B:40:0x0285, B:41:0x028a, B:43:0x0292, B:44:0x0297, B:46:0x029f, B:47:0x02a4, B:49:0x02ac), top: B:34:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x029f A[Catch: Exception -> 0x02b2, TryCatch #5 {Exception -> 0x02b2, blocks: (B:35:0x0267, B:37:0x0277, B:38:0x027d, B:40:0x0285, B:41:0x028a, B:43:0x0292, B:44:0x0297, B:46:0x029f, B:47:0x02a4, B:49:0x02ac), top: B:34:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ac A[Catch: Exception -> 0x02b2, TRY_LEAVE, TryCatch #5 {Exception -> 0x02b2, blocks: (B:35:0x0267, B:37:0x0277, B:38:0x027d, B:40:0x0285, B:41:0x028a, B:43:0x0292, B:44:0x0297, B:46:0x029f, B:47:0x02a4, B:49:0x02ac), top: B:34:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC6.LIZJ():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r2 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PCA LIZ(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC6.LIZ(java.lang.String):X.PCA");
    }
}
