package X;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.13m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C268213m extends SQLiteOpenHelper {
    public final C38451f7[] LJLIL;
    public final AbstractC262311f LJLILLLLZI;
    public boolean LJLJI;

    public final synchronized InterfaceC262211e LIZIZ() {
        this.LJLJI = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (this.LJLJI) {
            close();
            return LIZIZ();
        }
        return LIZ(writableDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.LJLIL[0] = null;
    }

    public final C38451f7 LIZ(SQLiteDatabase sQLiteDatabase) {
        C38451f7[] c38451f7Arr = this.LJLIL;
        C38451f7 c38451f7 = c38451f7Arr[0];
        if (c38451f7 == null || c38451f7.LJLIL != sQLiteDatabase) {
            c38451f7Arr[0] = new C38451f7(sQLiteDatabase);
        }
        return c38451f7Arr[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AbstractC262311f abstractC262311f = this.LJLILLLLZI;
        LIZ(sQLiteDatabase);
        abstractC262311f.LIZIZ();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.LJLILLLLZI.LIZJ(LIZ(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.LJLJI) {
            this.LJLILLLLZI.LJ(LIZ(sQLiteDatabase));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LJLJI = true;
        this.LJLILLLLZI.LIZLLL(LIZ(sQLiteDatabase), i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LJLJI = true;
        this.LJLILLLLZI.LJFF(LIZ(sQLiteDatabase), i, i2);
    }

    public C268213m(Context context, String str, final C38451f7[] c38451f7Arr, final AbstractC262311f abstractC262311f) {
        super(context, str, null, abstractC262311f.LIZ, new DatabaseErrorHandler() { // from class: X.13l
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                AbstractC262311f abstractC262311f2 = AbstractC262311f.this;
                C38451f7[] c38451f7Arr2 = c38451f7Arr;
                C38451f7 c38451f7 = c38451f7Arr2[0];
                if (c38451f7 == null || c38451f7.LJLIL != sQLiteDatabase) {
                    c38451f7Arr2[0] = new C38451f7(sQLiteDatabase);
                }
                C38451f7 c38451f72 = c38451f7Arr2[0];
                abstractC262311f2.getClass();
                if (!c38451f72.isOpen()) {
                    AbstractC262311f.LIZ(c38451f72.LIZJ());
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = c38451f72.LIZIZ();
                    } finally {
                        if (list != null) {
                            Iterator<Pair<String, String>> it = list.iterator();
                            while (it.hasNext()) {
                                AbstractC262311f.LIZ((String) it.next().second);
                            }
                        } else {
                            AbstractC262311f.LIZ(c38451f72.LIZJ());
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c38451f72.close();
                } catch (IOException unused2) {
                }
            }
        });
        this.LJLILLLLZI = abstractC262311f;
        this.LJLIL = c38451f7Arr;
    }
}
