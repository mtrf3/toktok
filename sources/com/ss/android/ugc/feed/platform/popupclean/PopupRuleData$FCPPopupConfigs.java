package com.ss.android.ugc.feed.platform.popupclean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PopupRuleData$FCPPopupConfigs implements Serializable {

    @InterfaceC65349Pkn("groups")
    public final List<PopupRuleData$PopupGroup> groups;

    @InterfaceC65349Pkn("popups")
    public final List<PopupRuleData$Popup> popups;

    @InterfaceC65349Pkn("scenes")
    public final List<Object> scenes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PopupRuleData$FCPPopupConfigs copy$default(PopupRuleData$FCPPopupConfigs popupRuleData$FCPPopupConfigs, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = popupRuleData$FCPPopupConfigs.scenes;
        }
        if ((i & 2) != 0) {
            list2 = popupRuleData$FCPPopupConfigs.groups;
        }
        if ((i & 4) != 0) {
            list3 = popupRuleData$FCPPopupConfigs.popups;
        }
        return popupRuleData$FCPPopupConfigs.copy(list, list2, list3);
    }

    public final PopupRuleData$FCPPopupConfigs copy(List<Object> list, List<PopupRuleData$PopupGroup> list2, List<PopupRuleData$Popup> list3) {
        return new PopupRuleData$FCPPopupConfigs(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupRuleData$FCPPopupConfigs)) {
            return false;
        }
        PopupRuleData$FCPPopupConfigs popupRuleData$FCPPopupConfigs = (PopupRuleData$FCPPopupConfigs) obj;
        return o.LJ(this.scenes, popupRuleData$FCPPopupConfigs.scenes) && o.LJ(this.groups, popupRuleData$FCPPopupConfigs.groups) && o.LJ(this.popups, popupRuleData$FCPPopupConfigs.popups);
    }

    public int hashCode() {
        List<Object> list = this.scenes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PopupRuleData$PopupGroup> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PopupRuleData$Popup> list3 = this.popups;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FCPPopupConfigs(scenes=");
        LIZ.append(this.scenes);
        LIZ.append(", groups=");
        LIZ.append(this.groups);
        LIZ.append(", popups=");
        return C1NE.LIZIZ(LIZ, this.popups, ')', LIZ);
    }

    public final List<PopupRuleData$PopupGroup> getGroups() {
        return this.groups;
    }

    public final List<PopupRuleData$Popup> getPopups() {
        return this.popups;
    }

    public final List<Object> getScenes() {
        return this.scenes;
    }

    public PopupRuleData$FCPPopupConfigs(List<Object> list, List<PopupRuleData$PopupGroup> list2, List<PopupRuleData$Popup> list3) {
        this.scenes = list;
        this.groups = list2;
        this.popups = list3;
    }
}
