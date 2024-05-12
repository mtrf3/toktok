package com.facebook;

import X.C56672Kh;
import X.C66373Q3d;
import X.C66378Q3i;
import X.FAK;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class FacebookContentProvider extends ContentProvider {
    public static final /* synthetic */ int LJLIL = 0;

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
        C56672Kh.LIZ().LIZLLL("FacebookContentProvider");
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        LIZ.LJFF(SystemClock.uptimeMillis(), "FacebookContentProvider");
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

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String mode) {
        Pair pair;
        String path;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(mode, "mode");
        File file = null;
        try {
            path = uri.getPath();
        } catch (Exception unused) {
            pair = null;
        }
        if (path != null) {
            String substring = path.substring(1);
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            Object[] array = s.LJLJJL(substring, new String[]{"/"}, 0, 6).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                String str = strArr[0];
                String str2 = strArr[1];
                if (!"..".contentEquals(str) && !"..".contentEquals(str2)) {
                    pair = new Pair(UUID.fromString(str), str2);
                    if (pair != null) {
                        try {
                            UUID uuid = (UUID) pair.first;
                            String str3 = (String) pair.second;
                            if (!C66373Q3d.LJIJJ(str3) && uuid != null) {
                                try {
                                    File LIZJ = C66378Q3i.LIZJ(uuid, false);
                                    if (LIZJ != null) {
                                        try {
                                            file = new File(LIZJ, URLEncoder.encode(str3, "UTF-8"));
                                        } catch (UnsupportedEncodingException unused2) {
                                        }
                                    }
                                    if (file != null) {
                                        return ParcelFileDescriptor.open(file, 268435456);
                                    }
                                    throw new FileNotFoundException();
                                } catch (IOException unused3) {
                                    throw new FileNotFoundException();
                                }
                            }
                            throw new FileNotFoundException();
                        } catch (FileNotFoundException e) {
                            throw e;
                        }
                    }
                    throw new FileNotFoundException();
                }
                throw new Exception();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }
}
