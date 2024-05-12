package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.IDqS461S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VmZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80747VmZ implements InterfaceC80752Vme {
    public final int LIZ = C7MY.LIZIZ(540);
    public final int LIZIZ = C7MY.LIZIZ(296);
    public final int LIZJ = C7MY.LIZIZ(32);
    public final int LIZLLL = C7MY.LIZIZ(16);
    public final int LJ = C7MY.LIZIZ(360);
    public final int LJFF = C7MY.LIZIZ(166);
    public final int LJI = C7MY.LIZIZ(480);
    public final int LJII = C7MY.LIZIZ(68);
    public final int LJIIIIZZ = C7MY.LIZIZ(200);
    public final int LJIIIZ = C7MY.LIZIZ(LiveBroadcastUploadVideoImageHeightSetting.DEFAULT);
    public final int LJIIJ = C7MY.LIZIZ(34);

    @Override // X.InterfaceC80752Vme
    public final void LIZIZ(int i, int i2, C80751Vmd tuxAdaptiveContainer, AqS196S0100000_14 aqS196S0100000_14) {
        int measuredWidth;
        int i3;
        int i4;
        int LJIIL;
        o.LJIIIZ(tuxAdaptiveContainer, "tuxAdaptiveContainer");
        aqS196S0100000_14.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        View childAt = tuxAdaptiveContainer.getChildAt(0);
        Context context = tuxAdaptiveContainer.getContext();
        o.LJIIIIZZ(context, "tuxAdaptiveContainer.context");
        if (C63081OpJ.LJZI(context)) {
            i4 = this.LIZ;
            LJIIL = C78842Uww.LJIIL(childAt.getMeasuredHeight(), this.LJIIIIZZ, this.LJIIIZ);
        } else {
            if (tuxAdaptiveContainer.getMeasuredWidth() > this.LIZIZ) {
                measuredWidth = tuxAdaptiveContainer.getMeasuredWidth();
                i3 = this.LIZJ;
            } else {
                measuredWidth = tuxAdaptiveContainer.getMeasuredWidth();
                i3 = this.LIZLLL;
            }
            i4 = measuredWidth - i3;
            int i5 = this.LJ;
            if (i4 > i5) {
                i4 = i5;
            }
            Context context2 = tuxAdaptiveContainer.getContext();
            o.LJIIIIZZ(context2, "tuxAdaptiveContainer.context");
            if (C63081OpJ.LJLLILLLL(context2)) {
                LJIIL = C78842Uww.LJIIL(childAt.getMeasuredHeight(), this.LJFF, tuxAdaptiveContainer.getMeasuredHeight() - this.LJII);
            } else {
                LJIIL = C78842Uww.LJIIL(childAt.getMeasuredHeight(), this.LJFF, this.LJI);
            }
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(LJIIL, 1073741824));
    }

    @Override // X.InterfaceC80752Vme
    public final void LIZ(boolean z, int i, int i2, int i3, int i4, C80751Vmd tuxAdaptiveContainer, IDqS461S0100000_14 iDqS461S0100000_14) {
        o.LJIIIZ(tuxAdaptiveContainer, "tuxAdaptiveContainer");
        View child = tuxAdaptiveContainer.getChildAt(0);
        Context context = tuxAdaptiveContainer.getContext();
        o.LJIIIIZZ(context, "context");
        if (!C63081OpJ.LJZI(context) && C63081OpJ.LJLLILLLL(context)) {
            int measuredWidth = child.getMeasuredWidth();
            int i5 = i4 - this.LJIIJ;
            int i6 = (((i3 - i) - measuredWidth) / 2) + i;
            child.layout(i6, i5 - child.getMeasuredHeight(), measuredWidth + i6, i5);
            return;
        }
        o.LJIIIIZZ(child, "child");
        C80753Vmf.LIZ(child, i, i2, i3, i4);
    }
}
