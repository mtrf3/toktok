package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.sender.PhotoMsgSender$onUploadSuccess$2", f = "PhotoMsgSender.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117734jh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C117814jp LJLIL;
    public final /* synthetic */ H4F LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<C117814jp, C76800UCe> LJLJJL;
    public final /* synthetic */ C109544Rq LJLJJLL;
    public final /* synthetic */ C117994k7 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C117734jh(C117814jp c117814jp, H4F h4f, C76732zl c76732zl, C76732zl c76732zl2, InterfaceC88472Yns<? super C117814jp, C76800UCe> interfaceC88472Yns, C109544Rq c109544Rq, C117994k7 c117994k7, InterfaceC67352kd<? super C117734jh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c117814jp;
        this.LJLILLLLZI = h4f;
        this.LJLJI = c76732zl;
        this.LJLJJI = c76732zl2;
        this.LJLJJL = interfaceC88472Yns;
        this.LJLJJLL = c109544Rq;
        this.LJLJL = c117994k7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C117734jh(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r1 != null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.C141335gf.LIZJ(r11)
            X.4jp r2 = r10.LJLIL
            X.H4F r1 = r10.LJLILLLLZI
            r2.getClass()
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L68
            java.lang.Object r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent r0 = (com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent) r0
            if (r0 == 0) goto L68
            java.lang.String r6 = r0.getSecretKey()
        L18:
            java.lang.Object r0 = r1.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent r0 = (com.ss.android.ugc.aweme.shortvideo.dm.DMEncryptedImageContent) r0
            if (r0 == 0) goto L6c
            java.lang.String r7 = r0.getUri()
        L22:
            r9 = 79
            r5 = r4
            r8 = r3
            X.4jp r2 = X.C117814jp.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            X.4jo r8 = X.EnumC117804jo.UPLOADED
            X.2zl r0 = r10.LJLJI
            int r4 = r0.element
            X.2zl r0 = r10.LJLJJI
            int r5 = r0.element
            r9 = 51
            r3 = r3
            r6 = r3
            r7 = r3
            X.4jp r6 = X.C117814jp.LIZIZ(r2, r3, r4, r5, r6, r7, r8, r9)
            X.Yns<X.4jp, X.UCe> r0 = r10.LJLJJL
            if (r0 == 0) goto L44
            r0.invoke(r6)
        L44:
            X.31G r0 = X.C31F.LIZ
            r0.getClass()
            X.C31G.LIZ()
            X.4Rq r0 = r10.LJLJJLL
            java.lang.String r1 = r0.getUuid()
            java.lang.String r0 = "msg.uuid"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            X.4Rq r5 = X.C63150OqQ.LJIILJJIL(r1)
            if (r5 == 0) goto L65
            boolean r0 = r5.isDeleted()
            if (r0 != 0) goto L65
            if (r5 != 0) goto L6e
        L65:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L68:
            r6 = r3
            if (r1 == 0) goto L6c
            goto L18
        L6c:
            r7 = r3
            goto L22
        L6e:
            X.4k7 r4 = r10.LJLJL
            java.lang.String r0 = "private_image"
            r5.setScene(r0)
            java.lang.String r3 = r6.LJFF
            java.lang.String r2 = r6.LJ
            int r0 = r6.LIZJ
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r6.LIZLLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate r0 = X.C117704je.LIZ(r3, r2, r1, r0)
            X.PUn r0 = r0.encode()
            r5.setContentPB(r0)
            java.lang.String r0 = r5.getUuid()
            java.util.List r0 = r6.LIZ(r0)
            r5.setAttachments(r0)
            Y.IDcS364S0100000_1 r1 = new Y.IDcS364S0100000_1
            r0 = 6
            r1.<init>(r4, r0)
            X.C106674Gp.LJIIL(r1, r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117734jh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
