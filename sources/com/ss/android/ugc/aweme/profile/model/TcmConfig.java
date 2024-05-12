package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes8.dex */
public final class TcmConfig implements Serializable {

    @InterfaceC65349Pkn("bc_schema_after_post")
    public final String bcSchemaAfterPost;

    @InterfaceC65349Pkn("bc_schema_in_post")
    public final String bcSchemaInPost;

    @InterfaceC65349Pkn("bc_usage_confirm_threshold")
    public final BcUsageConfirmThreshold bcUsageConfirmThreshold;

    @InterfaceC65349Pkn("can_use_tcm_console")
    public final boolean canUseTcmConsole;

    @InterfaceC65349Pkn("check_ba_before_post")
    public final boolean checkBABeforePost;

    @InterfaceC65349Pkn("bc_hashtag_list")
    public final List<String> hashtagList;

    @InterfaceC65349Pkn("is_branded_content_creator")
    public final boolean isBrandedContentCreator;

    @InterfaceC65349Pkn("is_tcm_creator")
    public final boolean isTcmCreator;

    @InterfaceC65349Pkn("tcm_entrance_schema_url")
    public final String tcmEntranceSchemaUrl;

    @InterfaceC65349Pkn("tcm_fe_params")
    public final String tcmFeParams;

    @InterfaceC65349Pkn("use_bc_entrance_after_post")
    public final boolean useBcEntranceAfterPost;

    @InterfaceC65349Pkn("use_bc_entrance_in_post")
    public final boolean useBcEntranceInPost;

    @InterfaceC65349Pkn("use_new_bc_settings")
    public final boolean useNewBCSetting;

    public final String getBcSchemaAfterPost() {
        return this.bcSchemaAfterPost;
    }

    public final String getBcSchemaInPost() {
        return this.bcSchemaInPost;
    }

    public final BcUsageConfirmThreshold getBcUsageConfirmThreshold() {
        return this.bcUsageConfirmThreshold;
    }

    public final boolean getCanUseTcmConsole() {
        return this.canUseTcmConsole;
    }

    public final boolean getCheckBABeforePost() {
        return this.checkBABeforePost;
    }

    public final List<String> getHashtagList() {
        return this.hashtagList;
    }

    public final String getTcmEntranceSchemaUrl() {
        return this.tcmEntranceSchemaUrl;
    }

    public final String getTcmFeParams() {
        return this.tcmFeParams;
    }

    public final boolean getUseBcEntranceAfterPost() {
        return this.useBcEntranceAfterPost;
    }

    public final boolean getUseBcEntranceInPost() {
        return this.useBcEntranceInPost;
    }

    public final boolean getUseNewBCSetting() {
        return this.useNewBCSetting;
    }

    public final boolean isBrandedContentCreator() {
        return this.isBrandedContentCreator;
    }

    public final boolean isTcmCreator() {
        return this.isTcmCreator;
    }
}
