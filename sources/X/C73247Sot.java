package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Sot, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73247Sot {
    public final List<Boolean> LIZ = new ArrayList();

    public final void LIZ(int i, boolean z) {
        if (i < 0 || i > ((ArrayList) this.LIZ).size()) {
            return;
        }
        if (z) {
            if (i < ((ArrayList) this.LIZ).size()) {
                ListProtector.set(this.LIZ, i, Boolean.TRUE);
                return;
            } else {
                ListProtector.add(this.LIZ, i, Boolean.TRUE);
                return;
            }
        }
        ListProtector.add(this.LIZ, i, Boolean.FALSE);
    }
}
