package com.ss.android.ugc.aweme.translation.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import X.TB9;
import com.ss.android.ugc.aweme.translation.model.DescriptionTranslationResult;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.RealtimeCaptionsTranslationResult;
import com.ss.android.ugc.aweme.translation.model.StickerTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;

/* loaded from: classes13.dex */
public final class ObservableTranslationApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(TB9.LJLIL);

    /* loaded from: classes13.dex */
    public interface ITranslationAPI {
        @E4Q("/tiktok/cla/subtitle_translation/get/v1/")
        AbstractC73672Svk<RealtimeCaptionsTranslationResult> getClaSubtitlesTranslations(@InterfaceC64989Pez("subtitle_id") long j, @InterfaceC64989Pez("target_language") String str, @InterfaceC64989Pez("item_id") String str2, @InterfaceC64989Pez("enter_from") String str3);

        @InterfaceC195787mI
        @E4T("/aweme/v1/translation/description/")
        AbstractC73672Svk<DescriptionTranslationResult> getDescriptionTranslation(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("target_lang") String str2);

        @InterfaceC195787mI
        @E4T("/aweme/v1/contents/translation/")
        AbstractC73672Svk<MultiTranslationResult> getMultipleStringTranslation(@InterfaceC64987Pex("trg_lang") String str, @InterfaceC64987Pex("translation_info") String str2, @InterfaceC64987Pex("src_lang") String str3, @InterfaceC64989Pez("scene") int i);

        @InterfaceC195787mI
        @E4T("/aweme/v1/content/translation/")
        AbstractC73672Svk<TranslationResult> getSingleStringTranslation(@InterfaceC64987Pex("content") String str, @InterfaceC64987Pex("src_lang") String str2, @InterfaceC64987Pex("trg_lang") String str3, @InterfaceC64987Pex("group_id") String str4, @InterfaceC64989Pez("scene") int i);

        @InterfaceC195787mI
        @E4T("/aweme/v1/translation/sticker/")
        AbstractC73672Svk<StickerTranslationResult> getStickerTranslations(@InterfaceC64987Pex("item_id") String str, @InterfaceC64987Pex("target_lang") String str2);
    }
}
