package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06360Mu {
    public boolean LIZ = true;
    public QXX LIZIZ;
    public List<C0TD> LIZJ;

    public final void LIZ(C0TD... c0tdArr) {
        if (c0tdArr.length == 0) {
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new ArrayList();
        }
        for (C0TD c0td : c0tdArr) {
            if (c0td != null) {
                ((ArrayList) this.LIZJ).add(c0td);
            }
        }
    }
}
