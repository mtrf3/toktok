package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wup, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83807Wup implements InterfaceC83793Wub {
    public FrameLayout LIZ;
    public FrameLayout LIZIZ;
    public FrameLayout LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C83808Wuq LJ;

    @Override // X.InterfaceC83793Wub
    public final int LIZIZ() {
        return ((InterfaceC83687Wst) this.LIZLLL.getValue()).K5().getHeight();
    }

    @Override // X.InterfaceC83793Wub
    public final int LIZJ() {
        return ((InterfaceC83687Wst) this.LIZLLL.getValue()).K5().getWidth();
    }

    @Override // X.InterfaceC83793Wub
    public final C83808Wuq getView() {
        return this.LJ;
    }

    public C83807Wup(C83808Wuq ckCameraView) {
        o.LJIIIZ(ckCameraView, "ckCameraView");
        this.LJ = ckCameraView;
        this.LIZLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 351));
    }

    @Override // X.InterfaceC83793Wub
    public final void LJZI(View child) {
        o.LJIIIZ(child, "child");
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            frameLayout.addView(child);
        } else {
            o.LJIJI("middleLayer");
            throw null;
        }
    }

    @Override // X.InterfaceC83793Wub
    public final void removeView(View view) {
        o.LJIIIZ(view, "view");
        C83813Wuv layer = C83813Wuv.LIZ;
        o.LJIIIZ(layer, "layer");
        if (o.LJ(layer, C83804Wum.LIZ)) {
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                C16880lQ.LJLLLL(view, frameLayout);
                return;
            } else {
                o.LJIJI("bottomLayer");
                throw null;
            }
        }
        if (o.LJ(layer, layer)) {
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 != null) {
                C16880lQ.LJLLLL(view, frameLayout2);
                return;
            } else {
                o.LJIJI("middleLayer");
                throw null;
            }
        }
        if (!o.LJ(layer, C83814Wuw.LIZ)) {
            return;
        }
        FrameLayout frameLayout3 = this.LIZJ;
        if (frameLayout3 != null) {
            C16880lQ.LJLLLL(view, frameLayout3);
        } else {
            o.LJIJI("topLayer");
            throw null;
        }
    }

    @Override // X.InterfaceC83793Wub
    public final void LIZ(C83643WsB c83643WsB, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(c83643WsB, layoutParams, C83813Wuv.LIZ);
    }

    @Override // X.InterfaceC83793Wub
    public final void LIZLLL(View child, ViewGroup.LayoutParams layoutParams, AbstractC83806Wuo layer) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(layer, "layer");
        if (o.LJ(layer, C83804Wum.LIZ)) {
            FrameLayout frameLayout = this.LIZ;
            if (frameLayout != null) {
                frameLayout.addView(child, layoutParams);
                return;
            } else {
                o.LJIJI("bottomLayer");
                throw null;
            }
        }
        if (o.LJ(layer, C83813Wuv.LIZ)) {
            FrameLayout frameLayout2 = this.LIZIZ;
            if (frameLayout2 != null) {
                frameLayout2.addView(child, layoutParams);
                return;
            } else {
                o.LJIJI("middleLayer");
                throw null;
            }
        }
        if (!o.LJ(layer, C83814Wuw.LIZ)) {
            return;
        }
        FrameLayout frameLayout3 = this.LIZJ;
        if (frameLayout3 != null) {
            frameLayout3.addView(child, layoutParams);
        } else {
            o.LJIJI("topLayer");
            throw null;
        }
    }
}
