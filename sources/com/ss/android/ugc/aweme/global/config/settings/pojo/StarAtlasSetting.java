package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class StarAtlasSetting {

    @InterfaceC65349Pkn("star_atlas_enable")
    public Boolean starAtlasEnable;

    @InterfaceC65349Pkn("star_atlas_redirect_url")
    public String starAtlasRedirectUrl;

    @InterfaceC65349Pkn("star_atlas_url")
    public String starAtlasUrl;

    public Boolean getStarAtlasEnable() {
        Boolean bool = this.starAtlasEnable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public String getStarAtlasRedirectUrl() {
        String str = this.starAtlasRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getStarAtlasUrl() {
        String str = this.starAtlasUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
