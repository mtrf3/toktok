package X;

import android.content.Context;
import com.bytedance.keva.Keva;

/* loaded from: classes7.dex */
public final class EG5 {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final Object LIZJ = new Object();

    public static final void LIZ(Context context) {
        boolean z;
        if (!LIZIZ && context != null) {
            synchronized (LIZJ) {
                if (!LIZIZ) {
                    String LIZ2 = C36839Ed1.LIZ(context);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("keva_new_user_repo_");
                    LIZ3.append(LIZ2);
                    Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ3));
                    if (repo.getBoolean("is_new_user", true)) {
                        C56662Kg.LIZ().getClass();
                        if (FAM.LJIIIZ()) {
                            z = true;
                            LIZ = z;
                            LIZIZ = true;
                            repo.storeBoolean("is_new_user", false);
                        }
                    }
                    z = false;
                    LIZ = z;
                    LIZIZ = true;
                    repo.storeBoolean("is_new_user", false);
                }
            }
        }
    }
}
