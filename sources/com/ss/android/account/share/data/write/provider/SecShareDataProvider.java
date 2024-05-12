package com.ss.android.account.share.data.write.provider;

import X.C16880lQ;
import X.C56672Kh;
import X.C66862QLy;
import X.C66863QLz;
import X.F9J;
import X.FAK;
import X.QM5;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SecShareDataProvider extends ContentProvider {
    public static final UriMatcher LJLILLLLZI = new UriMatcher(-1);
    public C66862QLy LJLIL;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        C56672Kh.LIZ().LIZLLL("SecShareDataProvider");
        Context context = getContext();
        if (context != null) {
            this.LJLIL = C66863QLz.LIZ(context);
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                LJLILLLLZI.addURI(o.LJIILLIIL(".SecShareProviderAuthority", packageName), "sec_share/*", 2);
                z = true;
                FAK LIZ = C56672Kh.LIZ();
                LIZ.getClass();
                LIZ.LJFF(SystemClock.uptimeMillis(), "SecShareDataProvider");
                return z;
            }
        }
        z = false;
        FAK LIZ2 = C56672Kh.LIZ();
        LIZ2.getClass();
        LIZ2.LJFF(SystemClock.uptimeMillis(), "SecShareDataProvider");
        return z;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        o.LJIIIZ(uri, "uri");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName) || LJLILLLLZI.match(uri) != 2) {
            return null;
        }
        return o.LJIILLIIL(".SecShareProviderAuthority", packageName);
    }

    @Override // android.content.ContentProvider
    public final synchronized Uri insert(Uri uri, ContentValues contentValues) {
        o.LJIIIZ(uri, "uri");
        return uri;
    }

    @Override // android.content.ContentProvider
    public final synchronized Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        o.LJIIIZ(uri, "uri");
        MatrixCursor matrixCursor = null;
        if (!QM5.LIZ(getCallingPackage())) {
            return null;
        }
        if (LJLILLLLZI.match(uri) != 2) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        if (size <= 0) {
            return null;
        }
        Object obj = ListProtector.get(pathSegments, size - 1);
        o.LJIIIIZZ(obj, "pathSegments[size - 1]");
        String str3 = (String) obj;
        try {
            C66862QLy c66862QLy = this.LJLIL;
            o.LJI(c66862QLy);
            SharedPreferences LIZIZ = F9J.LIZIZ(c66862QLy.LIZ, 0, c66862QLy.LIZIZ);
            o.LJIIIIZZ(LIZIZ, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            String string = LIZIZ.getString(str3, "");
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str3});
            try {
                matrixCursor2.newRow().add(str3, string);
                return matrixCursor2;
            } catch (Exception e) {
                e = e;
                matrixCursor = matrixCursor2;
                C16880lQ.LLLLIIL(e);
                return matrixCursor;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
