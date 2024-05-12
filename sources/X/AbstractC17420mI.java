package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.0mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17420mI<T> {
    public final Context LIZ;
    public final String LIZIZ;
    public android.net.Uri LIZJ;
    public final HashMap<String, Integer> LIZLLL = new HashMap<>();

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri, String[] strArr, String str, String[] strArr2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, "_id"}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "3580779874026350463"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, "_id");
    }

    public final android.net.Uri LIZIZ() {
        if (this.LIZJ == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("content://");
            YE1.LIZLLL(LIZ, this.LIZIZ, "/", "apm_monitor_t1.db", "/");
            LIZ.append("t_battery");
            this.LIZJ = UriProtector.parse(X1D.LIZIZ(LIZ));
        }
        return this.LIZJ;
    }

    public AbstractC17420mI() {
        Context context = C09970aH.LIZ;
        this.LIZ = context;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(context.getPackageName());
        LIZ.append(".apm");
        this.LIZIZ = X1D.LIZIZ(LIZ);
    }

    public final synchronized <I extends T> long LIZJ(ContentValues contentValues) {
        try {
            android.net.Uri insert = C09970aH.LIZ.getContentResolver().insert(LIZIZ(), contentValues);
            if (insert == null) {
                return -1L;
            }
            try {
                return CastLongProtector.parseLong(insert.getLastPathSegment());
            } catch (Exception unused) {
                return 1L;
            }
        } catch (Exception unused2) {
            return -1L;
        }
    }

    public final List LIZLLL(String str, String[] strArr, C1XL c1xl) {
        Cursor cursor;
        try {
            cursor = LIZ(this.LIZ.getContentResolver(), LIZIZ(), C1XL.LJFF, str, strArr);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        TextUtils.isEmpty("_id");
                        LinkedList linkedList = new LinkedList();
                        for (int i = 0; cursor.moveToNext() && i < Integer.MAX_VALUE; i++) {
                            linkedList.add(C1XL.LJ(new C17410mH(cursor, this.LIZLLL)));
                        }
                        try {
                            if (!cursor.isClosed()) {
                                cursor.close();
                            }
                        } catch (Exception unused) {
                        }
                        return linkedList;
                    }
                } catch (Throwable unused2) {
                    if (cursor != null) {
                        try {
                            if (!cursor.isClosed()) {
                                cursor.close();
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    return Collections.emptyList();
                }
            }
            List emptyList = Collections.emptyList();
            if (cursor != null) {
                try {
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                } catch (Exception unused4) {
                }
            }
            return emptyList;
        } catch (Throwable unused5) {
            cursor = null;
        }
    }
}
