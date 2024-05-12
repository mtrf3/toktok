package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PXd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64605PXd {
    public final List<String> LIZ = new ArrayList(20);

    public final String LIZJ(String str) {
        for (int size = ((ArrayList) this.LIZ).size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) ListProtector.get(this.LIZ, size))) {
                return (String) ListProtector.get(this.LIZ, size + 1);
            }
        }
        return null;
    }

    public final void LIZLLL(String str) {
        int i = 0;
        while (i < ((ArrayList) this.LIZ).size()) {
            if (str.equalsIgnoreCase((String) ListProtector.get(this.LIZ, i))) {
                ListProtector.remove(this.LIZ, i);
                ListProtector.remove(this.LIZ, i);
                i -= 2;
            }
            i += 2;
        }
    }

    public final void LIZ(String str, String str2) {
        C64606PXe.LIZIZ(str);
        C64606PXe.LIZJ(str2, str);
        LIZIZ(str, str2);
    }

    public final void LIZIZ(String str, String str2) {
        ((ArrayList) this.LIZ).add(str);
        ((ArrayList) this.LIZ).add(str2.trim());
    }

    public final void LJ(String str, String str2) {
        C64606PXe.LIZIZ(str);
        C64606PXe.LIZJ(str2, str);
        LIZLLL(str);
        LIZIZ(str, str2);
    }
}
