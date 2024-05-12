package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.EnF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37473EnF<T> implements InterfaceC37408EmC<java.util.Set<? extends C37403Em7<?, ?>>> {
    public static final C37473EnF LIZ = new C37473EnF();

    @Override // X.InterfaceC37408EmC
    public final java.util.Set<? extends C37403Em7<?, ?>> create() {
        HashSet hashSet = (HashSet) C37507Enn.LIZ;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C37403Em7 c37403Em7 = (C37403Em7) it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Provide method: ");
            LIZ2.append(c37403Em7.LIZ);
            C37507Enn.LIZ(X1D.LIZIZ(LIZ2));
        }
        return hashSet;
    }

    @Override // X.InterfaceC37408EmC
    public final java.util.Set<? extends C37403Em7<?, ?>> LIZ(Object obj) {
        return create();
    }
}
