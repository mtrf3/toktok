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
public final class MKO extends SYL {
    public static final /* synthetic */ int LLLIIIL = 0;
    public final int[] LLLFF;
    public int LLLFFI;
    public final Rect LLLFZ;
    public final Queue<ViewGroup> LLLI;
    public C0A4 LLLII;
    public final OverScroller LLLIIII;
    public RecyclerView LLLIIIIL;

    private final RecyclerView getNestedRc() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2 = this.LLLIIIIL;
        if (recyclerView2 == null || !recyclerView2.isAttachedToWindow() || ((recyclerView = this.LLLIIIIL) != null && !recyclerView.getGlobalVisibleRect(this.LLLFZ))) {
            ((LinkedList) this.LLLI).clear();
            ((LinkedList) this.LLLI).add(this);
            while (!this.LLLI.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) ((LinkedList) this.LLLI).poll();
                if (viewGroup != null) {
                    Iterator it = new IDObjectS326S0100000_1(viewGroup, 4).iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if ((view instanceof RecyclerView) && view.getGlobalVisibleRect(this.LLLFZ)) {
                            RecyclerView recyclerView3 = (RecyclerView) view;
                            if (recyclerView3.isAttachedToWindow()) {
                                ((LinkedList) this.LLLI).clear();
                                return recyclerView3;
                            }
                        }
                        if (view instanceof ViewGroup) {
                            ((LinkedList) this.LLLI).add(view);
                        }
                    }
                }
            }
            ((LinkedList) this.LLLI).clear();
            return null;
        }
        return this.LLLIIIIL;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLLIIII.computeScrollOffset()) {
            int currY = this.LLLIIII.getCurrY();
            int i = currY - this.LLLFFI;
            this.LLLFFI = currY;
            RecyclerView recyclerView = this.LLLIIIIL;
            if (i > 0) {
                if (canScrollVertically(1)) {
                    scrollBy(0, i);
                } else if (recyclerView != null && recyclerView.canScrollVertically(1)) {
                    recyclerView.scrollBy(0, i);
                } else if (!this.LLLIIII.isFinished()) {
                    this.LLLIIII.abortAnimation();
                }
            } else if (i < 0) {
                if (recyclerView != null && recyclerView.canScrollVertically(-1)) {
                    recyclerView.scrollBy(0, i);
                } else if (canScrollVertically(-1)) {
                    scrollBy(0, i);
                } else if (!this.LLLIIII.isFinished()) {
                    this.LLLIIII.abortAnimation();
                }
            }
            invalidate();
        }
        super.computeScroll();
    }

    public final RecyclerView getCurrentSubRecyclerView() {
        return this.LLLIIIIL;
    }

    public final C0A4 getFlingListener() {
        return this.LLLII;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void LJLIL(int i) {
        RecyclerView nestedRc = getNestedRc();
        this.LLLIIIIL = nestedRc;
        if (nestedRc != null) {
            nestedRc.LJLI(0);
        }
        super.LJLIL(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            this.LLLIIIIL = getNestedRc();
            if (!this.LLLIIII.isFinished()) {
                this.LLLIIII.abortAnimation();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setCurrentSubRecyclerView(RecyclerView recyclerView) {
        this.LLLIIIIL = recyclerView;
    }

    public final void setFlingListener(C0A4 c0a4) {
        this.LLLII = c0a4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LLLFF = new int[2];
        this.LLLFZ = new Rect();
        this.LLLI = new LinkedList();
        this.LLLIIII = new OverScroller(context, MKP.LIZ);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        C0A4 c0a4 = this.LLLII;
        if (c0a4 != null) {
            c0a4.LIZ((int) f, (int) f2);
        }
        this.LLLFFI = 0;
        this.LLLIIII.fling(0, 0, 0, (int) f2, 0, 0, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
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
            if (i2 > 0 && !canScrollVertically(1) && (recyclerView2 = this.LLLIIIIL) != null) {
                recyclerView2.scrollBy(0, i2);
                if (iArr != null) {
                    iArr[1] = i2;
                }
                z = true;
            } else {
                z = false;
                if (i2 < 0 && (recyclerView = this.LLLIIIIL) != null && recyclerView.canScrollVertically(-1)) {
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
        int[] iArr3 = this.LLLFF;
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
