package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C1FL;
import X.C27240Ama;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ClientConfig implements Parcelable {
    public static final Parcelable.Creator<ClientConfig> CREATOR = new C27240Ama();

    @InterfaceC65349Pkn("address_district_incomplete_error")
    public final String addressDistrictInCompletError;

    @InterfaceC65349Pkn("address_district_length")
    public final String addressDistrictLength;

    @InterfaceC65349Pkn("concatenate_address_error")
    public final String concatenateAddressError;

    @InterfaceC65349Pkn("concatenate_address_keys")
    public final String concatenateAddressKeys;

    @InterfaceC65349Pkn("concatenate_address_rule")
    public final String concatenateAddressRule;

    @InterfaceC65349Pkn("concatenate_name_error")
    public final String concatenateNameError;

    @InterfaceC65349Pkn("concatenate_name_keys")
    public final String concatenateNameKeys;

    @InterfaceC65349Pkn("concatenate_name_rule")
    public final String concatenateNameRule;

    @InterfaceC65349Pkn("disable_region_code_change")
    public final Boolean disableRegionCodeChange;

    @InterfaceC65349Pkn("districts_concatenate_keys")
    public final String districtsConcatenateKeys;

    @InterfaceC65349Pkn("enable_concatenate_address_check")
    public final Boolean enableConcatenateAddressCheck;

    @InterfaceC65349Pkn("enable_district_reverse_order")
    public final Boolean enableDistrictReverseOrder;

    @InterfaceC65349Pkn("enable_district_tab")
    public final Boolean enableDistrictTab;

    @InterfaceC65349Pkn("enable_focus_candidate_input")
    public final Boolean enableFocusCandidateInput;

    @InterfaceC65349Pkn("enable_new_ui")
    public final Boolean enableNewUi;

    @InterfaceC65349Pkn("enable_remove_leading_trailing_space")
    public final Boolean enableRemoveLeadingTrailingSpace;

    @InterfaceC65349Pkn("enable_single_line_region")
    public final Boolean enableSingleLineRegion;

    @InterfaceC65349Pkn("enable_phone_prefix_check_country")
    public final String phonePrefixCheckCountrys;

    @InterfaceC65349Pkn("single_line_name_keys")
    public final String singleLineNameKeys;

    @InterfaceC65349Pkn("single_stage_selector_keys")
    public final String singleStageSelectorKeys;

    @InterfaceC65349Pkn("space_trim_keys")
    public final String spaceTrimKeys;

    @InterfaceC65349Pkn("enable_wake_up_keyboard_element")
    public final String wakeUpKeyBoardKeys;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientConfig)) {
            return false;
        }
        ClientConfig clientConfig = (ClientConfig) obj;
        return o.LJ(this.enableDistrictTab, clientConfig.enableDistrictTab) && o.LJ(this.enableConcatenateAddressCheck, clientConfig.enableConcatenateAddressCheck) && o.LJ(this.concatenateAddressRule, clientConfig.concatenateAddressRule) && o.LJ(this.enableNewUi, clientConfig.enableNewUi) && o.LJ(this.districtsConcatenateKeys, clientConfig.districtsConcatenateKeys) && o.LJ(this.singleStageSelectorKeys, clientConfig.singleStageSelectorKeys) && o.LJ(this.disableRegionCodeChange, clientConfig.disableRegionCodeChange) && o.LJ(this.concatenateAddressError, clientConfig.concatenateAddressError) && o.LJ(this.concatenateAddressKeys, clientConfig.concatenateAddressKeys) && o.LJ(this.spaceTrimKeys, clientConfig.spaceTrimKeys) && o.LJ(this.phonePrefixCheckCountrys, clientConfig.phonePrefixCheckCountrys) && o.LJ(this.wakeUpKeyBoardKeys, clientConfig.wakeUpKeyBoardKeys) && o.LJ(this.addressDistrictLength, clientConfig.addressDistrictLength) && o.LJ(this.addressDistrictInCompletError, clientConfig.addressDistrictInCompletError) && o.LJ(this.enableRemoveLeadingTrailingSpace, clientConfig.enableRemoveLeadingTrailingSpace) && o.LJ(this.singleLineNameKeys, clientConfig.singleLineNameKeys) && o.LJ(this.concatenateNameError, clientConfig.concatenateNameError) && o.LJ(this.concatenateNameRule, clientConfig.concatenateNameRule) && o.LJ(this.concatenateNameKeys, clientConfig.concatenateNameKeys) && o.LJ(this.enableFocusCandidateInput, clientConfig.enableFocusCandidateInput) && o.LJ(this.enableSingleLineRegion, clientConfig.enableSingleLineRegion) && o.LJ(this.enableDistrictReverseOrder, clientConfig.enableDistrictReverseOrder);
    }

    public final int hashCode() {
        Boolean bool = this.enableDistrictTab;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.enableConcatenateAddressCheck;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.concatenateAddressRule;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.enableNewUi;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.districtsConcatenateKeys;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.singleStageSelectorKeys;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this.disableRegionCodeChange;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str4 = this.concatenateAddressError;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.concatenateAddressKeys;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.spaceTrimKeys;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phonePrefixCheckCountrys;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.wakeUpKeyBoardKeys;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressDistrictLength;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.addressDistrictInCompletError;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool5 = this.enableRemoveLeadingTrailingSpace;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str11 = this.singleLineNameKeys;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.concatenateNameError;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.concatenateNameRule;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.concatenateNameKeys;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool6 = this.enableFocusCandidateInput;
        int hashCode20 = (hashCode19 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.enableSingleLineRegion;
        int hashCode21 = (hashCode20 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableDistrictReverseOrder;
        return hashCode21 + (bool8 != null ? bool8.hashCode() : 0);
    }

    public final String toString() {
        return "ClientConfig(enableDistrictTab=" + this.enableDistrictTab + ", enableConcatenateAddressCheck=" + this.enableConcatenateAddressCheck + ", concatenateAddressRule=" + this.concatenateAddressRule + ", enableNewUi=" + this.enableNewUi + ", districtsConcatenateKeys=" + this.districtsConcatenateKeys + ", singleStageSelectorKeys=" + this.singleStageSelectorKeys + ", disableRegionCodeChange=" + this.disableRegionCodeChange + ", concatenateAddressError=" + this.concatenateAddressError + ", concatenateAddressKeys=" + this.concatenateAddressKeys + ", spaceTrimKeys=" + this.spaceTrimKeys + ", phonePrefixCheckCountrys=" + this.phonePrefixCheckCountrys + ", wakeUpKeyBoardKeys=" + this.wakeUpKeyBoardKeys + ", addressDistrictLength=" + this.addressDistrictLength + ", addressDistrictInCompletError=" + this.addressDistrictInCompletError + ", enableRemoveLeadingTrailingSpace=" + this.enableRemoveLeadingTrailingSpace + ", singleLineNameKeys=" + this.singleLineNameKeys + ", concatenateNameError=" + this.concatenateNameError + ", concatenateNameRule=" + this.concatenateNameRule + ", concatenateNameKeys=" + this.concatenateNameKeys + ", enableFocusCandidateInput=" + this.enableFocusCandidateInput + ", enableSingleLineRegion=" + this.enableSingleLineRegion + ", enableDistrictReverseOrder=" + this.enableDistrictReverseOrder + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.enableDistrictTab;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.enableConcatenateAddressCheck;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeString(this.concatenateAddressRule);
        Boolean bool3 = this.enableNewUi;
        if (bool3 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool3);
        }
        out.writeString(this.districtsConcatenateKeys);
        out.writeString(this.singleStageSelectorKeys);
        Boolean bool4 = this.disableRegionCodeChange;
        if (bool4 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool4);
        }
        out.writeString(this.concatenateAddressError);
        out.writeString(this.concatenateAddressKeys);
        out.writeString(this.spaceTrimKeys);
        out.writeString(this.phonePrefixCheckCountrys);
        out.writeString(this.wakeUpKeyBoardKeys);
        out.writeString(this.addressDistrictLength);
        out.writeString(this.addressDistrictInCompletError);
        Boolean bool5 = this.enableRemoveLeadingTrailingSpace;
        if (bool5 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool5);
        }
        out.writeString(this.singleLineNameKeys);
        out.writeString(this.concatenateNameError);
        out.writeString(this.concatenateNameRule);
        out.writeString(this.concatenateNameKeys);
        Boolean bool6 = this.enableFocusCandidateInput;
        if (bool6 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool6);
        }
        Boolean bool7 = this.enableSingleLineRegion;
        if (bool7 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool7);
        }
        Boolean bool8 = this.enableDistrictReverseOrder;
        if (bool8 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool8);
        }
    }

    public ClientConfig(Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, String str3, Boolean bool4, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool5, String str11, String str12, String str13, String str14, Boolean bool6, Boolean bool7, Boolean bool8) {
        this.enableDistrictTab = bool;
        this.enableConcatenateAddressCheck = bool2;
        this.concatenateAddressRule = str;
        this.enableNewUi = bool3;
        this.districtsConcatenateKeys = str2;
        this.singleStageSelectorKeys = str3;
        this.disableRegionCodeChange = bool4;
        this.concatenateAddressError = str4;
        this.concatenateAddressKeys = str5;
        this.spaceTrimKeys = str6;
        this.phonePrefixCheckCountrys = str7;
        this.wakeUpKeyBoardKeys = str8;
        this.addressDistrictLength = str9;
        this.addressDistrictInCompletError = str10;
        this.enableRemoveLeadingTrailingSpace = bool5;
        this.singleLineNameKeys = str11;
        this.concatenateNameError = str12;
        this.concatenateNameRule = str13;
        this.concatenateNameKeys = str14;
        this.enableFocusCandidateInput = bool6;
        this.enableSingleLineRegion = bool7;
        this.enableDistrictReverseOrder = bool8;
    }
}
