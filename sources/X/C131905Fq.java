package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.a1;

/* renamed from: X.5Fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131905Fq extends FrameLayout {
    public boolean LJLIL;
    public final Paint LJLILLLLZI;
    public LinearGradient LJLJI;

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final LinearGradient getLinearGradient() {
        return this.LJLJI;
    }

    public final boolean getNeedLinearBackground() {
        return this.LJLIL;
    }

    public final Paint getPaint() {
        return this.LJLILLLLZI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.LJLILLLLZI);
        }
    }

    public final void setLinearGradient(LinearGradient linearGradient) {
        this.LJLJI = linearGradient;
    }

    public final void setNeedLinearBackground(boolean z) {
        this.LJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131905Fq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = new Paint();
        setWillNotDraw(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LJLIL) {
            this.LJLILLLLZI.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getMeasuredHeight(), new int[]{-871659881, -865100902, -863274902}, (float[]) null, Shader.TileMode.CLAMP));
        } else {
            this.LJLILLLLZI.setShader(null);
            this.LJLILLLLZI.setColor(-1560281088);
        }
    }
}
