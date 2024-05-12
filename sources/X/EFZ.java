package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EFZ extends ThreadLocal<EFY> {
    @Override // java.lang.ThreadLocal
    public final EFY initialValue() {
        EFY efy = new EFY();
        Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
        LLLLIIIILLL.getId();
        String name = LLLLIIIILLL.getName();
        o.LJIIIIZZ(name, "currentThread.name");
        efy.LIZIZ = name;
        return efy;
    }
}
