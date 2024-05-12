package com.bytedance.effectcreatormobile.ckeapi.api.objectselect;

import X.C93489aRh;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabData implements Parcelable {
    public static final Parcelable.Creator<PrefabData> CREATOR = new C93489aRh();
    public final String capabilites;
    public final String category;
    public final String effectFilePath;
    public final String effectId;
    public final String featureType;
    public final String lokiPanelKey;
    public final String typeName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.lokiPanelKey);
        parcel.writeString(this.category);
        parcel.writeString(this.typeName);
        parcel.writeString(this.effectFilePath);
        parcel.writeString(this.effectId);
        parcel.writeString(this.featureType);
        parcel.writeString(this.capabilites);
    }

    public PrefabData(String lokiPanelKey, String category, String typeName, String effectFilePath, String effectId, String featureType, String capabilites) {
        o.LJIIIZ(lokiPanelKey, "lokiPanelKey");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(typeName, "typeName");
        o.LJIIIZ(effectFilePath, "effectFilePath");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(featureType, "featureType");
        o.LJIIIZ(capabilites, "capabilites");
        this.lokiPanelKey = lokiPanelKey;
        this.category = category;
        this.typeName = typeName;
        this.effectFilePath = effectFilePath;
        this.effectId = effectId;
        this.featureType = featureType;
        this.capabilites = capabilites;
    }
}
