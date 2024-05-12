package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.RW4;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import defpackage.q;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpBottomArea implements Parcelable {
    public static final Parcelable.Creator<PdpBottomArea> CREATOR = new RW4();

    @InterfaceC65349Pkn("area_elem_map")
    public final Map<String, PdpBottomAreaElem> areaElemMap;

    @InterfaceC65349Pkn("add_to_cart_click_hint")
    public final String clickHint;

    @InterfaceC65349Pkn("default_area_id")
    public final String defaultAreaId;

    @InterfaceC65349Pkn("protection_program_text")
    public final LinkRichText protectionProgramText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpBottomArea)) {
            return false;
        }
        PdpBottomArea pdpBottomArea = (PdpBottomArea) obj;
        return o.LJ(this.defaultAreaId, pdpBottomArea.defaultAreaId) && o.LJ(this.areaElemMap, pdpBottomArea.areaElemMap) && o.LJ(this.protectionProgramText, pdpBottomArea.protectionProgramText) && o.LJ(this.clickHint, pdpBottomArea.clickHint);
    }

    public final int hashCode() {
        String str = this.defaultAreaId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, PdpBottomAreaElem> map = this.areaElemMap;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        LinkRichText linkRichText = this.protectionProgramText;
        int hashCode3 = (hashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        String str2 = this.clickHint;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.defaultAreaId);
        Map<String, PdpBottomAreaElem> map = this.areaElemMap;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, PdpBottomAreaElem> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                entry.getValue().writeToParcel(out, i);
            }
        }
        LinkRichText linkRichText = this.protectionProgramText;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        out.writeString(this.clickHint);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpBottomArea(defaultAreaId=");
        LIZ.append(this.defaultAreaId);
        LIZ.append(", areaElemMap=");
        LIZ.append(this.areaElemMap);
        LIZ.append(", protectionProgramText=");
        LIZ.append(this.protectionProgramText);
        LIZ.append(", clickHint=");
        return q.LIZIZ(LIZ, this.clickHint, ')', LIZ);
    }

    public PdpBottomArea(String str, Map<String, PdpBottomAreaElem> map, LinkRichText linkRichText, String str2) {
        this.defaultAreaId = str;
        this.areaElemMap = map;
        this.protectionProgramText = linkRichText;
        this.clickHint = str2;
    }

    public /* synthetic */ PdpBottomArea(String str, Map map, LinkRichText linkRichText, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, linkRichText, (i & 8) != 0 ? null : str2);
    }
}
