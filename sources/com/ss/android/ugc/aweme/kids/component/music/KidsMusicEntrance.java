package com.ss.android.ugc.aweme.kids.component.music;

import X.C16880lQ;
import X.SFS;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KidsMusicEntrance implements IKidsMusicEntrance {
    @Override // com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance
    public final void LIZ(Fragment fragment, int i, String title, int i2, Object obj, boolean z, boolean z2, Bundle bundle, String shootWay, String creationId, boolean z3, boolean z4) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(creationId, "creationId");
        MusicModel musicModel = (MusicModel) obj;
        if (i2 == 2) {
            SFS.LJLJJI = "video_shoot_page";
        } else {
            SFS.LJLJJI = "video_edit_page";
        }
        String string = fragment.getString(R.string.cqe);
        SmartRoute buildRoute = SmartRouter.buildRoute(fragment.getContext(), "//choosemusic/kids/home");
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        AVChallenge curChallenge = AVExternalServiceImpl.LIZ().publishService().getCurChallenge();
        if (curChallenge != null) {
            buildRoute.withParam("challenge", curChallenge.cid);
        }
        buildRoute.withParam("title", string);
        buildRoute.withParam("music_model", musicModel);
        buildRoute.withParam("music_allow_clear", z);
        buildRoute.withParam("music_is_photomv", z2);
        buildRoute.withParam("creation_id", creationId);
        buildRoute.withParam("shoot_way", shootWay);
        buildRoute.withParam("hide_local_music", z4);
        buildRoute.withParam("extra_beat_music_sticker", z3);
        if (bundle != null) {
            buildRoute.withParam("arguments", bundle);
        }
        C16880lQ.LJII(fragment, buildRoute.buildIntent(), i);
    }
}
