package X;

import Y.IDObjectS326S0100000_1;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes10.dex */
public final class MKQ extends RecyclerView {
    public final int[] LLLF;
    public int LLLFF;
    public final Rect LLLFFI;
    public final Queue<ViewGroup> LLLFZ;
    public C0A4 LLLI;
    public final OverScroller LLLII;
    public RecyclerView LLLIIII;
    public MKS LLLIIIIL;

    private final RecyclerView getNestedRc() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LLLIIII;
        if (recyclerView2 == null || !recyclerView2.isAttachedToWindow() || ((recyclerView = this.LLLIIII) != null && !recyclerView.getGlobalVisibleRect(this.LLLFFI))) {
            ((LinkedList) this.LLLFZ).clear();
            ((LinkedList) this.LLLFZ).add(this);
            while (!this.LLLFZ.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) ((LinkedList) this.LLLFZ).poll();
                if (viewGroup != null) {
                    Iterator it = new IDObjectS326S0100000_1(viewGroup, 3).iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if ((view instanceof RecyclerView) && view.getGlobalVisibleRect(this.LLLFFI)) {
                            RecyclerView recyclerView3 = (RecyclerView) view;
                            if (recyclerView3.isAttachedToWindow()) {
                                ((LinkedList) this.LLLFZ).clear();
                                return recyclerView3;
                            }
                        }
                        if (view instanceof ViewGroup) {
                            ((LinkedList) this.LLLFZ).add(view);
                        }
                    }
                }
            }
            ((LinkedList) this.LLLFZ).clear();
            return null;
        }
        return this.LLLIIII;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLLII.computeScrollOffset()) {
            int currY = this.LLLII.getCurrY();
            int i = currY - this.LLLFF;
            this.LLLFF = currY;
            RecyclerView recyclerView = this.LLLIIII;
            if (i > 0) {
                if (canScrollVertically(1)) {
                    scrollBy(0, i);
                } else if (recyclerView != null && recyclerView.canScrollVertically(1)) {
                    recyclerView.scrollBy(0, i);
                } else if (!this.LLLII.isFinished()) {
                    this.LLLII.abortAnimation();
                }
            } else if (i < 0) {
                if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i);
                } else if (canScrollVertically(-1)) {
                    scrollBy(0, i);
                } else if (!this.LLLII.isFinished()) {
                    this.LLLII.abortAnimation();
                }
            }
            invalidate();
        }
        super.computeScroll();
    }

    public final RecyclerView getCurrentSubRecyclerView() {
        return this.LLLIIII;
    }

    public final MKS getDownListener() {
        return this.LLLIIIIL;
    }

    public final C0A4 getMFlingListener() {
        return this.LLLI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void LJLIL(int i) {
        RecyclerView nestedRc = getNestedRc();
        this.LLLIIII = nestedRc;
        if (nestedRc != null) {
            nestedRc.LJLI(0);
        }
        super.LJLIL(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            this.LLLIIII = getNestedRc();
            if (!this.LLLII.isFinished()) {
                this.LLLII.abortAnimation();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        MKS mks;
        if (motionEvent != null && motionEvent.getAction() == 0 && (mks = this.LLLIIIIL) != null) {
            mks.LIZ();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCurrentSubRecyclerView(RecyclerView recyclerView) {
        this.LLLIIII = recyclerView;
    }

    public final void setDownListener(MKS mks) {
        this.LLLIIIIL = mks;
    }

    public final void setMFlingListener(C0A4 c0a4) {
        this.LLLI = c0a4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLF = new int[2];
        this.LLLFFI = new Rect();
        this.LLLFZ = new LinkedList();
        this.LLLII = new OverScroller(context, MKR.LIZ);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        C0A4 c0a4 = this.LLLI;
        if (c0a4 != null) {
            c0a4.LIZ((int) f, (int) f2);
        }
        this.LLLFF = 0;
        this.LLLII.fling(0, 0, 0, (int) f2, 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
        invalidate();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean LJJ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        boolean z;
        int i4;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (i3 == 0) {
            if (i2 > 0 && !canScrollVertically(1) && (recyclerView2 = this.LLLIIII) != null) {
                recyclerView2.scrollBy(0, i2);
                if (iArr != null) {
                    iArr[1] = i2;
                }
                z = true;
            } else {
                z = false;
                if (i2 < 0 && (recyclerView = this.LLLIIII) != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i2);
                    if (iArr != null) {
                        iArr[1] = i2;
                    }
                    z = true;
                }
            }
        } else {
            z = false;
        }
        int[] iArr3 = this.LLLF;
        if (iArr != null) {
            i4 = iArr[1];
        } else {
            i4 = 0;
        }
        boolean LJJ = super.LJJ(i, i2 - i4, i3, iArr3, iArr2);
        if (iArr != null) {
            iArr[1] = iArr[1] + iArr3[1];
        }
        if (z || LJJ) {
            return true;
        }
        return false;
    }
}
