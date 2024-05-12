package X;

import com.tencent.wcdb.database.SQLiteConnection;

/* renamed from: X.X7x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84333X7x extends C35977EAb<String, C84332X7w> {
    public final /* synthetic */ SQLiteConnection LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C84333X7x(SQLiteConnection sQLiteConnection, int i) {
        super(i);
        this.LJFF = sQLiteConnection;
    }

    @Override // X.C35977EAb
    public final void LIZ(Object obj, Object obj2, Object obj3) {
        C84332X7w c84332X7w = (C84332X7w) obj2;
        c84332X7w.LJI = false;
        if (!c84332X7w.LJII) {
            this.LJFF.LJIIJ(c84332X7w);
        }
    }
}
