package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZXq, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90098ZXq {
    public List<C90089ZXh> LIZ;
    public boolean LIZIZ;

    public C90098ZXq() {
    }

    public C90098ZXq(C90099ZXr c90099ZXr) {
        if (c90099ZXr != null) {
            this.LIZ = c90099ZXr.LIZIZ;
            this.LIZIZ = c90099ZXr.LIZJ;
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }

    public final void LIZ(C90089ZXh c90089ZXh) {
        if (c90089ZXh != null) {
            List<C90089ZXh> list = this.LIZ;
            if (list == null) {
                this.LIZ = new ArrayList();
            } else if (list.contains(c90089ZXh)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            this.LIZ.add(c90089ZXh);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }
}
