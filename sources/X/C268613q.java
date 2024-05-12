package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.13q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C268613q {
    public static final String[] LIZ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "relative_path", "_data", "datetaken", "orientation"};
    public static final String[] LIZIZ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "_data", "datetaken", "orientation"};
    public static final String[] LIZJ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "relative_path", "_data", "datetaken", "resolution", "orientation"};
    public static final String[] LIZLLL = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "datetaken", "resolution"};

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, Bundle bundle) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, bundle, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "-3846441981661077432"));
        return LIZJ2.LIZ ? (Cursor) LIZJ2.LIZIZ : contentResolver.query(uri, strArr, bundle, null);
    }

    public static Cursor LIZIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-3846441981661077432"));
        return LIZJ2.LIZ ? (Cursor) LIZJ2.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
    }

    static {
        String.valueOf(1);
        String.valueOf(3);
    }

    public static android.net.Uri LIZJ(Context context, String str) {
        return LIZLLL(context, str, "image/jpeg");
    }

    public static android.net.Uri LJFF(Context context, String str) {
        return LJI(context, str, "video/mp4");
    }

    public static long LJIIIZ(Context context, android.net.Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath()).length();
        }
        if ("content".equals(uri.getScheme())) {
            try {
                return context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
            } catch (Exception unused) {
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0127, code lost:
    
        if (r6 != null) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LJIIJ(android.content.Context r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268613q.LJIIJ(android.content.Context, java.lang.String):android.net.Uri");
    }

    public static boolean LJIIJJI(Context context, android.net.Uri uri) {
        if (context != null && uri != null) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor == null) {
                    return false;
                }
                try {
                    openAssetFileDescriptor.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (FileNotFoundException unused2) {
            }
        }
        return false;
    }

    public static void LJIIL(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(android.net.Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
        MediaScannerConnection.scanFile(context, new String[]{str}, null, null);
    }

    public static android.net.Uri LIZLLL(Context context, String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLLLLLLLLL().getPath());
        LIZ2.append("/");
        File file = new File(JBR.LJFF(LIZ2, Environment.DIRECTORY_DCIM, "/Camera", LIZ2));
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return LJ(context, str, str2, JBR.LJFF(LIZ3, Environment.DIRECTORY_DCIM, "/Camera/", LIZ3));
    }

    public static android.net.Uri LJI(Context context, String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLLLLLLLLL().getPath());
        LIZ2.append("/");
        File file = new File(JBR.LJFF(LIZ2, Environment.DIRECTORY_DCIM, "/Camera", LIZ2));
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return LJII(context, str, str2, JBR.LJFF(LIZ3, Environment.DIRECTORY_DCIM, "/Camera/", LIZ3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x014e, code lost:
    
        if (r3 != null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LJIIIIZZ(android.content.Context r15, java.lang.String r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268613q.LJIIIIZZ(android.content.Context, java.lang.String, java.lang.String):android.net.Uri");
    }

    public static android.net.Uri LJ(Context context, String str, String str2, String str3) {
        android.net.Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = i0.LJFF(str3, "/");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (C00T.LIZLLL()) {
            uri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLLLLLLLLL().getPath());
            LIZ2.append("/");
            LIZ2.append(str3);
            LIZ2.append("/");
            LIZ2.append(str);
            contentValues.put("_data", C00T.LJ(X1D.LIZIZ(LIZ2)));
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    public static android.net.Uri LJII(Context context, String str, String str2, String str3) {
        android.net.Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = i0.LJFF(str3, "/");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (C00T.LIZLLL()) {
            uri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(C16880lQ.LLLLLLLLLL().getPath());
            LIZ2.append("/");
            LIZ2.append(str3);
            LIZ2.append("/");
            LIZ2.append(str);
            contentValues.put("_data", C00T.LJ(X1D.LIZIZ(LIZ2)));
        }
        return context.getContentResolver().insert(uri, contentValues);
    }
}
