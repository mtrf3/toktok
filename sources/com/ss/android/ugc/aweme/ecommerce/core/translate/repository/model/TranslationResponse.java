package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TranslationResponse {

    @InterfaceC65349Pkn("status_code")
    public final Integer statusCode;

    @InterfaceC65349Pkn("translated_content_list")
    public final List<TranslatedContent> translatedContentList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslationResponse)) {
            return false;
        }
        TranslationResponse translationResponse = (TranslationResponse) obj;
        return o.LJ(this.statusCode, translationResponse.statusCode) && o.LJ(this.translatedContentList, translationResponse.translatedContentList);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<TranslatedContent> list = this.translatedContentList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TranslationResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", translatedContentList=");
        return C1NE.LIZIZ(LIZ, this.translatedContentList, ')', LIZ);
    }

    public TranslationResponse(Integer num, List<TranslatedContent> list) {
        this.statusCode = num;
        this.translatedContentList = list;
    }
}
