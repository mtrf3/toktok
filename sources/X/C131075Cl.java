package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Cl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131075Cl extends View {
    public final Path LJLIL;
    public final Paint LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float f = (-this.LJLJI) / 2;
        int i = this.LJLJL;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 % 2 == 0) {
                    this.LJLILLLLZI.setColor(this.LJLJJLL);
                } else {
                    this.LJLILLLLZI.setColor(this.LJLJJL);
                }
                this.LJLIL.reset();
                this.LJLIL.moveTo(f, getHeight());
                this.LJLIL.lineTo(this.LJLJJI + f, 0.0f);
                this.LJLIL.lineTo(this.LJLJJI + f + this.LJLJI, 0.0f);
                this.LJLIL.lineTo(this.LJLJI + f, getHeight());
                this.LJLIL.close();
                canvas.drawPath(this.LJLIL, this.LJLILLLLZI);
                f += this.LJLJJI + this.LJLJI + this.LJLJLJ;
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131075Cl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLIL = new Path();
        this.LJLILLLLZI = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a62, R.attr.a6_, R.attr.a6a, R.attr.a6d});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….commerce_SpacedLineView)");
        this.LJLJI = obtainStyledAttributes.getDimension(1, C45804HyK.LJJ(17));
        this.LJLJJI = obtainStyledAttributes.getDimension(2, C45804HyK.LJJ(3));
        this.LJLJJL = obtainStyledAttributes.getColor(0, AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        this.LJLJJLL = obtainStyledAttributes.getColor(3, AnonymousClass636.LJIIIIZZ(R.attr.eg, context));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = this.LJLJI;
        int i5 = (int) ((r5 / f) * 0.8d);
        this.LJLJL = i5;
        this.LJLJLJ = (int) ((((i3 - i) - f) - (i5 * f)) / (i5 + 1));
    }
}
