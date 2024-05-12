package com.ss.android.ugc.aweme.commerce;

import X.C42482Glq;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InteractiveBrandedEffectInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<InteractiveBrandedEffectInfo> CREATOR = new C42482Glq();

    @InterfaceC65349Pkn("brand_extra")
    public String brandExtra;

    @InterfaceC65349Pkn("enable_shake")
    public boolean enableShake;

    @InterfaceC65349Pkn("enable_tap")
    public boolean enableTap;

    @InterfaceC65349Pkn("ibe_type")
    public int ibeType;

    @InterfaceC65349Pkn("sticker_id")
    public String legacyStickerId;

    @InterfaceC65349Pkn("lynx_schema")
    public String lynxSchema;

    @InterfaceC65349Pkn("prop_data")
    public String propData;

    @InterfaceC65349Pkn("prop_id")
    public String stickerId;

    @InterfaceC65349Pkn("video_interval")
    public VideoInterval videoInterval = new VideoInterval();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final String getStickerId() {
        String str = this.stickerId;
        if (str == null) {
            return this.legacyStickerId;
        }
        return str;
    }

    public final String getBrandExtra() {
        return this.brandExtra;
    }

    public final boolean getEnableShake() {
        return this.enableShake;
    }

    public final boolean getEnableTap() {
        return this.enableTap;
    }

    public final int getIbeType() {
        return this.ibeType;
    }

    public final String getLegacyStickerId() {
        return this.legacyStickerId;
    }

    public final String getLynxSchema() {
        return this.lynxSchema;
    }

    public final String getPropData() {
        return this.propData;
    }

    public final VideoInterval getVideoInterval() {
        return this.videoInterval;
    }

    public final void setBrandExtra(String str) {
        this.brandExtra = str;
    }

    public final void setEnableShake(boolean z) {
        this.enableShake = z;
    }

    public final void setEnableTap(boolean z) {
        this.enableTap = z;
    }

    public final void setIbeType(int i) {
        this.ibeType = i;
    }

    public final void setLegacyStickerId(String str) {
        this.legacyStickerId = str;
    }

    public final void setLynxSchema(String str) {
        this.lynxSchema = str;
    }

    public final void setPropData(String str) {
        this.propData = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setVideoInterval(VideoInterval videoInterval) {
        o.LJIIIZ(videoInterval, "<set-?>");
        this.videoInterval = videoInterval;
    }
}
