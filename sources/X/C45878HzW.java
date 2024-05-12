package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: X.HzW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45878HzW {
    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "543801667928757249"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, null);
    }

    public static File LIZJ(Context context, android.net.Uri uri) {
        int lastIndexOf;
        String str = null;
        str = null;
        android.net.Uri uri2 = null;
        r1 = null;
        r1 = null;
        String str2 = null;
        str = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C16880lQ.LLLLLLLLLL());
                    LIZ.append("/");
                    LIZ.append(split[1]);
                    str = X1D.LIZIZ(LIZ);
                }
            } else if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
                str = LIZIZ(context, ContentUris.withAppendedId(UriProtector.parse("content://downloads/public_downloads"), CastLongProtector.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
            } else if ("com.android.providers.media.documents".equals(uri.getAuthority())) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str3 = split2[0];
                if ("image".equals(str3)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str3)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str3)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                str = LIZIZ(context, uri2, "_id=?", new String[]{split2[1]});
            } else if (uri.getAuthority().equalsIgnoreCase("com.google.android.apps.docs.storage")) {
                DocumentsContract.getDocumentId(uri).split(";");
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                int available = openInputStream.available();
                if (uri.getScheme().equals("content")) {
                    Cursor LIZ2 = LIZ(context.getContentResolver(), uri, null, null, null);
                    if (LIZ2 != null) {
                        try {
                            if (LIZ2.moveToFirst()) {
                                str2 = LIZ2.getString(LIZ2.getColumnIndex("_display_name"));
                            }
                        } finally {
                            LIZ2.close();
                        }
                    }
                    if (LIZ2 != null) {
                    }
                }
                if (str2 == null && (lastIndexOf = (str2 = uri.getPath()).lastIndexOf(47)) != -1) {
                    str2 = str2.substring(lastIndexOf + 1);
                }
                File file = new File(C16880lQ.LLLLLLLLLL().getAbsolutePath(), str2);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(openInputStream);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, false));
                byte[] bArr = new byte[available];
                bufferedInputStream.read(bArr);
                do {
                    bufferedOutputStream.write(bArr);
                } while (bufferedInputStream.read(bArr) != -1);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return file;
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            str = LIZIZ(context, uri, null, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            str = uri.getPath();
        }
        return new File(str);
    }

    public static String LIZIZ(Context context, android.net.Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor LIZ = LIZ(context.getContentResolver(), uri, new String[]{"_data"}, str, strArr);
            if (LIZ != null) {
                try {
                    if (LIZ.moveToFirst()) {
                        String string = LIZ.getString(LIZ.getColumnIndexOrThrow("_data"));
                        LIZ.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = LIZ;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (LIZ != null) {
                LIZ.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
