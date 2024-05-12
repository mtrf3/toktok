package X;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public final class FZM implements FZX {
    public static final String[] LIZIZ = {"_id", "class"};
    public final FZQ LIZ = new FZQ();

    public static Cursor LIZJ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, "package=?", strArr2, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "7468575084793880396"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, "package=?", strArr2, null);
    }

    @Override // X.FZX
    public final List<String> LIZ() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    public static ContentValues LIZLLL(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // X.FZX
    public final void LIZIZ(Context context, ComponentName componentName, int i) {
        if (context == null || componentName == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (this.LIZ != null && C77412UZs.LJFF(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            this.LIZ.LIZIZ(context, componentName, i);
            return;
        }
        android.net.Uri parse = UriProtector.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = LIZJ(contentResolver, parse, LIZIZ, new String[]{componentName.getPackageName()});
            if (cursor == null) {
                return;
            }
            String className = componentName.getClassName();
            boolean z = false;
            while (cursor.moveToNext()) {
                contentResolver.update(parse, LIZLLL(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                    z = true;
                }
            }
            if (!z) {
                contentResolver.insert(parse, LIZLLL(componentName, i, true));
            }
            if (cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Throwable th) {
            try {
                throw new FXW(th.getMessage());
            } catch (Throwable th2) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }
}
