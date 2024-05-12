package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class LYD {
    public static final LYD LIZ = new LYD();
    public static Aweme LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public static Aweme LIZ() {
        Aweme aweme = new Aweme();
        User LIZIZ2 = AV1.LIZIZ();
        String uid = LIZIZ2.getUid();
        if (uid == null) {
            uid = "";
        }
        aweme.setAid(uid);
        aweme.setAuthor(LIZIZ2);
        aweme.setAwemeType(40);
        long j = 0;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        aweme.setUserStory(new UserStory(new ArrayList(), j, j, false, j, j, objArr, objArr2, j, objArr3, null, objArr4, j, 0 == true ? 1 : 0, true, objArr5, 0 == true ? 1 : 0, objArr6, objArr7, 507900, 0 == true ? 1 : 0));
        aweme.setIsTikTokStory(true);
        return aweme;
    }
}
