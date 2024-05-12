package X;

import Y.ARunnableS38S0100000_2;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: X.4x0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125984x0 implements InterfaceC133905Ni {
    public final /* synthetic */ C5MG LJLIL;

    public C125984x0(C5MG c5mg) {
        this.LJLIL = c5mg;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        FilterBean filterBean;
        if (i == 4143 && (filterBean = this.LJLIL.LJJIIZ) != null && C44659Hfr.LJ(filterBean)) {
            C5MG c5mg = this.LJLIL;
            if (c5mg.LJIJ == null) {
                c5mg.LJIJ = new SafeHandler(this.LJLIL.LJIJJLI);
            }
            SafeHandler safeHandler = this.LJLIL.LJIJ;
            if (safeHandler != null) {
                safeHandler.post(new ARunnableS38S0100000_2(this, 20));
            }
        }
    }
}
