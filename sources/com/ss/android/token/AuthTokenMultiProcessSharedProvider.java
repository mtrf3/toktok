package com.ss.android.token;

import X.C16880lQ;
import X.C36840Ed2;
import X.C38354F3m;
import X.C38901fq;
import X.C43588H8u;
import X.C56672Kh;
import X.C66857QLt;
import X.C66953QPl;
import X.C79146V4k;
import X.F9J;
import X.FAK;
import X.FXA;
import X.JBR;
import X.X1D;
import Y.ARunnableS4S2100000_11;
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
import android.util.Log;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AuthTokenMultiProcessSharedProvider extends ContentProvider {
    public static String LJLJJL = null;
    public static Uri LJLJJLL = null;
    public static UriMatcher LJLJL = null;
    public static C66857QLt LJLJLJ = null;
    public static String LJLJLLL = "token_shared_preference";
    public SharedPreferences LJLIL;
    public final Map<String, Object> LJLILLLLZI = new ConcurrentHashMap();
    public volatile boolean LJLJI = false;
    public final Object LJLJJI = new Object();

    public final synchronized SharedPreferences LIZJ() {
        SharedPreferences sharedPreferences = this.LJLIL;
        if (sharedPreferences == null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(getContext()), 4, LJLJLLL);
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return sharedPreferences;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        C56672Kh.LIZ().LIZLLL("AuthTokenMultiProcessSharedProvider");
        if (!Logger.debug() || C36840Ed2.LIZ(getContext())) {
            if (LJLJL == null) {
                try {
                    Logger.debug();
                    LIZLLL(getContext());
                } catch (Exception e) {
                    C38901fq.LJI(e);
                    C16880lQ.LLLLIIL(e);
                    z = false;
                }
            }
            z = true;
            FAK LIZ = C56672Kh.LIZ();
            LIZ.getClass();
            LIZ.LJFF(SystemClock.uptimeMillis(), "AuthTokenMultiProcessSharedProvider");
            return z;
        }
        throw new IllegalAccessError("should be create in main process");
    }

    public static boolean LJ() {
        if (TextUtils.isEmpty(LJLJJL) || LJLJL == null) {
            return true;
        }
        return false;
    }

    public final void LIZ() {
        if (!this.LJLJI) {
            synchronized (this.LJLJJI) {
                if (!this.LJLJI) {
                    LJFF();
                    this.LJLJI = true;
                }
            }
        }
    }

    public final void LJFF() {
        SharedPreferences LIZJ = LIZJ();
        if (LIZJ == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : LIZJ.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && key != null) {
                ((ConcurrentHashMap) this.LJLILLLLZI).put(key, value);
            } else {
                try {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MultiProcessShareProvider loadValues key_ = ");
                    LIZ.append(key);
                    LIZ.append(" value_ = ");
                    LIZ.append(value);
                    FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key_", key);
                    jSONObject.put("value_", value);
                    C79146V4k.LJJLI("token_sp_error", jSONObject);
                } catch (Exception e) {
                    C38901fq.LJI(e);
                }
            }
        }
    }

    public static void LIZLLL(Context context) {
        String str;
        if (TextUtils.isEmpty(LJLJJL)) {
            String name = AuthTokenMultiProcessSharedProvider.class.getName();
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
                } catch (Exception e) {
                    C38901fq.LJI(e);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(context.getPackageName());
                LIZ.append(".auth_token.SHARE_PROVIDER_AUTHORITY");
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
        throw new IllegalStateException("Must Set AuthTokenMultiProcessSharedProvider Authority");
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
        Object obj;
        ARunnableS4S2100000_11 aRunnableS4S2100000_11;
        LIZ();
        if (LJ()) {
            return null;
        }
        if (LJLJL.match(uri) == 65536) {
            try {
                arrayList = new ArrayList();
                editor = null;
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("MultiProcessShareProvider reallly insert key = ");
                    LIZ.append(key);
                    LIZ.append(" value = ");
                    LIZ.append(C66953QPl.LIZIZ(value));
                    FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ));
                    if (key != null && ((obj = ((ConcurrentHashMap) this.LJLILLLLZI).get(key)) == null || !obj.equals(value))) {
                        ((ConcurrentHashMap) this.LJLILLLLZI).put(key, value);
                        FXA.LIZ("AuthTokenMultiProcessShared", "MultiProcessShareProvider reallly insert key = " + key + " value = " + C66953QPl.LIZIZ(value));
                        if (editor == null) {
                            editor = LIZJ().edit();
                        }
                        if (value instanceof String) {
                            editor.putString(key, (String) value);
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "string", 5);
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(key, ((Boolean) value).booleanValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "boolean", 5);
                        } else if (value instanceof Long) {
                            editor.putLong(key, ((Long) value).longValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "long", 5);
                        } else if (value instanceof Integer) {
                            editor.putInt(key, ((Integer) value).intValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "integer", 5);
                        } else if (value instanceof Float) {
                            editor.putFloat(key, ((Float) value).floatValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "float", 5);
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Unsupported type ");
                            LIZ2.append(uri);
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                        }
                        arrayList.add(aRunnableS4S2100000_11);
                    }
                }
            } catch (Exception e) {
                C38901fq.LJI(e);
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
        synchronized (AuthTokenMultiProcessSharedProvider.class) {
            if (LJLJJLL == null) {
                try {
                    Logger.debug();
                    LIZLLL(context);
                } catch (Exception e) {
                    C38901fq.LJI(e);
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
        if (LJ()) {
            return 0;
        }
        if (LJLJL.match(uri) == 65536) {
            try {
                ((ConcurrentHashMap) this.LJLILLLLZI).clear();
                LIZJ().edit().clear().commit();
                getContext().getContentResolver().notifyChange(LIZIZ(getContext(), "key", "type"), null);
            } catch (Exception e) {
                C38901fq.LJI(e);
            }
            return 0;
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0111: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:83886353), block:B:58:0x0111 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.MatrixCursor$RowBuilder] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Integer] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursor;
        MatrixCursor matrixCursor;
        int i;
        LIZ();
        Cursor cursor2 = null;
        Cursor cursor3 = null;
        if (LJ()) {
            return null;
        }
        if (LJLJL.match(uri) == 65536) {
            try {
                int i2 = 1;
                try {
                    if ("all".equals((String) ListProtector.get(uri.getPathSegments(), 1))) {
                        Map<String, ?> all = LIZJ().getAll();
                        matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                        while (true) {
                            cursor2 = cursor3;
                            if (it.hasNext()) {
                                Map.Entry<String, ?> next = it.next();
                                String key = next.getKey();
                                Object value = next.getValue();
                                ?? newRow = matrixCursor.newRow();
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
                                cursor3 = key;
                            }
                        }
                    } else {
                        String str4 = (String) ListProtector.get(uri.getPathSegments(), 0);
                        if (!((ConcurrentHashMap) this.LJLILLLLZI).containsKey(str4)) {
                            return null;
                        }
                        matrixCursor = new MatrixCursor(new String[]{str4});
                        ?? r4 = ((ConcurrentHashMap) this.LJLILLLLZI).get(str4);
                        MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
                        boolean z = r4 instanceof Boolean;
                        Cursor cursor4 = r4;
                        if (z) {
                            if (!((Boolean) r4).booleanValue()) {
                                i2 = 0;
                            }
                            cursor4 = Integer.valueOf(i2);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("MultiProcessShareProvider  get key = ");
                        LIZ.append(str4);
                        LIZ.append(" value = ");
                        LIZ.append(C66953QPl.LIZIZ(cursor4));
                        LIZ.append(" ");
                        LIZ.append(Log.getStackTraceString(new Exception()));
                        FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ));
                        newRow2.add(cursor4);
                        cursor2 = cursor4;
                    }
                    return matrixCursor;
                } catch (Exception e) {
                    e = e;
                    cursor2 = cursor;
                    C38901fq.LJI(e);
                    return cursor2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
        }
    }
}
