package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.5Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131865Fm extends FrameLayout {
    public final int[] LJLIL;
    public final float[] LJLILLLLZI;
    public float LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final Paint LJLJL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
    }

    public final void setDrawSize(float f) {
        this.LJLJI = f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131865Fm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new int[]{-1, 0};
        this.LJLILLLLZI = new float[]{0.0f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aan, R.attr.aao});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.TransEdgeView)");
        this.LJLJJLL = obtainStyledAttributes.getInt(0, 0);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            if ((this.LJLJJLL & 16) != 0) {
                this.LJLJJLL = 4;
            }
            if ((this.LJLJJLL & 32) != 0) {
                this.LJLJJLL = 16;
            }
        } else {
            if ((this.LJLJJLL & 16) != 0) {
                this.LJLJJLL = 8;
            }
            if ((this.LJLJJLL & 32) != 0) {
                this.LJLJJLL = 4;
            }
        }
        this.LJLJI = obtainStyledAttributes.getDimension(1, KL2.LIZJ(getContext(), 20.0f));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.LJLJL = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(child, "child");
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas, child, j);
        int i = this.LJLJJLL;
        if (i == 0 || (i & 1) != 0) {
            canvas.drawRect(0.0f, -3.0f, this.LJLJJI, this.LJLJI, this.LJLJL);
        }
        int i2 = this.LJLJJLL;
        if (i2 == 0 || (i2 & 2) != 0) {
            int save = canvas.save();
            canvas.rotate(180.0f, this.LJLJJI / 2, this.LJLJJL / 2);
            canvas.drawRect(0.0f, -3.0f, this.LJLJJI, this.LJLJI, this.LJLJL);
            canvas.restoreToCount(save);
        }
        int i3 = (this.LJLJJL - this.LJLJJI) / 2;
        int i4 = this.LJLJJLL;
        if (i4 == 0 || (i4 & 4) != 0) {
            int save2 = canvas.save();
            canvas.rotate(90.0f, this.LJLJJI / 2, this.LJLJJL / 2);
            canvas.translate(0.0f, i3);
            canvas.drawRect(-i3, -3.0f, this.LJLJJI + i3, this.LJLJI, this.LJLJL);
            canvas.restoreToCount(save2);
        }
        int i5 = this.LJLJJLL;
        if (i5 == 0 || (i5 & 8) != 0) {
            int save3 = canvas.save();
            canvas.rotate(270.0f, this.LJLJJI / 2, this.LJLJJL / 2);
            canvas.translate(0.0f, i3);
            canvas.drawRect(-i3, -3.0f, this.LJLJJI + i3, this.LJLJI, this.LJLJL);
            canvas.restoreToCount(save3);
        }
        canvas.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, this.LJLIL, this.LJLILLLLZI, Shader.TileMode.CLAMP));
        this.LJLJJI = getWidth();
        this.LJLJJL = getHeight();
    }
}
