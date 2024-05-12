package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.FvV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40533FvV {
    public static final HashMap<String, Integer> LIZ = new HashMap<>();

    public static int LIZ(String uid) {
        o.LJIIIZ(uid, "uid");
        Integer num = LIZ.get(uid);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
