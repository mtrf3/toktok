package X;

import com.ss.android.ugc.aweme.feed.count.FeedPlayNumModel;
import com.ss.android.ugc.aweme.feed.count.UserPlayNum;
import java.util.Calendar;

/* loaded from: classes9.dex */
public final class JCH {
    public static UserPlayNum LIZ(String str) {
        return new UserPlayNum(str, new FeedPlayNumModel(0, 0, 0, 0, 0, 0, 0L, Calendar.getInstance().get(6)));
    }
}
