package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.3Qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83703Qg {
    public static final String LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("first_brush_downgrade_whitelist", null);
    public static HashSet<String> LIZIZ = null;

    public static HashSet<String> LIZ() {
        try {
            String str = LIZ;
            if (str == null) {
                return LIZIZ;
            }
            if (LIZIZ == null) {
                LIZIZ = new HashSet<>();
                LIZIZ.addAll((ArrayList) GsonHolder.LIZLLL().LIZ().LJI(str, ArrayList.class));
            }
            return LIZIZ;
        } catch (Exception unused) {
            return LIZIZ;
        }
    }
}
