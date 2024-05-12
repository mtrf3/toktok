package X;

import com.bytedance.keva.Keva;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.7GT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7GT {
    public static final String LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("idle_list", null);
    public static HashSet<String> LIZIZ = null;

    public static HashSet<String> LIZ() {
        try {
            String str = LIZ;
            if (str == null) {
                return LIZIZ;
            }
            if (LIZIZ == null) {
                LIZIZ = new HashSet<>();
                LIZIZ.addAll((ArrayList) new Gson().LJI(str, ArrayList.class));
            }
            return LIZIZ;
        } catch (Exception unused) {
            return LIZIZ;
        }
    }
}
