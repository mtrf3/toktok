package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS38S0100000_2;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5UU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UU extends View {
    public boolean LJLIL;
    public volatile boolean LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public final float LJLJJLL;
    public final RectF LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public InterfaceC65784Pro<Boolean> LJLLI;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLILLLL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLLJ;
    public final Paint LJLLL;
    public final Paint LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public boolean LJZ;
    public final ARunnableS38S0100000_2 LJZI;

    public final void LIZ() {
        if (!this.LJLILLLLZI) {
            return;
        }
        getStopRecordAnimator().start();
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = this.LJLLJ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke("auto");
        }
    }

    public final AnimatorSet getStartRecordAnimator() {
        return (AnimatorSet) this.LJLLLLLL.getValue();
    }

    public final AnimatorSet getStopRecordAnimator() {
        return (AnimatorSet) this.LJLZ.getValue();
    }

    public final InterfaceC65784Pro<Boolean> getOnPermissionCheck() {
        return this.LJLLI;
    }

    public final InterfaceC88472Yns<Boolean, C76800UCe> getOnRecordStart() {
        return this.LJLLILLLL;
    }

    public final InterfaceC88472Yns<String, C76800UCe> getOnRecordStop() {
        return this.LJLLJ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float f = 2;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (getWidth() / 2.0f) - (this.LJLJI / f), this.LJLLLL);
        float centerX = this.LJLJL.centerX();
        float f2 = this.LJLJJL / f;
        if (f2 > centerX) {
            return;
        }
        float f3 = centerX - f2;
        float f4 = centerX + f2;
        this.LJLJL.set(f3, f3, f4, f4);
        RectF rectF = this.LJLJL;
        float f5 = this.LJLJJI;
        canvas.drawRoundRect(rectF, f5, f5, this.LJLLL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                removeCallbacks(this.LJZI);
                if (this.LJZ) {
                    if (this.LJLILLLLZI) {
                        getStopRecordAnimator().start();
                        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = this.LJLLJ;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke("long_press");
                        }
                    }
                    return true;
                }
            }
        } else {
            this.LJZ = false;
            postDelayed(this.LJZI, 200L);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnPermissionCheck(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LJLLI = interfaceC65784Pro;
    }

    public final void setOnRecordStart(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LJLLILLLL = interfaceC88472Yns;
    }

    public final void setOnRecordStop(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        this.LJLLJ = interfaceC88472Yns;
    }

    public final void setRecordButtonRadius(float f) {
        this.LJLJJI = f;
        invalidate();
    }

    public final void setRecordButtonWidth(float f) {
        this.LJLJJL = f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5UU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        new LinkedHashMap();
        float LIZ = C134845Qy.LIZ(3.0f);
        this.LJLJI = LIZ;
        this.LJLJJLL = C134845Qy.LIZ(3.0f);
        this.LJLJL = new RectF();
        this.LJLJLJ = C134845Qy.LIZ(50.0f);
        this.LJLJLLL = C134845Qy.LIZ(24.0f);
        this.LJLL = C134845Qy.LIZ(4.0f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.eb, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -65536;
        }
        paint.setColor(i);
        paint.setAntiAlias(true);
        this.LJLLL = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(LIZ);
        this.LJLLLL = paint2;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 861));
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 862));
        this.LJZI = new ARunnableS38S0100000_2(this, 162);
        setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(new AqS168S0100000_2(this, 515), 63)));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.LJLJL;
        rectF.left = this.LJLJI + this.LJLJJLL;
        rectF.right = getWidth() - rectF.left;
        rectF.top = this.LJLJI + this.LJLJJLL;
        rectF.bottom = getHeight() - rectF.top;
        if (this.LJLJJI == 0.0f) {
            this.LJLJJI = this.LJLJL.width() / 2.0f;
        }
        if (this.LJLJJL == 0.0f) {
            this.LJLJJL = this.LJLJL.width();
        }
    }
}
