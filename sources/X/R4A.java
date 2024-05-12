package X;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public final class R4A implements JJ4 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Bundle LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ R4B LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ R4I LJFF;

    @Override // X.JJ4
    public final void LIZ() {
        R4D.LIZJ(this.LIZ, this.LIZIZ, this.LIZJ, false, this.LIZLLL);
    }

    @Override // X.JJ4
    public final void LIZIZ() {
        if (this.LJ == 1364) {
            R4D.LIZJ(this.LIZ, this.LIZIZ, this.LIZJ, true, this.LIZLLL);
            return;
        }
        Integer valueOf = Integer.valueOf(this.LJFF.LIZLLL);
        String str = this.LJFF.LJFF;
        R4B r4b = this.LIZLLL;
        Iterator it = ((CopyOnWriteArrayList) R41.LIZ).iterator();
        while (it.hasNext()) {
            ((LEA) it.next()).onAccountResult(2, false, 0, null);
        }
        if (r4b == null) {
            return;
        }
        r4b.LIZJ(valueOf, str);
    }

    public R4A(String str, Bundle bundle, boolean z, R4B r4b, int i, R4I r4i) {
        this.LIZ = str;
        this.LIZIZ = bundle;
        this.LIZJ = z;
        this.LIZLLL = r4b;
        this.LJ = i;
        this.LJFF = r4i;
    }
}
