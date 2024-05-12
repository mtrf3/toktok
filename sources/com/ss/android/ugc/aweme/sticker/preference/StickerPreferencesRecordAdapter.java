package com.ss.android.ugc.aweme.sticker.preference;

import X.HM6;
import X.HM7;
import X.HM8;
import X.InterfaceC78118UlG;

@HM6("av_settings.xml")
/* loaded from: classes8.dex */
public interface StickerPreferencesRecordAdapter extends InterfaceC78118UlG {
    @Override // X.InterfaceC78118UlG
    @HM8("time_auto_apply_sticker")
    long getAutoApplyStickerTime(long j);

    @Override // X.InterfaceC78118UlG
    @HM8("setting_bubble_guide_shown")
    boolean getBubbleGuideShown(boolean z);

    @Override // X.InterfaceC78118UlG
    @HM8("setting_sticker_first")
    boolean getStickerFirst(boolean z);

    @Override // X.InterfaceC78118UlG
    @HM7("time_auto_apply_sticker")
    void setAutoApplyStickerTime(long j);

    @Override // X.InterfaceC78118UlG
    @HM7("setting_bubble_guide_shown")
    void setBubbleGuideShown(boolean z);

    @Override // X.InterfaceC78118UlG
    @HM7("setting_sticker_first")
    void setStickerFirst(boolean z);
}
