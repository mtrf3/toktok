package com.ss.android.ugc.aweme.compliance.common.hydrogen.configs;

import X.C07670Rv;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class AccountDeleteLibraSetting {
    public static final AccountDeleteSettingModel LIZ = new AccountDeleteSettingModel("aweme://webview?hide_nav_bar=1&__status_bar=true&use_spark=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm", "aweme://webview?hide_nav_bar=1&__status_bar=true&use_spark=1&url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm_child", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm%2Fdownload", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fconfirm%2Fcheck", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fpassport", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fmobile", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Foauth", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete%2Fstatus", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Foptions", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Fdelete", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Freminder", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Fmobile", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdelete2Fpassport", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Faccount%2Fdeactivation%2Foauth");

    /* loaded from: classes17.dex */
    public static final class AccountDeleteSettingModel {

        @InterfaceC65349Pkn("ad_deactive_delete")
        public final String deactiveDelete;

        @InterfaceC65349Pkn("ad_deactive_mobile")
        public final String deactiveMobile;

        @InterfaceC65349Pkn("ad_deactive_oauth")
        public final String deactiveOauth;

        @InterfaceC65349Pkn("ad_deactive_options")
        public final String deactiveOptions;

        @InterfaceC65349Pkn("ad_deactive_passport")
        public final String deactivePassport;

        @InterfaceC65349Pkn("ad_deactive_reminder")
        public final String deactiveReminder;

        @InterfaceC65349Pkn("ad_delete_confirm")
        public final String deleteConfirm;

        @InterfaceC65349Pkn("ad_delete_confirm_check")
        public final String deleteConfirmCheck;

        @InterfaceC65349Pkn("ad_delete_confirm_child")
        public final String deleteConfirmChild;

        @InterfaceC65349Pkn("ad_delete_confirm_download")
        public final String deleteConfirmDownload;

        @InterfaceC65349Pkn("ad_delete_mobile")
        public final String deleteMobile;

        @InterfaceC65349Pkn("ad_delete_oauth")
        public final String deleteOauth;

        @InterfaceC65349Pkn("ad_delete_passport")
        public final String deletePassport;

        @InterfaceC65349Pkn("ad_delete_status")
        public final String deleteStatus;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountDeleteSettingModel)) {
                return false;
            }
            AccountDeleteSettingModel accountDeleteSettingModel = (AccountDeleteSettingModel) obj;
            return o.LJ(this.deleteConfirm, accountDeleteSettingModel.deleteConfirm) && o.LJ(this.deleteConfirmChild, accountDeleteSettingModel.deleteConfirmChild) && o.LJ(this.deleteConfirmDownload, accountDeleteSettingModel.deleteConfirmDownload) && o.LJ(this.deleteConfirmCheck, accountDeleteSettingModel.deleteConfirmCheck) && o.LJ(this.deletePassport, accountDeleteSettingModel.deletePassport) && o.LJ(this.deleteMobile, accountDeleteSettingModel.deleteMobile) && o.LJ(this.deleteOauth, accountDeleteSettingModel.deleteOauth) && o.LJ(this.deleteStatus, accountDeleteSettingModel.deleteStatus) && o.LJ(this.deactiveOptions, accountDeleteSettingModel.deactiveOptions) && o.LJ(this.deactiveDelete, accountDeleteSettingModel.deactiveDelete) && o.LJ(this.deactiveReminder, accountDeleteSettingModel.deactiveReminder) && o.LJ(this.deactiveMobile, accountDeleteSettingModel.deactiveMobile) && o.LJ(this.deactivePassport, accountDeleteSettingModel.deactivePassport) && o.LJ(this.deactiveOauth, accountDeleteSettingModel.deactiveOauth);
        }

        public final int hashCode() {
            return this.deactiveOauth.hashCode() + C79062V1e.LJ(this.deactivePassport, C79062V1e.LJ(this.deactiveMobile, C79062V1e.LJ(this.deactiveReminder, C79062V1e.LJ(this.deactiveDelete, C79062V1e.LJ(this.deactiveOptions, C79062V1e.LJ(this.deleteStatus, C79062V1e.LJ(this.deleteOauth, C79062V1e.LJ(this.deleteMobile, C79062V1e.LJ(this.deletePassport, C79062V1e.LJ(this.deleteConfirmCheck, C79062V1e.LJ(this.deleteConfirmDownload, C79062V1e.LJ(this.deleteConfirmChild, this.deleteConfirm.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccountDeleteSettingModel(deleteConfirm=");
            sb.append(this.deleteConfirm);
            sb.append(", deleteConfirmChild=");
            sb.append(this.deleteConfirmChild);
            sb.append(", deleteConfirmDownload=");
            sb.append(this.deleteConfirmDownload);
            sb.append(", deleteConfirmCheck=");
            sb.append(this.deleteConfirmCheck);
            sb.append(", deletePassport=");
            sb.append(this.deletePassport);
            sb.append(", deleteMobile=");
            sb.append(this.deleteMobile);
            sb.append(", deleteOauth=");
            sb.append(this.deleteOauth);
            sb.append(", deleteStatus=");
            sb.append(this.deleteStatus);
            sb.append(", deactiveOptions=");
            sb.append(this.deactiveOptions);
            sb.append(", deactiveDelete=");
            sb.append(this.deactiveDelete);
            sb.append(", deactiveReminder=");
            sb.append(this.deactiveReminder);
            sb.append(", deactiveMobile=");
            sb.append(this.deactiveMobile);
            sb.append(", deactivePassport=");
            sb.append(this.deactivePassport);
            sb.append(", deactiveOauth=");
            return C07670Rv.LIZIZ(sb, this.deactiveOauth, ')');
        }

        public AccountDeleteSettingModel(String deleteConfirm, String deleteConfirmChild, String deleteConfirmDownload, String deleteConfirmCheck, String deletePassport, String deleteMobile, String deleteOauth, String deleteStatus, String deactiveOptions, String deactiveDelete, String deactiveReminder, String deactiveMobile, String deactivePassport, String deactiveOauth) {
            o.LJIIIZ(deleteConfirm, "deleteConfirm");
            o.LJIIIZ(deleteConfirmChild, "deleteConfirmChild");
            o.LJIIIZ(deleteConfirmDownload, "deleteConfirmDownload");
            o.LJIIIZ(deleteConfirmCheck, "deleteConfirmCheck");
            o.LJIIIZ(deletePassport, "deletePassport");
            o.LJIIIZ(deleteMobile, "deleteMobile");
            o.LJIIIZ(deleteOauth, "deleteOauth");
            o.LJIIIZ(deleteStatus, "deleteStatus");
            o.LJIIIZ(deactiveOptions, "deactiveOptions");
            o.LJIIIZ(deactiveDelete, "deactiveDelete");
            o.LJIIIZ(deactiveReminder, "deactiveReminder");
            o.LJIIIZ(deactiveMobile, "deactiveMobile");
            o.LJIIIZ(deactivePassport, "deactivePassport");
            o.LJIIIZ(deactiveOauth, "deactiveOauth");
            this.deleteConfirm = deleteConfirm;
            this.deleteConfirmChild = deleteConfirmChild;
            this.deleteConfirmDownload = deleteConfirmDownload;
            this.deleteConfirmCheck = deleteConfirmCheck;
            this.deletePassport = deletePassport;
            this.deleteMobile = deleteMobile;
            this.deleteOauth = deleteOauth;
            this.deleteStatus = deleteStatus;
            this.deactiveOptions = deactiveOptions;
            this.deactiveDelete = deactiveDelete;
            this.deactiveReminder = deactiveReminder;
            this.deactiveMobile = deactiveMobile;
            this.deactivePassport = deactivePassport;
            this.deactiveOauth = deactiveOauth;
        }
    }

    public static final AccountDeleteSettingModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        AccountDeleteSettingModel accountDeleteSettingModel = LIZ;
        AccountDeleteSettingModel accountDeleteSettingModel2 = (AccountDeleteSettingModel) LIZLLL.LJIIIIZZ("account_deletion", AccountDeleteSettingModel.class, accountDeleteSettingModel);
        if (accountDeleteSettingModel2 != null) {
            String str = accountDeleteSettingModel2.deleteConfirm;
            if (str == null) {
                str = accountDeleteSettingModel.deleteConfirm;
            }
            String str2 = accountDeleteSettingModel2.deleteConfirmChild;
            if (str2 == null) {
                str2 = accountDeleteSettingModel.deleteConfirmChild;
            }
            String str3 = accountDeleteSettingModel2.deleteConfirmDownload;
            if (str3 == null) {
                str3 = accountDeleteSettingModel.deleteConfirmDownload;
            }
            String str4 = accountDeleteSettingModel2.deleteConfirmCheck;
            if (str4 == null) {
                str4 = accountDeleteSettingModel.deleteConfirmCheck;
            }
            String str5 = accountDeleteSettingModel2.deletePassport;
            if (str5 == null) {
                str5 = accountDeleteSettingModel.deletePassport;
            }
            String str6 = accountDeleteSettingModel2.deleteMobile;
            if (str6 == null) {
                str6 = accountDeleteSettingModel.deleteMobile;
            }
            String str7 = accountDeleteSettingModel2.deleteOauth;
            if (str7 == null) {
                str7 = accountDeleteSettingModel.deleteOauth;
            }
            String str8 = accountDeleteSettingModel2.deleteStatus;
            if (str8 == null) {
                str8 = accountDeleteSettingModel.deleteStatus;
            }
            String str9 = accountDeleteSettingModel2.deactiveOptions;
            if (str9 == null) {
                str9 = accountDeleteSettingModel.deactiveOptions;
            }
            String str10 = accountDeleteSettingModel2.deactiveReminder;
            if (str10 == null) {
                str10 = accountDeleteSettingModel.deactiveReminder;
            }
            String str11 = accountDeleteSettingModel2.deactiveMobile;
            if (str11 == null) {
                str11 = accountDeleteSettingModel.deactiveMobile;
            }
            String str12 = accountDeleteSettingModel2.deactivePassport;
            if (str12 == null) {
                str12 = accountDeleteSettingModel.deactivePassport;
            }
            String str13 = accountDeleteSettingModel2.deactiveDelete;
            if (str13 == null) {
                str13 = accountDeleteSettingModel.deactiveDelete;
            }
            String str14 = accountDeleteSettingModel2.deactiveOauth;
            if (str14 == null) {
                str14 = accountDeleteSettingModel.deactiveOauth;
            }
            return new AccountDeleteSettingModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str13, str10, str11, str12, str14);
        }
        return accountDeleteSettingModel;
    }
}
