package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CreateMobileEffectRequest {

    @InterfaceC65349Pkn("custom_app_effect_id")
    public final String customAppEffectId;

    @InterfaceC65349Pkn("device_platform")
    public final String devicePlatform;

    @InterfaceC65349Pkn("effect_file_key")
    public final String effectFileKey;

    @InterfaceC65349Pkn("file_checksum")
    public final String fileChecksum;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("icon_file_key")
    public final String iconFileKey;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("opengl_es_version")
    public final String openglEsVersion;

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @InterfaceC65349Pkn("upload_type")
    public final String uploadType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateMobileEffectRequest)) {
            return false;
        }
        CreateMobileEffectRequest createMobileEffectRequest = (CreateMobileEffectRequest) obj;
        return o.LJ(this.customAppEffectId, createMobileEffectRequest.customAppEffectId) && o.LJ(this.name, createMobileEffectRequest.name) && o.LJ(this.iconFileKey, createMobileEffectRequest.iconFileKey) && o.LJ(this.effectFileKey, createMobileEffectRequest.effectFileKey) && o.LJ(this.templateId, createMobileEffectRequest.templateId) && o.LJ(this.fileChecksum, createMobileEffectRequest.fileChecksum) && o.LJ(this.uploadType, createMobileEffectRequest.uploadType) && o.LJ(this.openglEsVersion, createMobileEffectRequest.openglEsVersion) && o.LJ(this.devicePlatform, createMobileEffectRequest.devicePlatform) && o.LJ(this.hint, createMobileEffectRequest.hint);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.uploadType, C79062V1e.LJ(this.fileChecksum, C79062V1e.LJ(this.templateId, C79062V1e.LJ(this.effectFileKey, C79062V1e.LJ(this.iconFileKey, C79062V1e.LJ(this.name, this.customAppEffectId.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        String str = this.openglEsVersion;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.devicePlatform, (LJ + hashCode) * 31, 31);
        String str2 = this.hint;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return LJ2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateMobileEffectRequest(customAppEffectId=");
        LIZ.append(this.customAppEffectId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", iconFileKey=");
        LIZ.append(this.iconFileKey);
        LIZ.append(", effectFileKey=");
        LIZ.append(this.effectFileKey);
        LIZ.append(", templateId=");
        LIZ.append(this.templateId);
        LIZ.append(", fileChecksum=");
        LIZ.append(this.fileChecksum);
        LIZ.append(", uploadType=");
        LIZ.append(this.uploadType);
        LIZ.append(", openglEsVersion=");
        LIZ.append(this.openglEsVersion);
        LIZ.append(", devicePlatform=");
        LIZ.append(this.devicePlatform);
        LIZ.append(", hint=");
        return q.LIZIZ(LIZ, this.hint, ')', LIZ);
    }

    public CreateMobileEffectRequest(String customAppEffectId, String name, String iconFileKey, String effectFileKey, String templateId, String fileChecksum, String uploadType, String str, String devicePlatform, String str2) {
        o.LJIIIZ(customAppEffectId, "customAppEffectId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(iconFileKey, "iconFileKey");
        o.LJIIIZ(effectFileKey, "effectFileKey");
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(fileChecksum, "fileChecksum");
        o.LJIIIZ(uploadType, "uploadType");
        o.LJIIIZ(devicePlatform, "devicePlatform");
        this.customAppEffectId = customAppEffectId;
        this.name = name;
        this.iconFileKey = iconFileKey;
        this.effectFileKey = effectFileKey;
        this.templateId = templateId;
        this.fileChecksum = fileChecksum;
        this.uploadType = uploadType;
        this.openglEsVersion = str;
        this.devicePlatform = devicePlatform;
        this.hint = str2;
    }

    public /* synthetic */ CreateMobileEffectRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? "mobile_effect_template" : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? "android" : str9, (i & 512) == 0 ? str10 : null);
    }
}
