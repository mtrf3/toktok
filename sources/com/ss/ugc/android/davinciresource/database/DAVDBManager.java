package com.ss.ugc.android.davinciresource.database;

import X.X1D;
import android.content.Context;
import com.ss.ugc.android.davinciresource.DavinciResource;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;
import com.ss.ugc.android.davinciresource.jni.IDAVDBManager;
import com.ss.ugc.android.davinciresource.jni.PairStringString;
import com.ss.ugc.android.davinciresource.jni.VecPairStringString;
import com.ss.ugc.android.davinciresource.jni.VecString;
import com.ss.ugc.android.davinciresource.jni.VecVecString;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DAVDBManager extends IDAVDBManager {
    public static final Companion Companion = new Companion();
    public final Context context;
    public String dbName;
    public DAVSQLiteHelper sqLiteOpenHelper;

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean Open() {
        return true;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean Close() {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            dAVSQLiteHelper.close();
        }
        DBManagerFactory dbManagerFactory = DavinciResource.INSTANCE.getDbManagerFactory();
        if (dbManagerFactory != null) {
            dbManagerFactory.removeDBManager(this.dbName);
            return true;
        }
        return true;
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getDbName() {
        return this.dbName;
    }

    public final DAVSQLiteHelper getSqLiteOpenHelper() {
        return this.sqLiteOpenHelper;
    }

    private final void errorLog(String str) {
        DAVLoggerListener logger = DavinciResource.INSTANCE.getLogger();
        if (logger != null) {
            DAVLogLevel dAVLogLevel = DAVLogLevel.LEVEL_ERROR;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DAVDBManager:");
            LIZ.append(str);
            logger.onLog(dAVLogLevel, X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetAllData(String str) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getAllData();
            } catch (Exception e) {
                errorLog(e.getMessage());
            }
        }
        return new VecVecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public void InitConfig(String str) {
        if (str != null) {
            this.dbName = str;
        }
    }

    public final void setDbName(String str) {
        o.LJIIJ(str, "<set-?>");
        this.dbName = str;
    }

    public final void setSqLiteOpenHelper(DAVSQLiteHelper dAVSQLiteHelper) {
        this.sqLiteOpenHelper = dAVSQLiteHelper;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean CreateTable(VecString vecString, String str) {
        if (vecString == null || vecString.isEmpty() || str == null || ujb.o.LJJJJJL(str)) {
            return false;
        }
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = vecString.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            this.sqLiteOpenHelper = new DAVSQLiteHelper(this.context, this.dbName, str, arrayList, 1);
        }
        return true;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecString GetDatas(String str, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getDatas(str);
            } catch (Exception e) {
                errorLog(e.getMessage());
            }
        }
        return new VecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean RemoveData(String str, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.removeData(str);
            } catch (Exception e) {
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAVDBManager(Context context, String dbName, DAVSQLiteHelper dAVSQLiteHelper) {
        super(dbName);
        o.LJIIJ(context, "context");
        o.LJIIJ(dbName, "dbName");
        this.context = context;
        this.dbName = dbName;
        this.sqLiteOpenHelper = dAVSQLiteHelper;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecString GetData(PairStringString pairStringString, String str, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(pairStringString, str);
            } catch (Exception e) {
                errorLog(e.getMessage());
            }
        }
        return new VecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean InsertData(String str, VecPairStringString vecPairStringString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.insertData(str, vecPairStringString);
            } catch (Exception e) {
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean UpdateData(String str, VecPairStringString vecPairStringString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.updateData(str, vecPairStringString);
            } catch (Exception e) {
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetData(PairStringString pairStringString, boolean z, String str) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(pairStringString, z);
            } catch (Exception e) {
                errorLog(e.getMessage());
            }
        }
        return new VecVecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean InsertData(String str, VecString vecString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.insertData(str, vecString);
            } catch (Exception e) {
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public boolean UpdateData(String str, VecString vecString, String str2) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.updateData(str, vecString);
            } catch (Exception e) {
                errorLog(e.getMessage());
                return false;
            }
        }
        return false;
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetData(VecPairStringString vecPairStringString, boolean z, String str) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(vecPairStringString, z);
            } catch (Exception e) {
                errorLog(e.getMessage());
            }
        }
        return new VecVecString();
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public String GetData(String str, String str2, String str3) {
        DAVSQLiteHelper dAVSQLiteHelper = this.sqLiteOpenHelper;
        if (dAVSQLiteHelper != null) {
            try {
                return dAVSQLiteHelper.getData(str, str2);
            } catch (Exception e) {
                errorLog(e.getMessage());
                return "";
            }
        }
        return "";
    }

    public /* synthetic */ DAVDBManager(Context context, String str, DAVSQLiteHelper dAVSQLiteHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? null : dAVSQLiteHelper);
    }

    @Override // com.ss.ugc.android.davinciresource.jni.IDAVDBManager
    public VecVecString GetDataByRange(String str, String str2, String str3, VecPairStringString vecPairStringString, boolean z, String str4) {
        return new VecVecString();
    }
}
