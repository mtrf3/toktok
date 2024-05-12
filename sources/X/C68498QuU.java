package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QuU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68498QuU extends AbstractC23740wU {
    public C68498QuU() {
        super(1, 2);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 database) {
        o.LJIIJ(database, "database");
        try {
            database.LJJIJIIJI("ALTER TABLE t_synclog ADD COLUMN req_id TEXT");
        } finally {
        }
    }
}
