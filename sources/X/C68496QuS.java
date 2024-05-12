package X;

import Y.IDd0S17S0000000_11;
import android.database.Cursor;
import com.bytedance.sync.v2.presistence.AppDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.QuS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68496QuS implements InterfaceC68509Quf {
    public final AbstractC03300Ba LIZ;
    public final C68497QuT LIZIZ;
    public final C68492QuO LIZJ;
    public final IDd0S17S0000000_11 LIZLLL;
    public final IDd0S17S0000000_11 LJ;

    public C68496QuS(AppDatabase appDatabase) {
        this.LIZ = appDatabase;
        this.LIZIZ = new C68497QuT(appDatabase);
        this.LIZJ = new C68492QuO(appDatabase);
        new IDd0S17S0000000_11(appDatabase, 9);
        this.LIZLLL = new IDd0S17S0000000_11(appDatabase, 10);
        this.LJ = new IDd0S17S0000000_11(appDatabase, 11);
    }

    public final List<QV9> LIZ(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT * FROM t_sync_cursor WHERE did = ?");
        LIZJ.LJJII(1, str);
        Cursor LJIILIIL = this.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("topic_type");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("recv_cursor");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("report_cursor");
            ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
            while (LJIILIIL.moveToNext()) {
                QV9 qv9 = new QV9();
                qv9.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                qv9.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                qv9.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                EnumC67115QVr fromValue = EnumC67115QVr.fromValue(LJIILIIL.getInt(columnIndexOrThrow4));
                if (fromValue == null) {
                    fromValue = EnumC67115QVr.SpecTopic;
                }
                qv9.LIZLLL = fromValue;
                qv9.LJ = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow5));
                qv9.LJFF = LJIILIIL.getLong(columnIndexOrThrow6);
                qv9.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                arrayList.add(qv9);
            }
            return arrayList;
        } finally {
            LJIILIIL.close();
            LIZJ.LIZLLL();
        }
    }
}
