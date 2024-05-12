package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.List;

/* renamed from: X.Lev, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54793Lev<T> implements InterfaceC64592gB {
    public static final C54793Lev<T> LJLIL = new C54793Lev<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) obj;
        C54794Lew c54794Lew = C54794Lew.LIZ;
        List<Aweme> awemes = storyGetFeedByPageResponse.getAwemes();
        if (awemes == null) {
            awemes = C61878OQg.INSTANCE;
        }
        BaseResponse.ServerTimeExtra serverTimeExtra = storyGetFeedByPageResponse.extra;
        if (serverTimeExtra != null) {
            str = serverTimeExtra.logid;
        } else {
            str = null;
        }
        c54794Lew.LIZ(str, awemes);
        L6F.LIZIZ.LIZLLL(L61.STORY, null, storyGetFeedByPageResponse.getAwemes(), C2U7.LJLIL);
    }
}
