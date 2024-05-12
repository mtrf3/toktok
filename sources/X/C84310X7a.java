package X;

import android.text.TextUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;
import defpackage.i0;

/* renamed from: X.X7a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84310X7a {
    public static int LIZ(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int charAt = trim.charAt(i);
            if (charAt >= 97) {
                if (charAt <= 122) {
                    charAt = (charAt - 97) + 65;
                } else if (charAt >= 128) {
                    break;
                }
            }
            i2 |= (charAt & 127) << (i * 8);
            i++;
            if (i >= 3) {
                switch (i2) {
                    case 4279873:
                    case 5522756:
                        return 9;
                    case 4280912:
                        return 7;
                    case 4476485:
                    case 5066563:
                        return 5;
                    case 4477013:
                    case 4998468:
                    case 5260626:
                    case 5459529:
                        return 2;
                    case 4543043:
                    case 5198404:
                    case 5524545:
                        return 8;
                    case 4670786:
                        return 4;
                    case 4998483:
                        return 1;
                    case 5001042:
                        return 6;
                    case 5526593:
                        return 3;
                }
            }
        }
        return 99;
    }

    public static String LIZLLL(String str) {
        StringBuilder sb = new StringBuilder("'");
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
        return sb.toString();
    }

    public static void LJ(SQLiteDatabase sQLiteDatabase) {
        C84313X7d LJIIJ = sQLiteDatabase.LJIIJ("SELECT sqlcipher_export('main', 'old');");
        try {
            LJIIJ.LIZ();
            try {
                C84325X7p LJJ = LJIIJ.LJLIL.LJJ();
                String str = LJIIJ.LJLILLLLZI;
                Object[] objArr = LJIIJ.LJLJJLL;
                SQLiteDatabase sQLiteDatabase2 = LJIIJ.LJLIL;
                boolean z = LJIIJ.LJLJI;
                sQLiteDatabase2.getClass();
                LJJ.LJII(str, objArr, SQLiteDatabase.LJIJJ(z));
                LJIIJ.LIZLLL();
            } catch (SQLiteDatabaseCorruptException e) {
                LJIIJ.LJI(e);
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            LJIIJ.LIZLLL();
        }
    }

    public static long LIZIZ(SQLiteDatabase sQLiteDatabase, String str) {
        C84313X7d LJIIJ = sQLiteDatabase.LJIIJ(str);
        try {
            LJIIJ.LIZ();
            try {
                C84325X7p LJJ = LJIIJ.LJLIL.LJJ();
                String str2 = LJIIJ.LJLILLLLZI;
                Object[] objArr = LJIIJ.LJLJJLL;
                SQLiteDatabase sQLiteDatabase2 = LJIIJ.LJLIL;
                boolean z = LJIIJ.LJLJI;
                sQLiteDatabase2.getClass();
                long LJI = LJJ.LJI(str2, objArr, SQLiteDatabase.LJIJJ(z));
                LJIIJ.LIZLLL();
                return LJI;
            } catch (SQLiteDatabaseCorruptException e) {
                LJIIJ.LJI(e);
                throw e;
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            LJIIJ.LIZLLL();
        }
    }

    public static long LIZJ(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str2)) {
            str3 = i0.LJFF(" where ", str2);
        } else {
            str3 = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("select count(*) from ");
        LIZ.append(str);
        LIZ.append(str3);
        return LIZIZ(sQLiteDatabase, X1D.LIZIZ(LIZ));
    }
}
