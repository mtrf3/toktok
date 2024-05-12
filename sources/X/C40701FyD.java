package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Parcelable;
import java.util.HashSet;
import m43.u;

/* renamed from: X.FyD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40701FyD {
    public static java.util.Set<Integer> LIZ(Context context) {
        Cursor query;
        ContentResolver contentResolver = context.getContentResolver();
        HashSet hashSet = new HashSet();
        android.net.Uri parse = android.net.Uri.parse("content://com.facebook.orca.provider.MessengerPlatformProvider/versions");
        String[] strArr = {"version"};
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{parse, strArr, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-6497979728231138795"));
        if (LIZJ.LIZ) {
            query = (Cursor) LIZJ.LIZIZ;
        } else {
            query = contentResolver.query(parse, strArr, null, null, null);
        }
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("version");
                while (query.moveToNext()) {
                    hashSet.add(Integer.valueOf(query.getInt(columnIndex)));
                }
            } finally {
                query.close();
            }
        }
        return hashSet;
    }

    public static void LIZIZ(Context context) {
        if (C40700FyC.LIZ(C40701FyD.class)) {
            return;
        }
        try {
            try {
                C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", android.net.Uri.parse("market://details?id=com.facebook.orca")));
            } catch (ActivityNotFoundException unused) {
                C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", android.net.Uri.parse("http://play.google.com/store/apps/details?id=com.facebook.orca")));
            }
        } catch (Throwable unused2) {
        }
    }

    public static void LIZJ(Activity activity, int i, C40704FyG c40704FyG) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(1);
            intent.setPackage("com.facebook.orca");
            intent.putExtra("android.intent.extra.STREAM", c40704FyG.LIZ);
            intent.setType(c40704FyG.LIZIZ);
            String LIZLLL = u.LIZLLL();
            intent.putExtra("com.facebook.orca.extra.PROTOCOL_VERSION", 20150314);
            intent.putExtra("com.facebook.orca.extra.APPLICATION_ID", LIZLLL);
            intent.putExtra("com.facebook.orca.extra.METADATA", (String) null);
            intent.putExtra("com.facebook.orca.extra.EXTERNAL_URI", (Parcelable) null);
            C16880lQ.LJFF(activity, i, intent);
        } catch (ActivityNotFoundException unused) {
            C16880lQ.LIZIZ(activity, activity.getPackageManager().getLaunchIntentForPackage("com.facebook.orca"));
        }
    }
}
