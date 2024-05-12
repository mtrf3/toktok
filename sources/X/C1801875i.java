package X;

import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.75i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1801875i {
    public static LinkedList LIZ() {
        return (LinkedList) C1802175l.LIZ.getValue();
    }

    public static String LIZIZ(ActivityC45651qj activity, String str) {
        o.LJIIIZ(activity, "activity");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(activity.getClass().getName());
        LIZ.append('_');
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }
}
