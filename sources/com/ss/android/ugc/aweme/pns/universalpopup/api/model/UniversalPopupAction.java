package com.ss.android.ugc.aweme.pns.universalpopup.api.model;

import X.AnonymousClass391;
import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UniversalPopupAction implements Serializable {

    @InterfaceC65349Pkn("action_id")
    public final String actionId;

    @InterfaceC65349Pkn("approve")
    public final boolean approve;

    @InterfaceC65349Pkn("customized_actions")
    public final List<String> customizedActions;

    @InterfaceC65349Pkn("dismiss")
    public final Boolean dismiss;

    @InterfaceC65349Pkn("dismiss_all")
    public final Boolean dismissAll;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_type")
    public final String linkType;

    @InterfaceC65349Pkn("next_pop_up")
    public final String nextPopUp;

    @InterfaceC65349Pkn("operation")
    public final int operation;

    public UniversalPopupAction() {
        this(null, null, null, null, 0, null, null, false, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalPopupAction copy$default(UniversalPopupAction universalPopupAction, String str, String str2, String str3, String str4, int i, Boolean bool, Boolean bool2, boolean z, List list, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = universalPopupAction.actionId;
        }
        if ((i2 & 2) != 0) {
            str2 = universalPopupAction.link;
        }
        if ((i2 & 4) != 0) {
            str3 = universalPopupAction.linkType;
        }
        if ((i2 & 8) != 0) {
            str4 = universalPopupAction.extra;
        }
        if ((i2 & 16) != 0) {
            i = universalPopupAction.operation;
        }
        if ((i2 & 32) != 0) {
            bool = universalPopupAction.dismiss;
        }
        if ((i2 & 64) != 0) {
            bool2 = universalPopupAction.dismissAll;
        }
        if ((i2 & 128) != 0) {
            z = universalPopupAction.approve;
        }
        if ((i2 & 256) != 0) {
            list = universalPopupAction.customizedActions;
        }
        if ((i2 & 512) != 0) {
            str5 = universalPopupAction.nextPopUp;
        }
        return universalPopupAction.copy(str, str2, str3, str4, i, bool, bool2, z, list, str5);
    }

    public final UniversalPopupAction copy(String actionId, String link, String linkType, String extra, int i, Boolean bool, Boolean bool2, boolean z, List<String> customizedActions, String str) {
        o.LJIIIZ(actionId, "actionId");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(customizedActions, "customizedActions");
        return new UniversalPopupAction(actionId, link, linkType, extra, i, bool, bool2, z, customizedActions, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPopupAction)) {
            return false;
        }
        UniversalPopupAction universalPopupAction = (UniversalPopupAction) obj;
        return o.LJ(this.actionId, universalPopupAction.actionId) && o.LJ(this.link, universalPopupAction.link) && o.LJ(this.linkType, universalPopupAction.linkType) && o.LJ(this.extra, universalPopupAction.extra) && this.operation == universalPopupAction.operation && o.LJ(this.dismiss, universalPopupAction.dismiss) && o.LJ(this.dismissAll, universalPopupAction.dismissAll) && this.approve == universalPopupAction.approve && o.LJ(this.customizedActions, universalPopupAction.customizedActions) && o.LJ(this.nextPopUp, universalPopupAction.nextPopUp);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UniversalPopupAction(actionId=");
        LIZ.append(this.actionId);
        LIZ.append(", link=");
        LIZ.append(this.link);
        LIZ.append(", linkType=");
        LIZ.append(this.linkType);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", operation=");
        LIZ.append(this.operation);
        LIZ.append(", dismiss=");
        LIZ.append(this.dismiss);
        LIZ.append(", dismissAll=");
        LIZ.append(this.dismissAll);
        LIZ.append(", approve=");
        LIZ.append(this.approve);
        LIZ.append(", customizedActions=");
        LIZ.append(this.customizedActions);
        LIZ.append(", nextPopUp=");
        LIZ.append((Object) this.nextPopUp);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = (C79062V1e.LJ(this.extra, C79062V1e.LJ(this.linkType, C79062V1e.LJ(this.link, this.actionId.hashCode() * 31, 31), 31), 31) + this.operation) * 31;
        Boolean bool = this.dismiss;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        Boolean bool2 = this.dismissAll;
        if (bool2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        boolean z = this.approve;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.customizedActions, (i3 + i4) * 31, 31);
        String str = this.nextPopUp;
        if (str != null) {
            i = str.hashCode();
        }
        return LIZIZ + i;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final boolean getApprove() {
        return this.approve;
    }

    public final List<String> getCustomizedActions() {
        return this.customizedActions;
    }

    public final Boolean getDismiss() {
        return this.dismiss;
    }

    public final Boolean getDismissAll() {
        return this.dismissAll;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLinkType() {
        return this.linkType;
    }

    public final String getNextPopUp() {
        return this.nextPopUp;
    }

    public final int getOperation() {
        return this.operation;
    }

    public UniversalPopupAction(String actionId, String link, String linkType, String extra, int i, Boolean bool, Boolean bool2, boolean z, List<String> customizedActions, String str) {
        o.LJIIIZ(actionId, "actionId");
        o.LJIIIZ(link, "link");
        o.LJIIIZ(linkType, "linkType");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(customizedActions, "customizedActions");
        this.actionId = actionId;
        this.link = link;
        this.linkType = linkType;
        this.extra = extra;
        this.operation = i;
        this.dismiss = bool;
        this.dismissAll = bool2;
        this.approve = z;
        this.customizedActions = customizedActions;
        this.nextPopUp = str;
    }

    public UniversalPopupAction(String str, String str2, String str3, String str4, int i, Boolean bool, Boolean bool2, boolean z, List list, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? Boolean.FALSE : bool2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? C61878OQg.INSTANCE : list, (i2 & 512) != 0 ? null : str5);
    }
}
