package com.bytedance.pitaya.feature;

import X.C93317aOv;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class DBCreator implements ReflectionCall {
    public static final DBCreator INSTANCE = new DBCreator();

    public final Database createNewDB(String dbName) {
        o.LJIIJ(dbName, "dbName");
        return new DatabaseDefaultImpl(dbName);
    }

    public final long dbFileSize(String dbName) {
        o.LJIIJ(dbName, "dbName");
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null) {
            return LIZ.getDatabasePath(dbName).length();
        }
        return 0L;
    }

    public final void delete(String dbName) {
        o.LJIIJ(dbName, "dbName");
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null) {
            SQLiteDatabase.deleteDatabase(LIZ.getDatabasePath(dbName));
        }
    }

    public final String getDBPathFromName(String dbName) {
        File databasePath;
        String absolutePath;
        o.LJIIJ(dbName, "dbName");
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null && (databasePath = LIZ.getDatabasePath(dbName)) != null && (absolutePath = databasePath.getAbsolutePath()) != null) {
            return absolutePath;
        }
        return "";
    }
}
