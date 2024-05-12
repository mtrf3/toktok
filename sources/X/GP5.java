package X;

import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftViewInfoHelper$queryDraftViewInfo$2", f = "DraftViewInfoHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GP5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super DraftViewInfo>, Object> {
    public final /* synthetic */ String LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GP5(String str, InterfaceC67352kd<? super GP5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GP5(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 == null) goto L20;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            r5 = 0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            java.lang.String r0 = "select draft_view_info from local_draft where video_path = '"
            r1.append(r0)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            java.lang.String r0 = r6.LJLIL     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            r1.append(r0)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            r0 = 39
            r1.append(r0)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            java.lang.String r4 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            X.FFL r0 = X.FFL.LJIIIZ()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            r0.getClass()     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            java.lang.String r3 = "studio_size_of_cursor_window"
            r2 = 1
            r1 = 31744(0x7c00, float:4.4483E-41)
            r0 = -1
            int r0 = X.FFL.LJIIJ(r1, r0, r3, r2)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            if (r0 <= 0) goto L33
            X.GP4 r0 = X.GP4.LJLIL     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            X.GPD.LJFF(r4, r0)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
        L33:
            android.database.sqlite.SQLiteDatabase r0 = X.GPB.LIZJ     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            android.database.Cursor r2 = r0.rawQuery(r4, r5)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L5f
            if (r2 == 0) goto L57
            int r0 = X.GPD.LIZ(r2)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L58
            if (r0 <= 0) goto L54
            com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo r0 = X.GPB.LIZJ(r2)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L58
            r2.close()
            return r0
        L49:
            r1 = move-exception
            goto L4d
        L4b:
            r1 = move-exception
            r2 = r5
        L4d:
            java.lang.String r0 = "DraftDatabaseHelper"
            X.H78.LIZLLL(r0, r1)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L57
        L54:
            r2.close()
        L57:
            return r5
        L58:
            r0 = move-exception
            if (r2 == 0) goto L60
            r2.close()
            goto L60
        L5f:
            r0 = move-exception
        L60:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GP5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super DraftViewInfo> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
