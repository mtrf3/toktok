package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWT extends AbstractC23740wU {
    public static final YWT LIZJ = new YWT();

    public YWT() {
        super(28, 29);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 database) {
        o.LJIIIZ(database, "database");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ALTER TABLE SIMPLE_USER ADD COLUMN ");
        EnumC87514YWg enumC87514YWg = EnumC87514YWg.COLUMN_AVATAR_MEDIUM;
        LIZ.append(enumC87514YWg.key);
        LIZ.append(' ');
        LIZ.append(enumC87514YWg.type);
        database.LJJIJIIJI(X1D.LIZIZ(LIZ));
    }
}
