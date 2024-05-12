package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UpdateMobileEffectRequest {

    @InterfaceC65349Pkn("custom_app_effect_id")
    public final String customAppEffectId;

    @InterfaceC65349Pkn("effect_source")
    public final Integer effectSource;

    @InterfaceC65349Pkn("icon_file_key")
    public final String iconFileKey;

    @InterfaceC65349Pkn("name")
    public final String name;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMobileEffectRequest)) {
            return false;
        }
        UpdateMobileEffectRequest updateMobileEffectRequest = (UpdateMobileEffectRequest) obj;
        return o.LJ(this.customAppEffectId, updateMobileEffectRequest.customAppEffectId) && o.LJ(this.name, updateMobileEffectRequest.name) && o.LJ(this.iconFileKey, updateMobileEffectRequest.iconFileKey) && o.LJ(this.effectSource, updateMobileEffectRequest.effectSource);
    }

    public final int hashCode() {
        int hashCode = this.customAppEffectId.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconFileKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.effectSource;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateMobileEffectRequest(customAppEffectId=");
        LIZ.append(this.customAppEffectId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", iconFileKey=");
        LIZ.append(this.iconFileKey);
        LIZ.append(", effectSource=");
        return s0.LIZJ(LIZ, this.effectSource, ')', LIZ);
    }

    public UpdateMobileEffectRequest(String customAppEffectId, String str, String str2, Integer num) {
        o.LJIIIZ(customAppEffectId, "customAppEffectId");
        this.customAppEffectId = customAppEffectId;
        this.name = str;
        this.iconFileKey = str2;
        this.effectSource = num;
    }
}
