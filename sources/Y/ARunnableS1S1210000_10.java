package Y;

import X.C38995FSd;
import X.OL1;
import X.OL2;
import X.OL3;
import X.OL5;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public class ARunnableS1S1210000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int i;
        VSAProductCardsResponse.ProductCard productCard;
        Integer delayCloseTime;
        Aweme LIZ = OL3.LIZ((Aweme) this.l1, this.s0);
        if (LIZ == null) {
            return;
        }
        if (!this.z3) {
            OL5 LIZIZ = OL1.LIZIZ(LIZ);
            ScheduledFuture<?> scheduledFuture = null;
            if (LIZIZ != null && (productCard = LIZIZ.LJFF) != null && (delayCloseTime = productCard.getDelayCloseTime()) != null && delayCloseTime.intValue() >= 0) {
                i = delayCloseTime.intValue();
            } else {
                i = 5;
            }
            try {
                scheduledFuture = C38995FSd.LJ().schedule(new ARunnableS29S0200000_10((Context) this.l2, LIZ, 50), i * 1000, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
            OL3.LJI = scheduledFuture;
            return;
        }
        OL2.LIZIZ((Context) this.l2, LIZ, false, false);
    }

    public static final void run$0(ARunnableS1S1210000_10 aRunnableS1S1210000_10) {
        boolean LIZ;
        try {
            Aweme LIZ2 = OL3.LIZ((Aweme) aRunnableS1S1210000_10.l1, aRunnableS1S1210000_10.s0);
            if (LIZ2 != null) {
                OL3.LIZJ = aRunnableS1S1210000_10.z3;
                if (aRunnableS1S1210000_10.z3) {
                    OL2.LIZIZ((Context) aRunnableS1S1210000_10.l2, LIZ2, false, false);
                } else {
                    OL3.LJIIIIZZ((Context) aRunnableS1S1210000_10.l2, LIZ2);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1210000_10 aRunnableS1S1210000_10) {
        boolean LIZ;
        try {
            aRunnableS1S1210000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1210000_10(Context context, Aweme aweme, String str, boolean z, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = aweme;
        this.z3 = z;
        this.l2 = context;
    }
}
