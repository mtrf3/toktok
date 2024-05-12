package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.031, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass031 extends ViewGroup {
    public final C19B LJLIL;
    public final Context LJLILLLLZI;
    public AnonymousClass191 LJLJI;
    public ActionMenuPresenter LJLJJI;
    public int LJLJJL;
    public C16650l3 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;

    public int getAnimatedVisibility() {
        if (this.LJLJJLL != null) {
            return this.LJLIL.LJLILLLLZI;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.LJLJJL;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.x8, R.attr.xi, R.attr.xj, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.a8z, R.attr.a_9, R.attr.a_b, R.attr.ab6, R.attr.afg, R.attr.afo, R.attr.ag1, R.attr.ag2, R.attr.ag7, R.attr.ahg, R.attr.aj3, R.attr.ay3, R.attr.b1u, R.attr.b52, R.attr.b5w, R.attr.b5x, R.attr.bfi, R.attr.bfl, R.attr.bje, R.attr.bjt}, R.attr.u3, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.LJLJJI;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJLZ = new C25560zQ(actionMenuPresenter.LJLILLLLZI).LIZ();
            C281318n c281318n = actionMenuPresenter.LJLJI;
            if (c281318n != null) {
                c281318n.LJIILL(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.LJLJLJ = false;
        }
        if (!this.LJLJLJ) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.LJLJLJ = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.LJLJLJ = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.LJLJL = false;
        }
        if (!this.LJLJL) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.LJLJL = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.LJLJL = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.LJLJJL = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C16650l3 c16650l3 = this.LJLJJLL;
            if (c16650l3 != null) {
                c16650l3.LIZIZ();
            }
            super.setVisibility(i);
        }
    }

    public AnonymousClass031(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final C16650l3 LJ(int i, long j) {
        C16650l3 c16650l3 = this.LJLJJLL;
        if (c16650l3 != null) {
            c16650l3.LIZIZ();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C16650l3 LIZ = h0.LIZ(this);
            LIZ.LIZ(1.0f);
            LIZ.LIZJ(j);
            C19B c19b = this.LJLIL;
            c19b.LJLJI.LJLJJLL = LIZ;
            c19b.LJLILLLLZI = i;
            LIZ.LIZLLL(c19b);
            return LIZ;
        }
        C16650l3 LIZ2 = h0.LIZ(this);
        LIZ2.LIZ(0.0f);
        LIZ2.LIZJ(j);
        C19B c19b2 = this.LJLIL;
        c19b2.LJLJI.LJLJJLL = LIZ2;
        c19b2.LJLILLLLZI = i;
        LIZ2.LIZLLL(c19b2);
        return LIZ2;
    }

    public AnonymousClass031(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = new C19B(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.u0, typedValue, true) && typedValue.resourceId != 0) {
            this.LJLILLLLZI = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.LJLILLLLZI = context;
        }
    }

    public static int LIZJ(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, LiveLayoutPreloadThreadPriority.DEFAULT), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int LIZLLL(View view, boolean z, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int LIZJ = AnonymousClass030.LIZJ(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, LIZJ, i, measuredHeight + LIZJ);
            return -measuredWidth;
        }
        view.layout(i, LIZJ, i + measuredWidth, measuredHeight + LIZJ);
        return measuredWidth;
    }
}
