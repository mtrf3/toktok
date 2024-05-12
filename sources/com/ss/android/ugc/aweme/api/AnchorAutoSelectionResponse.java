package com.ss.android.ugc.aweme.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AnchorAutoSelectionResponse {

    @InterfaceC65349Pkn("added_icon")
    public final UrlModel addedIcon;

    @InterfaceC65349Pkn("anchor")
    public final CreateAnchorInfo anchor;

    @InterfaceC65349Pkn("can_user_remove")
    public final Boolean canRemove;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("status_code")
    public final int status;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorAutoSelectionResponse)) {
            return false;
        }
        AnchorAutoSelectionResponse anchorAutoSelectionResponse = (AnchorAutoSelectionResponse) obj;
        return this.status == anchorAutoSelectionResponse.status && o.LJ(this.statusMsg, anchorAutoSelectionResponse.statusMsg) && o.LJ(this.anchor, anchorAutoSelectionResponse.anchor) && o.LJ(this.canRemove, anchorAutoSelectionResponse.canRemove) && o.LJ(this.addedIcon, anchorAutoSelectionResponse.addedIcon) && o.LJ(this.logExtra, anchorAutoSelectionResponse.logExtra);
    }

    public final int hashCode() {
        int i = this.status * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        CreateAnchorInfo createAnchorInfo = this.anchor;
        int hashCode2 = (hashCode + (createAnchorInfo == null ? 0 : createAnchorInfo.hashCode())) * 31;
        Boolean bool = this.canRemove;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UrlModel urlModel = this.addedIcon;
        int hashCode4 = (hashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str2 = this.logExtra;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorAutoSelectionResponse(status=");
        LIZ.append(this.status);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", anchor=");
        LIZ.append(this.anchor);
        LIZ.append(", canRemove=");
        LIZ.append(this.canRemove);
        LIZ.append(", addedIcon=");
        LIZ.append(this.addedIcon);
        LIZ.append(", logExtra=");
        return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
    }

    public AnchorAutoSelectionResponse(int i, String str, CreateAnchorInfo createAnchorInfo, Boolean bool, UrlModel urlModel, String str2) {
        this.status = i;
        this.statusMsg = str;
        this.anchor = createAnchorInfo;
        this.canRemove = bool;
        this.addedIcon = urlModel;
        this.logExtra = str2;
    }
}
