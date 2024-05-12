package com.ss.android.ugc.gamora.recorder.navi.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviFeatureInfo implements Serializable {

    @InterfaceC65349Pkn("color_picker")
    public ProfileNaviFeatureInfoValue colorPicker;

    @InterfaceC65349Pkn("effect_id")
    public String effectId;

    @InterfaceC65349Pkn("flip")
    public ProfileNaviFeatureInfoValue flip;

    @InterfaceC65349Pkn("inspiration_key")
    public String inspirationKey;

    @InterfaceC65349Pkn("sliders")
    public List<ProfileNaviFeatureInfoValue> sliders;

    @InterfaceC65349Pkn("sticker_id")
    public String stickerId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviFeatureInfo copy$default(ProfileNaviFeatureInfo profileNaviFeatureInfo, String str, String str2, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileNaviFeatureInfo.stickerId;
        }
        if ((i & 2) != 0) {
            str2 = profileNaviFeatureInfo.effectId;
        }
        if ((i & 4) != 0) {
            profileNaviFeatureInfoValue = profileNaviFeatureInfo.colorPicker;
        }
        if ((i & 8) != 0) {
            profileNaviFeatureInfoValue2 = profileNaviFeatureInfo.flip;
        }
        if ((i & 16) != 0) {
            list = profileNaviFeatureInfo.sliders;
        }
        if ((i & 32) != 0) {
            str3 = profileNaviFeatureInfo.inspirationKey;
        }
        return profileNaviFeatureInfo.copy(str, str2, profileNaviFeatureInfoValue, profileNaviFeatureInfoValue2, list, str3);
    }

    public final ProfileNaviFeatureInfo copy(String str, String str2, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2, List<ProfileNaviFeatureInfoValue> list, String str3) {
        return new ProfileNaviFeatureInfo(str, str2, profileNaviFeatureInfoValue, profileNaviFeatureInfoValue2, list, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviFeatureInfo)) {
            return false;
        }
        ProfileNaviFeatureInfo profileNaviFeatureInfo = (ProfileNaviFeatureInfo) obj;
        return o.LJ(this.stickerId, profileNaviFeatureInfo.stickerId) && o.LJ(this.effectId, profileNaviFeatureInfo.effectId) && o.LJ(this.colorPicker, profileNaviFeatureInfo.colorPicker) && o.LJ(this.flip, profileNaviFeatureInfo.flip) && o.LJ(this.sliders, profileNaviFeatureInfo.sliders) && o.LJ(this.inspirationKey, profileNaviFeatureInfo.inspirationKey);
    }

    public int hashCode() {
        String str = this.stickerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue = this.colorPicker;
        int hashCode3 = (hashCode2 + (profileNaviFeatureInfoValue == null ? 0 : profileNaviFeatureInfoValue.hashCode())) * 31;
        ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2 = this.flip;
        int hashCode4 = (hashCode3 + (profileNaviFeatureInfoValue2 == null ? 0 : profileNaviFeatureInfoValue2.hashCode())) * 31;
        List<ProfileNaviFeatureInfoValue> list = this.sliders;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.inspirationKey;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviFeatureInfo(stickerId=");
        LIZ.append(this.stickerId);
        LIZ.append(", effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", colorPicker=");
        LIZ.append(this.colorPicker);
        LIZ.append(", flip=");
        LIZ.append(this.flip);
        LIZ.append(", sliders=");
        LIZ.append(this.sliders);
        LIZ.append(", inspirationKey=");
        return q.LIZIZ(LIZ, this.inspirationKey, ')', LIZ);
    }

    public final ProfileNaviFeatureInfoValue getColorPicker() {
        return this.colorPicker;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final ProfileNaviFeatureInfoValue getFlip() {
        return this.flip;
    }

    public final String getInspirationKey() {
        return this.inspirationKey;
    }

    public final List<ProfileNaviFeatureInfoValue> getSliders() {
        return this.sliders;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final void setColorPicker(ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue) {
        this.colorPicker = profileNaviFeatureInfoValue;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setFlip(ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue) {
        this.flip = profileNaviFeatureInfoValue;
    }

    public final void setInspirationKey(String str) {
        this.inspirationKey = str;
    }

    public final void setSliders(List<ProfileNaviFeatureInfoValue> list) {
        this.sliders = list;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public ProfileNaviFeatureInfo(String str, String str2, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue, ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2, List<ProfileNaviFeatureInfoValue> list, String str3) {
        this.stickerId = str;
        this.effectId = str2;
        this.colorPicker = profileNaviFeatureInfoValue;
        this.flip = profileNaviFeatureInfoValue2;
        this.sliders = list;
        this.inspirationKey = str3;
    }
}
