package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* renamed from: X.R1k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68876R1k {
    public final SQLiteDatabase LIZ;
    public final String LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;
    public SQLiteStatement LJ;
    public SQLiteStatement LJFF;
    public SQLiteStatement LJI;
    public SQLiteStatement LJII;

    public final SQLiteStatement LIZ() {
        if (this.LJI == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZLLL;
            String LIZ = C78920UyC.LIZ('\"', str, '\"');
            StringBuilder sb = new StringBuilder("DELETE FROM ");
            sb.append(LIZ);
            if (strArr != null && strArr.length > 0) {
                sb.append(" WHERE ");
                C86793Y4n.LIZJ(sb, LIZ, strArr);
            }
            SQLiteStatement compileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                if (this.LJI == null) {
                    this.LJI = compileStatement;
                }
            }
            if (this.LJI != compileStatement) {
                compileStatement.close();
            }
        }
        return this.LJI;
    }

    public final SQLiteStatement LIZIZ() {
        if (this.LJII == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZJ;
            StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('\"');
            LIZ.append(str);
            LIZ.append('\"');
            sb.append(X1D.LIZIZ(LIZ));
            sb.append(" (");
            C86793Y4n.LIZIZ(sb, strArr);
            sb.append(") VALUES (");
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i < length - 1) {
                    sb.append("?,");
                } else {
                    sb.append('?');
                }
            }
            sb.append(')');
            SQLiteStatement compileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                if (this.LJII == null) {
                    this.LJII = compileStatement;
                }
            }
            if (this.LJII != compileStatement) {
                compileStatement.close();
            }
        }
        return this.LJII;
    }

    public final SQLiteStatement LIZJ() {
        if (this.LJ == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZJ;
            StringBuilder sb = new StringBuilder("INSERT INTO ");
            sb.append('\"');
            sb.append(str);
            sb.append("\" (");
            C86793Y4n.LIZIZ(sb, strArr);
            sb.append(") VALUES (");
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i < length - 1) {
                    sb.append("?,");
                } else {
                    sb.append('?');
                }
            }
            sb.append(')');
            SQLiteStatement compileStatement = this.LIZ.compileStatement(sb.toString());
            synchronized (this) {
                if (this.LJ == null) {
                    this.LJ = compileStatement;
                }
            }
            if (this.LJ != compileStatement) {
                compileStatement.close();
            }
        }
        return this.LJ;
    }

    public final SQLiteStatement LIZLLL() {
        if (this.LJFF == null) {
            String str = this.LIZIZ;
            String[] strArr = this.LIZJ;
            String[] strArr2 = this.LIZLLL;
            String LIZ = C78920UyC.LIZ('\"', str, '\"');
            StringBuilder LIZIZ = C07780Sg.LIZIZ("UPDATE ", LIZ, " SET ");
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                LIZIZ.append('\"');
                LIZIZ.append(str2);
                LIZIZ.append("\"=?");
                if (i < strArr.length - 1) {
                    LIZIZ.append(',');
                }
            }
            if (strArr2 != null && strArr2.length > 0) {
                LIZIZ.append(" WHERE ");
                C86793Y4n.LIZJ(LIZIZ, LIZ, strArr2);
            }
            SQLiteStatement compileStatement = this.LIZ.compileStatement(LIZIZ.toString());
            synchronized (this) {
                if (this.LJFF == null) {
                    this.LJFF = compileStatement;
                }
            }
            if (this.LJFF != compileStatement) {
                compileStatement.close();
            }
        }
        return this.LJFF;
    }

    public C68876R1k(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.LIZ = sQLiteDatabase;
        this.LIZIZ = str;
        this.LIZJ = strArr;
        this.LIZLLL = strArr2;
    }
}
