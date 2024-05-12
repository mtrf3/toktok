package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC183947Ju extends ConstraintLayout {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public int LJLJJI;

    public static /* synthetic */ void getWhiteBarStyle$annotations() {
    }

    public final View getTouchArea() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-touchArea>(...)");
        return (View) value;
    }

    public final TuxTextView getUpvoteTV() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-upvoteTV>(...)");
        return (TuxTextView) value;
    }

    public final Drawable getWhiteBarBG() {
        return (Drawable) this.LJLJI.getValue();
    }

    public final int getWhiteBarStyle() {
        return this.LJLJJI;
    }

    public final void setWhiteBarStyle(int i) {
        this.LJLJJI = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC183947Ju(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    public final void LJJLJLI(int i, int i2) {
        SY9 LIZ;
        if (i == 0) {
            LIZ = null;
        } else {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.do);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZ = c2068389v.LIZ(context);
            LIZ.setBounds(0, 0, LIZ.LIZIZ(), LIZ.LIZ());
        }
        Context context2 = getContext();
        if (context2 != null && C26338AVi.LIZJ(context2)) {
            getUpvoteTV().setCompoundDrawables(null, null, LIZ, null);
        } else {
            getUpvoteTV().setCompoundDrawables(LIZ, null, null, null);
        }
        getUpvoteTV().setCompoundDrawablePadding(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC183947Ju(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1485));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1484));
        setMaxWidth(C47135Ieh.LIZ(100, C63081OpJ.LJJJJL(context)) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(context, 1486));
    }
}
