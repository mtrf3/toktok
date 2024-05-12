package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class FlipChatSettings {

    @InterfaceC65349Pkn("main_switch")
    public Boolean mainSwitch;

    @InterfaceC65349Pkn("msg_cell_avatar_url")
    public String msgCellAvatarUrl;

    @InterfaceC65349Pkn("msg_cell_name")
    public String msgCellName;

    @InterfaceC65349Pkn("show_launch_page_popup")
    public Boolean showLaunchPagePopup;

    @InterfaceC65349Pkn("show_login_icon")
    public Boolean showLoginIcon;

    @InterfaceC65349Pkn("show_msg_cell")
    public Boolean showMsgCell;

    public String getMsgCellAvatarUrl() {
        String str = this.msgCellAvatarUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getMsgCellName() {
        String str = this.msgCellName;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getMainSwitch() {
        return this.mainSwitch;
    }

    public Boolean getShowLaunchPagePopup() {
        return this.showLaunchPagePopup;
    }

    public Boolean getShowLoginIcon() {
        return this.showLoginIcon;
    }

    public Boolean getShowMsgCell() {
        return this.showMsgCell;
    }
}
