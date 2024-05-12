package com.bytedance.preinstall.attribution.provider;

import X.C66860QLw;
import X.JBR;
import X.X1D;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PreinstallAttributionProvider extends ContentProvider {
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
        return false;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String str3;
        String str4;
        o.LJIIIZ(uri, "uri");
        StringBuilder LIZ = X1D.LIZ();
        Context context = getContext();
        if (context != null) {
            str3 = context.getPackageName();
        } else {
            str3 = null;
        }
        String LJFF = JBR.LJFF(LIZ, str3, ".preinstall.attribution", LIZ);
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(LJFF, "preload_info", 1);
        if (uriMatcher.match(uri) == 1) {
            str4 = "preinstall_tb";
        } else {
            str4 = null;
        }
        SQLiteDatabase writableDatabase = new C66860QLw(getContext()).getWritableDatabase();
        if (writableDatabase == null) {
            return null;
        }
        return writableDatabase.query(str4, strArr, str, strArr2, null, null, str2, null);
    }
}
