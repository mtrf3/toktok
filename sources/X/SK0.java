package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SK0 extends AppCompatImageView {
    public Drawable LJLIL;
    public Drawable LJLILLLLZI;

    public final void LIZ() {
        setImageDrawable(this.LJLIL);
    }

    public final void LIZIZ() {
        setImageDrawable(this.LJLILLLLZI);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void setStateDrawable(Drawable drawable) {
        this.LJLIL = drawable;
        setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SK0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SK0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqw, R.attr.btb});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.TuxPlayerStateView)");
            this.LJLIL = obtainStyledAttributes.getDrawable(0);
            this.LJLILLLLZI = obtainStyledAttributes.getDrawable(1);
            setImageDrawable(this.LJLIL);
            obtainStyledAttributes.recycle();
        }
    }
}
