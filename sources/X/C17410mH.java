package X;

import android.database.Cursor;
import java.util.HashMap;

/* renamed from: X.0mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17410mH {
    public final Cursor LIZ;
    public final HashMap<String, Integer> LIZIZ;

    public final int LIZ(String str) {
        Integer num = this.LIZIZ.get(str);
        if (num == null) {
            try {
                num = Integer.valueOf(this.LIZ.getColumnIndex(str));
            } catch (Throwable unused) {
                num = -1;
            }
            this.LIZIZ.put(str, num);
        }
        return num.intValue();
    }

    public final long LIZIZ(String str) {
        try {
            return this.LIZ.getLong(LIZ(str));
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public final String LIZJ(String str) {
        try {
            return this.LIZ.getString(LIZ(str));
        } catch (Throwable unused) {
            return "";
        }
    }

    public C17410mH(Cursor cursor, HashMap hashMap) {
        this.LIZ = cursor;
        this.LIZIZ = hashMap;
    }
}
