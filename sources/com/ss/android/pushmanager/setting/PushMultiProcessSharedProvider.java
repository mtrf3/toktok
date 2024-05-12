package com.ss.android.pushmanager.setting;

import X.C16880lQ;
import X.C36929EeT;
import X.C38354F3m;
import X.C43588H8u;
import X.C56672Kh;
import X.C66874QMk;
import X.F9J;
import X.FAK;
import X.JBR;
import X.QM0;
import X.X1D;
import Y.ARunnableS4S2100000_11;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.push.ActivityLifecycleObserver;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class PushMultiProcessSharedProvider extends ContentProvider {
    public static String LJLJJL;
    public static Uri LJLJJLL;
    public static UriMatcher LJLJL;
    public static C66874QMk LJLJLJ;
    public SharedPreferences LJLIL;
    public final Map<String, Object> LJLILLLLZI = new ConcurrentHashMap();
    public volatile boolean LJLJI = false;
    public final Object LJLJJI = new Object();

    public final synchronized SharedPreferences LIZJ() {
        SharedPreferences sharedPreferences = this.LJLIL;
        if (sharedPreferences == null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(getContext()), 4, "push_multi_process_config");
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return sharedPreferences;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        C56672Kh.LIZ().LIZLLL("PushMultiProcessSharedProvider");
        if (!Logger.debug() || C36929EeT.LJFF(getContext())) {
            QM0.LIZ((Application) C16880lQ.LLLLL(getContext()));
            if (LJLJL == null) {
                try {
                    Logger.debug();
                    LJ(getContext());
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    z = false;
                }
            }
            z = true;
            FAK LIZ = C56672Kh.LIZ();
            LIZ.getClass();
            LIZ.LJFF(SystemClock.uptimeMillis(), "PushMultiProcessSharedProvider");
            return z;
        }
        throw new IllegalAccessError("should be create in main process");
    }

    public static boolean LJFF() {
        if (TextUtils.isEmpty(LJLJJL) || LJLJL == null) {
            return true;
        }
        return false;
    }

    public final void LIZ() {
        if (!this.LJLJI) {
            synchronized (this.LJLJJI) {
                if (!this.LJLJI) {
                    SharedPreferences LIZJ = LIZJ();
                    if (LIZJ != null) {
                        for (Map.Entry<String, ?> entry : LIZJ.getAll().entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (key != null && value != null) {
                                ((ConcurrentHashMap) this.LJLILLLLZI).put(key, value);
                            }
                        }
                    }
                    this.LJLJI = true;
                }
            }
        }
    }

    public static synchronized C66874QMk LIZLLL(Context context) {
        C66874QMk c66874QMk;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (LJLJLJ == null) {
                LJLJLJ = new C66874QMk(context);
            }
            c66874QMk = LJLJLJ;
        }
        return c66874QMk;
    }

    public static void LJ(Context context) {
        String str;
        if (TextUtils.isEmpty(LJLJJL)) {
            String name = PushMultiProcessSharedProvider.class.getName();
            if (context == null || C38354F3m.LJ(name)) {
                str = null;
            } else {
                try {
                    for (ProviderInfo providerInfo : C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 8).providers) {
                        if (name.equals(providerInfo.name)) {
                            str = providerInfo.authority;
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(context.getPackageName());
                LIZ.append(".push.SHARE_PROVIDER_AUTHORITY");
                str = X1D.LIZIZ(LIZ);
            }
            LJLJJL = str;
        }
        if (!TextUtils.isEmpty(LJLJJL)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            LJLJL = uriMatcher;
            uriMatcher.addURI(LJLJJL, "*/*", 65536);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("content://");
            LIZ2.append(LJLJJL);
            LJLJJLL = UriProtector.parse(X1D.LIZIZ(LIZ2));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vnd.android.cursor.item/vnd.");
        return JBR.LJFF(LIZ, LJLJJL, ".item", LIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            LJLJJL = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        ArrayList arrayList;
        SharedPreferences.Editor editor;
        ARunnableS4S2100000_11 aRunnableS4S2100000_11;
        String str;
        LIZ();
        if (LJFF()) {
            return null;
        }
        if (LJLJL.match(uri) == 65536) {
            try {
                arrayList = new ArrayList();
                editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    Logger.debug();
                    if (value != null) {
                        Object obj = ((ConcurrentHashMap) this.LJLILLLLZI).get(key);
                        if (obj == null || !obj.equals(value)) {
                            ((ConcurrentHashMap) this.LJLILLLLZI).put(key, value);
                        }
                    } else {
                        ((ConcurrentHashMap) this.LJLILLLLZI).remove(key);
                    }
                    if (Logger.debug()) {
                        if (("MultiProcessShareProvider reallly insert key = " + key + " value = " + value) != null) {
                            str = value.toString();
                        } else {
                            str = "null";
                        }
                        Logger.d("PushService", str);
                    }
                    if (editor == null) {
                        editor = LIZJ().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else {
                        if (value instanceof String) {
                            editor.putString(key, (String) value);
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "string", 4);
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(key, ((Boolean) value).booleanValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "boolean", 4);
                        } else if (value instanceof Long) {
                            editor.putLong(key, ((Long) value).longValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "long", 4);
                        } else if (value instanceof Integer) {
                            editor.putInt(key, ((Integer) value).intValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "integer", 4);
                        } else if (value instanceof Float) {
                            editor.putFloat(key, ((Float) value).floatValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "float", 4);
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Unsupported type ");
                            LIZ.append(uri);
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                        }
                        arrayList.add(aRunnableS4S2100000_11);
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (editor == null) {
                return null;
            }
            editor.apply();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return null;
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }

    public static final synchronized Uri LIZIZ(Context context, String str, String str2) {
        Uri build;
        synchronized (PushMultiProcessSharedProvider.class) {
            if (LJLJJLL == null) {
                try {
                    Logger.debug();
                    LJ(context);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            build = LJLJJLL.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        LIZ();
        if (LJFF() || LJLJL.match(uri) == 65536) {
            return 0;
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Object obj;
        boolean z;
        int i;
        LIZ();
        MatrixCursor matrixCursor2 = null;
        if (LJFF()) {
            return null;
        }
        if (LJLJL.match(uri) == 65536) {
            try {
                int i2 = 1;
                if ("all".equals((String) ListProtector.get(uri.getPathSegments(), 1))) {
                    Map<String, ?> all = LIZJ().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    try {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                            String str3 = "string";
                            if (!(value instanceof String)) {
                                if (value instanceof Boolean) {
                                    str3 = "boolean";
                                    if (((Boolean) value).booleanValue()) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    value = Integer.valueOf(i);
                                } else if (value instanceof Integer) {
                                    str3 = "integer";
                                } else if (value instanceof Long) {
                                    str3 = "long";
                                } else if (value instanceof Float) {
                                    str3 = "float";
                                }
                            }
                            newRow.add(key);
                            newRow.add(value);
                            newRow.add(str3);
                        }
                    } catch (Exception unused) {
                        matrixCursor2 = matrixCursor;
                        return matrixCursor2;
                    }
                } else {
                    String str4 = (String) ListProtector.get(uri.getPathSegments(), 0);
                    boolean LIZJ = C38354F3m.LIZJ(str4, "current_app_state");
                    boolean LIZJ2 = C38354F3m.LIZJ(str4, "current_app_foreground");
                    if (!((ConcurrentHashMap) this.LJLILLLLZI).containsKey(str4) && !LIZJ && !LIZJ2) {
                        return null;
                    }
                    matrixCursor = new MatrixCursor(new String[]{str4});
                    try {
                        if (LIZJ) {
                            obj = Boolean.valueOf(ActivityLifecycleObserver.getIns().isApplicationActive());
                        } else if (LIZJ2) {
                            if (!ActivityLifecycleObserver.getIns().isBackGround()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            obj = Boolean.valueOf(z);
                        } else {
                            obj = ((ConcurrentHashMap) this.LJLILLLLZI).get(str4);
                        }
                        MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
                        if (obj instanceof Boolean) {
                            if (!((Boolean) obj).booleanValue()) {
                                i2 = 0;
                            }
                            obj = Integer.valueOf(i2);
                        }
                        Logger.debug();
                        newRow2.add(obj);
                    } catch (Exception unused2) {
                        matrixCursor2 = matrixCursor;
                        return matrixCursor2;
                    }
                }
                return matrixCursor;
            } catch (Exception unused3) {
            }
        } else {
            throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
        }
    }
}
