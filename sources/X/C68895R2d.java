package X;

import kotlin.jvm.internal.o;

/* renamed from: X.R2d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68895R2d extends AbstractC23740wU {
    public C68895R2d() {
        super(1, 2);
    }

    @Override // X.AbstractC23740wU
    public final void LIZ(C38451f7 database) {
        o.LJIIIZ(database, "database");
        database.LJJIJIIJI("ALTER TABLE `AWEME_READ_RECORD` ADD COLUMN `SCENE` INTEGER NOT NULL DEFAULT 0");
        database.LJJIJIIJI("ALTER TABLE `AWEME_READ_RECORD` ADD COLUMN `INSERT_TIME` INTEGER NOT NULL DEFAULT 0");
        database.LJJIJIIJI("CREATE TABLE IF NOT EXISTS `NEW_AWEME_READ_RECORD` (`AWEME_ID` TEXT NOT NULL, `READ_TIME` INTEGER NOT NULL, `PAGE_TYPE` INTEGER NOT NULL, `REPORTED` INTEGER NOT NULL DEFAULT 0, `USER_ID` TEXT NOT NULL, `INSERT_TIME` INTEGER NOT NULL, `SCENE` INTEGER NOT NULL,  PRIMARY KEY(`AWEME_ID`, `SCENE`))");
        database.LJJIJIIJI("INSERT INTO NEW_AWEME_READ_RECORD (AWEME_ID, READ_TIME, PAGE_TYPE, REPORTED, USER_ID, INSERT_TIME, SCENE) SELECT AWEME_ID, READ_TIME, PAGE_TYPE, REPORTED, USER_ID, READ_TIME, SCENE FROM AWEME_READ_RECORD");
        database.LJJIJIIJI("DROP TABLE AWEME_READ_RECORD");
        database.LJJIJIIJI("ALTER TABLE NEW_AWEME_READ_RECORD RENAME TO AWEME_READ_RECORD");
    }
}