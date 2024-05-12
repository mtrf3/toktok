package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Vsu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81140Vsu extends AbstractC270614k {
    public final /* synthetic */ C81139Vst LIZ;

    @Override // X.AbstractC270614k
    public final boolean tryCaptureView(View child, int i) {
        o.LJIIIZ(child, "child");
        return true;
    }

    public C81140Vsu(C81139Vst c81139Vst) {
        this.LIZ = c81139Vst;
    }

    @Override // X.AbstractC270614k
    public final int getViewVerticalDragRange(View child) {
        o.LJIIIZ(child, "child");
        return this.LIZ.LJLJJLL;
    }

    @Override // X.AbstractC270614k
    public final int clampViewPositionVertical(View child, int i, int i2) {
        o.LJIIIZ(child, "child");
        int height = this.LIZ.getHeight();
        C81139Vst c81139Vst = this.LIZ;
        int i3 = height - c81139Vst.LJLLI;
        return Math.min(Math.max(i3, i), c81139Vst.getHeight() - this.LIZ.LJLL);
    }

    @Override // X.AbstractC270614k
    public final void onViewReleased(View releasedChild, float f, float f2) {
        o.LJIIIZ(releasedChild, "releasedChild");
        super.onViewReleased(releasedChild, f, f2);
        int top = releasedChild.getTop();
        C81139Vst c81139Vst = this.LIZ;
        int i = c81139Vst.LJLLILLLL;
        int height = c81139Vst.getHeight();
        C81139Vst c81139Vst2 = this.LIZ;
        int i2 = top - (height - c81139Vst2.LJLLI);
        if ((i2 >= 0 && i2 <= i) || f2 < 0.0f) {
            c81139Vst2.LJJLL();
            return;
        }
        int i3 = c81139Vst2.LJLLJ;
        int height2 = c81139Vst2.getHeight();
        C81139Vst c81139Vst3 = this.LIZ;
        int i4 = (height2 - c81139Vst3.LJLL) - top;
        if ((i4 < 0 || i4 > i3) && f2 <= 0.0f) {
            return;
        }
        c81139Vst3.LJJLJLI();
    }

    @Override // X.AbstractC270614k
    public final void onViewPositionChanged(View changedView, int i, int i2, int i3, int i4) {
        o.LJIIIZ(changedView, "changedView");
        ViewGroup viewGroup = this.LIZ.LJLJI;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            o.LJIIIIZZ(layoutParams, "dragContentContainer.layoutParams");
            int height = this.LIZ.getHeight() - i2;
            ViewGroup viewGroup2 = this.LIZ.LJLILLLLZI;
            if (viewGroup2 != null) {
                layoutParams.height = height - viewGroup2.getHeight();
                ViewGroup viewGroup3 = this.LIZ.LJLJI;
                if (viewGroup3 != null) {
                    viewGroup3.setLayoutParams(layoutParams);
                    C81139Vst c81139Vst = this.LIZ;
                    ViewGroup viewGroup4 = c81139Vst.LJLJI;
                    if (viewGroup4 != null) {
                        ViewGroup viewGroup5 = c81139Vst.LJLILLLLZI;
                        if (viewGroup5 != null) {
                            viewGroup4.setTop(viewGroup5.getHeight() + i2);
                            C81139Vst c81139Vst2 = this.LIZ;
                            int height2 = c81139Vst2.getHeight();
                            if (c81139Vst2.LJLILLLLZI != null) {
                                float top = ((height2 - r0.getTop()) - c81139Vst2.LJLL) / c81139Vst2.LJLJJLL;
                                View view = c81139Vst2.LJLJJI;
                                if (view != null) {
                                    view.setAlpha(top);
                                    return;
                                } else {
                                    o.LJIJI("overlay");
                                    throw null;
                                }
                            }
                            o.LJIJI("dragBarContainer");
                            throw null;
                        }
                        o.LJIJI("dragBarContainer");
                        throw null;
                    }
                    o.LJIJI("dragContentContainer");
                    throw null;
                }
                o.LJIJI("dragContentContainer");
                throw null;
            }
            o.LJIJI("dragBarContainer");
            throw null;
        }
        o.LJIJI("dragContentContainer");
        throw null;
    }
}
