package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.0rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC20770rh implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ ViewGroup LJLJI = null;
    public final /* synthetic */ int LJLJJI;

    public RunnableC20770rh(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJJI = i3;
    }

    public final void LIZ() {
        for (int i = 0; i < this.LJLIL; i++) {
            List<C20750rf> list = C20760rg.LIZJ.get(Integer.valueOf(this.LJLILLLLZI));
            if (list != null) {
                Integer valueOf = Integer.valueOf(list.size());
                if (valueOf.intValue() >= this.LJLIL) {
                    valueOf.intValue();
                    return;
                }
            }
            C20760rg.LIZ(this.LJLILLLLZI, this.LJLJJI, this.LJLJI);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
