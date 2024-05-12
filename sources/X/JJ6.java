package X;

import android.app.Activity;
import android.os.Handler;

/* loaded from: classes9.dex */
public class JJ6 implements JJ5 {
    public final Handler LIZ;
    public boolean LIZIZ;
    public final Activity LIZJ;

    public JJ6() {
        this.LIZ = new Handler(C16880lQ.LLJJJJ());
        this.LIZIZ = false;
        this.LIZJ = null;
    }

    public JJ6(Activity activity) {
        this.LIZ = new Handler(C16880lQ.LLJJJJ());
        this.LIZIZ = false;
        this.LIZJ = null;
        this.LIZJ = activity;
    }
}
