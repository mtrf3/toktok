package com.ss.android.ugc.aweme.ecommerce.base.address.edit;

import X.AnonymousClass391;
import X.C08880Wm;
import X.C27021Aj3;
import X.C61878OQg;
import X.InterfaceC61312at;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressRightsInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetPromotionResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressEditState implements InterfaceC61312at {
    public final AddressRightsInfo addressRightStatement;
    public final Integer changeRegionLoadingStatus;
    public final Integer deleteLoadingStatus;
    public final boolean emailHintVisible;
    public final CandInputDataOptions initData;
    public final int inputItemFirstTimeLoadingStatus;
    public final List<C27021Aj3> inputItemVOList;
    public final boolean isAllKeyItemFilled;
    public final LinkRichText privacyPolicyStatement;
    public final GetPromotionResponseData promotionInfo;
    public final Integer saveLoadingStatus;
    public final Object showExceptionUX;
    public final Integer windowType;

    public AddressEditState() {
        this(0, null, null, null, null, false, null, null, null, null, null, null, false, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditState copy$default(AddressEditState addressEditState, int i, Integer num, Integer num2, Integer num3, List list, boolean z, LinkRichText linkRichText, CandInputDataOptions candInputDataOptions, Object obj, GetPromotionResponseData getPromotionResponseData, Integer num4, AddressRightsInfo addressRightsInfo, boolean z2, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = addressEditState.inputItemFirstTimeLoadingStatus;
        }
        if ((i2 & 2) != 0) {
            num = addressEditState.changeRegionLoadingStatus;
        }
        if ((i2 & 4) != 0) {
            num2 = addressEditState.deleteLoadingStatus;
        }
        if ((i2 & 8) != 0) {
            num3 = addressEditState.saveLoadingStatus;
        }
        if ((i2 & 16) != 0) {
            list = addressEditState.inputItemVOList;
        }
        if ((i2 & 32) != 0) {
            z = addressEditState.emailHintVisible;
        }
        if ((i2 & 64) != 0) {
            linkRichText = addressEditState.privacyPolicyStatement;
        }
        if ((i2 & 128) != 0) {
            candInputDataOptions = addressEditState.initData;
        }
        if ((i2 & 256) != 0) {
            obj = addressEditState.showExceptionUX;
        }
        if ((i2 & 512) != 0) {
            getPromotionResponseData = addressEditState.promotionInfo;
        }
        if ((i2 & 1024) != 0) {
            num4 = addressEditState.windowType;
        }
        if ((i2 & 2048) != 0) {
            addressRightsInfo = addressEditState.addressRightStatement;
        }
        if ((i2 & 4096) != 0) {
            z2 = addressEditState.isAllKeyItemFilled;
        }
        return addressEditState.copy(i, num, num2, num3, list, z, linkRichText, candInputDataOptions, obj, getPromotionResponseData, num4, addressRightsInfo, z2);
    }

    public final AddressEditState copy(int i, Integer num, Integer num2, Integer num3, List<C27021Aj3> inputItemVOList, boolean z, LinkRichText linkRichText, CandInputDataOptions candInputDataOptions, Object obj, GetPromotionResponseData getPromotionResponseData, Integer num4, AddressRightsInfo addressRightsInfo, boolean z2) {
        o.LJIIIZ(inputItemVOList, "inputItemVOList");
        return new AddressEditState(i, num, num2, num3, inputItemVOList, z, linkRichText, candInputDataOptions, obj, getPromotionResponseData, num4, addressRightsInfo, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEditState)) {
            return false;
        }
        AddressEditState addressEditState = (AddressEditState) obj;
        return this.inputItemFirstTimeLoadingStatus == addressEditState.inputItemFirstTimeLoadingStatus && o.LJ(this.changeRegionLoadingStatus, addressEditState.changeRegionLoadingStatus) && o.LJ(this.deleteLoadingStatus, addressEditState.deleteLoadingStatus) && o.LJ(this.saveLoadingStatus, addressEditState.saveLoadingStatus) && o.LJ(this.inputItemVOList, addressEditState.inputItemVOList) && this.emailHintVisible == addressEditState.emailHintVisible && o.LJ(this.privacyPolicyStatement, addressEditState.privacyPolicyStatement) && o.LJ(this.initData, addressEditState.initData) && o.LJ(this.showExceptionUX, addressEditState.showExceptionUX) && o.LJ(this.promotionInfo, addressEditState.promotionInfo) && o.LJ(this.windowType, addressEditState.windowType) && o.LJ(this.addressRightStatement, addressEditState.addressRightStatement) && this.isAllKeyItemFilled == addressEditState.isAllKeyItemFilled;
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
        int i = this.inputItemFirstTimeLoadingStatus * 31;
        Integer num = this.changeRegionLoadingStatus;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i + hashCode) * 31;
        Integer num2 = this.deleteLoadingStatus;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        Integer num3 = this.saveLoadingStatus;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.inputItemVOList, (i4 + hashCode3) * 31, 31);
        boolean z = this.emailHintVisible;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (LIZIZ + i6) * 31;
        LinkRichText linkRichText = this.privacyPolicyStatement;
        if (linkRichText == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = linkRichText.hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        CandInputDataOptions candInputDataOptions = this.initData;
        if (candInputDataOptions == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = candInputDataOptions.hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        Object obj = this.showExceptionUX;
        if (obj == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = obj.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        GetPromotionResponseData getPromotionResponseData = this.promotionInfo;
        if (getPromotionResponseData == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = getPromotionResponseData.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        Integer num4 = this.windowType;
        if (num4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num4.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        AddressRightsInfo addressRightsInfo = this.addressRightStatement;
        if (addressRightsInfo != null) {
            i2 = addressRightsInfo.hashCode();
        }
        int i13 = (i12 + i2) * 31;
        if (!this.isAllKeyItemFilled) {
            i5 = 0;
        }
        return i13 + i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddressEditState(inputItemFirstTimeLoadingStatus=");
        sb.append(this.inputItemFirstTimeLoadingStatus);
        sb.append(", changeRegionLoadingStatus=");
        sb.append(this.changeRegionLoadingStatus);
        sb.append(", deleteLoadingStatus=");
        sb.append(this.deleteLoadingStatus);
        sb.append(", saveLoadingStatus=");
        sb.append(this.saveLoadingStatus);
        sb.append(", inputItemVOList=");
        sb.append(this.inputItemVOList);
        sb.append(", emailHintVisible=");
        sb.append(this.emailHintVisible);
        sb.append(", privacyPolicyStatement=");
        sb.append(this.privacyPolicyStatement);
        sb.append(", initData=");
        sb.append(this.initData);
        sb.append(", showExceptionUX=");
        sb.append(this.showExceptionUX);
        sb.append(", promotionInfo=");
        sb.append(this.promotionInfo);
        sb.append(", windowType=");
        sb.append(this.windowType);
        sb.append(", addressRightStatement=");
        sb.append(this.addressRightStatement);
        sb.append(", isAllKeyItemFilled=");
        return C08880Wm.LIZJ(sb, this.isAllKeyItemFilled, ')');
    }

    public final AddressRightsInfo getAddressRightStatement() {
        return this.addressRightStatement;
    }

    public final Integer getChangeRegionLoadingStatus() {
        return this.changeRegionLoadingStatus;
    }

    public final Integer getDeleteLoadingStatus() {
        return this.deleteLoadingStatus;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
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

    public final LinkRichText getPrivacyPolicyStatement() {
        return this.privacyPolicyStatement;
    }

    public final GetPromotionResponseData getPromotionInfo() {
        return this.promotionInfo;
    }

    public final Integer getSaveLoadingStatus() {
        return this.saveLoadingStatus;
    }

    public final Object getShowExceptionUX() {
        return this.showExceptionUX;
    }

    public final Integer getWindowType() {
        return this.windowType;
    }

    public final boolean isAllKeyItemFilled() {
        return this.isAllKeyItemFilled;
    }

    public AddressEditState(int i, Integer num, Integer num2, Integer num3, List<C27021Aj3> inputItemVOList, boolean z, LinkRichText linkRichText, CandInputDataOptions candInputDataOptions, Object obj, GetPromotionResponseData getPromotionResponseData, Integer num4, AddressRightsInfo addressRightsInfo, boolean z2) {
        o.LJIIIZ(inputItemVOList, "inputItemVOList");
        this.inputItemFirstTimeLoadingStatus = i;
        this.changeRegionLoadingStatus = num;
        this.deleteLoadingStatus = num2;
        this.saveLoadingStatus = num3;
        this.inputItemVOList = inputItemVOList;
        this.emailHintVisible = z;
        this.privacyPolicyStatement = linkRichText;
        this.initData = candInputDataOptions;
        this.showExceptionUX = obj;
        this.promotionInfo = getPromotionResponseData;
        this.windowType = num4;
        this.addressRightStatement = addressRightsInfo;
        this.isAllKeyItemFilled = z2;
    }

    public AddressEditState(int i, Integer num, Integer num2, Integer num3, List list, boolean z, LinkRichText linkRichText, CandInputDataOptions candInputDataOptions, Object obj, GetPromotionResponseData getPromotionResponseData, Integer num4, AddressRightsInfo addressRightsInfo, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? C61878OQg.INSTANCE : list, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : linkRichText, (i2 & 128) != 0 ? null : candInputDataOptions, (i2 & 256) != 0 ? null : obj, (i2 & 512) != 0 ? null : getPromotionResponseData, (i2 & 1024) != 0 ? null : num4, (i2 & 2048) == 0 ? addressRightsInfo : null, (i2 & 4096) == 0 ? z2 : false);
    }
}
