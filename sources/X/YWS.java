package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWS extends AbstractC23740wU {
    public static final YWS LIZJ = new YWS();

    public YWS() {
        super(27, 28);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 database) {
        o.LJIIIZ(database, "database");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ALTER TABLE SIMPLE_USER ADD COLUMN ");
        EnumC87514YWg enumC87514YWg = EnumC87514YWg.COLUMN_INTERNAL_SHARE_VERSION;
        LIZ.append(enumC87514YWg.key);
        LIZ.append(' ');
        LIZ.append(enumC87514YWg.type);
        database.LJJIJIIJI(X1D.LIZIZ(LIZ));
    }
}
