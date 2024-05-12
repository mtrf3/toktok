package X;

import android.database.Cursor;
import android.os.Build;
import defpackage.a1;
import defpackage.i0;
import java.util.Arrays;

/* renamed from: X.0yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25070yd {
    public static int LIZ(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("`");
        LIZ.append(str);
        LIZ.append("`");
        int columnIndex2 = cursor.getColumnIndex(X1D.LIZIZ(LIZ));
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            String[] columnNames = cursor.getColumnNames();
            String LJFF = i0.LJFF(".", str);
            String LJ = a1.LJ(".", str, "`");
            for (int i = 0; i < columnNames.length; i++) {
                String str2 = columnNames[i];
                if (str2.length() >= str.length() + 2) {
                    if (str2.endsWith(LJFF)) {
                        return i;
                    }
                    if (str2.charAt(0) == '`' && str2.endsWith(LJ)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static int LIZIZ(Cursor cursor, String str) {
        String str2;
        int LIZ = LIZ(cursor, str);
        if (LIZ >= 0) {
            return LIZ;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
