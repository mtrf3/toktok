package com.ss.android.ugc.aweme.question.translation;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class QuestionTranslationBody {

    @InterfaceC65349Pkn("translation_info")
    public List<TranslationContent> translationInfo = new ArrayList();

    @InterfaceC65349Pkn("trg_lang")
    public String trgLang;

    /* loaded from: classes4.dex */
    public final class TranslationContent {

        @InterfaceC65349Pkn("src_content")
        public String srcContent;

        public TranslationContent(QuestionTranslationBody questionTranslationBody, String srcContent) {
            o.LJIIIZ(srcContent, "srcContent");
            this.srcContent = srcContent;
        }
    }
}
