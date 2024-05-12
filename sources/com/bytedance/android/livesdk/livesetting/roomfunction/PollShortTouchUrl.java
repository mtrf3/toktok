package com.bytedance.android.livesdk.livesetting.roomfunction;

import X.C30643C0x;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_custom_poll_short_touch_url")
/* loaded from: classes6.dex */
public final class PollShortTouchUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_poll%2Fpoll%2Fpages%2Fcustom-poll%2Fshort-touch%2Ftemplate.js";
    public static final PollShortTouchUrl INSTANCE = new PollShortTouchUrl();
    public static final C5H3 url$delegate = C78996UzQ.LJJIJIIJI(C30643C0x.LJLIL);

    public final String getUrl() {
        return (String) url$delegate.getValue();
    }
}
