package X;

import Y.IDd0S17S0000000_11;
import android.database.Cursor;
import com.bytedance.sync.v2.presistence.AppDatabase;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.QuR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68495QuR implements InterfaceC68510Qug {
    public final AbstractC03300Ba LIZ;
    public final C68489QuL LIZIZ;
    public final C68490QuM LIZJ;
    public final C68500QuW LIZLLL;
    public final IDd0S17S0000000_11 LJ;
    public final IDd0S17S0000000_11 LJFF;

    public C68495QuR(AppDatabase appDatabase) {
        this.LIZ = appDatabase;
        this.LIZIZ = new C68489QuL(appDatabase);
        this.LIZJ = new C68490QuM(appDatabase);
        this.LIZLLL = new C68500QuW(appDatabase);
        this.LJ = new IDd0S17S0000000_11(appDatabase, 12);
        this.LJFF = new IDd0S17S0000000_11(appDatabase, 13);
    }

    public final List LIZ(long j, EnumC68499QuV enumC68499QuV, int i) {
        C1CD LIZJ = C1CD.LIZJ(4, "SELECT * FROM t_synclog WHERE business = ? AND consume_type = ? ORDER BY sync_cursor ASC limit ? offset ?");
        LIZJ.LJIIIZ(1, j);
        LIZJ.LJIIIZ(2, enumC68499QuV.getValue());
        LIZJ.LJIIIZ(3, 50);
        LIZJ.LJIIIZ(4, i);
        Cursor LJIILIIL = this.LIZ.LJIILIIL(LIZJ);
        try {
            int columnIndexOrThrow = LJIILIIL.getColumnIndexOrThrow("sync_id");
            int columnIndexOrThrow2 = LJIILIIL.getColumnIndexOrThrow("did");
            int columnIndexOrThrow3 = LJIILIIL.getColumnIndexOrThrow("uid");
            int columnIndexOrThrow4 = LJIILIIL.getColumnIndexOrThrow("sync_cursor");
            int columnIndexOrThrow5 = LJIILIIL.getColumnIndexOrThrow("data");
            int columnIndexOrThrow6 = LJIILIIL.getColumnIndexOrThrow("md5");
            int columnIndexOrThrow7 = LJIILIIL.getColumnIndexOrThrow("business");
            int columnIndexOrThrow8 = LJIILIIL.getColumnIndexOrThrow("consume_type");
            int columnIndexOrThrow9 = LJIILIIL.getColumnIndexOrThrow("data_type");
            int columnIndexOrThrow10 = LJIILIIL.getColumnIndexOrThrow("publish_ts");
            int columnIndexOrThrow11 = LJIILIIL.getColumnIndexOrThrow("receive_ts");
            int columnIndexOrThrow12 = LJIILIIL.getColumnIndexOrThrow("bucket");
            int columnIndexOrThrow13 = LJIILIIL.getColumnIndexOrThrow("req_id");
            try {
                ArrayList arrayList = new ArrayList(LJIILIIL.getCount());
                while (LJIILIIL.moveToNext()) {
                    QV2 qv2 = new QV2();
                    qv2.LIZ = LJIILIIL.getString(columnIndexOrThrow);
                    qv2.LIZIZ = LJIILIIL.getString(columnIndexOrThrow2);
                    qv2.LIZJ = LJIILIIL.getString(columnIndexOrThrow3);
                    qv2.LIZLLL = LJIILIIL.getLong(columnIndexOrThrow4);
                    qv2.LJ = LJIILIIL.getBlob(columnIndexOrThrow5);
                    qv2.LJFF = LJIILIIL.getString(columnIndexOrThrow6);
                    qv2.LJI = LJIILIIL.getLong(columnIndexOrThrow7);
                    EnumC68499QuV fromValue = EnumC68499QuV.fromValue(LJIILIIL.getInt(columnIndexOrThrow8));
                    if (fromValue == null) {
                        fromValue = EnumC68499QuV.Increment;
                    }
                    qv2.LJII = fromValue;
                    QV1 fromValue2 = QV1.fromValue(LJIILIIL.getInt(columnIndexOrThrow9));
                    if (fromValue2 == null) {
                        fromValue2 = QV1.ORIGIN;
                    }
                    qv2.LJIIIIZZ = fromValue2;
                    qv2.LJIIIZ = LJIILIIL.getLong(columnIndexOrThrow10);
                    qv2.LJIIJ = LJIILIIL.getLong(columnIndexOrThrow11);
                    qv2.LJIIJJI = UC0.LJJJLL(LJIILIIL.getInt(columnIndexOrThrow12));
                    qv2.LJIIL = LJIILIIL.getString(columnIndexOrThrow13);
                    arrayList.add(qv2);
                }
                LJIILIIL.close();
                LIZJ.LIZLLL();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                LJIILIIL.close();
                LIZJ.LIZLLL();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
