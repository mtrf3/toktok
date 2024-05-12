package X;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Erz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37767Erz {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static void LIZ(Class cls) {
        Object LIZ2;
        try {
            InterfaceC37774Es6 interfaceC37774Es6 = (InterfaceC37774Es6) cls.newInstance();
            ((HashSet) C37507Enn.LIZ).add(new C37403Em7(interfaceC37774Es6.getName(), new C37766Ery(interfaceC37774Es6)));
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        C3C5.m10exceptionOrNullimpl(LIZ2);
    }
}
