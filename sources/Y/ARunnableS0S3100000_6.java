package Y;

import X.C35692Dzc;
import X.C38693FGn;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import ujb.o;

/* loaded from: classes7.dex */
public class ARunnableS0S3100000_6 implements Runnable {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

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
        Map<String, String> map = C35692Dzc.LIZLLL;
        if (map.containsKey(this.s0) && o.LJJJJIZL(map.get(this.s0), this.s1, false)) {
            ((C35692Dzc) this.l3).LIZIZ.put(this.s0, Boolean.TRUE);
        }
        if (!kotlin.jvm.internal.o.LJ(((C35692Dzc) this.l3).LIZIZ.get(this.s0), Boolean.TRUE)) {
            return;
        }
        if (!((C35692Dzc) this.l3).LIZ.containsKey(this.s0) || ((C35692Dzc) this.l3).LIZ.get(this.s0) == null) {
            ((C35692Dzc) this.l3).LIZ.put(this.s0, new HashMap<>());
        }
        HashMap<String, String> hashMap = ((C35692Dzc) this.l3).LIZ.get(this.s0);
        if (hashMap != null) {
            hashMap.put(this.s1, this.s2);
        }
    }

    public final void LIZ$1() {
        if (this.s0 == null) {
            C38693FGn.LIZJ((Context) this.l3, this.s1).edit().remove(this.s2).apply();
        } else {
            C38693FGn.LIZJ((Context) this.l3, this.s1).edit().putString(this.s2, this.s0).apply();
        }
    }

    public static final void run$0(ARunnableS0S3100000_6 aRunnableS0S3100000_6) {
        boolean LIZ;
        try {
            aRunnableS0S3100000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S3100000_6 aRunnableS0S3100000_6) {
        boolean LIZ;
        try {
            aRunnableS0S3100000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S3100000_6(String str, C35692Dzc c35692Dzc, String str2, int i) {
        this.$t = i;
        this.s0 = "push_cold_start";
        this.s1 = str;
        this.l3 = c35692Dzc;
        this.s2 = str2;
    }

    public ARunnableS0S3100000_6(Context context, String str, String str2, String str3, int i) {
        this.$t = i;
        this.s0 = str;
        this.l3 = context;
        this.s1 = str2;
        this.s2 = str3;
    }
}
