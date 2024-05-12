package com.ss.android.ugc.aweme.search.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class TakoInfoModel implements Serializable {

    @InterfaceC65349Pkn("im_gpt_bot_avatar_url")
    public final String botAvatar;

    @InterfaceC65349Pkn("im_gpt_bot_id")
    public final String botId;

    @InterfaceC65349Pkn("im_gpt_bot_name")
    public final String botName;

    @InterfaceC65349Pkn("im_enable_tikbot_disclaimer_dialog")
    public final Boolean enableDisclaimer;

    @InterfaceC65349Pkn("feed_enable_show_tikbot_entrance")
    public final Boolean enableFeedEntrance;

    @InterfaceC65349Pkn("feed_enable_show_tikbot_for_traffic_control")
    public final Boolean enableFeedEntranceForTrafficControl;

    @InterfaceC65349Pkn("feed_sug_preload_time_threshold")
    public final Integer feedSugPreloadTimeThreshold;

    @InterfaceC65349Pkn("tako_help_page_url")
    public final String helpPageUrl;

    @InterfaceC65349Pkn("search_gpt_polling_config")
    public final PollingInfo pollingConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoInfoModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TakoInfoModel copy$default(TakoInfoModel takoInfoModel, Boolean bool, Boolean bool2, PollingInfo pollingInfo, String str, String str2, String str3, Boolean bool3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = takoInfoModel.enableFeedEntrance;
        }
        if ((i & 2) != 0) {
            bool2 = takoInfoModel.enableFeedEntranceForTrafficControl;
        }
        if ((i & 4) != 0) {
            pollingInfo = takoInfoModel.pollingConfig;
        }
        if ((i & 8) != 0) {
            str = takoInfoModel.botId;
        }
        if ((i & 16) != 0) {
            str2 = takoInfoModel.botName;
        }
        if ((i & 32) != 0) {
            str3 = takoInfoModel.botAvatar;
        }
        if ((i & 64) != 0) {
            bool3 = takoInfoModel.enableDisclaimer;
        }
        if ((i & 128) != 0) {
            str4 = takoInfoModel.helpPageUrl;
        }
        if ((i & 256) != 0) {
            num = takoInfoModel.feedSugPreloadTimeThreshold;
        }
        return takoInfoModel.copy(bool, bool2, pollingInfo, str, str2, str3, bool3, str4, num);
    }

    public final TakoInfoModel copy(Boolean bool, Boolean bool2, PollingInfo pollingInfo, String str, String str2, String str3, Boolean bool3, String str4, Integer num) {
        return new TakoInfoModel(bool, bool2, pollingInfo, str, str2, str3, bool3, str4, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoInfoModel)) {
            return false;
        }
        TakoInfoModel takoInfoModel = (TakoInfoModel) obj;
        return o.LJ(this.enableFeedEntrance, takoInfoModel.enableFeedEntrance) && o.LJ(this.enableFeedEntranceForTrafficControl, takoInfoModel.enableFeedEntranceForTrafficControl) && o.LJ(this.pollingConfig, takoInfoModel.pollingConfig) && o.LJ(this.botId, takoInfoModel.botId) && o.LJ(this.botName, takoInfoModel.botName) && o.LJ(this.botAvatar, takoInfoModel.botAvatar) && o.LJ(this.enableDisclaimer, takoInfoModel.enableDisclaimer) && o.LJ(this.helpPageUrl, takoInfoModel.helpPageUrl) && o.LJ(this.feedSugPreloadTimeThreshold, takoInfoModel.feedSugPreloadTimeThreshold);
    }

    public int hashCode() {
        Boolean bool = this.enableFeedEntrance;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableFeedEntranceForTrafficControl;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PollingInfo pollingInfo = this.pollingConfig;
        int hashCode3 = (hashCode2 + (pollingInfo == null ? 0 : pollingInfo.hashCode())) * 31;
        String str = this.botId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.botName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.botAvatar;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool3 = this.enableDisclaimer;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.helpPageUrl;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.feedSugPreloadTimeThreshold;
        return hashCode8 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoInfoModel(enableFeedEntrance=");
        LIZ.append(this.enableFeedEntrance);
        LIZ.append(", enableFeedEntranceForTrafficControl=");
        LIZ.append(this.enableFeedEntranceForTrafficControl);
        LIZ.append(", pollingConfig=");
        LIZ.append(this.pollingConfig);
        LIZ.append(", botId=");
        LIZ.append(this.botId);
        LIZ.append(", botName=");
        LIZ.append(this.botName);
        LIZ.append(", botAvatar=");
        LIZ.append(this.botAvatar);
        LIZ.append(", enableDisclaimer=");
        LIZ.append(this.enableDisclaimer);
        LIZ.append(", helpPageUrl=");
        LIZ.append(this.helpPageUrl);
        LIZ.append(", feedSugPreloadTimeThreshold=");
        return s0.LIZJ(LIZ, this.feedSugPreloadTimeThreshold, ')', LIZ);
    }

    public final String getBotAvatar() {
        return this.botAvatar;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final Boolean getEnableDisclaimer() {
        return this.enableDisclaimer;
    }

    public final Boolean getEnableFeedEntrance() {
        return this.enableFeedEntrance;
    }

    public final Boolean getEnableFeedEntranceForTrafficControl() {
        return this.enableFeedEntranceForTrafficControl;
    }

    public final Integer getFeedSugPreloadTimeThreshold() {
        return this.feedSugPreloadTimeThreshold;
    }

    public final String getHelpPageUrl() {
        return this.helpPageUrl;
    }

    public final PollingInfo getPollingConfig() {
        return this.pollingConfig;
    }

    public TakoInfoModel(Boolean bool, Boolean bool2, PollingInfo pollingInfo, String str, String str2, String str3, Boolean bool3, String str4, Integer num) {
        this.enableFeedEntrance = bool;
        this.enableFeedEntranceForTrafficControl = bool2;
        this.pollingConfig = pollingInfo;
        this.botId = str;
        this.botName = str2;
        this.botAvatar = str3;
        this.enableDisclaimer = bool3;
        this.helpPageUrl = str4;
        this.feedSugPreloadTimeThreshold = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TakoInfoModel(Boolean bool, Boolean bool2, PollingInfo pollingInfo, String str, String str2, String str3, Boolean bool3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? Boolean.TRUE : bool2, (i & 4) != 0 ? new PollingInfo(null == true ? 1 : 0, null == true ? 1 : 0, 3, null == true ? 1 : 0) : pollingInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? Boolean.TRUE : bool3, (i & 128) == 0 ? str4 : null, (i & 256) != 0 ? 72 : num);
    }
}
