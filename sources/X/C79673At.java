package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79673At implements C4HY {
    public static final C79673At LIZ = new C79673At();
    public static final CopyOnWriteArrayList<InterfaceC79693Av> LIZIZ = new CopyOnWriteArrayList<>();
    public static boolean LIZJ;

    @Override // X.C4HY
    public final void LIZ(boolean z) {
        LIZJ = z;
        Iterator<InterfaceC79693Av> it = LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(z);
        }
    }
}
