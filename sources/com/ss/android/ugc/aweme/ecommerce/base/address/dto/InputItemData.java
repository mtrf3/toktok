package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27218AmE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class InputItemData implements Parcelable {
    public static final Parcelable.Creator<InputItemData> CREATOR = new C27218AmE();

    @InterfaceC65349Pkn("address_location")
    public final AddressLocation addressLocation;

    @InterfaceC65349Pkn("address_rights")
    public final AddressRightsInfo addressRight;

    @InterfaceC65349Pkn("client_config")
    public final ClientConfig config;

    @InterfaceC65349Pkn("input_items")
    public final List<InputItemDTO> inputItems;

    @InterfaceC65349Pkn("privacy_policy_statement")
    public final LinkRichText privacyPolicyStatement;

    @InterfaceC65349Pkn("district")
    public final Region regionInfo;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputItemData)) {
            return false;
        }
        InputItemData inputItemData = (InputItemData) obj;
        return o.LJ(this.inputItems, inputItemData.inputItems) && o.LJ(this.regionInfo, inputItemData.regionInfo) && o.LJ(this.config, inputItemData.config) && o.LJ(this.privacyPolicyStatement, inputItemData.privacyPolicyStatement) && o.LJ(this.addressLocation, inputItemData.addressLocation) && o.LJ(this.addressRight, inputItemData.addressRight);
    }

    public final int hashCode() {
        List<InputItemDTO> list = this.inputItems;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Region region = this.regionInfo;
        int hashCode2 = (hashCode + (region == null ? 0 : region.hashCode())) * 31;
        ClientConfig clientConfig = this.config;
        int hashCode3 = (hashCode2 + (clientConfig == null ? 0 : clientConfig.hashCode())) * 31;
        LinkRichText linkRichText = this.privacyPolicyStatement;
        int hashCode4 = (hashCode3 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        AddressLocation addressLocation = this.addressLocation;
        int hashCode5 = (hashCode4 + (addressLocation == null ? 0 : addressLocation.hashCode())) * 31;
        AddressRightsInfo addressRightsInfo = this.addressRight;
        return hashCode5 + (addressRightsInfo != null ? addressRightsInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InputItemData(inputItems=");
        LIZ.append(this.inputItems);
        LIZ.append(", regionInfo=");
        LIZ.append(this.regionInfo);
        LIZ.append(", config=");
        LIZ.append(this.config);
        LIZ.append(", privacyPolicyStatement=");
        LIZ.append(this.privacyPolicyStatement);
        LIZ.append(", addressLocation=");
        LIZ.append(this.addressLocation);
        LIZ.append(", addressRight=");
        LIZ.append(this.addressRight);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<InputItemDTO> list = this.inputItems;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((InputItemDTO) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Region region = this.regionInfo;
        if (region == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            region.writeToParcel(out, i);
        }
        ClientConfig clientConfig = this.config;
        if (clientConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            clientConfig.writeToParcel(out, i);
        }
        LinkRichText linkRichText = this.privacyPolicyStatement;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        AddressLocation addressLocation = this.addressLocation;
        if (addressLocation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressLocation.writeToParcel(out, i);
        }
        AddressRightsInfo addressRightsInfo = this.addressRight;
        if (addressRightsInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressRightsInfo.writeToParcel(out, i);
        }
    }

    public InputItemData(List<InputItemDTO> list, Region region, ClientConfig clientConfig, LinkRichText linkRichText, AddressLocation addressLocation, AddressRightsInfo addressRightsInfo) {
        this.inputItems = list;
        this.regionInfo = region;
        this.config = clientConfig;
        this.privacyPolicyStatement = linkRichText;
        this.addressLocation = addressLocation;
        this.addressRight = addressRightsInfo;
    }
}
