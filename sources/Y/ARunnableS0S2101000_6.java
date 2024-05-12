package Y;

import X.C37477EnJ;
import X.C37613EpV;
import X.C38693FGn;
import X.EnumC37476EnI;
import android.content.Context;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class ARunnableS0S2101000_6 implements Runnable {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

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

    public static final void run$0(ARunnableS0S2101000_6 aRunnableS0S2101000_6) {
        boolean LIZ;
        try {
            C38693FGn.LIZJ((Context) aRunnableS0S2101000_6.l2, aRunnableS0S2101000_6.s0).edit().putInt(aRunnableS0S2101000_6.s1, aRunnableS0S2101000_6.i3).apply();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2101000_6 aRunnableS0S2101000_6) {
        C37477EnJ c37477EnJ = (C37477EnJ) aRunnableS0S2101000_6.l2;
        String str = aRunnableS0S2101000_6.s0;
        int i = aRunnableS0S2101000_6.i3;
        String str2 = aRunnableS0S2101000_6.s1;
        c37477EnJ.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("error_from", "client");
        hashMap.put("error_type", str);
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("error_detail", str2);
        hashMap.put("url", c37477EnJ.LIZ);
        hashMap.put("pia_sdk_version", "2.3.0");
        C37613EpV.LIZJ(new ARunnableS10S0400000_6(c37477EnJ, EnumC37476EnI.EXCEPTION, hashMap, 10));
    }

    public ARunnableS0S2101000_6(Context context, int i, String str, int i2) {
        this.$t = i2;
        this.l2 = context;
        this.s0 = "CLIENT_EXPERIMENT_CACHE_TAG";
        this.s1 = str;
        this.i3 = i;
    }

    public ARunnableS0S2101000_6(C37477EnJ c37477EnJ, String str, int i, String str2, int i2) {
        this.$t = i2;
        this.l2 = c37477EnJ;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
    }
}
