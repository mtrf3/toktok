package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a1z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91895a1z {
    public static final List LIZ(int i, List list) {
        o.LJIIIZ(list, "<this>");
        if (i > list.size()) {
            return list.subList(0, list.size());
        }
        return list.subList(0, i);
    }
}
