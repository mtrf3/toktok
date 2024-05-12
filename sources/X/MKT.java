package X;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewParent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class MKT extends SYL {
    public final C62822Ol8 LLLFF;
    public final C62822Ol8 LLLFFI;
    public final C62822Ol8 LLLFZ;
    public final C62822Ol8 LLLI;
    public final Handler LLLII;
    public final RunnableC56436MCy LLLIIII;

    private final MKY getAnimator() {
        return (MKY) this.LLLFF.getValue();
    }

    private final Runnable getAnimatorRunnable() {
        return (Runnable) this.LLLFFI.getValue();
    }

    private final ViewParent getViewPagerParent() {
        return (ViewParent) this.LLLI.getValue();
    }

    public final void LJLLJ() {
        if (getItemAnimator() == null) {
            setItemAnimator(getAnimator());
            C221018lt.LJFF("SkylightList", " itemAnimator = animator");
        }
    }

    public final void LJLLL() {
        if (getItemAnimator() == null) {
            postDelayed(getAnimatorRunnable(), 3000L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKT(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LLLFF = C221108m2.LIZIZ(MKX.LJLIL);
        this.LLLFFI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 755));
        this.LLLFZ = C221108m2.LIZIZ(C53769L8j.LJLIL);
        this.LLLI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 756));
        this.LLLII = new Handler(C16880lQ.LLJJJJ());
        this.LLLIIII = RunnableC56436MCy.LJLIL;
        C221018lt.LJFF("SkylightList", "SkylightList init");
        setItemAnimator(null);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((Boolean) this.LLLFZ.getValue()).booleanValue() && motionEvent != null && motionEvent.getAction() == 2) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer valueOf;
        ViewParent viewPagerParent;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LLLII.removeCallbacks(this.LLLIIII);
            C56652MLg.LIZJ.LIZIZ(5);
            this.LLLII.postDelayed(this.LLLIIII, 3000L);
        }
        if (((Boolean) this.LLLFZ.getValue()).booleanValue() && motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0 || valueOf.intValue() == 2) {
                ViewParent viewPagerParent2 = getViewPagerParent();
                if (viewPagerParent2 != null) {
                    viewPagerParent2.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((valueOf.intValue() == 1 || valueOf.intValue() == 3) && (viewPagerParent = getViewPagerParent()) != null) {
                viewPagerParent.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i4 == 0 && i2 > 0 && !C53339KwZ.LJ()) {
            C56204M4a.LIZJ(MKU.LJLIL);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightList onSizeChanged= ");
        LIZ.append(i);
        LIZ.append(',');
        LIZ.append(i2);
        LIZ.append(',');
        LIZ.append(i3);
        LIZ.append(',');
        LIZ.append(i4);
        C56204M4a.LIZLLL(X1D.LIZIZ(LIZ));
    }
}
