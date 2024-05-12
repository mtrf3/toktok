package X;

import com.tencent.wcdb.database.SQLiteDatabase;

/* renamed from: X.X7k, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84320X7k extends ThreadLocal<C84325X7p> {
    public final /* synthetic */ SQLiteDatabase LIZ;

    @Override // java.lang.ThreadLocal
    public final C84325X7p initialValue() {
        C84326X7q c84326X7q;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        synchronized (sQLiteDatabase.LJLJJI) {
            sQLiteDatabase.LJJJJ();
            c84326X7q = sQLiteDatabase.LJLJJLL;
        }
        return new C84325X7p(c84326X7q);
    }

    public C84320X7k(SQLiteDatabase sQLiteDatabase) {
        this.LIZ = sQLiteDatabase;
    }
}
