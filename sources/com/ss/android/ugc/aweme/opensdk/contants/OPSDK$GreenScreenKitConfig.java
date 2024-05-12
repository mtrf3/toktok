package com.ss.android.ugc.aweme.opensdk.contants;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Bundle;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class OPSDK$GreenScreenKitConfig implements Serializable {

    @InterfaceC65349Pkn("green_screen_kit_audio_path")
    public String audioPath;

    @InterfaceC65349Pkn("green_screen_kit_effect_id")
    public String effectId;

    @InterfaceC65349Pkn("green_screen_kit_image_path")
    public String imagePath;

    @InterfaceC65349Pkn("share_from_green_screen_kit")
    public boolean shareFromGSK;

    @InterfaceC65349Pkn("green_screen_kit_video_path")
    public String videoPath;

    /* JADX WARN: Multi-variable type inference failed */
    public OPSDK$GreenScreenKitConfig() {
        this(false, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OPSDK$GreenScreenKitConfig(boolean z) {
        this(z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OPSDK$GreenScreenKitConfig(boolean z, String str) {
        this(z, str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 28, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2) {
        this(z, str, str2, null, 0 == true ? 1 : 0, 24, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2, String str3) {
        this(z, str, str2, str3, null, 16, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OPSDK$GreenScreenKitConfig copy$default(OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig, boolean z, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = oPSDK$GreenScreenKitConfig.shareFromGSK;
        }
        if ((i & 2) != 0) {
            str = oPSDK$GreenScreenKitConfig.effectId;
        }
        if ((i & 4) != 0) {
            str2 = oPSDK$GreenScreenKitConfig.videoPath;
        }
        if ((i & 8) != 0) {
            str3 = oPSDK$GreenScreenKitConfig.audioPath;
        }
        if ((i & 16) != 0) {
            str4 = oPSDK$GreenScreenKitConfig.imagePath;
        }
        return oPSDK$GreenScreenKitConfig.copy(z, str, str2, str3, str4);
    }

    public final OPSDK$GreenScreenKitConfig copy(boolean z, String str, String str2, String str3, String str4) {
        return new OPSDK$GreenScreenKitConfig(z, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OPSDK$GreenScreenKitConfig)) {
            return false;
        }
        OPSDK$GreenScreenKitConfig oPSDK$GreenScreenKitConfig = (OPSDK$GreenScreenKitConfig) obj;
        return this.shareFromGSK == oPSDK$GreenScreenKitConfig.shareFromGSK && o.LJ(this.effectId, oPSDK$GreenScreenKitConfig.effectId) && o.LJ(this.videoPath, oPSDK$GreenScreenKitConfig.videoPath) && o.LJ(this.audioPath, oPSDK$GreenScreenKitConfig.audioPath) && o.LJ(this.imagePath, oPSDK$GreenScreenKitConfig.imagePath);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public int hashCode() {
        boolean z = this.shareFromGSK;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.effectId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.videoPath;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.audioPath;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imagePath;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("share_from_green_screen_kit", this.shareFromGSK);
        bundle.putString("green_screen_kit_effect_id", this.effectId);
        bundle.putString("green_screen_kit_video_path", this.videoPath);
        bundle.putString("green_screen_kit_image_path", this.imagePath);
        bundle.putString("green_screen_kit_audio_path", this.audioPath);
        return bundle;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GreenScreenKitConfig(shareFromGSK=");
        LIZ.append(this.shareFromGSK);
        LIZ.append(", effectId=");
        LIZ.append(this.effectId);
        LIZ.append(", videoPath=");
        LIZ.append(this.videoPath);
        LIZ.append(", audioPath=");
        LIZ.append(this.audioPath);
        LIZ.append(", imagePath=");
        return q.LIZIZ(LIZ, this.imagePath, ')', LIZ);
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final boolean getShareFromGSK() {
        return this.shareFromGSK;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setAudioPath(String str) {
        this.audioPath = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setImagePath(String str) {
        this.imagePath = str;
    }

    public final void setShareFromGSK(boolean z) {
        this.shareFromGSK = z;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public OPSDK$GreenScreenKitConfig(boolean z, String str, String str2, String str3, String str4) {
        this.shareFromGSK = z;
        this.effectId = str;
        this.videoPath = str2;
        this.audioPath = str3;
        this.imagePath = str4;
    }

    public /* synthetic */ OPSDK$GreenScreenKitConfig(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? str4 : null);
    }
}
