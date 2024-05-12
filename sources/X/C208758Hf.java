package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Hf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208758Hf extends View implements InterfaceC29493Bhp {
    public final Paint LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208758Hf(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new Paint(1);
        this.LJLILLLLZI = C15380j0.LIZIZ(R.color.a_4);
        this.LJLJJI = true;
    }

    private final void setShadowed(boolean z) {
        this.LJLJJI = z;
        invalidate();
    }

    @Override // X.InterfaceC29493Bhp
    public final void LIZIZ(boolean z) {
        setShadowed(z);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLJJI) {
            canvas.save();
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.LJLIL);
        }
    }

    @Override // X.InterfaceC29493Bhp
    public final void LIZ(C45631qh scrollView, int i) {
        o.LJIIIZ(scrollView, "scrollView");
        setShadowed(scrollView.canScrollVertically(1));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLJI = getHeight();
        this.LJLIL.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LJLJI, 0, this.LJLILLLLZI, Shader.TileMode.CLAMP));
    }
}
