package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TemplateRecommendInputParam extends F9E {

    @InterfaceC65349Pkn("key_summarize")
    public final String keySummarize;

    @InterfaceC65349Pkn("title")
    public final String title;

    public static /* synthetic */ TemplateRecommendInputParam copy$default(TemplateRecommendInputParam templateRecommendInputParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateRecommendInputParam.keySummarize;
        }
        if ((i & 2) != 0) {
            str2 = templateRecommendInputParam.title;
        }
        return templateRecommendInputParam.copy(str, str2);
    }

    public final TemplateRecommendInputParam copy(String keySummarize, String title) {
        o.LJIIIZ(keySummarize, "keySummarize");
        o.LJIIIZ(title, "title");
        return new TemplateRecommendInputParam(keySummarize, title);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.keySummarize, this.title};
    }

    public final String getKeySummarize() {
        return this.keySummarize;
    }

    public final String getTitle() {
        return this.title;
    }

    public TemplateRecommendInputParam(String keySummarize, String title) {
        o.LJIIIZ(keySummarize, "keySummarize");
        o.LJIIIZ(title, "title");
        this.keySummarize = keySummarize;
        this.title = title;
    }
}
