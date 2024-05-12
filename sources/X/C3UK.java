package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.3UK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UK {
    public static HashSet<String> LIZ;
    public static final String LIZIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("real_idle_list", null);

    public static HashSet<String> LIZ() {
        try {
            String str = LIZIZ;
            if (str == null) {
                return LIZ;
            }
            if (LIZ == null) {
                LIZ = new HashSet<>();
                LIZ.addAll((ArrayList) new Gson().LJI(str, ArrayList.class));
            }
            return LIZ;
        } catch (Exception unused) {
            return LIZ;
        }
    }
}
