package X;

import Y.IDd0S18S0000000_15;
import android.database.Cursor;
import com.ss.android.ugc.aweme.offlinemode.database.OfflineModeFeedPBDataBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YWp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87523YWp implements InterfaceC26200AQa {
    public final AbstractC03300Ba LIZ;
    public final C87525YWr LIZIZ;
    public final C76917UGr LIZJ = new C76917UGr();
    public final IDd0S18S0000000_15 LIZLLL;
    public final IDd0S18S0000000_15 LJ;
    public final IDd0S18S0000000_15 LJFF;
    public final IDd0S18S0000000_15 LJI;
    public final IDd0S18S0000000_15 LJII;

    @Override // X.InterfaceC26200AQa
    public final int LJI() {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJII.LIZ();
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJII.LIZJ(LIZ);
        }
    }

    public C87523YWp(OfflineModeFeedPBDataBase offlineModeFeedPBDataBase) {
        this.LIZ = offlineModeFeedPBDataBase;
        this.LIZIZ = new C87525YWr(this, offlineModeFeedPBDataBase);
        this.LIZLLL = new IDd0S18S0000000_15(offlineModeFeedPBDataBase, 2);
        this.LJ = new IDd0S18S0000000_15(offlineModeFeedPBDataBase, 3);
        this.LJFF = new IDd0S18S0000000_15(offlineModeFeedPBDataBase, 4);
        this.LJI = new IDd0S18S0000000_15(offlineModeFeedPBDataBase, 5);
        new IDd0S18S0000000_15(offlineModeFeedPBDataBase, 6);
        this.LJII = new IDd0S18S0000000_15(offlineModeFeedPBDataBase, 7);
    }

    @Override // X.InterfaceC26200AQa
    public final List<Long> LJIIIIZZ(List<C87526YWs> list) {
        this.LIZ.LIZIZ();
        this.LIZ.LIZJ();
        try {
            C87525YWr c87525YWr = this.LIZIZ;
            InterfaceC37591dj LIZ = c87525YWr.LIZ();
            try {
                ArrayList arrayList = (ArrayList) list;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    c87525YWr.LIZLLL(LIZ, it.next());
                    arrayList2.add(i, Long.valueOf(LIZ.LJIILJJIL()));
                    i++;
                }
                c87525YWr.LIZJ(LIZ);
                this.LIZ.LJIILLIIL();
                return arrayList2;
            } catch (Throwable th) {
                c87525YWr.LIZJ(LIZ);
                throw th;
            }
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List<String> LJIIL(String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(1, "\n        SELECT url_key\n        FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n    ");
        LIZJ.LJJII(1, str);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final int LJIILLIIL(String str) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LIZLLL.LIZ();
        LIZ.LJJII(1, str);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LIZLLL.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LIZIZ(long j, String str) {
        String string;
        byte[] blob;
        RCZ rcz;
        String string2;
        boolean z;
        boolean z2;
        C1CD LIZJ = C1CD.LIZJ(3, "SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? AND aweme_struct IS NOT NULL AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "sec_uid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "insert_time");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "aweme_struct");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "aid");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "has_cached");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "has_watched");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "cached_time");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "url_key");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j2 = LIZIZ.getLong(LIZIZ3);
                if (LIZIZ.isNull(LIZIZ4)) {
                    blob = null;
                } else {
                    blob = LIZIZ.getBlob(LIZIZ4);
                }
                this.LIZJ.getClass();
                o.LJIIIZ(blob, "byte");
                try {
                    rcz = RCZ.ADAPTER.decode(blob);
                } catch (Throwable unused) {
                    rcz = null;
                }
                if (rcz != null) {
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.getInt(LIZIZ6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LIZIZ.getInt(LIZIZ7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = LIZIZ.getLong(LIZIZ8);
                    if (!LIZIZ.isNull(LIZIZ9)) {
                        str2 = LIZIZ.getString(LIZIZ9);
                    }
                    arrayList.add(new C87526YWs(string, j2, rcz, string2, z, z2, j3, str2));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.aweme.proto.AwemeStructV2, but it was null.");
                }
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LIZJ(long j, String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(3, "\n        SELECT aid FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND (insert_time + ?) > ?\n    ");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final int LIZLLL(String str, List<String> list) {
        this.LIZ.LIZIZ();
        StringBuilder sb = new StringBuilder();
        sb.append("\n        DELETE FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n        AND aid in (");
        C217818gj.LIZ(list.size(), sb);
        sb.append(")\n    ");
        InterfaceC37591dj LJ = this.LIZ.LJ(sb.toString());
        LJ.LJJII(1, str);
        int i = 2;
        for (String str2 : list) {
            if (str2 == null) {
                LJ.LLLLLLJ(i);
            } else {
                LJ.LJJII(i, str2);
            }
            i++;
        }
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LJ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List<String> LJ(String str, List<String> list) {
        String string;
        StringBuilder LIZJ = C278817o.LIZJ("\n        SELECT url_key\n        FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND aid in (");
        int size = list.size();
        C217818gj.LIZ(size, LIZJ);
        LIZJ.append(")\n    ");
        C1CD LIZJ2 = C1CD.LIZJ(size + 1, LIZJ.toString());
        LIZJ2.LJJII(1, str);
        int i = 2;
        for (String str2 : list) {
            if (str2 == null) {
                LIZJ2.LLLLLLJ(i);
            } else {
                LIZJ2.LJJII(i, str2);
            }
            i++;
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ2, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ2.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LJFF(long j, String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(3, "\n        SELECT aid FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND has_watched = 1 AND (insert_time + ?) > ?\n    ");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final int LJII(long j, String str) {
        C1CD LIZJ = C1CD.LIZJ(3, "\n        SELECT COUNT(aid) FROM offline_mode_feed_pb \n        WHERE sec_uid = ?\n        AND has_cached = 1 AND (insert_time + ?) > ?\n    ");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        int i = 0;
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                i = LIZIZ.getInt(0);
            }
            return i;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LJIIIZ(long j, String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(3, "SELECT aid FROM offline_mode_feed_pb WHERE SEC_UID = ? And (insert_time + ?) <= ?");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LJIILIIL(long j, String str) {
        String string;
        byte[] blob;
        RCZ rcz;
        String string2;
        boolean z;
        boolean z2;
        C1CD LIZJ = C1CD.LIZJ(3, "\n        SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? And has_cached != 1\n        AND aweme_struct IS NOT NULL AND (insert_time + ?) > ?\n        ORDER BY INSERT_TIME ASC\n        ");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "sec_uid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "insert_time");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "aweme_struct");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "aid");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "has_cached");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "has_watched");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "cached_time");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "url_key");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j2 = LIZIZ.getLong(LIZIZ3);
                if (LIZIZ.isNull(LIZIZ4)) {
                    blob = null;
                } else {
                    blob = LIZIZ.getBlob(LIZIZ4);
                }
                this.LIZJ.getClass();
                o.LJIIIZ(blob, "byte");
                try {
                    rcz = RCZ.ADAPTER.decode(blob);
                } catch (Throwable unused) {
                    rcz = null;
                }
                if (rcz != null) {
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.getInt(LIZIZ6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LIZIZ.getInt(LIZIZ7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = LIZIZ.getLong(LIZIZ8);
                    if (!LIZIZ.isNull(LIZIZ9)) {
                        str2 = LIZIZ.getString(LIZIZ9);
                    }
                    arrayList.add(new C87526YWs(string, j2, rcz, string2, z, z2, j3, str2));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.aweme.proto.AwemeStructV2, but it was null.");
                }
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final int LJIILJJIL(String str, String str2) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJI.LIZ();
        long j = 1;
        LIZ.LJIIIZ(1, j);
        LIZ.LJJII(2, str);
        if (str2 == null) {
            LIZ.LLLLLLJ(3);
        } else {
            LIZ.LJJII(3, str2);
        }
        LIZ.LJIIIZ(4, j);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJI.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC26200AQa
    public final int LIZ(String str, String str2, String str3) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJFF.LIZ();
        if (str3 == null) {
            LIZ.LLLLLLJ(1);
        } else {
            LIZ.LJJII(1, str3);
        }
        LIZ.LJJII(2, str);
        LIZ.LJJII(3, str2);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJFF.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LJIIJ(int i, long j, String str) {
        String string;
        C1CD LIZJ = C1CD.LIZJ(8, "\n        SELECT aid FROM offline_mode_feed_pb \n        WHERE sec_uid = ? AND aid IN (\n            SELECT aid\n            FROM offline_mode_feed_pb\n            WHERE sec_uid = ? AND (insert_time + ?) > ?\n            ORDER BY insert_time DESC\n            LIMIT (\n                SELECT COUNT(*)  \n                FROM offline_mode_feed_pb\n                WHERE sec_uid = ? AND (insert_time + ?) > ?\n            ) - ?\n        )\n    ");
        LIZJ.LJJII(1, str);
        LIZJ.LJJII(2, str);
        LIZJ.LJIIIZ(3, 172800000L);
        LIZJ.LJIIIZ(4, j);
        LIZJ.LJJII(5, str);
        LIZJ.LJIIIZ(6, 172800000L);
        LIZJ.LJIIIZ(7, j);
        LIZJ.LJIIIZ(8, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                if (LIZIZ.isNull(0)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    @Override // X.InterfaceC26200AQa
    public final int LJIIJJI(long j, String str, String str2) {
        this.LIZ.LIZIZ();
        InterfaceC37591dj LIZ = this.LJ.LIZ();
        LIZ.LJIIIZ(1, 1);
        LIZ.LJIIIZ(2, j);
        LIZ.LJJII(3, str);
        LIZ.LJJII(4, str2);
        LIZ.LJIIIZ(5, 1);
        this.LIZ.LIZJ();
        try {
            int LJIJJLI = LIZ.LJIJJLI();
            this.LIZ.LJIILLIIL();
            return LJIJJLI;
        } finally {
            this.LIZ.LJIIJJI();
            this.LJ.LIZJ(LIZ);
        }
    }

    @Override // X.InterfaceC26200AQa
    public final List LJIILL(long j, int i, String str) {
        String string;
        byte[] blob;
        RCZ rcz;
        String string2;
        boolean z;
        boolean z2;
        C1CD LIZJ = C1CD.LIZJ(5, "\n        SELECT * FROM offline_mode_feed_pb \n        WHERE SEC_UID = ? \n        AND aweme_struct IS NOT NULL \n        AND has_cached = 1 AND (insert_time + ?) > ?\n        ORDER BY cached_time ASC\n        LIMIT ?\n        OFFSET ?\n    ");
        LIZJ.LJJII(1, str);
        LIZJ.LJIIIZ(2, 172800000L);
        LIZJ.LJIIIZ(3, j);
        LIZJ.LJIIIZ(4, 20);
        LIZJ.LJIIIZ(5, i);
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            int LIZIZ2 = C25070yd.LIZIZ(LIZIZ, "sec_uid");
            int LIZIZ3 = C25070yd.LIZIZ(LIZIZ, "insert_time");
            int LIZIZ4 = C25070yd.LIZIZ(LIZIZ, "aweme_struct");
            int LIZIZ5 = C25070yd.LIZIZ(LIZIZ, "aid");
            int LIZIZ6 = C25070yd.LIZIZ(LIZIZ, "has_cached");
            int LIZIZ7 = C25070yd.LIZIZ(LIZIZ, "has_watched");
            int LIZIZ8 = C25070yd.LIZIZ(LIZIZ, "cached_time");
            int LIZIZ9 = C25070yd.LIZIZ(LIZIZ, "url_key");
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                String str2 = null;
                if (LIZIZ.isNull(LIZIZ2)) {
                    string = null;
                } else {
                    string = LIZIZ.getString(LIZIZ2);
                }
                long j2 = LIZIZ.getLong(LIZIZ3);
                if (LIZIZ.isNull(LIZIZ4)) {
                    blob = null;
                } else {
                    blob = LIZIZ.getBlob(LIZIZ4);
                }
                this.LIZJ.getClass();
                o.LJIIIZ(blob, "byte");
                try {
                    rcz = RCZ.ADAPTER.decode(blob);
                } catch (Throwable unused) {
                    rcz = null;
                }
                if (rcz != null) {
                    if (LIZIZ.isNull(LIZIZ5)) {
                        string2 = null;
                    } else {
                        string2 = LIZIZ.getString(LIZIZ5);
                    }
                    if (LIZIZ.getInt(LIZIZ6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (LIZIZ.getInt(LIZIZ7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long j3 = LIZIZ.getLong(LIZIZ8);
                    if (!LIZIZ.isNull(LIZIZ9)) {
                        str2 = LIZIZ.getString(LIZIZ9);
                    }
                    arrayList.add(new C87526YWs(string, j2, rcz, string2, z, z2, j3, str2));
                } else {
                    throw new IllegalStateException("Expected non-null com.ss.ugc.aweme.proto.AwemeStructV2, but it was null.");
                }
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}
