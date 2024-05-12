package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.text.DecimalFormat;
import kotlin.jvm.internal.o;

/* renamed from: X.8ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216718ex {
    public final C216758f1 LIZ;
    public final DecimalFormat LIZIZ;
    public final DecimalFormat LIZJ;
    public float LIZLLL;

    public C216718ex(C216758f1 c216758f1) {
        this.LIZ = c216758f1;
        new Paint(5);
        this.LIZIZ = new DecimalFormat("0,000,000 ns");
        this.LIZJ = new DecimalFormat("0.000 ms");
    }

    public final void LIZ(Canvas canvas, long... jArr) {
        boolean z;
        o.LJIIIZ(canvas, "canvas");
        if (jArr.length != 2) {
            return;
        }
        int i = C217028fS.LIZ;
        if (i <= 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String msg = o.LJIILLIIL(this.LIZIZ.format(jArr[1] - jArr[0]), "draw(): draw=");
            o.LJIIIZ(msg, "msg");
        }
        float f = ((float) (jArr[1] - jArr[0])) / 1000000;
        getClass();
        if (i <= 5 && f > 8.0f) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("The time cost of the DanmakuView's draw() method is more than 8ms(");
            LIZ.append((Object) this.LIZJ.format(Float.valueOf(f)));
            LIZ.append("), it may cause performance issues!");
            String msg2 = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg2, "msg");
        }
        getClass();
    }
}
