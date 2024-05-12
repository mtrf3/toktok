package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PlaceAutocompleteResponse {

    @InterfaceC65349Pkn("infos")
    public final ArrayList<PlaceInfo> infos;

    @InterfaceC65349Pkn("Report")
    public final String report;

    @InterfaceC65349Pkn("session_key")
    public final String sessionKey;

    /* JADX WARN: Multi-variable type inference failed */
    public PlaceAutocompleteResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaceAutocompleteResponse copy$default(PlaceAutocompleteResponse placeAutocompleteResponse, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = placeAutocompleteResponse.infos;
        }
        if ((i & 2) != 0) {
            str = placeAutocompleteResponse.sessionKey;
        }
        if ((i & 4) != 0) {
            str2 = placeAutocompleteResponse.report;
        }
        return placeAutocompleteResponse.copy(arrayList, str, str2);
    }

    public final PlaceAutocompleteResponse copy(ArrayList<PlaceInfo> arrayList, String str, String str2) {
        return new PlaceAutocompleteResponse(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceAutocompleteResponse)) {
            return false;
        }
        PlaceAutocompleteResponse placeAutocompleteResponse = (PlaceAutocompleteResponse) obj;
        return o.LJ(this.infos, placeAutocompleteResponse.infos) && o.LJ(this.sessionKey, placeAutocompleteResponse.sessionKey) && o.LJ(this.report, placeAutocompleteResponse.report);
    }

    public int hashCode() {
        ArrayList<PlaceInfo> arrayList = this.infos;
        int hashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.sessionKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.report;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceAutocompleteResponse(infos=");
        LIZ.append(this.infos);
        LIZ.append(", sessionKey=");
        LIZ.append((Object) this.sessionKey);
        LIZ.append(", report=");
        LIZ.append((Object) this.report);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ArrayList<PlaceInfo> getInfos() {
        return this.infos;
    }

    public final String getReport() {
        return this.report;
    }

    public final String getSessionKey() {
        return this.sessionKey;
    }

    public PlaceAutocompleteResponse(ArrayList<PlaceInfo> arrayList, String str, String str2) {
        this.infos = arrayList;
        this.sessionKey = str;
        this.report = str2;
    }

    public /* synthetic */ PlaceAutocompleteResponse(ArrayList arrayList, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
