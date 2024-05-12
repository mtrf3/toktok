package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class ShoppingConfig {

    @InterfaceC65349Pkn("card_show_duration")
    public Integer cardShowDuration;

    @InterfaceC65349Pkn("disable_card")
    public Boolean disableCard;

    @InterfaceC65349Pkn("disable_want")
    public Boolean disableWant;

    @InterfaceC65349Pkn("enable")
    public Boolean enable;

    @InterfaceC65349Pkn("enable_float_video")
    public Boolean enableFloatVideo;

    @InterfaceC65349Pkn("enable_user")
    public Boolean enableUser;

    @InterfaceC65349Pkn("law_window")
    public Boolean lawWindow;

    @InterfaceC65349Pkn("live")
    public ShoppingLiveConfig live;

    @InterfaceC65349Pkn("newbie_help")
    public ShoppingNewbieHelp newbieHelp;

    @InterfaceC65349Pkn("order_share_intro_url")
    public String orderShareIntroUrl;

    @InterfaceC65349Pkn("preload_data_wait_duration")
    public Integer preloadDataWaitDuration = 3;

    public Integer getCardShowDuration() {
        Integer num = this.cardShowDuration;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Boolean getDisableCard() {
        Boolean bool = this.disableCard;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getDisableWant() {
        Boolean bool = this.disableWant;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getEnable() {
        Boolean bool = this.enable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getEnableFloatVideo() {
        Boolean bool = this.enableFloatVideo;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getEnableUser() {
        Boolean bool = this.enableUser;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Boolean getLawWindow() {
        Boolean bool = this.lawWindow;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public ShoppingLiveConfig getLive() {
        ShoppingLiveConfig shoppingLiveConfig = this.live;
        if (shoppingLiveConfig != null) {
            return shoppingLiveConfig;
        }
        throw new C158056If();
    }

    public ShoppingNewbieHelp getNewbieHelp() {
        ShoppingNewbieHelp shoppingNewbieHelp = this.newbieHelp;
        if (shoppingNewbieHelp != null) {
            return shoppingNewbieHelp;
        }
        throw new C158056If();
    }

    public String getOrderShareIntroUrl() {
        String str = this.orderShareIntroUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getPreloadDataWaitDuration() {
        return this.preloadDataWaitDuration;
    }
}
