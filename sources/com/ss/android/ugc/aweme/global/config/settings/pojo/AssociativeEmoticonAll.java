package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class AssociativeEmoticonAll {

    @InterfaceC65349Pkn("show")
    public Integer show;

    @InterfaceC65349Pkn("sourceMessage")
    public String sourceMessage;

    public Integer getShow() {
        return this.show;
    }

    public String getSourceMessage() {
        return this.sourceMessage;
    }

    public AssociativeEmoticonAll(Integer num, String str) {
        this.show = num;
        this.sourceMessage = str;
    }
}
