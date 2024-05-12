package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.5CR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5CR extends View {
    public final Path LJLIL;
    public final Paint LJLILLLLZI;
    public final float LJLJI;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5CR(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        float width = this.LJLJI * getWidth();
        float f = 0.56f * width;
        Path path = this.LJLIL;
        path.lineTo(f, 0.0f);
        path.quadTo(width, getHeight() * 0.21f, width, getHeight() * 0.5f);
        path.quadTo(width, getHeight() * 0.78f, f, getHeight());
        path.lineTo(0.0f, getHeight());
        path.lineTo(0.0f, 0.0f);
        path.close();
        canvas.drawPath(this.LJLIL, this.LJLILLLLZI);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5CR(android.content.Context r4, android.util.AttributeSet r5, int r6) {
        /*
            r3 = this;
            r0 = r6 & 2
            if (r0 == 0) goto L5
            r5 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r4, r0)
            r2 = 0
            r3.<init>(r4, r5, r2)
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.LJLIL = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r0 = 2130968633(0x7f040039, float:1.7545925E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r4)
            if (r0 == 0) goto L27
            int r2 = r0.intValue()
        L27:
            r1.setColor(r2)
            r3.LJLILLLLZI = r1
            r0 = 1041865114(0x3e19999a, float:0.15)
            r3.LJLJI = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5CR.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
