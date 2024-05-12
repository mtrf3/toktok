package X;

import Y.AUListenerS102S0100000_15;
import Y.IDAListenerS82S0100000_15;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YNZ extends RelativeLayout {
    public InterfaceC87276YNc LJLIL;
    public InterfaceC87276YNc LJLILLLLZI;
    public Boolean LJLJI;
    public final FrameLayout LJLJJI;
    public final FrameLayout LJLJJL;
    public final ViewGroup LJLJJLL;
    public final ViewGroup LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public final int LJLL;
    public ViewGroup LJLLI;
    public ViewGroup LJLLILLLL;
    public ValueAnimator LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public final FrameLayout LJLLLLLL;
    public final FrameLayout LJLZ;

    public final void LIZJ() {
        Boolean bool = this.LJLJI;
        if (bool == null) {
            this.LJLJI = Boolean.TRUE;
            LIZIZ(this.LJLJJL, this.LJLJJI);
        } else {
            if (o.LJ(bool, Boolean.TRUE)) {
                LIZ(this.LJLJJL, this.LJLJJI);
            } else {
                LIZ(this.LJLJJI, this.LJLJJL);
            }
            requestLayout();
        }
    }

    public final View getLeftSelectorView() {
        return this.LJLJLJ;
    }

    public final View getRightSelectorView() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YNZ(ActivityC45651qj context) {
        super(context, null, 0);
        int i;
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
        this.LJLL = 300;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LJLLLLLL = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.LJLZ = frameLayout2;
        if (C46227ICh.LIZ()) {
            i = R.layout.ano;
        } else {
            i = R.layout.ann;
        }
        RelativeLayout.inflate(context, i, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setVisibility(8);
        View findViewById = findViewById(R.id.ck7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.dynami…_selector_left_container)");
        FrameLayout frameLayout3 = (FrameLayout) findViewById;
        this.LJLJJI = frameLayout3;
        View findViewById2 = findViewById(R.id.ck8);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.dynami…selector_right_container)");
        FrameLayout frameLayout4 = (FrameLayout) findViewById2;
        this.LJLJJL = frameLayout4;
        View findViewById3 = findViewById(R.id.fpo);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.left_thumbnail_default)");
        ViewGroup viewGroup = (ViewGroup) findViewById3;
        this.LJLJJLL = viewGroup;
        View findViewById4 = findViewById(R.id.j3b);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.right_thumbnail_default)");
        ViewGroup viewGroup2 = (ViewGroup) findViewById4;
        this.LJLJL = viewGroup2;
        viewGroup.setVisibility(4);
        viewGroup2.setVisibility(4);
        frameLayout3.addView(frameLayout, 0, new RelativeLayout.LayoutParams(-1, -2));
        frameLayout4.addView(frameLayout2, 0, new RelativeLayout.LayoutParams(-1, -2));
    }

    public final void LIZ(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (this.LJLLI == null || this.LJLLILLLL == null) {
            LIZIZ(viewGroup, viewGroup2);
            return;
        }
        if (this.LJLLJ == null) {
            this.LJLLLL = this.LJLJJI.getWidth();
            int width = this.LJLJJL.getWidth();
            this.LJLLL = width;
            ValueAnimator duration = ValueAnimator.ofInt(width, this.LJLLLL).setDuration(this.LJLL);
            this.LJLLJ = duration;
            if (duration != null) {
                duration.addUpdateListener(new AUListenerS102S0100000_15(this, 28));
            }
            ValueAnimator valueAnimator = this.LJLLJ;
            if (valueAnimator != null) {
                valueAnimator.addListener(new IDAListenerS82S0100000_15(this, 10));
            }
        }
        ValueAnimator valueAnimator2 = this.LJLLJ;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public final void LIZIZ(ViewGroup viewGroup, ViewGroup viewGroup2) {
        View childAt;
        View childAt2;
        View childAt3;
        this.LJLLI = viewGroup;
        this.LJLLILLLL = viewGroup2;
        View view = null;
        if (viewGroup2 != null && (childAt3 = viewGroup2.getChildAt(0)) != null) {
            childAt3.setVisibility(0);
        }
        ViewGroup viewGroup3 = this.LJLLI;
        if (viewGroup3 != null) {
            view = viewGroup3.getChildAt(0);
        }
        if (view != null) {
            view.setVisibility(8);
        }
        ViewGroup viewGroup4 = this.LJLLI;
        if (viewGroup4 != null && (childAt2 = viewGroup4.getChildAt(1)) != null) {
            childAt2.setVisibility(0);
        }
        ViewGroup viewGroup5 = this.LJLLILLLL;
        if (viewGroup5 == null || (childAt = viewGroup5.getChildAt(1)) == null) {
            return;
        }
        childAt.setVisibility(8);
    }
}
