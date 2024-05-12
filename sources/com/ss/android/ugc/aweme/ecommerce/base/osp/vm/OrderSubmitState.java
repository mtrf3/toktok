package com.ss.android.ugc.aweme.ecommerce.base.osp.vm;

import X.AnonymousClass391;
import X.C08880Wm;
import X.C26548AbQ;
import X.C26566Abi;
import X.C26802AfW;
import X.C27042AjO;
import X.C27724AuO;
import X.C27822Avy;
import X.C27918AxW;
import X.C27919AxX;
import X.C27922Axa;
import X.C27941Axt;
import X.C79062V1e;
import X.EnumC26795AfP;
import X.InterfaceC61312at;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPBottomNotice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OrderSubmitState implements InterfaceC61312at {
    public static final C27922Axa Companion = new C27922Axa();
    public final int abnormalStatus;
    public final List<Object> adapterList;
    public final C27941Axt addonOrderInfo;
    public final C26566Abi address;
    public final List<Announcement> announcements;
    public final OSPBottomNotice bottomNotice;
    public final boolean bottomPromotionBannerDismissed;
    public final String buttonPopTips;
    public final Announcement cashbackNotice;
    public final boolean checkCpfElem;
    public final Integer checkLawfulCode;
    public final boolean checkPayment;
    public final boolean checkPhoneNumber;
    public final CpfElem cpfElem;
    public final C27822Avy currentPage;
    public final BillingFragmentEnterParams editBillingAddress;
    public final C26548AbQ expandTarget;
    public final boolean hasAddress;
    public final boolean hasAvailableOrders;
    public final boolean hasCpfInfo;
    public final boolean hideSummaryPanel;
    public final Boolean isLoadingChunk;
    public final Boolean isShowToastForVoucher;
    public final int keyBoardCounterDiff;
    public final boolean loadSuccess;
    public final C26802AfW message;
    public final Object moveCpfToTopPart;
    public final C27918AxW moveModuleTo;
    public final C27919AxX<Integer> moveToPos;
    public final String moveToast;
    public final Object networkErrorState;
    public final boolean openAddressEditPage;
    public final boolean orderSummaryPanelOpened;
    public final int pageLoadStatus;
    public final EnumC26795AfP pageStatus;
    public final Object paymentInfoErrorState;
    public final String phoneNumberErr;
    public final C27724AuO platformDiscounts;
    public final boolean reachableAny;
    public final int refreshCouponViewModel;
    public final Object resendOrderCreateAction;
    public final boolean showDialogState;
    public final boolean showDivider;
    public final boolean showPayState;
    public final boolean showPopupState;
    public final String showPopupTitle;
    public final Object showShippingPriceToast;
    public final Integer skuTotalQuantity;
    public final C27042AjO summaryInfo;
    public final Object systemErrorState;
    public final C27919AxX<String> toastMsg;
    public final String topNotice;
    public final String total;
    public final String totalDesc;
    public final int totalItems;
    public final Object useVoucherState;
    public PaymentInfo userPaymentInfo;
    public final List<VoucherInfoNew> voucherInfo;

    public OrderSubmitState() {
        this(0, null, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -1, 67108863, null);
    }

    public static /* synthetic */ OrderSubmitState copy$default(OrderSubmitState orderSubmitState, int i, List list, C27042AjO c27042AjO, boolean z, C26566Abi c26566Abi, PaymentInfo paymentInfo, boolean z2, boolean z3, C26802AfW c26802AfW, String str, String str2, int i2, Integer num, int i3, int i4, Object obj, Object obj2, boolean z4, boolean z5, boolean z6, String str3, boolean z7, List list2, int i5, C27822Avy c27822Avy, boolean z8, OSPBottomNotice oSPBottomNotice, boolean z9, C27724AuO c27724AuO, String str4, String str5, Object obj3, boolean z10, C26548AbQ c26548AbQ, String str6, Integer num2, boolean z11, boolean z12, Object obj4, Object obj5, Object obj6, C27919AxX c27919AxX, C27941Axt c27941Axt, boolean z13, List list3, BillingFragmentEnterParams billingFragmentEnterParams, Boolean bool, Announcement announcement, Boolean bool2, C27919AxX c27919AxX2, String str7, Object obj7, CpfElem cpfElem, boolean z14, C27918AxW c27918AxW, boolean z15, EnumC26795AfP enumC26795AfP, boolean z16, int i6, int i7, Object obj8) {
        boolean z17 = z2;
        List list4 = list;
        int i8 = i;
        C27042AjO c27042AjO2 = c27042AjO;
        boolean z18 = z;
        C26566Abi c26566Abi2 = c26566Abi;
        PaymentInfo paymentInfo2 = paymentInfo;
        EnumC26795AfP enumC26795AfP2 = enumC26795AfP;
        boolean z19 = z15;
        C27918AxW c27918AxW2 = c27918AxW;
        boolean z20 = z14;
        CpfElem cpfElem2 = cpfElem;
        C27919AxX c27919AxX3 = c27919AxX2;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        BillingFragmentEnterParams billingFragmentEnterParams2 = billingFragmentEnterParams;
        List list5 = list3;
        C27941Axt c27941Axt2 = c27941Axt;
        List list6 = list2;
        boolean z21 = z13;
        String str8 = str3;
        boolean z22 = z5;
        String str9 = str5;
        Object obj9 = obj2;
        boolean z23 = z11;
        C26802AfW c26802AfW2 = c26802AfW;
        String str10 = str;
        boolean z24 = z7;
        boolean z25 = z6;
        Object obj10 = obj6;
        Object obj11 = obj;
        int i9 = i2;
        Object obj12 = obj3;
        Announcement announcement2 = announcement;
        int i10 = i5;
        boolean z26 = z3;
        Integer num3 = num;
        C26548AbQ c26548AbQ2 = c26548AbQ;
        C27822Avy c27822Avy2 = c27822Avy;
        String str11 = str7;
        boolean z27 = z16;
        boolean z28 = z8;
        Object obj13 = obj7;
        OSPBottomNotice oSPBottomNotice2 = oSPBottomNotice;
        boolean z29 = z12;
        boolean z30 = z9;
        C27724AuO c27724AuO2 = c27724AuO;
        String str12 = str4;
        C27919AxX c27919AxX4 = c27919AxX;
        boolean z31 = z10;
        int i11 = i3;
        String str13 = str2;
        String str14 = str6;
        int i12 = i4;
        Integer num4 = num2;
        Object obj14 = obj4;
        boolean z32 = z4;
        Object obj15 = obj5;
        if ((i6 & 1) != 0) {
            i8 = orderSubmitState.pageLoadStatus;
        }
        if ((i6 & 2) != 0) {
            list4 = orderSubmitState.adapterList;
        }
        if ((i6 & 4) != 0) {
            c27042AjO2 = orderSubmitState.summaryInfo;
        }
        if ((i6 & 8) != 0) {
            z18 = orderSubmitState.hasAddress;
        }
        if ((i6 & 16) != 0) {
            c26566Abi2 = orderSubmitState.address;
        }
        if ((i6 & 32) != 0) {
            paymentInfo2 = orderSubmitState.userPaymentInfo;
        }
        if ((i6 & 64) != 0) {
            z17 = orderSubmitState.reachableAny;
        }
        if ((i6 & 128) != 0) {
            z26 = orderSubmitState.orderSummaryPanelOpened;
        }
        if ((i6 & 256) != 0) {
            c26802AfW2 = orderSubmitState.message;
        }
        if ((i6 & 512) != 0) {
            str10 = orderSubmitState.total;
        }
        if ((i6 & 1024) != 0) {
            str13 = orderSubmitState.totalDesc;
        }
        if ((i6 & 2048) != 0) {
            i9 = orderSubmitState.totalItems;
        }
        if ((i6 & 4096) != 0) {
            num3 = orderSubmitState.skuTotalQuantity;
        }
        if ((i6 & FileUtils.BUFFER_SIZE) != 0) {
            i11 = orderSubmitState.abnormalStatus;
        }
        if ((i6 & 16384) != 0) {
            i12 = orderSubmitState.keyBoardCounterDiff;
        }
        if ((i6 & 32768) != 0) {
            obj11 = orderSubmitState.networkErrorState;
        }
        if ((i6 & 65536) != 0) {
            obj9 = orderSubmitState.systemErrorState;
        }
        if ((i6 & 131072) != 0) {
            z32 = orderSubmitState.showDialogState;
        }
        if ((i6 & 262144) != 0) {
            z22 = orderSubmitState.showPayState;
        }
        if ((i6 & 524288) != 0) {
            z25 = orderSubmitState.showPopupState;
        }
        if ((i6 & 1048576) != 0) {
            str8 = orderSubmitState.showPopupTitle;
        }
        if ((i6 & 2097152) != 0) {
            z24 = orderSubmitState.loadSuccess;
        }
        if ((4194304 & i6) != 0) {
            list6 = orderSubmitState.voucherInfo;
        }
        if ((8388608 & i6) != 0) {
            i10 = orderSubmitState.refreshCouponViewModel;
        }
        if ((16777216 & i6) != 0) {
            c27822Avy2 = orderSubmitState.currentPage;
        }
        if ((33554432 & i6) != 0) {
            z28 = orderSubmitState.checkPayment;
        }
        if ((67108864 & i6) != 0) {
            oSPBottomNotice2 = orderSubmitState.bottomNotice;
        }
        if ((134217728 & i6) != 0) {
            z30 = orderSubmitState.bottomPromotionBannerDismissed;
        }
        if ((268435456 & i6) != 0) {
            c27724AuO2 = orderSubmitState.platformDiscounts;
        }
        if ((536870912 & i6) != 0) {
            str12 = orderSubmitState.topNotice;
        }
        if ((1073741824 & i6) != 0) {
            str9 = orderSubmitState.buttonPopTips;
        }
        if ((i6 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            obj12 = orderSubmitState.resendOrderCreateAction;
        }
        if ((i7 & 1) != 0) {
            z31 = orderSubmitState.showDivider;
        }
        if ((i7 & 2) != 0) {
            c26548AbQ2 = orderSubmitState.expandTarget;
        }
        if ((i7 & 4) != 0) {
            str14 = orderSubmitState.phoneNumberErr;
        }
        if ((i7 & 8) != 0) {
            num4 = orderSubmitState.checkLawfulCode;
        }
        if ((i7 & 16) != 0) {
            z23 = orderSubmitState.checkPhoneNumber;
        }
        if ((i7 & 32) != 0) {
            z29 = orderSubmitState.checkCpfElem;
        }
        if ((i7 & 64) != 0) {
            obj14 = orderSubmitState.paymentInfoErrorState;
        }
        if ((i7 & 128) != 0) {
            obj15 = orderSubmitState.useVoucherState;
        }
        if ((i7 & 256) != 0) {
            obj10 = orderSubmitState.showShippingPriceToast;
        }
        if ((i7 & 512) != 0) {
            c27919AxX4 = orderSubmitState.toastMsg;
        }
        if ((i7 & 1024) != 0) {
            c27941Axt2 = orderSubmitState.addonOrderInfo;
        }
        if ((i7 & 2048) != 0) {
            z21 = orderSubmitState.hideSummaryPanel;
        }
        if ((i7 & 4096) != 0) {
            list5 = orderSubmitState.announcements;
        }
        if ((i7 & FileUtils.BUFFER_SIZE) != 0) {
            billingFragmentEnterParams2 = orderSubmitState.editBillingAddress;
        }
        if ((i7 & 16384) != 0) {
            bool4 = orderSubmitState.isShowToastForVoucher;
        }
        if ((i7 & 32768) != 0) {
            announcement2 = orderSubmitState.cashbackNotice;
        }
        if ((i7 & 65536) != 0) {
            bool3 = orderSubmitState.isLoadingChunk;
        }
        if ((i7 & 131072) != 0) {
            c27919AxX3 = orderSubmitState.moveToPos;
        }
        if ((i7 & 262144) != 0) {
            str11 = orderSubmitState.moveToast;
        }
        if ((i7 & 524288) != 0) {
            obj13 = orderSubmitState.moveCpfToTopPart;
        }
        if ((i7 & 1048576) != 0) {
            cpfElem2 = orderSubmitState.cpfElem;
        }
        if ((i7 & 2097152) != 0) {
            z20 = orderSubmitState.hasCpfInfo;
        }
        if ((4194304 & i7) != 0) {
            c27918AxW2 = orderSubmitState.moveModuleTo;
        }
        if ((8388608 & i7) != 0) {
            z19 = orderSubmitState.hasAvailableOrders;
        }
        if ((16777216 & i7) != 0) {
            enumC26795AfP2 = orderSubmitState.pageStatus;
        }
        if ((i7 & 33554432) != 0) {
            z27 = orderSubmitState.openAddressEditPage;
        }
        return orderSubmitState.copy(i8, list4, c27042AjO2, z18, c26566Abi2, paymentInfo2, z17, z26, c26802AfW2, str10, str13, i9, num3, i11, i12, obj11, obj9, z32, z22, z25, str8, z24, list6, i10, c27822Avy2, z28, oSPBottomNotice2, z30, c27724AuO2, str12, str9, obj12, z31, c26548AbQ2, str14, num4, z23, z29, obj14, obj15, obj10, c27919AxX4, c27941Axt2, z21, list5, billingFragmentEnterParams2, bool4, announcement2, bool3, c27919AxX3, str11, obj13, cpfElem2, z20, c27918AxW2, z19, enumC26795AfP2, z27);
    }

    public final OrderSubmitState copy(int i, List<? extends Object> adapterList, C27042AjO c27042AjO, boolean z, C26566Abi c26566Abi, PaymentInfo paymentInfo, boolean z2, boolean z3, C26802AfW c26802AfW, String total, String totalDesc, int i2, Integer num, int i3, int i4, Object obj, Object obj2, boolean z4, boolean z5, boolean z6, String str, boolean z7, List<VoucherInfoNew> list, int i5, C27822Avy c27822Avy, boolean z8, OSPBottomNotice oSPBottomNotice, boolean z9, C27724AuO c27724AuO, String str2, String str3, Object obj3, boolean z10, C26548AbQ c26548AbQ, String str4, Integer num2, boolean z11, boolean z12, Object obj4, Object obj5, Object obj6, C27919AxX<String> c27919AxX, C27941Axt c27941Axt, boolean z13, List<Announcement> list2, BillingFragmentEnterParams billingFragmentEnterParams, Boolean bool, Announcement announcement, Boolean bool2, C27919AxX<Integer> c27919AxX2, String str5, Object obj7, CpfElem cpfElem, boolean z14, C27918AxW c27918AxW, boolean z15, EnumC26795AfP pageStatus, boolean z16) {
        o.LJIIIZ(adapterList, "adapterList");
        o.LJIIIZ(total, "total");
        o.LJIIIZ(totalDesc, "totalDesc");
        o.LJIIIZ(pageStatus, "pageStatus");
        return new OrderSubmitState(i, adapterList, c27042AjO, z, c26566Abi, paymentInfo, z2, z3, c26802AfW, total, totalDesc, i2, num, i3, i4, obj, obj2, z4, z5, z6, str, z7, list, i5, c27822Avy, z8, oSPBottomNotice, z9, c27724AuO, str2, str3, obj3, z10, c26548AbQ, str4, num2, z11, z12, obj4, obj5, obj6, c27919AxX, c27941Axt, z13, list2, billingFragmentEnterParams, bool, announcement, bool2, c27919AxX2, str5, obj7, cpfElem, z14, c27918AxW, z15, pageStatus, z16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSubmitState)) {
            return false;
        }
        OrderSubmitState orderSubmitState = (OrderSubmitState) obj;
        return this.pageLoadStatus == orderSubmitState.pageLoadStatus && o.LJ(this.adapterList, orderSubmitState.adapterList) && o.LJ(this.summaryInfo, orderSubmitState.summaryInfo) && this.hasAddress == orderSubmitState.hasAddress && o.LJ(this.address, orderSubmitState.address) && o.LJ(this.userPaymentInfo, orderSubmitState.userPaymentInfo) && this.reachableAny == orderSubmitState.reachableAny && this.orderSummaryPanelOpened == orderSubmitState.orderSummaryPanelOpened && o.LJ(this.message, orderSubmitState.message) && o.LJ(this.total, orderSubmitState.total) && o.LJ(this.totalDesc, orderSubmitState.totalDesc) && this.totalItems == orderSubmitState.totalItems && o.LJ(this.skuTotalQuantity, orderSubmitState.skuTotalQuantity) && this.abnormalStatus == orderSubmitState.abnormalStatus && this.keyBoardCounterDiff == orderSubmitState.keyBoardCounterDiff && o.LJ(this.networkErrorState, orderSubmitState.networkErrorState) && o.LJ(this.systemErrorState, orderSubmitState.systemErrorState) && this.showDialogState == orderSubmitState.showDialogState && this.showPayState == orderSubmitState.showPayState && this.showPopupState == orderSubmitState.showPopupState && o.LJ(this.showPopupTitle, orderSubmitState.showPopupTitle) && this.loadSuccess == orderSubmitState.loadSuccess && o.LJ(this.voucherInfo, orderSubmitState.voucherInfo) && this.refreshCouponViewModel == orderSubmitState.refreshCouponViewModel && o.LJ(this.currentPage, orderSubmitState.currentPage) && this.checkPayment == orderSubmitState.checkPayment && o.LJ(this.bottomNotice, orderSubmitState.bottomNotice) && this.bottomPromotionBannerDismissed == orderSubmitState.bottomPromotionBannerDismissed && o.LJ(this.platformDiscounts, orderSubmitState.platformDiscounts) && o.LJ(this.topNotice, orderSubmitState.topNotice) && o.LJ(this.buttonPopTips, orderSubmitState.buttonPopTips) && o.LJ(this.resendOrderCreateAction, orderSubmitState.resendOrderCreateAction) && this.showDivider == orderSubmitState.showDivider && o.LJ(this.expandTarget, orderSubmitState.expandTarget) && o.LJ(this.phoneNumberErr, orderSubmitState.phoneNumberErr) && o.LJ(this.checkLawfulCode, orderSubmitState.checkLawfulCode) && this.checkPhoneNumber == orderSubmitState.checkPhoneNumber && this.checkCpfElem == orderSubmitState.checkCpfElem && o.LJ(this.paymentInfoErrorState, orderSubmitState.paymentInfoErrorState) && o.LJ(this.useVoucherState, orderSubmitState.useVoucherState) && o.LJ(this.showShippingPriceToast, orderSubmitState.showShippingPriceToast) && o.LJ(this.toastMsg, orderSubmitState.toastMsg) && o.LJ(this.addonOrderInfo, orderSubmitState.addonOrderInfo) && this.hideSummaryPanel == orderSubmitState.hideSummaryPanel && o.LJ(this.announcements, orderSubmitState.announcements) && o.LJ(this.editBillingAddress, orderSubmitState.editBillingAddress) && o.LJ(this.isShowToastForVoucher, orderSubmitState.isShowToastForVoucher) && o.LJ(this.cashbackNotice, orderSubmitState.cashbackNotice) && o.LJ(this.isLoadingChunk, orderSubmitState.isLoadingChunk) && o.LJ(this.moveToPos, orderSubmitState.moveToPos) && o.LJ(this.moveToast, orderSubmitState.moveToast) && o.LJ(this.moveCpfToTopPart, orderSubmitState.moveCpfToTopPart) && o.LJ(this.cpfElem, orderSubmitState.cpfElem) && this.hasCpfInfo == orderSubmitState.hasCpfInfo && o.LJ(this.moveModuleTo, orderSubmitState.moveModuleTo) && this.hasAvailableOrders == orderSubmitState.hasAvailableOrders && this.pageStatus == orderSubmitState.pageStatus && this.openAddressEditPage == orderSubmitState.openAddressEditPage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int LIZIZ = AnonymousClass391.LIZIZ(this.adapterList, this.pageLoadStatus * 31, 31);
        C27042AjO c27042AjO = this.summaryInfo;
        int i = 0;
        if (c27042AjO == null) {
            hashCode = 0;
        } else {
            hashCode = c27042AjO.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        boolean z = this.hasAddress;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int i5 = (i2 + i4) * 31;
        C26566Abi c26566Abi = this.address;
        if (c26566Abi == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c26566Abi.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        PaymentInfo paymentInfo = this.userPaymentInfo;
        if (paymentInfo == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = paymentInfo.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        boolean z2 = this.reachableAny;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        boolean z3 = this.orderSummaryPanelOpened;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        C26802AfW c26802AfW = this.message;
        if (c26802AfW == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c26802AfW.hashCode();
        }
        int LJ = (C79062V1e.LJ(this.totalDesc, C79062V1e.LJ(this.total, (i11 + hashCode4) * 31, 31), 31) + this.totalItems) * 31;
        Integer num = this.skuTotalQuantity;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i12 = (((((LJ + hashCode5) * 31) + this.abnormalStatus) * 31) + this.keyBoardCounterDiff) * 31;
        Object obj = this.networkErrorState;
        if (obj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = obj.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Object obj2 = this.systemErrorState;
        if (obj2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = obj2.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        boolean z4 = this.showDialogState;
        int i15 = z4;
        if (z4 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z5 = this.showPayState;
        int i17 = z5;
        if (z5 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z6 = this.showPopupState;
        int i19 = z6;
        if (z6 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        String str = this.showPopupTitle;
        if (str == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str.hashCode();
        }
        int i21 = (i20 + hashCode8) * 31;
        boolean z7 = this.loadSuccess;
        int i22 = z7;
        if (z7 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        List<VoucherInfoNew> list = this.voucherInfo;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int i24 = (((i23 + hashCode9) * 31) + this.refreshCouponViewModel) * 31;
        C27822Avy c27822Avy = this.currentPage;
        if (c27822Avy == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = c27822Avy.hashCode();
        }
        int i25 = (i24 + hashCode10) * 31;
        boolean z8 = this.checkPayment;
        int i26 = z8;
        if (z8 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        OSPBottomNotice oSPBottomNotice = this.bottomNotice;
        if (oSPBottomNotice == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = oSPBottomNotice.hashCode();
        }
        int i28 = (i27 + hashCode11) * 31;
        boolean z9 = this.bottomPromotionBannerDismissed;
        int i29 = z9;
        if (z9 != 0) {
            i29 = 1;
        }
        int i30 = (i28 + i29) * 31;
        C27724AuO c27724AuO = this.platformDiscounts;
        if (c27724AuO == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = c27724AuO.hashCode();
        }
        int i31 = (i30 + hashCode12) * 31;
        String str2 = this.topNotice;
        if (str2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str2.hashCode();
        }
        int i32 = (i31 + hashCode13) * 31;
        String str3 = this.buttonPopTips;
        if (str3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str3.hashCode();
        }
        int i33 = (i32 + hashCode14) * 31;
        Object obj3 = this.resendOrderCreateAction;
        if (obj3 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = obj3.hashCode();
        }
        int i34 = (i33 + hashCode15) * 31;
        boolean z10 = this.showDivider;
        int i35 = z10;
        if (z10 != 0) {
            i35 = 1;
        }
        int i36 = (i34 + i35) * 31;
        C26548AbQ c26548AbQ = this.expandTarget;
        if (c26548AbQ == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = c26548AbQ.hashCode();
        }
        int i37 = (i36 + hashCode16) * 31;
        String str4 = this.phoneNumberErr;
        if (str4 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str4.hashCode();
        }
        int i38 = (i37 + hashCode17) * 31;
        Integer num2 = this.checkLawfulCode;
        if (num2 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num2.hashCode();
        }
        int i39 = (i38 + hashCode18) * 31;
        boolean z11 = this.checkPhoneNumber;
        int i40 = z11;
        if (z11 != 0) {
            i40 = 1;
        }
        int i41 = (i39 + i40) * 31;
        boolean z12 = this.checkCpfElem;
        int i42 = z12;
        if (z12 != 0) {
            i42 = 1;
        }
        int i43 = (i41 + i42) * 31;
        Object obj4 = this.paymentInfoErrorState;
        if (obj4 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = obj4.hashCode();
        }
        int i44 = (i43 + hashCode19) * 31;
        Object obj5 = this.useVoucherState;
        if (obj5 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = obj5.hashCode();
        }
        int i45 = (i44 + hashCode20) * 31;
        Object obj6 = this.showShippingPriceToast;
        if (obj6 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = obj6.hashCode();
        }
        int i46 = (i45 + hashCode21) * 31;
        C27919AxX<String> c27919AxX = this.toastMsg;
        if (c27919AxX == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = c27919AxX.hashCode();
        }
        int i47 = (i46 + hashCode22) * 31;
        C27941Axt c27941Axt = this.addonOrderInfo;
        if (c27941Axt == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = c27941Axt.hashCode();
        }
        int i48 = (i47 + hashCode23) * 31;
        boolean z13 = this.hideSummaryPanel;
        int i49 = z13;
        if (z13 != 0) {
            i49 = 1;
        }
        int i50 = (i48 + i49) * 31;
        List<Announcement> list2 = this.announcements;
        if (list2 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = list2.hashCode();
        }
        int i51 = (i50 + hashCode24) * 31;
        BillingFragmentEnterParams billingFragmentEnterParams = this.editBillingAddress;
        if (billingFragmentEnterParams == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = billingFragmentEnterParams.hashCode();
        }
        int i52 = (i51 + hashCode25) * 31;
        Boolean bool = this.isShowToastForVoucher;
        if (bool == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = bool.hashCode();
        }
        int i53 = (i52 + hashCode26) * 31;
        Announcement announcement = this.cashbackNotice;
        if (announcement == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = announcement.hashCode();
        }
        int i54 = (i53 + hashCode27) * 31;
        Boolean bool2 = this.isLoadingChunk;
        if (bool2 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = bool2.hashCode();
        }
        int i55 = (i54 + hashCode28) * 31;
        C27919AxX<Integer> c27919AxX2 = this.moveToPos;
        if (c27919AxX2 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = c27919AxX2.hashCode();
        }
        int i56 = (i55 + hashCode29) * 31;
        String str5 = this.moveToast;
        if (str5 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = str5.hashCode();
        }
        int i57 = (i56 + hashCode30) * 31;
        Object obj7 = this.moveCpfToTopPart;
        if (obj7 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = obj7.hashCode();
        }
        int i58 = (i57 + hashCode31) * 31;
        CpfElem cpfElem = this.cpfElem;
        if (cpfElem == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = cpfElem.hashCode();
        }
        int i59 = (i58 + hashCode32) * 31;
        boolean z14 = this.hasCpfInfo;
        int i60 = z14;
        if (z14 != 0) {
            i60 = 1;
        }
        int i61 = (i59 + i60) * 31;
        C27918AxW c27918AxW = this.moveModuleTo;
        if (c27918AxW != null) {
            i = c27918AxW.hashCode();
        }
        int i62 = (i61 + i) * 31;
        boolean z15 = this.hasAvailableOrders;
        int i63 = z15;
        if (z15 != 0) {
            i63 = 1;
        }
        int hashCode33 = (this.pageStatus.hashCode() + ((i62 + i63) * 31)) * 31;
        if (!this.openAddressEditPage) {
            i3 = 0;
        }
        return hashCode33 + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OrderSubmitState(pageLoadStatus=");
        sb.append(this.pageLoadStatus);
        sb.append(", adapterList=");
        sb.append(this.adapterList);
        sb.append(", summaryInfo=");
        sb.append(this.summaryInfo);
        sb.append(", hasAddress=");
        sb.append(this.hasAddress);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", userPaymentInfo=");
        sb.append(this.userPaymentInfo);
        sb.append(", reachableAny=");
        sb.append(this.reachableAny);
        sb.append(", orderSummaryPanelOpened=");
        sb.append(this.orderSummaryPanelOpened);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", totalDesc=");
        sb.append(this.totalDesc);
        sb.append(", totalItems=");
        sb.append(this.totalItems);
        sb.append(", skuTotalQuantity=");
        sb.append(this.skuTotalQuantity);
        sb.append(", abnormalStatus=");
        sb.append(this.abnormalStatus);
        sb.append(", keyBoardCounterDiff=");
        sb.append(this.keyBoardCounterDiff);
        sb.append(", networkErrorState=");
        sb.append(this.networkErrorState);
        sb.append(", systemErrorState=");
        sb.append(this.systemErrorState);
        sb.append(", showDialogState=");
        sb.append(this.showDialogState);
        sb.append(", showPayState=");
        sb.append(this.showPayState);
        sb.append(", showPopupState=");
        sb.append(this.showPopupState);
        sb.append(", showPopupTitle=");
        sb.append(this.showPopupTitle);
        sb.append(", loadSuccess=");
        sb.append(this.loadSuccess);
        sb.append(", voucherInfo=");
        sb.append(this.voucherInfo);
        sb.append(", refreshCouponViewModel=");
        sb.append(this.refreshCouponViewModel);
        sb.append(", currentPage=");
        sb.append(this.currentPage);
        sb.append(", checkPayment=");
        sb.append(this.checkPayment);
        sb.append(", bottomNotice=");
        sb.append(this.bottomNotice);
        sb.append(", bottomPromotionBannerDismissed=");
        sb.append(this.bottomPromotionBannerDismissed);
        sb.append(", platformDiscounts=");
        sb.append(this.platformDiscounts);
        sb.append(", topNotice=");
        sb.append(this.topNotice);
        sb.append(", buttonPopTips=");
        sb.append(this.buttonPopTips);
        sb.append(", resendOrderCreateAction=");
        sb.append(this.resendOrderCreateAction);
        sb.append(", showDivider=");
        sb.append(this.showDivider);
        sb.append(", expandTarget=");
        sb.append(this.expandTarget);
        sb.append(", phoneNumberErr=");
        sb.append(this.phoneNumberErr);
        sb.append(", checkLawfulCode=");
        sb.append(this.checkLawfulCode);
        sb.append(", checkPhoneNumber=");
        sb.append(this.checkPhoneNumber);
        sb.append(", checkCpfElem=");
        sb.append(this.checkCpfElem);
        sb.append(", paymentInfoErrorState=");
        sb.append(this.paymentInfoErrorState);
        sb.append(", useVoucherState=");
        sb.append(this.useVoucherState);
        sb.append(", showShippingPriceToast=");
        sb.append(this.showShippingPriceToast);
        sb.append(", toastMsg=");
        sb.append(this.toastMsg);
        sb.append(", addonOrderInfo=");
        sb.append(this.addonOrderInfo);
        sb.append(", hideSummaryPanel=");
        sb.append(this.hideSummaryPanel);
        sb.append(", announcements=");
        sb.append(this.announcements);
        sb.append(", editBillingAddress=");
        sb.append(this.editBillingAddress);
        sb.append(", isShowToastForVoucher=");
        sb.append(this.isShowToastForVoucher);
        sb.append(", cashbackNotice=");
        sb.append(this.cashbackNotice);
        sb.append(", isLoadingChunk=");
        sb.append(this.isLoadingChunk);
        sb.append(", moveToPos=");
        sb.append(this.moveToPos);
        sb.append(", moveToast=");
        sb.append(this.moveToast);
        sb.append(", moveCpfToTopPart=");
        sb.append(this.moveCpfToTopPart);
        sb.append(", cpfElem=");
        sb.append(this.cpfElem);
        sb.append(", hasCpfInfo=");
        sb.append(this.hasCpfInfo);
        sb.append(", moveModuleTo=");
        sb.append(this.moveModuleTo);
        sb.append(", hasAvailableOrders=");
        sb.append(this.hasAvailableOrders);
        sb.append(", pageStatus=");
        sb.append(this.pageStatus);
        sb.append(", openAddressEditPage=");
        return C08880Wm.LIZJ(sb, this.openAddressEditPage, ')');
    }

    public final int getAbnormalStatus() {
        return this.abnormalStatus;
    }

    public final List<Object> getAdapterList() {
        return this.adapterList;
    }

    public final C27941Axt getAddonOrderInfo() {
        return this.addonOrderInfo;
    }

    public final C26566Abi getAddress() {
        return this.address;
    }

    public final List<Announcement> getAnnouncements() {
        return this.announcements;
    }

    public final OSPBottomNotice getBottomNotice() {
        return this.bottomNotice;
    }

    public final boolean getBottomPromotionBannerDismissed() {
        return this.bottomPromotionBannerDismissed;
    }

    public final String getButtonPopTips() {
        return this.buttonPopTips;
    }

    public final Announcement getCashbackNotice() {
        return this.cashbackNotice;
    }

    public final boolean getCheckCpfElem() {
        return this.checkCpfElem;
    }

    public final Integer getCheckLawfulCode() {
        return this.checkLawfulCode;
    }

    public final boolean getCheckPayment() {
        return this.checkPayment;
    }

    public final boolean getCheckPhoneNumber() {
        return this.checkPhoneNumber;
    }

    public final CpfElem getCpfElem() {
        return this.cpfElem;
    }

    public final C27822Avy getCurrentPage() {
        return this.currentPage;
    }

    public final BillingFragmentEnterParams getEditBillingAddress() {
        return this.editBillingAddress;
    }

    public final C26548AbQ getExpandTarget() {
        return this.expandTarget;
    }

    public final boolean getHasAddress() {
        return this.hasAddress;
    }

    public final boolean getHasAvailableOrders() {
        return this.hasAvailableOrders;
    }

    public final boolean getHasCpfInfo() {
        return this.hasCpfInfo;
    }

    public final boolean getHideSummaryPanel() {
        return this.hideSummaryPanel;
    }

    public final int getKeyBoardCounterDiff() {
        return this.keyBoardCounterDiff;
    }

    public final boolean getLoadSuccess() {
        return this.loadSuccess;
    }

    public final C26802AfW getMessage() {
        return this.message;
    }

    public final Object getMoveCpfToTopPart() {
        return this.moveCpfToTopPart;
    }

    public final C27918AxW getMoveModuleTo() {
        return this.moveModuleTo;
    }

    public final C27919AxX<Integer> getMoveToPos() {
        return this.moveToPos;
    }

    public final String getMoveToast() {
        return this.moveToast;
    }

    public final Object getNetworkErrorState() {
        return this.networkErrorState;
    }

    public final boolean getOpenAddressEditPage() {
        return this.openAddressEditPage;
    }

    public final boolean getOrderSummaryPanelOpened() {
        return this.orderSummaryPanelOpened;
    }

    public final int getPageLoadStatus() {
        return this.pageLoadStatus;
    }

    public final EnumC26795AfP getPageStatus() {
        return this.pageStatus;
    }

    public final Object getPaymentInfoErrorState() {
        return this.paymentInfoErrorState;
    }

    public final String getPhoneNumberErr() {
        return this.phoneNumberErr;
    }

    public final C27724AuO getPlatformDiscounts() {
        return this.platformDiscounts;
    }

    public final boolean getReachableAny() {
        return this.reachableAny;
    }

    public final int getRefreshCouponViewModel() {
        return this.refreshCouponViewModel;
    }

    public final Object getResendOrderCreateAction() {
        return this.resendOrderCreateAction;
    }

    public final boolean getShowDialogState() {
        return this.showDialogState;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final boolean getShowPayState() {
        return this.showPayState;
    }

    public final boolean getShowPopupState() {
        return this.showPopupState;
    }

    public final String getShowPopupTitle() {
        return this.showPopupTitle;
    }

    public final Object getShowShippingPriceToast() {
        return this.showShippingPriceToast;
    }

    public final Integer getSkuTotalQuantity() {
        return this.skuTotalQuantity;
    }

    public final C27042AjO getSummaryInfo() {
        return this.summaryInfo;
    }

    public final Object getSystemErrorState() {
        return this.systemErrorState;
    }

    public final C27919AxX<String> getToastMsg() {
        return this.toastMsg;
    }

    public final String getTopNotice() {
        return this.topNotice;
    }

    public final String getTotal() {
        return this.total;
    }

    public final String getTotalDesc() {
        return this.totalDesc;
    }

    public final int getTotalItems() {
        return this.totalItems;
    }

    public final Object getUseVoucherState() {
        return this.useVoucherState;
    }

    public final PaymentInfo getUserPaymentInfo() {
        return this.userPaymentInfo;
    }

    public final List<VoucherInfoNew> getVoucherInfo() {
        return this.voucherInfo;
    }

    public final Boolean isLoadingChunk() {
        return this.isLoadingChunk;
    }

    public final Boolean isShowToastForVoucher() {
        return this.isShowToastForVoucher;
    }

    public final void setUserPaymentInfo(PaymentInfo paymentInfo) {
        this.userPaymentInfo = paymentInfo;
    }

    public OrderSubmitState(int i, List<? extends Object> adapterList, C27042AjO c27042AjO, boolean z, C26566Abi c26566Abi, PaymentInfo paymentInfo, boolean z2, boolean z3, C26802AfW c26802AfW, String total, String totalDesc, int i2, Integer num, int i3, int i4, Object obj, Object obj2, boolean z4, boolean z5, boolean z6, String str, boolean z7, List<VoucherInfoNew> list, int i5, C27822Avy c27822Avy, boolean z8, OSPBottomNotice oSPBottomNotice, boolean z9, C27724AuO c27724AuO, String str2, String str3, Object obj3, boolean z10, C26548AbQ c26548AbQ, String str4, Integer num2, boolean z11, boolean z12, Object obj4, Object obj5, Object obj6, C27919AxX<String> c27919AxX, C27941Axt c27941Axt, boolean z13, List<Announcement> list2, BillingFragmentEnterParams billingFragmentEnterParams, Boolean bool, Announcement announcement, Boolean bool2, C27919AxX<Integer> c27919AxX2, String str5, Object obj7, CpfElem cpfElem, boolean z14, C27918AxW c27918AxW, boolean z15, EnumC26795AfP pageStatus, boolean z16) {
        o.LJIIIZ(adapterList, "adapterList");
        o.LJIIIZ(total, "total");
        o.LJIIIZ(totalDesc, "totalDesc");
        o.LJIIIZ(pageStatus, "pageStatus");
        this.pageLoadStatus = i;
        this.adapterList = adapterList;
        this.summaryInfo = c27042AjO;
        this.hasAddress = z;
        this.address = c26566Abi;
        this.userPaymentInfo = paymentInfo;
        this.reachableAny = z2;
        this.orderSummaryPanelOpened = z3;
        this.message = c26802AfW;
        this.total = total;
        this.totalDesc = totalDesc;
        this.totalItems = i2;
        this.skuTotalQuantity = num;
        this.abnormalStatus = i3;
        this.keyBoardCounterDiff = i4;
        this.networkErrorState = obj;
        this.systemErrorState = obj2;
        this.showDialogState = z4;
        this.showPayState = z5;
        this.showPopupState = z6;
        this.showPopupTitle = str;
        this.loadSuccess = z7;
        this.voucherInfo = list;
        this.refreshCouponViewModel = i5;
        this.currentPage = c27822Avy;
        this.checkPayment = z8;
        this.bottomNotice = oSPBottomNotice;
        this.bottomPromotionBannerDismissed = z9;
        this.platformDiscounts = c27724AuO;
        this.topNotice = str2;
        this.buttonPopTips = str3;
        this.resendOrderCreateAction = obj3;
        this.showDivider = z10;
        this.expandTarget = c26548AbQ;
        this.phoneNumberErr = str4;
        this.checkLawfulCode = num2;
        this.checkPhoneNumber = z11;
        this.checkCpfElem = z12;
        this.paymentInfoErrorState = obj4;
        this.useVoucherState = obj5;
        this.showShippingPriceToast = obj6;
        this.toastMsg = c27919AxX;
        this.addonOrderInfo = c27941Axt;
        this.hideSummaryPanel = z13;
        this.announcements = list2;
        this.editBillingAddress = billingFragmentEnterParams;
        this.isShowToastForVoucher = bool;
        this.cashbackNotice = announcement;
        this.isLoadingChunk = bool2;
        this.moveToPos = c27919AxX2;
        this.moveToast = str5;
        this.moveCpfToTopPart = obj7;
        this.cpfElem = cpfElem;
        this.hasCpfInfo = z14;
        this.moveModuleTo = c27918AxW;
        this.hasAvailableOrders = z15;
        this.pageStatus = pageStatus;
        this.openAddressEditPage = z16;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OrderSubmitState(int r66, java.util.List r67, X.C27042AjO r68, boolean r69, X.C26566Abi r70, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r71, boolean r72, boolean r73, X.C26802AfW r74, java.lang.String r75, java.lang.String r76, int r77, java.lang.Integer r78, int r79, int r80, java.lang.Object r81, java.lang.Object r82, boolean r83, boolean r84, boolean r85, java.lang.String r86, boolean r87, java.util.List r88, int r89, X.C27822Avy r90, boolean r91, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPBottomNotice r92, boolean r93, X.C27724AuO r94, java.lang.String r95, java.lang.String r96, java.lang.Object r97, boolean r98, X.C26548AbQ r99, java.lang.String r100, java.lang.Integer r101, boolean r102, boolean r103, java.lang.Object r104, java.lang.Object r105, java.lang.Object r106, X.C27919AxX r107, X.C27941Axt r108, boolean r109, java.util.List r110, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams r111, java.lang.Boolean r112, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement r113, java.lang.Boolean r114, X.C27919AxX r115, java.lang.String r116, java.lang.Object r117, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem r118, boolean r119, X.C27918AxW r120, boolean r121, X.EnumC26795AfP r122, boolean r123, int r124, int r125, kotlin.jvm.internal.DefaultConstructorMarker r126) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState.<init>(int, java.util.List, X.AjO, boolean, X.Abi, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, boolean, boolean, X.AfW, java.lang.String, java.lang.String, int, java.lang.Integer, int, int, java.lang.Object, java.lang.Object, boolean, boolean, boolean, java.lang.String, boolean, java.util.List, int, X.Avy, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OSPBottomNotice, boolean, X.AuO, java.lang.String, java.lang.String, java.lang.Object, boolean, X.AbQ, java.lang.String, java.lang.Integer, boolean, boolean, java.lang.Object, java.lang.Object, java.lang.Object, X.AxX, X.Axt, boolean, java.util.List, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement, java.lang.Boolean, X.AxX, java.lang.String, java.lang.Object, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CpfElem, boolean, X.AxW, boolean, X.AfP, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
