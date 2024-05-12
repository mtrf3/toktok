package Y;

import X.C36746EbW;
import X.C72395Sb9;
import X.SA3;
import X.X1D;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* loaded from: classes13.dex */
public class ARunnableS11S1200000_12 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invokeTime: appSwitch2 ");
        LIZ.append(System.currentTimeMillis());
        C36746EbW.LIZ(6, X1D.LIZIZ(LIZ));
        PaymentResultProcess paymentResultProcess = PaymentResultProcess.INSTANCE;
        if (!paymentResultProcess.getDeeplinkOrder().get()) {
            return;
        }
        paymentResultProcess.getDeeplinkOrder().set(false);
        PaymentResultProcess.payResultProcess$openOrderDetail(this.s0, (List) this.l1, (SA3) this.l2);
    }

    public static final void run$0(ARunnableS11S1200000_12 aRunnableS11S1200000_12) {
        boolean LIZ;
        try {
            aRunnableS11S1200000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS11S1200000_12 aRunnableS11S1200000_12) {
        boolean LIZ;
        try {
            C72395Sb9.LIZ((SmartImageView) aRunnableS11S1200000_12.l1, (MusicModel) aRunnableS11S1200000_12.l2, aRunnableS11S1200000_12.s0, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS11S1200000_12(SmartImageView smartImageView, MusicModel musicModel, int i) {
        this.$t = i;
        this.l1 = smartImageView;
        this.l2 = musicModel;
        this.s0 = "MusicItem";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS11S1200000_12(String str, String str2, List<String> list, SA3 sa3) {
        this.$t = sa3;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = list;
    }
}
