package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.5Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131855Fl extends FrameLayout {
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

    public C131855Fl(Context context, AttributeSet attributeSet) {
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
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, view, j);
        if ((this.LJLILLLLZI & this.LJLJJI) != 0) {
            canvas.drawRect(0.0f, 0.0f, this.LJLJLJ, this.LJLJI, this.LJLIL);
        }
        if ((this.LJLILLLLZI & this.LJLJJL) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.LJLJLJ / 2.0f, this.LJLJLLL / 2.0f);
            canvas.drawRect(0.0f, 0.0f, this.LJLJLJ, this.LJLJI, this.LJLIL);
            canvas.restoreToCount(save);
        }
        float f = (this.LJLJLLL - this.LJLJLJ) / 2.0f;
        if ((this.LJLILLLLZI & this.LJLJJLL) != 0) {
            int save2 = canvas.save();
            canvas.rotate(270.0f, this.LJLJLJ / 2.0f, this.LJLJLLL / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.LJLJLJ + f, this.LJLJI, this.LJLIL);
            canvas.restoreToCount(save2);
        }
        if ((this.LJLILLLLZI & this.LJLJL) != 0) {
            int save3 = canvas.save();
            canvas.rotate(90.0f, this.LJLJLJ / 2.0f, this.LJLJLLL / 2.0f);
            canvas.translate(0.0f, f);
            canvas.drawRect(0.0f - f, 0.0f, this.LJLJLJ + f, this.LJLJI, this.LJLIL);
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
