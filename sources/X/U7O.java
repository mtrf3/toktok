package X;

/* loaded from: classes14.dex */
public final class U7O<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;

    public U7O(U7F u7f, Boolean bool) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.UBW r8 = (X.UBW) r8
            if (r8 == 0) goto L98
            X.U7F r6 = r7.LJLIL
            java.lang.Boolean r5 = r7.LJLILLLLZI
            java.lang.Object r1 = r8.LIZ
            boolean r0 = r1 instanceof X.C28467BFf
            r3 = 0
            java.lang.String r2 = "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse>"
            if (r0 == 0) goto L7d
            if (r1 == 0) goto L9f
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            if (r1 == 0) goto L7d
            int r0 = r1.statusCode
            if (r0 != 0) goto L7d
            java.lang.String r1 = "CoLinker"
            java.lang.String r0 = "updateUserList resp success"
            X.U4R.LIZLLL(r1, r0)
            java.lang.Object r1 = r8.LIZ
            boolean r0 = r1 instanceof X.C28467BFf
            if (r0 == 0) goto L7d
            if (r1 == 0) goto L99
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            if (r1 == 0) goto L7d
            T r0 = r1.data
            com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse r0 = (com.bytedance.android.livesdk.chatroom.interact.model.LinkmicListResponse) r0
            if (r0 == 0) goto L7d
            java.util.List<com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser> r4 = r0.users
            if (r4 == 0) goto L7d
            X.U7H r2 = r6.LJJIIJZLJL()
            long r0 = r6.LJIIIZ
            r2.LJJLIIIJLJLI(r0, r4, r3)
            if (r5 == 0) goto L7d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 == 0) goto L7d
            X.U7r r0 = r6.LJIILLIIL
            int r1 = r0.LIZ
            r0 = 5
            if (r1 != r0) goto L7d
            java.util.Iterator r5 = r4.iterator()
        L56:
            boolean r0 = r5.hasNext()
            r4 = 1
            if (r0 == 0) goto L74
            java.lang.Object r2 = r5.next()
            r1 = r2
            com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser r1 = (com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser) r1
            int r0 = r1.linkmicUserStatus
            if (r0 != r4) goto L56
            java.lang.String r1 = r1.linkmicIdStr
            java.lang.String r0 = r6.LJIIJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L56
            if (r2 != 0) goto L7d
        L74:
            r0 = 7
            r6.LJJIJIL(r0, r3)
            java.lang.String r0 = "update_user_list_and_not_self"
            r6.LJIIJJI(r0, r4)
        L7d:
            if (r9 == 0) goto L98
            r0 = 1345(0x541, float:1.885E-42)
            java.lang.String r2 = X.U7F.LJJIJ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "updateUserList resp failed:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C32014ChO.LIZJ(r2, r0, r3)
        L98:
            return
        L99:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L9f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7O.accept(java.lang.Object, java.lang.Object):void");
    }
}
