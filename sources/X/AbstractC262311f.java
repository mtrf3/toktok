package X;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* renamed from: X.11f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC262311f {
    public final int LIZ;

    public abstract void LIZIZ();

    public abstract void LIZJ(C38451f7 c38451f7);

    public abstract void LIZLLL(C38451f7 c38451f7, int i, int i2);

    public abstract void LJ(C38451f7 c38451f7);

    public abstract void LJFF(C38451f7 c38451f7, int i, int i2);

    public AbstractC262311f(int i) {
        this.LIZ = i;
    }

    public static void LIZ(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }
}
