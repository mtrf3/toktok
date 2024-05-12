package Y;

import X.AbstractC90599Zh5;
import X.C90089ZXh;
import X.C90459Zep;
import X.C90552ZgK;
import X.C90817Zkb;
import X.C90855ZlD;
import X.InterfaceC90093ZXl;
import android.content.Context;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import java.util.Collection;

/* loaded from: classes29.dex */
public class IDRunnableS2S0400000_24 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
                run$3(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDRunnableS2S0400000_24 iDRunnableS2S0400000_24) {
        boolean LIZ;
        try {
            ((InterfaceC90093ZXl) iDRunnableS2S0400000_24.l0).LIZ((AbstractC90599Zh5) iDRunnableS2S0400000_24.l3, (C90089ZXh) iDRunnableS2S0400000_24.l1, (Collection) iDRunnableS2S0400000_24.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS2S0400000_24 iDRunnableS2S0400000_24) {
        boolean LIZ;
        try {
            ((InterfaceC90093ZXl) iDRunnableS2S0400000_24.l0).LIZ((AbstractC90599Zh5) iDRunnableS2S0400000_24.l3, (C90089ZXh) iDRunnableS2S0400000_24.l1, (Collection) iDRunnableS2S0400000_24.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS2S0400000_24 iDRunnableS2S0400000_24) {
        C90459Zep c90459Zep = (C90459Zep) iDRunnableS2S0400000_24.l0;
        Context context = (Context) iDRunnableS2S0400000_24.l1;
        Config config = (Config) iDRunnableS2S0400000_24.l2;
        c90459Zep.LIZ.LIZLLL(context, config, new C90817Zkb(c90459Zep, config, (IInitListener) iDRunnableS2S0400000_24.l3), false);
    }

    public static final void run$3(IDRunnableS2S0400000_24 iDRunnableS2S0400000_24) {
        C90552ZgK c90552ZgK = (C90552ZgK) iDRunnableS2S0400000_24.l0;
        Context context = (Context) iDRunnableS2S0400000_24.l1;
        Config config = (Config) iDRunnableS2S0400000_24.l2;
        c90552ZgK.LIZ.LJII(context, config, new C90855ZlD(config, (IInitListener) iDRunnableS2S0400000_24.l3), false);
    }

    public IDRunnableS2S0400000_24(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj4;
    }
}
