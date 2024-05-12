package X;

import com.bytedance.keva.Keva;

/* loaded from: classes8.dex */
public final class GO2 {
    public static final GO2 LIZ = new GO2();
    public static final C29901Fi<C76800UCe> LIZIZ = new C29901Fi<>();
    public static final Keva LIZJ = Keva.getRepo("posted_draft_keva_name");

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            r15 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.GO3
            if (r0 == 0) goto Lbf
            r6 = r3
            X.GO3 r6 = (X.GO3) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbf
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L14:
            java.lang.Object r9 = r6.LJLJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r7 = 1
            r4 = 0
            java.lang.String r3 = "posted_draft_last_clean_time"
            r2 = 2
            if (r0 == 0) goto L64
            if (r0 == r7) goto L5e
            if (r0 != r2) goto Lc6
            java.lang.Object r1 = r6.LJLILLLLZI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.GO2 r8 = r6.LJLIL
            X.C141335gf.LIZJ(r9)
        L2e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lce
            java.lang.Object r10 = r1.next()
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r10 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r10
            X.GPP r9 = new X.GPP
            X.GLc r11 = new X.GLc
            java.lang.String r0 = "clearBeyondExpiryPostedDrafts"
            r11.<init>(r0, r0)
            r12 = 0
            r14 = 60
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)
            r6.LJLIL = r8
            r6.LJLILLLLZI = r1
            r6.LJLJJL = r2
            X.XIA r7 = X.C78613UtF.LIZJ
            X.GPQ r0 = new X.GPQ
            r0.<init>(r9, r4)
            java.lang.Object r0 = X.XKX.LJI(r7, r0, r6)
            if (r0 != r5) goto L2e
            return r5
        L5e:
            X.GO2 r8 = r6.LJLIL
            X.C141335gf.LIZJ(r9)
            goto L92
        L64:
            X.C141335gf.LIZJ(r9)
            boolean r9 = X.C26223AQx.LIZ()
            com.bytedance.keva.Keva r8 = X.GO2.LIZJ
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r10 = r8.getLong(r3, r0)
            if (r9 == 0) goto Lda
            r8 = 43200000(0x2932e00, double:2.1343636E-316)
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lda
            r6.LJLIL = r15
            r6.LJLJJL = r7
            X.XIA r1 = X.C78613UtF.LIZJ
            X.GO7 r0 = new X.GO7
            r0.<init>(r4)
            java.lang.Object r9 = X.XKX.LJI(r1, r0, r6)
            if (r9 != r5) goto L91
            return r5
        L91:
            r8 = r15
        L92:
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r7 = r7 ^ r0
            if (r7 == 0) goto Lbd
        L9c:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto Lce
            int r0 = r9.size()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r1 = "draft_cnt"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.put(r1, r0)
            java.lang.String r0 = "delete_expired_posted_draft"
            X.FMX.LJIIL(r0, r7)
            java.util.Iterator r1 = r9.iterator()
            goto L2e
        Lbd:
            r9 = r4
            goto L9c
        Lbf:
            X.GO3 r6 = new X.GO3
            r6.<init>(r15, r3)
            goto L14
        Lc6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lce:
            r8.getClass()
            com.bytedance.keva.Keva r2 = X.GO2.LIZJ
            long r0 = java.lang.System.currentTimeMillis()
            r2.storeLong(r3, r0)
        Lda:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GO2.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.C76800UCe> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.GO4
            if (r0 == 0) goto L63
            r6 = r8
            X.GO4 r6 = (X.GO4) r6
            int r2 = r6.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r6.LJLJI = r2
        L12:
            java.lang.Object r1 = r6.LJLIL
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJI
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 == r2) goto L48
            if (r0 != r3) goto L69
            X.C141335gf.LIZJ(r1)
        L24:
            X.1Fi<X.UCe> r1 = X.GO2.LIZIZ
            X.UCe r0 = X.C76800UCe.LIZ
            r1.LJI(r0)
            com.bytedance.keva.Keva r1 = X.GO2.LIZJ
            java.lang.String r0 = "posted_draft_remind_feature_offline"
            r1.storeBoolean(r0, r2)
        L32:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L35:
            X.C141335gf.LIZJ(r1)
            r6.LJLJI = r2
            X.XIA r1 = X.C78613UtF.LIZJ
            X.GO6 r0 = new X.GO6
            r0.<init>(r4)
            java.lang.Object r1 = X.XKX.LJI(r1, r0, r6)
            if (r1 != r5) goto L4b
            return r5
        L48:
            X.C141335gf.LIZJ(r1)
        L4b:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            if (r0 <= 0) goto L32
            r6.LJLJI = r3
            X.XIA r1 = X.C78613UtF.LIZJ
            X.GO5 r0 = new X.GO5
            r0.<init>(r4)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r6)
            if (r0 != r5) goto L24
            return r5
        L63:
            X.GO4 r6 = new X.GO4
            r6.<init>(r7, r8)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GO2.LIZIZ(X.2kd):java.lang.Object");
    }
}
