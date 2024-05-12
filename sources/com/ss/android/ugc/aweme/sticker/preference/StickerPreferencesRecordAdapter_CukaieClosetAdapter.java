package com.ss.android.ugc.aweme.sticker.preference;

import X.HLF;
import X.HM5;

/* loaded from: classes8.dex */
public final class StickerPreferencesRecordAdapter_CukaieClosetAdapter extends HLF implements StickerPreferencesRecordAdapter {
    public StickerPreferencesRecordAdapter_CukaieClosetAdapter(HM5 hm5) {
        super(hm5);
    }

    @Override // com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter, X.InterfaceC78118UlG
    public long getAutoApplyStickerTime(long j) {
        return getStore().getLong("time_auto_apply_sticker", j);
    }

    @Override // com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter, X.InterfaceC78118UlG
    public boolean getBubbleGuideShown(boolean z) {
        return getStore().getBoolean("setting_bubble_guide_shown", z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter, X.InterfaceC78118UlG
    public boolean getStickerFirst(boolean z) {
        return getStore().getBoolean("setting_sticker_first", z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter, X.InterfaceC78118UlG
    public void setAutoApplyStickerTime(long j) {
        getStore().LIZ(j, "time_auto_apply_sticker");
    }

    @Override // com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter, X.InterfaceC78118UlG
    public void setBubbleGuideShown(boolean z) {
        getStore().LIZIZ("setting_bubble_guide_shown", z);
    }

    @Override // com.ss.android.ugc.aweme.sticker.preference.StickerPreferencesRecordAdapter, X.InterfaceC78118UlG
    public void setStickerFirst(boolean z) {
        getStore().LIZIZ("setting_sticker_first", z);
    }
}
