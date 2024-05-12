package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public class UgNewUser {

    @InterfaceC65349Pkn("active_time_limit")
    public Integer activeTimeLimit;

    @InterfaceC65349Pkn("download_time_limit")
    public Integer downloadTimeLimit;

    public Integer getActiveTimeLimit() {
        Integer num = this.activeTimeLimit;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getDownloadTimeLimit() {
        Integer num = this.downloadTimeLimit;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
