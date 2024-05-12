package X;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.2YY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2YY {
    public static final LinkedList<WeakReference<Activity>> LIZ = new LinkedList<>();

    public static final int LIZ(Context context) {
        Object obj;
        if (!(context instanceof Activity)) {
            return 1;
        }
        Reference reference = (Reference) ORZ.LJLLLL(LIZ);
        if (reference != null) {
            obj = reference.get();
        } else {
            obj = null;
        }
        if (!o.LJ(obj, context)) {
            return 2;
        }
        return 3;
    }
}
