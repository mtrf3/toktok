package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public abstract class OW3 {
    public Aweme LIZ;
    public Activity LIZIZ;
    public ProgressDialogC43241Gy5 LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public int LJIIIIZZ;
    public final Handler LJIIIZ = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS46S0100000_10 LJIIJ = new ARunnableS46S0100000_10(this, 99);

    public final void LIZ() {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LIZJ;
        if (progressDialogC43241Gy5 != null) {
            try {
                progressDialogC43241Gy5.dismiss();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            this.LIZJ = null;
        }
    }

    public OW3(Activity activity) {
        this.LIZIZ = activity;
    }
}
