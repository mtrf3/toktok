package X;

import android.content.Context;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteConnection;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.database.SQLiteGlobal;
import com.tencent.wcdb.repair.RepairKit;

/* loaded from: classes16.dex */
public abstract class X7X {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public SQLiteDatabase LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final X7E LJLJLJ;
    public final X7D LJLJI = null;
    public final int LJLJJI = 48;
    public final byte[] LJLJLLL = null;
    public final SQLiteCipherSpec LJLL = null;

    public abstract void LIZLLL(SQLiteDatabase sQLiteDatabase);

    public final SQLiteDatabase LIZIZ() {
        int i;
        SQLiteDatabase sQLiteDatabase = this.LJLJJL;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.LJLJJL = null;
            } else if (!this.LJLJJL.LJJIJIIJIL()) {
                return this.LJLJJL;
            }
        }
        if (!this.LJLJJLL) {
            SQLiteDatabase sQLiteDatabase2 = this.LJLJJL;
            try {
                this.LJLJJLL = true;
                if (sQLiteDatabase2 != null) {
                    if (sQLiteDatabase2.LJJIJIIJIL()) {
                        sQLiteDatabase2.LJJJIL();
                    }
                } else {
                    String str = this.LJLILLLLZI;
                    if (str == null) {
                        sQLiteDatabase2 = SQLiteDatabase.LJJIL(":memory:", null, null, null, 268435456, null);
                    } else {
                        try {
                            if (this.LJLJL) {
                                i = 8;
                            } else {
                                i = 0;
                            }
                            sQLiteDatabase2 = X7C.LIZ(this.LJLIL, str, this.LJLJLLL, this.LJLL, i, this.LJLJI, this.LJLJLJ);
                        } catch (SQLiteException e) {
                            throw e;
                        }
                    }
                }
                LIZJ(sQLiteDatabase2);
                this.LJLJJLL = false;
                if (sQLiteDatabase2 != this.LJLJJL) {
                    sQLiteDatabase2.LIZLLL();
                }
                return sQLiteDatabase2;
            } catch (Throwable th) {
                this.LJLJJLL = false;
                if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.LJLJJL) {
                    sQLiteDatabase2.LIZLLL();
                }
                throw th;
            }
        }
        throw new IllegalStateException("getDatabase called recursively");
    }

    static {
        SQLiteGlobal.loadLib();
    }

    public final void LIZJ(SQLiteDatabase sQLiteDatabase) {
        C63322OtC.LJFF("LocalWcdbOpenHelper onConfigure");
        if (C63308Osy.LJI().LIZLLL().LJJIJLIJ) {
            sQLiteDatabase.LJIILIIL();
        }
        int intValue = Long.valueOf(C84310X7a.LIZIZ(sQLiteDatabase, "PRAGMA user_version;")).intValue();
        if (intValue != this.LJLJJI) {
            if (!sQLiteDatabase.LJJIJIIJIL()) {
                sQLiteDatabase.LJI(true);
                try {
                    if (intValue != 0) {
                        int i = this.LJLJJI;
                        if (intValue > i) {
                            C63322OtC.LIZLLL("LocalWcdbOpenHelper onDowngrade");
                            C63143OqJ LJII = C63143OqJ.LJII();
                            ((X7W) this).LJLLI.LIZ = sQLiteDatabase;
                            LJII.LJIIIZ(intValue, i);
                        } else {
                            C63322OtC.LJFF("LocalWcdbOpenHelper onUpgrade");
                            C63143OqJ LJII2 = C63143OqJ.LJII();
                            X7Z x7z = ((X7W) this).LJLLI;
                            x7z.LIZ = sQLiteDatabase;
                            LJII2.getClass();
                            C63143OqJ.LJIIJ(x7z, intValue, i);
                        }
                    } else {
                        LIZLLL(sQLiteDatabase);
                    }
                    int i2 = this.LJLJJI;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("PRAGMA user_version = ");
                    LIZ.append(i2);
                    sQLiteDatabase.LJIILL(X1D.LIZIZ(LIZ));
                    sQLiteDatabase.LJJIJL();
                } finally {
                    sQLiteDatabase.LJJIJLIJ();
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Can't upgrade read-only database from version ");
                LIZ2.append(Long.valueOf(C84310X7a.LIZIZ(sQLiteDatabase, "PRAGMA user_version;")).intValue());
                LIZ2.append(" to ");
                LIZ2.append(this.LJLJJI);
                LIZ2.append(": ");
                LIZ2.append(this.LJLILLLLZI);
                throw new SQLiteException(X1D.LIZIZ(LIZ2));
            }
        }
        C63322OtC.LJFF("LocalWcdbOpenHelper onOpen");
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(sQLiteDatabase.LJIJI());
        LIZ3.append("-mbak");
        RepairKit.nativeSaveMaster(sQLiteDatabase.LJ("backupMaster", true), X1D.LIZIZ(LIZ3), null);
        C84325X7p LJJ = sQLiteDatabase.LJJ();
        SQLiteConnection sQLiteConnection = LJJ.LIZIZ;
        if (sQLiteConnection != null) {
            sQLiteConnection.LIZLLL();
        }
        LJJ.LJIIIZ();
        if (sQLiteDatabase.LJJIJIIJIL()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Opened ");
            LIZ4.append(this.LJLILLLLZI);
            LIZ4.append(" in read-only mode");
            com.tencent.wcdb.support.Log.LJ("WCDB.SQLiteOpenHelper", X1D.LIZIZ(LIZ4));
        }
        this.LJLJJL = sQLiteDatabase;
    }

    public X7X(Context context, String str, X7V x7v) {
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJLJ = x7v;
    }
}
