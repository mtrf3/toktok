package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.IDqS461S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vma, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80748Vma implements InterfaceC80752Vme {
    public final int LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C80748Vma() {
        int LIZIZ = C7MY.LIZIZ(280);
        this.LIZ = LIZIZ;
        this.LIZIZ = 0.8f;
        this.LIZJ = C7MY.LIZIZ(480);
        int LIZIZ2 = C7MY.LIZIZ(16);
        this.LIZLLL = LIZIZ2;
        this.LJ = LIZIZ + LIZIZ2;
    }

    @Override // X.InterfaceC80752Vme
    public final void LIZIZ(int i, int i2, C80751Vmd tuxAdaptiveContainer, AqS196S0100000_14 aqS196S0100000_14) {
        int measuredWidth;
        o.LJIIIZ(tuxAdaptiveContainer, "tuxAdaptiveContainer");
        aqS196S0100000_14.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        View childAt = tuxAdaptiveContainer.getChildAt(0);
        if (tuxAdaptiveContainer.getMeasuredWidth() > this.LJ) {
            measuredWidth = this.LIZ;
        } else {
            measuredWidth = tuxAdaptiveContainer.getMeasuredWidth() - this.LIZLLL;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min((int) (tuxAdaptiveContainer.getMeasuredHeight() * this.LIZIZ), this.LIZJ), LiveLayoutPreloadThreadPriority.DEFAULT));
    }

    @Override // X.InterfaceC80752Vme
    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C80751Vmd tuxAdaptiveContainer, IDqS461S0100000_14 iDqS461S0100000_14) {
        o.LJIIIZ(tuxAdaptiveContainer, "tuxAdaptiveContainer");
        View child = tuxAdaptiveContainer.getChildAt(0);
        o.LJIIIIZZ(child, "child");
        C80753Vmf.LIZ(child, i, i2, i3, i4);
    }
}
