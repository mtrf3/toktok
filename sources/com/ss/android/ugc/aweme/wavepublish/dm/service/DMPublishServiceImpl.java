package com.ss.android.ugc.aweme.wavepublish.dm.service;

import X.C47261Igj;
import X.C4HH;
import X.C60903NvH;
import X.C6NR;
import X.C77339UWx;
import X.GUH;
import X.GUX;
import X.H84;
import X.H8J;
import X.ORZ;
import X.OSZ;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import com.ss.android.ugc.aweme.services.dm.ICreativePathServiceProxy;
import com.ss.android.ugc.aweme.services.dm.IDMPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMPublishServiceImpl implements IDMPublishService {
    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final ICreativePathServiceProxy creativePathServiceProxy() {
        return new H84();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final File getCreativeToolsRootDir() {
        return H8J.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getCurrentUid() {
        return C77339UWx.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getEnterDM(BaseShortVideoContext editModel) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        DMCameraModel dMCameraModel;
        o.LJIIIZ(editModel, "editModel");
        if (!(editModel instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) editModel) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (creativeInitialModel = creativeModel.initialModel) == null || (dMCameraModel = creativeInitialModel.dmCameraModel) == null) {
            return null;
        }
        return dMCameraModel.enterDM;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final Integer getMediaType(BaseShortVideoContext editModel) {
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        DMMediaModel dMMediaModel;
        o.LJIIIZ(editModel, "editModel");
        if (!(editModel instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) editModel) == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (dMMediaModel = creativeModel.dmMediaModel) == null) {
            return null;
        }
        return Integer.valueOf(dMMediaModel.type);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String getVideoPath(BaseShortVideoContext editModel) {
        VideoPublishEditModel videoPublishEditModel;
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        o.LJIIIZ(editModel, "editModel");
        if (!(editModel instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) editModel) == null || (previewInfo = videoPublishEditModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) ORZ.LJLLLL(videoList)) == null) {
            return null;
        }
        return editVideoSegment.getVideoPath();
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final String publishDMMedia(PublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        String LIZLLL = GUH.LIZLLL(publishModel, false);
        GUH.LJJIFFI();
        return LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void addPublishCallback(String publishId, GUX publishCallback) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishCallback, "publishCallback");
        GUH.LIZ(publishId, publishCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final void removePublishCallback(String publishId, GUX publishCallback) {
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(publishCallback, "publishCallback");
        GUH.LJIL(publishId, publishCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final OSZ<Boolean, BaseShortVideoContext> createPhotoPublishEditModel(String key, String str, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        String path = str;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(path, "path");
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creativeInfo = new CreativeInfo(key, 0, null, 6, null);
        videoPublishEditModel.mOrigin = 0;
        videoPublishEditModel.mShootWay = "chat_shoot";
        int i3 = -1;
        CreativeModel creativeModel = new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i3, i3, 31, 0 == true ? 1 : 0);
        if (i == C4HH.VIDEO_STICKER.getScene()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        creativeModel.dmMediaModel = new DMMediaModel(i2, path, null, z3, 4, null);
        videoPublishEditModel.creativeModel = creativeModel;
        videoPublishEditModel.setPreviewInfo(new EditPreviewInfo(new ArrayList(), 0, 0, 0L, 0L, "", 30, null));
        if (!z) {
            path = new DMPath(videoPublishEditModel.creativeInfo.getCreationId()).getImageSynthesiseOutputPath();
        }
        videoPublishEditModel.mOutputFile = path;
        videoPublishEditModel.uploadScene = i;
        videoPublishEditModel.encryptType = z2 ? 1 : 0;
        return new OSZ<>(Boolean.TRUE, videoPublishEditModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.dm.IDMPublishService
    public final OSZ<Boolean, BaseShortVideoContext> createVideoPublishEditModel(String key, String str, int i, int i2, long j, int i3, int i4, int i5, int i6, boolean z) {
        String videoPath = str;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(videoPath, "videoPath");
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.creativeInfo = new CreativeInfo(key, 0, null, 6, null);
        videoPublishEditModel.mOrigin = 0;
        videoPublishEditModel.mShootWay = "chat_shoot";
        videoPublishEditModel.isFastImport = true;
        videoPublishEditModel.mFromCut = true;
        videoPublishEditModel.voiceVolume = 1.0f;
        videoPublishEditModel.multiEditVideoRecordData = new MultiEditVideoStatusRecordData();
        videoPublishEditModel.setPreviewInfo(new C6NR(C60903NvH.LJIIJJI().LJJIJLIJ().getVideoWidth(), C60903NvH.LJIIJJI().LJJIJLIJ().getVideoHeight(), 28).LIZ(C47261Igj.LJJIJ(new EditVideoSegment(videoPath, null, new VideoFileInfo(i, i2, j, i3, i4, i5, i6, 0, 0.0f, 384, null)))));
        int i7 = -1;
        CreativeModel creativeModel = new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i7, i7, 31, 0 == true ? 1 : 0);
        creativeModel.dmMediaModel = new DMMediaModel(1, null, null, z, 6, null);
        videoPublishEditModel.creativeModel = creativeModel;
        DMPath dMPath = new DMPath(videoPublishEditModel.creativeInfo.getCreationId());
        if (!z) {
            videoPath = dMPath.getVideoSynthesiseOutputPath();
        }
        videoPublishEditModel.mOutputFile = videoPath;
        videoPublishEditModel.mParallelUploadOutputFile = dMPath.getParallelUploadOutputPath();
        return new OSZ<>(Boolean.TRUE, videoPublishEditModel);
    }
}
