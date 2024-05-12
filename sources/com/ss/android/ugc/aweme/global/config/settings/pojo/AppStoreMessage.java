package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class AppStoreMessage {

    @InterfaceC65349Pkn("section")
    public Integer section;

    @InterfaceC65349Pkn("switcher")
    public Integer switcher = 1;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("threshold")
    public Integer threshold;

    @InterfaceC65349Pkn("title")
    public String title;

    public Integer getSection() {
        Integer num = this.section;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getSwitcher() {
        Integer num = this.switcher;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getThreshold() {
        Integer num = this.threshold;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
