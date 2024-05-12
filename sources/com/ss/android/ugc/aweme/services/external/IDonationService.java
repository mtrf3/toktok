package com.ss.android.ugc.aweme.services.external;

import X.X1D;
import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public interface IDonationService {

    /* loaded from: classes5.dex */
    public interface OnDonationOrgChangeListener {
        void onDismiss();

        void onOrgSelected(OrganizationModel organizationModel);
    }

    DialogFragment getSelectDonationDialog(OnDonationOrgChangeListener onDonationOrgChangeListener);

    /* loaded from: classes5.dex */
    public static final class OrganizationModel {
        public String addTime;
        public final String desc;
        public final String detailUrl;
        public final String donateLink;
        public final UrlModel icon;
        public final String name;
        public final Integer ngoId;
        public final String orgId;
        public final String orgType;

        public static /* synthetic */ OrganizationModel copy$default(OrganizationModel organizationModel, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = organizationModel.name;
            }
            if ((i & 2) != 0) {
                str2 = organizationModel.desc;
            }
            if ((i & 4) != 0) {
                urlModel = organizationModel.icon;
            }
            if ((i & 8) != 0) {
                str3 = organizationModel.detailUrl;
            }
            if ((i & 16) != 0) {
                str4 = organizationModel.donateLink;
            }
            if ((i & 32) != 0) {
                str5 = organizationModel.orgId;
            }
            if ((i & 64) != 0) {
                str6 = organizationModel.orgType;
            }
            if ((i & 128) != 0) {
                num = organizationModel.ngoId;
            }
            return organizationModel.copy(str, str2, urlModel, str3, str4, str5, str6, num);
        }

        public final OrganizationModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, Integer num) {
            return new OrganizationModel(str, str2, urlModel, str3, str4, str5, str6, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrganizationModel)) {
                return false;
            }
            OrganizationModel organizationModel = (OrganizationModel) obj;
            return o.LJ(this.name, organizationModel.name) && o.LJ(this.desc, organizationModel.desc) && o.LJ(this.icon, organizationModel.icon) && o.LJ(this.detailUrl, organizationModel.detailUrl) && o.LJ(this.donateLink, organizationModel.donateLink) && o.LJ(this.orgId, organizationModel.orgId) && o.LJ(this.orgType, organizationModel.orgType) && o.LJ(this.ngoId, organizationModel.ngoId);
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.desc;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            UrlModel urlModel = this.icon;
            int hashCode3 = (hashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
            String str3 = this.detailUrl;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.donateLink;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.orgId;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.orgType;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num = this.ngoId;
            return hashCode7 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OrganizationModel(name=");
            LIZ.append(this.name);
            LIZ.append(", desc=");
            LIZ.append(this.desc);
            LIZ.append(", icon=");
            LIZ.append(this.icon);
            LIZ.append(", detailUrl=");
            LIZ.append(this.detailUrl);
            LIZ.append(", donateLink=");
            LIZ.append(this.donateLink);
            LIZ.append(", orgId=");
            LIZ.append(this.orgId);
            LIZ.append(", orgType=");
            LIZ.append(this.orgType);
            LIZ.append(", ngoId=");
            return s0.LIZJ(LIZ, this.ngoId, ')', LIZ);
        }

        public final String getAddTime() {
            return this.addTime;
        }

        public final String getDesc() {
            return this.desc;
        }

        public final String getDetailUrl() {
            return this.detailUrl;
        }

        public final String getDonateLink() {
            return this.donateLink;
        }

        public final UrlModel getIcon() {
            return this.icon;
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getNgoId() {
            return this.ngoId;
        }

        public final String getOrgId() {
            return this.orgId;
        }

        public final String getOrgType() {
            return this.orgType;
        }

        public final void setAddTime(String str) {
            this.addTime = str;
        }

        public OrganizationModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, Integer num) {
            this.name = str;
            this.desc = str2;
            this.icon = urlModel;
            this.detailUrl = str3;
            this.donateLink = str4;
            this.orgId = str5;
            this.orgType = str6;
            this.ngoId = num;
        }
    }
}
