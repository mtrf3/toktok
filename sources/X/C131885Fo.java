package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.5Fo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131885Fo extends FrameLayout {
    public Paint LJLIL;
    public int LJLILLLLZI;
    public float LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public final int[] LJLL;
    public final float[] LJLLI;

    public void setDrawSize(float f) {
        this.LJLJI = f;
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, this.LJLL, this.LJLLI, Shader.TileMode.CLAMP));
        invalidate();
    }

    public C131885Fo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJI = 1;
        this.LJLJJL = 2;
        this.LJLJJLL = 4;
        this.LJLJL = 8;
        this.LJLL = new int[]{-1, 0};
        this.LJLLI = new float[]{0.0f, 1.0f};
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setStyle(Paint.Style.FILL);
        this.LJLIL.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfc, R.attr.bfd});
        this.LJLILLLLZI = obtainStyledAttributes.getInt(0, 0);
        this.LJLJI = obtainStyledAttributes.getDimension(1, C74275TDb.LIZIZ(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        boolean drawChild = super.drawChild(canvas, view, j);
        int i = this.LJLILLLLZI;
        if (i == 0 || (i & this.LJLJJI) != 0) {
            canvas.drawRect(0.0f, -3.0f, this.LJLJLJ, this.LJLJI, this.LJLIL);
        }
        int i2 = this.LJLILLLLZI;
        if (i2 == 0 || (i2 & this.LJLJJL) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.LJLJLJ / 2, this.LJLJLLL / 2);
            canvas.drawRect(0.0f, -3.0f, this.LJLJLJ, this.LJLJI, this.LJLIL);
            canvas.restoreToCount(save);
        }
        int i3 = (this.LJLJLLL - this.LJLJLJ) / 2;
        int i4 = this.LJLILLLLZI;
        if (i4 == 0 || (i4 & this.LJLJJLL) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.LJLJLJ / 2, this.LJLJLLL / 2);
            canvas.translate(0.0f, i3);
            canvas.drawRect(-i3, -3.0f, this.LJLJLJ + i3, this.LJLJI, this.LJLIL);
            canvas.restoreToCount(save2);
        }
        int i5 = this.LJLILLLLZI;
        if (i5 == 0 || (i5 & this.LJLJL) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.LJLJLJ / 2, this.LJLJLLL / 2);
            canvas.translate(0.0f, i3);
            canvas.drawRect(-i3, -3.0f, this.LJLJLJ + i3, this.LJLJI, this.LJLIL);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, this.LJLL, this.LJLLI, Shader.TileMode.CLAMP));
        this.LJLJLJ = getWidth();
        this.LJLJLLL = getHeight();
    }
}
