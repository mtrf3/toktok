package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.ISkylightApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LcO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54636LcO {
    public static final /* synthetic */ int LIZ = 0;

    public static StoryGetFeedByPageResponse LIZ(long j, String str, EnumC54603Lbr scene) {
        String str2;
        o.LJIIIZ(scene, "scene");
        StoryGetFeedByPageResponse storyGetFeedByPageResponse = ((ISkylightApi) E8Z.LIZ.getValue()).getStorySkylightData(j, 20L, str, scene.getValue()).execute().LIZIZ;
        o.LJIIIIZZ(storyGetFeedByPageResponse, "api.getStorySkylightData…, scene).execute().body()");
        StoryGetFeedByPageResponse storyGetFeedByPageResponse2 = storyGetFeedByPageResponse;
        List<Aweme> awemes = storyGetFeedByPageResponse2.getAwemes();
        if (awemes == null) {
            awemes = C61878OQg.INSTANCE;
        }
        InterfaceC54795Lex LJIL = C55723Ltv.LIZIZ.LJIL();
        BaseResponse.ServerTimeExtra serverTimeExtra = storyGetFeedByPageResponse2.extra;
        if (serverTimeExtra != null) {
            str2 = serverTimeExtra.logid;
        } else {
            str2 = null;
        }
        LJIL.LIZ(str2, awemes);
        L6F.LIZIZ.LIZLLL(L61.STORY, null, awemes, C54607Lbv.LJLIL);
        return storyGetFeedByPageResponse2;
    }
}
