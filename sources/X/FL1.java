package X;

import Y.ARunnableS2S1201000_6;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class FL1 implements FL4 {
    public static final FL1 LIZ = new FL1();

    @Override // X.FL4
    public final Object LIZ(Integer num, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        C38805FKv.LIZ.getClass();
        Executor executor = C38805FKv.LJ.get(Integer.valueOf(i));
        if (executor != null) {
            executor.execute(new ARunnableS2S1201000_6(str, interfaceC65784Pro, interfaceC65784Pro2, 2));
            return null;
        }
        return null;
    }
}
