package com.bytedance.android.livesdk.chatroom.behavior;

import X.AbstractC029409q;
import X.C06C;
import X.C0A2;
import X.C17M;
import X.C45621qg;
import Y.IDAListenerS81S0100000_14;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SuctionBottomBehavior extends C06C<View> {
    public int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final IDAListenerS81S0100000_14 LJI;
    public final int LJII;

    public SuctionBottomBehavior() {
        this.LIZIZ = true;
        this.LIZLLL = 500L;
        this.LJFF = true;
        this.LJI = new IDAListenerS81S0100000_14(this, 1);
        this.LJII = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuctionBottomBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LIZIZ = true;
        this.LIZLLL = 500L;
        this.LJFF = true;
        this.LJI = new IDAListenerS81S0100000_14(this, 1);
        this.LJII = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, new int[]{R.attr.yh});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ion_bottom_behavior_mode)");
        this.LJII = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
    }

    public final void LIZ(int i, View view) {
        if (view.animate() != null && this.LIZJ) {
            view.animate().cancel();
        }
        float translationY = view.getTranslationY() - i;
        if (translationY < (-view.getHeight())) {
            translationY = -view.getHeight();
        } else if (translationY > 0.0f) {
            translationY = 0.0f;
        }
        view.setTranslationY(translationY);
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg parent, View child, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        C17M.LIZIZ(child, parent.getMeasuredHeight(), 0, parent.getMeasuredHeight(), child.getMeasuredWidth());
        if (this.LIZIZ) {
            if (this.LJFF) {
                child.animate().setDuration(this.LIZLLL).translationY(-child.getMeasuredHeight()).withLayer().setListener(this.LJI).start();
            }
            this.LIZIZ = false;
        } else if (this.LIZJ && this.LIZ != child.getMeasuredHeight()) {
            child.animate().cancel();
            child.animate().setDuration((Math.abs(child.getTranslationY() + child.getMeasuredHeight()) / child.getMeasuredHeight()) * ((float) this.LIZLLL)).setListener(this.LJI).translationY(-child.getMeasuredHeight()).start();
        } else if (this.LIZ == (-((int) child.getTranslationY())) && (i2 = this.LIZ) != 0 && i2 != child.getMeasuredHeight()) {
            child.setTranslationY(-child.getMeasuredHeight());
        }
        this.LIZ = child.getMeasuredHeight();
        return true;
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg coordinatorLayout, View child, View directTargetChild, View target, int i, int i2) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(directTargetChild, "directTargetChild");
        o.LJIIIZ(target, "target");
        if (!this.LJ || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final void onNestedPreScroll(C45621qg coordinatorLayout, View child, View target, int i, int i2, int[] consumed, int i3) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (target instanceof RecyclerView) {
            if (this.LJII == 2) {
                RecyclerView recyclerView = (RecyclerView) target;
                C0A2 layoutManager = recyclerView.getLayoutManager();
                o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int LLILLIZIL = ((LinearLayoutManager) layoutManager).LLILLIZIL();
                AbstractC029409q adapter = recyclerView.getAdapter();
                o.LJI(adapter);
                if (LLILLIZIL != adapter.getItemCount() - 1) {
                    return;
                }
            }
            if (((int) child.getTranslationY()) >= 0 && i2 < 0) {
                return;
            }
            if (((int) child.getTranslationY()) <= (-child.getMeasuredHeight()) && i2 > 0) {
                return;
            }
            LIZ(i2, child);
            consumed[1] = i2;
            return;
        }
        if (((int) child.getTranslationY()) >= 0 && i2 < 0) {
            return;
        }
        if (((int) child.getTranslationY()) <= (-child.getMeasuredHeight()) && i2 > 0) {
            return;
        }
        LIZ(i2, child);
        consumed[1] = i2;
    }
}
