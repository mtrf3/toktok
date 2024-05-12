package X;

import Y.IDUListenerS265S0100000_42;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aRH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93463aRH extends View {
    public final Paint LJLIL;
    public final GestureDetector LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public final ValueAnimator LJLJJL;
    public final /* synthetic */ C93464aRI LJLJJLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        this.LJLIL.setColor(getResources().getColor(R.color.ado));
        canvas.drawCircle(width, height, this.LJLJJI, this.LJLIL);
        float LIZLLL = C93742aVm.LIZLLL(4.0f);
        this.LJLIL.setColor(getResources().getColor(R.color.adn));
        canvas.drawCircle(width, height, LIZLLL, this.LJLIL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getActionMasked() == 1) {
            this.LJLJJL.cancel();
            this.LJLJJL.reverse();
            InterfaceC93891aYB pointActionCallback = this.LJLJJLL.getPointActionCallback();
            if (pointActionCallback != null) {
                pointActionCallback.LIZ();
            }
        }
        this.LJLILLLLZI.onTouchEvent(event);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93463aRH(C93464aRI c93464aRI, Context context) {
        super(context, null, 0);
        this.LJLJJLL = c93464aRI;
        Paint paint = new Paint();
        this.LJLIL = paint;
        GestureDetector gestureDetector = new GestureDetector(context, new C93465aRJ(this));
        this.LJLILLLLZI = gestureDetector;
        o.LJIIIIZZ(ViewConfiguration.get(context), "ViewConfiguration.get(context)");
        this.LJLJI = r1.getScaledEdgeSlop();
        float LIZLLL = C93742aVm.LIZLLL(5.0f);
        float LIZLLL2 = C93742aVm.LIZLLL(12.0f);
        this.LJLJJI = LIZLLL;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(LIZLLL, LIZLLL2);
        this.LJLJJL = ofFloat;
        gestureDetector.setIsLongpressEnabled(false);
        paint.setStyle(Paint.Style.FILL);
        ofFloat.addUpdateListener(new IDUListenerS265S0100000_42(this, 1));
    }
}
