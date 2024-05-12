package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api;

import X.C74842wi;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationImage;
import com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationResponse;

/* loaded from: classes2.dex */
public interface TranslationApi {
    public static final C74842wi LIZ = C74842wi.LIZ;

    @E8M("/aweme/v1/contents/translation/")
    @InterfaceC195757mF
    Object getTranslation(@InterfaceC64985Pev("trg_lang") String str, @InterfaceC64985Pev("translation_info") String str2, @InterfaceC64986Pew("scene") int i, InterfaceC67352kd<? super TranslationResponse> interfaceC67352kd);

    @E8M("/api/v1/image/ocr_trans")
    Object ocrTranslation(@InterfaceC195727mC TranslationImage translationImage, InterfaceC67352kd<Object> interfaceC67352kd);
}
