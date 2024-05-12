package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VUU extends C45631qh implements VPU {
    public VUR LLIFFJFJJ;
    public boolean LLII;
    public VUV LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public boolean LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public ArrayList<InterfaceC79812VUa> LLIILII;
    public VOV LLIILZL;
    public VUY LLIIZ;
    public int LLIL;
    public int LLILII;
    public final int LLILIL;
    public int LLILL;

    public final void finalize() {
        removeCallbacks(this.LLIIZ);
        super.finalize();
    }

    public int getOrientation() {
        return this.LLIFFJFJJ.getOrientation();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        if (this.LLII) {
            this.LLIFFJFJJ.removeAllViews();
        } else {
            super.removeAllViews();
            this.LLII = true;
        }
    }

    public int getContentHeight() {
        return this.LLIIJI;
    }

    public int getContentWidth() {
        return this.LLIIIZ;
    }

    public HorizontalScrollView getHScrollView() {
        return this.LLIIII;
    }

    public LinearLayout getLinearLayout() {
        return this.LLIFFJFJJ;
    }

    public VUU(Context context) {
        super(context, null);
        this.LLILIL = 300;
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.LLIILII = new ArrayList<>();
        if (this.LLIFFJFJJ == null) {
            VUR vur = new VUR(this, getContext());
            this.LLIFFJFJJ = vur;
            vur.setOrientation(1);
            this.LLIFFJFJJ.setWillNotDraw(true);
            VUV vuv = new VUV(this, getContext());
            this.LLIIII = vuv;
            vuv.setHorizontalScrollBarEnabled(false);
            this.LLIIII.setOverScrollMode(2);
            this.LLIIII.setFadingEdgeLength(0);
            this.LLIIII.setWillNotDraw(true);
            this.LLIIII.addView(this.LLIFFJFJJ, new FrameLayout.LayoutParams(-1, -1));
            addView(this.LLIIII, new FrameLayout.LayoutParams(-2, -2));
        }
        this.LLIIZ = new VUY(this);
    }

    public final void LJIJI(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LLIIJLIL = true;
            return;
        }
        if (motionEvent.getAction() != 1) {
            return;
        }
        if (this.LLIIL) {
            LJIJJ(2);
            Iterator<InterfaceC79812VUa> it = this.LLIILII.iterator();
            while (it.hasNext()) {
                it.next().LJ();
            }
        }
        this.LLIIL = false;
        this.LLIIJLIL = false;
    }

    public final void LJIJJ(int i) {
        this.LLILL = i;
        Iterator<InterfaceC79812VUa> it = this.LLIILII.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void addView(View view) {
        if (this.LLII) {
            this.LLIFFJFJJ.addView(view);
        } else {
            super.addView(view);
            this.LLII = true;
        }
    }

    @Override // X.VPU
    public final void bindDrawChildHook(VOV vov) {
        this.LLIILZL = vov;
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLIIIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C45631qh, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLIIIL) {
            LJIJI(motionEvent);
            if (motionEvent.getAction() == 0) {
                LJIJJ(this.LLILL);
            }
            if (motionEvent.getAction() == 1) {
                this.LLIL = getScrollY();
                this.LLILII = this.LLIIII.getScrollX();
                postDelayed(this.LLIIZ, this.LLILIL);
            }
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLII) {
            C16880lQ.LJZI(this.LLIFFJFJJ, view);
        } else {
            super.removeView(view);
            this.LLII = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        if (this.LLII) {
            C16880lQ.LLII(this.LLIFFJFJJ, i);
        } else {
            super.removeViewAt(i);
            this.LLII = true;
        }
    }

    public void setOnScrollListener(InterfaceC79812VUa interfaceC79812VUa) {
        this.LLIILII.add(interfaceC79812VUa);
    }

    public void setOrientation(int i) {
        if (i == 0) {
            this.LLIFFJFJJ.setOrientation(0);
            this.LLIIIL = true;
        } else {
            if (i != 1) {
                return;
            }
            this.LLIFFJFJJ.setOrientation(1);
            this.LLIIIL = false;
        }
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        this.LLIIII.setHorizontalScrollBarEnabled(z);
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void addView(View view, int i) {
        if (this.LLII) {
            this.LLIFFJFJJ.addView(view, i);
        } else {
            super.addView(view, i);
            this.LLII = true;
        }
    }

    @Override // X.C45631qh, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.LLII) {
            this.LLIFFJFJJ.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
            this.LLII = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        if (this.LLII) {
            this.LLIFFJFJJ.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
            this.LLII = true;
        }
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LLII) {
            this.LLIFFJFJJ.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
            this.LLII = true;
        }
    }

    @Override // X.C45631qh, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == this.LLIIIILZ) {
            return;
        }
        if (this.LLIIJLIL && !this.LLIIL) {
            this.LLIIL = true;
            LJIJJ(1);
            Iterator<InterfaceC79812VUa> it = this.LLIILII.iterator();
            while (it.hasNext()) {
                it.next().LIZIZ();
            }
        } else {
            LJIJJ(this.LLILL);
            Iterator<InterfaceC79812VUa> it2 = this.LLIILII.iterator();
            while (it2.hasNext()) {
                it2.next().onScrollChanged();
            }
        }
        if (this.LLIIIILZ != getScrollY()) {
            this.LLIIIILZ = getScrollY();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.LLIFFJFJJ.setPadding(i, i2, i3, i4);
    }
}
