package com.bytedance.common.wschannel;

import X.C16880lQ;
import X.C36842Ed4;
import X.C38354F3m;
import X.C43588H8u;
import X.C56672Kh;
import X.C66454Q6g;
import X.C66879QMp;
import X.F9J;
import X.FAK;
import X.JBR;
import X.QOM;
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
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class WsChannelMultiProcessSharedProvider extends ContentProvider {
    public static String LJLJJI;
    public static Uri LJLJJL;
    public static UriMatcher LJLJJLL;
    public static boolean LJLJL;
    public static volatile boolean LJLJLJ;
    public static C66454Q6g LJLJLLL;
    public SharedPreferences LJLIL;
    public final Map<String, Object> LJLILLLLZI = new ConcurrentHashMap();
    public final Object LJLJI = new Object();

    public final synchronized SharedPreferences LIZIZ() {
        SharedPreferences sharedPreferences = this.LJLIL;
        if (sharedPreferences == null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(C16880lQ.LLLLL(getContext()), 4, "wschannel_multi_process_config");
            this.LJLIL = LIZIZ;
            return LIZIZ;
        }
        return sharedPreferences;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C56672Kh.LIZ().LIZLLL("WsChannelMultiProcessSharedProvider");
        boolean z = true;
        if (C36842Ed4.LIZLLL(getContext())) {
            LJLJL = true;
        }
        Application application = (Application) C16880lQ.LLLLL(getContext());
        C66879QMp c66879QMp = new C66879QMp();
        c66879QMp.LJLILLLLZI = new QOM(application);
        application.registerActivityLifecycleCallbacks(c66879QMp);
        if (LJLJJLL == null) {
            try {
                Logger.debug();
                LIZJ(getContext());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                z = false;
            }
        }
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "WsChannelMultiProcessSharedProvider");
        return z;
    }

    public final void LIZLLL() {
        if (!LJLJLJ) {
            synchronized (this.LJLJI) {
                if (!LJLJLJ) {
                    SharedPreferences LIZIZ = LIZIZ();
                    if (LIZIZ == null) {
                        LJLJLJ = true;
                        return;
                    }
                    for (Map.Entry<String, ?> entry : LIZIZ.getAll().entrySet()) {
                        ((ConcurrentHashMap) this.LJLILLLLZI).put(entry.getKey(), entry.getValue());
                    }
                    LJLJLJ = true;
                }
            }
        }
    }

    public static void LIZJ(Context context) {
        String str;
        if (TextUtils.isEmpty(LJLJJI)) {
            String name = WsChannelMultiProcessSharedProvider.class.getName();
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
            LJLJJI = str;
        }
        if (!TextUtils.isEmpty(LJLJJI)) {
            Logger.debug();
            UriMatcher uriMatcher = new UriMatcher(-1);
            LJLJJLL = uriMatcher;
            uriMatcher.addURI(LJLJJI, "*/*", 65536);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("content://");
            LIZ.append(LJLJJI);
            LJLJJL = UriProtector.parse(X1D.LIZIZ(LIZ));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vnd.android.cursor.item/vnd.");
        return JBR.LJFF(LIZ, LJLJJI, ".item", LIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            LJLJJI = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        ArrayList arrayList;
        SharedPreferences.Editor editor;
        ARunnableS4S2100000_11 aRunnableS4S2100000_11;
        String str;
        if (LJLJJLL.match(uri) == 65536) {
            try {
                LIZLLL();
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
                        Logger.v("PushService", str);
                    }
                    if (editor == null) {
                        editor = LIZIZ().edit();
                    }
                    if (value == null) {
                        editor.remove(key);
                    } else {
                        if (value instanceof String) {
                            editor.putString(key, (String) value);
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "string", 3);
                        } else if (value instanceof Boolean) {
                            editor.putBoolean(key, ((Boolean) value).booleanValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "boolean", 3);
                        } else if (value instanceof Long) {
                            editor.putLong(key, ((Long) value).longValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "long", 3);
                        } else if (value instanceof Integer) {
                            editor.putInt(key, ((Integer) value).intValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "integer", 3);
                        } else if (value instanceof Float) {
                            editor.putFloat(key, ((Float) value).floatValue());
                            aRunnableS4S2100000_11 = new ARunnableS4S2100000_11(this, key, "float", 3);
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Unsupported type ");
                            LIZ.append(uri);
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                        }
                        arrayList.add(aRunnableS4S2100000_11);
                    }
                }
            } catch (Exception unused) {
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

    public static final synchronized Uri LIZ(Context context, String str, String str2) {
        Uri build;
        synchronized (WsChannelMultiProcessSharedProvider.class) {
            if (LJLJJL == null) {
                try {
                    Logger.debug();
                    LIZJ(context);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            build = LJLJJL.buildUpon().appendPath(str).appendPath(str2).build();
        }
        return build;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        if (LJLJJLL.match(uri) == 65536) {
            try {
                LIZIZ().edit().clear().commit();
                ((ConcurrentHashMap) this.LJLILLLLZI).clear();
                getContext().getContentResolver().notifyChange(LIZ(getContext(), "key", "type"), null);
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
        if (LJLJJLL.match(uri) == 65536) {
            String str4 = null;
            try {
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
                    LIZLLL();
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
