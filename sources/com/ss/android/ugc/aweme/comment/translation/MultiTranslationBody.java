package com.ss.android.ugc.aweme.comment.translation;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MultiTranslationBody {

    @InterfaceC65349Pkn("translation_info")
    public List<TranslationContent> translationInfos = new ArrayList();

    @InterfaceC65349Pkn("trg_lang")
    public String trgLang;

    /* loaded from: classes4.dex */
    public class TranslationContent {

        @InterfaceC65349Pkn("src_content")
        public String srcContent;

        public TranslationContent(MultiTranslationBody multiTranslationBody, String str) {
            this.srcContent = str;
        }
    }
}
