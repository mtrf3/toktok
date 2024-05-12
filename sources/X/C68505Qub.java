package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Qub, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68505Qub extends AbstractC23740wU {
    public static final C68505Qub LIZJ = new C68505Qub();

    public C68505Qub() {
        super(25, 26);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 db) {
        o.LJIIIZ(db, "db");
        db.LJJIJIIJI("DROP TABLE IF EXISTS dummy_migration_table");
    }
}
