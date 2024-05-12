package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YWQ extends AbstractC23740wU {
    public static final YWQ LIZJ = new YWQ();

    public YWQ() {
        super(26, 27);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 db) {
        o.LJIIIZ(db, "db");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ALTER table SIMPLE_USER add column ");
        EnumC87514YWg enumC87514YWg = EnumC87514YWg.COLUMN_FOLLOWER_COUNT;
        LIZ.append(enumC87514YWg.key);
        LIZ.append(' ');
        LIZ.append(enumC87514YWg.type);
        db.LJJIJIIJI(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("ALTER table SIMPLE_USER add column ");
        EnumC87514YWg enumC87514YWg2 = EnumC87514YWg.COLUMN_FOLLOWING_COUNT;
        LIZ2.append(enumC87514YWg2.key);
        LIZ2.append(' ');
        LIZ2.append(enumC87514YWg2.type);
        db.LJJIJIIJI(X1D.LIZIZ(LIZ2));
    }
}
