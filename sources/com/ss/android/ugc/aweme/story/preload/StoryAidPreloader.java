package com.ss.android.ugc.aweme.story.preload;

import X.AbstractC73672Svk;
import X.C221018lt;
import X.C224068qo;
import X.C224428rO;
import X.C38827FLr;
import X.C55480Lq0;
import X.C73506St4;
import X.C78920UyC;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X8M;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.IStoryApi;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryAidPreloader implements X8M<IStoryApi, BatchDetailList> {
    public static final C224428rO Companion = new Object() { // from class: X.8rO
    };

    @Override // X.X8D
    public boolean enable(Bundle bundle) {
        return true;
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
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.X8M
    public BatchDetailList preload(Bundle bundle, InterfaceC88472Yns<? super Class<IStoryApi>, ? extends IStoryApi> create) {
        String str;
        String str2;
        Aweme aweme;
        o.LJIIIZ(create, "create");
        String str3 = null;
        if (bundle != null) {
            str = bundle.getString("__story_aid_preloader_aid");
            str2 = bundle.getString("__story_aid_preloader_type");
            str3 = bundle.getString("__story_aid_preloader_push_params");
        } else {
            str = null;
            str2 = null;
        }
        C221018lt.LIZ("STORY-Preloader", "start preload aid");
        C55480Lq0 c55480Lq0 = C55480Lq0.LIZIZ;
        c55480Lq0.LIZLLL(249372176, 7);
        AbstractC73672Svk<BatchDetailList> queryBatchAwemeRx = create.invoke(IStoryApi.class).queryBatchAwemeRx(C78920UyC.LIZ('[', str, ']'), str2, str3, 1);
        queryBatchAwemeRx.getClass();
        T LIZLLL = new C73506St4(queryBatchAwemeRx).LIZLLL();
        if (LIZLLL != 0) {
            BatchDetailList batchDetailList = (BatchDetailList) LIZLLL;
            c55480Lq0.LIZLLL(249372176, 8);
            List<Aweme> list = batchDetailList.items;
            if (list != null && (aweme = (Aweme) ORZ.LJLLLL(list)) != null) {
                C224068qo.LIZ(aweme);
            }
            return batchDetailList;
        }
        throw new NoSuchElementException();
    }
}
