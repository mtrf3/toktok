package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.CancellationSignal;

/* renamed from: X.0di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C12100di {
    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
        CancellationSignal cancellationSignal = (CancellationSignal) obj;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2, cancellationSignal}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "-7783071486451197356"));
        if (LIZJ.LIZ) {
            return (Cursor) LIZJ.LIZIZ;
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
