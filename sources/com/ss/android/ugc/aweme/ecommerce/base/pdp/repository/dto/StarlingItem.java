package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StarlingItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StarlingItem implements Parcelable {
    public static final Parcelable.Creator<StarlingItem> CREATOR = new Parcelable.Creator<StarlingItem>() { // from class: X.7Eq
        @Override // android.os.Parcelable.Creator
        public final StarlingItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new StarlingItem(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final StarlingItem[] newArray(int i) {
            return new StarlingItem[i];
        }
    };

    @InterfaceC65349Pkn("args")
    public final Map<String, String> args;

    @InterfaceC65349Pkn("key")
    public final String key;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarlingItem)) {
            return false;
        }
        StarlingItem starlingItem = (StarlingItem) obj;
        return o.LJ(this.key, starlingItem.key) && o.LJ(this.args, starlingItem.args);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, String> map = this.args;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.key);
        Map<String, String> map = this.args;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StarlingItem(key=");
        LIZ.append(this.key);
        LIZ.append(", args=");
        return C15890jp.LIZ(LIZ, this.args, ')', LIZ);
    }

    public StarlingItem(String str, Map<String, String> map) {
        this.key = str;
        this.args = map;
    }
}
