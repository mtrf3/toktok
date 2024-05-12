package X;

/* renamed from: X.UiZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77951UiZ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data LIZ(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r4 = 0
            if (r0 == 0) goto L8
            return r4
        L8:
            com.google.gson.o r0 = new com.google.gson.o     // Catch: java.lang.Exception -> L6f
            r0.<init>()     // Catch: java.lang.Exception -> L6f
            com.google.gson.j r0 = com.google.gson.o.LIZ(r5)     // Catch: java.lang.Exception -> L6f
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> L6f
            java.lang.String r0 = "status_code"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L24
            int r0 = r0.LJIILJJIL()     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L24
            return r4
        L24:
            java.lang.String r0 = "data"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L6f
            com.google.gson.m r2 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> L6f
            com.google.gson.Gson r1 = X.C09650Zl.LIZJ     // Catch: java.lang.Exception -> L6f
            java.lang.Class<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data> r0 = com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data.class
            java.lang.Object r3 = r1.LIZJ(r2, r0)     // Catch: java.lang.Exception -> L6f
            if (r3 == 0) goto L41
            r0 = r3
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r0     // Catch: java.lang.Exception -> L70
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r0.rankView     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L4a
        L41:
            r0 = r3
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r0     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L47
            goto L70
        L47:
            r0.lynxRankView = r4     // Catch: java.lang.Exception -> L70
            goto L70
        L4a:
            java.lang.String r0 = "lynx_rank_view"
            com.google.gson.j r0 = r2.LJJIJ(r0)     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L6a
            com.google.gson.m r1 = r0.LJIIZILJ()     // Catch: java.lang.Exception -> L70
            java.lang.String r0 = "lynx_rank_data"
            com.google.gson.j r0 = r1.LJJIJ(r0)     // Catch: java.lang.Exception -> L70
            if (r0 == 0) goto L6a
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> L70
        L62:
            r0 = r3
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r0 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r0     // Catch: java.lang.Exception -> L70
            webcast.api.ranklist.LynxRankView r0 = r0.lynxRankView     // Catch: java.lang.Exception -> L70
            if (r0 != 0) goto L6c
            goto L70
        L6a:
            r1 = r4
            goto L62
        L6c:
            r0.LIZ = r1     // Catch: java.lang.Exception -> L70
            goto L70
        L6f:
            r3 = r4
        L70:
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data r3 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.Data) r3
            if (r3 == 0) goto La5
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r3.rankView
            if (r0 == 0) goto L95
            java.util.List<com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo> r0 = r0.ranks
            if (r0 == 0) goto L95
            java.util.Iterator r2 = r0.iterator()
        L80:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r1 = r2.next()
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r1 = (com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo) r1
            com.bytedance.android.live.base.model.user.User r0 = r1.rankUser
            if (r0 == 0) goto L80
            r1.user = r0
            r1.rankUser = r4
            goto L80
        L95:
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView r0 = r3.rankView
            if (r0 == 0) goto La5
            com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankInfo r1 = r0.ownerRank
            if (r1 == 0) goto La5
            com.bytedance.android.live.base.model.user.User r0 = r1.rankUser
            if (r0 == 0) goto La5
            r1.user = r0
            r1.rankUser = r4
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77951UiZ.LIZ(java.lang.String):com.bytedance.android.livesdk.rank.list.model.RankListV2Response$Data");
    }
}
