package X;

import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftViewInfoHelper$getDraftViewInfoList$2", f = "DraftViewInfoHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GP6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C41421GNl LJLIL;
    public final /* synthetic */ GP9 LJLILLLLZI;
    public final /* synthetic */ List<DraftViewInfo> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GP6(C41421GNl c41421GNl, GP9 gp9, List<DraftViewInfo> list, InterfaceC67352kd<? super GP6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c41421GNl;
        this.LJLILLLLZI = gp9;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GP6(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (r2 != null) goto L28;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.C141335gf.LIZJ(r10)
            r4 = 0
            X.GPB.LIZLLL()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            X.GPG r1 = new X.GPG     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            boolean r0 = X.GNP.LIZ()     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            if (r0 == 0) goto L27
            X.GNm r2 = X.EnumC41422GNm.FIRST_SAVE_TIME     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
        L11:
            X.GNl r3 = r9.LJLIL     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            r5 = 1
            X.GP9 r6 = r9.LJLILLLLZI     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            r8 = 36
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            java.lang.String r1 = X.GPF.LIZ(r1)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            android.database.sqlite.SQLiteDatabase r0 = X.GPB.LIZJ     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            android.database.Cursor r2 = r0.rawQuery(r1, r4)     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            goto L2a
        L27:
            X.GNm r2 = X.EnumC41422GNm.LAST_SAVE_TIME     // Catch: java.lang.Exception -> L59 java.lang.Throwable -> L7d
            goto L11
        L2a:
            if (r2 == 0) goto L48
            int r0 = X.GPD.LIZ(r2)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            if (r0 <= 0) goto L48
        L32:
            boolean r0 = X.GPD.LIZIZ(r2)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo r1 = X.GPB.LIZ(r2)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            com.ss.android.ugc.aweme.tools.draft.entity.DraftOperationInfo r0 = r1.draftOperationInfo     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            boolean r0 = r0.isNeedShow     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            if (r0 == 0) goto L32
            java.util.List<com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo> r0 = r9.LJLJI     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            r0.add(r1)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            goto L32
        L48:
            java.util.List<com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo> r0 = X.GPB.LIZLLL     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            int r0 = r0.size()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            if (r0 <= 0) goto L55
            X.GPB.LJ()     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
        L55:
            X.C41976Gdg.LIZ(r4, r5)     // Catch: java.lang.Exception -> L5c java.lang.Throwable -> L76
            goto L6e
        L59:
            r1 = move-exception
            r2 = r4
            goto L5d
        L5c:
            r1 = move-exception
        L5d:
            r0 = 0
            X.C41976Gdg.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = "DraftDatabaseHelper"
            X.H78.LIZLLL(r0, r1)     // Catch: java.lang.Throwable -> L76
            java.util.List<com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo> r0 = r9.LJLJI     // Catch: java.lang.Throwable -> L76
            r0.clear()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L73
            goto L70
        L6e:
            if (r2 == 0) goto L73
        L70:
            r2.close()
        L73:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L76:
            r0 = move-exception
            if (r2 == 0) goto L7e
            r2.close()
            goto L7e
        L7d:
            r0 = move-exception
        L7e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GP6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
