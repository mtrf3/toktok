package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Smm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73116Smm extends C47061t0 implements InterfaceC73114Smk {
    public final C39061g6 LLIIJI;

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.InterfaceC73114Smk
    public final void LJI(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.draw(canvas);
    }

    @Override // X.C47061t0, android.view.View
    public final void draw(Canvas canvas) {
        ((C73112Smi) this.LLIIJI.LIZJ).LIZ(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C73116Smm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73116Smm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C39061g6 c39061g6 = new C39061g6(this);
        this.LLIIJI = c39061g6;
        ((C73112Smi) c39061g6.LIZJ).LIZIZ(context, attributeSet, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C39061g6 c39061g6 = this.LLIIJI;
        ((C73112Smi) c39061g6.LIZJ).LIZJ(getWidth(), getHeight());
    }
}
