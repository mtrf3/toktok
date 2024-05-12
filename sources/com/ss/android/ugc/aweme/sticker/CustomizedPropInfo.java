package com.ss.android.ugc.aweme.sticker;

import X.C36461ESr;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CustomizedPropInfo implements Serializable, Parcelable {
    public static final C36461ESr CREATOR = new C36461ESr();
    public String businessExtra;
    public String customizedPropIconPath;
    public String customizedPropId;
    public String customizedPropPath;
    public String diyType;
    public String templatePropId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustomizedPropInfo() {
    }

    public final String getBusinessExtra() {
        return this.businessExtra;
    }

    public final String getCustomizedPropIconPath() {
        return this.customizedPropIconPath;
    }

    public final String getCustomizedPropId() {
        return this.customizedPropId;
    }

    public final String getCustomizedPropPath() {
        return this.customizedPropPath;
    }

    public final String getDiyType() {
        return this.diyType;
    }

    public final String getTemplatePropId() {
        return this.templatePropId;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizedPropInfo(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        this.templatePropId = parcel.readString();
        this.customizedPropId = parcel.readString();
        this.customizedPropIconPath = parcel.readString();
        this.customizedPropPath = parcel.readString();
        this.diyType = parcel.readString();
        this.businessExtra = parcel.readString();
    }

    public final Object getBusinessExtra(String key) {
        o.LJIIIZ(key, "key");
        String str = this.businessExtra;
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str).opt(key);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void setBusinessExtra(String str) {
        this.businessExtra = str;
    }

    public final void setCustomizedPropIconPath(String str) {
        this.customizedPropIconPath = str;
    }

    public final void setCustomizedPropId(String str) {
        this.customizedPropId = str;
    }

    public final void setCustomizedPropPath(String str) {
        this.customizedPropPath = str;
    }

    public final void setDiyType(String str) {
        this.diyType = str;
    }

    public final void setTemplatePropId(String str) {
        this.templatePropId = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.templatePropId);
        parcel.writeString(this.customizedPropId);
        parcel.writeString(this.customizedPropIconPath);
        parcel.writeString(this.customizedPropPath);
        parcel.writeString(this.diyType);
        parcel.writeString(this.businessExtra);
    }
}
