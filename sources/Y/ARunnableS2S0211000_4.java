package Y;

import X.C70966RtC;
import X.C78946Uyc;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import kotlin.jvm.internal.AqS6S0111000_4;

/* loaded from: classes5.dex */
public class ARunnableS2S0211000_4 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void run$0(ARunnableS2S0211000_4 aRunnableS2S0211000_4) {
        boolean LIZ;
        try {
            C78946Uyc.LJJIIJ((View) aRunnableS2S0211000_4.l0, new C70966RtC(), new AqS6S0111000_4((LogisticDTO) aRunnableS2S0211000_4.l1, aRunnableS2S0211000_4.z2, aRunnableS2S0211000_4.i3, 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0211000_4 aRunnableS2S0211000_4) {
        boolean LIZ;
        try {
            C78946Uyc.LJJIIJ((View) aRunnableS2S0211000_4.l0, new C70966RtC(), new AqS6S0111000_4((LogisticDTO) aRunnableS2S0211000_4.l1, aRunnableS2S0211000_4.z2, aRunnableS2S0211000_4.i3, 3));
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0211000_4(int i, Object obj, Object obj2, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
        this.i3 = i;
    }
}
