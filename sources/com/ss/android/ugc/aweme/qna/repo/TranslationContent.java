package com.ss.android.ugc.aweme.qna.repo;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TranslationContent extends F9E {

    @InterfaceC65349Pkn("src_content")
    public final String srcContent;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.srcContent};
    }

    public TranslationContent(String srcContent) {
        o.LJIIIZ(srcContent, "srcContent");
        this.srcContent = srcContent;
    }
}
