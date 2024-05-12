package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import kotlin.jvm.internal.IDqS11S0101000;

/* renamed from: X.1c1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36531c1 extends C04D {
    public final Window LJLJLJ;
    public final ParcelableSnapshotMutableState LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    @Override // X.C04D
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LJLLI;
    }

    public C36531c1(Context context, Window window) {
        super(context, null, 6, 0);
        this.LJLJLJ = window;
        this.LJLJLLL = C78966Uyw.LJJJIL(C25840zs.LIZ);
    }

    @Override // X.C04D
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(1735448596);
        ((InterfaceC88471Ynr) this.LJLJLLL.getValue()).invoke(LJIL, 0);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(this, i, 13);
    }

    @Override // X.C04D
    public final void LJI(int i, int i2) {
        if (this.LJLL) {
            super.LJI(i, i2);
            return;
        }
        super.LJI(View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density), LiveLayoutPreloadThreadPriority.DEFAULT));
    }

    @Override // X.C04D
    public final void LJFF(int i, int i2, int i3, int i4, boolean z) {
        super.LJFF(i, i2, i3, i4, z);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.LJLJLJ.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }
}
