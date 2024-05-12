package X;

import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.S1k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC71424S1k implements Runnable {
    public final /* synthetic */ C71420S1g LJLIL;
    public final /* synthetic */ S1U LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    public RunnableC71424S1k(C71420S1g c71420S1g, S1U s1u, int i, int i2, int i3, int i4) {
        this.LJLIL = c71420S1g;
        this.LJLILLLLZI = s1u;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJJLL = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        int i;
        int i2;
        try {
            TuxTextView tuxTextView = this.LJLIL.LIZJ;
            if (tuxTextView != null) {
                i = tuxTextView.getWidth();
            } else {
                i = 0;
            }
            TuxTextView tuxTextView2 = this.LJLIL.LJ;
            if (tuxTextView2 != null) {
                i2 = tuxTextView2.getWidth();
            } else {
                i2 = 0;
            }
            this.LJLILLLLZI.LJJJJZI(this.LJLJI, this.LJLJJI, this.LJLJJL, i, i2, this.LJLJJLL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
