package X;

import Y.ARunnableS5S0200100_8;
import android.os.Handler;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2NF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NF {
    public static volatile C2NF LJFF;
    public final Handler LIZ = new Handler(C16880lQ.LLJJJJ());
    public Aweme LIZIZ;
    public int LIZJ;
    public Runnable LIZLLL;
    public ARunnableS5S0200100_8 LJ;

    public static C2NF LIZ() {
        if (LJFF == null) {
            synchronized (C2NF.class) {
                if (LJFF == null) {
                    LJFF = new C2NF();
                }
            }
        }
        return LJFF;
    }
}
