package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import ujb.o;

/* renamed from: X.CkO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32200CkO {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        boolean z;
        Cursor query;
        boolean z2;
        String str2 = str;
        boolean z3 = true;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "image";
        }
        if (o.LJJJLIIL(str2, "content://", false)) {
            ContentResolver contentResolver = EF7.LIZIZ().getContentResolver();
            android.net.Uri parse = UriProtector.parse(str2);
            String str3 = null;
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{parse, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-4340483786593357898"));
            if (LIZJ.LIZ) {
                query = (Cursor) LIZJ.LIZIZ;
            } else {
                query = contentResolver.query(parse, null, null, null, null);
            }
            if (query != null) {
                if (query.moveToFirst()) {
                    try {
                        str3 = query.getString(query.getColumnIndexOrThrow("_data"));
                    } catch (Exception unused) {
                    }
                }
                query.close();
            }
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str2 = str3;
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str2, options);
        String str4 = options.outMimeType;
        if (str4 != null && str4.length() != 0) {
            z3 = false;
        }
        if (z3) {
            return "image";
        }
        String str5 = options.outMimeType;
        kotlin.jvm.internal.o.LJIIIIZZ(str5, "{\n            options.outMimeType\n        }");
        return str5;
    }
}
