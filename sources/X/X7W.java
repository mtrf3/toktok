package X;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.wcdb.database.SQLiteDatabase;
import java.io.File;

/* loaded from: classes16.dex */
public final class X7W extends X7X implements InterfaceC63149OqP {
    public static int LJLLL;
    public static volatile boolean LJLLLL;
    public static final X7V LJLLLLLL = new X7V();
    public final X7Z LJLLI;
    public final String LJLLILLLL;
    public final boolean LJLLJ;

    @Override // X.InterfaceC63149OqP
    public final InterfaceC78848Ux2 LIZ() {
        SQLiteDatabase LIZIZ;
        X7Z x7z = this.LJLLI;
        synchronized (this) {
            LIZIZ = LIZIZ();
        }
        x7z.LIZ = LIZIZ;
        return x7z;
    }

    @Override // X.InterfaceC63149OqP, java.lang.AutoCloseable
    public final void close() {
        C63322OtC.LJFF("LocalWcdbOpenHelper close");
        synchronized (this) {
            if (!this.LJLJJLL) {
                SQLiteDatabase sQLiteDatabase = this.LJLJJL;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    this.LJLJJL.LIZLLL();
                    this.LJLJJL = null;
                }
            } else {
                throw new IllegalStateException("Closed during initialization");
            }
        }
    }

    @Override // X.X7X
    public final void LIZLLL(SQLiteDatabase sQLiteDatabase) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalWcdbOpenHelper onCreate, mEncrypted:");
        LIZ.append(this.LJLLJ);
        LIZ.append(", mOldDatabaseName:");
        LIZ.append(this.LJLLILLLL);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        this.LJLLI.LIZ = sQLiteDatabase;
        if (!this.LJLLJ || TextUtils.isEmpty(this.LJLLILLLL)) {
            C63143OqJ LJII = C63143OqJ.LJII();
            X7Z x7z = this.LJLLI;
            LJII.getClass();
            C63143OqJ.LJIIIIZZ(x7z);
            return;
        }
        File databasePath = C63308Osy.LJI().LIZ.getDatabasePath(this.LJLLILLLL);
        if (databasePath.exists()) {
            X7Z x7z2 = this.LJLLI;
            try {
                C63322OtC.LJFF("LocalWcdbOpenHelper migrate start");
                SQLiteDatabase sQLiteDatabase2 = x7z2.LIZ;
                sQLiteDatabase2.LJJIJLIJ();
                sQLiteDatabase2.LJIILL(C16880lQ.LLLZ("ATTACH DATABASE %s AS old KEY '';", new Object[]{C84310X7a.LIZLLL(databasePath.getPath())}));
                if (C63308Osy.LJI().LIZLLL().LJJIJLIJ) {
                    sQLiteDatabase2.LJI(false);
                } else {
                    sQLiteDatabase2.LJI(true);
                }
                C84310X7a.LJ(sQLiteDatabase2);
                sQLiteDatabase2.LJJIJL();
                sQLiteDatabase2.LJJIJLIJ();
                int LIZIZ = (int) C84310X7a.LIZIZ(sQLiteDatabase2, "PRAGMA old.user_version;");
                sQLiteDatabase2.LJIILL("DETACH DATABASE old;");
                C16880lQ.LLLZZIL(databasePath);
                if (C63308Osy.LJI().LIZLLL().LJJIJLIJ) {
                    sQLiteDatabase2.LJI(false);
                } else {
                    sQLiteDatabase2.LJI(true);
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("LocalWcdbOpenHelper migrate end, oldVersion:");
                LIZ2.append(LIZIZ);
                LIZ2.append(", newVersion:");
                LIZ2.append(48);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                if (LIZIZ <= 48) {
                    if (LIZIZ < 48) {
                        C63143OqJ.LJII().getClass();
                        C63143OqJ.LJIIJ(x7z2, LIZIZ, 48);
                    }
                } else {
                    C63143OqJ.LJII().LJIIIZ(LIZIZ, 48);
                }
                C63323OtD c63323OtD = new C63323OtD();
                c63323OtD.LIZJ("imsdk_db_migrate_encrypted_result");
                c63323OtD.LIZ(1, "imsdk_result");
                c63323OtD.LIZLLL();
                return;
            } catch (Exception e) {
                C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_db_migrate_encrypted_result");
                LIZJ.LIZ(0, "imsdk_result");
                LIZJ.LIZ(android.util.Log.getStackTraceString(e), "error_msg");
                LIZJ.LIZLLL();
                C63308Osy.LJI().LJIIJJI(true);
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        C63143OqJ LJII2 = C63143OqJ.LJII();
        X7Z x7z3 = this.LJLLI;
        LJII2.getClass();
        C63143OqJ.LJIIIIZZ(x7z3);
    }

    public final void LJ(boolean z) {
        synchronized (this) {
            if (!this.LJLJL) {
                SQLiteDatabase sQLiteDatabase = this.LJLJJL;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.LJLJJL.LJJIJIIJIL()) {
                    this.LJLJJL.LJIILIIL();
                }
                this.LJLJL = true;
            }
        }
    }

    public X7W(Context context, String str) {
        super(context, str, LJLLLLLL);
        this.LJLLI = new X7Z();
        this.LJLLJ = false;
        this.LJLLILLLL = str;
        if (C63308Osy.LJI().LIZLLL().LJJIJLIJ) {
            LJ(true);
            C63322OtC.LJFF("LocalWcdbOpenHelper constructor, has not password, enable WAL");
        } else {
            C63322OtC.LJFF("LocalWcdbOpenHelper constructor, has not password");
        }
    }
}
