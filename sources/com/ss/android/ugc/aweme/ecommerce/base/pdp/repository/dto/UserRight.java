package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27074Aju;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserRight implements Parcelable {
    public static final Parcelable.Creator<UserRight> CREATOR = new C27074Aju();

    @InterfaceC65349Pkn("bottom_tip")
    public final BottomTip bottomTip;

    @InterfaceC65349Pkn("contact_detail")
    public final ContactDetail contactDetail;

    @InterfaceC65349Pkn("expose_panel")
    public final ExposeUserRightPanel exposeUserRightPanel;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("prefix_name")
    public final LinkText prefixName;

    @InterfaceC65349Pkn("privacy_policy")
    public final List<PrivacyPolicy> privacyPolicy;

    @InterfaceC65349Pkn("user_right_details")
    public final List<UserRightDetail> userRightDetails;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserRight)) {
            return false;
        }
        UserRight userRight = (UserRight) obj;
        return o.LJ(this.name, userRight.name) && o.LJ(this.userRightDetails, userRight.userRightDetails) && o.LJ(this.contactDetail, userRight.contactDetail) && o.LJ(this.exposeUserRightPanel, userRight.exposeUserRightPanel) && o.LJ(this.privacyPolicy, userRight.privacyPolicy) && o.LJ(this.bottomTip, userRight.bottomTip) && o.LJ(this.icon, userRight.icon) && o.LJ(this.prefixName, userRight.prefixName);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UserRightDetail> list = this.userRightDetails;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ContactDetail contactDetail = this.contactDetail;
        int hashCode3 = (hashCode2 + (contactDetail == null ? 0 : contactDetail.hashCode())) * 31;
        ExposeUserRightPanel exposeUserRightPanel = this.exposeUserRightPanel;
        int hashCode4 = (hashCode3 + (exposeUserRightPanel == null ? 0 : exposeUserRightPanel.hashCode())) * 31;
        List<PrivacyPolicy> list2 = this.privacyPolicy;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BottomTip bottomTip = this.bottomTip;
        int hashCode6 = (hashCode5 + (bottomTip == null ? 0 : bottomTip.hashCode())) * 31;
        Icon icon = this.icon;
        int hashCode7 = (hashCode6 + (icon == null ? 0 : icon.hashCode())) * 31;
        LinkText linkText = this.prefixName;
        return hashCode7 + (linkText != null ? linkText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserRight(name=");
        LIZ.append(this.name);
        LIZ.append(", userRightDetails=");
        LIZ.append(this.userRightDetails);
        LIZ.append(", contactDetail=");
        LIZ.append(this.contactDetail);
        LIZ.append(", exposeUserRightPanel=");
        LIZ.append(this.exposeUserRightPanel);
        LIZ.append(", privacyPolicy=");
        LIZ.append(this.privacyPolicy);
        LIZ.append(", bottomTip=");
        LIZ.append(this.bottomTip);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", prefixName=");
        LIZ.append(this.prefixName);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static UserRight LIZ(UserRight userRight, List list) {
        return new UserRight(userRight.name, list, userRight.contactDetail, userRight.exposeUserRightPanel, userRight.privacyPolicy, userRight.bottomTip, userRight.icon, userRight.prefixName);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.name);
        List<UserRightDetail> list = this.userRightDetails;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((UserRightDetail) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        ContactDetail contactDetail = this.contactDetail;
        if (contactDetail == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            contactDetail.writeToParcel(out, i);
        }
        ExposeUserRightPanel exposeUserRightPanel = this.exposeUserRightPanel;
        if (exposeUserRightPanel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            exposeUserRightPanel.writeToParcel(out, i);
        }
        List<PrivacyPolicy> list2 = this.privacyPolicy;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((PrivacyPolicy) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        BottomTip bottomTip = this.bottomTip;
        if (bottomTip == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bottomTip.writeToParcel(out, i);
        }
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        LinkText linkText = this.prefixName;
        if (linkText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkText.writeToParcel(out, i);
        }
    }

    public UserRight(String str, List<UserRightDetail> list, ContactDetail contactDetail, ExposeUserRightPanel exposeUserRightPanel, List<PrivacyPolicy> list2, BottomTip bottomTip, Icon icon, LinkText linkText) {
        this.name = str;
        this.userRightDetails = list;
        this.contactDetail = contactDetail;
        this.exposeUserRightPanel = exposeUserRightPanel;
        this.privacyPolicy = list2;
        this.bottomTip = bottomTip;
        this.icon = icon;
        this.prefixName = linkText;
    }
}
