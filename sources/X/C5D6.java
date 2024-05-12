package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5D6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5D6 extends View {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public Path LJLJJI;
    public int LJLJJL;
    public ShapeDrawable LJLJJLL;
    public PathShape LJLJL;
    public RectF LJLJLJ;
    public boolean LJLJLLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.LJLJJI;
        o.LJI(path);
        path.reset();
        Path path2 = this.LJLJJI;
        o.LJI(path2);
        path2.moveTo(0.0f, 0.0f);
        RectF rectF = this.LJLJLJ;
        if (rectF != null) {
            Path path3 = this.LJLJJI;
            o.LJI(path3);
            path3.arcTo(rectF, 0.0f, 180.0f);
        }
        Path path4 = this.LJLJJI;
        o.LJI(path4);
        path4.lineTo(0.0f, this.LJLILLLLZI);
        Path path5 = this.LJLJJI;
        o.LJI(path5);
        path5.lineTo(this.LJLIL, this.LJLILLLLZI);
        Path path6 = this.LJLJJI;
        o.LJI(path6);
        path6.lineTo(this.LJLIL, 0.0f);
        Path path7 = this.LJLJJI;
        o.LJI(path7);
        path7.close();
        if (this.LJLJL == null || this.LJLJLLL) {
            Path path8 = this.LJLJJI;
            o.LJI(path8);
            this.LJLJL = new PathShape(path8, this.LJLIL, this.LJLILLLLZI);
            if (this.LJLJLLL) {
                this.LJLJLLL = false;
            }
        }
        ShapeDrawable shapeDrawable = this.LJLJJLL;
        o.LJI(shapeDrawable);
        shapeDrawable.setShape(this.LJLJL);
        ShapeDrawable shapeDrawable2 = this.LJLJJLL;
        o.LJI(shapeDrawable2);
        shapeDrawable2.setBounds(0, 0, this.LJLIL, this.LJLILLLLZI);
        ShapeDrawable shapeDrawable3 = this.LJLJJLL;
        o.LJI(shapeDrawable3);
        shapeDrawable3.getPaint().setColor(this.LJLJJL);
        ShapeDrawable shapeDrawable4 = this.LJLJJLL;
        o.LJI(shapeDrawable4);
        shapeDrawable4.draw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5D6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bs, R.attr.bt});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…leable.ArcBackgroundView)");
        this.LJLJJL = obtainStyledAttributes.getColor(0, this.LJLJJL);
        this.LJLJI = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.LJLJJI = new Path();
        obtainStyledAttributes.recycle();
        this.LJLJJLL = new ShapeDrawable();
        this.LJLJLJ = new RectF(0.0f, -r1, r1 * 2, this.LJLJI);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLIL = View.MeasureSpec.getSize(i);
        this.LJLILLLLZI = View.MeasureSpec.getSize(i2);
        this.LJLJLLL = true;
    }
}
