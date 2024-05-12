package X;

import com.ss.android.ugc.aweme.discover.helper.ViewPagerSwitchHelper;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class OH2 implements Runnable {
    public final long LJLIL;
    public final WeakReference<ViewPagerSwitchHelper> LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        ViewPagerSwitchHelper viewPagerSwitchHelper;
        try {
            WeakReference<ViewPagerSwitchHelper> weakReference = this.LJLILLLLZI;
            if (weakReference != null && weakReference.get() != null && (viewPagerSwitchHelper = this.LJLILLLLZI.get()) != null && viewPagerSwitchHelper.mHandler != null && viewPagerSwitchHelper.mIsAutoSwitching) {
                viewPagerSwitchHelper.nextPage();
                if (!viewPagerSwitchHelper.mIsAutoSwitching) {
                    viewPagerSwitchHelper.mHandler.removeCallbacksAndMessages(null);
                } else {
                    viewPagerSwitchHelper.mHandler.postDelayed(this, this.LJLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public OH2(ViewPagerSwitchHelper viewPagerSwitchHelper, long j) {
        this.LJLILLLLZI = new WeakReference<>(viewPagerSwitchHelper);
        this.LJLIL = j;
    }
}
