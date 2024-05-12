package com.ss.android.ugc.feed.platform.popupclean;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$PopupGroup implements Serializable {

    @InterfaceC65349Pkn("group_bypass")
    public final PopupRuleData$PopupByPassRule bypassRule;

    @InterfaceC65349Pkn("popup_group_key")
    public final String groupId;

    @InterfaceC65349Pkn("popups")
    public final List<String> popups;

    @InterfaceC65349Pkn("show_limit")
    public final PopupRuleData$PopupRule showLimit;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopupRuleData$PopupGroup copy$default(PopupRuleData$PopupGroup popupRuleData$PopupGroup, String str, List list, PopupRuleData$PopupRule popupRuleData$PopupRule, PopupRuleData$PopupByPassRule popupRuleData$PopupByPassRule, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupRuleData$PopupGroup.groupId;
        }
        if ((i & 2) != 0) {
            list = popupRuleData$PopupGroup.popups;
        }
        if ((i & 4) != 0) {
            popupRuleData$PopupRule = popupRuleData$PopupGroup.showLimit;
        }
        if ((i & 8) != 0) {
            popupRuleData$PopupByPassRule = popupRuleData$PopupGroup.bypassRule;
        }
        return popupRuleData$PopupGroup.copy(str, list, popupRuleData$PopupRule, popupRuleData$PopupByPassRule);
    }

    public final PopupRuleData$PopupGroup copy(String str, List<String> list, PopupRuleData$PopupRule popupRuleData$PopupRule, PopupRuleData$PopupByPassRule popupRuleData$PopupByPassRule) {
        return new PopupRuleData$PopupGroup(str, list, popupRuleData$PopupRule, popupRuleData$PopupByPassRule);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupRuleData$PopupGroup)) {
            return false;
        }
        PopupRuleData$PopupGroup popupRuleData$PopupGroup = (PopupRuleData$PopupGroup) obj;
        return o.LJ(this.groupId, popupRuleData$PopupGroup.groupId) && o.LJ(this.popups, popupRuleData$PopupGroup.popups) && o.LJ(this.showLimit, popupRuleData$PopupGroup.showLimit) && o.LJ(this.bypassRule, popupRuleData$PopupGroup.bypassRule);
    }

    public int hashCode() {
        String str = this.groupId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.popups;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        PopupRuleData$PopupRule popupRuleData$PopupRule = this.showLimit;
        int hashCode3 = (hashCode2 + (popupRuleData$PopupRule == null ? 0 : popupRuleData$PopupRule.hashCode())) * 31;
        PopupRuleData$PopupByPassRule popupRuleData$PopupByPassRule = this.bypassRule;
        return hashCode3 + (popupRuleData$PopupByPassRule != null ? popupRuleData$PopupByPassRule.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopupGroup(groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", popups=");
        LIZ.append(this.popups);
        LIZ.append(", showLimit=");
        LIZ.append(this.showLimit);
        LIZ.append(", bypassRule=");
        LIZ.append(this.bypassRule);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final PopupRuleData$PopupByPassRule getBypassRule() {
        return this.bypassRule;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final List<String> getPopups() {
        return this.popups;
    }

    public final PopupRuleData$PopupRule getShowLimit() {
        return this.showLimit;
    }

    public PopupRuleData$PopupGroup(String str, List<String> list, PopupRuleData$PopupRule popupRuleData$PopupRule, PopupRuleData$PopupByPassRule popupRuleData$PopupByPassRule) {
        this.groupId = str;
        this.popups = list;
        this.showLimit = popupRuleData$PopupRule;
        this.bypassRule = popupRuleData$PopupByPassRule;
    }
}
