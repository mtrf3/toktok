package X;

import android.os.Build;
import android.os.Process;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class F8E {
    public static boolean LIZ;

    public static void LIZ(AwemeHostApplication awemeHostApplication) {
        C56662Kg.LIZ().LIZJ("method_init_godzilla", false);
        F8F f8f = new F8F(awemeHostApplication);
        f8f.LIZ(new F8S());
        if (!((Boolean) C88074YhS.LIZLLL.getValue()).booleanValue()) {
            f8f.LIZ(new F8N());
        }
        f8f.LIZ(new F8I());
        f8f.LIZ(new F8J());
        f8f.LIZ(new C36873EdZ());
        f8f.LIZ(new F8K());
        f8f.LIZ(new F8H());
        f8f.LIZ(new F8R());
        f8f.LIZ(new F8L());
        f8f.LIZ(new C39222FaM());
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("cursor_window_shrink", false)) {
            f8f.LIZ(new C36724EbA());
        }
        C56662Kg.LIZ().LIZJ("method_godzilla_pthread", false);
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("thread_stack_opt", true) && (Build.VERSION.SDK_INT < 23 || !Process.is64Bit())) {
            f8f.LIZ(new C38478F8g());
        }
        C56662Kg.LIZ().LJFF("method_godzilla_pthread", false);
        F8G f8g = new F8G(f8f.LIZ, f8f.LIZIZ, null);
        synchronized (F8G.class) {
            if (F8G.LIZJ == null) {
                F8G.LIZJ = f8g;
            } else {
                F8X.LIZ();
            }
        }
        F8G f8g2 = F8G.LIZJ;
        f8g2.getClass();
        f8g2.LIZ(F88.IMMEDIATE);
        LIZ = true;
        C56662Kg.LIZ().LJFF("method_init_godzilla", false);
    }
}
