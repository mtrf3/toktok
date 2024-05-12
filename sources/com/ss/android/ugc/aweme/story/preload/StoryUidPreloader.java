package com.ss.android.ugc.aweme.story.preload;

import X.C221018lt;
import X.C221118m3;
import X.C224068qo;
import X.C224398rL;
import X.C224408rM;
import X.C38827FLr;
import X.C55480Lq0;
import X.C5H3;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.IStoryApi;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryUidPreloader implements X8M<IStoryApi, UserStoriesResponse> {
    public static final C224408rM Companion = new Object() { // from class: X.8rM
    };
    public final C5H3 preloadScope$delegate = C221118m3.LIZ(C224398rL.LJLIL);

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final InterfaceC70422pa getPreloadScope() {
        return (InterfaceC70422pa) this.preloadScope$delegate.getValue();
    }

    @Override // X.X8M
    public C38827FLr getPreloadStrategy(Bundle bundle) {
        return new C38827FLr(0, Api.LIZ, false, 5);
    }

    @Override // X.X8M
    public boolean handleException(Exception exception) {
        o.LJIIIZ(exception, "exception");
        C221018lt.LIZJ("STORY-Preloader", "preload failed", exception);
        C55480Lq0.LIZIZ.LIZLLL(249372176, 8);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.X8M
    public UserStoriesResponse preload(Bundle bundle, InterfaceC88472Yns<? super Class<IStoryApi>, ? extends IStoryApi> create) {
        String str;
        String str2;
        List<Aweme> awemes;
        Aweme aweme;
        o.LJIIIZ(create, "create");
        if (bundle == null || (str = bundle.getString("__story_uid_preloader_require_uids")) == null) {
            str = "";
            if (bundle == null) {
                str2 = null;
                C221018lt.LIZ("STORY-Preloader", "start preload uid");
                C55480Lq0 c55480Lq0 = C55480Lq0.LIZIZ;
                c55480Lq0.LIZLLL(249372176, 7);
                IStoryApi invoke = create.invoke(IStoryApi.class);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('[');
                LIZ.append(str);
                LIZ.append(']');
                UserStoriesResponse LJ = invoke.getUserStoriesSingle(X1D.LIZIZ(LIZ), str2).LJ();
                c55480Lq0.LIZLLL(249372176, 8);
                awemes = LJ.getAwemes();
                if (awemes != null && (aweme = (Aweme) ORZ.LJLLLL(awemes)) != null) {
                    C224068qo.LIZ(aweme);
                }
                o.LJIIIIZZ(LJ, "create(IStoryApi::class.…oadFirstStory()\n        }");
                return LJ;
            }
        }
        str2 = bundle.getString("__story_uid_preloader_insert_param");
        C221018lt.LIZ("STORY-Preloader", "start preload uid");
        C55480Lq0 c55480Lq02 = C55480Lq0.LIZIZ;
        c55480Lq02.LIZLLL(249372176, 7);
        IStoryApi invoke2 = create.invoke(IStoryApi.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('[');
        LIZ2.append(str);
        LIZ2.append(']');
        UserStoriesResponse LJ2 = invoke2.getUserStoriesSingle(X1D.LIZIZ(LIZ2), str2).LJ();
        c55480Lq02.LIZLLL(249372176, 8);
        awemes = LJ2.getAwemes();
        if (awemes != null) {
            C224068qo.LIZ(aweme);
        }
        o.LJIIIIZZ(LJ2, "create(IStoryApi::class.…oadFirstStory()\n        }");
        return LJ2;
    }
}
