package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class MFQ {
    public final RecyclerView LIZ;
    public final C56490MFa LIZIZ;

    public final void LIZ() {
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object LJJJJJL = this.LIZ.LJJJJJL(this.LIZ.getChildAt(i));
            if (LJJJJJL instanceof MFR) {
                MFR mfr = (MFR) LJJJJJL;
                mfr.setUserVisibleHint(false);
                mfr.d();
            }
        }
    }

    public MFQ(RecyclerView recyclerView, C56490MFa c56490MFa) {
        this.LIZIZ = c56490MFa;
        this.LIZ = recyclerView;
    }
}
