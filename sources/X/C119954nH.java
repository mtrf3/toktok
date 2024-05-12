package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119954nH {
    public static final ConcurrentHashMap<Long, Long> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String aid, Aweme aweme, String str) {
        HashMap hashMap;
        o.LJIIIZ(aid, "aid");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        if (!C48203Ivv.LJ(LJIIIIZZ)) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.img);
            return;
        }
        if (aweme != null) {
            StoryServiceImpl.LJJI().LJIJJLI(aweme, aid);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(LJIIIIZZ, "aweme://story/detail");
        buildRoute.withParam("video_from", "STORY_ENTRANCE_DEFAULT");
        buildRoute.withParam("enter_from", "chat");
        buildRoute.withParam("id", aid);
        if (str != null) {
            hashMap = C113554cx.LJJJLZIJ(new OSZ("story_extra_author_uid", str));
        } else {
            hashMap = null;
        }
        buildRoute.withParam("feed_param_extra", hashMap);
        buildRoute.open();
    }
}
