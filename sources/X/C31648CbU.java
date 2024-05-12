package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* renamed from: X.CbU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31648CbU extends TBS implements InterfaceC88471Ynr<Canvas, RectF, C76800UCe> {
    public C31648CbU(Object obj) {
        super(2, obj, C31646CbS.class, "onPreDrawIcon", "onPreDrawIcon(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Canvas canvas, RectF rectF) {
        Canvas p0 = canvas;
        RectF p1 = rectF;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        ((C31646CbS) this.receiver).LJIILL(p0, p1);
        return C76800UCe.LIZ;
    }
}
