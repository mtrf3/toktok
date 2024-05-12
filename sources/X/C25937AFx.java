package X;

import Y.ARunnableS11S0000000_4;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AFx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25937AFx {
    public static boolean LIZ;
    public static final Object LIZIZ = new Object();
    public static final List<String> LIZJ = new ArrayList();

    public static boolean LIZIZ(String str) {
        List<String> list = LIZJ;
        if (list == null || ((ArrayList) list).size() == 0 || TextUtils.isEmpty(str) || !((ArrayList) list).contains(str)) {
            return false;
        }
        return true;
    }

    public static void LIZ(Activity activity, int i) {
        synchronized (LIZIZ) {
            if (LIZ) {
                C9QH.LIZIZ = Boolean.TRUE;
                return;
            }
            try {
                if (C16880lQ.LLJJJJ() != Looper.myLooper()) {
                    new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS11S0000000_4(6));
                } else {
                    C36546EVy.LIZ();
                    C36505EUj.LIZIZ();
                }
                LIZ = true;
                C9QH.LIZ(i);
                C9QH.LIZIZ = Boolean.TRUE;
                activity.getApplication().registerActivityLifecycleCallbacks(new C25938AFy());
            } catch (Exception unused) {
            }
        }
    }
}
