package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.provider.MediaStore;

/* renamed from: X.Uyu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78964Uyu {
    public static final android.net.Uri LIZ = android.net.Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "2678589764730312970"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public static String LIZIZ(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static android.net.Uri LIZJ(int i) {
        return C0F1.LIZ("res").path(String.valueOf(i)).build();
    }

    public static boolean LIZLLL(android.net.Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    public static boolean LJ(android.net.Uri uri) {
        return "content".equals(LIZIZ(uri));
    }

    public static boolean LJFF(android.net.Uri uri) {
        String LIZIZ = LIZIZ(uri);
        if ("https".equals(LIZIZ) || "http".equals(LIZIZ)) {
            return true;
        }
        return false;
    }
}
