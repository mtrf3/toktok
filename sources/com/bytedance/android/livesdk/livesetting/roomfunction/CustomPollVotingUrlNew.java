package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C30633C0n;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_custom_poll_voting_url")
/* loaded from: classes6.dex */
public final class CustomPollVotingUrlNew {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fvoting%2Ftemplate.js&hide_loading=1&radius=8&use_spark=1&hide_nav_bar=1&silent_load_type=2&gravity=bottom&transition_animation=bottom&self_adaptive_height=1";
    public static final CustomPollVotingUrlNew INSTANCE = new CustomPollVotingUrlNew();
    public static final C5H3 url$delegate = C78996UzQ.LJJIJIIJI(C30633C0n.LJLIL);

    public final String getUrl() {
        return (String) url$delegate.getValue();
    }
}
