package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Vhx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80461Vhx extends C80364VgO {
    public Drawable LJLJLJ;
    public Drawable LJLJLLL;
    public boolean LJLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C80364VgO, android.widget.Checkable
    public final void toggle() {
        Drawable drawable;
        super.toggle();
        if (this.LJLJJI) {
            drawable = this.LJLJLJ;
        } else {
            drawable = this.LJLJLLL;
        }
        setImageDrawable(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80461Vhx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LJLL = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
        obtainStyledAttributes.getBoolean(27, false);
        this.LJLL = obtainStyledAttributes.getBoolean(6, true);
        this.LJLJLJ = obtainStyledAttributes.getDrawable(33);
        this.LJLJLLL = obtainStyledAttributes.getDrawable(44);
        if (this.LJLL) {
            this.LJLJLJ = C78885Uxd.LIZLLL(this.LJLJLJ);
            this.LJLJLLL = C78885Uxd.LIZLLL(this.LJLJLLL);
        }
        setImageDrawable(this.LJLJLLL);
    }
}
