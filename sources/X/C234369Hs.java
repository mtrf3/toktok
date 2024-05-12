package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.9Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234369Hs {
    public static final String LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("legotask_kinship_downgrade", null);
    public static HashSet<String> LIZIZ = null;

    public static synchronized HashSet<String> LIZ() {
        synchronized (C234369Hs.class) {
            try {
                String str = LIZ;
                if (str == null) {
                    return LIZIZ;
                }
                if (LIZIZ == null) {
                    LIZIZ = new HashSet<>();
                    LIZIZ.addAll((ArrayList) C75792yF.LIZ(str, ArrayList.class));
                }
                return LIZIZ;
            } catch (Exception unused) {
                return LIZIZ;
            }
        }
    }
}
