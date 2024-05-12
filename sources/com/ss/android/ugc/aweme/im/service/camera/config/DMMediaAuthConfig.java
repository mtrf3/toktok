package com.ss.android.ugc.aweme.im.service.camera.config;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMMediaAuthConfig extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("image_upload_config")
    public final DMImageUploadConfig imageUploadConfig;

    @InterfaceC65349Pkn("upload_scene")
    public final int uploadScene;

    @InterfaceC65349Pkn("video_upload_config")
    public final DMVideoUploadConfig videoUploadConfig;

    public static /* synthetic */ DMMediaAuthConfig copy$default(DMMediaAuthConfig dMMediaAuthConfig, int i, DMVideoUploadConfig dMVideoUploadConfig, DMImageUploadConfig dMImageUploadConfig, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dMMediaAuthConfig.uploadScene;
        }
        if ((i2 & 2) != 0) {
            dMVideoUploadConfig = dMMediaAuthConfig.videoUploadConfig;
        }
        if ((i2 & 4) != 0) {
            dMImageUploadConfig = dMMediaAuthConfig.imageUploadConfig;
        }
        return dMMediaAuthConfig.copy(i, dMVideoUploadConfig, dMImageUploadConfig);
    }

    public final DMMediaAuthConfig copy(int i, DMVideoUploadConfig dMVideoUploadConfig, DMImageUploadConfig dMImageUploadConfig) {
        return new DMMediaAuthConfig(i, dMVideoUploadConfig, dMImageUploadConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMMediaAuthConfig)) {
            return false;
        }
        DMMediaAuthConfig dMMediaAuthConfig = (DMMediaAuthConfig) obj;
        return this.uploadScene == dMMediaAuthConfig.uploadScene && o.LJ(this.videoUploadConfig, dMMediaAuthConfig.videoUploadConfig) && o.LJ(this.imageUploadConfig, dMMediaAuthConfig.imageUploadConfig);
    }

    public int hashCode() {
        int i = this.uploadScene * 31;
        DMVideoUploadConfig dMVideoUploadConfig = this.videoUploadConfig;
        int hashCode = (i + (dMVideoUploadConfig == null ? 0 : dMVideoUploadConfig.hashCode())) * 31;
        DMImageUploadConfig dMImageUploadConfig = this.imageUploadConfig;
        return hashCode + (dMImageUploadConfig != null ? dMImageUploadConfig.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DMMediaAuthConfig(uploadScene=");
        LIZ.append(this.uploadScene);
        LIZ.append(", videoUploadConfig=");
        LIZ.append(this.videoUploadConfig);
        LIZ.append(", imageUploadConfig=");
        LIZ.append(this.imageUploadConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final DMImageUploadConfig getImageUploadConfig() {
        return this.imageUploadConfig;
    }

    public final int getUploadScene() {
        return this.uploadScene;
    }

    public final DMVideoUploadConfig getVideoUploadConfig() {
        return this.videoUploadConfig;
    }

    public DMMediaAuthConfig(int i, DMVideoUploadConfig dMVideoUploadConfig, DMImageUploadConfig dMImageUploadConfig) {
        this.uploadScene = i;
        this.videoUploadConfig = dMVideoUploadConfig;
        this.imageUploadConfig = dMImageUploadConfig;
    }
}
