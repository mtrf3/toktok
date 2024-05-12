package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.VTl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79797VTl extends VTL<VTQ> implements InterfaceC33971Uz {
    public float LLIIIILZ;
    public float LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public final C16610kz LLIIJI;

    @Override // X.VTL
    public int getLayoutIntRes() {
        return R.layout.dud;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.LLIIIZ) {
            return this.LLIIJI.LJIIIZ(0);
        }
        return super.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLIIJI.LIZLLL;
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        if (this.LLIIIZ) {
            LJIIIIZZ(0);
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79797VTl(Context context) {
        super(context);
        o.LJIIJ(context, "context");
        this.LLIIJI = new C16610kz(this);
    }

    @Override // X.InterfaceC33971Uz
    public final void LJIIIIZZ(int i) {
        this.LLIIJI.LJIIL(i);
    }

    @Override // X.C45621qg, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        this.LLIIIL = false;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.LLIIIILZ = motionEvent.getX();
                this.LLIIIJ = motionEvent.getY();
                if (this.LLIIIZ) {
                    this.LLIIJI.LJIIJJI(2, 0);
                }
            } else if (valueOf != null) {
                if (valueOf.intValue() == 1) {
                    this.LLIIIILZ = motionEvent.getX();
                    this.LLIIIJ = motionEvent.getY();
                } else if (valueOf.intValue() == 2 && !getMScrollEnable()) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.LLIIIILZ) > Math.abs(y - this.LLIIIJ)) {
                        this.LLIIIILZ = x;
                        this.LLIIIJ = y;
                        this.LLIIIL = false;
                    } else {
                        this.LLIIIL = true;
                    }
                }
            }
        }
        if (!getMScrollEnable()) {
            return this.LLIIIL;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C45621qg, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (getMScrollEnable()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                if (this.LLIIIZ) {
                    this.LLIIJI.LJIIJJI(2, 0);
                }
            } else if (num.intValue() == 1) {
                super.performClick();
            }
        }
        return false;
    }

    public final void setNestedScrollAsChild(boolean z) {
        this.LLIIIZ = z;
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLIIJI.LJIIJ(z);
    }

    @Override // X.VTL
    public void setScrollEnable(boolean z) {
        setMScrollEnable(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        if (this.LLIIIZ) {
            return this.LLIIJI.LJIIJJI(i, 0);
        }
        return super.startNestedScroll(i);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        if (this.LLIIIZ) {
            return this.LLIIJI.LIZIZ(f, f2);
        }
        return super.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        if (this.LLIIIZ) {
            return this.LLIIJI.LIZ(f, f2, z);
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    @Override // X.C45621qg, X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIJ(child, "child");
        o.LJIIJ(target, "target");
        return super.LJJLIIJ(child, target, i, i2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        if (this.LLIIIZ) {
            return this.LLIIJI.LIZJ(i, i2, 0, iArr, iArr2);
        }
        return super.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        if (this.LLIIIZ) {
            return this.LLIIJI.LJI(i, i2, i3, i4, iArr, 0);
        }
        return super.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }
}
