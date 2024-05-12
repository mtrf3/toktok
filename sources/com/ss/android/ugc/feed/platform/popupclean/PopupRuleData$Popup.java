package com.ss.android.ugc.feed.platform.popupclean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$Popup implements Serializable {

    @InterfaceC65349Pkn("container_popup_key")
    public final String containerId;

    @InterfaceC65349Pkn("group_keys")
    public final String groupId;

    @InterfaceC65349Pkn("popup_key")
    public final String popupKey;

    @InterfaceC65349Pkn("popup_type")
    public final Integer popupType;

    @InterfaceC65349Pkn("show_strategy")
    public final Integer strategy;

    public static /* synthetic */ PopupRuleData$Popup copy$default(PopupRuleData$Popup popupRuleData$Popup, String str, String str2, Integer num, String str3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupRuleData$Popup.groupId;
        }
        if ((i & 2) != 0) {
            str2 = popupRuleData$Popup.popupKey;
        }
        if ((i & 4) != 0) {
            num = popupRuleData$Popup.popupType;
        }
        if ((i & 8) != 0) {
            str3 = popupRuleData$Popup.containerId;
        }
        if ((i & 16) != 0) {
            num2 = popupRuleData$Popup.strategy;
        }
        return popupRuleData$Popup.copy(str, str2, num, str3, num2);
    }

    public final PopupRuleData$Popup copy(String str, String str2, Integer num, String str3, Integer num2) {
        return new PopupRuleData$Popup(str, str2, num, str3, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupRuleData$Popup)) {
            return false;
        }
        PopupRuleData$Popup popupRuleData$Popup = (PopupRuleData$Popup) obj;
        return o.LJ(this.groupId, popupRuleData$Popup.groupId) && o.LJ(this.popupKey, popupRuleData$Popup.popupKey) && o.LJ(this.popupType, popupRuleData$Popup.popupType) && o.LJ(this.containerId, popupRuleData$Popup.containerId) && o.LJ(this.strategy, popupRuleData$Popup.strategy);
    }

    public int hashCode() {
        String str = this.groupId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.popupKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.popupType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.containerId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.strategy;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Popup(groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", popupKey=");
        LIZ.append(this.popupKey);
        LIZ.append(", popupType=");
        LIZ.append(this.popupType);
        LIZ.append(", containerId=");
        LIZ.append(this.containerId);
        LIZ.append(", strategy=");
        return s0.LIZJ(LIZ, this.strategy, ')', LIZ);
    }

    public final String getContainerId() {
        return this.containerId;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getPopupKey() {
        return this.popupKey;
    }

    public final Integer getPopupType() {
        return this.popupType;
    }

    public final Integer getStrategy() {
        return this.strategy;
    }

    public PopupRuleData$Popup(String str, String str2, Integer num, String str3, Integer num2) {
        this.groupId = str;
        this.popupKey = str2;
        this.popupType = num;
        this.containerId = str3;
        this.strategy = num2;
    }
}
