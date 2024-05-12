package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.M5t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56249M5t {
    public final List<M69> LIZ = new ArrayList();
    public int LIZIZ;

    public final void LIZ(M61 m61) {
        ((ArrayList) this.LIZ).add(m61);
    }

    public final void LIZIZ(M5X m5x, C56249M5t c56249M5t) {
        if (this.LIZIZ == ((ArrayList) this.LIZ).size()) {
            return;
        }
        M69 m69 = (M69) ListProtector.get(this.LIZ, this.LIZIZ);
        this.LIZIZ++;
        m69.LIZ(m5x, c56249M5t);
    }
}
