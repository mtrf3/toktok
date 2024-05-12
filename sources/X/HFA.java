package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HFA {
    public static int LIZ = -1;

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0182, code lost:
    
        if (r8.getVideoOrigin() == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x017c, code lost:
    
        if (r8 != null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e8  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HFB] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [X.OQg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HFA.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static final boolean LIZJ(Object obj) {
        List<String> pipResourcePaths;
        if (Q7K.LIZIZ("close_vframe_upload", 0) != 0 || !(obj instanceof VideoPublishEditModel)) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            if (!videoPublishEditModel.hasImageStickers()) {
                return false;
            }
            return true;
        }
        if (H7R.LJJJJL(videoPublishEditModel)) {
            return true;
        }
        if ((videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && (pipResourcePaths = videoPublishEditModel.getEditorProModel().getPipResourcePaths()) != null && !pipResourcePaths.isEmpty()) || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType() || C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData) || videoPublishEditModel.isCurrentAutoCutMode()) {
            return true;
        }
        if (videoPublishEditModel.isLibraryMaterialOnly() && !videoPublishEditModel.hasGalleryVideo() && !videoPublishEditModel.hasGalleryPhoto()) {
            if (videoPublishEditModel.hasImageStickers() && !H7R.LJJJJL(videoPublishEditModel)) {
                return true;
            }
            if (!H7R.LJJJJL(videoPublishEditModel)) {
                return false;
            }
            for (SingleImageData singleImageData : videoPublishEditModel.getImageAlbumData().getImageList()) {
                if (!singleImageData.getStickerInfo().getStickers().isEmpty()) {
                    if (singleImageData == null) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        if (H7R.LJJIIZ(videoPublishEditModel)) {
            return true;
        }
        return videoPublishEditModel.shouldUploadExtractFrames();
    }

    public static final AbstractC43762HFm LIZ(HG7 hg7, Object obj) {
        String str;
        List arrayList;
        List<String> auditFrames;
        List<FrameItem> allFrames;
        List<CanvasVideoData> externalTracks;
        List<String> sourceInfo;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        EditVideoSegment editVideoSegment = null;
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.isCurrentAutoCutMode() && videoPublishEditModel.mOrigin == 0) {
                return new C43768HFs(videoPublishEditModel);
            }
            if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && !H7R.LJJIL(videoPublishEditModel)) {
                C60903NvH.LJIIJJI().LJIJ();
                C5K0.LIZ(2);
                ArrayList<LibraryMaterialInfoSv> arrayList3 = videoPublishEditModel.libraryMaterialList;
                o.LJIIIIZZ(arrayList3, "args.libraryMaterialList");
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                Iterator<LibraryMaterialInfoSv> it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(it.next().getRawFilePath());
                }
                List<EditVideoSegment> albumUploadVideoSegments = videoPublishEditModel.getEditorProModel().getAlbumUploadVideoSegments();
                ArrayList arrayList5 = new ArrayList();
                for (EditVideoSegment editVideoSegment2 : albumUploadVideoSegments) {
                    if (!arrayList4.contains(editVideoSegment2.getVideoPath())) {
                        arrayList5.add(editVideoSegment2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(C32I.LJJL(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(C79057V0z.LJJJLIIL((EditVideoSegment) it2.next()));
                }
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList6);
                arrayList7.addAll(C60903NvH.LJIIJJI().LJJIIZ().LIZIZ(videoPublishEditModel.nleData));
                List<EditVideoSegment> canvasShootImageSegments = videoPublishEditModel.getEditorProModel().getCanvasShootImageSegments();
                if (canvasShootImageSegments != null) {
                    ArrayList arrayList8 = new ArrayList(C32I.LJJL(canvasShootImageSegments, 10));
                    Iterator<EditVideoSegment> it3 = canvasShootImageSegments.iterator();
                    while (it3.hasNext()) {
                        arrayList8.add(C79057V0z.LJJJLIIL(it3.next()));
                    }
                    arrayList7.addAll(arrayList8);
                }
                if (!(!arrayList7.isEmpty())) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData != null && (arrayList2 = multiEditVideoStatusRecordData.editSegments) != null) {
                        Iterator<TimeSpeedModelExtension> it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            TimeSpeedModelExtension next = it4.next();
                            if (next.getBackgroundVideo() == null || next.getmBackgroundVideoTimeInfo() == null) {
                            }
                        }
                    }
                    return null;
                }
                LIZ = 12;
                CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                o.LJIIIIZZ(creativeInfo, "args.creativeInfo");
                return new C43761HFl(creativeInfo, arrayList7, videoPublishEditModel);
            }
            if (H7R.LJJIL(videoPublishEditModel)) {
                if (C79004UzY.LJJIIJ(videoPublishEditModel.canvasVideoData)) {
                    return new C43767HFr(videoPublishEditModel.creativeInfo, C61878OQg.INSTANCE);
                }
                CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
                if (canvasVideoData != null && (externalTracks = canvasVideoData.getExternalTracks()) != null && (!externalTracks.isEmpty())) {
                    CreativeInfo creativeInfo2 = videoPublishEditModel.creativeInfo;
                    ArrayList arrayList9 = new ArrayList();
                    CanvasVideoData canvasVideoData2 = videoPublishEditModel.canvasVideoData;
                    if (canvasVideoData2 != null && (sourceInfo = canvasVideoData2.getSourceInfo()) != null && !sourceInfo.isEmpty()) {
                        String str2 = (String) ListProtector.get(sourceInfo, 0);
                        EditVideoSegment editVideoSegment3 = new EditVideoSegment(str2, null, C78926UyI.LJJJLZIJ(str2));
                        CanvasExtra extra = canvasVideoData2.getExtra();
                        if (extra != null) {
                            editVideoSegment3.setVideoCutInfo(new VideoCutInfo(0L, extra.getDuration(), extra.getSpeed(), extra.getRotation()));
                        }
                        editVideoSegment = editVideoSegment3;
                    }
                    arrayList9.add(editVideoSegment);
                    return new C43767HFr(creativeInfo2, arrayList9);
                }
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                if (extractFramesModel != null && (allFrames = extractFramesModel.getAllFrames()) != null) {
                    ArrayList arrayList10 = new ArrayList(C32I.LJJL(allFrames, 10));
                    Iterator<FrameItem> it5 = allFrames.iterator();
                    while (it5.hasNext()) {
                        arrayList10.add(it5.next().getPath());
                    }
                    arrayList = ORZ.LLJILJILJ(arrayList10);
                } else {
                    arrayList = new ArrayList();
                }
                CanvasVideoData canvasVideoData3 = videoPublishEditModel.canvasVideoData;
                if (canvasVideoData3 != null && (auditFrames = canvasVideoData3.getAuditFrames()) != null) {
                    ArrayList arrayList11 = new ArrayList(C32I.LJJL(auditFrames, 10));
                    Iterator<String> it6 = auditFrames.iterator();
                    while (it6.hasNext()) {
                        arrayList11.add(it6.next());
                    }
                    if (!arrayList11.isEmpty()) {
                        arrayList.addAll(arrayList11);
                    }
                }
                return new C43769HFt(videoPublishEditModel.creativeInfo, arrayList, hg7);
            }
            if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && videoPublishEditModel.creativeModel.onThisDayData.getForwardType() == 0) {
                return new C43767HFr(videoPublishEditModel.creativeInfo, videoPublishEditModel.getPreviewInfo().getVideoList());
            }
            if (H7R.LJJJJL(videoPublishEditModel)) {
                LIZ = 11;
                CreativeInfo creativeInfo3 = videoPublishEditModel.creativeInfo;
                List<SingleImageData> imageList = videoPublishEditModel.getImageAlbumData().getImageList();
                ArrayList arrayList12 = new ArrayList(C32I.LJJL(imageList, 10));
                Iterator<SingleImageData> it7 = imageList.iterator();
                while (it7.hasNext()) {
                    arrayList12.add(it7.next().getSrcImageInfo().getPath());
                }
                return new C43769HFt(creativeInfo3, arrayList12, hg7);
            }
            if (videoPublishEditModel.isMvThemeVideoType()) {
                LIZ = 1;
                return new C43769HFt(videoPublishEditModel.creativeInfo, videoPublishEditModel.mvCreateVideoData.srcSelectMediaList, hg7);
            }
            if (videoPublishEditModel.isCutSameVideoType()) {
                LIZ = 2;
                return new C43770HFu(videoPublishEditModel.creativeInfo, videoPublishEditModel.cutSameEditData.videoSegmentDataList);
            }
            if ((H7R.LJJJJLI(videoPublishEditModel) || videoPublishEditModel.editMusicSyncMode) && videoPublishEditModel.getPreviewInfo() != null && !C77413UZt.LJIILL(videoPublishEditModel.getPreviewInfo().getVideoList())) {
                LIZ = 7;
                return new HFC(videoPublishEditModel.creativeInfo, C65661Ppp.LIZLLL(videoPublishEditModel.getPreviewInfo().getVideoList(), HFG.LJLIL));
            }
            if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || ((str = videoPublishEditModel.mShootWay) != null && ujb.o.LJJJLIIL(str, "miracle_game", false))) {
                LIZ = 6;
                return new C43767HFr(videoPublishEditModel.creativeInfo, videoPublishEditModel.getPreviewInfo().getVideoList());
            }
            if (!videoPublishEditModel.containBackgroundVideo) {
                ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc);
                if (!LJIIJJI.isEmpty()) {
                    Iterator<TimeSpeedModelExtension> it8 = LJIIJJI.iterator();
                    while (it8.hasNext()) {
                        if (it8.next().getBackgroundVideo() != null) {
                        }
                    }
                }
                if (!videoPublishEditModel.containDiyPropVideo) {
                    ArrayList<TimeSpeedModelExtension> LJIIJJI2 = CameraComponentModel.LJIIJJI(videoPublishEditModel.mVideoSegmentsDesc);
                    if (!LJIIJJI2.isEmpty()) {
                        Iterator<TimeSpeedModelExtension> it9 = LJIIJJI2.iterator();
                        while (it9.hasNext()) {
                            if (it9.next().getDiyPropVideo() != null) {
                            }
                        }
                    }
                }
                LIZ = 14;
                return new C43764HFo(hg7, videoPublishEditModel);
            }
            LIZ = 10;
            return new C43763HFn(hg7, videoPublishEditModel);
        }
        return null;
    }
}
