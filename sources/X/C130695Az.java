package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130695Az extends ConstraintLayout {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final Rect LJLJJLL;
    public final Rect LJLJL;
    public final View LJLJLJ;
    public final ConstraintLayout LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        canvas.drawRect(this.LJLJL, this.LJLILLLLZI);
        super.dispatchDraw(canvas);
        Rect rect = this.LJLJJLL;
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        float f5 = this.LJLJI;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.LJLIL);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C130695Az(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C130695Az(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Integer LJI;
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        this.LJLILLLLZI = paint2;
        this.LJLJI = C134845Qy.LIZ(4.0f);
        this.LJLJJI = C134845Qy.LIZ(22.0f);
        this.LJLJJL = C7MY.LIZIZ(2);
        this.LJLJJLL = new Rect(0, 0, 0, 0);
        this.LJLJL = new Rect(0, 0, 0, 0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.at2, this, true);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.LJLL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 606));
        View findViewById = LLLLIILL.findViewById(R.id.ljn);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.….transition_guide_square)");
        this.LJLJLJ = findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.ljm);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.transition_guide_root)");
        this.LJLJLLL = (ConstraintLayout) findViewById2;
        setLayerType(1, null);
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint2.setAntiAlias(true);
        Integer valueOf = Integer.valueOf(R.attr.ca);
        if (valueOf != null && (LJI = C79045V0n.LJI(valueOf.intValue(), context)) != null) {
            paint2.setColor(LJI.intValue());
        }
        paint2.setAlpha(153);
    }
}
