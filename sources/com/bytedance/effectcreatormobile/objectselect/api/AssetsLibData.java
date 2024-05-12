package com.bytedance.effectcreatormobile.objectselect.api;

import X.C93504aRw;
import X.F9E;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class AssetsLibData extends F9E {
    public final LinkedHashMap<String, List<AssetsItemData>> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public AssetsLibData(LinkedHashMap<String, List<AssetsItemData>> linkedHashMap) {
        this.LJLIL = linkedHashMap;
    }

    /* loaded from: classes34.dex */
    public static final class AssetsItemData implements Parcelable {
        public static final Parcelable.Creator<AssetsItemData> CREATOR = new C93504aRw();
        public final String capabilities;
        public final String category;
        public final String effectId;
        public final String extra;
        public final String iconUrl;
        public final String name;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetsItemData)) {
                return false;
            }
            AssetsItemData assetsItemData = (AssetsItemData) obj;
            return o.LJ(this.effectId, assetsItemData.effectId) && o.LJ(this.category, assetsItemData.category) && o.LJ(this.iconUrl, assetsItemData.iconUrl) && o.LJ(this.name, assetsItemData.name) && o.LJ(this.extra, assetsItemData.extra) && o.LJ(this.capabilities, assetsItemData.capabilities);
        }

        public final int hashCode() {
            String str = this.effectId;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.category;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.iconUrl;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.name;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.extra;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.capabilities;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AssetsItemData(effectId=");
            LIZ.append(this.effectId);
            LIZ.append(", category=");
            LIZ.append(this.category);
            LIZ.append(", iconUrl=");
            LIZ.append(this.iconUrl);
            LIZ.append(", name=");
            LIZ.append(this.name);
            LIZ.append(", extra=");
            LIZ.append(this.extra);
            LIZ.append(", capabilities=");
            LIZ.append(this.capabilities);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            o.LJIIIZ(parcel, "parcel");
            parcel.writeString(this.effectId);
            parcel.writeString(this.category);
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.name);
            parcel.writeString(this.extra);
            parcel.writeString(this.capabilities);
        }

        public AssetsItemData(String effectId, String category, String iconUrl, String name, String extra, String capabilities) {
            o.LJIIIZ(effectId, "effectId");
            o.LJIIIZ(category, "category");
            o.LJIIIZ(iconUrl, "iconUrl");
            o.LJIIIZ(name, "name");
            o.LJIIIZ(extra, "extra");
            o.LJIIIZ(capabilities, "capabilities");
            this.effectId = effectId;
            this.category = category;
            this.iconUrl = iconUrl;
            this.name = name;
            this.extra = extra;
            this.capabilities = capabilities;
        }
    }
}
