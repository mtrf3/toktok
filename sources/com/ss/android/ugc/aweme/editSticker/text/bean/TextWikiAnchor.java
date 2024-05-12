package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class TextWikiAnchor extends F9E {

    @InterfaceC65349Pkn("keyword")
    public final String keyword;

    @InterfaceC65349Pkn("lang")
    public final String lang;

    /* JADX WARN: Multi-variable type inference failed */
    public TextWikiAnchor() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.keyword, this.lang};
    }

    public TextWikiAnchor(String keyword, String lang) {
        o.LJIIIZ(keyword, "keyword");
        o.LJIIIZ(lang, "lang");
        this.keyword = keyword;
        this.lang = lang;
    }

    public /* synthetic */ TextWikiAnchor(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
