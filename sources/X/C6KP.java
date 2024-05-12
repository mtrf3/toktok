package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Stack;

/* renamed from: X.6KP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KP extends View {
    public final Stack<Point> LJLIL;
    public final Paint LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;

    public final int getMMax() {
        return this.LJLJI;
    }

    public final Stack<Point> getMStack() {
        return this.LJLIL;
    }

    public final float getPadding() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6KP(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj);
        new LinkedHashMap();
        this.LJLIL = new Stack<>();
        this.LJLILLLLZI = new Paint();
        this.LJLJI = 1;
        this.LJLJJI = 1.0f;
        setBackgroundResource(R.drawable.a2_);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (C173636rf.LIZIZ(getContext())) {
            for (Point point : this.LJLIL) {
                double d = 1;
                float x = (float) ((d - (point.getX() / this.LJLJI)) * getWidth());
                float y = (float) ((d - (point.getY() / this.LJLJI)) * getWidth());
                if (canvas != null) {
                    canvas.drawRect(y, 0.0f, x, getHeight(), this.LJLILLLLZI);
                }
            }
            return;
        }
        for (Point point2 : this.LJLIL) {
            float x2 = (float) ((point2.getX() / this.LJLJI) * getWidth());
            float y2 = (float) ((point2.getY() / this.LJLJI) * getWidth());
            if (canvas != null) {
                canvas.drawRect(x2, 0.0f, y2, getHeight(), this.LJLILLLLZI);
            }
        }
    }

    public final void setMMax(int i) {
        this.LJLJI = i;
    }

    public final void setPadding(float f) {
        this.LJLJJI = f;
    }
}
