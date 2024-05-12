package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.HHj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43811HHj {
    public static final HGS LIZ(VideoPublishEditModel videoPublishEditModel) {
        C43813HHl c43813HHl = new C43813HHl();
        if (videoPublishEditModel.hasOriginalSound()) {
            c43813HHl.LIZ(EnumC43812HHk.RECORD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.hasRecord()) {
            c43813HHl.LIZ(EnumC43812HHk.EDIT_RECORD_SOUND);
        }
        String mMusicPath = videoPublishEditModel.getMMusicPath();
        if (mMusicPath != null && mMusicPath.length() != 0) {
            c43813HHl.LIZ(EnumC43812HHk.MUSIC);
        }
        if (videoPublishEditModel.mOrigin == 0) {
            c43813HHl.LIZ(EnumC43812HHk.UPLOAD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.mOrigin == 2) {
            c43813HHl.LIZ(EnumC43812HHk.RECORD_UPLOAD_VIDEO_SOUND);
        }
        if (videoPublishEditModel.voiceVolume > 0.0f) {
            c43813HHl.LIZ(EnumC43812HHk.VOLUME_NOT_MUTE);
        }
        if (videoPublishEditModel.veAudioEffectParam != null) {
            c43813HHl.LIZ(EnumC43812HHk.EDIT_AUDIO_EFFECT);
        }
        return new HGS(c43813HHl.LIZ);
    }
}
