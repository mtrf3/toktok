package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftShowInfo;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import defpackage.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GPB {
    public static final GPB LIZ = new GPB();
    public static final SQLiteDatabase LIZIZ;
    public static final SQLiteDatabase LIZJ;
    public static final List<DraftViewInfo> LIZLLL;

    static {
        SQLiteDatabase writableDatabase = SQLiteHelper.getInstance().getWritableDatabase();
        o.LJIIIIZZ(writableDatabase, "getInstance().writableDatabase");
        LIZIZ = writableDatabase;
        SQLiteDatabase readableDatabase = SQLiteHelper.getInstance().getReadableDatabase();
        o.LJIIIIZZ(readableDatabase, "getInstance().readableDatabase");
        LIZJ = readableDatabase;
        LIZLLL = new ArrayList();
    }

    public static void LIZLLL() {
        if (C00F.LIZ(31744, 0, "studio_fake_draft_operation_response", true) == 4 && C79146V4k.LJJJJIZL()) {
            C60903NvH.LJIIJJI().LJJIIJ();
        }
    }

    public static void LJ() {
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            DraftViewInfo draftViewInfo = (DraftViewInfo) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("update local_draft set draft_view_info = '");
            LIZ2.append(GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), draftViewInfo));
            LIZ2.append("' where video_path = '");
            LIZIZ.execSQL(q.LIZIZ(LIZ2, draftViewInfo.creationId, '\'', LIZ2));
        }
        ((ArrayList) LIZLLL).clear();
    }

    public static DraftViewInfo LIZ(Cursor cursor) {
        DraftViewInfo draftViewInfo = new DraftViewInfo();
        String string = cursor.getString(cursor.getColumnIndex("draft_view_info"));
        if (string != null) {
            try {
            } catch (Exception e) {
                e = e;
            }
            if (string.length() != 0) {
                Object LJI = C60903NvH.LJIIJJI().LIZ().LJI(string, DraftViewInfo.class);
                o.LJIIIIZZ(LJI, "getAPI().getGson().fromJ…raftViewInfo::class.java)");
                DraftViewInfo draftViewInfo2 = (DraftViewInfo) LJI;
                try {
                    DraftShowInfo draftShowInfo = draftViewInfo2.draftShowInfo;
                    if (draftShowInfo.saveTime == 0) {
                        draftShowInfo.saveTime = cursor.getLong(cursor.getColumnIndex("save_time"));
                    }
                    int columnIndex = cursor.getColumnIndex("published_time");
                    if (columnIndex >= 0) {
                        draftViewInfo2.LIZ = cursor.getLong(columnIndex);
                    }
                    draftViewInfo = draftViewInfo2;
                } catch (Exception e2) {
                    e = e2;
                    draftViewInfo = draftViewInfo2;
                    H78.LIZLLL("DraftDatabaseHelper", e);
                    return draftViewInfo;
                }
                return draftViewInfo;
            }
        }
        draftViewInfo = C87277YNd.LIZJ(C43545H7d.LIZ(cursor));
        ((ArrayList) LIZLLL).add(draftViewInfo);
        return draftViewInfo;
    }

    public static DraftViewInfo LIZJ(Cursor cursor) {
        GPD.LIZIZ(cursor);
        DraftViewInfo draftVideoInfo = (DraftViewInfo) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), cursor.getString(cursor.getColumnIndex("draft_view_info")), DraftViewInfo.class);
        int columnIndex = cursor.getColumnIndex("published_time");
        if (columnIndex >= 0 && draftVideoInfo != null) {
            draftVideoInfo.LIZ = cursor.getLong(columnIndex);
        }
        o.LJIIIIZZ(draftVideoInfo, "draftVideoInfo");
        return draftVideoInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C41421GNl r8, X.GP9 r9, X.InterfaceC67352kd<? super java.util.List<com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.GPA
            if (r0 == 0) goto L3a
            r6 = r10
            X.GPA r6 = (X.GPA) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r1 = r6.LJLILLLLZI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L40
            java.lang.Object r3 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            return r3
        L23:
            java.util.ArrayList r3 = X.C1JX.LJFF(r1)
            X.XIA r2 = X.C78613UtF.LIZJ
            X.GP6 r1 = new X.GP6
            r0 = 0
            r1.<init>(r8, r9, r3, r0)
            r6.LJLIL = r3
            r6.LJLJJI = r4
            java.lang.Object r0 = X.XKX.LJI(r2, r1, r6)
            if (r0 != r5) goto L22
            return r5
        L3a:
            X.GPA r6 = new X.GPA
            r6.<init>(r7, r10)
            goto L12
        L40:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GPB.LIZIZ(X.GNl, X.GP9, X.2kd):java.lang.Object");
    }
}
