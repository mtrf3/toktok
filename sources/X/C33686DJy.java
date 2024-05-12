package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.DJy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33686DJy extends View {
    public final Paint LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;

    public static /* synthetic */ void getOrientation$annotations() {
    }

    private final Path getPath() {
        return (Path) this.LJLILLLLZI.getValue();
    }

    public final void LIZ() {
        if (this.LJLJI > 0.0f && this.LJLJJI > 0.0f) {
            this.LJLIL.setPathEffect(new DashPathEffect(new float[]{this.LJLJI, this.LJLJJI}, 0.0f));
            invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33686DJy(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new Paint();
        this.LJLILLLLZI = C221108m2.LIZIZ(C33687DJz.LJLIL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.onDraw(canvas);
        if (this.LJLJI > 0.0f && this.LJLJJI > 0.0f) {
            if (this.LJLJJL == 1) {
                float height = getHeight();
                float f = this.LJLJJI;
                float f2 = this.LJLJI;
                float f3 = f + f2;
                float LIZ = C43881HKb.LIZ(height, f3, f3, f2);
                float height2 = (getHeight() - LIZ) / 2;
                canvas.drawLine(0.0f, height2, 0.0f, height2 + LIZ, this.LJLIL);
                return;
            }
            float width = getWidth();
            float f4 = this.LJLJJI;
            float f5 = this.LJLJI;
            float f6 = ((f4 + f5) * ((int) (width / r2))) + f5;
            float width2 = (getWidth() - f6) / 2;
            canvas.drawLine(width2, 0.0f, width2 + f6, 0.0f, this.LJLIL);
            return;
        }
        if (this.LJLJJL == 1) {
            canvas.drawLine(0.0f, 0.0f, 0.0f, getHeight(), this.LJLIL);
        } else {
            canvas.drawLine(0.0f, 0.0f, getWidth(), 0.0f, this.LJLIL);
        }
    }

    public final void setLineColorRes(int i) {
        int i2;
        Paint paint = this.LJLIL;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(i, context);
        if (LJI != null) {
            i2 = LJI.intValue();
        } else {
            i2 = 0;
        }
        paint.setColor(i2);
        invalidate();
    }

    public final void setLineGapWidth(float f) {
        if (f == this.LJLJJI) {
            return;
        }
        this.LJLJJI = f;
        LIZ();
    }

    public final void setLineGapWidthInDp(float f) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setLineGapWidth(C87277YNd.LJFF(context, f));
    }

    public final void setLineSolidWidth(float f) {
        if (f == this.LJLJI) {
            return;
        }
        this.LJLJI = f;
        LIZ();
    }

    public final void setLineSolidWidthInDp(float f) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setLineSolidWidth(C87277YNd.LJFF(context, f));
    }

    public final void setOrientation(int i) {
        if (i != this.LJLJJL) {
            this.LJLJJL = i;
            invalidate();
        }
    }

    public final void setStrokeWidth(float f) {
        if (f == this.LJLIL.getStrokeWidth()) {
            return;
        }
        this.LJLIL.setStrokeWidth(f);
        invalidate();
    }
}
