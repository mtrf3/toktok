package com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class LanguageDetail extends F9E {

    @InterfaceC65349Pkn("app_lang_code")
    public final String appLangCode;

    @InterfaceC65349Pkn("code")
    public final String code;

    @InterfaceC65349Pkn("localName")
    public final String localName;

    @InterfaceC65349Pkn("max_line_length")
    public final int maxLineLength;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.code, this.appLangCode, this.localName, Integer.valueOf(this.maxLineLength)};
    }

    public LanguageDetail(String str, String str2, String str3, int i) {
        HH1.LIZ(str, "code", str2, "appLangCode", str3, "localName");
        this.code = str;
        this.appLangCode = str2;
        this.localName = str3;
        this.maxLineLength = i;
    }
}
