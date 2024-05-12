package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.8Hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208768Hg extends View {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Paint LJLJI;
    public final Paint LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        if (!CCJ.LIZ(getContext())) {
            this.LJLJI.setShader(new LinearGradient(0.0f, 0.0f, measuredWidth * 0.4f, getMeasuredHeight(), new int[]{this.LJLIL, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
            f = 0.0f;
            this.LJLJJI.setShader(new LinearGradient(getMeasuredWidth(), getMeasuredHeight(), measuredWidth * 1.6f, 0.0f, new int[]{this.LJLILLLLZI, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
        } else {
            this.LJLJI.setShader(new LinearGradient(getMeasuredWidth(), 0.0f, measuredWidth * 1.6f, getMeasuredHeight(), new int[]{this.LJLIL, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
            f = 0.0f;
            this.LJLJJI.setShader(new LinearGradient(0.0f, getMeasuredHeight(), measuredWidth * 0.4f, 0.0f, new int[]{this.LJLILLLLZI, 0}, new float[]{0.0f, 0.7f}, Shader.TileMode.CLAMP));
        }
        if (canvas != null) {
            canvas.drawRect(f, f, getMeasuredWidth(), getMeasuredHeight(), this.LJLJI);
            canvas.drawRect(f, f, getMeasuredWidth(), getMeasuredHeight(), this.LJLJJI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208768Hg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = C15380j0.LIZIZ(R.color.a25);
        this.LJLILLLLZI = C15380j0.LIZIZ(R.color.a24);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        this.LJLJI = paint;
        this.LJLJJI = new Paint();
    }
}
