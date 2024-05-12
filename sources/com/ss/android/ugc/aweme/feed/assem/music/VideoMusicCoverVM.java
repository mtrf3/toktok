package com.ss.android.ugc.aweme.feed.assem.music;

import X.C33Q;
import X.C57223Md1;
import X.C57245MdN;
import X.LFH;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class VideoMusicCoverVM extends FeedBaseViewModel<C57223Md1> {
    public boolean LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C57223Md1(0);
    }

    public final boolean kv0() {
        if (e1.LIZ(31744, "anim_opt", true, false) || LFH.LIZIZ.LIZLLL().LJIIJ().LJI()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C57223Md1 iv0(C57223Md1 c57223Md1, VideoItemParams item) {
        boolean z;
        C57223Md1 state = c57223Md1;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        Music LIZ = C57245MdN.LIZ(item.getAweme());
        Aweme aweme = item.getAweme();
        boolean z2 = false;
        if (aweme != null && aweme.isScheduleVideo()) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme2 = item.getAweme();
        if (aweme2 != null && aweme2.isAd()) {
            z2 = true;
        }
        return C57223Md1.LIZ(state, LIZ, z2, z, false, false, false, LiveTryModeCountDownThresholdSetting.DEFAULT);
    }
}
