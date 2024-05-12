package X;

import com.ss.android.ugc.aweme.relation.api.IMafUserApi;
import com.ss.android.ugc.aweme.relation.api.MafUserApiService;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MoE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57918MoE implements InterfaceC57921MoH {
    public final IMafUserApi LIZ;
    public final int LIZIZ;
    public final ConcurrentHashMap<String, List<RecUser>> LIZJ;

    public C57918MoE(int i) {
        MafUserApiService service = MafUserApiService.LIZIZ;
        o.LJIIIZ(service, "service");
        this.LIZ = service;
        this.LIZIZ = 3;
        this.LIZJ = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.InterfaceC57921MoH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC57876MnY r11, com.ss.android.ugc.aweme.relation.model.RecUser r12, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.relation.model.RecUser>> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.C57919MoF
            if (r0 == 0) goto L8c
            r4 = r13
            X.MoF r4 = (X.C57919MoF) r4
            int r2 = r4.LJLJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.LJLJL = r2
        L12:
            java.lang.Object r3 = r4.LJLJJL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJL
            r1 = 1
            if (r0 == 0) goto L59
            if (r0 != r1) goto Ldb
            java.lang.Object r7 = r4.LJLJJI
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            java.lang.Object r6 = r4.LJLJI
            com.ss.android.ugc.aweme.relation.model.RecUser r12 = r4.LJLILLLLZI
            X.MoE r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L2a:
            com.ss.android.ugc.aweme.relation.model.MaFListResponse r3 = (com.ss.android.ugc.aweme.relation.model.MaFListResponse) r3
            java.util.List r0 = r3.getRecMoreUserPairList()
            if (r0 == 0) goto Le3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            r8 = 0
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.relation.model.RecMorePairList r1 = (com.ss.android.ugc.aweme.relation.model.RecMorePairList) r1
            java.lang.String r0 = r1.uid
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r6)
            if (r0 != 0) goto L51
            goto L3b
        L51:
            java.util.List<com.ss.android.ugc.aweme.relation.model.RecUser> r0 = r1.relatedUserList
            if (r0 == 0) goto L3b
            r4.add(r0)
            goto L3b
        L59:
            X.C141335gf.LIZJ(r3)
            java.lang.String r6 = r12.getUid()
            if (r6 != 0) goto L65
            X.OQg r0 = X.C61878OQg.INSTANCE
            return r0
        L65:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.ss.android.ugc.aweme.relation.model.RecUser>> r7 = r10.LIZJ
            java.lang.Object r9 = r7.get(r6)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L75
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto Le8
        L75:
            java.util.List r0 = X.C47261Igj.LJJIJ(r6)
            r4.LJLIL = r10
            r4.LJLILLLLZI = r12
            r4.LJLJI = r6
            r4.LJLJJI = r7
            r4.LJLJL = r1
            java.lang.Object r3 = r10.LIZIZ(r11, r0, r4)
            if (r3 != r2) goto L8a
            return r2
        L8a:
            r5 = r10
            goto L2a
        L8c:
            X.MoF r4 = new X.MoF
            r4.<init>(r10, r13)
            goto L12
        L92:
            java.util.List r0 = X.C32I.LJJLI(r4)
            r5.getClass()
            java.util.HashSet r0 = X.ORZ.LLIZLLLIL(r0)
            java.util.List r9 = X.ORZ.LLJI(r0)
            if (r9 == 0) goto Le3
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r3.getLogPb()
            if (r0 == 0) goto Lad
            java.lang.String r8 = r0.getImprId()
        Lad:
            java.util.Iterator r5 = r9.iterator()
        Lb1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le5
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.relation.model.RecUser r4 = (com.ss.android.ugc.aweme.relation.model.RecUser) r4
            r4.setRequestId(r8)
            X.MfV r3 = new X.MfV
            java.lang.String r2 = r12.getUid()
            if (r2 != 0) goto Lca
            java.lang.String r2 = ""
        Lca:
            int r0 = X.C46104I7o.LJJIII(r12)
            int r1 = r0 + 1
            boolean r0 = X.C46104I7o.LJJIJIL(r12)
            r3.<init>(r2, r1, r0)
            r4.setFrom(r3)
            goto Lb1
        Ldb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Le3:
            X.OQg r9 = X.C61878OQg.INSTANCE
        Le5:
            r7.put(r6, r9)
        Le8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57918MoE.LIZ(X.MnY, com.ss.android.ugc.aweme.relation.model.RecUser, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC57876MnY r16, java.util.List<java.lang.String> r17, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.relation.model.MaFListResponse> r18) {
        /*
            r15 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C57920MoG
            r4 = r15
            if (r0 == 0) goto L5c
            r14 = r3
            X.MoG r14 = (X.C57920MoG) r14
            int r2 = r14.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r14.LJLJI = r2
        L15:
            java.lang.Object r3 = r14.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r14.LJLJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L62
            X.C141335gf.LIZJ(r3)
        L23:
            X.Ee8 r3 = (X.AbstractC36908Ee8) r3
            r3.checkValid()
            java.lang.String r0 = "service.getRelatedUserLi…),\n        ).checkValid()"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            return r3
        L2e:
            X.C141335gf.LIZJ(r3)
            com.ss.android.ugc.aweme.relation.api.IMafUserApi r9 = r4.LIZ
            int r10 = r16.getValue()
            int r11 = r4.LIZIZ
            X.MnS r0 = X.EnumC57870MnS.RECOMMEND_MORE
            int r0 = r0.getValue()
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r0)
            java.lang.String r4 = ","
            java.lang.String r5 = "["
            java.lang.String r6 = "]"
            r7 = 0
            r8 = 56
            r3 = r17
            java.lang.String r13 = X.ORZ.LLD(r3, r4, r5, r6, r7, r8)
            r14.LJLJI = r1
            java.lang.Object r3 = r9.getRelatedUserList(r10, r11, r12, r13, r14)
            if (r3 != r2) goto L23
            return r2
        L5c:
            X.MoG r14 = new X.MoG
            r14.<init>(r4, r3)
            goto L15
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57918MoE.LIZIZ(X.MnY, java.util.List, X.2kd):java.lang.Object");
    }
}
