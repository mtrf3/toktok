package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HWd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44195HWd {
    public final List<HW9> LIZ = new ArrayList();

    public final void LIZ() {
        Iterator<HW9> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        ((ArrayList) this.LIZ).clear();
    }
}
