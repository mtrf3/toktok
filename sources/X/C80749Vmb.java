package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.IDqS461S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vmb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80749Vmb implements InterfaceC80752Vme {
    public final int LIZ = C7MY.LIZIZ(280);
    public final int LIZIZ = C7MY.LIZIZ(16);
    public final int LIZJ = C7MY.LIZIZ(360);
    public final float LIZLLL = 0.8f;
    public final int LJ = C7MY.LIZIZ(480);

    @Override // X.InterfaceC80752Vme
    public final void LIZIZ(int i, int i2, C80751Vmd tuxAdaptiveContainer, AqS196S0100000_14 aqS196S0100000_14) {
        int measuredWidth;
        int i3;
        o.LJIIIZ(tuxAdaptiveContainer, "tuxAdaptiveContainer");
        aqS196S0100000_14.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        View childAt = tuxAdaptiveContainer.getChildAt(0);
        if (tuxAdaptiveContainer.getMeasuredWidth() > this.LIZ + this.LIZIZ) {
            measuredWidth = tuxAdaptiveContainer.getMeasuredWidth();
            i3 = this.LIZIZ * 2;
        } else {
            measuredWidth = tuxAdaptiveContainer.getMeasuredWidth();
            i3 = this.LIZIZ;
        }
        int i4 = measuredWidth - i3;
        int i5 = this.LIZJ;
        if (i4 > i5) {
            i4 = i5;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min((int) (tuxAdaptiveContainer.getMeasuredHeight() * this.LIZLLL), this.LJ), LiveLayoutPreloadThreadPriority.DEFAULT));
    }

    @Override // X.InterfaceC80752Vme
    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C80751Vmd tuxAdaptiveContainer, IDqS461S0100000_14 iDqS461S0100000_14) {
        o.LJIIIZ(tuxAdaptiveContainer, "tuxAdaptiveContainer");
        View child = tuxAdaptiveContainer.getChildAt(0);
        o.LJIIIIZZ(child, "child");
        C80753Vmf.LIZ(child, i, i2, i3, i4);
    }
}
