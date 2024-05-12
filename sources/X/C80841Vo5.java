package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Transformation;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.BounceBackViewPager$OverScrollEffect;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Vo5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80841Vo5 extends C80766Vms {
    public final BounceBackViewPager$OverScrollEffect LLJJJIL;
    public final Camera LLJJJJ;
    public C0C3 LLJJJJJIL;
    public float LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public final int LLJLIL;
    public float LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;

    public final int getOverScrollAnimationDuration() {
        return this.LLJLL;
    }

    public final float getOverScrollTranslation() {
        return this.LLJLILLLLZIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80841Vo5(Context context) {
        super(context, null);
        new LinkedHashMap();
        o.LJI(context);
        this.LLJJJIL = new BounceBackViewPager$OverScrollEffect(this);
        this.LLJJJJ = new Camera();
        setStaticTransformationsEnabled(true);
        this.LLJLIL = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        super.setOnPageChangeListener(new C80840Vo4(this));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.a6b, R.attr.a6c});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…erce_BounceBackViewPager)");
        this.LLJLILLLLZIIL = obtainStyledAttributes.getDimension(1, 400.0f);
        this.LLJLL = obtainStyledAttributes.getInt(0, LiveChatShowDelayForHotLiveSetting.DEFAULT);
        obtainStyledAttributes.recycle();
    }

    @Override // X.C80769Vmv, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        try {
            z = super.dispatchTouchEvent(motionEvent);
            return z;
        } catch (ArrayIndexOutOfBoundsException e) {
            C16880lQ.LLLLIIL(e);
            return z;
        } catch (IllegalArgumentException e2) {
            C16880lQ.LLLLIIL(e2);
            return z;
        }
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        try {
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.LLJJJJLIIL = motionEvent.getX(actionIndex);
                    this.LLJJL = motionEvent.getPointerId(actionIndex);
                }
            } else {
                this.LLJJJJLIIL = motionEvent.getX();
                this.LLJJL = motionEvent.getPointerId(0);
            }
            z = super.onInterceptTouchEvent(motionEvent);
            return z;
        } catch (ArrayIndexOutOfBoundsException e) {
            C16880lQ.LLLLIIL(e);
            return z;
        } catch (IllegalArgumentException e2) {
            C16880lQ.LLLLIIL(e2);
            return z;
        }
    }

    @Override // X.C80766Vms, X.C80769Vmv, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                if (motionEvent.getPointerId(action2) == this.LLJJL) {
                                    if (action2 == 0) {
                                        i = 1;
                                    }
                                    this.LLJJJJLIIL = motionEvent.getX(i);
                                    this.LLJJL = motionEvent.getPointerId(i);
                                }
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.LLJJJJLIIL = motionEvent.getX(actionIndex);
                            this.LLJJL = motionEvent.getPointerId(actionIndex);
                        }
                    }
                } else {
                    int i2 = this.LLJJL;
                    if (i2 != -1) {
                        float x = motionEvent.getX(motionEvent.findPointerIndex(i2));
                        float f = this.LLJJJJLIIL - x;
                        getScrollX();
                        int width = getWidth();
                        int pageMargin = getPageMargin() + width;
                        PagerAdapter adapter = getAdapter();
                        o.LJI(adapter);
                        int count = adapter.getCount() - 1;
                        int currentItem = getCurrentItem();
                        float max = Math.max(0, (currentItem - 1) * pageMargin);
                        float f2 = pageMargin;
                        float min = Math.min(currentItem + 1, count) * f2;
                        if (this.LLJL == 0.0f) {
                            if (currentItem == 0) {
                                if (max == 0.0f) {
                                    this.LLJJJIL.setPull((f + this.LLJLIL) / width);
                                }
                            } else if (count == currentItem && min == count * f2) {
                                this.LLJJJIL.setPull((f - this.LLJLIL) / width);
                            }
                        } else {
                            this.LLJJJJLIIL = x;
                        }
                    } else {
                        this.LLJJJIL.onRelease();
                    }
                }
                if (!this.LLJJJIL.isOverScrolling() && i == 0) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }
            this.LLJJL = -1;
            this.LLJJJIL.onRelease();
        } else {
            this.LLJJJJLIIL = motionEvent.getX();
            this.LLJJL = motionEvent.getPointerId(0);
        }
        i = 1;
        if (!this.LLJJJIL.isOverScrolling()) {
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.C80766Vms, X.C80769Vmv
    public void setOnPageChangeListener(C0C3 c0c3) {
        this.LLJJJJJIL = c0c3;
    }

    public final void setOverScrollAnimationDuration(int i) {
        this.LLJLL = i;
    }

    public final void setOverScrollTranslation(int i) {
        this.LLJLILLLLZIIL = i;
    }

    @Override // android.view.ViewGroup
    public final boolean getChildStaticTransformation(View child, Transformation t) {
        boolean z;
        float max;
        o.LJIIIZ(child, "child");
        o.LJIIIZ(t, "t");
        if (child.getWidth() == 0) {
            return false;
        }
        int i = this.LLJJLIIIJLLLLLLLZ;
        if (i != 0) {
            PagerAdapter adapter = getAdapter();
            o.LJI(adapter);
            if (i != adapter.getCount() - 1) {
                z = false;
                if (this.LLJJJIL.isOverScrolling() || !z) {
                    return false;
                }
                float width = getWidth() / 2.0f;
                int height = getHeight() / 2;
                t.getMatrix().reset();
                float f = this.LLJLILLLLZIIL;
                if (this.LLJJJIL.getMOverscroll() > 0.0f) {
                    max = Math.min(this.LLJJJIL.getMOverscroll(), 1.0f);
                } else {
                    max = Math.max(this.LLJJJIL.getMOverscroll(), -1.0f);
                }
                this.LLJJJJ.save();
                this.LLJJJJ.translate(-(f * max), 0.0f, 0.0f);
                this.LLJJJJ.getMatrix(t.getMatrix());
                this.LLJJJJ.restore();
                float f2 = height;
                t.getMatrix().preTranslate(-width, -f2);
                t.getMatrix().postTranslate(width, f2);
                if (getChildCount() == 1) {
                    invalidate();
                } else {
                    child.invalidate();
                }
                return true;
            }
        }
        z = true;
        if (this.LLJJJIL.isOverScrolling()) {
        }
        return false;
    }
}
