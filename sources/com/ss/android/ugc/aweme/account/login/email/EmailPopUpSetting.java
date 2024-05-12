package com.ss.android.ugc.aweme.account.login.email;

import X.InterfaceC65349Pkn;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class EmailPopUpSetting {
    public static final PassportEmailPopupSettingsModel LIZ = new PassportEmailPopupSettingsModel(new PopupFrequencyInfo(604800, 2, 1814400), new AddEmailPopupStrings("", "", "", "", "", ""));

    public static final PassportEmailPopupSettingsModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PassportEmailPopupSettingsModel passportEmailPopupSettingsModel = LIZ;
        PassportEmailPopupSettingsModel passportEmailPopupSettingsModel2 = (PassportEmailPopupSettingsModel) LIZLLL.LJIIIIZZ("passport_email_popup_settings", PassportEmailPopupSettingsModel.class, passportEmailPopupSettingsModel);
        if (passportEmailPopupSettingsModel2 == null) {
            return passportEmailPopupSettingsModel;
        }
        return passportEmailPopupSettingsModel2;
    }

    /* loaded from: classes12.dex */
    public static final class PassportEmailPopupSettingsModel {

        @InterfaceC65349Pkn("add_email_popup_strings")
        public final AddEmailPopupStrings addEmailPopupStrings;

        @InterfaceC65349Pkn("popup_frequency_info")
        public final PopupFrequencyInfo popupFrequencyInfo;

        public PassportEmailPopupSettingsModel(PopupFrequencyInfo popupFrequencyInfo, AddEmailPopupStrings addEmailPopupStrings) {
            o.LJIIIZ(popupFrequencyInfo, "popupFrequencyInfo");
            o.LJIIIZ(addEmailPopupStrings, "addEmailPopupStrings");
            this.popupFrequencyInfo = popupFrequencyInfo;
            this.addEmailPopupStrings = addEmailPopupStrings;
        }
    }

    /* loaded from: classes12.dex */
    public static final class PopupFrequencyInfo {

        @InterfaceC65349Pkn("email_pop_up_dismiss_soft_cap")
        public final long emailPopUpDismissSoftCap;

        @InterfaceC65349Pkn("email_popup_freq")
        public final long emailPopupFreq;

        @InterfaceC65349Pkn("email_popup_reduced_freq")
        public final long emailPopupReducedFreq;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PopupFrequencyInfo() {
            /*
                r9 = this;
                r1 = 0
                r7 = 7
                r8 = 0
                r0 = r9
                r3 = r1
                r5 = r1
                r0.<init>(r1, r3, r5, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.PopupFrequencyInfo.<init>():void");
        }

        public PopupFrequencyInfo(long j, long j2, long j3) {
            this.emailPopupFreq = j;
            this.emailPopUpDismissSoftCap = j2;
            this.emailPopupReducedFreq = j3;
        }

        public /* synthetic */ PopupFrequencyInfo(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 604800L : j, (i & 2) != 0 ? 2L : j2, (i & 4) != 0 ? 1814400L : j3);
        }
    }

    /* loaded from: classes16.dex */
    public static final class AddEmailPopupStrings {

        @InterfaceC65349Pkn("action_sheet_place_holder")
        public final String actionSheetPlaceHolder;

        @InterfaceC65349Pkn("action_sheet_title")
        public final String actionSheetTitle;

        @InterfaceC65349Pkn("one_step_action_sheet_body")
        public final String oneStepActionSheetBody;

        @InterfaceC65349Pkn("popup_body")
        public final String popupBody;

        @InterfaceC65349Pkn("popup_title")
        public final String popupTitle;

        @InterfaceC65349Pkn("two_step_action_sheet_body")
        public final String twoStepActionSheetBody;

        public AddEmailPopupStrings(String actionSheetPlaceHolder, String actionSheetTitle, String twoStepActionSheetBody, String popupTitle, String oneStepActionSheetBody, String popupBody) {
            o.LJIIIZ(actionSheetPlaceHolder, "actionSheetPlaceHolder");
            o.LJIIIZ(actionSheetTitle, "actionSheetTitle");
            o.LJIIIZ(twoStepActionSheetBody, "twoStepActionSheetBody");
            o.LJIIIZ(popupTitle, "popupTitle");
            o.LJIIIZ(oneStepActionSheetBody, "oneStepActionSheetBody");
            o.LJIIIZ(popupBody, "popupBody");
            this.actionSheetPlaceHolder = actionSheetPlaceHolder;
            this.actionSheetTitle = actionSheetTitle;
            this.twoStepActionSheetBody = twoStepActionSheetBody;
            this.popupTitle = popupTitle;
            this.oneStepActionSheetBody = oneStepActionSheetBody;
            this.popupBody = popupBody;
        }
    }
}
