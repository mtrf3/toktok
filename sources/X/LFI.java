package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LFI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, TextView title, ViewPager bannerViewPager, int i) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(bannerViewPager, "bannerViewPager");
        if (MSAdaptionService.LJIIL().LJI(context)) {
            i = (i >> 1) - 42;
        }
        title.setVisibility(8);
        LFH lfh = LFH.LIZIZ;
        int LJIIL = lfh.LIZLLL().LJIIL().LJIIL((int) (i * 0.48104957f));
        ViewGroup.LayoutParams layoutParams = bannerViewPager.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = LJIIL;
        if (!lfh.LIZLLL().LJIIL().LJJIJLIJ(i, bannerViewPager)) {
            bannerViewPager.setPadding(0, 0, 0, 0);
            bannerViewPager.setPageMargin(C17N.LJIILL(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
            bannerViewPager.setClipToPadding(true);
        }
        bannerViewPager.setLayoutParams(marginLayoutParams);
    }
}
