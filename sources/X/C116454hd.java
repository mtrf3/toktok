package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C116454hd extends AppCompatImageView {
    public Drawable LJLIL;
    public SY9 LJLILLLLZI;

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
    public C116454hd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116454hd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_play_fill;
        Integer valueOf = Integer.valueOf(R.attr.dj);
        c2068389v.LJ = valueOf;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        SY9 LIZ = c2068389v.LIZ(context2);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_pause_fill1;
        c2068389v2.LJ = valueOf;
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "this.context");
        SY9 LIZ2 = c2068389v2.LIZ(context3);
        this.LJLIL = LIZ;
        this.LJLILLLLZI = LIZ2;
        setImageDrawable(LIZ);
    }
}
