package com.ss.android.ugc.aweme.ecommerce.base.address.list;

import X.C26648Ad2;
import X.C26895Ah1;
import X.InterfaceC61312at;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressListState implements InterfaceC61312at {
    public final List<Object> addressItems;
    public final C26895Ah1 addressState;
    public final C26648Ad2 policyItemVO;
    public final String selectAddressId;
    public final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressListState() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressListState copy$default(AddressListState addressListState, int i, List list, String str, C26648Ad2 c26648Ad2, C26895Ah1 c26895Ah1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressListState.status;
        }
        if ((i2 & 2) != 0) {
            list = addressListState.addressItems;
        }
        if ((i2 & 4) != 0) {
            str = addressListState.selectAddressId;
        }
        if ((i2 & 8) != 0) {
            c26648Ad2 = addressListState.policyItemVO;
        }
        if ((i2 & 16) != 0) {
            c26895Ah1 = addressListState.addressState;
        }
        return addressListState.copy(i, list, str, c26648Ad2, c26895Ah1);
    }

    public final AddressListState copy(int i, List<? extends Object> list, String str, C26648Ad2 c26648Ad2, C26895Ah1 c26895Ah1) {
        return new AddressListState(i, list, str, c26648Ad2, c26895Ah1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressListState)) {
            return false;
        }
        AddressListState addressListState = (AddressListState) obj;
        return this.status == addressListState.status && o.LJ(this.addressItems, addressListState.addressItems) && o.LJ(this.selectAddressId, addressListState.selectAddressId) && o.LJ(this.policyItemVO, addressListState.policyItemVO) && o.LJ(this.addressState, addressListState.addressState);
    }

    public int hashCode() {
        int i = this.status * 31;
        List<Object> list = this.addressItems;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.selectAddressId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C26648Ad2 c26648Ad2 = this.policyItemVO;
        int hashCode3 = (hashCode2 + (c26648Ad2 == null ? 0 : c26648Ad2.hashCode())) * 31;
        C26895Ah1 c26895Ah1 = this.addressState;
        return hashCode3 + (c26895Ah1 != null ? c26895Ah1.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressListState(status=");
        LIZ.append(this.status);
        LIZ.append(", addressItems=");
        LIZ.append(this.addressItems);
        LIZ.append(", selectAddressId=");
        LIZ.append(this.selectAddressId);
        LIZ.append(", policyItemVO=");
        LIZ.append(this.policyItemVO);
        LIZ.append(", addressState=");
        LIZ.append(this.addressState);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<Object> getAddressItems() {
        return this.addressItems;
    }

    public final C26895Ah1 getAddressState() {
        return this.addressState;
    }

    public final C26648Ad2 getPolicyItemVO() {
        return this.policyItemVO;
    }

    public final String getSelectAddressId() {
        return this.selectAddressId;
    }

    public final int getStatus() {
        return this.status;
    }

    public AddressListState(int i, List<? extends Object> list, String str, C26648Ad2 c26648Ad2, C26895Ah1 c26895Ah1) {
        this.status = i;
        this.addressItems = list;
        this.selectAddressId = str;
        this.policyItemVO = c26648Ad2;
        this.addressState = c26895Ah1;
    }

    public /* synthetic */ AddressListState(int i, List list, String str, C26648Ad2 c26648Ad2, C26895Ah1 c26895Ah1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : c26648Ad2, (i2 & 16) == 0 ? c26895Ah1 : null);
    }
}
