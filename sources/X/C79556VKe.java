package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.VKe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79556VKe extends VKW {
    @Override // X.VKW
    public final void LIZJ() {
        if (!this.LJLJJI) {
            for (int i = 0; i < LIZLLL(); i++) {
                Map.Entry LJIIIIZZ = LJIIIIZZ(i);
                if (((YJB) LJIIIIZZ.getKey()).LLLLLLIL()) {
                    LJIIIIZZ.setValue(Collections.unmodifiableList((List) LJIIIIZZ.getValue()));
                }
            }
            for (Map.Entry entry : LJ()) {
                if (((YJB) entry.getKey()).LLLLLLIL()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.LIZJ();
    }

    public C79556VKe(int i) {
        super(i);
    }
}
