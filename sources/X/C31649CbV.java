package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.CbV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31649CbV extends TBS implements InterfaceC88471Ynr<Canvas, RectF, C76800UCe> {
    public C31649CbV(Object obj) {
        super(2, obj, C31646CbS.class, "onPostDrawIcon", "onPostDrawIcon(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Canvas canvas, RectF rectF) {
        Canvas p0 = canvas;
        RectF p1 = rectF;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        ((C31646CbS) this.receiver).LJIILJJIL(p0, p1);
        return C76800UCe.LIZ;
    }
}
