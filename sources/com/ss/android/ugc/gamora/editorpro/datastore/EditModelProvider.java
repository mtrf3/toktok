package com.ss.android.ugc.gamora.editorpro.datastore;

import X.AnonymousClass585;
import X.C125154vf;
import X.C126784yI;
import X.C127384zG;
import X.C1289554h;
import X.C1297157f;
import X.C136935Yz;
import X.C141205gS;
import X.C5DC;
import X.C77413UZt;
import X.C78857UxB;
import X.InterfaceC126184xK;
import X.InterfaceC1279450k;
import X.InterfaceC132055Gf;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditModelProvider extends ViewModel {
    public static final C126784yI Companion = new C126784yI();
    public String _editorProAnchorType;
    public C5DC _editorProGuidanceController;
    public InterfaceC132055Gf _musicController;
    public InterfaceC1279450k _soundEffectController;
    public C127384zG bgmSoundTrimModel;
    public C1289554h bottomBarGuideController;
    public AnonymousClass585 magicItemController;
    public InterfaceC126184xK magicProcessorManager;
    public C1297157f transitionGuideController;
    public C125154vf videoEffectController;
    public C136935Yz editorProFileCenter = new C136935Yz();
    public C141205gS soundEffectDataManager = new C141205gS();
    public final MutableLiveData<VideoPublishEditModel> _editModelLiveData = new MutableLiveData<>();

    public final VideoPublishEditModel getEditModel() {
        return this._editModelLiveData.getValue();
    }

    public final boolean isFromEPAnchor() {
        return C78857UxB.LJJJIL(this._editorProAnchorType);
    }

    private final Integer getEditPageType() {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        EditPreviewInfo previewInfo2;
        List<EditVideoSegment> videoList2;
        EditPreviewInfo previewInfo3;
        List<EditVideoSegment> videoList3;
        EditPreviewInfo previewInfo4;
        List<EditVideoSegment> videoList4;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return null;
        }
        if (editModel.isRetakeVideo()) {
            return 1;
        }
        if (editModel.getOriginal() == 1 && (previewInfo4 = editModel.getPreviewInfo()) != null && (videoList4 = previewInfo4.getVideoList()) != null && videoList4.size() == 1) {
            return 0;
        }
        if (editModel.getOriginal() == 1 && (previewInfo3 = editModel.getPreviewInfo()) != null && (videoList3 = previewInfo3.getVideoList()) != null && videoList3.size() > 1) {
            return 1;
        }
        if (editModel.getOriginal() == 0 && (previewInfo2 = editModel.getPreviewInfo()) != null && (videoList2 = previewInfo2.getVideoList()) != null && videoList2.size() == 1) {
            return 2;
        }
        if (editModel.getOriginal() == 0 && (previewInfo = editModel.getPreviewInfo()) != null && (videoList = previewInfo.getVideoList()) != null && videoList.size() > 1) {
            return 3;
        }
        return 2;
    }

    private final List<MultiEditVideoSegmentRecordData> getSegmentDataList() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && (multiEditVideoStatusRecordData = editModel.multiEditVideoRecordData) != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            return multiEditVideoRecordData.segmentDataList;
        }
        return null;
    }

    public final ArrayList<String> getSelectedVideoPaths() {
        List<MultiEditVideoSegmentRecordData> segmentDataList = getSegmentDataList();
        if (segmentDataList == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (C77413UZt.LJIILL(segmentDataList)) {
            return arrayList;
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : segmentDataList) {
            if (multiEditVideoSegmentRecordData.enable) {
                arrayList.add(multiEditVideoSegmentRecordData.videoPath);
            }
        }
        return arrayList;
    }

    public final long getTotalDuration() {
        List<MultiEditVideoSegmentRecordData> segmentDataList = getSegmentDataList();
        if (segmentDataList == null) {
            segmentDataList = new ArrayList<>();
        }
        long j = 0;
        if (C77413UZt.LJIILL(segmentDataList)) {
            return 0L;
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : segmentDataList) {
            if (multiEditVideoSegmentRecordData.enable) {
                j += multiEditVideoSegmentRecordData.videoLength / 1000;
            }
        }
        return j;
    }

    public final boolean isMultiRecord() {
        boolean z;
        boolean z2;
        ArrayList<TimeSpeedModelExtension> arrayList;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return false;
        }
        if (editModel.mOrigin != 0) {
            z = true;
        } else {
            z = false;
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = editModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && (arrayList = multiEditVideoStatusRecordData.originalSegments) != null && arrayList.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public final boolean isMultiUpload() {
        Integer editPageType = getEditPageType();
        if (editPageType == null || editPageType.intValue() != 3) {
            return false;
        }
        return true;
    }

    public final C127384zG getBgmSoundTrimModel$tools_camera_edit_release() {
        return this.bgmSoundTrimModel;
    }

    public final C1289554h getBottomBarGuideController$tools_camera_edit_release() {
        return this.bottomBarGuideController;
    }

    public final C5DC getEditProGuidanceController() {
        return this._editorProGuidanceController;
    }

    public final C136935Yz getEditorProFileCenter() {
        return this.editorProFileCenter;
    }

    public final AnonymousClass585 getMagicItemController$tools_camera_edit_release() {
        return this.magicItemController;
    }

    public final InterfaceC126184xK getMagicProcessorManager$tools_camera_edit_release() {
        return this.magicProcessorManager;
    }

    public final InterfaceC132055Gf getMusicController() {
        return this._musicController;
    }

    public final InterfaceC1279450k getSoundEffectController() {
        return this._soundEffectController;
    }

    public final C141205gS getSoundEffectDataManager() {
        return this.soundEffectDataManager;
    }

    public final C1297157f getTransitionGuideController$tools_camera_edit_release() {
        return this.transitionGuideController;
    }

    public final C125154vf getVideoEffectController$tools_camera_edit_release() {
        return this.videoEffectController;
    }

    public final void setAnchorType(String str) {
        this._editorProAnchorType = str;
    }

    public final void setBgmSoundTrimModel$tools_camera_edit_release(C127384zG c127384zG) {
        this.bgmSoundTrimModel = c127384zG;
    }

    public final void setBottomBarGuideController$tools_camera_edit_release(C1289554h controller) {
        o.LJIIIZ(controller, "controller");
        this.bottomBarGuideController = controller;
    }

    public final void setEditModel(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        this._editModelLiveData.setValue(editModel);
    }

    public final void setEditProGuidanceController(C5DC controller) {
        o.LJIIIZ(controller, "controller");
        this._editorProGuidanceController = controller;
    }

    public final void setMagicItemController$tools_camera_edit_release(AnonymousClass585 controller) {
        o.LJIIIZ(controller, "controller");
        this.magicItemController = controller;
    }

    public final void setMagicProcessorManager$tools_camera_edit_release(InterfaceC126184xK manager) {
        o.LJIIIZ(manager, "manager");
        this.magicProcessorManager = manager;
    }

    public final void setMusicController(InterfaceC132055Gf interfaceC132055Gf) {
        this._musicController = interfaceC132055Gf;
    }

    public final void setSoundEffectController(InterfaceC1279450k interfaceC1279450k) {
        this._soundEffectController = interfaceC1279450k;
    }

    public final void setTransitionGuideController$tools_camera_edit_release(C1297157f controller) {
        o.LJIIIZ(controller, "controller");
        this.transitionGuideController = controller;
    }

    public final void setVideoEffectController$tools_camera_edit_release(C125154vf controller) {
        o.LJIIIZ(controller, "controller");
        this.videoEffectController = controller;
    }

    public final boolean updateNLEModel(String newNLEData) {
        o.LJIIIZ(newNLEData, "newNLEData");
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return false;
        }
        editModel.nleData = newNLEData;
        return true;
    }
}
