package Y;

import X.C16880lQ;
import X.C29306Beo;
import X.C80796VnM;
import X.C80895Vox;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public class ARunnableS2S0111000_14 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        Boolean bool;
        ((C80895Vox) this.l0).LIZ();
        if (((C80895Vox) this.l0).getNestedScrollY() < 0) {
            RecyclerView recyclerView = ((C80895Vox) this.l0).LJLIL;
            if (recyclerView != null) {
                bool = Boolean.valueOf(recyclerView.canScrollVertically(-1));
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                this.z1 = true;
                C80895Vox c80895Vox = (C80895Vox) this.l0;
                int nestedScrollY = c80895Vox.getNestedScrollY();
                try {
                    RecyclerView recyclerView2 = c80895Vox.LJLIL;
                    if (recyclerView2 != null) {
                        recyclerView2.scrollBy(0, nestedScrollY);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                C80895Vox c80895Vox2 = (C80895Vox) this.l0;
                c80895Vox2.scrollTo(0, c80895Vox2.getHeaderHeight());
                return;
            }
            int i = this.i2;
            if (i < 5 && !this.z1) {
                this.i2 = i + 1;
                RecyclerView recyclerView3 = ((C80895Vox) this.l0).LJLIL;
                if (recyclerView3 != null) {
                    recyclerView3.postDelayed(this, 50L);
                }
            }
        }
    }

    public static final void run$0(ARunnableS2S0111000_14 aRunnableS2S0111000_14) {
        boolean LIZ;
        try {
            aRunnableS2S0111000_14.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0111000_14 aRunnableS2S0111000_14) {
        ((C80796VnM) aRunnableS2S0111000_14.l0).LJIL(aRunnableS2S0111000_14.i2, aRunnableS2S0111000_14.z1);
    }

    public ARunnableS2S0111000_14(C80895Vox c80895Vox, int i) {
        this.$t = i;
        this.l0 = c80895Vox;
    }

    public ARunnableS2S0111000_14(C80796VnM c80796VnM, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = c80796VnM;
        this.i2 = i;
        this.z1 = z;
    }
}
