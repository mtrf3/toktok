package X;

import org.json.JSONObject;

/* renamed from: X.Etl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37877Etl {
    public static void LIZ() {
        C37974EvK c37974EvK = C37974EvK.LIZ;
        if (C37876Etk.LJ.compareAndSet(false, true)) {
            C37876Etk.LJFF = c37974EvK;
            C35657Dz3 c35657Dz3 = C37876Etk.LJI;
            synchronized (c35657Dz3) {
                c35657Dz3.LIZ("repository_Init", new JSONObject().put("init", true));
            }
        }
    }
}
