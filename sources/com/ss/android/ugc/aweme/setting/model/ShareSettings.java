package com.ss.android.ugc.aweme.setting.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.aweme.share.ShareSettingsBizConfig;
import com.ss.android.ugc.aweme.share.base.model.ShareChannelInfo;
import java.util.List;

/* loaded from: classes7.dex */
public class ShareSettings extends BaseResponse {

    @InterfaceC65349Pkn("command_patterns")
    public List<String> commandPatterns;

    @InterfaceC65349Pkn("muted_share_platforms")
    public List<String> mutedSharePlatforms;

    @InterfaceC65349Pkn("share_download_platforms")
    public List<SharePlatform> shareDownloadPlatforms;

    @InterfaceC65349Pkn("share_gif_platforms")
    public List<SharePlatform> shareGifPlatforms;

    @InterfaceC65349Pkn("share_actions")
    public List<ShareItemOrderBean> shareOrderList;

    @InterfaceC65349Pkn("share_platforms")
    public List<SharePlatform> sharePlatforms;

    @InterfaceC65349Pkn("share_platforms_meta")
    public List<ShareChannelInfo> sharePlatformsMeta;

    @InterfaceC65349Pkn("share_settings_biz_config")
    public ShareSettingsBizConfig shareSettingsBizConfig;

    public final Boolean LJ() {
        ShareSettingsBizConfig shareSettingsBizConfig = this.shareSettingsBizConfig;
        if (shareSettingsBizConfig == null) {
            return Boolean.FALSE;
        }
        return shareSettingsBizConfig.enableSilentShareLemon8;
    }
}
