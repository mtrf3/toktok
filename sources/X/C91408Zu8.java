package X;

import android.animation.ValueAnimator;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.Zu8, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91408Zu8 implements InterfaceC91212Zqy {
    public final ValueAnimator LJLIL;
    public final ValueAnimator LJLILLLLZI;
    public final LifecycleOwner LJLJI;
    public final int LJLJJI = EnumC91213Zqz.TAB_LAYOUT.ordinal();

    @Override // X.InterfaceC91212Zqy
    public final void dismiss() {
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // X.InterfaceC91212Zqy
    public final void show() {
        ValueAnimator valueAnimator = this.LJLIL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // X.InterfaceC91212Zqy
    public final int LLLLZLL() {
        return this.LJLJJI;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC91212Zqy interfaceC91212Zqy) {
        InterfaceC91212Zqy other = interfaceC91212Zqy;
        o.LJIIIZ(other, "other");
        return LLLLZLL() - other.LLLLZLL();
    }

    public C91408Zu8(ValueAnimator valueAnimator, ValueAnimator valueAnimator2, LifecycleOwner lifecycleOwner) {
        this.LJLIL = valueAnimator;
        this.LJLILLLLZI = valueAnimator2;
        this.LJLJI = lifecycleOwner;
    }
}
