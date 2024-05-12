package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Mkx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57715Mkx implements InterfaceC57707Mkp<Aweme, String, C57716Mky> {
    public final C57716Mky LIZ;

    @Override // X.InterfaceC57707Mkp
    public final /* bridge */ /* synthetic */ C57716Mky LIZJ() {
        return this.LIZ;
    }

    public C57715Mkx(C57716Mky c57716Mky) {
        this.LIZ = c57716Mky;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // X.InterfaceC57707Mkp
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C57716Mky r10, X.InterfaceC67352kd<? super X.AbstractC57709Mkr<com.ss.android.ugc.aweme.feed.model.Aweme>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C57719Ml1
            if (r0 == 0) goto L22
            r7 = r11
            X.Ml1 r7 = (X.C57719Ml1) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r8 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            java.lang.String r5 = "MUF-LIST REPO"
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            X.Mky r10 = r7.LJLIL
            goto L5d
        L22:
            X.Ml1 r7 = new X.Ml1
            r7.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r8)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "repo.load param:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LJFF(r5, r0)
            r7.LJLIL = r10     // Catch: java.lang.Throwable -> La8
            r7.LJLJJI = r4     // Catch: java.lang.Throwable -> La8
            com.ss.android.ugc.aweme.relation.api.RelationListApiService r3 = com.ss.android.ugc.aweme.relation.api.RelationListApiService.LIZIZ     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = r10.LIZ     // Catch: java.lang.Throwable -> La8
            X.Ml6 r0 = r10.LIZJ     // Catch: java.lang.Throwable -> La8
            int r1 = r0.getValue()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = r10.LIZLLL     // Catch: java.lang.Throwable -> La8
            java.lang.Object r8 = r3.getFriendsNewPosts(r2, r1, r0, r7)     // Catch: java.lang.Throwable -> La8
            if (r8 != r6) goto L60
            return r6
        L5d:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Throwable -> La8
        L60:
            com.ss.android.ugc.aweme.relation.model.FriendsNewPostsItemResponse r8 = (com.ss.android.ugc.aweme.relation.model.FriendsNewPostsItemResponse) r8     // Catch: java.lang.Throwable -> La8
            java.lang.String r3 = r8.nextPageToken     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r1 = r8.hasMore     // Catch: java.lang.Throwable -> La8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La8
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L8a
            boolean r0 = X.C78685UuP.LJJJZ(r3)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L8a
        L74:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r8.awemeList     // Catch: java.lang.Throwable -> La8
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = "repo.load resp:"
            r1.append(r0)     // Catch: java.lang.Throwable -> La8
            r1.append(r8)     // Catch: java.lang.Throwable -> La8
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La8
            X.C221018lt.LJFF(r5, r0)     // Catch: java.lang.Throwable -> La8
            goto L8c
        L8a:
            r4 = 0
            goto L74
        L8c:
            if (r4 == 0) goto L9f
            if (r3 != 0) goto L92
            java.lang.String r3 = ""
        L92:
            X.Mky r0 = X.C57716Mky.LIZ(r10, r3)     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto L9a
            X.OQg r2 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> La8
        L9a:
            X.Mkq r0 = X.C57713Mkv.LIZIZ(r0, r2)     // Catch: java.lang.Throwable -> La8
            goto Lae
        L9f:
            if (r2 != 0) goto La3
            X.OQg r2 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> La8
        La3:
            X.Mks r0 = X.C57713Mkv.LIZ(r2)     // Catch: java.lang.Throwable -> La8
            goto Lae
        La8:
            r1 = move-exception
            X.Mkw r0 = new X.Mkw
            r0.<init>(r1)
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57715Mkx.LIZ(X.Mky, X.2kd):java.lang.Object");
    }
}
