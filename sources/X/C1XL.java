package X;

import android.content.ContentValues;

/* renamed from: X.1XL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XL extends AbstractC17420mI<IRT> {
    public static volatile C1XL LJ;
    public static final String[] LJFF = {"_id", "front", "type", "timestamp", "accumulation", "version_id", "source", "status", WM7.SCENE_SERVICE, "process", "main_process", "sid"};

    public static final IRT LJ(C17410mH c17410mH) {
        int i;
        boolean z;
        boolean z2;
        long LIZIZ = c17410mH.LIZIZ("_id");
        long LIZIZ2 = c17410mH.LIZIZ("front");
        String LIZJ = c17410mH.LIZJ("type");
        long LIZIZ3 = c17410mH.LIZIZ("timestamp");
        long LIZIZ4 = c17410mH.LIZIZ("accumulation");
        long LIZIZ5 = c17410mH.LIZIZ("version_id");
        String LIZJ2 = c17410mH.LIZJ("source");
        long LIZIZ6 = c17410mH.LIZIZ("status");
        String LIZJ3 = c17410mH.LIZJ(WM7.SCENE_SERVICE);
        try {
            i = c17410mH.LIZ.getInt(c17410mH.LIZ("main_process"));
        } catch (Throwable unused) {
            i = -1;
        }
        String LIZJ4 = c17410mH.LIZJ("process");
        if (LIZIZ2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (LIZIZ6 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        IRT irt = new IRT(LIZIZ3, LIZIZ4, LIZJ, LIZJ3, LIZJ2, z, z2);
        irt.LJIIIZ = LIZJ4;
        irt.LIZ = LIZIZ;
        irt.LJIIIIZZ = LIZIZ5;
        boolean z3 = true;
        if (i != 1) {
            z3 = false;
        }
        irt.LJIIJ = z3;
        irt.LJIIJJI = c17410mH.LIZJ("sid");
        return irt;
    }

    public final synchronized void LJFF(IRT irt) {
        int i;
        int i2;
        try {
            ContentValues contentValues = new ContentValues();
            int i3 = 0;
            if (irt.LIZIZ) {
                i = 1;
            } else {
                i = 0;
            }
            contentValues.put("front", Integer.valueOf(i));
            contentValues.put("source", irt.LJII);
            contentValues.put("type", irt.LIZLLL);
            contentValues.put("timestamp", Long.valueOf(irt.LIZJ));
            contentValues.put("accumulation", Long.valueOf(irt.LJI));
            contentValues.put("version_id", Long.valueOf(irt.LJIIIIZZ));
            if (irt.LJ) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            contentValues.put("status", Integer.valueOf(i2));
            contentValues.put(WM7.SCENE_SERVICE, irt.LJFF);
            if (irt.LJIIJ) {
                i3 = 1;
            }
            contentValues.put("main_process", Integer.valueOf(i3));
            contentValues.put("process", irt.LJIIIZ);
            contentValues.put("sid", irt.LJIIJJI);
            LIZJ(contentValues);
        } catch (Exception unused) {
        }
    }

    public final synchronized void LJI(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", (Integer) 1);
        try {
            C09970aH.LIZ.getContentResolver().update(LIZIZ(), contentValues, "_id <= ? ", new String[]{String.valueOf(j)});
        } catch (Exception unused) {
        }
    }
}
