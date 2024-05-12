package com.ss.android.ugc.aweme.account.experiment.prompt;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ShowPromptToConfirmDynamicDataExperiment {
    public static final MetaData LIZ = new MetaData(C47261Igj.LJJIJIIJI("US", "AU"), new Frequency(604800, 2, 4, 604800, 2, 3, 604800, 604800, 604800), new Strings("Reconfirm phone number", "Your phone number may be used to connect you to people you may know, improve ads, and more, based on your settings. If you don’t reconfirm, your phone number will remain on your account until you delete it. Learn more in the %s", "ROW popup update action for phone", "Confirm", "Reconfirm email", "Your email may be used to connect you to people you may know, improve ads, and more, based on your settings. If you don’t reconfirm, your email will remain on your account until you delete it. Learn more in the %s", "Update", "ROW popup confirm action for email", "Confirm use of phone", "Your phone number may be used to connect you to people you may know, improve ads, and more, based on your settings. Learn more in the %s", "Not now", "Confirm", "Confirm use of email", "Your email may be used to connect you to people you may know, improve ads, and more, based on your settings. Learn more in the %s", "Not now", "Confirm"));

    public static final MetaData LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MetaData metaData = LIZ;
        MetaData metaData2 = (MetaData) LIZLLL.LJIIIIZZ("confirm_email_phone_phase2", MetaData.class, metaData);
        if (metaData2 == null) {
            return metaData;
        }
        return metaData2;
    }

    /* loaded from: classes14.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("non_auto_verify_countries")
        public final List<String> nonAutoVerifyCountries;

        @InterfaceC65349Pkn("verify_email_phone_frequency_control")
        public final Frequency verifyEmailPhoneFrequencyControl;

        @InterfaceC65349Pkn("verify_email_phone_popup_strings")
        public final Strings verifyEmailPhonePopupStrings;

        public MetaData(List<String> nonAutoVerifyCountries, Frequency verifyEmailPhoneFrequencyControl, Strings verifyEmailPhonePopupStrings) {
            o.LJIIIZ(nonAutoVerifyCountries, "nonAutoVerifyCountries");
            o.LJIIIZ(verifyEmailPhoneFrequencyControl, "verifyEmailPhoneFrequencyControl");
            o.LJIIIZ(verifyEmailPhonePopupStrings, "verifyEmailPhonePopupStrings");
            this.nonAutoVerifyCountries = nonAutoVerifyCountries;
            this.verifyEmailPhoneFrequencyControl = verifyEmailPhoneFrequencyControl;
            this.verifyEmailPhonePopupStrings = verifyEmailPhonePopupStrings;
        }
    }

    /* loaded from: classes14.dex */
    public static final class Frequency {

        @InterfaceC65349Pkn("auto_confirm_adjusted_freq")
        public final int autoConfirmSysAdjustedFreq;

        @InterfaceC65349Pkn("auto_confirm_dismiss_soft_cap")
        public final int autoConfirmSysDismissSoftCap;

        @InterfaceC65349Pkn("auto_confirm_maximum_number_displayed")
        public final int autoConfirmSysMaxNumberDisplayed;

        @InterfaceC65349Pkn("auto_confirm_pop_freq")
        public final int autoConfirmSysPopFreq;

        @InterfaceC65349Pkn("non_auto_confirm_adjusted_freq")
        public final int nonAutoConfirmSysAdjustedFreq;

        @InterfaceC65349Pkn("non_auto_confirm_dismiss_soft_cap")
        public final int nonAutoConfirmSysDismissSoftCap;

        @InterfaceC65349Pkn("non_auto_confirm_maximum_number_displayed")
        public final int nonAutoConfirmSysMaxNumberDisplayed;

        @InterfaceC65349Pkn("non_auto_confirm_pop_freq")
        public final int nonAutoConfirmSysPopFreq;

        @InterfaceC65349Pkn("time_after_login")
        public final int timeAfterLogin;

        public Frequency(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.autoConfirmSysAdjustedFreq = i;
            this.autoConfirmSysDismissSoftCap = i2;
            this.autoConfirmSysMaxNumberDisplayed = i3;
            this.autoConfirmSysPopFreq = i4;
            this.nonAutoConfirmSysAdjustedFreq = i5;
            this.nonAutoConfirmSysDismissSoftCap = i6;
            this.nonAutoConfirmSysMaxNumberDisplayed = i7;
            this.nonAutoConfirmSysPopFreq = i8;
            this.timeAfterLogin = i9;
        }
    }

    /* loaded from: classes14.dex */
    public static final class Strings {

        @InterfaceC65349Pkn("auto_confirm_popup_body_email")
        public final String autoConfirmPopupBodyEmail;

        @InterfaceC65349Pkn("auto_confirm_popup_body_phone")
        public final String autoConfirmPopupBodyPhone;

        @InterfaceC65349Pkn("auto_confirm_popup_confirm_email")
        public final String autoConfirmPopupConfirmEmail;

        @InterfaceC65349Pkn("auto_confirm_popup_confirm_phone")
        public final String autoConfirmPopupConfirmPhone;

        @InterfaceC65349Pkn("auto_confirm_popup_header_email")
        public final String autoConfirmPopupHeaderEmail;

        @InterfaceC65349Pkn("auto_confirm_popup_header_phone")
        public final String autoConfirmPopupHeaderPhone;

        @InterfaceC65349Pkn("auto_confirm_popup_update_email")
        public final String autoConfirmPopupUpdateEmail;

        @InterfaceC65349Pkn("auto_confirm_popup_update_phone")
        public final String autoConfirmPopupUpdatePhone;

        @InterfaceC65349Pkn("non_auto_confirm_popup_body_email")
        public final String nonAutoConfirmPopupBodyEmail;

        @InterfaceC65349Pkn("non_auto_confirm_popup_body_phone")
        public final String nonAutoConfirmPopupBodyPhone;

        @InterfaceC65349Pkn("non_auto_confirm_popup_confirm_email")
        public final String nonAutoConfirmPopupConfirmEmail;

        @InterfaceC65349Pkn("non_auto_confirm_popup_confirm_phone")
        public final String nonAutoConfirmPopupConfirmPhone;

        @InterfaceC65349Pkn("non_auto_confirm_popup_header_email")
        public final String nonAutoConfirmPopupHeaderEmail;

        @InterfaceC65349Pkn("non_auto_confirm_popup_header_phone")
        public final String nonAutoConfirmPopupHeaderPhone;

        @InterfaceC65349Pkn("non_auto_confirm_popup_notnow_email")
        public final String nonAutoConfirmPopupNotnowEmail;

        @InterfaceC65349Pkn("non_auto_confirm_popup_notnow_phone")
        public final String nonAutoConfirmPopupNotnowPhone;

        public Strings(String autoConfirmPopupHeaderPhone, String autoConfirmPopupBodyPhone, String autoConfirmPopupUpdatePhone, String autoConfirmPopupConfirmPhone, String autoConfirmPopupHeaderEmail, String autoConfirmPopupBodyEmail, String autoConfirmPopupUpdateEmail, String autoConfirmPopupConfirmEmail, String nonAutoConfirmPopupHeaderPhone, String nonAutoConfirmPopupBodyPhone, String nonAutoConfirmPopupNotnowPhone, String nonAutoConfirmPopupConfirmPhone, String nonAutoConfirmPopupHeaderEmail, String nonAutoConfirmPopupBodyEmail, String nonAutoConfirmPopupNotnowEmail, String nonAutoConfirmPopupConfirmEmail) {
            o.LJIIIZ(autoConfirmPopupHeaderPhone, "autoConfirmPopupHeaderPhone");
            o.LJIIIZ(autoConfirmPopupBodyPhone, "autoConfirmPopupBodyPhone");
            o.LJIIIZ(autoConfirmPopupUpdatePhone, "autoConfirmPopupUpdatePhone");
            o.LJIIIZ(autoConfirmPopupConfirmPhone, "autoConfirmPopupConfirmPhone");
            o.LJIIIZ(autoConfirmPopupHeaderEmail, "autoConfirmPopupHeaderEmail");
            o.LJIIIZ(autoConfirmPopupBodyEmail, "autoConfirmPopupBodyEmail");
            o.LJIIIZ(autoConfirmPopupUpdateEmail, "autoConfirmPopupUpdateEmail");
            o.LJIIIZ(autoConfirmPopupConfirmEmail, "autoConfirmPopupConfirmEmail");
            o.LJIIIZ(nonAutoConfirmPopupHeaderPhone, "nonAutoConfirmPopupHeaderPhone");
            o.LJIIIZ(nonAutoConfirmPopupBodyPhone, "nonAutoConfirmPopupBodyPhone");
            o.LJIIIZ(nonAutoConfirmPopupNotnowPhone, "nonAutoConfirmPopupNotnowPhone");
            o.LJIIIZ(nonAutoConfirmPopupConfirmPhone, "nonAutoConfirmPopupConfirmPhone");
            o.LJIIIZ(nonAutoConfirmPopupHeaderEmail, "nonAutoConfirmPopupHeaderEmail");
            o.LJIIIZ(nonAutoConfirmPopupBodyEmail, "nonAutoConfirmPopupBodyEmail");
            o.LJIIIZ(nonAutoConfirmPopupNotnowEmail, "nonAutoConfirmPopupNotnowEmail");
            o.LJIIIZ(nonAutoConfirmPopupConfirmEmail, "nonAutoConfirmPopupConfirmEmail");
            this.autoConfirmPopupHeaderPhone = autoConfirmPopupHeaderPhone;
            this.autoConfirmPopupBodyPhone = autoConfirmPopupBodyPhone;
            this.autoConfirmPopupUpdatePhone = autoConfirmPopupUpdatePhone;
            this.autoConfirmPopupConfirmPhone = autoConfirmPopupConfirmPhone;
            this.autoConfirmPopupHeaderEmail = autoConfirmPopupHeaderEmail;
            this.autoConfirmPopupBodyEmail = autoConfirmPopupBodyEmail;
            this.autoConfirmPopupUpdateEmail = autoConfirmPopupUpdateEmail;
            this.autoConfirmPopupConfirmEmail = autoConfirmPopupConfirmEmail;
            this.nonAutoConfirmPopupHeaderPhone = nonAutoConfirmPopupHeaderPhone;
            this.nonAutoConfirmPopupBodyPhone = nonAutoConfirmPopupBodyPhone;
            this.nonAutoConfirmPopupNotnowPhone = nonAutoConfirmPopupNotnowPhone;
            this.nonAutoConfirmPopupConfirmPhone = nonAutoConfirmPopupConfirmPhone;
            this.nonAutoConfirmPopupHeaderEmail = nonAutoConfirmPopupHeaderEmail;
            this.nonAutoConfirmPopupBodyEmail = nonAutoConfirmPopupBodyEmail;
            this.nonAutoConfirmPopupNotnowEmail = nonAutoConfirmPopupNotnowEmail;
            this.nonAutoConfirmPopupConfirmEmail = nonAutoConfirmPopupConfirmEmail;
        }
    }
}
