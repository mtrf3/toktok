package com.ss.android.ugc.aweme.qna.repo;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiTranslationBody extends F9E {

    @InterfaceC65349Pkn("translation_info")
    public final List<TranslationContent> translationInfos;

    @InterfaceC65349Pkn("trg_lang")
    public final String trgLang;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.translationInfos, this.trgLang};
    }

    public MultiTranslationBody(List<TranslationContent> translationInfos, String trgLang) {
        o.LJIIIZ(translationInfos, "translationInfos");
        o.LJIIIZ(trgLang, "trgLang");
        this.translationInfos = translationInfos;
        this.trgLang = trgLang;
    }
}
