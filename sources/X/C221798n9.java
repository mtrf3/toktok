package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221798n9 extends View {
    public float[] LJLIL;
    public final Paint LJLILLLLZI;
    public final Path LJLJI;

    public final Path getPath() {
        return this.LJLJI;
    }

    public final float[] getPoints() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221798n9(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLILLLLZI = new Paint();
        this.LJLJI = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C223998qh.LJ(context) && this.LJLIL != null) {
            this.LJLJI.reset();
            Path path = this.LJLJI;
            float[] fArr = this.LJLIL;
            o.LJI(fArr);
            float f = fArr[0];
            float[] fArr2 = this.LJLIL;
            o.LJI(fArr2);
            path.moveTo(f, fArr2[1]);
            Path path2 = this.LJLJI;
            float[] fArr3 = this.LJLIL;
            o.LJI(fArr3);
            float f2 = fArr3[2];
            float[] fArr4 = this.LJLIL;
            o.LJI(fArr4);
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.LJLJI;
            float[] fArr5 = this.LJLIL;
            o.LJI(fArr5);
            float f3 = fArr5[6];
            float[] fArr6 = this.LJLIL;
            o.LJI(fArr6);
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.LJLJI;
            float[] fArr7 = this.LJLIL;
            o.LJI(fArr7);
            float f4 = fArr7[4];
            float[] fArr8 = this.LJLIL;
            o.LJI(fArr8);
            path4.lineTo(f4, fArr8[5]);
            this.LJLJI.close();
            if (canvas != null) {
                canvas.drawPath(this.LJLJI, this.LJLILLLLZI);
            }
        }
    }

    public final void setPoints(float[] fArr) {
        this.LJLIL = fArr;
    }
}
