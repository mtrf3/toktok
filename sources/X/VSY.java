package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.TimerTask;

/* loaded from: classes15.dex */
public final class VSY extends TimerTask {
    public float LJLIL = 2.1474836E9f;
    public final float LJLILLLLZI;
    public final VSW LJLJI;

    public final void LIZ() {
        if (this.LJLIL == 2.1474836E9f) {
            float f = 2000.0f;
            if (Math.abs(this.LJLILLLLZI) > 2000.0f) {
                if (this.LJLILLLLZI <= 0.0f) {
                    f = -2000.0f;
                }
                this.LJLIL = f;
            } else {
                this.LJLIL = this.LJLILLLLZI;
            }
        }
        if (Math.abs(this.LJLIL) >= 0.0f && Math.abs(this.LJLIL) <= 20.0f) {
            this.LJLJI.LIZ();
            this.LJLJI.getHandler().sendEmptyMessage(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            return;
        }
        int i = (int) (this.LJLIL / 100.0f);
        VSW vsw = this.LJLJI;
        float f2 = i;
        vsw.setTotalScrollY(vsw.getTotalScrollY() - f2);
        VSW vsw2 = this.LJLJI;
        if (!vsw2.LLI) {
            float itemHeight = vsw2.getItemHeight();
            float f3 = (-this.LJLJI.getInitPosition()) * itemHeight;
            float itemsCount = ((this.LJLJI.getItemsCount() - 1) - this.LJLJI.getInitPosition()) * itemHeight;
            double d = itemHeight * 0.25d;
            if (this.LJLJI.getTotalScrollY() - d < f3) {
                f3 = this.LJLJI.getTotalScrollY() + f2;
            } else if (this.LJLJI.getTotalScrollY() + d > itemsCount) {
                itemsCount = this.LJLJI.getTotalScrollY() + f2;
            }
            if (this.LJLJI.getTotalScrollY() <= f3) {
                this.LJLIL = 40.0f;
                this.LJLJI.setTotalScrollY((int) f3);
            } else if (this.LJLJI.getTotalScrollY() >= itemsCount) {
                this.LJLJI.setTotalScrollY((int) itemsCount);
                this.LJLIL = -40.0f;
            }
        }
        float f4 = this.LJLIL;
        if (f4 < 0.0f) {
            this.LJLIL = f4 + 20.0f;
        } else {
            this.LJLIL = f4 - 20.0f;
        }
        this.LJLJI.getHandler().sendEmptyMessage(1000);
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

    public VSY(VSW vsw, float f) {
        this.LJLJI = vsw;
        this.LJLILLLLZI = f;
    }
}
