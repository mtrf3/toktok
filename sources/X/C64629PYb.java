package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.PYb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64629PYb {
    public final List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();

    public final void LIZ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                ((ArrayList) this.LIZ).add(C64626PXy.LIZJ(str, false, null));
                ((ArrayList) this.LIZIZ).add(C64626PXy.LIZJ(str2, false, null));
                return;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("name == null");
    }

    public final void LIZIZ(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                ((ArrayList) this.LIZ).add(C64626PXy.LIZJ(str, true, null));
                ((ArrayList) this.LIZIZ).add(C64626PXy.LIZJ(str2, true, null));
                return;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("name == null");
    }
}
