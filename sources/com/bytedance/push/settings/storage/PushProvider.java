package com.bytedance.push.settings.storage;

import X.C16880lQ;
import X.C43588H8u;
import X.C56672Kh;
import X.C58220Mt6;
import X.C66859QLv;
import X.FAK;
import X.InterfaceC66858QLu;
import X.JBR;
import X.PT6;
import X.PT9;
import X.X1D;
import Y.ARunnableS1S3100000_11;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class PushProvider extends ContentProvider {
    public static String LJLIL;
    public static Uri LJLILLLLZI;
    public static UriMatcher LJLJI;
    public static volatile boolean LJLJJI;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C56672Kh.LIZ().LIZLLL("PushProvider");
        boolean z = true;
        LJLJJI = true;
        if (LJLJI == null) {
            try {
                LIZIZ(getContext());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                z = false;
            }
        }
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "PushProvider");
        return z;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public static void LIZIZ(Context context) {
        String str;
        if (TextUtils.isEmpty(LJLIL)) {
            String name = PushProvider.class.getName();
            if (context == null) {
                str = null;
            } else {
                try {
                    if (!TextUtils.isEmpty(name)) {
                        for (ProviderInfo providerInfo : C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 8).providers) {
                            if (name.equals(providerInfo.name)) {
                                str = providerInfo.authority;
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                str = context.getPackageName() + ".push.settings";
            }
            LJLIL = str;
        }
        if (!TextUtils.isEmpty(LJLIL)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            LJLJI = uriMatcher;
            uriMatcher.addURI(LJLIL, "*/*/*/*", 65536);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("content://");
            LIZ.append(LJLIL);
            LJLILLLLZI = UriProtector.parse(X1D.LIZIZ(LIZ));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vnd.android.cursor.item/vnd.");
        return JBR.LJFF(LIZ, LJLIL, ".item", LIZ);
    }

    public static synchronized Uri LIZ(Context context, C66859QLv c66859QLv) {
        synchronized (PushProvider.class) {
            if (LJLILLLLZI == null) {
                try {
                    LIZIZ(context);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            if (c66859QLv == null) {
                return LJLILLLLZI;
            }
            return c66859QLv.LIZ(LJLILLLLZI);
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (providerInfo != null) {
            LJLIL = providerInfo.authority;
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        boolean z;
        SharedPreferences.Editor edit;
        ArrayList arrayList;
        String str;
        if (TextUtils.isEmpty(LJLIL) || LJLJI == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (LJLJI.match(uri) == 65536) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                return null;
            }
            String str2 = (String) ListProtector.get(pathSegments, 0);
            try {
                InterfaceC66858QLu LIZ = PT6.LIZ.LIZ(getContext(), str2, true);
                edit = LIZ.edit();
                arrayList = new ArrayList();
                for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value == null) {
                        edit.remove(key);
                    } else if (value instanceof String) {
                        if (!TextUtils.equals(LIZ.getString(key), (String) value)) {
                            edit.putString(key, (String) value);
                            str = "string";
                            arrayList.add(new ARunnableS1S3100000_11(getContext(), str2, key, str, 0));
                        }
                    } else if (value instanceof Boolean) {
                        if (LIZ.getBoolean(key) != ((Boolean) value).booleanValue()) {
                            edit.putBoolean(key, ((Boolean) value).booleanValue());
                            str = "boolean";
                            arrayList.add(new ARunnableS1S3100000_11(getContext(), str2, key, str, 0));
                        }
                    } else if (value instanceof Long) {
                        if (LIZ.getLong(key) != ((Long) value).longValue()) {
                            edit.putLong(key, ((Long) value).longValue());
                            str = "long";
                            arrayList.add(new ARunnableS1S3100000_11(getContext(), str2, key, str, 0));
                        }
                    } else if (value instanceof Integer) {
                        if (LIZ.getInt(key) != ((Integer) value).intValue()) {
                            edit.putInt(key, ((Integer) value).intValue());
                            str = "integer";
                            arrayList.add(new ARunnableS1S3100000_11(getContext(), str2, key, str, 0));
                        }
                    } else if (value instanceof Float) {
                        if (LIZ.LIZJ(key) != ((Float) value).floatValue()) {
                            edit.putFloat(key, ((Float) value).floatValue());
                            str = "float";
                            arrayList.add(new ARunnableS1S3100000_11(getContext(), str2, key, str, 0));
                        }
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Unsupported type ");
                        LIZ2.append(uri);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            if (edit == null) {
                return null;
            }
            edit.apply();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            return null;
        }
        throw new IllegalArgumentException(C43588H8u.LIZ("Unsupported uri ", uri));
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        PT9 pt9 = (PT9) ((ConcurrentHashMap) C58220Mt6.LIZ).get(str);
        if (pt9 == null) {
            return null;
        }
        return pt9.LIZ(getContext(), bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x007f. Please report as an issue. */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        boolean z;
        List<String> pathSegments;
        Object string;
        if (TextUtils.isEmpty(LJLIL) || LJLJI == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z && LJLJI.match(uri) == 65536 && uri != null && (pathSegments = uri.getPathSegments()) != null && pathSegments.size() >= 4) {
            C66859QLv c66859QLv = new C66859QLv((String) ListProtector.get(pathSegments, 0), (String) ListProtector.get(pathSegments, 1), (String) ListProtector.get(pathSegments, 2), (String) ListProtector.get(pathSegments, 3));
            if (!TextUtils.isEmpty(c66859QLv.LIZ) && !TextUtils.isEmpty(c66859QLv.LIZIZ) && !TextUtils.isEmpty(c66859QLv.LIZLLL)) {
                InterfaceC66858QLu LIZ = PT6.LIZ.LIZ(getContext(), c66859QLv.LIZ, true);
                String str3 = c66859QLv.LIZLLL;
                str3.getClass();
                switch (str3.hashCode()) {
                    case -891985903:
                        if (str3.equals("string")) {
                            string = LIZ.getString(c66859QLv.LIZIZ, c66859QLv.LIZJ);
                            MatrixCursor matrixCursor = new MatrixCursor(new String[]{c66859QLv.LIZIZ});
                            matrixCursor.newRow().add(string);
                            return matrixCursor;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 3327612:
                        if (str3.equals("long")) {
                            string = Long.valueOf(LIZ.getLong(c66859QLv.LIZIZ, CastLongProtector.parseLong(c66859QLv.LIZJ)));
                            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{c66859QLv.LIZIZ});
                            matrixCursor2.newRow().add(string);
                            return matrixCursor2;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 64711720:
                        if (str3.equals("boolean")) {
                            string = Integer.valueOf(LIZ.getBoolean(c66859QLv.LIZIZ, Boolean.parseBoolean(c66859QLv.LIZJ)) ? 1 : 0);
                            MatrixCursor matrixCursor22 = new MatrixCursor(new String[]{c66859QLv.LIZIZ});
                            matrixCursor22.newRow().add(string);
                            return matrixCursor22;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 97526364:
                        if (str3.equals("float")) {
                            string = Float.valueOf(LIZ.getFloat(c66859QLv.LIZIZ, CastFloatProtector.parseFloat(c66859QLv.LIZJ)));
                            MatrixCursor matrixCursor222 = new MatrixCursor(new String[]{c66859QLv.LIZIZ});
                            matrixCursor222.newRow().add(string);
                            return matrixCursor222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    case 1958052158:
                        if (str3.equals("integer")) {
                            string = Integer.valueOf(LIZ.getInt(c66859QLv.LIZIZ, CastIntegerProtector.parseInt(c66859QLv.LIZJ)));
                            MatrixCursor matrixCursor2222 = new MatrixCursor(new String[]{c66859QLv.LIZIZ});
                            matrixCursor2222.newRow().add(string);
                            return matrixCursor2222;
                        }
                        throw new IllegalArgumentException("unknown type");
                    default:
                        throw new IllegalArgumentException("unknown type");
                }
            }
        }
        return null;
    }
}
