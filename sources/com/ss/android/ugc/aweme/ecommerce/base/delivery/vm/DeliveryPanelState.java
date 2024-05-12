package com.ss.android.ugc.aweme.ecommerce.base.delivery.vm;

import X.AnonymousClass391;
import X.C26817Afl;
import X.C26934Ahe;
import X.C61878OQg;
import X.EnumC26931Ahb;
import X.HXX;
import X.InterfaceC61312at;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DeliveryPanelState implements InterfaceC61312at {
    public final List<Object> addressRenderData;
    public final boolean apply;
    public final C26934Ahe changePage;
    public final ExceptionUX claimVoucherExceptionUX;
    public final DispatchFrom dispatchInfo;
    public final Set<String> exposedAddOnItems;
    public final Set<LogisticDTO> exposedItems;
    public final List<Object> logisticList;
    public final List<LogisticDTO> logistics;
    public final PDPLogisticModule pdpLogisticModule;
    public final LogisticDTO selectedLogistic;
    public final C26817Afl selectedShipToInfo;
    public final ShippingTOAddressInfo shippingToAddressInfo;
    public final int status;

    public DeliveryPanelState() {
        this(null, false, null, null, null, 0, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ DeliveryPanelState copy$default(DeliveryPanelState deliveryPanelState, C26934Ahe c26934Ahe, boolean z, LogisticDTO logisticDTO, C26817Afl c26817Afl, List list, int i, List list2, ExceptionUX exceptionUX, Set set, Set set2, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List list3, PDPLogisticModule pDPLogisticModule, int i2, Object obj) {
        C26934Ahe c26934Ahe2 = c26934Ahe;
        boolean z2 = z;
        LogisticDTO logisticDTO2 = logisticDTO;
        C26817Afl c26817Afl2 = c26817Afl;
        List list4 = list;
        int i3 = i;
        List list5 = list2;
        ExceptionUX exceptionUX2 = exceptionUX;
        Set set3 = set;
        Set set4 = set2;
        DispatchFrom dispatchFrom2 = dispatchFrom;
        ShippingTOAddressInfo shippingTOAddressInfo2 = shippingTOAddressInfo;
        List list6 = list3;
        PDPLogisticModule pDPLogisticModule2 = pDPLogisticModule;
        if ((i2 & 1) != 0) {
            c26934Ahe2 = deliveryPanelState.changePage;
        }
        if ((i2 & 2) != 0) {
            z2 = deliveryPanelState.apply;
        }
        if ((i2 & 4) != 0) {
            logisticDTO2 = deliveryPanelState.selectedLogistic;
        }
        if ((i2 & 8) != 0) {
            c26817Afl2 = deliveryPanelState.selectedShipToInfo;
        }
        if ((i2 & 16) != 0) {
            list4 = deliveryPanelState.addressRenderData;
        }
        if ((i2 & 32) != 0) {
            i3 = deliveryPanelState.status;
        }
        if ((i2 & 64) != 0) {
            list5 = deliveryPanelState.logisticList;
        }
        if ((i2 & 128) != 0) {
            exceptionUX2 = deliveryPanelState.claimVoucherExceptionUX;
        }
        if ((i2 & 256) != 0) {
            set3 = deliveryPanelState.exposedItems;
        }
        if ((i2 & 512) != 0) {
            set4 = deliveryPanelState.exposedAddOnItems;
        }
        if ((i2 & 1024) != 0) {
            dispatchFrom2 = deliveryPanelState.dispatchInfo;
        }
        if ((i2 & 2048) != 0) {
            shippingTOAddressInfo2 = deliveryPanelState.shippingToAddressInfo;
        }
        if ((i2 & 4096) != 0) {
            list6 = deliveryPanelState.logistics;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            pDPLogisticModule2 = deliveryPanelState.pdpLogisticModule;
        }
        return deliveryPanelState.copy(c26934Ahe2, z2, logisticDTO2, c26817Afl2, list4, i3, list5, exceptionUX2, set3, set4, dispatchFrom2, shippingTOAddressInfo2, list6, pDPLogisticModule2);
    }

    public final DeliveryPanelState copy(C26934Ahe changePage, boolean z, LogisticDTO logisticDTO, C26817Afl selectedShipToInfo, List<? extends Object> addressRenderData, int i, List<? extends Object> list, ExceptionUX exceptionUX, Set<LogisticDTO> exposedItems, Set<String> exposedAddOnItems, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list2, PDPLogisticModule pDPLogisticModule) {
        o.LJIIIZ(changePage, "changePage");
        o.LJIIIZ(selectedShipToInfo, "selectedShipToInfo");
        o.LJIIIZ(addressRenderData, "addressRenderData");
        o.LJIIIZ(exposedItems, "exposedItems");
        o.LJIIIZ(exposedAddOnItems, "exposedAddOnItems");
        return new DeliveryPanelState(changePage, z, logisticDTO, selectedShipToInfo, addressRenderData, i, list, exceptionUX, exposedItems, exposedAddOnItems, dispatchFrom, shippingTOAddressInfo, list2, pDPLogisticModule);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPanelState)) {
            return false;
        }
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return o.LJ(this.changePage, deliveryPanelState.changePage) && this.apply == deliveryPanelState.apply && o.LJ(this.selectedLogistic, deliveryPanelState.selectedLogistic) && o.LJ(this.selectedShipToInfo, deliveryPanelState.selectedShipToInfo) && o.LJ(this.addressRenderData, deliveryPanelState.addressRenderData) && this.status == deliveryPanelState.status && o.LJ(this.logisticList, deliveryPanelState.logisticList) && o.LJ(this.claimVoucherExceptionUX, deliveryPanelState.claimVoucherExceptionUX) && o.LJ(this.exposedItems, deliveryPanelState.exposedItems) && o.LJ(this.exposedAddOnItems, deliveryPanelState.exposedAddOnItems) && o.LJ(this.dispatchInfo, deliveryPanelState.dispatchInfo) && o.LJ(this.shippingToAddressInfo, deliveryPanelState.shippingToAddressInfo) && o.LJ(this.logistics, deliveryPanelState.logistics) && o.LJ(this.pdpLogisticModule, deliveryPanelState.pdpLogisticModule);
    }

    public String toString() {
        return "DeliveryPanelState(changePage=" + this.changePage + ", apply=" + this.apply + ", selectedLogistic=" + this.selectedLogistic + ", selectedShipToInfo=" + this.selectedShipToInfo + ", addressRenderData=" + this.addressRenderData + ", status=" + this.status + ", logisticList=" + this.logisticList + ", claimVoucherExceptionUX=" + this.claimVoucherExceptionUX + ", exposedItems=" + this.exposedItems + ", exposedAddOnItems=" + this.exposedAddOnItems + ", dispatchInfo=" + this.dispatchInfo + ", shippingToAddressInfo=" + this.shippingToAddressInfo + ", logistics=" + this.logistics + ", pdpLogisticModule=" + this.pdpLogisticModule + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.changePage.hashCode() * 31;
        boolean z = this.apply;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode7 + i) * 31;
        LogisticDTO logisticDTO = this.selectedLogistic;
        int i3 = 0;
        if (logisticDTO == null) {
            hashCode = 0;
        } else {
            hashCode = logisticDTO.hashCode();
        }
        int LIZIZ = (AnonymousClass391.LIZIZ(this.addressRenderData, (this.selectedShipToInfo.hashCode() + ((i2 + hashCode) * 31)) * 31, 31) + this.status) * 31;
        List<Object> list = this.logisticList;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i4 = (LIZIZ + hashCode2) * 31;
        ExceptionUX exceptionUX = this.claimVoucherExceptionUX;
        if (exceptionUX == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = exceptionUX.hashCode();
        }
        int LIZ = HXX.LIZ(this.exposedAddOnItems, HXX.LIZ(this.exposedItems, (i4 + hashCode3) * 31, 31), 31);
        DispatchFrom dispatchFrom = this.dispatchInfo;
        if (dispatchFrom == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = dispatchFrom.hashCode();
        }
        int i5 = (LIZ + hashCode4) * 31;
        ShippingTOAddressInfo shippingTOAddressInfo = this.shippingToAddressInfo;
        if (shippingTOAddressInfo == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = shippingTOAddressInfo.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<LogisticDTO> list2 = this.logistics;
        if (list2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        PDPLogisticModule pDPLogisticModule = this.pdpLogisticModule;
        if (pDPLogisticModule != null) {
            i3 = pDPLogisticModule.hashCode();
        }
        return i7 + i3;
    }

    public final List<Object> getAddressRenderData() {
        return this.addressRenderData;
    }

    public final boolean getApply() {
        return this.apply;
    }

    public final C26934Ahe getChangePage() {
        return this.changePage;
    }

    public final ExceptionUX getClaimVoucherExceptionUX() {
        return this.claimVoucherExceptionUX;
    }

    public final DispatchFrom getDispatchInfo() {
        return this.dispatchInfo;
    }

    public final Set<String> getExposedAddOnItems() {
        return this.exposedAddOnItems;
    }

    public final Set<LogisticDTO> getExposedItems() {
        return this.exposedItems;
    }

    public final List<Object> getLogisticList() {
        return this.logisticList;
    }

    public final List<LogisticDTO> getLogistics() {
        return this.logistics;
    }

    public final PDPLogisticModule getPdpLogisticModule() {
        return this.pdpLogisticModule;
    }

    public final LogisticDTO getSelectedLogistic() {
        return this.selectedLogistic;
    }

    public final C26817Afl getSelectedShipToInfo() {
        return this.selectedShipToInfo;
    }

    public final ShippingTOAddressInfo getShippingToAddressInfo() {
        return this.shippingToAddressInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean canSelectLogistic(Parcelable parcelable) {
        boolean z;
        boolean z2;
        boolean LJ;
        ReachableAddress reachableAddress;
        if (this.selectedShipToInfo.LIZ == null) {
            z = true;
        } else {
            z = false;
        }
        if (!this.addressRenderData.isEmpty()) {
            Iterator<Object> it = this.addressRenderData.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((next instanceof ReachableAddress) && (reachableAddress = (ReachableAddress) next) != null && o.LJ(reachableAddress.reachable, Boolean.TRUE)) {
                    if (next != null) {
                        z2 = false;
                    }
                }
            }
        }
        z2 = true;
        boolean z3 = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
        ReachableAddress LIZ = this.selectedShipToInfo.LIZ();
        if (LIZ == null) {
            LJ = false;
        } else {
            LJ = o.LJ(LIZ.reachable, Boolean.FALSE);
        }
        if (((!z || !z2) && !LJ) || !z3) {
            return true;
        }
        return false;
    }

    public DeliveryPanelState(C26934Ahe changePage, boolean z, LogisticDTO logisticDTO, C26817Afl selectedShipToInfo, List<? extends Object> addressRenderData, int i, List<? extends Object> list, ExceptionUX exceptionUX, Set<LogisticDTO> exposedItems, Set<String> exposedAddOnItems, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List<LogisticDTO> list2, PDPLogisticModule pDPLogisticModule) {
        o.LJIIIZ(changePage, "changePage");
        o.LJIIIZ(selectedShipToInfo, "selectedShipToInfo");
        o.LJIIIZ(addressRenderData, "addressRenderData");
        o.LJIIIZ(exposedItems, "exposedItems");
        o.LJIIIZ(exposedAddOnItems, "exposedAddOnItems");
        this.changePage = changePage;
        this.apply = z;
        this.selectedLogistic = logisticDTO;
        this.selectedShipToInfo = selectedShipToInfo;
        this.addressRenderData = addressRenderData;
        this.status = i;
        this.logisticList = list;
        this.claimVoucherExceptionUX = exceptionUX;
        this.exposedItems = exposedItems;
        this.exposedAddOnItems = exposedAddOnItems;
        this.dispatchInfo = dispatchFrom;
        this.shippingToAddressInfo = shippingTOAddressInfo;
        this.logistics = list2;
        this.pdpLogisticModule = pDPLogisticModule;
    }

    public DeliveryPanelState(C26934Ahe c26934Ahe, boolean z, LogisticDTO logisticDTO, C26817Afl c26817Afl, List list, int i, List list2, ExceptionUX exceptionUX, Set set, Set set2, DispatchFrom dispatchFrom, ShippingTOAddressInfo shippingTOAddressInfo, List list3, PDPLogisticModule pDPLogisticModule, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new C26934Ahe(EnumC26931Ahb.NONE) : c26934Ahe, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : logisticDTO, (i2 & 8) != 0 ? new C26817Afl(null) : c26817Afl, (i2 & 16) != 0 ? C61878OQg.INSTANCE : list, (i2 & 32) == 0 ? i : 0, (i2 & 64) != 0 ? null : list2, (i2 & 128) != 0 ? null : exceptionUX, (i2 & 256) != 0 ? new LinkedHashSet() : set, (i2 & 512) != 0 ? new LinkedHashSet() : set2, (i2 & 1024) != 0 ? null : dispatchFrom, (i2 & 2048) != 0 ? null : shippingTOAddressInfo, (i2 & 4096) != 0 ? null : list3, (i2 & FileUtils.BUFFER_SIZE) == 0 ? pDPLogisticModule : null);
    }
}
