package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;

/* renamed from: X.Hwc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45698Hwc {
    public static final String[] LIZ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "relative_path", "datetaken", "resolution"};
    public static final String[] LIZIZ = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "datetaken", "resolution"};

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, Bundle bundle) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, bundle, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "-7859651649278190071"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, bundle, null);
    }

    public static Cursor LIZIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-7859651649278190071"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
