package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.storage.db.RelationDatabase;
import com.ss.android.ugc.aweme.relation.storage.experiment.StorageConfig;

/* renamed from: X.2t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72582t4 {
    public static final C72562t2 LJFF = new Object() { // from class: X.2t2
    };
    public static volatile C72582t4 LJI;
    public final String LIZ;
    public final C790438i LIZIZ;
    public final StorageConfig LIZJ;
    public final RelationDatabase LIZLLL;
    public final C62822Ol8 LJ;

    public final boolean LIZ() {
        C790438i c790438i = this.LIZIZ;
        Long l = this.LIZJ.maxValidityPeriod;
        long LIZ = c790438i.LIZ();
        if (LIZ == -1 || l == null || System.currentTimeMillis() - LIZ > l.longValue()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorageContext(uid:");
        LIZ.append(this.LIZ);
        LIZ.append(", status:");
        LIZ.append(this.LIZIZ);
        LIZ.append(", config: ");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C72582t4(String str) {
        C790438i c790438i = new C790438i(str);
        StorageConfig storageConfig = (StorageConfig) C90343gc.LIZIZ.getValue();
        Context LIZIZ = EF7.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("relation_database_");
        LIZ.append(str);
        C0BW LIZ2 = C0BV.LIZ(LIZIZ, RelationDatabase.class, X1D.LIZIZ(LIZ));
        LIZ2.LJIIIIZZ = C0BY.WRITE_AHEAD_LOGGING;
        RelationDatabase relationDatabase = (RelationDatabase) LIZ2.LIZIZ();
        this.LIZ = str;
        this.LIZIZ = c790438i;
        this.LIZJ = storageConfig;
        this.LIZLLL = relationDatabase;
        this.LJ = C221108m2.LIZIZ(C69792oZ.LJLIL);
    }
}
