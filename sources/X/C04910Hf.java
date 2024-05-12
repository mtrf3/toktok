package X;

import java.util.List;

/* renamed from: X.0Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C04910Hf {
    public String LIZ;
    public List LIZIZ;

    public final C04920Hg LIZ() {
        String str = this.LIZ;
        if (str != null) {
            List list = this.LIZIZ;
            if (list != null) {
                C04920Hg c04920Hg = new C04920Hg();
                c04920Hg.LIZ = str;
                c04920Hg.LIZIZ = list;
                c04920Hg.LIZJ = null;
                return c04920Hg;
            }
            throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
        }
        throw new IllegalArgumentException("SKU type must be set");
    }
}
