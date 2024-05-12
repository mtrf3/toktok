package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public class ActivityLinkResponse extends BaseResponse {

    @InterfaceC65349Pkn("link_info")
    public LinkInfo linkInfo;

    /* loaded from: classes5.dex */
    public class LinkInfo {

        @InterfaceC65349Pkn("background_style")
        public String backgroundUrl;

        @InterfaceC65349Pkn("close_after")
        public int closeAfter;

        @InterfaceC65349Pkn("days_no_show")
        public int daysNotShow;

        @InterfaceC65349Pkn("days_window")
        public int daysWindow;

        @InterfaceC65349Pkn("click_disappear")
        public boolean disappearAfterClicked;

        @InterfaceC65349Pkn("font_color")
        public String fontColor;

        @InterfaceC65349Pkn("max_close")
        public int maxClose;

        @InterfaceC65349Pkn("teenager_mode_enable")
        public boolean teenagerModeEnable;

        @InterfaceC65349Pkn("text")
        public String text;

        @InterfaceC65349Pkn("h5_url")
        public String url;

        public LinkInfo() {
        }
    }
}
