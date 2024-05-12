package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C221108m2;
import X.C58524My0;
import X.C5H3;
import X.ORY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.o;

@SettingsKey("live_preview_card_mpd_entrances")
/* loaded from: classes11.dex */
public final class LivePreviewMPDEntranceSetting {
    public static final LivePreviewMPDEntranceSetting INSTANCE = new LivePreviewMPDEntranceSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];
    public static final C5H3 entrances$delegate = C221108m2.LIZIZ(C58524My0.LJLIL);

    public final String[] getEntrances() {
        return (String[]) entrances$delegate.getValue();
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }

    public final boolean isContains(String entrance) {
        o.LJIIIZ(entrance, "entrance");
        return ORY.LJJIJIIJIL(entrance, getEntrances());
    }
}
