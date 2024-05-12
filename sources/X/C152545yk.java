package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.5yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152545yk {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        boolean hasAudioInAdvanceEdit;
        if (videoPublishEditModel == null || !C19N.LJ("upload_origin_audio_track", false)) {
            return false;
        }
        if (videoPublishEditModel.isLibraryMaterialOnly() && !videoPublishEditModel.hadRecordWithVolume() && !videoPublishEditModel.hasGalleryVideo() && (!videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() || videoPublishEditModel.getEditorProModel().getPipResourcePaths().isEmpty())) {
            return false;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            return videoPublishEditModel.hadRecordWithVolume();
        }
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            if (!videoPublishEditModel.isCurrentAutoCutMode()) {
                return false;
            }
            if (videoPublishEditModel.hadRecordWithVolume()) {
                return true;
            }
            return C45087Hml.LIZ(videoPublishEditModel);
        }
        if ((videoPublishEditModel.isMusic() > 0 || (!videoPublishEditModel.creativeModel.soundEffectInfoModel.soundEffectList.isEmpty())) && videoPublishEditModel.musicVolume > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        int i = videoPublishEditModel.mOrigin;
        if (i == 0 || i == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft()) {
            try {
                C5K0.LIZ(2);
                videoPublishEditModel.getEditorProModel().setHasAudioInAdvanceEdit(C60903NvH.LJIIJJI().LJJIIZ().LIZ(videoPublishEditModel.nleData));
            } catch (Throwable th) {
                H7B.LIZLLL(th);
            }
            hasAudioInAdvanceEdit = videoPublishEditModel.getEditorProModel().getHasAudioInAdvanceEdit();
        } else if (videoPublishEditModel.voiceVolume > 0.0f) {
            hasAudioInAdvanceEdit = true;
        } else {
            hasAudioInAdvanceEdit = false;
        }
        if (z2 && z && (hasAudioInAdvanceEdit || videoPublishEditModel.hadRecordWithVolume())) {
            return true;
        }
        if ((videoPublishEditModel.hasOriginalSoundWithoutLibraryPhoto() || videoPublishEditModel.isFastImport || videoPublishEditModel.hadRecordWithVolume()) && z && (hasAudioInAdvanceEdit || videoPublishEditModel.hadRecordWithVolume())) {
            return true;
        }
        if (videoPublishEditModel.veAudioEffectParam == null || (!hasAudioInAdvanceEdit && !videoPublishEditModel.hadRecordWithVolume())) {
            return false;
        }
        return true;
    }
}
