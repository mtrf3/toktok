package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData;

/* loaded from: classes14.dex */
public final class U7Q<T> implements InterfaceC64592gB {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ PermitApplyData LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    public U7Q(U7F u7f, String str, int i, long j, PermitApplyData permitApplyData, long j2) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = j;
        this.LJLJJL = permitApplyData;
        this.LJLJJLL = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    @Override // X.InterfaceC64592gB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r23) {
        /*
            r22 = this;
            r4 = r23
            com.bytedance.android.live.network.response.BaseResponse r4 = (com.bytedance.android.live.network.response.BaseResponse) r4
            r7 = 0
            if (r4 == 0) goto L95
            T r0 = r4.data
            com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse$ResponseData r0 = (com.bytedance.android.livesdk.chatroom.interact.model.PermitResponse.ResponseData) r0
            if (r0 == 0) goto L95
            java.lang.String r7 = r0.linkmicIdStr
        L10:
            java.lang.String r6 = r4.LIZIZ
        L12:
            X.OSZ r5 = new X.OSZ
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r10 = ""
            r5.<init>(r0, r10)
            long r14 = X.C31012CFc.LIZIZ()
            r2 = r22
            X.U7F r1 = r2.LJLIL
            java.lang.String r0 = r2.LJLILLLLZI
            int r11 = r2.LJLJI
            r3 = 1
            long r12 = r2.LJLJJI
            r19 = r6
            r20 = r5
            r21 = r3
            r16 = r1
            r17 = r0
            r18 = r7
            X.UA9.LJJIIZ(r11, r12, r14, r16, r17, r18, r19, r20, r21)
            com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData r0 = r2.LJLJJL
            int r0 = r0.getPermitStatus()
            if (r0 != r3) goto L62
            X.U7F r1 = r2.LJLIL
            java.lang.String r9 = r1.LJIIJ
            if (r9 == 0) goto L62
            com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData r0 = r2.LJLJJL
            long r5 = r2.LJLJJLL
            X.U7W r8 = r1.LJIJ
            X.U85 r7 = X.U85.HANDLER
            com.bytedance.android.livesdk.comp.api.linkcore.model.LiveRoomUser r0 = r0.getApplicant()
            java.lang.String r1 = r0.getLinkMicId()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r8.LIZIZ(r7, r9, r1, r0)
        L62:
            X.U7F r6 = r2.LJLIL
            X.U7W r5 = r6.LJIJ
            java.lang.String r7 = "permit_apply"
            long r8 = X.C31012CFc.LIZIZ()
            long r0 = r2.LJLJJI
            long r8 = r8 - r0
            if (r4 == 0) goto L75
            java.lang.String r0 = r4.LIZIZ
            if (r0 != 0) goto L93
        L75:
            r11 = 0
            X.OSZ r12 = new X.OSZ
            com.bytedance.android.livesdk.comp.api.linkcore.model.PermitApplyData r0 = r2.LJLJJL
            int r0 = r0.getPermitStatus()
            if (r0 != r3) goto L90
            java.lang.String r1 = "agree"
        L82:
            java.lang.String r0 = "permit_status"
            r12.<init>(r0, r1)
            java.lang.String r14 = r2.LJLILLLLZI
            r15 = 64
            r13 = r11
            X.J7I.LJIIIZ(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            return
        L90:
            java.lang.String r1 = "reject"
            goto L82
        L93:
            r10 = r0
            goto L75
        L95:
            if (r4 == 0) goto L99
            goto L10
        L99:
            r6 = r7
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7Q.accept(java.lang.Object):void");
    }
}
