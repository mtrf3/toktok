package com.ss.android.common.util;

import X.C16880lQ;
import X.C38354F3m;
import X.C43588H8u;
import X.C56672Kh;
import X.F9J;
import X.FAK;
import X.FK5;
import X.JBR;
import X.X1D;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class MultiProcessSharedProvider extends ContentProvider {
    public static String LJLJI;
    public static Uri LJLJJI;
    public static UriMatcher LJLJJL;
    public static FK5 LJLJJLL;
    public SharedPreferences LJLIL;
    public Map<String, Object> LJLILLLLZI;

    public final synchronized SharedPreferences LIZIZ() {
        SharedPreferences sharedPreferences = this.LJLIL;
        if (sharedPreferences == null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(getContext()), 4, "multi_process_config");
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return sharedPreferences;
    }

    public final synchronized void LJ() {
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = new ConcurrentHashMap();
            SharedPreferences LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                for (Map.Entry<String, ?> entry : LIZIZ.getAll().entrySet()) {
                    this.LJLILLLLZI.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        C56672Kh.LIZ().LIZLLL("MultiProcessSharedProvider");
        if (LJLJJL == null) {
            try {
                Logger.debug();
                LIZLLL(getContext());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                z = false;
            }
        }
        try {
            C16880lQ.LLLL(getContext(), new Intent(getContext(), Class.forName("com.ss.android.newmedia.message.MessageHandler")));
        } catch (Throwable unused) {
        }
        z = true;
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "MultiProcessSharedProvider");
        return z;
    }

    public static synchronized FK5 LIZJ(Context context) {
        FK5 fk5;
        synchronized (MultiProcessSharedProvider.class) {
            if (LJLJJLL == null) {
                LJLJJLL = new FK5(context);
            }
            fk5 = LJLJJLL;
        }
        return fk5;
    }

    public static void LIZLLL(Context context) {
        String str;
        if (TextUtils.isEmpty(LJLJI)) {
            String name = MultiProcessSharedProvider.class.getName();
            if (context != null && !C38354F3m.LJ(name)) {
                try {
                    for (ProviderInfo providerInfo : C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 8).providers) {
                        if (name.equals(providerInfo.name)) {
                            str = providerInfo.authority;
                            break;
                        }
                    }
                } catch (Exception unused) {
                }
            }
            str = null;
            LJLJI = str;
            if (!TextUtils.isEmpty(str)) {
                Logger.debug();
            } else {
                throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
            }
        }
        UriMatcher uriMatcher = new UriMatcher(-1);
        LJLJJL = uriMatcher;
        uriMatcher.addURI(LJLJI, "*/*", 65536);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("content://");
        LIZ.append(LJLJI);
        LJLJJI = UriProtector.parse(X1D.LIZIZ(LIZ));
    }

    public final void LJFF(Uri uri) {
        getContext().getContentResolver().notifyChange(uri, null);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vnd.android.cursor.item/vnd.");
        return JBR.LJFF(LIZ, LJLJI, ".item", LIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        LJLJI = providerInfo.authority;
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        SharedPreferences.Editor editor;
        if (LJLJJL.match(uri) == 65536) {
            try {
                LJ();
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
                    Logger.debug();
                    if (editor == null) {
                        editor = LIZIZ().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else if (value instanceof String) {
                        editor.putString(key, (String) value);
                        LJFF(LIZ(getContext(), key, "string"));
                    } else if (value instanceof Boolean) {
                        editor.putBoolean(key, ((Boolean) value).booleanValue());
                        LJFF(LIZ(getContext(), key, "boolean"));
                    } else if (value instanceof Long) {
                        editor.putLong(key, ((Long) value).longValue());
                        LJFF(LIZ(getContext(), key, "long"));
                    } else if (value instanceof Integer) {
                        editor.putInt(key, ((Integer) value).intValue());
                        LJFF(LIZ(getContext(), key, "integer"));
                    } else if (value instanceof Float) {
                        editor.putFloat(key, ((Float) value).floatValue());
                        LJFF(LIZ(getContext(), key, "float"));
                    } else {
                        throw new IllegalArgumentException("Unsupported type " + uri);
                    }
                }
            } catch (Exception unused) {
            }
            if (editor == null) {
                return null;
            }
            editor.apply();
            return null;
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }

    public static final synchronized Uri LIZ(Context context, String str, String str2) {
        Uri build;
        synchronized (MultiProcessSharedProvider.class) {
            if (LJLJJI == null) {
                try {
                    Logger.debug();
                    LIZLLL(context);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            build = LJLJJI.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (LJLJJL.match(uri) == 65536) {
            try {
                LJ();
                LIZIZ().edit().clear().commit();
                ((ConcurrentHashMap) this.LJLILLLLZI).clear();
                LJFF(LIZ(getContext(), "key", "type"));
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00da: MOVE (r5 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:83886298), block:B:53:0x00da */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.database.Cursor] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        MatrixCursor matrixCursor;
        int i2;
        if (LJLJJL.match(uri) == 65536) {
            String str4 = null;
            try {
                LJ();
                i = 1;
            } catch (Exception unused) {
            }
            try {
                if ("all".equals((String) ListProtector.get(uri.getPathSegments(), 1))) {
                    Map<String, ?> all = LIZIZ().getAll();
                    matrixCursor = new MatrixCursor(new String[]{"key_column", "value_column", "type_column"});
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        str4 = entry.getKey();
                        Object value = entry.getValue();
                        MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
                        String str5 = "string";
                        if (!(value instanceof String)) {
                            if (value instanceof Boolean) {
                                str5 = "boolean";
                                if (((Boolean) value).booleanValue()) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                value = Integer.valueOf(i2);
                            } else if (value instanceof Integer) {
                                str5 = "integer";
                            } else if (value instanceof Long) {
                                str5 = "long";
                            } else if (value instanceof Float) {
                                str5 = "float";
                            }
                        }
                        newRow.add(str4);
                        newRow.add(value);
                        newRow.add(str5);
                    }
                } else {
                    String str6 = (String) ListProtector.get(uri.getPathSegments(), 0);
                    if (!((ConcurrentHashMap) this.LJLILLLLZI).containsKey(str6)) {
                        return null;
                    }
                    matrixCursor = new MatrixCursor(new String[]{str6});
                    Object obj = ((ConcurrentHashMap) this.LJLILLLLZI).get(str6);
                    MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
                    if (obj instanceof Boolean) {
                        if (!((Boolean) obj).booleanValue()) {
                            i = 0;
                        }
                        obj = Integer.valueOf(i);
                    }
                    Logger.debug();
                    newRow2.add(obj);
                }
                return matrixCursor;
            } catch (Exception unused2) {
                str4 = str3;
                return str4;
            }
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }
}
