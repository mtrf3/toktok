package X;

import com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.QAq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66568QAq<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ List<GetRegionResponse.Data> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ CountDownLatch LJII;

    public C66568QAq(int i, int i2, String str, String str2, String str3, List list, CountDownLatch countDownLatch, boolean z) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = str2;
        this.LJFF = i2;
        this.LJI = str3;
        this.LJII = countDownLatch;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    @Override // X.C10I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object then(X.C10K r10) {
        /*
            r9 = this;
            boolean r0 = X.C82544WaS.LJ(r10)
            r7 = 0
            if (r0 == 0) goto L38
            java.lang.Object r0 = r10.LJIIJJI()
            com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse r0 = (com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse) r0
            com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse$Data r0 = r0.data
            if (r0 == 0) goto L2a
            java.lang.String r0 = r0.domain
        L13:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L38
            X.QAr r3 = X.C66569QAr.LIZ
            java.lang.Object r0 = r10.LJIIJJI()
            com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse r0 = (com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse) r0
            com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse$Data r2 = r0.data
            kotlin.jvm.internal.o.LJI(r2)
            java.util.List<com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse$Data> r1 = r9.LIZ
            monitor-enter(r3)
            goto L2c
        L2a:
            r0 = 0
            goto L13
        L2c:
            java.lang.String r0 = "resultList"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)     // Catch: java.lang.Throwable -> L35
            r1.add(r2)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L38:
            r6 = 0
            goto L3c
        L3a:
            monitor-exit(r3)
            r6 = 1
        L3c:
            java.lang.Exception r0 = r10.LJIIJ()
            java.lang.Integer r0 = X.C39584FgC.LIZJ(r0)
            if (r0 == 0) goto L4b
            int r7 = r0.intValue()
        L4b:
            java.lang.String r2 = r9.LIZIZ
            boolean r5 = r9.LIZJ
            java.lang.String r1 = "domain"
            kotlin.jvm.internal.o.LJIIIZ(r2, r1)
            r4 = r6 ^ 1
            X.7qh r3 = new X.7qh
            r3.<init>()
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r3.LIZ
            r0.put(r1, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r3.LIZ
            java.lang.String r0 = "error_code"
            r1.put(r0, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r3.LIZ
            java.lang.String r0 = "bypass_tnc"
            r1.put(r0, r2)
            org.json.JSONObject r1 = r3.LJ()
            java.lang.String r0 = "newBuilder()\n           …e 0)\n            .build()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "monitor_login_ttp_get_region"
            X.Q13.LIZIZ(r0, r4, r1)
            boolean r0 = r9.LIZJ
            if (r0 == 0) goto Lb9
            if (r6 != 0) goto Lb9
            int r1 = r9.LIZLLL
            X.QAu r0 = X.C66572QAu.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.account.network.ttp.TTPSettingsObject r0 = X.C66572QAu.LIZ()
            java.lang.Integer r0 = r0.maxRetryCount
            if (r0 == 0) goto Lb7
            int r0 = r0.intValue()
        L9d:
            if (r1 >= r0) goto Lb9
            java.lang.String r3 = r9.LIZIZ
            java.lang.String r4 = r9.LJ
            int r1 = r9.LJFF
            java.lang.String r5 = r9.LJI
            java.util.concurrent.CountDownLatch r7 = r9.LJII
            java.util.List<com.ss.android.ugc.aweme.account.network.ttp.GetRegionResponse$Data> r6 = r9.LIZ
            boolean r8 = r9.LIZJ
            int r0 = r9.LIZLLL
            int r2 = r0 + 1
            X.C66569QAr.LIZJ(r1, r2, r3, r4, r5, r6, r7, r8)
        Lb4:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lb7:
            r0 = 3
            goto L9d
        Lb9:
            java.util.concurrent.CountDownLatch r0 = r9.LJII
            r0.countDown()
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66568QAq.then(X.10K):java.lang.Object");
    }
}
