package X;

import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sop, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73243Sop {
    public final List<JediViewHolderProxy> LIZ = new ArrayList();
    public final C73250Sow LIZIZ;

    public final void LIZ() {
        if (((ArrayList) this.LIZ).size() == 0) {
            return;
        }
        Iterator it = ((ArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) it.next();
            if (jediViewHolderProxy != null) {
                this.LIZIZ.LIZ(jediViewHolderProxy);
            }
        }
        ((ArrayList) this.LIZ).clear();
    }

    public C73243Sop(C73250Sow c73250Sow) {
        this.LIZIZ = c73250Sow;
    }

    public final void LIZIZ(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i < 0 || i > ((ArrayList) this.LIZ).size()) {
            return;
        }
        if (jediViewHolderProxy != null) {
            if (i < ((ArrayList) this.LIZ).size()) {
                ListProtector.set(this.LIZ, i, jediViewHolderProxy);
                return;
            } else {
                ListProtector.add(this.LIZ, i, jediViewHolderProxy);
                return;
            }
        }
        ListProtector.add(this.LIZ, i, null);
    }
}
