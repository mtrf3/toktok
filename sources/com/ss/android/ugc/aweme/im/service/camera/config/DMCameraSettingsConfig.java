package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMCameraSettingsConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("album_select_config")
    public final DMAlbumSelectConfig albumConfig;

    @InterfaceC65349Pkn("image_bg_upload_config")
    public final DMBDImageUploadConfig imageBDConfig;

    @InterfaceC65349Pkn("video_bg_upload_config")
    public final DMBDVideoUploadConfig videoBDConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public DMCameraSettingsConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DMCameraSettingsConfig copy$default(DMCameraSettingsConfig dMCameraSettingsConfig, DMBDImageUploadConfig dMBDImageUploadConfig, DMBDVideoUploadConfig dMBDVideoUploadConfig, DMAlbumSelectConfig dMAlbumSelectConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            dMBDImageUploadConfig = dMCameraSettingsConfig.imageBDConfig;
        }
        if ((i & 2) != 0) {
            dMBDVideoUploadConfig = dMCameraSettingsConfig.videoBDConfig;
        }
        if ((i & 4) != 0) {
            dMAlbumSelectConfig = dMCameraSettingsConfig.albumConfig;
        }
        return dMCameraSettingsConfig.copy(dMBDImageUploadConfig, dMBDVideoUploadConfig, dMAlbumSelectConfig);
    }

    public final DMCameraSettingsConfig copy(DMBDImageUploadConfig imageBDConfig, DMBDVideoUploadConfig videoBDConfig, DMAlbumSelectConfig albumConfig) {
        o.LJIIIZ(imageBDConfig, "imageBDConfig");
        o.LJIIIZ(videoBDConfig, "videoBDConfig");
        o.LJIIIZ(albumConfig, "albumConfig");
        return new DMCameraSettingsConfig(imageBDConfig, videoBDConfig, albumConfig);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imageBDConfig, this.videoBDConfig, this.albumConfig};
    }

    public final DMAlbumSelectConfig getAlbumConfig() {
        return this.albumConfig;
    }

    public final DMBDImageUploadConfig getImageBDConfig() {
        return this.imageBDConfig;
    }

    public final DMBDVideoUploadConfig getVideoBDConfig() {
        return this.videoBDConfig;
    }

    public DMCameraSettingsConfig(DMBDImageUploadConfig imageBDConfig, DMBDVideoUploadConfig videoBDConfig, DMAlbumSelectConfig albumConfig) {
        o.LJIIIZ(imageBDConfig, "imageBDConfig");
        o.LJIIIZ(videoBDConfig, "videoBDConfig");
        o.LJIIIZ(albumConfig, "albumConfig");
        this.imageBDConfig = imageBDConfig;
        this.videoBDConfig = videoBDConfig;
        this.albumConfig = albumConfig;
    }

    public /* synthetic */ DMCameraSettingsConfig(DMBDImageUploadConfig dMBDImageUploadConfig, DMBDVideoUploadConfig dMBDVideoUploadConfig, DMAlbumSelectConfig dMAlbumSelectConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DMBDImageUploadConfig(0, 0, 0, 0, 0, 0, 0, 127, null) : dMBDImageUploadConfig, (i & 2) != 0 ? new DMBDVideoUploadConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 8191, null) : dMBDVideoUploadConfig, (i & 4) != 0 ? new DMAlbumSelectConfig(0, 0, 0, 7, null) : dMAlbumSelectConfig);
    }
}
