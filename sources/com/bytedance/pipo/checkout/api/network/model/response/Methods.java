package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Methods {

    @InterfaceC65349Pkn("agreement_tag")
    public String agreementTag;

    @InterfaceC65349Pkn("card_type")
    public String cardType;

    @InterfaceC65349Pkn("checkbox")
    public CheckBox checkbox;

    @InterfaceC65349Pkn("configuration")
    public String configuration;

    @InterfaceC65349Pkn("dark_mode_icon_url")
    public String darkModeIconUrl;

    @InterfaceC65349Pkn("display_name")
    public String displayName;

    @InterfaceC65349Pkn("elements")
    public List<Elements> elements;

    @InterfaceC65349Pkn("extra_msg")
    public String extraMsg;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("integration_method")
    public String integrationMethod;

    @InterfaceC65349Pkn("is_default")
    public Boolean isDefault;

    @InterfaceC65349Pkn("max_limited_amount")
    public String maxLimitedAmount;

    @InterfaceC65349Pkn("min_limited_amount")
    public String minLimitedAmount;

    @InterfaceC65349Pkn("model")
    public String model;

    @InterfaceC65349Pkn("package_name")
    public String packageName;

    @InterfaceC65349Pkn("payment_method")
    public String paymentMethod;

    @InterfaceC65349Pkn("payment_method_extra")
    public String paymentMethodExtra;

    @InterfaceC65349Pkn("payment_method_id")
    public String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_type")
    public String paymentMethodType;

    @InterfaceC65349Pkn("payment_type")
    public PaymentType paymentType;

    @InterfaceC65349Pkn("pci_sensitive")
    public Boolean pciSensitive;

    @InterfaceC65349Pkn("redirect_method")
    public String redirectMethod;

    @InterfaceC65349Pkn("saveable")
    public Boolean saveable;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    @InterfaceC65349Pkn("unavailable_code")
    public String unavailableCode;

    @InterfaceC65349Pkn("unavailable_msg")
    public String unavailableMsg;

    @InterfaceC65349Pkn("user_type")
    public String userType;

    public Methods() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    public static /* synthetic */ Methods copy$default(Methods methods, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, PaymentType paymentType, String str17, String str18, String str19, String str20, CheckBox checkBox, Boolean bool3, String str21, String str22, int i, Object obj) {
        Boolean bool4 = bool;
        String str23 = str11;
        String str24 = str10;
        String str25 = str9;
        String str26 = str8;
        List list2 = list;
        Boolean bool5 = bool2;
        String str27 = str7;
        String str28 = str2;
        String str29 = str;
        String str30 = str3;
        String str31 = str4;
        String str32 = str5;
        String str33 = str6;
        String str34 = str22;
        Boolean bool6 = bool3;
        CheckBox checkBox2 = checkBox;
        String str35 = str20;
        String str36 = str19;
        String str37 = str18;
        String str38 = str17;
        String str39 = str13;
        String str40 = str21;
        String str41 = str12;
        String str42 = str14;
        String str43 = str15;
        String str44 = str16;
        PaymentType paymentType2 = paymentType;
        if ((i & 1) != 0) {
            str29 = methods.paymentMethodId;
        }
        if ((i & 2) != 0) {
            str28 = methods.paymentMethod;
        }
        if ((i & 4) != 0) {
            str30 = methods.iconUrl;
        }
        if ((i & 8) != 0) {
            str31 = methods.darkModeIconUrl;
        }
        if ((i & 16) != 0) {
            str32 = methods.paymentMethodType;
        }
        if ((i & 32) != 0) {
            str33 = methods.displayName;
        }
        if ((i & 64) != 0) {
            str27 = methods.starlingKey;
        }
        if ((i & 128) != 0) {
            list2 = methods.elements;
        }
        if ((i & 256) != 0) {
            str26 = methods.maxLimitedAmount;
        }
        if ((i & 512) != 0) {
            str25 = methods.minLimitedAmount;
        }
        if ((i & 1024) != 0) {
            str24 = methods.packageName;
        }
        if ((i & 2048) != 0) {
            str23 = methods.schema;
        }
        if ((i & 4096) != 0) {
            bool4 = methods.pciSensitive;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            bool5 = methods.saveable;
        }
        if ((i & 16384) != 0) {
            str41 = methods.paymentMethodExtra;
        }
        if ((32768 & i) != 0) {
            str39 = methods.configuration;
        }
        if ((65536 & i) != 0) {
            str42 = methods.extraMsg;
        }
        if ((131072 & i) != 0) {
            str43 = methods.integrationMethod;
        }
        if ((262144 & i) != 0) {
            str44 = methods.redirectMethod;
        }
        if ((524288 & i) != 0) {
            paymentType2 = methods.paymentType;
        }
        if ((1048576 & i) != 0) {
            str38 = methods.userType;
        }
        if ((2097152 & i) != 0) {
            str37 = methods.model;
        }
        if ((4194304 & i) != 0) {
            str36 = methods.agreementTag;
        }
        if ((8388608 & i) != 0) {
            str35 = methods.cardType;
        }
        if ((16777216 & i) != 0) {
            checkBox2 = methods.checkbox;
        }
        if ((33554432 & i) != 0) {
            bool6 = methods.isDefault;
        }
        if ((67108864 & i) != 0) {
            str40 = methods.unavailableCode;
        }
        if ((i & 134217728) != 0) {
            str34 = methods.unavailableMsg;
        }
        String str45 = str40;
        String str46 = str34;
        return methods.copy(str29, str28, str30, str31, str32, str33, str27, list2, str26, str25, str24, str23, bool4, bool5, str41, str39, str42, str43, str44, paymentType2, str38, str37, str36, str35, checkBox2, bool6, str45, str46);
    }

    public final Methods copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Elements> list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, PaymentType paymentType, String str17, String str18, String str19, String str20, CheckBox checkBox, Boolean bool3, String str21, String str22) {
        return new Methods(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11, bool, bool2, str12, str13, str14, str15, str16, paymentType, str17, str18, str19, str20, checkBox, bool3, str21, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Methods)) {
            return false;
        }
        Methods methods = (Methods) obj;
        return o.LJ(this.paymentMethodId, methods.paymentMethodId) && o.LJ(this.paymentMethod, methods.paymentMethod) && o.LJ(this.iconUrl, methods.iconUrl) && o.LJ(this.darkModeIconUrl, methods.darkModeIconUrl) && o.LJ(this.paymentMethodType, methods.paymentMethodType) && o.LJ(this.displayName, methods.displayName) && o.LJ(this.starlingKey, methods.starlingKey) && o.LJ(this.elements, methods.elements) && o.LJ(this.maxLimitedAmount, methods.maxLimitedAmount) && o.LJ(this.minLimitedAmount, methods.minLimitedAmount) && o.LJ(this.packageName, methods.packageName) && o.LJ(this.schema, methods.schema) && o.LJ(this.pciSensitive, methods.pciSensitive) && o.LJ(this.saveable, methods.saveable) && o.LJ(this.paymentMethodExtra, methods.paymentMethodExtra) && o.LJ(this.configuration, methods.configuration) && o.LJ(this.extraMsg, methods.extraMsg) && o.LJ(this.integrationMethod, methods.integrationMethod) && o.LJ(this.redirectMethod, methods.redirectMethod) && o.LJ(this.paymentType, methods.paymentType) && o.LJ(this.userType, methods.userType) && o.LJ(this.model, methods.model) && o.LJ(this.agreementTag, methods.agreementTag) && o.LJ(this.cardType, methods.cardType) && o.LJ(this.checkbox, methods.checkbox) && o.LJ(this.isDefault, methods.isDefault) && o.LJ(this.unavailableCode, methods.unavailableCode) && o.LJ(this.unavailableMsg, methods.unavailableMsg);
    }

    public int hashCode() {
        String str = this.paymentMethodId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentMethod;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkModeIconUrl;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentMethodType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.starlingKey;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<Elements> list = this.elements;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.maxLimitedAmount;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.minLimitedAmount;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.packageName;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.schema;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool = this.pciSensitive;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.saveable;
        int hashCode14 = (hashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str12 = this.paymentMethodExtra;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.configuration;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.extraMsg;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.integrationMethod;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.redirectMethod;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        PaymentType paymentType = this.paymentType;
        int hashCode20 = (hashCode19 + (paymentType == null ? 0 : paymentType.hashCode())) * 31;
        String str17 = this.userType;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.model;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.agreementTag;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.cardType;
        int hashCode24 = (hashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        CheckBox checkBox = this.checkbox;
        int hashCode25 = (hashCode24 + (checkBox == null ? 0 : checkBox.hashCode())) * 31;
        Boolean bool3 = this.isDefault;
        int hashCode26 = (hashCode25 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str21 = this.unavailableCode;
        int hashCode27 = (hashCode26 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.unavailableMsg;
        return hashCode27 + (str22 != null ? str22.hashCode() : 0);
    }

    public String toString() {
        return "Methods(paymentMethodId=" + ((Object) this.paymentMethodId) + ", paymentMethod=" + ((Object) this.paymentMethod) + ", iconUrl=" + ((Object) this.iconUrl) + ", darkModeIconUrl=" + ((Object) this.darkModeIconUrl) + ", paymentMethodType=" + ((Object) this.paymentMethodType) + ", displayName=" + ((Object) this.displayName) + ", starlingKey=" + ((Object) this.starlingKey) + ", elements=" + this.elements + ", maxLimitedAmount=" + ((Object) this.maxLimitedAmount) + ", minLimitedAmount=" + ((Object) this.minLimitedAmount) + ", packageName=" + ((Object) this.packageName) + ", schema=" + ((Object) this.schema) + ", pciSensitive=" + this.pciSensitive + ", saveable=" + this.saveable + ", paymentMethodExtra=" + ((Object) this.paymentMethodExtra) + ", configuration=" + ((Object) this.configuration) + ", extraMsg=" + ((Object) this.extraMsg) + ", integrationMethod=" + ((Object) this.integrationMethod) + ", redirectMethod=" + ((Object) this.redirectMethod) + ", paymentType=" + this.paymentType + ", userType=" + ((Object) this.userType) + ", model=" + ((Object) this.model) + ", agreementTag=" + ((Object) this.agreementTag) + ", cardType=" + ((Object) this.cardType) + ", checkbox=" + this.checkbox + ", isDefault=" + this.isDefault + ", unavailableCode=" + ((Object) this.unavailableCode) + ", unavailableMsg=" + ((Object) this.unavailableMsg) + ')';
    }

    public final String getAgreementTag() {
        return this.agreementTag;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final CheckBox getCheckbox() {
        return this.checkbox;
    }

    public final String getConfiguration() {
        return this.configuration;
    }

    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final List<Elements> getElements() {
        return this.elements;
    }

    public final String getExtraMsg() {
        return this.extraMsg;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getIntegrationMethod() {
        return this.integrationMethod;
    }

    public final String getMaxLimitedAmount() {
        return this.maxLimitedAmount;
    }

    public final String getMinLimitedAmount() {
        return this.minLimitedAmount;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodExtra() {
        return this.paymentMethodExtra;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    public final Boolean getPciSensitive() {
        return this.pciSensitive;
    }

    public final String getRedirectMethod() {
        return this.redirectMethod;
    }

    public final Boolean getSaveable() {
        return this.saveable;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final String getUnavailableCode() {
        return this.unavailableCode;
    }

    public final String getUnavailableMsg() {
        return this.unavailableMsg;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    public final void setAgreementTag(String str) {
        this.agreementTag = str;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setCheckbox(CheckBox checkBox) {
        this.checkbox = checkBox;
    }

    public final void setConfiguration(String str) {
        this.configuration = str;
    }

    public final void setDarkModeIconUrl(String str) {
        this.darkModeIconUrl = str;
    }

    public final void setDefault(Boolean bool) {
        this.isDefault = bool;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setElements(List<Elements> list) {
        this.elements = list;
    }

    public final void setExtraMsg(String str) {
        this.extraMsg = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setIntegrationMethod(String str) {
        this.integrationMethod = str;
    }

    public final void setMaxLimitedAmount(String str) {
        this.maxLimitedAmount = str;
    }

    public final void setMinLimitedAmount(String str) {
        this.minLimitedAmount = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setPaymentMethod(String str) {
        this.paymentMethod = str;
    }

    public final void setPaymentMethodExtra(String str) {
        this.paymentMethodExtra = str;
    }

    public final void setPaymentMethodId(String str) {
        this.paymentMethodId = str;
    }

    public final void setPaymentMethodType(String str) {
        this.paymentMethodType = str;
    }

    public final void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public final void setPciSensitive(Boolean bool) {
        this.pciSensitive = bool;
    }

    public final void setRedirectMethod(String str) {
        this.redirectMethod = str;
    }

    public final void setSaveable(Boolean bool) {
        this.saveable = bool;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public final void setUnavailableCode(String str) {
        this.unavailableCode = str;
    }

    public final void setUnavailableMsg(String str) {
        this.unavailableMsg = str;
    }

    public final void setUserType(String str) {
        this.userType = str;
    }

    public Methods(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<Elements> list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, PaymentType paymentType, String str17, String str18, String str19, String str20, CheckBox checkBox, Boolean bool3, String str21, String str22) {
        this.paymentMethodId = str;
        this.paymentMethod = str2;
        this.iconUrl = str3;
        this.darkModeIconUrl = str4;
        this.paymentMethodType = str5;
        this.displayName = str6;
        this.starlingKey = str7;
        this.elements = list;
        this.maxLimitedAmount = str8;
        this.minLimitedAmount = str9;
        this.packageName = str10;
        this.schema = str11;
        this.pciSensitive = bool;
        this.saveable = bool2;
        this.paymentMethodExtra = str12;
        this.configuration = str13;
        this.extraMsg = str14;
        this.integrationMethod = str15;
        this.redirectMethod = str16;
        this.paymentType = paymentType;
        this.userType = str17;
        this.model = str18;
        this.agreementTag = str19;
        this.cardType = str20;
        this.checkbox = checkBox;
        this.isDefault = bool3;
        this.unavailableCode = str21;
        this.unavailableMsg = str22;
    }

    public Methods(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, Boolean bool, Boolean bool2, String str12, String str13, String str14, String str15, String str16, PaymentType paymentType, String str17, String str18, String str19, String str20, CheckBox checkBox, Boolean bool3, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? C61878OQg.INSTANCE : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : bool, (i & FileUtils.BUFFER_SIZE) != 0 ? null : bool2, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : str13, (65536 & i) != 0 ? null : str14, (131072 & i) != 0 ? null : str15, (262144 & i) != 0 ? null : str16, (524288 & i) != 0 ? new PaymentType(null, null, null, null, null, 31, null) : paymentType, (1048576 & i) != 0 ? null : str17, (2097152 & i) != 0 ? null : str18, (4194304 & i) != 0 ? null : str19, (8388608 & i) != 0 ? null : str20, (16777216 & i) != 0 ? null : checkBox, (33554432 & i) != 0 ? null : bool3, (67108864 & i) != 0 ? null : str21, (i & 134217728) != 0 ? null : str22);
    }
}
