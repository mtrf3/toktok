package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWR extends AbstractC23740wU {
    public static final YWR LIZJ = new YWR();

    public YWR() {
        super(31, 32);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 database) {
        o.LJIIIZ(database, "database");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ALTER TABLE SIMPLE_USER ADD COLUMN ");
        EnumC87514YWg enumC87514YWg = EnumC87514YWg.COLUMN_WELCOME_MESSAGE_ENABLED;
        LIZ.append(enumC87514YWg.key);
        LIZ.append(' ');
        LIZ.append(enumC87514YWg.type);
        database.LJJIJIIJI(X1D.LIZIZ(LIZ));
    }
}
