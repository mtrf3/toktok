package X;

/* renamed from: X.TmM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75638TmM extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC75441TjB, C75732Tns<C75677Tmz>, C76800UCe> {
    public static final C75638TmM LJLIL = new C75638TmM();

    public C75638TmM() {
        super(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // X.InterfaceC88471Ynr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C76800UCe invoke(X.InterfaceC75441TjB r8, X.C75732Tns<X.C75677Tmz> r9) {
        /*
            r7 = this;
            X.Tns r9 = (X.C75732Tns) r9
            java.lang.String r0 = "session"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            T r1 = r9.LIZ
            X.Tmz r1 = (X.C75677Tmz) r1
            int r0 = r1.LIZIZ
            if (r0 != 0) goto L69
            com.bytedance.android.live.liveinteract.multihost.core.model.MHPermitJoinBizContent r0 = r1.LJI
            if (r0 == 0) goto L95
            int r0 = r0.sourceType
            long r1 = (long) r0
        L1b:
            java.lang.String r3 = "replyMessageSubscriber, receive reply message, sourceType = "
            java.lang.String r0 = ", isCrossArc = "
            java.lang.StringBuilder r4 = X.V10.LIZJ(r3, r1, r0)
            T r0 = r9.LIZ
            X.Tmz r0 = (X.C75677Tmz) r0
            boolean r3 = r0.LJIIIIZZ
            java.lang.String r0 = "TopicPairManager"
            X.C19U.LIZJ(r4, r3, r4, r0)
            T r0 = r9.LIZ
            X.Tmz r0 = (X.C75677Tmz) r0
            int r0 = r0.LIZJ
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r3 = X.B5G.LIZIZ()
            int r5 = (int) r1
            r4 = 1
            if (r0 == r4) goto L6c
            if (r0 != r4) goto L69
        L3e:
            boolean r0 = X.C75650TmY.LIZJ()
            if (r0 == 0) goto L69
            X.Tm1 r0 = X.EnumC75617Tm1.TOPIC_PAIR
            long r5 = r0.getType()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L58
            X.Tm1 r0 = X.EnumC75617Tm1.TOPIC_INVITE
            long r5 = r0.getType()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L69
        L58:
            X.Tmv r0 = X.EnumC75673Tmv.LINKING
            X.C75650TmY.LJII(r0)
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r1 = X.B5G.LIZIZ()
            X.Tmu r0 = X.EnumC75672Tmu.INVITER
            r1.LJIIJJI(r0)
            X.C75650TmY.LIZ(r4)
        L69:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L6c:
            boolean r0 = X.C75650TmY.LIZJ()
            if (r0 != 0) goto L79
            boolean r0 = X.C75650TmY.LIZIZ()
            if (r0 != 0) goto L79
            goto L3e
        L79:
            r0 = 13
            if (r5 == r0) goto L8f
            r0 = 14
            if (r5 == r0) goto L89
        L81:
            java.lang.String r3 = "setupTopicPairReplyInviteType, inviteType = "
            java.lang.String r0 = "MultiHostSourceTypeHelper"
            X.QZP.LIZJ(r3, r5, r0)
            goto L3e
        L89:
            X.Tly r0 = X.EnumC75614Tly.TOPIC_RECOMMEND
            r3.LJIIIZ(r0)
            goto L81
        L8f:
            X.Tly r0 = X.EnumC75614Tly.TOPIC_PAIR
            r3.LJIIIZ(r0)
            goto L81
        L95:
            r1 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75638TmM.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
