package com.bytedance.ies.powerpermissions;

import X.C16880lQ;
import X.C56672Kh;
import X.FAK;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.keva.KevaBuilder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PermissionsProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        o.LJIIIZ(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        o.LJIIIZ(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C56672Kh.LIZ().LIZLLL("PermissionsProvider");
        Context context = getContext();
        if (context != null) {
            KevaBuilder.getInstance().setContext(C16880lQ.LLLLL(context));
        }
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "PermissionsProvider");
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        o.LJIIIZ(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        return 0;
    }
}
