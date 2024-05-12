package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Stack;

/* renamed from: X.6KW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6KW extends View {
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
    public C6KW(ActivityC45651qj activityC45651qj) {
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
        for (Point point : this.LJLIL) {
            float x = (float) ((point.getX() / this.LJLJI) * getWidth());
            float y = (float) ((point.getY() / this.LJLJI) * getWidth());
            if (canvas != null) {
                canvas.drawRect(x, 0.0f, y, getHeight(), this.LJLILLLLZI);
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
