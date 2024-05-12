package X;

import com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment;

/* loaded from: classes5.dex */
public final class A4P implements T26 {
    public final /* synthetic */ InterfaceC35811ar<String> LIZ;
    public final /* synthetic */ ReplyFragment LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    @Override // X.T26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r29 = this;
            r1 = r29
            com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment r0 = r1.LIZIZ
            X.Ol8 r0 = r0.LJLJJI
            java.lang.Object r14 = r0.getValue()
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto Ld2
            com.ss.android.ugc.aweme.paidcontent.fragments.ReplyFragment r0 = r1.LIZIZ
            X.1ar<java.lang.String> r1 = r1.LIZ
            java.lang.Object r10 = r1.getValue()
            java.lang.String r10 = (java.lang.String) r10
            X.Ol8 r1 = r0.LJLJI
            java.lang.Object r1 = r1.getValue()
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto Ld2
            long r22 = r1.longValue()
            r17 = 0
            com.ss.android.ugc.aweme.framework.services.IUserService r1 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r17)
            r18 = 0
            if (r1 == 0) goto Le3
            com.ss.android.ugc.aweme.profile.model.User r2 = r1.getCurrentUser()
        L34:
            java.lang.String r4 = X.A4S.LIZIZ()
            if (r2 == 0) goto Ldf
            java.lang.String r5 = r2.getUid()
        L3e:
            java.lang.Long r6 = java.lang.Long.valueOf(r22)
            if (r2 == 0) goto Ld9
            java.lang.String r7 = r2.getNickname()
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r2.getAvatarThumb()
            if (r1 == 0) goto Ldb
            java.util.List r1 = r1.getUrlList()
            if (r1 == 0) goto Ldb
            java.lang.Object r8 = X.ORZ.LJLLLL(r1)
            java.lang.String r8 = (java.lang.String) r8
        L5a:
            long r11 = java.lang.System.currentTimeMillis()
            r9 = 0
            if (r2 == 0) goto Ld6
            int r1 = r2.getVerificationType()
            if (r1 <= 0) goto L69
            r17 = 1
        L69:
            r15 = 1
            r20 = 8192(0x2000, float:1.148E-41)
            X.A4Y r3 = new X.A4Y
            r1 = r3
            r2 = r10
            r13 = r9
            r16 = r9
            r19 = r15
            r21 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.A4S.LIZ(r3)
            X.A4R r3 = com.ss.android.ugc.aweme.paidcontent.api.RatingApi.LIZ
            r3.getClass()
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r6 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.LIZLLL()
            java.lang.String r5 = com.ss.android.ugc.aweme.app.api.Api.LIZ
            java.lang.String r4 = "API_URL_PREFIX_SI"
            java.lang.Class<com.ss.android.ugc.aweme.paidcontent.api.RatingApi> r3 = com.ss.android.ugc.aweme.paidcontent.api.RatingApi.class
            java.lang.Object r4 = X.C77800Ug8.LIZIZ(r5, r4, r6, r5, r3)
            com.ss.android.ugc.aweme.paidcontent.api.RatingApi r4 = (com.ss.android.ugc.aweme.paidcontent.api.RatingApi) r4
            X.A4Q r24 = X.A4Q.TYPE_PAID_COLLECTIONS
            boolean r3 = X.A4U.LIZ()
            if (r3 == 0) goto Ld3
        L9a:
            r21 = r4
            r25 = r9
            r26 = r10
            r27 = r18
            r28 = r14
            X.Svk r4 = r21.publishRating(r22, r24, r25, r26, r27, r28)
            X.T0k r3 = X.T16.LIZ()
            X.Sro r4 = r4.LJJL(r3)
            X.T0k r3 = X.C73969T1h.LIZIZ()
            X.SsE r4 = r4.LJJJ(r3)
            X.A4O r3 = new X.A4O
            r3.<init>(r0, r1, r2, r14)
            X.Sri r4 = r4.LJIJJ(r3)
            X.A4W r3 = new X.A4W
            r5 = r3
            r6 = r1
            r7 = r0
            r8 = r22
            r10 = r2
            r11 = r14
            r5.<init>(r6, r7, r8, r10, r11)
            X.9FO<T> r0 = new X.InterfaceC64592gB() { // from class: X.9FO
                static {
                    /*
                        X.9FO r0 = new X.9FO
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9FO<T>) X.9FO.LJLIL X.9FO
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9FO.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9FO.<init>():void");
                }

                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C9FO.accept(java.lang.Object):void");
                }
            }
            r4.LJJJLIIL(r3, r0)
        Ld2:
            return
        Ld3:
            r10 = r18
            goto L9a
        Ld6:
            r17 = 0
            goto L69
        Ld9:
            r7 = r18
        Ldb:
            r8 = r18
            goto L5a
        Ldf:
            r5 = r18
            goto L3e
        Le3:
            r2 = r18
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4P.LIZIZ():void");
    }

    @Override // X.T26
    public final void LIZ(String str) {
        this.LIZ.setValue(str);
    }

    public A4P(InterfaceC35811ar<String> interfaceC35811ar, ReplyFragment replyFragment) {
        this.LIZ = interfaceC35811ar;
        this.LIZIZ = replyFragment;
    }
}
