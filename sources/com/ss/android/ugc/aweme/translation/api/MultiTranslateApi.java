package com.ss.android.ugc.aweme.translation.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;

/* loaded from: classes2.dex */
public interface MultiTranslateApi {
    @InterfaceC195787mI
    @E4T("/aweme/v1/contents/translation/")
    AbstractC73672Svk<MultiTranslationResult> getMultiTranslation(@InterfaceC64987Pex("trg_lang") String str, @InterfaceC64987Pex("translation_info") String str2, @InterfaceC64987Pex("src_lang") String str3, @InterfaceC64989Pez("scene") int i);
}
