package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aRr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93499aRr extends FrameLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final Paint LJLJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = this.LJLIL;
        if (i <= 0) {
            return;
        }
        int i2 = 0;
        do {
            float width = (getWidth() / 2.0f) + ((i2 - ((this.LJLIL - 1) / 2.0f)) * (this.LJLJI + (this.LJLJJI * 2)));
            float height = getHeight() / 2.0f;
            if (i2 == this.LJLILLLLZI) {
                this.LJLJL.setColor(this.LJLJJL);
                if (canvas != null) {
                    canvas.drawCircle(width, height, this.LJLJJI, this.LJLJL);
                }
                this.LJLJL.setColor(this.LJLJJLL);
            } else if (canvas != null) {
                canvas.drawCircle(width, height, this.LJLJJI, this.LJLJL);
            }
            i2++;
        } while (i2 < i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93499aRr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLJI = (int) getResources().getDimension(R.dimen.akh);
        this.LJLJJI = (int) getResources().getDimension(R.dimen.aki);
        this.LJLJJL = C04330Ez.LIZIZ(context, R.color.ae6);
        this.LJLJJLL = C04330Ez.LIZIZ(context, R.color.ae5);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.LJLJL = paint;
    }
}
