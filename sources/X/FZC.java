package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import ujb.o;

/* loaded from: classes7.dex */
public final class FZC implements InterfaceC43476H4m {
    public static final FZC LIZ = new FZC();

    public static Cursor LJ(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-484107571562974213"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public static String LJFF(String str) {
        if (str == null) {
            return null;
        }
        if (o.LJJJLIIL(str, "file://", false)) {
            String substring = str.substring(7);
            kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        if (o.LJJJLIIL(str, "content://", false)) {
            return C00S.LIZIZ(EF7.LIZIZ(), UriProtector.parse(str));
        }
        return str;
    }

    @Override // X.InterfaceC43476H4m
    public final boolean LIZJ(String str) {
        if (str != null && str.length() != 0 && (C1B6.LIZIZ(str) || C268613q.LJIIJJI(EF7.LIZIZ(), UriProtector.parse(str)))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC43476H4m
    public final boolean LIZLLL(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return o.LJJJLIIL(str, "/", false);
    }

    @Override // X.InterfaceC43476H4m
    public final String LIZ(Context context, String str) {
        int columnIndexOrThrow;
        String relativePath;
        if (str == null) {
            return "";
        }
        boolean z = false;
        if (!o.LJJJLIIL(str, "content://", false)) {
            return LJFF(str);
        }
        String path = C16880lQ.LLLLLLLLLL().getPath();
        Cursor cursor = null;
        try {
            cursor = LJ(context.getContentResolver(), android.net.Uri.parse(str));
            if (cursor == null) {
                return "";
            }
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_display_name");
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("relative_path");
            } else {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            }
            if (cursor.moveToFirst()) {
                String string = cursor.getString(columnIndexOrThrow2);
                if (string == null) {
                    string = "";
                }
                if (i >= 29) {
                    relativePath = cursor.getString(columnIndexOrThrow);
                } else {
                    String string2 = cursor.getString(columnIndexOrThrow);
                    kotlin.jvm.internal.o.LJIIIIZZ(string2, "cursor.getString(pathIndex)");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(path);
                    LIZ2.append(File.separator);
                    relativePath = o.LJJJJZ(o.LJJJJZ(string2, X1D.LIZIZ(LIZ2), "", false), string, "", false);
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(relativePath);
                kotlin.jvm.internal.o.LJIIIIZZ(relativePath, "relativePath");
                String separator = File.separator;
                kotlin.jvm.internal.o.LJIIIIZZ(separator, "separator");
                if (!o.LJJJJ(relativePath, separator, false)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(separator);
                    LIZ4.append(string);
                    string = X1D.LIZIZ(LIZ4);
                }
                LIZ3.append(string);
                String relativePath2 = X1D.LIZIZ(LIZ3);
                kotlin.jvm.internal.o.LJIIIIZZ(relativePath2, "relativePath");
                if (relativePath2.length() > 0) {
                    z = true;
                }
                if (z) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(path);
                    LIZ5.append(separator);
                    LIZ5.append(relativePath2);
                    return C00T.LJ(X1D.LIZIZ(LIZ5));
                }
            }
            return "";
        } catch (Exception unused) {
            return LJFF(str);
        } finally {
            C38891fp.LJIIJJI(cursor);
        }
    }

    @Override // X.InterfaceC43476H4m
    public final boolean LIZIZ(String str, String str2) {
        if (!LIZLLL(str)) {
            str = LIZ(EF7.LIZIZ(), str);
        }
        if (str == null || str2 == null) {
            return false;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file.isFile() || file2.isDirectory()) {
            return false;
        }
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
        try {
            byte[] bArr = new byte[2048];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    bufferedInputStream.close();
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    return true;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
