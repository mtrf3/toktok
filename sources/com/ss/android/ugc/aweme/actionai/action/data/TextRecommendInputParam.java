package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TextRecommendInputParam extends F9E {

    @InterfaceC65349Pkn("text_count")
    public final int count;

    @InterfaceC65349Pkn("key_summarize")
    public final String inputSummarize;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("title")
    public final String title;

    public static /* synthetic */ TextRecommendInputParam copy$default(TextRecommendInputParam textRecommendInputParam, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = textRecommendInputParam.inputSummarize;
        }
        if ((i2 & 2) != 0) {
            str2 = textRecommendInputParam.text;
        }
        if ((i2 & 4) != 0) {
            str3 = textRecommendInputParam.title;
        }
        if ((i2 & 8) != 0) {
            i = textRecommendInputParam.count;
        }
        return textRecommendInputParam.copy(str, str2, str3, i);
    }

    public final TextRecommendInputParam copy(String inputSummarize, String text, String title, int i) {
        o.LJIIIZ(inputSummarize, "inputSummarize");
        o.LJIIIZ(text, "text");
        o.LJIIIZ(title, "title");
        return new TextRecommendInputParam(inputSummarize, text, title, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.inputSummarize, this.text, this.title, Integer.valueOf(this.count)};
    }

    public final int getCount() {
        return this.count;
    }

    public final String getInputSummarize() {
        return this.inputSummarize;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public TextRecommendInputParam(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "inputSummarize", str2, "text", str3, "title");
        this.inputSummarize = str;
        this.text = str2;
        this.title = str3;
        this.count = i;
    }
}
