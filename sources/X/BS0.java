package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BS0 implements UOY {
    public final /* synthetic */ ActivityTreasureBoxWidget LIZ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        C47061t0 c47061t0 = this.LIZ.LJLIL;
        o.LJI(c47061t0);
        c47061t0.setLayoutParams(new ViewGroup.LayoutParams(C15380j0.LIZ(70.0f), C15380j0.LIZ(70.0f)));
        return c47061t0;
    }

    public BS0(ActivityTreasureBoxWidget activityTreasureBoxWidget) {
        this.LIZ = activityTreasureBoxWidget;
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        return new BSO(viewGroup);
    }
}
