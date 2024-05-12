package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5B0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5B0 extends ConstraintLayout {
    public final Paint LJLIL;
    public final Paint LJLILLLLZI;
    public final Rect LJLJI;
    public final Rect LJLJJI;
    public final ConstraintLayout LJLJJL;
    public final ConstraintLayout LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        canvas.drawRect(this.LJLJJI, this.LJLILLLLZI);
        super.dispatchDraw(canvas);
        canvas.drawRect(this.LJLJI, this.LJLIL);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5B0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5B0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        Paint paint = new Paint();
        this.LJLIL = paint;
        Paint paint2 = new Paint();
        this.LJLILLLLZI = paint2;
        this.LJLJI = new Rect(0, 0, 0, 0);
        this.LJLJJI = new Rect(0, 0, 0, 0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.as9, this, true);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) LLLLIILL;
        this.LJLJJLL = constraintLayout;
        LinearGradient linearGradient = new LinearGradient(C134845Qy.LIZJ(context) / 2.0f, 0.0f, C134845Qy.LIZJ(context) / 2.0f, C134845Qy.LIZIZ(context).y / 2.0f, AnonymousClass636.LJIIIIZZ(R.attr.ef, context), AnonymousClass636.LJIIIIZZ(R.attr.ed, context), Shader.TileMode.CLAMP);
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(context, 605));
        View findViewById = constraintLayout.findViewById(R.id.e17);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.guide_root)");
        this.LJLJJL = (ConstraintLayout) findViewById;
        setLayerType(1, null);
        paint.setAntiAlias(true);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint2.setAntiAlias(true);
        paint2.setShader(linearGradient);
    }
}
