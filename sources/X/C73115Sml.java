package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Sml, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73115Sml extends FrameLayout implements InterfaceC73114Smk {
    public final C39061g6 LJLIL;

    @Override // X.InterfaceC73114Smk
    public final void LJI(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ((C73112Smi) this.LJLIL.LIZJ).LIZ(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73115Sml(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C39061g6 c39061g6 = new C39061g6(this);
        this.LJLIL = c39061g6;
        ((C73112Smi) c39061g6.LIZJ).LIZIZ(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C39061g6 c39061g6 = this.LJLIL;
        ((C73112Smi) c39061g6.LIZJ).LIZJ(getWidth(), getHeight());
    }
}
