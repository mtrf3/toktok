package X;

import android.content.Context;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.LEd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53919LEd implements LFJ, InterfaceC110474Vf {
    public static final C53919LEd LJLIL = new C53919LEd();

    @Override // X.LFJ
    public final int LJJIL() {
        if (C35686DzW.LIZ("ITabletSearch.getSearchResultSpanCount")) {
            return 2;
        }
        return LJJ(2, 0, null);
    }

    @Override // X.LFJ
    public final OSZ LJJJIL() {
        if (C35686DzW.LIZ("ITabletSearch.getDiscoverCoverViewSize")) {
            return C53918LEc.LJLIL.LJJJIL();
        }
        return new OSZ(Float.valueOf(180.0f), Float.valueOf(240.0f));
    }

    @Override // X.LFJ
    public final int LJIIL(int i) {
        if (C35686DzW.LIZ("ITabletSearch.getDiscoverBannerHeight")) {
            return i;
        }
        return (int) (C17N.LJIILL(460.0d) * 0.48104957f);
    }

    @Override // X.InterfaceC110474Vf
    public final int LJJIIJZLJL(int i) {
        if (C35686DzW.LIZ("ITabletSearch.getSkeletonPreViewRes")) {
            return R.layout.b8k;
        }
        if (i != 4) {
            if (i != 5) {
                return R.layout.b8l;
            }
            return R.layout.b8n;
        }
        return R.layout.b8m;
    }

    @Override // X.LFJ
    public final OSZ LJJI(int i, int i2) {
        if (C35686DzW.LIZ("ITabletSearch.getDiscoverBannerMaxCountAndIndex")) {
            return C53918LEc.LJLIL.LJJI(i, i2);
        }
        int i3 = i * 10000;
        if (i3 >= 1000000) {
            i3 = 1000000;
        }
        return new OSZ(Integer.valueOf(i3), Integer.valueOf(i3 / 2));
    }

    @Override // X.LFJ
    public final boolean LJJIJLIJ(int i, View bannerViewPager) {
        o.LJIIIZ(bannerViewPager, "bannerViewPager");
        if (C35686DzW.LIZ("ITabletSearch.setDiscoverBannerPadding")) {
            return false;
        }
        ViewPager viewPager = (ViewPager) bannerViewPager;
        int LJIILL = (i - C17N.LJIILL(460.0d)) / 2;
        bannerViewPager.setPadding(LJIILL, 0, LJIILL, 0);
        viewPager.setPageMargin(C17N.LJIILL(2.0d));
        viewPager.setClipToPadding(false);
        return true;
    }

    @Override // X.InterfaceC110474Vf
    public final int LJJIZ(int i, int i2) {
        return LJJ(i, i2, null);
    }

    @Override // X.InterfaceC110474Vf
    public final int LJIIZILJ(int i, int i2, Context context) {
        if (C35686DzW.LIZ("ITabletSearch.getShareAwemeListItemHeight")) {
            return i2;
        }
        return (C53946LFe.LIZJ(context, null).LIZIZ * 4) / (LJJ(i, 0, context) * 3);
    }

    @Override // X.InterfaceC110474Vf
    public final int LJJ(int i, int i2, Context context) {
        if (C35686DzW.LIZ("ITabletSearch.getAwemeListSpanCount")) {
            return i;
        }
        if (E1F.LIZ() == 0.0f || E1F.LIZ() < 8.0f) {
            return i;
        }
        if (i2 <= 0) {
            i2 = C53946LFe.LIZJ(context, null).LIZIZ;
        }
        if (i2 > C7MY.LIZIZ(900)) {
            return 5;
        }
        if (i2 > C7MY.LIZIZ(480)) {
            return 4;
        }
        return 3;
    }
}
