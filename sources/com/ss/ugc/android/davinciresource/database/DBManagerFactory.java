package com.ss.ugc.android.davinciresource.database;

import android.content.Context;
import com.ss.ugc.android.davinciresource.jni.DAVDBManagerFactory;
import com.ss.ugc.android.davinciresource.jni.IDAVDBManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DBManagerFactory extends DAVDBManagerFactory {
    public final Context context;
    public final ConcurrentHashMap<String, DAVDBManager> dbMap;

    public final Context getContext() {
        return this.context;
    }

    public DBManagerFactory(Context context) {
        o.LJIIJ(context, "context");
        this.context = context;
        this.dbMap = new ConcurrentHashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.android.davinciresource.jni.DAVDBManagerFactory
    public IDAVDBManager getDBManager(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "dav_default";
        }
        synchronized (this) {
            DAVDBManager dAVDBManager = this.dbMap.get(str2);
            if (dAVDBManager != null) {
                return dAVDBManager;
            }
            DAVDBManager dAVDBManager2 = new DAVDBManager(this.context, str2, null, 4, 0 == true ? 1 : 0);
            this.dbMap.put(str2, dAVDBManager2);
            return dAVDBManager2;
        }
    }

    public final void removeDBManager(String path) {
        o.LJIIJ(path, "path");
        synchronized (this) {
            if (this.dbMap.contains(path)) {
                this.dbMap.remove(path);
            }
        }
    }
}
