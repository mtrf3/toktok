package Y;

import X.C16880lQ;
import X.C63867P4t;
import X.C64017PAn;
import X.C66859QLv;
import android.content.Context;
import android.net.Uri;
import com.bytedance.push.settings.storage.PushProvider;

/* loaded from: classes12.dex */
public class ARunnableS1S3100000_11 implements Runnable {
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

    public static final void run$0(ARunnableS1S3100000_11 aRunnableS1S3100000_11) {
        boolean LIZ;
        try {
            Uri LIZ2 = PushProvider.LIZ((Context) aRunnableS1S3100000_11.l3, new C66859QLv(aRunnableS1S3100000_11.s0, aRunnableS1S3100000_11.s1, "val", aRunnableS1S3100000_11.s2));
            if (LIZ2 != null) {
                try {
                    ((Context) aRunnableS1S3100000_11.l3).getContentResolver().notifyChange(LIZ2, null);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S3100000_11 aRunnableS1S3100000_11) {
        boolean LIZ;
        try {
            Object obj = C63867P4t.LIZJ;
            synchronized (obj) {
                C64017PAn.LIZIZ((Context) aRunnableS1S3100000_11.l3, aRunnableS1S3100000_11.s0, aRunnableS1S3100000_11.s1, aRunnableS1S3100000_11.s2);
                C63867P4t.LIZIZ = true;
                obj.notifyAll();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S3100000_11(Context context, String str, int i) {
        this.$t = i;
        this.l3 = context;
        this.s0 = str;
        this.s1 = null;
        this.s2 = null;
    }

    public ARunnableS1S3100000_11(Context context, String str, String str2, String str3, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = context;
    }
}
