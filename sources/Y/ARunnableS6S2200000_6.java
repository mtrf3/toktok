package Y;

import X.C38693FGn;
import android.content.Context;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS6S2200000_6 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
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

    public static final void run$0(ARunnableS6S2200000_6 aRunnableS6S2200000_6) {
        boolean LIZ;
        try {
            C38693FGn.LIZJ((Context) aRunnableS6S2200000_6.l2, aRunnableS6S2200000_6.s0).edit().putString(aRunnableS6S2200000_6.s1, ((JSONObject) aRunnableS6S2200000_6.l3).toString()).apply();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S2200000_6 aRunnableS6S2200000_6) {
        boolean LIZ;
        try {
            C38693FGn.LIZJ((Context) aRunnableS6S2200000_6.l2, aRunnableS6S2200000_6.s0).edit().putStringSet(aRunnableS6S2200000_6.s1, (Set) aRunnableS6S2200000_6.l3).apply();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS6S2200000_6(Context context, JSONObject jSONObject, int i) {
        this.$t = i;
        this.l2 = context;
        this.s0 = "SP_EXPERIMENT_CACHE";
        this.s1 = "SP_EXPERIMENT_CACHE";
        this.l3 = jSONObject;
    }

    public ARunnableS6S2200000_6(Context context, String str, Set set, int i) {
        this.$t = i;
        this.l2 = context;
        this.s0 = "SP_EXPERIMENT_CACHE";
        this.s1 = str;
        this.l3 = set;
    }
}
