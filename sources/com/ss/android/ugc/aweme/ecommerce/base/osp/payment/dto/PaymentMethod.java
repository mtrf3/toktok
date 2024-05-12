package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C07670Rv;
import X.C32I;
import X.C60004Ngm;
import X.C61841OOv;
import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.ORY;
import X.OSZ;
import X.SAN;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentMethod {
    public PaymentMethod LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @InterfaceC65349Pkn("availability")
    public final Availability availability;

    @InterfaceC65349Pkn("balance")
    public String balance;

    @InterfaceC65349Pkn("bind_info")
    public final BindInfo bindInfo;

    @InterfaceC65349Pkn("ccdc_card_tip")
    public final String ccdcCardTip;

    @InterfaceC65349Pkn("display_name")
    public final String displayName;

    @InterfaceC65349Pkn("elements")
    public final List<ElementDTO> elementDTOS;

    @InterfaceC65349Pkn("exception")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("explanation_url")
    public final String explanationUrl;

    @InterfaceC65349Pkn("extra_fee_statement")
    public final ExtraFeeStatement extraFeeStatement;

    @InterfaceC65349Pkn("extra_info")
    public final String extraInfo;

    @InterfaceC65349Pkn("payment_method_first_type")
    public final String firstType;

    @InterfaceC65349Pkn("is_need_install_app")
    public final Boolean hideIfNotInstall;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("payment_method_id")
    public final String id;

    @InterfaceC65349Pkn("installment_info")
    public InstallmentInfo installmentInfo;

    @InterfaceC65349Pkn("is_choose_recommend")
    public final Boolean isChooseRecommend;

    @InterfaceC65349Pkn("is_deeplink")
    public final Boolean isDeepLink;

    @InterfaceC65349Pkn("is_primary")
    public final Boolean isPrimary;

    @InterfaceC65349Pkn("masked_identity")
    public final String maskedIdentity;

    @InterfaceC65349Pkn("needed_elements")
    public final List<ElementDTO> neededElementDTOS;

    @InterfaceC65349Pkn("order_payment_tips")
    public final String orderPaymentTips;

    @InterfaceC65349Pkn("package_name")
    public final String packageName;

    @InterfaceC65349Pkn("payment_label")
    public final PaymentLabel paymentLabel;

    @InterfaceC65349Pkn("payment_tips")
    public final PaymentTip paymentTip;

    @InterfaceC65349Pkn("pci_sensitive")
    public final Boolean pciSensitive;

    @InterfaceC65349Pkn("promotion_info")
    public List<PaymentPromotion> promotionInfo;

    @InterfaceC65349Pkn("prompt")
    public final String prompt;

    @InterfaceC65349Pkn("save_display_text")
    public final String saveDisplayText;

    @InterfaceC65349Pkn("save_notification_url")
    public final String saveNotificationUrl;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("payment_method_second_type")
    public final String secondType;

    @InterfaceC65349Pkn("should_reload_billinfo")
    public final Boolean shouldReloadBillInfo;

    @InterfaceC65349Pkn("sub_payment_methods")
    public List<PaymentMethod> subPaymentMethods;

    @InterfaceC65349Pkn("support_card_list")
    public final List<String> supportCardList;

    @InterfaceC65349Pkn("supported_pay_commute_types")
    public final List<CommuteInfo> supportedPayCommuteTypes;

    @InterfaceC65349Pkn("payment_method_token")
    public final String token;

    @InterfaceC65349Pkn("unfold_strategy")
    public final UnfoldStrategy unfoldStrategy;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return o.LJ(this.id, paymentMethod.id) && o.LJ(this.displayName, paymentMethod.displayName) && o.LJ(this.firstType, paymentMethod.firstType) && o.LJ(this.secondType, paymentMethod.secondType) && o.LJ(this.iconUrl, paymentMethod.iconUrl) && o.LJ(this.elementDTOS, paymentMethod.elementDTOS) && o.LJ(this.pciSensitive, paymentMethod.pciSensitive) && o.LJ(this.subPaymentMethods, paymentMethod.subPaymentMethods) && o.LJ(this.isDeepLink, paymentMethod.isDeepLink) && o.LJ(this.packageName, paymentMethod.packageName) && o.LJ(this.schema, paymentMethod.schema) && o.LJ(this.hideIfNotInstall, paymentMethod.hideIfNotInstall) && o.LJ(this.extraInfo, paymentMethod.extraInfo) && o.LJ(this.promotionInfo, paymentMethod.promotionInfo) && o.LJ(this.saveDisplayText, paymentMethod.saveDisplayText) && o.LJ(this.maskedIdentity, paymentMethod.maskedIdentity) && o.LJ(this.isPrimary, paymentMethod.isPrimary) && o.LJ(this.token, paymentMethod.token) && o.LJ(this.saveNotificationUrl, paymentMethod.saveNotificationUrl) && o.LJ(this.neededElementDTOS, paymentMethod.neededElementDTOS) && o.LJ(this.balance, paymentMethod.balance) && o.LJ(this.availability, paymentMethod.availability) && o.LJ(this.bindInfo, paymentMethod.bindInfo) && o.LJ(this.exceptionUX, paymentMethod.exceptionUX) && o.LJ(this.supportedPayCommuteTypes, paymentMethod.supportedPayCommuteTypes) && o.LJ(this.orderPaymentTips, paymentMethod.orderPaymentTips) && o.LJ(this.prompt, paymentMethod.prompt) && o.LJ(this.LIZ, paymentMethod.LIZ) && this.unfoldStrategy == paymentMethod.unfoldStrategy && o.LJ(this.installmentInfo, paymentMethod.installmentInfo) && o.LJ(this.supportCardList, paymentMethod.supportCardList) && o.LJ(this.isChooseRecommend, paymentMethod.isChooseRecommend) && o.LJ(this.shouldReloadBillInfo, paymentMethod.shouldReloadBillInfo) && o.LJ(this.explanationUrl, paymentMethod.explanationUrl) && o.LJ(this.paymentLabel, paymentMethod.paymentLabel) && o.LJ(this.extraFeeStatement, paymentMethod.extraFeeStatement) && o.LJ(this.paymentTip, paymentMethod.paymentTip) && o.LJ(this.ccdcCardTip, paymentMethod.ccdcCardTip) && this.LIZIZ == paymentMethod.LIZIZ && o.LJ(this.LIZJ, paymentMethod.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<ElementDTO> list = this.elementDTOS;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.pciSensitive;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<PaymentMethod> list2 = this.subPaymentMethods;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.isDeepLink;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.packageName;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.schema;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool3 = this.hideIfNotInstall;
        int hashCode12 = (hashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str8 = this.extraInfo;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<PaymentPromotion> list3 = this.promotionInfo;
        int hashCode14 = (hashCode13 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str9 = this.saveDisplayText;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maskedIdentity;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool4 = this.isPrimary;
        int hashCode17 = (hashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str11 = this.token;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.saveNotificationUrl;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<ElementDTO> list4 = this.neededElementDTOS;
        int hashCode20 = (hashCode19 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str13 = this.balance;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Availability availability = this.availability;
        int hashCode22 = (hashCode21 + (availability == null ? 0 : availability.hashCode())) * 31;
        BindInfo bindInfo = this.bindInfo;
        int hashCode23 = (hashCode22 + (bindInfo == null ? 0 : bindInfo.hashCode())) * 31;
        ExceptionUX exceptionUX = this.exceptionUX;
        int hashCode24 = (hashCode23 + (exceptionUX == null ? 0 : exceptionUX.hashCode())) * 31;
        List<CommuteInfo> list5 = this.supportedPayCommuteTypes;
        int hashCode25 = (hashCode24 + (list5 == null ? 0 : list5.hashCode())) * 31;
        String str14 = this.orderPaymentTips;
        int hashCode26 = (hashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.prompt;
        int hashCode27 = (hashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        PaymentMethod paymentMethod = this.LIZ;
        int hashCode28 = (hashCode27 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
        UnfoldStrategy unfoldStrategy = this.unfoldStrategy;
        int hashCode29 = (hashCode28 + (unfoldStrategy == null ? 0 : unfoldStrategy.hashCode())) * 31;
        InstallmentInfo installmentInfo = this.installmentInfo;
        int hashCode30 = (hashCode29 + (installmentInfo == null ? 0 : installmentInfo.hashCode())) * 31;
        List<String> list6 = this.supportCardList;
        int hashCode31 = (hashCode30 + (list6 == null ? 0 : list6.hashCode())) * 31;
        Boolean bool5 = this.isChooseRecommend;
        int hashCode32 = (hashCode31 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.shouldReloadBillInfo;
        int hashCode33 = (hashCode32 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str16 = this.explanationUrl;
        int hashCode34 = (hashCode33 + (str16 == null ? 0 : str16.hashCode())) * 31;
        PaymentLabel paymentLabel = this.paymentLabel;
        int hashCode35 = (hashCode34 + (paymentLabel == null ? 0 : paymentLabel.hashCode())) * 31;
        ExtraFeeStatement extraFeeStatement = this.extraFeeStatement;
        int hashCode36 = (hashCode35 + (extraFeeStatement == null ? 0 : extraFeeStatement.hashCode())) * 31;
        PaymentTip paymentTip = this.paymentTip;
        int hashCode37 = (hashCode36 + (paymentTip == null ? 0 : paymentTip.hashCode())) * 31;
        String str17 = this.ccdcCardTip;
        int hashCode38 = (hashCode37 + (str17 == null ? 0 : str17.hashCode())) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode38 + i) * 31;
        String str18 = this.LIZJ;
        return i2 + (str18 != null ? str18.hashCode() : 0);
    }

    public final boolean LIZ() {
        int i;
        List<PaymentMethod> list = this.subPaymentMethods;
        if (list == null || list.isEmpty()) {
            if (LJIIJJI() == null) {
                return false;
            }
            BindInfo bindInfo = this.bindInfo;
            if (bindInfo != null && bindInfo.supportedBindCommuteTypes != null && LJ() == null) {
                return false;
            }
        } else {
            List<PaymentMethod> list2 = this.subPaymentMethods;
            if (list2 != null) {
                Iterator<PaymentMethod> it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!it.next().LIZ()) {
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            List<PaymentMethod> list3 = this.subPaymentMethods;
            if (list3 != null && list3.size() == i) {
                return false;
            }
        }
        return true;
    }

    public final List<ElementDTO> LIZJ() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ORY.LJJIJLIJ(new List[]{this.elementDTOS, this.neededElementDTOS}).iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
        return arrayList;
    }

    public final List<PaymentPromotion> LIZLLL() {
        ArrayList arrayList = new ArrayList();
        List<PaymentPromotion> list = this.promotionInfo;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<PaymentMethod> list2 = this.subPaymentMethods;
        if (list2 != null) {
            Iterator<PaymentMethod> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().LIZLLL());
            }
        }
        return arrayList;
    }

    public final CommuteInfo LJ() {
        List<CommuteInfo> list;
        BindInfo bindInfo = this.bindInfo;
        CommuteInfo commuteInfo = null;
        if (bindInfo == null || (list = bindInfo.supportedBindCommuteTypes) == null) {
            return null;
        }
        for (CommuteInfo commuteInfo2 : list) {
            CommuteType commuteType = commuteInfo2.commuteType;
            if ((commuteType != CommuteType.APP && commuteType != CommuteType.WAP_TO_APP && commuteType != CommuteType.WAP_FILTER_APP && commuteType != CommuteType.SECRET_FREE_APP) || C60004Ngm.LIZ(this.packageName, this.schema)) {
                commuteInfo = commuteInfo2;
                break;
            }
        }
        return commuteInfo;
    }

    public final List<ElementDTO> LJI() {
        List<ElementDTO> list = this.elementDTOS;
        if (list != null || (list = this.neededElementDTOS) != null) {
            ArrayList arrayList = new ArrayList();
            for (ElementDTO elementDTO : list) {
                SAN san = SAN.LIZ;
                String str = elementDTO.id;
                san.getClass();
                if (!SAN.LJFF(str)) {
                    arrayList.add(elementDTO);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final List<ElementDTO> LJIIJ() {
        List<ElementDTO> list = this.neededElementDTOS;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (ElementDTO elementDTO : list) {
                SAN san = SAN.LIZ;
                String str = elementDTO.id;
                san.getClass();
                if (!SAN.LJFF(str)) {
                    arrayList.add(elementDTO);
                }
            }
            return arrayList;
        }
        return null;
    }

    public final CommuteInfo LJIIJJI() {
        List<CommuteInfo> list = this.supportedPayCommuteTypes;
        CommuteInfo commuteInfo = null;
        if (list == null) {
            return null;
        }
        for (CommuteInfo commuteInfo2 : list) {
            CommuteType commuteType = commuteInfo2.commuteType;
            if ((commuteType != CommuteType.APP && commuteType != CommuteType.WAP_TO_APP && commuteType != CommuteType.WAP_FILTER_APP && commuteType != CommuteType.SECRET_FREE_APP) || C60004Ngm.LIZ(this.packageName, this.schema)) {
                commuteInfo = commuteInfo2;
                break;
            }
        }
        return commuteInfo;
    }

    public final String LJIIL() {
        boolean z;
        String str = this.secondType;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (((!(!z) || str == null) && (str = this.firstType) == null) || str.length() == 0 || str == null) {
            return "unknown";
        }
        return str;
    }

    public final List<OSZ<String, String>> LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        List<PaymentPromotion> list = this.promotionInfo;
        if (list != null) {
            Iterator<PaymentPromotion> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().desc;
                if (str != null && C78685UuP.LJJJZ(str)) {
                    arrayList.add(new OSZ(this.iconUrl, str));
                }
            }
        }
        List<PaymentMethod> list2 = this.subPaymentMethods;
        if (list2 != null) {
            Iterator<PaymentMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(it2.next().LJIILIIL());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<PaymentElement> LJIILLIIL() {
        ArrayList arrayList = new ArrayList();
        List<ElementDTO> list = this.neededElementDTOS;
        if (list != null) {
            Iterator<ElementDTO> it = list.iterator();
            while (it.hasNext()) {
                List<ElementDTO> LIZJ = it.next().LIZJ();
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(LIZJ, 10));
                for (ElementDTO elementDTO : LIZJ) {
                    arrayList2.add(new PaymentElement(elementDTO.id, elementDTO.paramName, null, elementDTO.needEncryption, 0 == true ? 1 : 0, 16, 0 == true ? 1 : 0));
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethod(id=");
        sb.append(this.id);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", firstType=");
        sb.append(this.firstType);
        sb.append(", secondType=");
        sb.append(this.secondType);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", elementDTOS=");
        sb.append(this.elementDTOS);
        sb.append(", pciSensitive=");
        sb.append(this.pciSensitive);
        sb.append(", subPaymentMethods=");
        sb.append(this.subPaymentMethods);
        sb.append(", isDeepLink=");
        sb.append(this.isDeepLink);
        sb.append(", packageName=");
        sb.append(this.packageName);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", hideIfNotInstall=");
        sb.append(this.hideIfNotInstall);
        sb.append(", extraInfo=");
        sb.append(this.extraInfo);
        sb.append(", promotionInfo=");
        sb.append(this.promotionInfo);
        sb.append(", saveDisplayText=");
        sb.append(this.saveDisplayText);
        sb.append(", maskedIdentity=");
        sb.append(this.maskedIdentity);
        sb.append(", isPrimary=");
        sb.append(this.isPrimary);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", saveNotificationUrl=");
        sb.append(this.saveNotificationUrl);
        sb.append(", neededElementDTOS=");
        sb.append(this.neededElementDTOS);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", availability=");
        sb.append(this.availability);
        sb.append(", bindInfo=");
        sb.append(this.bindInfo);
        sb.append(", exceptionUX=");
        sb.append(this.exceptionUX);
        sb.append(", supportedPayCommuteTypes=");
        sb.append(this.supportedPayCommuteTypes);
        sb.append(", orderPaymentTips=");
        sb.append(this.orderPaymentTips);
        sb.append(", prompt=");
        sb.append(this.prompt);
        sb.append(", selectedSubPaymentMethod=");
        sb.append(this.LIZ);
        sb.append(", unfoldStrategy=");
        sb.append(this.unfoldStrategy);
        sb.append(", installmentInfo=");
        sb.append(this.installmentInfo);
        sb.append(", supportCardList=");
        sb.append(this.supportCardList);
        sb.append(", isChooseRecommend=");
        sb.append(this.isChooseRecommend);
        sb.append(", shouldReloadBillInfo=");
        sb.append(this.shouldReloadBillInfo);
        sb.append(", explanationUrl=");
        sb.append(this.explanationUrl);
        sb.append(", paymentLabel=");
        sb.append(this.paymentLabel);
        sb.append(", extraFeeStatement=");
        sb.append(this.extraFeeStatement);
        sb.append(", paymentTip=");
        sb.append(this.paymentTip);
        sb.append(", ccdcCardTip=");
        sb.append(this.ccdcCardTip);
        sb.append(", newCard=");
        sb.append(this.LIZIZ);
        sb.append(", _extraKey=");
        return C07670Rv.LIZIZ(sb, this.LIZJ, ')');
    }

    public final String LJFF() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.id);
        LIZ.append(this.token);
        String str = this.LIZJ;
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public final String LJII() {
        List<PaymentPromotion> LIZLLL = LIZLLL();
        if (!(!LIZLLL.isEmpty())) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(LIZLLL, 0)).amount;
    }

    public final String LJIIIIZZ() {
        List<PaymentPromotion> LIZLLL = LIZLLL();
        if (!(!LIZLLL.isEmpty())) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(LIZLLL, 0)).desc;
    }

    public final String LJIIIZ() {
        List<PaymentPromotion> LIZLLL = LIZLLL();
        if (!(!LIZLLL.isEmpty())) {
            return null;
        }
        return ((PaymentPromotion) ListProtector.get(LIZLLL, 0)).descInEditStatus;
    }

    public final boolean LJIILJJIL(PaymentMethod paymentMethod) {
        List<PaymentMethod> list;
        if (paymentMethod == null || (list = this.subPaymentMethods) == null) {
            return false;
        }
        for (PaymentMethod paymentMethod2 : list) {
            if (C61841OOv.LIZIZ(paymentMethod2, paymentMethod)) {
                if (paymentMethod2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJIILL(List<PaymentMethod> list) {
        String str = this.id;
        if (str == null || !ujb.o.LJJJLIIL(str, "pm_pi_ccdc_", false)) {
            SAN san = SAN.LIZ;
            String str2 = this.id;
            san.getClass();
            if (!SAN.LJ(str2)) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    if (o.LJ(((PaymentMethod) it.next()).id, this.id)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static PaymentMethod LIZIZ(PaymentMethod paymentMethod, String str, String str2, Availability availability, boolean z, String str3, int i, int i2) {
        String str4;
        String str5;
        String str6;
        String str7;
        List<ElementDTO> list;
        Boolean bool;
        List<PaymentMethod> list2;
        Boolean bool2;
        String str8;
        String str9;
        Boolean bool3;
        String str10;
        List<PaymentPromotion> list3;
        String str11;
        String str12;
        Boolean bool4;
        String str13;
        String str14;
        List<ElementDTO> list4;
        BindInfo bindInfo;
        ExceptionUX exceptionUX;
        List<CommuteInfo> list5;
        String str15;
        String str16;
        PaymentMethod paymentMethod2;
        UnfoldStrategy unfoldStrategy;
        InstallmentInfo installmentInfo;
        List<String> list6;
        Boolean bool5;
        Boolean bool6;
        String str17;
        PaymentLabel paymentLabel;
        ExtraFeeStatement extraFeeStatement;
        PaymentTip paymentTip;
        String str18 = str2;
        String str19 = str;
        boolean z2 = z;
        Availability availability2 = availability;
        String str20 = str3;
        String str21 = null;
        if ((i & 1) != 0) {
            str4 = paymentMethod.id;
        } else {
            str4 = null;
        }
        if ((i & 2) != 0) {
            str19 = paymentMethod.displayName;
        }
        if ((i & 4) != 0) {
            str5 = paymentMethod.firstType;
        } else {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str6 = paymentMethod.secondType;
        } else {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str7 = paymentMethod.iconUrl;
        } else {
            str7 = null;
        }
        if ((i & 32) != 0) {
            list = paymentMethod.elementDTOS;
        } else {
            list = null;
        }
        if ((i & 64) != 0) {
            bool = paymentMethod.pciSensitive;
        } else {
            bool = null;
        }
        if ((i & 128) != 0) {
            list2 = paymentMethod.subPaymentMethods;
        } else {
            list2 = null;
        }
        if ((i & 256) != 0) {
            bool2 = paymentMethod.isDeepLink;
        } else {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            str8 = paymentMethod.packageName;
        } else {
            str8 = null;
        }
        if ((i & 1024) != 0) {
            str9 = paymentMethod.schema;
        } else {
            str9 = null;
        }
        if ((i & 2048) != 0) {
            bool3 = paymentMethod.hideIfNotInstall;
        } else {
            bool3 = null;
        }
        if ((i & 4096) != 0) {
            str10 = paymentMethod.extraInfo;
        } else {
            str10 = null;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            list3 = paymentMethod.promotionInfo;
        } else {
            list3 = null;
        }
        if ((i & 16384) != 0) {
            str11 = paymentMethod.saveDisplayText;
        } else {
            str11 = null;
        }
        if ((32768 & i) != 0) {
            str12 = paymentMethod.maskedIdentity;
        } else {
            str12 = null;
        }
        if ((65536 & i) != 0) {
            bool4 = paymentMethod.isPrimary;
        } else {
            bool4 = null;
        }
        if ((131072 & i) != 0) {
            str13 = paymentMethod.token;
        } else {
            str13 = null;
        }
        if ((262144 & i) != 0) {
            str14 = paymentMethod.saveNotificationUrl;
        } else {
            str14 = null;
        }
        if ((524288 & i) != 0) {
            list4 = paymentMethod.neededElementDTOS;
        } else {
            list4 = null;
        }
        if ((1048576 & i) != 0) {
            str18 = paymentMethod.balance;
        }
        if ((2097152 & i) != 0) {
            availability2 = paymentMethod.availability;
        }
        if ((4194304 & i) != 0) {
            bindInfo = paymentMethod.bindInfo;
        } else {
            bindInfo = null;
        }
        if ((8388608 & i) != 0) {
            exceptionUX = paymentMethod.exceptionUX;
        } else {
            exceptionUX = null;
        }
        if ((16777216 & i) != 0) {
            list5 = paymentMethod.supportedPayCommuteTypes;
        } else {
            list5 = null;
        }
        if ((33554432 & i) != 0) {
            str15 = paymentMethod.orderPaymentTips;
        } else {
            str15 = null;
        }
        if ((67108864 & i) != 0) {
            str16 = paymentMethod.prompt;
        } else {
            str16 = null;
        }
        if ((134217728 & i) != 0) {
            paymentMethod2 = paymentMethod.LIZ;
        } else {
            paymentMethod2 = null;
        }
        if ((268435456 & i) != 0) {
            unfoldStrategy = paymentMethod.unfoldStrategy;
        } else {
            unfoldStrategy = null;
        }
        if ((536870912 & i) != 0) {
            installmentInfo = paymentMethod.installmentInfo;
        } else {
            installmentInfo = null;
        }
        if ((1073741824 & i) != 0) {
            list6 = paymentMethod.supportCardList;
        } else {
            list6 = null;
        }
        if ((i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            bool5 = paymentMethod.isChooseRecommend;
        } else {
            bool5 = null;
        }
        if ((i2 & 1) != 0) {
            bool6 = paymentMethod.shouldReloadBillInfo;
        } else {
            bool6 = null;
        }
        if ((i2 & 2) != 0) {
            str17 = paymentMethod.explanationUrl;
        } else {
            str17 = null;
        }
        if ((i2 & 4) != 0) {
            paymentLabel = paymentMethod.paymentLabel;
        } else {
            paymentLabel = null;
        }
        if ((i2 & 8) != 0) {
            extraFeeStatement = paymentMethod.extraFeeStatement;
        } else {
            extraFeeStatement = null;
        }
        if ((i2 & 16) != 0) {
            paymentTip = paymentMethod.paymentTip;
        } else {
            paymentTip = null;
        }
        if ((i2 & 32) != 0) {
            str21 = paymentMethod.ccdcCardTip;
        }
        if ((i2 & 64) != 0) {
            z2 = paymentMethod.LIZIZ;
        }
        if ((i2 & 128) != 0) {
            str20 = paymentMethod.LIZJ;
        }
        paymentMethod.getClass();
        return new PaymentMethod(str4, str19, str5, str6, str7, list, bool, list2, bool2, str8, str9, bool3, str10, list3, str11, str12, bool4, str13, str14, list4, str18, availability2, bindInfo, exceptionUX, list5, str15, str16, paymentMethod2, unfoldStrategy, installmentInfo, list6, bool5, bool6, str17, paymentLabel, extraFeeStatement, paymentTip, str21, z2, str20);
    }

    public PaymentMethod(String str, String str2, String str3, String str4, String str5, List<ElementDTO> list, Boolean bool, List<PaymentMethod> list2, Boolean bool2, String str6, String str7, Boolean bool3, String str8, List<PaymentPromotion> list3, String str9, String str10, Boolean bool4, String str11, String str12, List<ElementDTO> list4, String str13, Availability availability, BindInfo bindInfo, ExceptionUX exceptionUX, List<CommuteInfo> list5, String str14, String str15, PaymentMethod paymentMethod, UnfoldStrategy unfoldStrategy, InstallmentInfo installmentInfo, List<String> list6, Boolean bool5, Boolean bool6, String str16, PaymentLabel paymentLabel, ExtraFeeStatement extraFeeStatement, PaymentTip paymentTip, String str17, boolean z, String str18) {
        this.id = str;
        this.displayName = str2;
        this.firstType = str3;
        this.secondType = str4;
        this.iconUrl = str5;
        this.elementDTOS = list;
        this.pciSensitive = bool;
        this.subPaymentMethods = list2;
        this.isDeepLink = bool2;
        this.packageName = str6;
        this.schema = str7;
        this.hideIfNotInstall = bool3;
        this.extraInfo = str8;
        this.promotionInfo = list3;
        this.saveDisplayText = str9;
        this.maskedIdentity = str10;
        this.isPrimary = bool4;
        this.token = str11;
        this.saveNotificationUrl = str12;
        this.neededElementDTOS = list4;
        this.balance = str13;
        this.availability = availability;
        this.bindInfo = bindInfo;
        this.exceptionUX = exceptionUX;
        this.supportedPayCommuteTypes = list5;
        this.orderPaymentTips = str14;
        this.prompt = str15;
        this.LIZ = paymentMethod;
        this.unfoldStrategy = unfoldStrategy;
        this.installmentInfo = installmentInfo;
        this.supportCardList = list6;
        this.isChooseRecommend = bool5;
        this.shouldReloadBillInfo = bool6;
        this.explanationUrl = str16;
        this.paymentLabel = paymentLabel;
        this.extraFeeStatement = extraFeeStatement;
        this.paymentTip = paymentTip;
        this.ccdcCardTip = str17;
        this.LIZIZ = z;
        this.LIZJ = str18;
        this.LIZLLL = "";
    }

    public /* synthetic */ PaymentMethod(String str, String str2, String str3, String str4, String str5, List list, Boolean bool, List list2, Boolean bool2, String str6, String str7, Boolean bool3, String str8, List list3, String str9, String str10, Boolean bool4, String str11, String str12, List list4, String str13, Availability availability, BindInfo bindInfo, ExceptionUX exceptionUX, List list5, String str14, String str15, PaymentMethod paymentMethod, UnfoldStrategy unfoldStrategy, InstallmentInfo installmentInfo, List list6, Boolean bool5, Boolean bool6, String str16, PaymentLabel paymentLabel, ExtraFeeStatement extraFeeStatement, PaymentTip paymentTip, String str17, boolean z, String str18, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, list, bool, list2, bool2, str6, str7, bool3, str8, list3, str9, str10, bool4, str11, str12, list4, str13, availability, bindInfo, exceptionUX, list5, str14, str15, (i & 134217728) == 0 ? paymentMethod : null, unfoldStrategy, installmentInfo, list6, bool5, bool6, str16, paymentLabel, extraFeeStatement, paymentTip, str17, z, str18);
    }
}
