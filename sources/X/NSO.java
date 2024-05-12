package X;

import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class NSO implements NSN {
    public final String LIZ;
    public final String LIZIZ;
    public final ViewGroup LIZJ;

    @Override // X.NSN
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.NSN
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.NSG
    public final ViewGroup getContainer() {
        return this.LIZJ;
    }

    public NSO(ViewGroup viewGroup, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = viewGroup;
    }
}
