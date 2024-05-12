package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.9tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class ViewOnTouchListenerC251379tl extends FrameLayout implements View.OnTouchListener {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;
    public final float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public long LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;

    private final float getMaxDragX() {
        return Integer.MAX_VALUE;
    }

    public final boolean getCanDrag() {
        return this.LJLLILLLL;
    }

    public final void setCanDrag(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setDragForbidden(boolean z) {
        this.LJLLJ = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent == null || view == null || !this.LJLLILLLL || this.LJLLJ) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    return super.onTouchEvent(motionEvent);
                }
                Object parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    float min = Math.min(Math.max(0.0f, Math.max(motionEvent.getRawX() + this.LJLJJL, 0.0f)), (width - view.getWidth()) - this.LJLJJI);
                    if (min <= getMaxDragX()) {
                        setX(min);
                    }
                    setY(Math.min(Math.max(0.0f, Math.max(motionEvent.getRawY() + this.LJLJJLL, 0.0f)), (height - view.getHeight()) - 0.0f));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                motionEvent.getRawX();
                motionEvent.getRawY();
                motionEvent.getRawX();
                motionEvent.getRawY();
                float rawX = motionEvent.getRawX() - this.LJLJL;
                float rawY = motionEvent.getRawY() - this.LJLJLJ;
                if (Math.abs(rawX) < this.LJLJI && Math.abs(rawY) < this.LJLJI && System.currentTimeMillis() - this.LJLLI < LiveCoverMinSizeSetting.DEFAULT && performClick()) {
                    return true;
                }
                Object parent2 = view.getParent();
                if (parent2 != null) {
                    View view3 = (View) parent2;
                    view.getX();
                    float y = view.getY();
                    if (!C251659uD.LIZ()) {
                        this.LJLJLLL = view3.getLeft();
                        this.LJLJLLL = Math.min(view3.getWidth() - view.getWidth(), this.LJLJLLL) + 0.0f;
                    } else {
                        this.LJLJLLL = view3.getRight();
                        this.LJLJLLL = Math.min(view3.getWidth() - view.getWidth(), this.LJLJLLL) + this.LJLJJI;
                    }
                    this.LJLL = y;
                    if (view.getY() + view3.getTop() < 0.0f) {
                        this.LJLL = view3.getTop() + 0.0f;
                    }
                    float f = this.LJLL;
                    float f2 = this.LJLIL;
                    if (f < f2) {
                        this.LJLL = f2;
                    }
                    if ((view3.getBottom() - view.getY()) - view.getHeight() < 0.0f) {
                        this.LJLL = (view3.getBottom() - view.getHeight()) - 0.0f;
                    }
                    if (this.LJLL > view3.getBottom() - this.LJLILLLLZI) {
                        this.LJLL = view3.getBottom() - this.LJLILLLLZI;
                    }
                    view.animate().x(this.LJLJLLL).y(this.LJLL).setInterpolator(new DecelerateInterpolator()).setDuration(200L).start();
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        } else {
            this.LJLLI = System.currentTimeMillis();
            this.LJLJL = motionEvent.getRawX();
            this.LJLJLJ = motionEvent.getRawY();
            this.LJLJJL = getX() - motionEvent.getRawX();
            this.LJLJJLL = getY() - motionEvent.getRawY();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    public ViewOnTouchListenerC251379tl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLLILLLL = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
        this.LJLJI = viewConfiguration.getScaledTouchSlop();
        this.LJLIL = KL2.LJIIIZ(context) * 0.11f;
        this.LJLILLLLZI = KL2.LJIIIZ(context) * 0.4f;
        this.LJLJJI = KL2.LIZJ(context, 8.0f);
        setOnTouchListener(this);
    }
}
