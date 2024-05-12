package X;

import android.view.ViewGroup;

/* renamed from: X.QNw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66912QNw implements Runnable {
    public final /* synthetic */ ViewGroup.LayoutParams LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ DialogC66909QNt LJLJJI;

    public final void LIZ() {
        DialogC66909QNt dialogC66909QNt = this.LJLJJI;
        if (dialogC66909QNt.LJLLI) {
            return;
        }
        if (dialogC66909QNt.LJZL.LJ) {
            dialogC66909QNt.LJLILLLLZI.clearAnimation();
            dialogC66909QNt.LJLILLLLZI.setVisibility(8);
        }
        if (dialogC66909QNt.LJZL.LIZLLL) {
            dialogC66909QNt.LJLJLJ.setBackgroundColor(-2013265920);
        }
        ViewGroup.LayoutParams layoutParams = this.LJLIL;
        layoutParams.width = this.LJLILLLLZI;
        layoutParams.height = this.LJLJI;
        this.LJLJJI.LJLJI.setLayoutParams(layoutParams);
        this.LJLJJI.LJLJI.setVisibility(0);
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

    public RunnableC66912QNw(DialogC66909QNt dialogC66909QNt, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        this.LJLJJI = dialogC66909QNt;
        this.LJLIL = layoutParams;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
