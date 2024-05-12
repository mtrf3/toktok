package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6my, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170726my extends C170736mz {
    public final boolean LJLIL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C170736mz, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.LJLIL) {
            drawable = C78885Uxd.LIZLLL(drawable);
        }
        super.setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C170726my(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170726my(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            obtainStyledAttributes.getBoolean(27, false);
            this.LJLIL = obtainStyledAttributes.getBoolean(6, true);
        }
        if (this.LJLIL) {
            setImageDrawable(C78885Uxd.LIZLLL(getDrawable()));
        }
    }
}
