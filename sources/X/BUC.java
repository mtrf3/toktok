package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.feed.LiveDrawerEdgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.a1;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUC extends C025107z {
    public int LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;

    private final void setRightEdgePercentage(float f) {
        double d = f;
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.0d) {
            try {
                Field declaredField = BUC.class.getSuperclass().getDeclaredField("mRightCallback");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                o.LJII(obj, "null cannot be cast to non-null type androidx.customview.widget.ViewDragHelper.Callback");
                AbstractC270614k abstractC270614k = (AbstractC270614k) obj;
                Field declaredField2 = abstractC270614k.getClass().getDeclaredField("mPeekRunnable");
                declaredField2.setAccessible(true);
                declaredField2.set(abstractC270614k, null);
                Field declaredField3 = BUC.class.getSuperclass().getDeclaredField("mLeftCallback");
                declaredField3.setAccessible(true);
                Object obj2 = declaredField3.get(this);
                o.LJII(obj2, "null cannot be cast to non-null type androidx.customview.widget.ViewDragHelper.Callback");
                AbstractC270614k abstractC270614k2 = (AbstractC270614k) obj2;
                Field declaredField4 = abstractC270614k2.getClass().getDeclaredField("mPeekRunnable");
                declaredField4.setAccessible(true);
                declaredField4.set(abstractC270614k2, null);
            } catch (Exception e) {
                C0NB.LJII(e);
            }
        }
    }

    @Override // X.C025107z, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        try {
            float x = ev.getX();
            float y = ev.getY();
            int action = ev.getAction();
            if (action != 0) {
                if (action == 2) {
                    float f = this.LJLILLLLZI;
                    if (x > f && !this.LJLJJI) {
                        return false;
                    }
                    if (this.LJLJJL != 0 && this.LJLJJI) {
                        return false;
                    }
                    int abs = (int) Math.abs(x - f);
                    int abs2 = (int) Math.abs(y - this.LJLJI);
                    int i = (abs2 * abs2) + (abs * abs);
                    int i2 = this.LJLIL;
                    if (i > i2 * i2 * 2 && abs < abs2 * 4) {
                        return false;
                    }
                }
            } else {
                this.LJLILLLLZI = x;
                this.LJLJI = y;
            }
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException e) {
            C0NB.LJII(e);
            return false;
        }
    }

    @Override // X.C025107z, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        o.LJIIIZ(ev, "ev");
        try {
            if (isDrawerOpen(8388613)) {
                return super.onTouchEvent(ev);
            }
            closeDrawer(8388613);
            return false;
        } catch (Exception e) {
            if (ev.getAction() == 1 && (e instanceof IllegalArgumentException)) {
                ev.setAction(3);
                return super.onTouchEvent(ev);
            }
            return false;
        }
    }

    public final void setViewPagerPos(int i) {
        this.LJLJJL = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BUC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BUC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLJJL = -1;
        this.LJLIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (LiveDrawerEdgeSetting.INSTANCE.getCurrentValue()) {
            setRightEdgePercentage(0.0f);
        }
        addDrawerListener(new BUB(this));
    }
}
