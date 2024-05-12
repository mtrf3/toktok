package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vlm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80698Vlm extends C80695Vlj {
    public static final /* synthetic */ int LLIILZL = 0;
    public InterfaceC80707Vlv LLIIJLIL;
    public int LLIIL;
    public int LLIILII;

    @Override // X.C80695Vlj
    public final void LIZIZ(InterfaceC80707Vlv listener) {
        o.LJIIIZ(listener, "listener");
        this.LLIIJLIL = listener;
    }

    public final void setMaxTabModeForCount(int i) {
        if (i <= 1) {
            setHideIndicatorView(true);
        } else {
            setHideIndicatorView(false);
            if (i <= 4 && i > 1) {
                setTabMode(1);
                return;
            }
        }
        setTabMode(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80698Vlm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ym, R.attr.z5, R.attr.a3n, R.attr.ab5, R.attr.ad8, R.attr.aew, R.attr.ai5, R.attr.ai6, R.attr.ai7, R.attr.ai8, R.attr.aib, R.attr.aic, R.attr.aid, R.attr.aie, R.attr.aif, R.attr.aig, R.attr.aih, R.attr.aii, R.attr.aiz, R.attr.aj0, R.attr.aj1, R.attr.ajb, R.attr.akq, R.attr.aol, R.attr.ay2, R.attr.b1l, R.attr.b25, R.attr.b36, R.attr.b3k, R.attr.b4p, R.attr.b4q, R.attr.b8z, R.attr.b_d, R.attr.b_p, R.attr.baf, R.attr.bag, R.attr.bff, R.attr.bi_, R.attr.bii, R.attr.bin, R.attr.biw, R.attr.bj3, R.attr.bjp, R.attr.bkc, R.attr.bvl, R.attr.bvx, R.attr.bvz});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…s, R.styleable.AVDmtView)");
            obtainStyledAttributes.getBoolean(27, false);
        }
        int i = C78885Uxd.LIZIZ;
        this.LLIIL = i;
        this.LLIILII = C78885Uxd.LIZJ(i);
        setOverScrollMode(2);
        int i2 = this.LLIILII;
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{this.LLIIL, i2}));
        setSelectedTabIndicatorColor(this.LLIIL);
        setTabMargin(16);
        super.LIZIZ(new C80703Vlr(this));
    }
}
