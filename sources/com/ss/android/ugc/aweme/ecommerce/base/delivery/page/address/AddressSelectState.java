package com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressSelectState implements InterfaceC61312at {
    public final List<Object> renderDataList;
    public final ReachableAddress selectedAddress;

    public AddressSelectState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressSelectState copy$default(AddressSelectState addressSelectState, ReachableAddress reachableAddress, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            reachableAddress = addressSelectState.selectedAddress;
        }
        if ((i & 2) != 0) {
            list = addressSelectState.renderDataList;
        }
        return addressSelectState.copy(reachableAddress, list);
    }

    public final AddressSelectState copy(ReachableAddress reachableAddress, List<? extends Object> renderDataList) {
        o.LJIIIZ(renderDataList, "renderDataList");
        return new AddressSelectState(reachableAddress, renderDataList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressSelectState)) {
            return false;
        }
        AddressSelectState addressSelectState = (AddressSelectState) obj;
        return o.LJ(this.selectedAddress, addressSelectState.selectedAddress) && o.LJ(this.renderDataList, addressSelectState.renderDataList);
    }

    public int hashCode() {
        ReachableAddress reachableAddress = this.selectedAddress;
        return this.renderDataList.hashCode() + ((reachableAddress == null ? 0 : reachableAddress.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressSelectState(selectedAddress=");
        LIZ.append(this.selectedAddress);
        LIZ.append(", renderDataList=");
        return C1NE.LIZIZ(LIZ, this.renderDataList, ')', LIZ);
    }

    public final List<Object> getRenderDataList() {
        return this.renderDataList;
    }

    public final ReachableAddress getSelectedAddress() {
        return this.selectedAddress;
    }

    public AddressSelectState(ReachableAddress reachableAddress, List<? extends Object> renderDataList) {
        o.LJIIIZ(renderDataList, "renderDataList");
        this.selectedAddress = reachableAddress;
        this.renderDataList = renderDataList;
    }

    public AddressSelectState(ReachableAddress reachableAddress, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reachableAddress, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
