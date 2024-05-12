package com.ss.android.ugc.aweme.translation.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* loaded from: classes5.dex */
public class TranslationResult extends BaseResponse {

    @InterfaceC65349Pkn("src_content")
    public String srcContent;

    @InterfaceC65349Pkn("src_lang")
    public String srcLang;

    @InterfaceC65349Pkn("text_units")
    public List<Object> textUnits;

    @InterfaceC65349Pkn("translated_content")
    public String translatedContent;

    @InterfaceC65349Pkn("translation_status_code")
    public int translationStatusCode;
}
