package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MnZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57877MnZ implements InterfaceC57698Mkg {
    public final C57866MnO LIZ;
    public final IMafUserApi LIZIZ;
    public final C55387LoV LIZJ;
    public final C57634Mje LIZLLL;
    public final java.util.Set<String> LJ;

    @Override // X.InterfaceC57707Mkp
    public final void reset() {
        this.LJ.clear();
    }

    @Override // X.InterfaceC57707Mkp
    public final /* bridge */ /* synthetic */ C57634Mje LIZJ() {
        return this.LIZLLL;
    }

    public C57877MnZ(C57866MnO c57866MnO) {
        MafUserApiService apiServer = MafUserApiService.LIZIZ;
        C55387LoV c55387LoV = C54960Lhc.LIZ;
        C57634Mje c57634Mje = new C57634Mje(0, 15);
        o.LJIIIZ(apiServer, "apiServer");
        this.LIZ = c57866MnO;
        this.LIZIZ = apiServer;
        this.LIZJ = c55387LoV;
        this.LIZLLL = c57634Mje;
        this.LJ = new LinkedHashSet();
    }

    @Override // X.InterfaceC57707Mkp
    public final Object LIZ(C57634Mje c57634Mje, InterfaceC67352kd<? super AbstractC57709Mkr<RecUser>> interfaceC67352kd) {
        C57634Mje c57634Mje2 = c57634Mje;
        int i = c57634Mje2.LIZ;
        C57866MnO c57866MnO = this.LIZ;
        if (i >= c57866MnO.LIZIZ || c57634Mje2.LIZIZ >= c57866MnO.LIZLLL) {
            return C57713Mkv.LIZ(C61878OQg.INSTANCE);
        }
        return LJ(c57634Mje2, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0055, B:16:0x005b, B:18:0x0061, B:20:0x0067, B:21:0x006b, B:23:0x0079, B:26:0x0095, B:33:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0055, B:16:0x005b, B:18:0x0061, B:20:0x0067, B:21:0x006b, B:23:0x0079, B:26:0x0095, B:33:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #0 {all -> 0x009a, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0055, B:16:0x005b, B:18:0x0061, B:20:0x0067, B:21:0x006b, B:23:0x0079, B:26:0x0095, B:33:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C57634Mje r8, X.InterfaceC67352kd<? super X.AbstractC57709Mkr<com.ss.android.ugc.aweme.relation.model.RecUser>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C57879Mnb
            if (r0 == 0) goto L22
            r3 = r9
            X.Mnb r3 = (X.C57879Mnb) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r2 = r3.LJLJI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r6 = 1
            if (r0 == 0) goto L30
            if (r0 != r6) goto L28
            X.Mje r8 = r3.LJLILLLLZI
            X.MnZ r1 = r3.LJLIL
            goto L42
        L22:
            X.Mnb r3 = new X.Mnb
            r3.<init>(r7, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r2)
            r3.LJLIL = r7     // Catch: java.lang.Throwable -> L9a
            r3.LJLILLLLZI = r8     // Catch: java.lang.Throwable -> L9a
            r3.LJLJJL = r6     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r7.LJFF(r8, r3)     // Catch: java.lang.Throwable -> L9a
            if (r2 != r1) goto L40
            return r1
        L40:
            r1 = r7
            goto L45
        L42:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L9a
        L45:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r2 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r2     // Catch: java.lang.Throwable -> L9a
            java.lang.String r5 = r2.getNextPageToken()     // Catch: java.lang.Throwable -> L9a
            int r0 = r8.LIZ     // Catch: java.lang.Throwable -> L9a
            int r4 = r0 + 1
            boolean r0 = r2.getHasMore()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L93
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L9a
            if (r0 <= 0) goto L93
            X.MnO r0 = r1.LIZ     // Catch: java.lang.Throwable -> L9a
            int r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L9a
            if (r4 >= r0) goto L93
        L61:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.getLogPb()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L91
            java.lang.String r3 = r0.getImprId()     // Catch: java.lang.Throwable -> L9a
        L6b:
            java.util.List r2 = r2.getUsers()     // Catch: java.lang.Throwable -> L9a
            java.util.Set<java.lang.String> r1 = r1.LJ     // Catch: java.lang.Throwable -> L9a
            int r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> L9a
            java.util.List r3 = LJI(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L95
            int r2 = r8.LIZIZ     // Catch: java.lang.Throwable -> L9a
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L9a
            int r2 = r2 + r0
            int r1 = r8.LIZLLL     // Catch: java.lang.Throwable -> L9a
            java.lang.String r0 = "pageToken"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)     // Catch: java.lang.Throwable -> L9a
            X.Mje r0 = new X.Mje     // Catch: java.lang.Throwable -> L9a
            r0.<init>(r4, r2, r1, r5)     // Catch: java.lang.Throwable -> L9a
            X.Mkq r0 = X.C57713Mkv.LIZIZ(r0, r3)     // Catch: java.lang.Throwable -> L9a
            goto La0
        L91:
            r3 = 0
            goto L6b
        L93:
            r6 = 0
            goto L61
        L95:
            X.Mks r0 = X.C57713Mkv.LIZ(r3)     // Catch: java.lang.Throwable -> L9a
            goto La0
        L9a:
            r1 = move-exception
            X.Mkw r0 = new X.Mkw
            r0.<init>(r1)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57877MnZ.LJ(X.Mje, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C57634Mje r19, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r20) {
        /*
            r18 = this;
            r5 = r20
            boolean r0 = r5 instanceof X.C57880Mnc
            r1 = r18
            if (r0 == 0) goto Lc5
            r0 = r5
            X.Mnc r0 = (X.C57880Mnc) r0
            int r4 = r0.LJLJJI
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto Lc5
            int r4 = r4 - r3
            r0.LJLJJI = r4
        L16:
            java.lang.Object r5 = r0.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r4 = r0.LJLJJI
            r2 = 1
            if (r4 == 0) goto L36
            if (r4 != r2) goto Lcc
            X.MnZ r0 = r0.LJLIL
            X.C141335gf.LIZJ(r5)
        L26:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r5 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r5
            r5.checkValid()
            X.LoV r0 = r0.LIZJ
            r0.LIZIZ()
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            return r5
        L36:
            X.C141335gf.LIZJ(r5)
            X.MnO r4 = r1.LIZ
            java.util.List<? extends X.MqI> r5 = r4.LJ
            java.util.ArrayList r10 = new java.util.ArrayList
            r4 = 10
            int r4 = X.C32I.LJJL(r5, r4)
            r10.<init>(r4)
            java.util.Iterator r6 = r5.iterator()
        L4c:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L65
            java.lang.Object r4 = r6.next()
            X.MqI r4 = (X.EnumC58046MqI) r4
            int r5 = r4.getValue()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            r10.add(r4)
            goto L4c
        L65:
            java.lang.String r11 = ","
            java.lang.String r12 = "["
            java.lang.String r13 = "]"
            r14 = 0
            r15 = 56
            java.lang.String r12 = X.ORZ.LLD(r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r7 = r1.LIZIZ
            X.MnO r4 = r1.LIZ
            X.MnY r4 = r4.LIZ
            int r8 = r4.getValue()
            r6 = r19
            int r9 = r6.LIZLLL
            X.MnO r4 = r1.LIZ
            X.MnY r5 = r4.LIZ
            java.lang.String r4 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r5, r4)
            X.MnY r4 = X.EnumC57876MnY.FYP_POPUP
            if (r5 == r4) goto L91
            X.MnY r4 = X.EnumC57876MnY.INBOX_PROFILE_POPUP
            if (r5 != r4) goto L9b
        L91:
            X.Ol8 r4 = com.ss.android.ugc.aweme.relation.experiment.RecUserDialogOptimizationExp.LIZJ
            java.lang.Object r4 = r4.getValue()
            com.ss.android.ugc.aweme.relation.experiment.RecUserDialogOptimizationExp$RecUserDialogOptimizationConfig r4 = (com.ss.android.ugc.aweme.relation.experiment.RecUserDialogOptimizationExp.RecUserDialogOptimizationConfig) r4
            int r9 = r4.recUserInitialFetchCount
        L9b:
            java.lang.String r10 = r6.LIZJ
            X.LoV r4 = r1.LIZJ
            java.lang.String r11 = r4.LIZJ()
            java.lang.String r4 = "recImprReporter.toReportIds"
            kotlin.jvm.internal.o.LJIIIIZZ(r11, r4)
            X.MnO r4 = r1.LIZ
            java.lang.String r13 = r4.LJI
            r15 = 0
            boolean r16 = X.C1E4.LJIJJLI()
            r17 = 448(0x1c0, float:6.28E-43)
            X.SvC r4 = X.C57891Mnn.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0.LJLIL = r1
            r0.LJLJJI = r2
            java.lang.Object r5 = X.C77318UWc.LIZ(r4, r0)
            if (r5 != r3) goto Lc2
            return r3
        Lc2:
            r0 = r1
            goto L26
        Lc5:
            X.Mnc r0 = new X.Mnc
            r0.<init>(r1, r5)
            goto L16
        Lcc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57877MnZ.LJFF(X.Mje, X.2kd):java.lang.Object");
    }

    public static List LJI(List list, java.util.Set set, String str, int i) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    RecUser recUser = (RecUser) obj;
                    if (!set.contains(recUser.getUid())) {
                        String uid = recUser.getUid();
                        o.LJIIIIZZ(uid, "user.uid");
                        set.add(uid);
                        recUser.setRequestId(str);
                        recUser.setImprOrder(i2 + i);
                        arrayList.add(recUser);
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC57698Mkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(com.ss.android.ugc.aweme.relation.model.RecUser r11, int r12, int r13, X.InterfaceC67352kd r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C57881Mnd
            if (r0 == 0) goto L59
            r9 = r14
            X.Mnd r9 = (X.C57881Mnd) r9
            int r2 = r9.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r9.LJLJI = r2
        L12:
            java.lang.Object r3 = r9.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 != r1) goto L5f
            X.C141335gf.LIZJ(r3)
        L20:
            X.Ee8 r3 = (X.AbstractC36908Ee8) r3
            r3.checkValid()
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L28:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r3 = r10.LIZIZ
            java.lang.String r4 = r11.getUid()
            if (r4 != 0) goto L35
            java.lang.String r4 = ""
        L35:
            java.lang.String r5 = r11.getSecUid()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r12)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r13)
            X.MnO r0 = r10.LIZ
            X.MnY r0 = r0.LIZ
            int r0 = r0.getValue()
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            r9.LJLJI = r1
            java.lang.Object r3 = r3.dislikeUser(r4, r5, r6, r7, r8, r9)
            if (r3 != r2) goto L20
            return r2
        L59:
            X.Mnd r9 = new X.Mnd
            r9.<init>(r10, r14)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57877MnZ.LIZIZ(com.ss.android.ugc.aweme.relation.model.RecUser, int, int, X.2kd):java.lang.Object");
    }
}
