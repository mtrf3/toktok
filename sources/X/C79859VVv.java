package X;

import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.VVv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79859VVv extends C79860VVw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79859VVv(Context context) {
        super(context);
        o.LJIIJ(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent;
        Integer num;
        if (!getMAllowHorizontalGesture()) {
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getActionMasked());
            } else {
                num = null;
            }
            onInterceptTouchEvent = false;
            if (num != null) {
                if (num.intValue() == 0) {
                    setMLastMotionX(motionEvent.getX());
                    setMLastMotionY(motionEvent.getY());
                    setMActivePointerId(motionEvent.getPointerId(0));
                } else if (num.intValue() == 2 && getMActivePointerId() != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(getMActivePointerId());
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    if (Math.abs(x - getMLastMotionX()) * 0.5f > Math.abs(y - getMLastMotionY())) {
                        setMLastMotionX(x);
                        setMLastMotionY(y);
                        Field isUnableToDrag = getIsUnableToDrag();
                        if (isUnableToDrag != null) {
                            isUnableToDrag.setAccessible(true);
                            if (isUnableToDrag.getBoolean(this)) {
                                isUnableToDrag.set(this, Boolean.FALSE);
                            }
                        }
                    }
                }
            }
        } else {
            onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        }
        InterfaceC79857VVt mInterceptTouchEventListener = getMInterceptTouchEventListener();
        if (mInterceptTouchEventListener != null) {
            mInterceptTouchEventListener.LIZ(onInterceptTouchEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LJLJL) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && this.LJLJL) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i, z);
    }
}
