package X;

import com.tencent.wcdb.database.SQLiteConnection;
import java.util.ArrayList;

/* renamed from: X.X7r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84327X7r {
    public final C84328X7s[] LIZ = new C84328X7s[20];
    public int LIZIZ;
    public int LIZJ;
    public final /* synthetic */ SQLiteConnection LIZLLL;

    public C84327X7r(SQLiteConnection sQLiteConnection) {
        this.LIZLLL = sQLiteConnection;
    }

    public static boolean LIZLLL(C84328X7s c84328X7s) {
        if (c84328X7s != null) {
            c84328X7s.LIZIZ = System.currentTimeMillis();
            c84328X7s.LJFF = true;
            Exception exc = c84328X7s.LJI;
            if ((exc != null && exc.getMessage() != null) || c84328X7s.LIZIZ - c84328X7s.LIZ > 300) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ(int i) {
        String str;
        synchronized (this.LIZ) {
            C84328X7s LJFF = LJFF(i);
            if (LIZLLL(LJFF)) {
                LJII(LJFF, null);
            }
            str = LJFF.LIZJ;
        }
        if (!"prepare".equals(str)) {
            this.LIZLLL.LIZ.LJLIL.get();
        }
    }

    public final boolean LIZJ(int i) {
        synchronized (this.LIZ) {
            C84328X7s LJFF = LJFF(i);
            if (LJFF == null) {
                return false;
            }
            boolean LIZLLL = LIZLLL(LJFF);
            String str = LJFF.LIZJ;
            if (!"prepare".equals(str)) {
                this.LIZLLL.LIZ.LJLIL.get();
            }
            return LIZLLL;
        }
    }

    public final C84328X7s LJFF(int i) {
        C84328X7s c84328X7s = this.LIZ[i & 255];
        if (c84328X7s.LJII == i) {
            return c84328X7s;
        }
        return null;
    }

    public static void LJII(C84328X7s c84328X7s, String str) {
        StringBuilder sb = new StringBuilder();
        c84328X7s.LIZ(sb);
        if (str != null) {
            sb.append(", ");
            sb.append(str);
        }
        com.tencent.wcdb.support.Log.LIZJ("WCDB.SQLiteConnection", sb.toString());
    }

    public final void LJ(int i, Exception exc) {
        synchronized (this.LIZ) {
            C84328X7s LJFF = LJFF(i);
            if (LJFF != null) {
                LJFF.LJI = exc;
            }
        }
    }

    public final void LJI(int i, String str) {
        synchronized (this.LIZ) {
            C84328X7s LJFF = LJFF(i);
            if (LJFF != null) {
                LJII(LJFF, str);
            }
        }
    }

    public final C84328X7s LIZ(String str, String str2, Object[] objArr) {
        C84328X7s c84328X7s;
        synchronized (this.LIZ) {
            int i = (this.LIZIZ + 1) % 20;
            c84328X7s = this.LIZ[i];
            if (c84328X7s == null) {
                c84328X7s = new C84328X7s();
                this.LIZ[i] = c84328X7s;
            } else {
                c84328X7s.LJFF = false;
                c84328X7s.LJI = null;
                ArrayList<Object> arrayList = c84328X7s.LJ;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            c84328X7s.LIZ = System.currentTimeMillis();
            c84328X7s.LIZJ = str;
            c84328X7s.LIZLLL = str2;
            if (objArr != null) {
                ArrayList<Object> arrayList2 = c84328X7s.LJ;
                if (arrayList2 == null) {
                    c84328X7s.LJ = new ArrayList<>();
                } else {
                    arrayList2.clear();
                }
                for (Object obj : objArr) {
                    if (obj != null && (obj instanceof byte[])) {
                        c84328X7s.LJ.add(SQLiteConnection.LJIILLIIL);
                    } else {
                        c84328X7s.LJ.add(obj);
                    }
                }
            }
            int i2 = this.LIZJ;
            this.LIZJ = i2 + 1;
            c84328X7s.LJII = (i2 << 8) | i;
            c84328X7s.LJIIIIZZ = this.LIZLLL.LJIIIIZZ;
            this.LIZIZ = i;
        }
        return c84328X7s;
    }
}
