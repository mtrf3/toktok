package com.bytedance.pitaya.feature;

import X.C93273aOD;
import android.database.Cursor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes30.dex */
public abstract class Database implements ReflectionCall {
    public static final C93273aOD Companion = new C93273aOD();
    public final String dbName;

    public abstract boolean beginTransaction();

    public abstract void close();

    public abstract boolean commit();

    public abstract boolean open();

    public abstract SQLResult query(String str, List<String> list);

    public abstract boolean rollback();

    public abstract SQLResult update(String str, Object[] objArr);

    public final String getDbName() {
        return this.dbName;
    }

    public Database(String dbName) {
        o.LJIIJ(dbName, "dbName");
        this.dbName = dbName;
    }

    public final List<SQLColumn> parse(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String[] columnNames = cursor.getColumnNames();
        ArrayList arrayList = new ArrayList();
        for (String str : columnNames) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                int type = cursor.getType(columnIndex);
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            try {
                                arrayList.add(new SQLColumn(str, 3, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0L, cursor.getString(columnIndex), 12, null));
                            } catch (JSONException e) {
                                PitayaLogger.LJ(e, null, 6);
                            }
                        }
                    } else {
                        arrayList.add(new SQLColumn(str, 2, cursor.getDouble(columnIndex), 0L, null, 24, null));
                    }
                } else {
                    arrayList.add(new SQLColumn(str, 1, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, cursor.getLong(columnIndex), null, 20, null));
                }
            }
        }
        return arrayList;
    }
}
