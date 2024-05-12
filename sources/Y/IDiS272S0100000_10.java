package Y;

import X.C0C3;
import X.C16880lQ;
import X.C59954Nfy;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileDetailFragmentWidget;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDiS272S0100000_10 implements C0C3 {
    public final int $t;
    public Object l0;

    public static final void onPageScrollStateChanged$0(IDiS272S0100000_10 iDiS272S0100000_10, int i) {
    }

    public static final void onPageScrollStateChanged$1(IDiS272S0100000_10 iDiS272S0100000_10, int i) {
    }

    public static final void onPageScrolled$0(IDiS272S0100000_10 iDiS272S0100000_10, int i, float f, int i2) {
    }

    public static final void onPageScrolled$1(IDiS272S0100000_10 iDiS272S0100000_10, int i, float f, int i2) {
    }

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                return;
            case 1:
                onPageScrollStateChanged$1(this, i);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                return;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                return;
            default:
                return;
        }
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                return;
            case 1:
                onPageSelected$1(this, i);
                return;
            default:
                return;
        }
    }

    public IDiS272S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onPageSelected$0(IDiS272S0100000_10 iDiS272S0100000_10, int i) {
        ((AdNewFakeUserProfileDetailFragmentWidget) iDiS272S0100000_10.l0).LJIJJ(i);
    }

    public static final void onPageSelected$1(IDiS272S0100000_10 iDiS272S0100000_10, int i) {
        ViewPager viewPager = ((C59954Nfy) iDiS272S0100000_10.l0).LJLLLL;
        o.LJI(viewPager);
        if (viewPager.getAdapter() != null) {
            ViewPager viewPager2 = ((C59954Nfy) iDiS272S0100000_10.l0).LJLLLL;
            o.LJI(viewPager2);
            PagerAdapter adapter = viewPager2.getAdapter();
            o.LJI(adapter);
            if (adapter.getCount() <= 0) {
                return;
            }
            C59954Nfy c59954Nfy = (C59954Nfy) iDiS272S0100000_10.l0;
            Locale locale = Locale.getDefault();
            ViewPager viewPager3 = ((C59954Nfy) iDiS272S0100000_10.l0).LJLLLL;
            o.LJI(viewPager3);
            PagerAdapter adapter2 = viewPager3.getAdapter();
            o.LJI(adapter2);
            String LLLZI = C16880lQ.LLLZI(locale, "%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i + 1), Integer.valueOf(adapter2.getCount())}, 2));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            c59954Nfy.setText(LLLZI);
        }
    }
}
