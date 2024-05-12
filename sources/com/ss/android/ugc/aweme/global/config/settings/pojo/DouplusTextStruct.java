package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class DouplusTextStruct {

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public Integer type;

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getType() {
        Integer num = this.type;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
