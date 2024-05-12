package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class BioSettings {

    @InterfaceC65349Pkn("enable_bio_email")
    public Boolean enableBioEmail;

    @InterfaceC65349Pkn("enable_bio_url")
    public Boolean enableBioUrl;

    public Boolean getEnableBioEmail() {
        Boolean bool = this.enableBioEmail;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getEnableBioUrl() {
        Boolean bool = this.enableBioUrl;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }
}
