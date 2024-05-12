package com.bytedance.pipo.checkout.api.network.model.response;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Elements {

    @InterfaceC65349Pkn("backend_rule_list")
    public List<Rules> backendRuleList;

    @InterfaceC65349Pkn("cashier_option_list")
    public List<CashierOptionList> cashierOptionList;

    @InterfaceC65349Pkn("configuration")
    public String configuration;

    @InterfaceC65349Pkn("dark_mode_icon_url")
    public String darkModeIconUrl;

    @InterfaceC65349Pkn("display")
    public Boolean display;

    @InterfaceC65349Pkn("display_order")
    public Integer displayOrder;

    @InterfaceC65349Pkn("display_tag")
    public String displayTag;

    @InterfaceC65349Pkn("element")
    public String element;

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("frontend_rule")
    public String frontendRule;

    @InterfaceC65349Pkn("frontend_rule_list")
    public List<Rules> frontendRuleList;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("info_key")
    public String infoKey;

    @InterfaceC65349Pkn("need_encrypted")
    public Boolean needEncrypted;

    @InterfaceC65349Pkn("option_list")
    public List<CashierOptionList> optionList;

    @InterfaceC65349Pkn("option_search_key")
    public String optionSearchKey;

    @InterfaceC65349Pkn("page_no")
    public Integer pageNo;

    @InterfaceC65349Pkn("param_name")
    public String paramName;

    @InterfaceC65349Pkn("param_value_type")
    public String paramValueType;

    @InterfaceC65349Pkn("placeholder")
    public String placeholder;

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    @InterfaceC65349Pkn("style_type")
    public String styleType;

    @InterfaceC65349Pkn("sub_element_list")
    public List<Elements> subElementList;

    public Elements() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public static /* synthetic */ Elements copy$default(Elements elements, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, Integer num, List list2, Boolean bool, String str9, String str10, List list3, String str11, String str12, Integer num2, String str13, String str14, Boolean bool2, List list4, List list5, int i, Object obj) {
        String str15 = str4;
        String str16 = str3;
        String str17 = str;
        String str18 = str2;
        String str19 = str10;
        String str20 = str9;
        Boolean bool3 = bool;
        List list6 = list2;
        String str21 = str6;
        String str22 = str5;
        String str23 = str7;
        List list7 = list;
        String str24 = str8;
        Integer num3 = num;
        List list8 = list5;
        Boolean bool4 = bool2;
        String str25 = str11;
        List list9 = list4;
        List list10 = list3;
        String str26 = str12;
        Integer num4 = num2;
        String str27 = str13;
        String str28 = str14;
        if ((i & 1) != 0) {
            str17 = elements.element;
        }
        if ((i & 2) != 0) {
            str18 = elements.iconUrl;
        }
        if ((i & 4) != 0) {
            str16 = elements.darkModeIconUrl;
        }
        if ((i & 8) != 0) {
            str15 = elements.starlingKey;
        }
        if ((i & 16) != 0) {
            str22 = elements.styleType;
        }
        if ((i & 32) != 0) {
            str21 = elements.displayTag;
        }
        if ((i & 64) != 0) {
            str23 = elements.paramName;
        }
        if ((i & 128) != 0) {
            list7 = elements.cashierOptionList;
        }
        if ((i & 256) != 0) {
            str24 = elements.placeholder;
        }
        if ((i & 512) != 0) {
            num3 = elements.displayOrder;
        }
        if ((i & 1024) != 0) {
            list6 = elements.subElementList;
        }
        if ((i & 2048) != 0) {
            bool3 = elements.needEncrypted;
        }
        if ((i & 4096) != 0) {
            str20 = elements.frontendRule;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str19 = elements.configuration;
        }
        if ((i & 16384) != 0) {
            list10 = elements.optionList;
        }
        if ((32768 & i) != 0) {
            str25 = elements.extra;
        }
        if ((65536 & i) != 0) {
            str26 = elements.infoKey;
        }
        if ((131072 & i) != 0) {
            num4 = elements.pageNo;
        }
        if ((262144 & i) != 0) {
            str27 = elements.optionSearchKey;
        }
        if ((524288 & i) != 0) {
            str28 = elements.paramValueType;
        }
        if ((1048576 & i) != 0) {
            bool4 = elements.display;
        }
        if ((2097152 & i) != 0) {
            list9 = elements.frontendRuleList;
        }
        if ((i & 4194304) != 0) {
            list8 = elements.backendRuleList;
        }
        List list11 = list6;
        Boolean bool5 = bool3;
        String str29 = str20;
        return elements.copy(str17, str18, str16, str15, str22, str21, str23, list7, str24, num3, list11, bool5, str29, str19, list10, str25, str26, num4, str27, str28, bool4, list9, list8);
    }

    public final Elements copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<CashierOptionList> list, String str8, Integer num, List<Elements> list2, Boolean bool, String str9, String str10, List<CashierOptionList> list3, String str11, String str12, Integer num2, String str13, String str14, Boolean bool2, List<Rules> list4, List<Rules> list5) {
        return new Elements(str, str2, str3, str4, str5, str6, str7, list, str8, num, list2, bool, str9, str10, list3, str11, str12, num2, str13, str14, bool2, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Elements)) {
            return false;
        }
        Elements elements = (Elements) obj;
        return o.LJ(this.element, elements.element) && o.LJ(this.iconUrl, elements.iconUrl) && o.LJ(this.darkModeIconUrl, elements.darkModeIconUrl) && o.LJ(this.starlingKey, elements.starlingKey) && o.LJ(this.styleType, elements.styleType) && o.LJ(this.displayTag, elements.displayTag) && o.LJ(this.paramName, elements.paramName) && o.LJ(this.cashierOptionList, elements.cashierOptionList) && o.LJ(this.placeholder, elements.placeholder) && o.LJ(this.displayOrder, elements.displayOrder) && o.LJ(this.subElementList, elements.subElementList) && o.LJ(this.needEncrypted, elements.needEncrypted) && o.LJ(this.frontendRule, elements.frontendRule) && o.LJ(this.configuration, elements.configuration) && o.LJ(this.optionList, elements.optionList) && o.LJ(this.extra, elements.extra) && o.LJ(this.infoKey, elements.infoKey) && o.LJ(this.pageNo, elements.pageNo) && o.LJ(this.optionSearchKey, elements.optionSearchKey) && o.LJ(this.paramValueType, elements.paramValueType) && o.LJ(this.display, elements.display) && o.LJ(this.frontendRuleList, elements.frontendRuleList) && o.LJ(this.backendRuleList, elements.backendRuleList);
    }

    public int hashCode() {
        String str = this.element;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkModeIconUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.starlingKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.styleType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayTag;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paramName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<CashierOptionList> list = this.cashierOptionList;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.placeholder;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.displayOrder;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        List<Elements> list2 = this.subElementList;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.needEncrypted;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.frontendRule;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.configuration;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<CashierOptionList> list3 = this.optionList;
        int hashCode15 = (hashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str11 = this.extra;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.infoKey;
        int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num2 = this.pageNo;
        int hashCode18 = (hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str13 = this.optionSearchKey;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.paramValueType;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool2 = this.display;
        int hashCode21 = (hashCode20 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Rules> list4 = this.frontendRuleList;
        int hashCode22 = (hashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Rules> list5 = this.backendRuleList;
        return hashCode22 + (list5 != null ? list5.hashCode() : 0);
    }

    public String toString() {
        return "Elements(element=" + ((Object) this.element) + ", iconUrl=" + ((Object) this.iconUrl) + ", darkModeIconUrl=" + ((Object) this.darkModeIconUrl) + ", starlingKey=" + ((Object) this.starlingKey) + ", styleType=" + ((Object) this.styleType) + ", displayTag=" + ((Object) this.displayTag) + ", paramName=" + ((Object) this.paramName) + ", cashierOptionList=" + this.cashierOptionList + ", placeholder=" + ((Object) this.placeholder) + ", displayOrder=" + this.displayOrder + ", subElementList=" + this.subElementList + ", needEncrypted=" + this.needEncrypted + ", frontendRule=" + ((Object) this.frontendRule) + ", configuration=" + ((Object) this.configuration) + ", optionList=" + this.optionList + ", extra=" + ((Object) this.extra) + ", infoKey=" + ((Object) this.infoKey) + ", pageNo=" + this.pageNo + ", optionSearchKey=" + ((Object) this.optionSearchKey) + ", paramValueType=" + ((Object) this.paramValueType) + ", display=" + this.display + ", frontendRuleList=" + this.frontendRuleList + ", backendRuleList=" + this.backendRuleList + ')';
    }

    public final List<Rules> getBackendRuleList() {
        return this.backendRuleList;
    }

    public final List<CashierOptionList> getCashierOptionList() {
        return this.cashierOptionList;
    }

    public final String getConfiguration() {
        return this.configuration;
    }

    public final String getDarkModeIconUrl() {
        return this.darkModeIconUrl;
    }

    public final Boolean getDisplay() {
        return this.display;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final String getDisplayTag() {
        return this.displayTag;
    }

    public final String getElement() {
        return this.element;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final String getFrontendRule() {
        return this.frontendRule;
    }

    public final List<Rules> getFrontendRuleList() {
        return this.frontendRuleList;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getInfoKey() {
        return this.infoKey;
    }

    public final Boolean getNeedEncrypted() {
        return this.needEncrypted;
    }

    public final List<CashierOptionList> getOptionList() {
        return this.optionList;
    }

    public final String getOptionSearchKey() {
        return this.optionSearchKey;
    }

    public final Integer getPageNo() {
        return this.pageNo;
    }

    public final String getParamName() {
        return this.paramName;
    }

    public final String getParamValueType() {
        return this.paramValueType;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final String getStyleType() {
        return this.styleType;
    }

    public final List<Elements> getSubElementList() {
        return this.subElementList;
    }

    public final void setBackendRuleList(List<Rules> list) {
        this.backendRuleList = list;
    }

    public final void setCashierOptionList(List<CashierOptionList> list) {
        this.cashierOptionList = list;
    }

    public final void setConfiguration(String str) {
        this.configuration = str;
    }

    public final void setDarkModeIconUrl(String str) {
        this.darkModeIconUrl = str;
    }

    public final void setDisplay(Boolean bool) {
        this.display = bool;
    }

    public final void setDisplayOrder(Integer num) {
        this.displayOrder = num;
    }

    public final void setDisplayTag(String str) {
        this.displayTag = str;
    }

    public final void setElement(String str) {
        this.element = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setFrontendRule(String str) {
        this.frontendRule = str;
    }

    public final void setFrontendRuleList(List<Rules> list) {
        this.frontendRuleList = list;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setInfoKey(String str) {
        this.infoKey = str;
    }

    public final void setNeedEncrypted(Boolean bool) {
        this.needEncrypted = bool;
    }

    public final void setOptionList(List<CashierOptionList> list) {
        this.optionList = list;
    }

    public final void setOptionSearchKey(String str) {
        this.optionSearchKey = str;
    }

    public final void setPageNo(Integer num) {
        this.pageNo = num;
    }

    public final void setParamName(String str) {
        this.paramName = str;
    }

    public final void setParamValueType(String str) {
        this.paramValueType = str;
    }

    public final void setPlaceholder(String str) {
        this.placeholder = str;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public final void setStyleType(String str) {
        this.styleType = str;
    }

    public final void setSubElementList(List<Elements> list) {
        this.subElementList = list;
    }

    public Elements(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<CashierOptionList> list, String str8, Integer num, List<Elements> list2, Boolean bool, String str9, String str10, List<CashierOptionList> list3, String str11, String str12, Integer num2, String str13, String str14, Boolean bool2, List<Rules> list4, List<Rules> list5) {
        this.element = str;
        this.iconUrl = str2;
        this.darkModeIconUrl = str3;
        this.starlingKey = str4;
        this.styleType = str5;
        this.displayTag = str6;
        this.paramName = str7;
        this.cashierOptionList = list;
        this.placeholder = str8;
        this.displayOrder = num;
        this.subElementList = list2;
        this.needEncrypted = bool;
        this.frontendRule = str9;
        this.configuration = str10;
        this.optionList = list3;
        this.extra = str11;
        this.infoKey = str12;
        this.pageNo = num2;
        this.optionSearchKey = str13;
        this.paramValueType = str14;
        this.display = bool2;
        this.frontendRuleList = list4;
        this.backendRuleList = list5;
    }

    public Elements(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, Integer num, List list2, Boolean bool, String str9, String str10, List list3, String str11, String str12, Integer num2, String str13, String str14, Boolean bool2, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? C61878OQg.INSTANCE : list, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? C61878OQg.INSTANCE : list2, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : str9, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str10, (i & 16384) != 0 ? C61878OQg.INSTANCE : list3, (32768 & i) != 0 ? null : str11, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : num2, (262144 & i) != 0 ? null : str13, (524288 & i) != 0 ? null : str14, (1048576 & i) != 0 ? null : bool2, (2097152 & i) != 0 ? null : list4, (i & 4194304) != 0 ? null : list5);
    }
}
