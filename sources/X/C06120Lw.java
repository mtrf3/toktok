package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06120Lw {
    public static final List<InterfaceC06110Lv> LIZ = new ArrayList(2);

    public static synchronized void LIZ(boolean z, long j, boolean z2) {
        synchronized (C06120Lw.class) {
            Iterator it = ((ArrayList) LIZ).iterator();
            while (it.hasNext()) {
                InterfaceC06110Lv interfaceC06110Lv = (InterfaceC06110Lv) it.next();
                if (interfaceC06110Lv != null) {
                    interfaceC06110Lv.LJ(z, j, z2);
                }
            }
        }
    }
}
