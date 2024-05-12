package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Ooq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63052Ooq {
    public final C63053Oor LIZ(Context context) {
        C63053Oor c63053Oor;
        o.LJIIIZ(context, "context");
        C63053Oor c63053Oor2 = C63053Oor.LIZJ;
        if (c63053Oor2 != null) {
            return c63053Oor2;
        }
        synchronized (this) {
            c63053Oor = C63053Oor.LIZJ;
            if (c63053Oor == null) {
                c63053Oor = new C63053Oor(context);
                C63053Oor.LIZJ = c63053Oor;
            }
        }
        return c63053Oor;
    }
}
