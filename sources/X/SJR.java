package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public final class SJR extends C62846OlW {
    public static final float LJLJJL = C32151Nz.LJIIZILJ(Float.valueOf(1.0f));
    public final Float LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final boolean LJLJJI;

    private final Path getCirclePath() {
        return (Path) this.LJLILLLLZI.getValue();
    }

    private final Path getCutoutCirclePath() {
        return (Path) this.LJLJI.getValue();
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.clipPath(getCirclePath());
        }
        if (this.LJLJJI && canvas != null) {
            canvas.clipPath(getCutoutCirclePath(), Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SJR(Context context, Float f) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = f;
        this.LJLILLLLZI = C221108m2.LIZIZ(DK0.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(DK1.LJLIL);
        this.LJLJJI = f != null;
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        float measuredWidth;
        super.onMeasure(i, i2);
        int i3 = 1;
        if (C16310kV.LIZLLL(this) == 1) {
            i3 = -1;
        }
        float measuredWidth2 = getMeasuredWidth() * 0.5f;
        float f = i3;
        Float f2 = this.LJLIL;
        if (f2 != null) {
            measuredWidth = f2.floatValue();
        } else {
            measuredWidth = getMeasuredWidth() * 0.7f;
        }
        getCirclePath().reset();
        getCirclePath().addCircle(measuredWidth2, measuredWidth2, measuredWidth2, Path.Direction.CW);
        getCutoutCirclePath().reset();
        getCutoutCirclePath().addCircle((f * measuredWidth) + measuredWidth2, measuredWidth2, LJLJJL + measuredWidth2, Path.Direction.CW);
    }
}
