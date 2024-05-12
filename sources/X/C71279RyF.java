package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.RyF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71279RyF {
    public final ArrayList<InterfaceC71280RyG> LIZ = new ArrayList<>();

    public final void LIZ() {
        Iterator<InterfaceC71280RyG> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }
}
