package X;

import java.util.TimerTask;

/* renamed from: X.VSd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79763VSd extends TimerTask {
    public int LJLIL = Integer.MAX_VALUE;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final C79762VSc LJLJJI;

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
        C79762VSc c79762VSc = this.LJLJJI;
        c79762VSc.setTotalScrollY(c79762VSc.getTotalScrollY() + this.LJLILLLLZI);
        C79762VSc c79762VSc2 = this.LJLJJI;
        if (!c79762VSc2.LLFII) {
            float itemHeight = c79762VSc2.getItemHeight();
            float itemsCount = ((this.LJLJJI.getItemsCount() - 1) - this.LJLJJI.getInitPosition()) * itemHeight;
            if (this.LJLJJI.getTotalScrollY() <= (-this.LJLJJI.getInitPosition()) * itemHeight || this.LJLJJI.getTotalScrollY() >= itemsCount) {
                C79762VSc c79762VSc3 = this.LJLJJI;
                c79762VSc3.setTotalScrollY(c79762VSc3.getTotalScrollY() - this.LJLILLLLZI);
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

    public C79763VSd(C79762VSc c79762VSc, int i) {
        this.LJLJJI = c79762VSc;
        this.LJLJI = i;
    }
}
