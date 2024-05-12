package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CaO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31580CaO extends C31646CbS {
    public String LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public String LJJLIIIIJ;
    public CX3 LJJLIIIJ;
    public final C5H3 LJJLIIIJILLIZJL;
    public final C5H3 LJJLIIIJJI;
    public final C5H3 LJJLIIIJJIZ;
    public final C5H3 LJJLIIIJL;

    @Override // X.C31646CbS
    public final int LJIIIIZZ() {
        return this.LJJLI;
    }

    @Override // X.C31646CbS
    public final int LJIIIZ() {
        return this.LJJL;
    }

    @Override // X.C31646CbS
    public final String LJIIL() {
        return this.LJJLIIIIJ;
    }

    @Override // X.C31646CbS
    public final String LJIILIIL() {
        return this.LJJJLZIJ;
    }

    @Override // X.C31646CbS, X.AbstractC31467CWp
    public final void LIZLLL(Canvas canvas, Paint paint) {
        o.LJIIIZ(canvas, "canvas");
        o.LJIIIZ(paint, "paint");
        int i = this.LJJJZ;
        boolean z = false;
        if (i >= 0 && i < 256) {
            canvas.saveLayerAlpha(0.0f, 0.0f, this.LIZIZ, this.LIZJ, i, 31);
            z = true;
        }
        super.LIZLLL(canvas, paint);
        if (z) {
            canvas.restore();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31580CaO(Context context, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, String str, C31647CbT c31647CbT) {
        super(context, bitmap, bitmap2, bitmap3, str, c31647CbT);
        o.LJIIIZ(context, "context");
        this.LJJJLZIJ = str;
        this.LJJJZ = 255;
        this.LJJL = 255;
        this.LJJLIIIJILLIZJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 322));
        this.LJJLIIIJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 319));
        this.LJJLIIIJJIZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 320));
        this.LJJLIIIJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 321));
    }
}
