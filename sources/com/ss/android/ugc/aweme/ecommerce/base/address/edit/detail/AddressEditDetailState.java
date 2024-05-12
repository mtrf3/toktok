package com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail;

import X.AnonymousClass391;
import X.C27021Aj3;
import X.C61878OQg;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressEditDetailState implements InterfaceC61312at {
    public final CandInputDataOptions candInputDataOptions;
    public final CandInputDataOptions initData;
    public final int inputItemFirstTimeLoadingStatus;
    public final List<C27021Aj3> inputItemVOList;
    public final boolean isAllRequiredItemFilled;

    public AddressEditDetailState() {
        this(0, null, null, false, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditDetailState copy$default(AddressEditDetailState addressEditDetailState, int i, List list, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = addressEditDetailState.inputItemFirstTimeLoadingStatus;
        }
        if ((i2 & 2) != 0) {
            list = addressEditDetailState.inputItemVOList;
        }
        if ((i2 & 4) != 0) {
            candInputDataOptions = addressEditDetailState.initData;
        }
        if ((i2 & 8) != 0) {
            z = addressEditDetailState.isAllRequiredItemFilled;
        }
        if ((i2 & 16) != 0) {
            candInputDataOptions2 = addressEditDetailState.candInputDataOptions;
        }
        return addressEditDetailState.copy(i, list, candInputDataOptions, z, candInputDataOptions2);
    }

    public final AddressEditDetailState copy(int i, List<C27021Aj3> inputItemVOList, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2) {
        o.LJIIIZ(inputItemVOList, "inputItemVOList");
        return new AddressEditDetailState(i, inputItemVOList, candInputDataOptions, z, candInputDataOptions2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEditDetailState)) {
            return false;
        }
        AddressEditDetailState addressEditDetailState = (AddressEditDetailState) obj;
        return this.inputItemFirstTimeLoadingStatus == addressEditDetailState.inputItemFirstTimeLoadingStatus && o.LJ(this.inputItemVOList, addressEditDetailState.inputItemVOList) && o.LJ(this.initData, addressEditDetailState.initData) && this.isAllRequiredItemFilled == addressEditDetailState.isAllRequiredItemFilled && o.LJ(this.candInputDataOptions, addressEditDetailState.candInputDataOptions);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressEditDetailState(inputItemFirstTimeLoadingStatus=");
        LIZ.append(this.inputItemFirstTimeLoadingStatus);
        LIZ.append(", inputItemVOList=");
        LIZ.append(this.inputItemVOList);
        LIZ.append(", initData=");
        LIZ.append(this.initData);
        LIZ.append(", isAllRequiredItemFilled=");
        LIZ.append(this.isAllRequiredItemFilled);
        LIZ.append(", candInputDataOptions=");
        LIZ.append(this.candInputDataOptions);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.inputItemVOList, this.inputItemFirstTimeLoadingStatus * 31, 31);
        CandInputDataOptions candInputDataOptions = this.initData;
        int i = 0;
        if (candInputDataOptions == null) {
            hashCode = 0;
        } else {
            hashCode = candInputDataOptions.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        boolean z = this.isAllRequiredItemFilled;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        CandInputDataOptions candInputDataOptions2 = this.candInputDataOptions;
        if (candInputDataOptions2 != null) {
            i = candInputDataOptions2.hashCode();
        }
        return i4 + i;
    }

    public final CandInputDataOptions getCandInputDataOptions() {
        return this.candInputDataOptions;
    }

    public final CandInputDataOptions getInitData() {
        return this.initData;
    }

    public final int getInputItemFirstTimeLoadingStatus() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final List<C27021Aj3> getInputItemVOList() {
        return this.inputItemVOList;
    }

    public final boolean isAllRequiredItemFilled() {
        return this.isAllRequiredItemFilled;
    }

    public AddressEditDetailState(int i, List<C27021Aj3> inputItemVOList, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2) {
        o.LJIIIZ(inputItemVOList, "inputItemVOList");
        this.inputItemFirstTimeLoadingStatus = i;
        this.inputItemVOList = inputItemVOList;
        this.initData = candInputDataOptions;
        this.isAllRequiredItemFilled = z;
        this.candInputDataOptions = candInputDataOptions2;
    }

    public AddressEditDetailState(int i, List list, CandInputDataOptions candInputDataOptions, boolean z, CandInputDataOptions candInputDataOptions2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? C61878OQg.INSTANCE : list, (i2 & 4) != 0 ? null : candInputDataOptions, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? candInputDataOptions2 : null);
    }
}
