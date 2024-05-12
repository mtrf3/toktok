package X;

import Y.ARunnableS4S1300000_6;
import java.util.concurrent.Executor;

/* renamed from: X.FKu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38804FKu implements FL4 {
    public static final C38804FKu LIZ = new C38804FKu();

    @Override // X.FL4
    public final Object LIZ(Integer num, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        C38805FKv.LIZ.getClass();
        Executor executor = C38805FKv.LJ.get(0);
        if (executor != null) {
            executor.execute(new ARunnableS4S1300000_6(num, interfaceC65784Pro2, interfaceC65784Pro, str, 4));
            return null;
        }
        return null;
    }
}
