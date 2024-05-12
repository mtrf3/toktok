package androidx.drawerlayout.widget;

import X.AbstractC270614k;
import X.C025107z;
import X.C270714l;
import android.view.View;

/* loaded from: classes.dex */
public class DrawerLayout$ViewDragCallback extends AbstractC270614k {
    public final int mAbsGravity;
    public C270714l mDragger;
    public final Runnable mPeekRunnable = new Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback.1
        @Override // java.lang.Runnable
        public void run() {
            androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1__run$___twin___() {
            DrawerLayout$ViewDragCallback.this.peekDrawer();
        }

        public static void androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.androidx_drawerlayout_widget_DrawerLayout$ViewDragCallback$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public final /* synthetic */ C025107z this$0;

    @Override // X.AbstractC270614k
    public boolean onEdgeLock(int i) {
        return false;
    }

    private void closeOtherDrawer() {
        int i = 3;
        if (this.mAbsGravity == 3) {
            i = 5;
        }
        View findDrawerWithGravity = this.this$0.findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            this.this$0.closeDrawer(findDrawerWithGravity);
        }
    }

    public void peekDrawer() {
        boolean z;
        View findDrawerWithGravity;
        int width;
        int i = this.mDragger.LJIILJJIL;
        if (this.mAbsGravity == 3) {
            z = true;
            findDrawerWithGravity = this.this$0.findDrawerWithGravity(3);
            if (findDrawerWithGravity != null) {
                width = (-findDrawerWithGravity.getWidth()) + i;
            } else {
                return;
            }
        } else {
            z = false;
            findDrawerWithGravity = this.this$0.findDrawerWithGravity(5);
            width = this.this$0.getWidth() - i;
        }
        if (findDrawerWithGravity != null) {
            if (z) {
                if (findDrawerWithGravity.getLeft() >= width) {
                    return;
                }
            } else if (findDrawerWithGravity.getLeft() <= width) {
                return;
            }
            if (this.this$0.getDrawerLockMode(findDrawerWithGravity) != 0) {
                return;
            }
            DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams) findDrawerWithGravity.getLayoutParams();
            this.mDragger.LJIJJLI(width, findDrawerWithGravity.getTop(), findDrawerWithGravity);
            drawerLayout$LayoutParams.isPeeking = true;
            this.this$0.invalidate();
            closeOtherDrawer();
            this.this$0.cancelChildViewTouch();
        }
    }

    public void removeCallbacks() {
        this.this$0.removeCallbacks(this.mPeekRunnable);
    }

    @Override // X.AbstractC270614k
    public int getViewHorizontalDragRange(View view) {
        if (this.this$0.isDrawerView(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // X.AbstractC270614k
    public void onViewDragStateChanged(int i) {
        this.this$0.updateDrawerState(this.mAbsGravity, i, this.mDragger.LJIJI);
    }

    public void setDragger(C270714l c270714l) {
        this.mDragger = c270714l;
    }

    public DrawerLayout$ViewDragCallback(C025107z c025107z, int i) {
        this.this$0 = c025107z;
        this.mAbsGravity = i;
    }

    @Override // X.AbstractC270614k
    public void onEdgeDragStarted(int i, int i2) {
        View findDrawerWithGravity;
        if ((i & 1) == 1) {
            findDrawerWithGravity = this.this$0.findDrawerWithGravity(3);
        } else {
            findDrawerWithGravity = this.this$0.findDrawerWithGravity(5);
        }
        if (findDrawerWithGravity != null && this.this$0.getDrawerLockMode(findDrawerWithGravity) == 0) {
            this.mDragger.LIZJ(i2, findDrawerWithGravity);
        }
    }

    @Override // X.AbstractC270614k
    public void onEdgeTouched(int i, int i2) {
        this.this$0.postDelayed(this.mPeekRunnable, 160L);
    }

    @Override // X.AbstractC270614k
    public void onViewCaptured(View view, int i) {
        ((DrawerLayout$LayoutParams) view.getLayoutParams()).isPeeking = false;
        closeOtherDrawer();
    }

    @Override // X.AbstractC270614k
    public boolean tryCaptureView(View view, int i) {
        if (this.this$0.isDrawerView(view) && this.this$0.checkDrawerViewAbsoluteGravity(view, this.mAbsGravity) && this.this$0.getDrawerLockMode(view) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC270614k
    public int clampViewPositionHorizontal(View view, int i, int i2) {
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.this$0.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // X.AbstractC270614k
    public int clampViewPositionVertical(View view, int i, int i2) {
        return view.getTop();
    }

    @Override // X.AbstractC270614k
    public void onViewReleased(View view, float f, float f2) {
        int width;
        float drawerViewOffset = this.this$0.getDrawerViewOffset(view);
        int width2 = view.getWidth();
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            width = (f > 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width2;
        } else {
            width = this.this$0.getWidth();
            if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                width -= width2;
            }
        }
        this.mDragger.LJIJI(width, view.getTop());
        this.this$0.invalidate();
    }

    @Override // X.AbstractC270614k
    public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
        float width;
        int i5;
        int width2 = view.getWidth();
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            width = i + width2;
        } else {
            width = this.this$0.getWidth() - i;
        }
        float f = width / width2;
        this.this$0.setDrawerViewOffset(view, f);
        if (f == 0.0f) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        view.setVisibility(i5);
        this.this$0.invalidate();
    }
}
