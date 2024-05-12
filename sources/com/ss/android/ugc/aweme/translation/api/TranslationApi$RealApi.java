package com.ss.android.ugc.aweme.translation.api;

import X.C76L;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;

/* loaded from: classes4.dex */
public interface TranslationApi$RealApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/contents/translation/")
    C76L<MultiTranslationResult> getMultiTranslation(@InterfaceC64987Pex("trg_lang") String str, @InterfaceC64987Pex("translation_info") String str2, @InterfaceC64989Pez("scene") int i);

    @InterfaceC195787mI
    @E4T("/aweme/v1/content/translation/")
    C76L<TranslationResult> getTranslation(@InterfaceC64987Pex("content") String str, @InterfaceC64987Pex("src_lang") String str2, @InterfaceC64987Pex("trg_lang") String str3, @InterfaceC64987Pex("group_id") String str4, @InterfaceC64989Pez("scene") int i, @InterfaceC64987Pex("text_units") String str5);
}
