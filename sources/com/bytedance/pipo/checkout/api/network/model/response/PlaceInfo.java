package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PlaceInfo {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("matched_substrings")
    public final ArrayList<MatchedSubstrings> matchedSubstrings;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaceInfo copy$default(PlaceInfo placeInfo, String str, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placeInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = placeInfo.desc;
        }
        if ((i & 4) != 0) {
            arrayList = placeInfo.matchedSubstrings;
        }
        return placeInfo.copy(str, str2, arrayList);
    }

    public final PlaceInfo copy(String str, String str2, ArrayList<MatchedSubstrings> arrayList) {
        return new PlaceInfo(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceInfo)) {
            return false;
        }
        PlaceInfo placeInfo = (PlaceInfo) obj;
        return o.LJ(this.id, placeInfo.id) && o.LJ(this.desc, placeInfo.desc) && o.LJ(this.matchedSubstrings, placeInfo.matchedSubstrings);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<MatchedSubstrings> arrayList = this.matchedSubstrings;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceInfo(id=");
        LIZ.append((Object) this.id);
        LIZ.append(", desc=");
        LIZ.append((Object) this.desc);
        LIZ.append(", matchedSubstrings=");
        LIZ.append(this.matchedSubstrings);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getId() {
        return this.id;
    }

    public final ArrayList<MatchedSubstrings> getMatchedSubstrings() {
        return this.matchedSubstrings;
    }

    public PlaceInfo(String str, String str2, ArrayList<MatchedSubstrings> arrayList) {
        this.id = str;
        this.desc = str2;
        this.matchedSubstrings = arrayList;
    }

    public /* synthetic */ PlaceInfo(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : arrayList);
    }
}
