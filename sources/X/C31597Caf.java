package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Caf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31597Caf extends C1K5 {
    public final int LJLJI;
    public final int LJLJJI;
    public boolean LJLJJL;
    public final Paint LJLJJLL;
    public final PorterDuffXfermode LJLJL;
    public final Bitmap LJLJLJ;

    public Boolean getMuteIconVisible() {
        return Boolean.valueOf(this.LJLJJL);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.LJLJJL) {
            C0EL.LIZ(canvas, getWidth(), getHeight(), this.LJLJJLL);
            super.draw(canvas);
            this.LJLJJLL.setXfermode(this.LJLJL);
            if (C15380j0.LJIIZILJ()) {
                LIZ(this.LJLJI, 0.0f, canvas);
            } else {
                LIZ(getWidth() - this.LJLJI, getWidth() - (this.LJLJI * 2), canvas);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public void setMuteIconVisibility(boolean z) {
        this.LJLJJL = z;
        this.LJLJJLL.setAntiAlias(true);
        invalidate();
    }

    public C31597Caf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJI = C15380j0.LIZ(6.0f);
        this.LJLJJI = C15380j0.LIZ(2.0f);
        this.LJLJJL = false;
        this.LJLJJLL = new Paint();
        this.LJLJL = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.LJLJLJ = BitmapFactory.decodeResource(getResources(), R.drawable.cvj);
    }

    public final void LIZ(float f, float f2, Canvas canvas) {
        int height = getHeight();
        int i = this.LJLJI;
        canvas.drawCircle(f, height - i, i + this.LJLJJI, this.LJLJJLL);
        this.LJLJJLL.setXfermode(null);
        canvas.drawBitmap(this.LJLJLJ, f2, getHeight() - (this.LJLJI * 2), this.LJLJJLL);
    }
}
