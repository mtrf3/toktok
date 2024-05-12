package X;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Sfd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72673Sfd {
    public static final LinkedList<InterfaceC72696Sg0> LIZ = new LinkedList<>();
    public static InterfaceC72700Sg4 LIZIZ;

    public static List LIZ(InterfaceC72580Se8 category) {
        o.LJIIIZ(category, "category");
        ArrayList arrayList = new ArrayList();
        for (C72588SeG c72588SeG : category.LIZJ().values()) {
            String key = c72588SeG.LIZ;
            int i = c72588SeG.LJI;
            o.LJIIIZ(key, "key");
            arrayList.add(C72694Sfy.LIZ(i, 66667, key));
        }
        return arrayList;
    }
}
