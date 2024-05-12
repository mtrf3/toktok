package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221788n8 extends View {
    public List<float[]> LJLIL;
    public final Paint LJLILLLLZI;
    public final Path LJLJI;

    public final List<float[]> getPoints() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221788n8(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLILLLLZI = new Paint();
        this.LJLJI = new Path();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        List<float[]> list;
        super.onDraw(canvas);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (C223998qh.LJ(context) && (list = this.LJLIL) != null) {
            for (float[] fArr : list) {
                if (fArr != null) {
                    this.LJLJI.reset();
                    this.LJLJI.moveTo(fArr[0], fArr[1]);
                    this.LJLJI.lineTo(fArr[2], fArr[3]);
                    this.LJLJI.lineTo(fArr[6], fArr[7]);
                    this.LJLJI.lineTo(fArr[4], fArr[5]);
                    this.LJLJI.close();
                    if (canvas != null) {
                        canvas.drawPath(this.LJLJI, this.LJLILLLLZI);
                    }
                }
            }
        }
    }

    public final void setPoints(List<float[]> list) {
        this.LJLIL = list;
    }
}
