package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.lynx.tasm.base.LLog;
import kotlin.jvm.internal.o;

/* renamed from: X.Vd0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80154Vd0 extends C80157Vd3 {
    public final /* synthetic */ View LJLL;

    @Override // X.C80157Vd3, X.InterfaceC80159Vd5
    public final boolean LIZ() {
        View view = this.LJLJI;
        if (view == null || !this.LJLJL) {
            return false;
        }
        if (view.getVisibility() == 0 && view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.C80157Vd3, X.InterfaceC80159Vd5
    public final boolean LJIILJJIL() {
        View view = this.LJLJI;
        if (view == null || !this.LJLJLJ) {
            return false;
        }
        if (view.getVisibility() == 0 && view.canScrollVertically(1)) {
            return false;
        }
        return true;
    }

    @Override // X.C80157Vd3, X.InterfaceC80159Vd5
    public final void LIZIZ(MotionEvent motionEvent) {
        if (this.LJLIL != null) {
            if (motionEvent != null) {
                PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                View mContentView = this.LJLIL;
                o.LJFF(mContentView, "mContentView");
                float f = -mContentView.getLeft();
                View mContentView2 = this.LJLIL;
                o.LJFF(mContentView2, "mContentView");
                pointF.offset(f, -mContentView2.getTop());
                this.LJLJI = null;
                View mContentView3 = this.LJLIL;
                o.LJFF(mContentView3, "mContentView");
                LJII(mContentView3, pointF);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("finish search, point = ");
                LIZ.append(pointF);
                LIZ.append(", scrollableView = ");
                LIZ.append(this.LJLJI);
                LIZ.append(", contentView = ");
                LIZ.append(this.LJLIL);
                LLog.LIZLLL(2, "LynxPullRefreshView", X1D.LIZIZ(LIZ));
                View view = this.LJLJI;
                if (view == null) {
                    view = this.LJLIL;
                }
                this.LJLJI = view;
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80154Vd0(View view, View view2) {
        super(view2);
        this.LJLL = view;
    }

    public final void LJII(View view, PointF pointF) {
        PointF pointF2 = new PointF();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount >= 1) {
                childCount--;
                View childAt = viewGroup.getChildAt(childCount);
                o.LJFF(childAt, "it.getChildAt(i - 1)");
                if (childAt.getVisibility() == 0) {
                    pointF2.x = (pointF.x + view.getScrollX()) - childAt.getLeft();
                    pointF2.y = (pointF.y + view.getScrollY()) - childAt.getTop();
                    if (new RectF(0.0f, 0.0f, childAt.getWidth(), childAt.getHeight()).contains(pointF2.x, pointF2.y)) {
                        LJII(childAt, pointF2);
                    }
                }
            }
            if (!(view instanceof ViewPager) && InterpolatorC80153Vcz.LIZLLL(view) && this.LJLJI == null) {
                this.LJLJI = view;
            }
        }
    }
}
