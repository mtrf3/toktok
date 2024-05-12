package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TG7 extends F9E {
    public final InterfaceC88472Yns<? super ViewGroup, ? extends OSZ<? extends View, ? extends View>> LJLIL;
    public final InterfaceC88472Yns<? super ViewPager, C76800UCe> LJLILLLLZI;
    public InterfaceC88472Yns<? super C80695Vlj, C76800UCe> LJLJI;
    public final InterfaceC88472Yns<? super ViewGroup, C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<? super ViewGroup, C76800UCe> LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final Interpolator LJLJLLL;
    public final int LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final InterfaceC88471Ynr<Float, Float, C76800UCe> LJLLL;
    public final boolean LJLLLL;
    public final int LJLLLLLL;
    public final boolean LJLZ;
    public final boolean LJZ;
    public final boolean LJZI;
    public final InterfaceC88472Yns<? super View, ? extends View.OnTouchListener> LJZL;
    public final float LL;
    public final boolean LLD;
    public final boolean LLF;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LLFF;
    public final boolean LLFFF;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), this.LJLJLLL, Integer.valueOf(this.LJLL), Boolean.valueOf(this.LJLLI), Boolean.valueOf(this.LJLLILLLL), Boolean.valueOf(this.LJLLJ), this.LJLLL, Boolean.valueOf(this.LJLLLL), Integer.valueOf(this.LJLLLLLL), Boolean.valueOf(this.LJLZ), Boolean.valueOf(this.LJZ), Boolean.valueOf(this.LJZI), this.LJZL, Float.valueOf(this.LL), Boolean.valueOf(this.LLD), Boolean.valueOf(this.LLF), this.LLFF, Boolean.valueOf(this.LLFFF)};
    }

    public TG7(T3C t3c, int i, boolean z, boolean z2, int i2, boolean z3, boolean z4, boolean z5, Q3T q3t, boolean z6, int i3) {
        int i4;
        int i5;
        int i6;
        InterpolatorC74353TGb interpolator;
        boolean z7 = z;
        int i7 = i;
        int i8 = i2;
        boolean z8 = z2;
        boolean z9 = z4;
        boolean z10 = z3;
        Q3T q3t2 = q3t;
        boolean z11 = z5;
        boolean z12 = z6;
        T3C t3c2 = (i3 & 1) != 0 ? null : t3c;
        if ((i3 & 32) != 0) {
            i4 = R.color.wl;
        } else {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = R.color.wj;
        } else {
            i5 = 0;
        }
        if ((i3 & 128) != 0) {
            i6 = R.color.wm;
        } else {
            i6 = 0;
        }
        if ((i3 & 256) != 0) {
            interpolator = new InterpolatorC74353TGb();
        } else {
            interpolator = null;
        }
        i7 = (i3 & 512) != 0 ? 0 : i7;
        z7 = (i3 & 2048) != 0 ? false : z7;
        z8 = (i3 & 4096) != 0 ? false : z8;
        i8 = (32768 & i3) != 0 ? 3 : i8;
        z10 = (131072 & i3) != 0 ? false : z10;
        z9 = (262144 & i3) != 0 ? false : z9;
        z11 = (4194304 & i3) != 0 ? false : z11;
        q3t2 = (8388608 & i3) != 0 ? null : q3t2;
        z12 = (i3 & 16777216) != 0 ? false : z12;
        o.LJIIIZ(interpolator, "interpolator");
        this.LJLIL = t3c2;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = i4;
        this.LJLJL = i5;
        this.LJLJLJ = i6;
        this.LJLJLLL = interpolator;
        this.LJLL = i7;
        this.LJLLI = false;
        this.LJLLILLLL = z7;
        this.LJLLJ = z8;
        this.LJLLL = null;
        this.LJLLLL = false;
        this.LJLLLLLL = i8;
        this.LJLZ = false;
        this.LJZ = z10;
        this.LJZI = z9;
        this.LJZL = null;
        this.LL = 0.0f;
        this.LLD = false;
        this.LLF = z11;
        this.LLFF = q3t2;
        this.LLFFF = z12;
    }
}
