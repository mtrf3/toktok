package com.ss.android.ugc.aweme.experiment;

import X.HH1;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class FacebookSocialPromptV2flagsSettings {
    public static final FacebookSocialPromptV2flagsModel LIZ = new FacebookSocialPromptV2flagsModel("", "", "");

    /* loaded from: classes14.dex */
    public static final class FacebookSocialPromptV2flagsModel {

        @InterfaceC65349Pkn("helpcenter")
        public final String helpCenterLinkText;

        @InterfaceC65349Pkn("learnmore")
        public final String learnMoreText;

        @InterfaceC65349Pkn("body")
        public final String promptExcludeTitle;

        public FacebookSocialPromptV2flagsModel(String str, String str2, String str3) {
            HH1.LIZ(str, "promptExcludeTitle", str2, "learnMoreText", str3, "helpCenterLinkText");
            this.promptExcludeTitle = str;
            this.learnMoreText = str2;
            this.helpCenterLinkText = str3;
        }
    }
}
