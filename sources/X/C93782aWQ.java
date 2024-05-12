package X;

import Y.IDUListenerS265S0100000_42;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aWQ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93782aWQ extends View {
    public final Paint LJLIL;
    public final GestureDetector LJLILLLLZI;
    public float LJLJI;
    public final ValueAnimator LJLJJI;
    public InterfaceC93781aWP LJLJJL;

    public C93782aWQ(Context context) {
        super(context, null, 0);
        Paint paint = new Paint();
        this.LJLIL = paint;
        GestureDetector gestureDetector = new GestureDetector(context, new C93783aWR(this));
        this.LJLILLLLZI = gestureDetector;
        float LIZLLL = C93742aVm.LIZLLL(5.0f);
        float LIZLLL2 = C93742aVm.LIZLLL(12.0f);
        this.LJLJI = LIZLLL;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(LIZLLL, LIZLLL2);
        this.LJLJJI = ofFloat;
        gestureDetector.setIsLongpressEnabled(false);
        paint.setStyle(Paint.Style.FILL);
        setClickable(true);
        ofFloat.addUpdateListener(new IDUListenerS265S0100000_42(this, 5));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float LIZLLL = C93742aVm.LIZLLL(4.0f);
        this.LJLIL.setStyle(Paint.Style.STROKE);
        this.LJLIL.setStrokeWidth(C93410aQQ.LIZ(0.5f));
        this.LJLIL.setColor(C04330Ez.LIZIZ(getContext(), R.color.adm));
        canvas.drawCircle(width, height, C93410aQQ.LIZ(0.25f) + LIZLLL, this.LJLIL);
        this.LJLIL.setStyle(Paint.Style.FILL);
        this.LJLIL.setColor(C04330Ez.LIZIZ(getContext(), R.color.adn));
        canvas.drawCircle(width, height, LIZLLL, this.LJLIL);
        this.LJLIL.setColor(C04330Ez.LIZIZ(getContext(), R.color.ado));
        canvas.drawCircle(width, height, this.LJLJI, this.LJLIL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getActionMasked() == 1) {
            this.LJLJJI.cancel();
            this.LJLJJI.reverse();
            InterfaceC93781aWP interfaceC93781aWP = this.LJLJJL;
            if (interfaceC93781aWP != null) {
                interfaceC93781aWP.LJJIIZI(event);
            }
        }
        this.LJLILLLLZI.onTouchEvent(event);
        return true;
    }

    public final void setGestureCallback(InterfaceC93781aWP gestureCallback) {
        o.LJIIIZ(gestureCallback, "gestureCallback");
        this.LJLJJL = gestureCallback;
    }
}
