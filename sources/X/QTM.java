package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QTM extends QTP<List<QTQ>> {
    public final /* synthetic */ int LIZJ = 0;
    public final /* synthetic */ Object LIZLLL = null;
    public final /* synthetic */ QTU LJ;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.QTP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.QTQ> LIZ() {
        /*
            r24 = this;
            X.QTO r12 = X.QTR.LIZ
            r0 = r24
            int r11 = r0.LIZJ
            java.lang.Object r3 = r0.LIZLLL
            boolean r0 = r12.LIZ()
            r2 = 0
            if (r0 != 0) goto L10
        Lf:
            return r2
        L10:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = 1
            java.lang.String[] r9 = new java.lang.String[r1]
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r8 = 0
            r9[r8] = r0
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            if (r11 == 0) goto L67
            if (r11 == r1) goto L5c
            if (r11 == r4) goto L51
            if (r11 == r5) goto L46
            if (r11 == r6) goto L3b
            if (r11 == r7) goto L32
        L2f:
            if (r2 == 0) goto Lc8
            goto L70
        L32:
            android.database.sqlite.SQLiteDatabase r3 = r12.LIZIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            java.lang.String r0 = "select * from login_info where time in (select max(time) from login_info group by uid)order by time desc"
            android.database.Cursor r2 = r3.rawQuery(r0, r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            goto L2f
        L3b:
            if (r3 == 0) goto L2f
            android.database.sqlite.SQLiteDatabase r3 = r12.LIZIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            java.lang.String r0 = "select * from login_info where uid=?"
            android.database.Cursor r2 = r3.rawQuery(r0, r9)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            goto L2f
        L46:
            if (r3 == 0) goto L2f
            android.database.sqlite.SQLiteDatabase r3 = r12.LIZIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            java.lang.String r0 = "select * from login_info where info=?"
            android.database.Cursor r2 = r3.rawQuery(r0, r9)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            goto L2f
        L51:
            if (r3 == 0) goto L2f
            android.database.sqlite.SQLiteDatabase r3 = r12.LIZIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            java.lang.String r0 = "select * from login_info where type=?"
            android.database.Cursor r2 = r3.rawQuery(r0, r9)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            goto L2f
        L5c:
            if (r3 == 0) goto L2f
            android.database.sqlite.SQLiteDatabase r3 = r12.LIZIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            java.lang.String r0 = "select * from login_info where time=?"
            android.database.Cursor r2 = r3.rawQuery(r0, r9)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            goto L2f
        L67:
            android.database.sqlite.SQLiteDatabase r3 = r12.LIZIZ     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            java.lang.String r0 = "select * from login_info"
            android.database.Cursor r2 = r3.rawQuery(r0, r2)     // Catch: java.lang.Exception -> Lbf java.lang.Throwable -> Lcd
            goto L2f
        L70:
            int r3 = r2.getCount()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            if (r3 <= 0) goto Lb9
            r0 = 0
        L77:
            if (r0 >= r3) goto Lb9
            r2.moveToPosition(r0)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            long r12 = r2.getLong(r8)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            int r14 = r2.getInt(r1)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            java.lang.String r15 = r2.getString(r4)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            long r16 = r2.getLong(r5)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            java.lang.String r19 = r2.getString(r6)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            java.lang.String r20 = r2.getString(r7)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            r9 = 6
            java.lang.String r21 = r2.getString(r9)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            r9 = 7
            java.lang.String r22 = r2.getString(r9)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            r9 = 8
            java.lang.String r18 = r2.getString(r9)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            r9 = 9
            java.lang.String r9 = r2.getString(r9)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            X.Fha r23 = X.C63081OpJ.LJIIZILJ(r9)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            X.QTQ r11 = new X.QTQ     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            r11.<init>(r12, r14, r15, r16, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            r10.add(r11)     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            int r0 = r0 + 1
            goto L77
        Lb9:
            r2.close()     // Catch: java.lang.Exception -> Lbd java.lang.Throwable -> Lcb
            goto Lc8
        Lbd:
            r0 = move-exception
            goto Lc0
        Lbf:
            r0 = move-exception
        Lc0:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> Lcd
            if (r2 == 0) goto Lc8
            r2.close()
        Lc8:
            r2 = r10
            goto Lf
        Lcb:
            r0 = move-exception
            goto Lce
        Lcd:
            r0 = move-exception
        Lce:
            if (r2 == 0) goto Ld3
            r2.close()
        Ld3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QTM.LIZ():java.lang.Object");
    }

    public QTM(QTL qtl) {
        this.LJ = qtl;
    }

    @Override // X.QTP
    public final void LIZIZ(List<QTQ> list) {
        List<QTQ> list2 = list;
        if (this.LJ == null) {
            return;
        }
        if (list2 == null || list2.size() == 0) {
            ((QTL) this.LJ).LIZ.onError();
            return;
        }
        QTL qtl = (QTL) this.LJ;
        qtl.getClass();
        ArrayList arrayList = new ArrayList();
        for (QTQ qtq : list2) {
            arrayList.add(new QTH(qtq.LIZ, qtq.LIZIZ, qtq.LIZJ, qtq.LIZLLL));
        }
        qtl.LIZ.LIZ(arrayList);
    }
}
