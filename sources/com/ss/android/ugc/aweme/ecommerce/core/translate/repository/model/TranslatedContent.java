package com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TranslatedContent {

    @InterfaceC65349Pkn("src_content")
    public final String srcContent;

    @InterfaceC65349Pkn("translated_content")
    public final String translatedContent;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslatedContent)) {
            return false;
        }
        TranslatedContent translatedContent = (TranslatedContent) obj;
        return o.LJ(this.srcContent, translatedContent.srcContent) && o.LJ(this.translatedContent, translatedContent.translatedContent);
    }

    public final int hashCode() {
        String str = this.srcContent;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.translatedContent;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TranslatedContent(srcContent=");
        LIZ.append(this.srcContent);
        LIZ.append(", translatedContent=");
        return q.LIZIZ(LIZ, this.translatedContent, ')', LIZ);
    }

    public TranslatedContent(String str, String str2) {
        this.srcContent = str;
        this.translatedContent = str2;
    }
}
