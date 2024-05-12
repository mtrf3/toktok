package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0KI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KI {
    public final List<C0KG> LIZ;
    public final List<C0KG> LIZIZ;

    public C0KI(C0KH c0kh) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        this.LIZIZ = Collections.unmodifiableList(arrayList);
        List<C0KG> list = c0kh.LIZ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            arrayList.addAll(c0kh.LIZ);
        }
    }
}
