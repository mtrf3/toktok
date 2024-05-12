package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4mZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119514mZ extends View {
    public final ArrayList<OSZ<Object, Integer>> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final Paint LJLJJL;
    public final Paint LJLJJLL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLILLLLZI != -1) {
            Iterator<OSZ<Object, Integer>> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                OSZ<Object, Integer> next = it.next();
                int LJJIIZ = this.LJLILLLLZI - O6R.LJJIIZ(C32151Nz.LJIIZILJ(next.getSecond()));
                if (LJJIIZ > 0) {
                    if (next.getFirst() instanceof Integer) {
                        Paint paint = this.LJLJJL;
                        Object first = next.getFirst();
                        o.LJII(first, "null cannot be cast to non-null type kotlin.Int");
                        paint.setColor(((Integer) first).intValue());
                        if (canvas != null) {
                            canvas.drawCircle(this.LJLJI, this.LJLJJI, LJJIIZ, this.LJLJJL);
                        }
                    }
                    if (next.getFirst() instanceof LinearGradient) {
                        Paint paint2 = this.LJLJJLL;
                        Object first2 = next.getFirst();
                        o.LJII(first2, "null cannot be cast to non-null type android.graphics.LinearGradient");
                        paint2.setShader((Shader) first2);
                        if (canvas != null) {
                            canvas.drawCircle(this.LJLJI, this.LJLJJI, LJJIIZ, this.LJLJJLL);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C119514mZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLILLLLZI = getMeasuredHeight() / 2;
        this.LJLJI = getMeasuredWidth() / 2;
        this.LJLJJI = getMeasuredHeight() / 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119514mZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = new ArrayList<>();
        this.LJLILLLLZI = -1;
        this.LJLJI = -1;
        this.LJLJJI = -1;
        this.LJLJJL = C6D8.LIZIZ(true);
        this.LJLJJLL = C6D8.LIZIZ(true);
    }
}
