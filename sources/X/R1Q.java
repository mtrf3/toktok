package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R1Q extends AbstractC23740wU {
    public static final R1Q LIZJ = new R1Q();

    public R1Q() {
        super(24, 25);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 db) {
        o.LJIIIZ(db, "db");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ALTER table FRIENDS_RELATION RENAME TO ");
        LIZ.append("Familiar_TEMP_TABLE");
        db.LJJIJIIJI(X1D.LIZIZ(LIZ));
        db.LJJIJIIJI(ORY.LJJJJLL(R1S.values(), ",", "create table if not exists FRIENDS_RELATION (", ")", R1R.LJLIL, 24));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("INSERT INTO FRIENDS_RELATION (SEC_UID, RELATION_TYPE, CREATED_TIME) SELECT SEC_UID, RELATION_TYPE, CREATED_TIME FROM ");
        LIZ2.append("Familiar_TEMP_TABLE");
        db.LJJIJIIJI(X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("DROP table ");
        LIZ3.append("Familiar_TEMP_TABLE");
        db.LJJIJIIJI(X1D.LIZIZ(LIZ3));
    }
}
