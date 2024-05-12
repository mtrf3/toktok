package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class EPlatformSettings {

    @InterfaceC65349Pkn("block_hint")
    public String blockHint;

    @InterfaceC65349Pkn("block_mode")
    public Integer blockMode;

    @InterfaceC65349Pkn("jump_block_list")
    public List<String> jumpBlockList = new ArrayList();

    @InterfaceC65349Pkn("jump_redirect_url")
    public String jumpRedirectUrl;

    @InterfaceC65349Pkn("lite_link")
    public String liteLink;

    @InterfaceC65349Pkn("profile_add_contact_info_text")
    public String profileAddContactInfoText;

    public String getBlockHint() {
        String str = this.blockHint;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getBlockMode() {
        Integer num = this.blockMode;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getJumpRedirectUrl() {
        String str = this.jumpRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getLiteLink() {
        String str = this.liteLink;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getProfileAddContactInfoText() {
        String str = this.profileAddContactInfoText;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public List<String> getJumpBlockList() {
        return this.jumpBlockList;
    }
}
