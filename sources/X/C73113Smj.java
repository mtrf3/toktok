package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Smj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73113Smj extends LinearLayout implements InterfaceC73114Smk {
    public final C73112Smi LJLIL;

    @Override // X.InterfaceC73114Smk
    public final void LJI(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        super.draw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.LJLIL.LIZ(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73113Smj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C73112Smi c73112Smi = new C73112Smi(this);
        this.LJLIL = c73112Smi;
        c73112Smi.LIZIZ(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLIL.LIZJ(getWidth(), getHeight());
    }
}
