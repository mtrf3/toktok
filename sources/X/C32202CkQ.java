package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.CkQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32202CkQ {
    public static String LIZ(Context context, String uriPath) {
        Cursor query;
        o.LJIIJ(uriPath, "uriPath");
        if (ujb.o.LJJJLIIL(uriPath, "/", false)) {
            return uriPath;
        }
        Context LLLLL = C16880lQ.LLLLL(context);
        o.LJFF(LLLLL, "context.applicationContext");
        ContentResolver contentResolver = LLLLL.getContentResolver();
        android.net.Uri parse = UriProtector.parse(uriPath);
        String str = null;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{parse, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "1313719519214617775"));
        if (LIZJ.LIZ) {
            query = (Cursor) LIZJ.LIZIZ;
        } else {
            query = contentResolver.query(parse, null, null, null, null);
        }
        if (query != null) {
            if (query.moveToFirst()) {
                try {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                } catch (Exception unused) {
                }
            }
            query.close();
        }
        return str;
    }
}
