package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* renamed from: X.QHz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66759QHz extends SQLiteOpenHelper {
    public final /* synthetic */ C66758QHy LJLIL;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            Iterator<QI2> it = this.LJLIL.LIZJ.values().iterator();
            while (it.hasNext()) {
                String LIZIZ = it.next().LIZIZ();
                if (LIZIZ != null) {
                    sQLiteDatabase.execSQL(LIZIZ);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66759QHz(C66758QHy c66758QHy, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 51);
        this.LJLIL = c66758QHy;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.LJLIL.LJI().LJIJI(5, null, C48263Iwt.LIZLLL("onUpgrade, ", i, ", ", i2), new Object[0]);
        try {
            sQLiteDatabase.beginTransaction();
            for (QI2 qi2 : this.LJLIL.LIZJ.values()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DROP TABLE IF EXISTS ");
                LIZ.append(qi2.LJIIIZ());
                sQLiteDatabase.execSQL(X1D.LIZIZ(LIZ));
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
                C66735QHb.LJ(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
            }
        }
        C66735QHb.LJ(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
