package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LPU extends C54962Lhe implements InterfaceC54157LNh {
    public boolean LLJJJJ;

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC54157LNh
    public int getCurrentItemCompat() {
        return LJJIJIIJIL(getCurrentItem());
    }

    @Override // X.InterfaceC54157LNh
    public final boolean V0() {
        return this.LLJJJJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LPU(Context context) {
        super(context);
        new LinkedHashMap();
        o.LJI(context);
        this.LLJJJJ = true;
    }

    @Override // X.InterfaceC54157LNh
    public final void LJJJJZ(boolean z) {
        this.LLJJJJ = z;
    }

    @Override // X.C80769Vmv, android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.LLJJJJ && super.canScrollHorizontally(i)) {
            return true;
        }
        return false;
    }

    @Override // X.C54962Lhe, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        getContext();
        if (this.LLJJJJ && super.onInterceptTouchEvent(event)) {
            return true;
        }
        return false;
    }

    @Override // X.C54962Lhe, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (this.LLJJJJ && super.onTouchEvent(event)) {
            return true;
        }
        return false;
    }

    @Override // X.C80769Vmv, X.InterfaceC54157LNh
    public void setDefaultGutterSize(int i) {
        super.setDefaultGutterSize(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LPU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        o.LJI(context);
        this.LLJJJJ = true;
    }

    @Override // X.C80769Vmv
    public final boolean LJII(View v, boolean z, int i, int i2, int i3) {
        o.LJIIIZ(v, "v");
        if (!C52542Kji.LIZ()) {
            return super.LJII(v, z, i, i2, i3);
        }
        if (C27740Aue.LJFF(v) && super.LJII(v, z, i, i2, i3)) {
            return true;
        }
        return false;
    }
}
