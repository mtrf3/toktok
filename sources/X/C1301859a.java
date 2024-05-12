package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.59a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301859a extends View {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;

    private final float getBackgroundWidth() {
        return (2 * this.LJLJJI) + this.LJLJI;
    }

    public final float getGapWidth() {
        return this.LJLJJI;
    }

    public final float getPlayHeadWidth() {
        return this.LJLJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        this.LJLIL.setStrokeWidth(getBackgroundWidth());
        this.LJLILLLLZI.setStrokeWidth(this.LJLJI);
        float width = getWidth() / 2.0f;
        float f = 2;
        float strokeWidth = this.LJLIL.getStrokeWidth() / f;
        float strokeWidth2 = this.LJLILLLLZI.getStrokeWidth() / f;
        canvas.drawLine(width, strokeWidth, width, getHeight() - strokeWidth, this.LJLIL);
        canvas.drawLine(width, strokeWidth2 + this.LJLJJI, width, getHeight() - (strokeWidth2 + this.LJLJJI), this.LJLILLLLZI);
    }

    public final void setGapWidth(float f) {
        this.LJLJJI = f;
    }

    public final void setPlayHeadWidth(float f) {
        this.LJLJI = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301859a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new LinkedHashMap();
        Paint paint = new Paint();
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        this.LJLILLLLZI = paint2;
        this.LJLJI = C134845Qy.LIZ(2.0f);
        this.LJLJJI = C134845Qy.LIZ(1.0f);
        paint.setStrokeWidth(getBackgroundWidth());
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint2.setStrokeWidth(this.LJLJI);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-1);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
}
