package com.bytedance.ies.powerlist.debug;

import X.C15890jp;
import X.C79062V1e;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ies.powerlist.debug.RecommendAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RecommendAbility implements Parcelable {
    public static final Parcelable.Creator<RecommendAbility> CREATOR = new Parcelable.Creator<RecommendAbility>() { // from class: X.76O
        @Override // android.os.Parcelable.Creator
        public final RecommendAbility createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            LinkedHashMap linkedHashMap;
            boolean z3;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    String readString2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    linkedHashMap.put(readString2, Boolean.valueOf(z3));
                }
            }
            return new RecommendAbility(z, z2, readInt, readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendAbility[] newArray(int i) {
            return new RecommendAbility[i];
        }
    };
    public boolean asyncDiff;
    public Map<String, Boolean> asyncLayoutMap;
    public boolean enablePreload;
    public String fpsName;
    public final int preloadCount;

    public RecommendAbility() {
        this(false, false, 8, "", null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendAbility)) {
            return false;
        }
        RecommendAbility recommendAbility = (RecommendAbility) obj;
        return this.asyncDiff == recommendAbility.asyncDiff && this.enablePreload == recommendAbility.enablePreload && this.preloadCount == recommendAbility.preloadCount && o.LJ(this.fpsName, recommendAbility.fpsName) && o.LJ(this.asyncLayoutMap, recommendAbility.asyncLayoutMap);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.asyncDiff ? 1 : 0);
        out.writeInt(this.enablePreload ? 1 : 0);
        out.writeInt(this.preloadCount);
        out.writeString(this.fpsName);
        Map<String, Boolean> map = this.asyncLayoutMap;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.asyncDiff;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        if (!this.enablePreload) {
            i = 0;
        }
        int LJ = C79062V1e.LJ(this.fpsName, (((i2 + i) * 31) + this.preloadCount) * 31, 31);
        Map<String, Boolean> map = this.asyncLayoutMap;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendAbility(asyncDiff=");
        LIZ.append(this.asyncDiff);
        LIZ.append(", enablePreload=");
        LIZ.append(this.enablePreload);
        LIZ.append(", preloadCount=");
        LIZ.append(this.preloadCount);
        LIZ.append(", fpsName=");
        LIZ.append(this.fpsName);
        LIZ.append(", asyncLayoutMap=");
        return C15890jp.LIZ(LIZ, this.asyncLayoutMap, ')', LIZ);
    }

    public RecommendAbility(boolean z, boolean z2, int i, String fpsName, Map<String, Boolean> map) {
        o.LJIIIZ(fpsName, "fpsName");
        this.asyncDiff = z;
        this.enablePreload = z2;
        this.preloadCount = i;
        this.fpsName = fpsName;
        this.asyncLayoutMap = map;
    }
}
