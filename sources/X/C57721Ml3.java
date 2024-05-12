package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ml3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57721Ml3 implements InterfaceC57699Mkh {
    public final EnumC57876MnY LIZ;
    public final String LIZIZ;
    public final IMafUserApi LIZJ;
    public final C57720Ml2 LIZLLL;
    public final java.util.Set<String> LJ;

    @Override // X.InterfaceC57707Mkp
    public final void reset() {
        this.LJ.clear();
    }

    @Override // X.InterfaceC57707Mkp
    public final /* bridge */ /* synthetic */ C57720Ml2 LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC57699Mkh
    public final void LIZLLL(List<String> list) {
        this.LJ.addAll(list);
    }

    public C57721Ml3(EnumC57876MnY scene, String str) {
        MafUserApiService api = MafUserApiService.LIZIZ;
        C57720Ml2 c57720Ml2 = new C57720Ml2(0);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(api, "api");
        this.LIZ = scene;
        this.LIZIZ = str;
        this.LIZJ = api;
        this.LIZLLL = c57720Ml2;
        this.LJ = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0051, B:16:0x0057, B:18:0x005e, B:19:0x0062, B:20:0x0071, B:22:0x0077, B:25:0x0087, B:31:0x009e, B:34:0x00af, B:40:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0051, B:16:0x0057, B:18:0x005e, B:19:0x0062, B:20:0x0071, B:22:0x0077, B:25:0x0087, B:31:0x009e, B:34:0x00af, B:40:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: all -> 0x00b4, TryCatch #0 {all -> 0x00b4, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0051, B:16:0x0057, B:18:0x005e, B:19:0x0062, B:20:0x0071, B:22:0x0077, B:25:0x0087, B:31:0x009e, B:34:0x00af, B:40:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #0 {all -> 0x00b4, blocks: (B:11:0x0042, B:12:0x0045, B:14:0x0051, B:16:0x0057, B:18:0x005e, B:19:0x0062, B:20:0x0071, B:22:0x0077, B:25:0x0087, B:31:0x009e, B:34:0x00af, B:40:0x0033), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // X.InterfaceC57707Mkp
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C57720Ml2 r10, X.InterfaceC67352kd<? super X.AbstractC57709Mkr<com.ss.android.ugc.aweme.feed.model.Aweme>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C57722Ml4
            if (r0 == 0) goto L22
            r3 = r11
            X.Ml4 r3 = (X.C57722Ml4) r3
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
            r8 = 1
            if (r0 == 0) goto L30
            if (r0 != r8) goto L28
            X.Ml2 r10 = r3.LJLILLLLZI
            X.Ml3 r1 = r3.LJLIL
            goto L42
        L22:
            X.Ml4 r3 = new X.Ml4
            r3.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r2)
            r3.LJLIL = r9     // Catch: java.lang.Throwable -> Lb4
            r3.LJLILLLLZI = r10     // Catch: java.lang.Throwable -> Lb4
            r3.LJLJJL = r8     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r9.LJFF(r10, r3)     // Catch: java.lang.Throwable -> Lb4
            if (r2 != r1) goto L40
            return r1
        L40:
            r1 = r9
            goto L45
        L42:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> Lb4
        L45:
            com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse r2 = (com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse) r2     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r6 = r2.getNextPageToken()     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r2.getHasMore()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L9a
            int r0 = r6.length()     // Catch: java.lang.Throwable -> Lb4
            if (r0 <= 0) goto L9a
        L57:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.getLogPb()     // Catch: java.lang.Throwable -> Lb4
            r7 = 0
            if (r0 == 0) goto L62
            java.lang.String r7 = r0.getImprId()     // Catch: java.lang.Throwable -> Lb4
        L62:
            java.util.List r0 = r2.getAwemeList()     // Catch: java.lang.Throwable -> Lb4
            java.util.Set<java.lang.String> r5 = r1.LJ     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r4.<init>()     // Catch: java.lang.Throwable -> Lb4
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> Lb4
        L71:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L9c
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lb4
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = r2.getAid()     // Catch: java.lang.Throwable -> Lb4
            boolean r0 = r5.contains(r0)     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L71
            java.lang.String r1 = r2.getAid()     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "aid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> Lb4
            r5.add(r1)     // Catch: java.lang.Throwable -> Lb4
            r2.setRequestId(r7)     // Catch: java.lang.Throwable -> Lb4
            r4.add(r2)     // Catch: java.lang.Throwable -> Lb4
            goto L71
        L9a:
            r8 = 0
            goto L57
        L9c:
            if (r8 == 0) goto Laf
            int r1 = r10.LIZIZ     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "pageToken"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)     // Catch: java.lang.Throwable -> Lb4
            X.Ml2 r0 = new X.Ml2     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> Lb4
            X.Mkq r0 = X.C57713Mkv.LIZIZ(r0, r4)     // Catch: java.lang.Throwable -> Lb4
            goto Lba
        Laf:
            X.Mks r0 = X.C57713Mkv.LIZ(r4)     // Catch: java.lang.Throwable -> Lb4
            goto Lba
        Lb4:
            r1 = move-exception
            X.Mkw r0 = new X.Mkw
            r0.<init>(r1)
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57721Ml3.LIZ(X.Ml2, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C57720Ml2 r9, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.model.MaFUserVideoListResponse> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C57723Ml5
            if (r0 == 0) goto L44
            r7 = r10
            X.Ml5 r7 = (X.C57723Ml5) r7
            int r2 = r7.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r7.LJLJI = r2
        L12:
            java.lang.Object r1 = r7.LJLIL
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJI
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 != r5) goto L4a
            X.C141335gf.LIZJ(r1)
        L20:
            X.Ee8 r1 = (X.AbstractC36908Ee8) r1
            r1.checkValid()
            return r1
        L26:
            X.C141335gf.LIZJ(r1)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r4 = r8.LIZJ
            X.MnY r0 = r8.LIZ
            int r3 = r0.getValue()
            java.lang.String r2 = r8.LIZIZ
            int r1 = r9.LIZIZ
            java.lang.String r0 = r9.LIZ
            X.SvC r0 = r4.getMaFVideoList(r3, r2, r1, r0)
            r7.LJLJI = r5
            java.lang.Object r1 = X.C77318UWc.LIZ(r0, r7)
            if (r1 != r6) goto L20
            return r6
        L44:
            X.Ml5 r7 = new X.Ml5
            r7.<init>(r8, r10)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57721Ml3.LJFF(X.Ml2, X.2kd):java.lang.Object");
    }
}
