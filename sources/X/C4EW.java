package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.4EW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EW extends FrameLayout {
    public float LJLIL;
    public float LJLILLLLZI;
    public final int LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;

    public final void LIZ() {
        this.LJLIL = 0.0f;
        this.LJLILLLLZI = 0.0f;
        this.LJLJJI = 0.0f;
        this.LJLJJL = true;
        if (getScaleX() < 0.9f || getScaleY() < 0.9f) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    public final InterfaceC65784Pro<C76800UCe> getReleaseListener() {
        return this.LJLJJLL;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        LIZ();
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (this.LJLIL - x > Math.abs(y - this.LJLILLLLZI) && this.LJLIL - x > this.LJLJI) {
                        this.LJLILLLLZI = y;
                        this.LJLIL = x;
                        requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                    this.LJLILLLLZI = y;
                    this.LJLIL = x;
                }
            } else {
                LIZ();
            }
        } else {
            this.LJLIL = motionEvent.getX();
            this.LJLILLLLZI = motionEvent.getY();
            this.LJLJJL = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (this.LJLJJL && this.LJLIL - x > Math.abs(y - this.LJLILLLLZI) && this.LJLIL - x > this.LJLJI) {
                        this.LJLJJI = motionEvent.getX();
                        motionEvent.getY();
                        this.LJLJJL = false;
                    }
                    this.LJLILLLLZI = y;
                    this.LJLIL = x;
                    if (!this.LJLJJL) {
                        float f = this.LJLJJI;
                        if (f > x && f - x <= 1000.0f) {
                            float f2 = 1 - ((f - x) / 1000.0f);
                            if (f2 >= 0.8f && f2 <= 1.0f) {
                                setScaleX(f2);
                                setScaleY(f2);
                            }
                        }
                    }
                }
            } else {
                LIZ();
            }
        } else {
            this.LJLIL = motionEvent.getX();
            this.LJLILLLLZI = motionEvent.getY();
            this.LJLJJI = motionEvent.getX();
            motionEvent.getY();
            this.LJLJJL = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setReleaseListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJLL = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4EW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = 10;
        this.LJLJJL = true;
    }
}
