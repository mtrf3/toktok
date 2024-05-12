package com.bytedance.touchpoint.core.invitecode;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.touchpoint.core.model.InAppPush;
import com.bytedance.touchpoint.core.model.Title;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InviteCodeResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("err_no")
    public int errNo;

    @InterfaceC65349Pkn("err_tips")
    public String errTips = "";

    @InterfaceC65349Pkn("status_code")
    public int status_code;

    /* loaded from: classes5.dex */
    public static final class Action {

        @InterfaceC65349Pkn("action_method")
        public final Integer actionMethod;

        @InterfaceC65349Pkn("action_type")
        public final Integer actionType;

        @InterfaceC65349Pkn("link")
        public final String link;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return o.LJ(this.actionType, action.actionType) && o.LJ(this.actionMethod, action.actionMethod) && o.LJ(this.link, action.link);
        }

        public final int hashCode() {
            Integer num = this.actionType;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            Integer num2 = this.actionMethod;
            int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            String str = this.link;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Action(actionType=");
            LIZ.append(this.actionType);
            LIZ.append(", actionMethod=");
            LIZ.append(this.actionMethod);
            LIZ.append(", link=");
            return JBR.LJFF(LIZ, this.link, ")", LIZ);
        }

        public Action(Integer num, Integer num2, String str) {
            this.actionType = num;
            this.actionMethod = num2;
            this.link = str;
        }
    }

    /* loaded from: classes5.dex */
    public static final class UserInfo {

        @InterfaceC65349Pkn("avatar_url")
        public final String avatarUrl;

        @InterfaceC65349Pkn("id")
        public final String id;

        @InterfaceC65349Pkn("name")
        public final String name;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) obj;
            return o.LJ(this.id, userInfo.id) && o.LJ(this.name, userInfo.name) && o.LJ(this.avatarUrl, userInfo.avatarUrl);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.name;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.avatarUrl;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("UserInfo(id=");
            LIZ.append(this.id);
            LIZ.append(", name=");
            LIZ.append(this.name);
            LIZ.append(", avatarUrl=");
            return JBR.LJFF(LIZ, this.avatarUrl, ")", LIZ);
        }

        public UserInfo(String str, String str2, String str3) {
            this.id = str;
            this.name = str2;
            this.avatarUrl = str3;
        }
    }

    /* loaded from: classes5.dex */
    public static final class DisplayRewards {

        @InterfaceC65349Pkn("display_cash_amount")
        public final Integer displayCashAmount;

        /* JADX WARN: Multi-variable type inference failed */
        public DisplayRewards() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof DisplayRewards) && o.LJ(this.displayCashAmount, ((DisplayRewards) obj).displayCashAmount);
            }
            return true;
        }

        public final int hashCode() {
            Integer num = this.displayCashAmount;
            if (num != null) {
                return num.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DisplayRewards(displayCashAmount=");
            LIZ.append(this.displayCashAmount);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public DisplayRewards(Integer num) {
            this.displayCashAmount = num;
        }

        public /* synthetic */ DisplayRewards(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Button {

        @InterfaceC65349Pkn("action")
        public final Action action;

        @InterfaceC65349Pkn("background_color")
        public final List<String> bgColor;

        @InterfaceC65349Pkn("gradient_type")
        public final int gradientType;

        @InterfaceC65349Pkn("locations")
        public final List<Float> locations;

        @InterfaceC65349Pkn("text")
        public final Title text;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return o.LJ(this.text, button.text) && o.LJ(this.bgColor, button.bgColor) && this.gradientType == button.gradientType && o.LJ(this.locations, button.locations) && o.LJ(this.action, button.action);
        }

        public final int hashCode() {
            Title title = this.text;
            int hashCode = (title != null ? title.hashCode() : 0) * 31;
            List<String> list = this.bgColor;
            int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.gradientType) * 31;
            List<Float> list2 = this.locations;
            int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Action action = this.action;
            return hashCode3 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Button(text=");
            LIZ.append(this.text);
            LIZ.append(", bgColor=");
            LIZ.append(this.bgColor);
            LIZ.append(", gradientType=");
            LIZ.append(this.gradientType);
            LIZ.append(", locations=");
            LIZ.append(this.locations);
            LIZ.append(", action=");
            LIZ.append(this.action);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Button(Title title, List<String> list, int i, List<Float> list2, Action action) {
            this.text = title;
            this.bgColor = list;
            this.gradientType = i;
            this.locations = list2;
            this.action = action;
        }
    }

    /* loaded from: classes5.dex */
    public static final class InviteResultPopup {

        @InterfaceC65349Pkn("buttons")
        public final List<Button> buttons;

        @InterfaceC65349Pkn("cover_image")
        public final String coverImage;

        @InterfaceC65349Pkn("description")
        public final Title decription;

        @InterfaceC65349Pkn("popup_type")
        public final String popupType;

        @InterfaceC65349Pkn("title")
        public final Title title;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InviteResultPopup)) {
                return false;
            }
            InviteResultPopup inviteResultPopup = (InviteResultPopup) obj;
            return o.LJ(this.popupType, inviteResultPopup.popupType) && o.LJ(this.coverImage, inviteResultPopup.coverImage) && o.LJ(this.title, inviteResultPopup.title) && o.LJ(this.decription, inviteResultPopup.decription) && o.LJ(this.buttons, inviteResultPopup.buttons);
        }

        public final int hashCode() {
            String str = this.popupType;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.coverImage;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Title title = this.title;
            int hashCode3 = (hashCode2 + (title != null ? title.hashCode() : 0)) * 31;
            Title title2 = this.decription;
            int hashCode4 = (hashCode3 + (title2 != null ? title2.hashCode() : 0)) * 31;
            List<Button> list = this.buttons;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InviteResultPopup(popupType=");
            LIZ.append(this.popupType);
            LIZ.append(", coverImage=");
            LIZ.append(this.coverImage);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", decription=");
            LIZ.append(this.decription);
            LIZ.append(", buttons=");
            LIZ.append(this.buttons);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public InviteResultPopup(String str, String str2, Title title, Title title2, List<Button> list) {
            this.popupType = str;
            this.coverImage = str2;
            this.title = title;
            this.decription = title2;
            this.buttons = list;
        }
    }

    /* loaded from: classes5.dex */
    public static final class Data {

        @InterfaceC65349Pkn("display_rewards")
        public final DisplayRewards displayRewards;

        @InterfaceC65349Pkn("invite_bind_result_inapp_push")
        public final InAppPush inviteResultInAppPush;

        @InterfaceC65349Pkn("invite_bind_result_popup")
        public final InviteResultPopup inviteResultPopup;

        @InterfaceC65349Pkn("invitee_info")
        public final UserInfo inviteeInfo;

        @InterfaceC65349Pkn("invite_bind_status")
        public final Integer inviterBindStatus;

        @InterfaceC65349Pkn("inviter_info")
        public final UserInfo inviterInfo;

        @InterfaceC65349Pkn("invite_bind_result_message")
        public final String inviterResultMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.displayRewards, data.displayRewards) && o.LJ(this.inviteeInfo, data.inviteeInfo) && o.LJ(this.inviterInfo, data.inviterInfo) && o.LJ(this.inviterBindStatus, data.inviterBindStatus) && o.LJ(this.inviterResultMessage, data.inviterResultMessage) && o.LJ(this.inviteResultPopup, data.inviteResultPopup) && o.LJ(this.inviteResultInAppPush, data.inviteResultInAppPush);
        }

        public final int hashCode() {
            DisplayRewards displayRewards = this.displayRewards;
            int hashCode = (displayRewards != null ? displayRewards.hashCode() : 0) * 31;
            UserInfo userInfo = this.inviteeInfo;
            int hashCode2 = (hashCode + (userInfo != null ? userInfo.hashCode() : 0)) * 31;
            UserInfo userInfo2 = this.inviterInfo;
            int hashCode3 = (hashCode2 + (userInfo2 != null ? userInfo2.hashCode() : 0)) * 31;
            Integer num = this.inviterBindStatus;
            int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
            String str = this.inviterResultMessage;
            int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
            InviteResultPopup inviteResultPopup = this.inviteResultPopup;
            int hashCode6 = (hashCode5 + (inviteResultPopup != null ? inviteResultPopup.hashCode() : 0)) * 31;
            InAppPush inAppPush = this.inviteResultInAppPush;
            return hashCode6 + (inAppPush != null ? inAppPush.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(displayRewards=");
            LIZ.append(this.displayRewards);
            LIZ.append(", inviteeInfo=");
            LIZ.append(this.inviteeInfo);
            LIZ.append(", inviterInfo=");
            LIZ.append(this.inviterInfo);
            LIZ.append(", inviterBindStatus=");
            LIZ.append(this.inviterBindStatus);
            LIZ.append(", inviterResultMessage=");
            LIZ.append(this.inviterResultMessage);
            LIZ.append(", inviteResultPopup=");
            LIZ.append(this.inviteResultPopup);
            LIZ.append(", inviteResultInAppPush=");
            LIZ.append(this.inviteResultInAppPush);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Data(DisplayRewards displayRewards, UserInfo userInfo, UserInfo userInfo2, Integer num, String str, InviteResultPopup inviteResultPopup, InAppPush inAppPush) {
            this.displayRewards = displayRewards;
            this.inviteeInfo = userInfo;
            this.inviterInfo = userInfo2;
            this.inviterBindStatus = num;
            this.inviterResultMessage = str;
            this.inviteResultPopup = inviteResultPopup;
            this.inviteResultInAppPush = inAppPush;
        }

        public /* synthetic */ Data(DisplayRewards displayRewards, UserInfo userInfo, UserInfo userInfo2, Integer num, String str, InviteResultPopup inviteResultPopup, InAppPush inAppPush, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : displayRewards, (i & 2) != 0 ? null : userInfo, (i & 4) != 0 ? null : userInfo2, (i & 8) != 0 ? -1 : num, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : inviteResultPopup, (i & 64) == 0 ? inAppPush : null);
        }
    }
}
