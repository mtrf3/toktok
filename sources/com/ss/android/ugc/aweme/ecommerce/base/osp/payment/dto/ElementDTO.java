package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C07670Rv;
import X.C32I;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.ORS;
import com.google.gson.g;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ElementDTO {
    public String LIZ;

    @InterfaceC65349Pkn("inner_configuration")
    public final Configuration configuration;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("display_tag")
    public final String displayTag;

    @InterfaceC65349Pkn("frontend_rule_list")
    public final g frontendRuleList;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("element")
    public final String id;

    @InterfaceC65349Pkn("need_encryption")
    public final Boolean needEncryption;

    @InterfaceC65349Pkn("notification_url")
    public final String notificationUrl;

    @InterfaceC65349Pkn("param_name")
    public final String paramName;

    @InterfaceC65349Pkn("placeholder_display_name")
    public final String placeholderDisplayName;

    @InterfaceC65349Pkn("inner_style_type")
    public final Integer styleType;

    @InterfaceC65349Pkn("sub_element_list")
    public final List<ElementDTO> subElementDTOList;

    /* JADX WARN: Multi-variable type inference failed */
    public ElementDTO() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 8191, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementDTO)) {
            return false;
        }
        ElementDTO elementDTO = (ElementDTO) obj;
        return o.LJ(this.id, elementDTO.id) && o.LJ(this.icon, elementDTO.icon) && o.LJ(this.styleType, elementDTO.styleType) && o.LJ(this.frontendRuleList, elementDTO.frontendRuleList) && o.LJ(this.displayTag, elementDTO.displayTag) && o.LJ(this.paramName, elementDTO.paramName) && o.LJ(this.placeholderDisplayName, elementDTO.placeholderDisplayName) && o.LJ(this.subElementDTOList, elementDTO.subElementDTOList) && o.LJ(this.displayName, elementDTO.displayName) && o.LJ(this.needEncryption, elementDTO.needEncryption) && o.LJ(this.notificationUrl, elementDTO.notificationUrl) && o.LJ(this.configuration, elementDTO.configuration) && o.LJ(this.description, elementDTO.description);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        Integer num = this.styleType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        g gVar = this.frontendRuleList;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str2 = this.displayTag;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholderDisplayName;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ElementDTO> list = this.subElementDTOList;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.displayName;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.needEncryption;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.notificationUrl;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Configuration configuration = this.configuration;
        int hashCode12 = (hashCode11 + (configuration == null ? 0 : configuration.hashCode())) * 31;
        String str7 = this.description;
        return hashCode12 + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PaymentElement LIZ() {
        return new PaymentElement(this.id, this.paramName, "", this.needEncryption, null, 16, 0 == true ? 1 : 0);
    }

    public final List<PaymentElement> LIZIZ() {
        List<ElementDTO> list = this.subElementDTOList;
        if (list == null || list.isEmpty()) {
            return C47261Igj.LJJIJ(LIZ());
        }
        List<ElementDTO> list2 = this.subElementDTOList;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        Iterator<ElementDTO> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ());
        }
        return arrayList;
    }

    public final List<ElementDTO> LIZJ() {
        List<ElementDTO> list = this.subElementDTOList;
        if (list == null || list.isEmpty()) {
            return C47261Igj.LJJIJ(this);
        }
        List<ElementDTO> list2 = this.subElementDTOList;
        ArrayList arrayList = new ArrayList();
        Iterator<ElementDTO> it = list2.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LIZJ(), arrayList);
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ElementDTO(id=");
        sb.append(this.id);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", styleType=");
        sb.append(this.styleType);
        sb.append(", frontendRuleList=");
        sb.append(this.frontendRuleList);
        sb.append(", displayTag=");
        sb.append(this.displayTag);
        sb.append(", paramName=");
        sb.append(this.paramName);
        sb.append(", placeholderDisplayName=");
        sb.append(this.placeholderDisplayName);
        sb.append(", subElementDTOList=");
        sb.append(this.subElementDTOList);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", needEncryption=");
        sb.append(this.needEncryption);
        sb.append(", notificationUrl=");
        sb.append(this.notificationUrl);
        sb.append(", configuration=");
        sb.append(this.configuration);
        sb.append(", description=");
        return C07670Rv.LIZIZ(sb, this.description, ')');
    }

    public ElementDTO(String str, Icon icon, Integer num, g gVar, String str2, String str3, String str4, List<ElementDTO> list, String str5, Boolean bool, String str6, Configuration configuration, String str7) {
        this.id = str;
        this.icon = icon;
        this.styleType = num;
        this.frontendRuleList = gVar;
        this.displayTag = str2;
        this.paramName = str3;
        this.placeholderDisplayName = str4;
        this.subElementDTOList = list;
        this.displayName = str5;
        this.needEncryption = bool;
        this.notificationUrl = str6;
        this.configuration = configuration;
        this.description = str7;
    }

    public /* synthetic */ ElementDTO(String str, Icon icon, Integer num, g gVar, String str2, String str3, String str4, List list, String str5, Boolean bool, String str6, Configuration configuration, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : gVar, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : configuration, (i & 4096) == 0 ? str7 : null);
    }
}
