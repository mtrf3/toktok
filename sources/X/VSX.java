package X;

import java.util.TimerTask;

/* loaded from: classes15.dex */
public final class VSX extends TimerTask {
    public int LJLIL = Integer.MAX_VALUE;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final VSW LJLJJI;

    public final void LIZ() {
        if (this.LJLIL == Integer.MAX_VALUE) {
            this.LJLIL = this.LJLJI;
        }
        int i = this.LJLIL;
        int i2 = (int) (i * 0.1f);
        this.LJLILLLLZI = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.LJLILLLLZI = -1;
            } else {
                this.LJLILLLLZI = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.LJLJJI.LIZ();
            this.LJLJJI.getHandler().sendEmptyMessage(3000);
            return;
        }
        VSW vsw = this.LJLJJI;
        vsw.setTotalScrollY(vsw.getTotalScrollY() + this.LJLILLLLZI);
        VSW vsw2 = this.LJLJJI;
        if (!vsw2.LLI) {
            float itemHeight = vsw2.getItemHeight();
            float itemsCount = ((this.LJLJJI.getItemsCount() - 1) - this.LJLJJI.getInitPosition()) * itemHeight;
            if (this.LJLJJI.getTotalScrollY() <= (-this.LJLJJI.getInitPosition()) * itemHeight || this.LJLJJI.getTotalScrollY() >= itemsCount) {
                VSW vsw3 = this.LJLJJI;
                vsw3.setTotalScrollY(vsw3.getTotalScrollY() - this.LJLILLLLZI);
                this.LJLJJI.LIZ();
                this.LJLJJI.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.LJLJJI.getHandler().sendEmptyMessage(1000);
        this.LJLIL -= this.LJLILLLLZI;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VSX(VSW vsw, int i) {
        this.LJLJJI = vsw;
        this.LJLJI = i;
    }
}
