package X;

import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VZD implements Runnable {
    public final WeakReference<XSwiperUI> LJLIL;

    public final void LIZ() {
        XSwiperUI xSwiperUI = this.LJLIL.get();
        if (xSwiperUI != null && xSwiperUI.LL && xSwiperUI.LJLLL) {
            VZA viewPager = ((VZ9) xSwiperUI.mView).getViewPager();
            boolean z = true;
            int currentIndex = viewPager.getCurrentIndex() + 1;
            if (currentIndex == viewPager.getTotalCount() && (xSwiperUI.LLD || xSwiperUI.LJLLLL)) {
                currentIndex = 0;
            } else {
                z = false;
            }
            xSwiperUI.LJJ(viewPager, currentIndex, xSwiperUI.LJLLLLLL, z);
            xSwiperUI.LLI.postDelayed(this, xSwiperUI.LJLZ);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public VZD(XSwiperUI xSwiperUI) {
        this.LJLIL = new WeakReference<>(xSwiperUI);
    }
}
