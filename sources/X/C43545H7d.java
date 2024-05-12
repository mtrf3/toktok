package X;

import android.database.sqlite.SQLiteDatabase;
import com.ss.android.ugc.aweme.tools.draft.db.SQLiteHelper;

/* renamed from: X.H7d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43545H7d {
    public static volatile C43545H7d LIZJ;
    public final SQLiteDatabase LIZ = SQLiteHelper.getInstance().getWritableDatabase();
    public final SQLiteDatabase LIZIZ = SQLiteHelper.getInstance().getReadableDatabase();

    public static C43545H7d LIZIZ() {
        if (LIZJ == null) {
            synchronized (C43545H7d.class) {
                if (LIZJ == null) {
                    LIZJ = new C43545H7d();
                }
            }
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028b A[Catch: Exception -> 0x0292, TRY_LEAVE, TryCatch #6 {Exception -> 0x0292, blocks: (B:23:0x0262, B:25:0x028b), top: B:22:0x0262 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0193 A[Catch: Exception -> 0x01a4, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a4, blocks: (B:12:0x018c, B:90:0x0193), top: B:11:0x018c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.draft.model.AwemeDraft LIZ(android.database.Cursor r9) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43545H7d.LIZ(android.database.Cursor):com.ss.android.ugc.aweme.draft.model.AwemeDraft");
    }
}
