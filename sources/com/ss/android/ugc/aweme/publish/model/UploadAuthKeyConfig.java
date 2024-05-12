package com.ss.android.ugc.aweme.publish.model;

import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes8.dex */
public class UploadAuthKeyConfig extends VideoCreation {

    @InterfaceC65349Pkn("aigc_avatar_auth_config")
    public AIGCAvatarAuthConfig aigcAvatarAuthConfig;

    @InterfaceC65349Pkn("cloud_edit_upload_auth_config")
    public CloudEditUploadAuthConfig cloudEditUploadAuthConfig;

    @InterfaceC65349Pkn("current_region")
    public String currentRegion = "";

    @InterfaceC65349Pkn("custom_sticker_config")
    public UploadImageConfig customStickerConfig;

    @InterfaceC65349Pkn("custom_sticker_image_config")
    public UploadImageConfig customStickerImageConfig;

    @InterfaceC65349Pkn("vframe_config")
    public UploadImageConfig frameUploadConfig;

    @InterfaceC65349Pkn("img_config")
    public UploadImageConfig imgConfig;

    @InterfaceC65349Pkn("raw_photo_upload_config")
    public UploadImageConfig photoModeRawUploadConfig;

    @InterfaceC65349Pkn("photo_upload_config")
    public UploadImageConfig photoModeUploadConfig;

    @InterfaceC65349Pkn("save_time")
    public long saveTime;

    @InterfaceC65349Pkn("audio_config")
    public UploadAudioConfig uploadAudioConfig;

    @InterfaceC65349Pkn("music_strip_audio_config")
    public UploadMusicStripAudioConfig uploadMusicStripAudioConfig;

    @InterfaceC65349Pkn("settings_config")
    public UploadSettingConfig uploadSettingConfig;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("video_config")
    public UploadVideoConfig videoConfig;

    @Override // com.ss.android.ugc.aweme.publish.model.VideoCreation, com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadAuthKeyConfig{videoConfig=");
        LIZ.append(this.videoConfig);
        LIZ.append(", uploadSettingConfig=");
        LIZ.append(this.uploadSettingConfig);
        LIZ.append(", imgConfig=");
        LIZ.append(this.imgConfig);
        LIZ.append(", frameUploadConfig=");
        LIZ.append(this.frameUploadConfig);
        LIZ.append(", uploadAudioConfig=");
        LIZ.append(this.uploadAudioConfig);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
