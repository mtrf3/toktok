package Y;

import X.C55374LoI;
import X.C57082Lw;
import X.MF0;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.profile.ui.I18nAbsProfileFragmentV2;

/* loaded from: classes10.dex */
public class ARunnableS16S0000000_9 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                I18nAbsProfileFragmentV2.Ol();
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public ARunnableS16S0000000_9(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS16S0000000_9 aRunnableS16S0000000_9) {
        boolean LIZ;
        try {
            C57082Lw.LIZ.LIZJ("LiveBroadcastPageEnter").postValue(null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S0000000_9 aRunnableS16S0000000_9) {
        boolean LIZ;
        try {
            C57082Lw.LIZ.LIZJ("LivePageEnter").postValue(null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S0000000_9 aRunnableS16S0000000_9) {
        MF0.LIZIZ.setDataSetChangedOnStart(false);
    }

    public static final void run$4(ARunnableS16S0000000_9 aRunnableS16S0000000_9) {
        C55374LoI.LIZIZ.LJII();
    }

    public static final void run$5(ARunnableS16S0000000_9 aRunnableS16S0000000_9) {
        IShopIconService LIZ;
        try {
            IMallServiceManager LIZIZ = MallServiceManager.LIZIZ();
            if (LIZIZ != null && (LIZ = LIZIZ.LIZ()) != null) {
                LIZ.LIZIZ();
            }
        } catch (Throwable unused) {
        }
    }
}
