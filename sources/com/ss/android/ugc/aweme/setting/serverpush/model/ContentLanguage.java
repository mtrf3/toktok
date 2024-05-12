package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ContentLanguage implements Serializable {

    @InterfaceC65349Pkn("en_name")
    public String englishName;

    @InterfaceC65349Pkn("code")
    public String languageCode;

    @InterfaceC65349Pkn("local_name")
    public String localName;

    public String getEnglishName() {
        return this.englishName;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public String getLocalName() {
        return this.localName;
    }

    public void setEnglishName(String str) {
        this.englishName = str;
    }

    public void setLanguageCode(String str) {
        this.languageCode = str;
    }

    public void setLocalName(String str) {
        this.localName = str;
    }
}
