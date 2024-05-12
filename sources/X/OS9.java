package X;

import Y.ARunnableS29S0200000_10;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;

/* loaded from: classes11.dex */
public final class OS9 implements VTX {
    public final /* synthetic */ StoreFragment LIZ;
    public final /* synthetic */ C37942Euo LIZIZ;

    public OS9(StoreFragment storeFragment, C37942Euo c37942Euo) {
        this.LIZ = storeFragment;
        this.LIZIZ = c37942Euo;
    }

    @Override // X.VTY
    public final void LIZ(C80217Ve1 c80217Ve1, int i) {
        C60726NsQ wl = this.LIZ.wl();
        if (wl != null) {
            wl.post(new ARunnableS29S0200000_10(wl, this.LIZIZ, 70));
        }
    }
}
