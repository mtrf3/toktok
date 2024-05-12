package com.ss.android.ugc.aweme.translation.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;

/* loaded from: classes13.dex */
public final class RealtimeCaptionsTranslationApi {
    public static IRealtimeTranslationApi LIZ;

    /* loaded from: classes13.dex */
    public interface IRealtimeTranslationApi {
        @E8L("/tiktok/cla/subtitle_translation/get/v1/")
        AbstractC73672Svk<RealtimeCaptionsTranslationResult> getRealtimeSubtitles(@InterfaceC64986Pew("subtitle_id") long j, @InterfaceC64986Pew("target_language") String str, @InterfaceC64986Pew("item_id") String str2, @InterfaceC64986Pew("enter_from") String str3);
    }
}
