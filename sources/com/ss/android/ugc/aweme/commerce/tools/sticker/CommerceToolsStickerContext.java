package com.ss.android.ugc.aweme.commerce.tools.sticker;

import X.C42476Glk;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommerceToolsStickerContext implements Serializable, Parcelable {
    public static final Parcelable.Creator<CommerceToolsStickerContext> CREATOR = new C42476Glk();

    @InterfaceC65349Pkn("from_prop_id")
    public String fromPropId;

    @InterfaceC65349Pkn("has_commerce_sticker_metadata")
    public boolean hasCommerceStickerMetaData;

    @InterfaceC65349Pkn("has_ibe_metadata")
    public boolean hasIBEMetaData;

    @InterfaceC65349Pkn("preset_effect_id")
    public String presetEffectId;

    @InterfaceC65349Pkn("prop_id")
    public String propId;

    @InterfaceC65349Pkn("start_use_time")
    public Long startUseTime;

    @InterfaceC65349Pkn("started_use_effect")
    public boolean startedUsingEffect;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final String getFromPropId() {
        return this.fromPropId;
    }

    public final boolean getHasCommerceStickerMetaData() {
        return this.hasCommerceStickerMetaData;
    }

    public final boolean getHasIBEMetaData() {
        return this.hasIBEMetaData;
    }

    public final String getPresetEffectId() {
        return this.presetEffectId;
    }

    public final String getPropId() {
        return this.propId;
    }

    public final Long getStartUseTime() {
        return this.startUseTime;
    }

    public final boolean getStartedUsingEffect() {
        return this.startedUsingEffect;
    }

    public final void setFromPropId(String str) {
        this.fromPropId = str;
    }

    public final void setHasCommerceStickerMetaData(boolean z) {
        this.hasCommerceStickerMetaData = z;
    }

    public final void setHasIBEMetaData(boolean z) {
        this.hasIBEMetaData = z;
    }

    public final void setPresetEffectId(String str) {
        this.presetEffectId = str;
    }

    public final void setPropId(String str) {
        this.propId = str;
    }

    public final void setStartUseTime(Long l) {
        this.startUseTime = l;
    }

    public final void setStartedUsingEffect(boolean z) {
        this.startedUsingEffect = z;
    }
}
