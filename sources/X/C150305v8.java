package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.model.EditImageInfo;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSurfaceData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5v8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150305v8 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (model.creationMode == 2 || model.getImageAlbumData() != null) {
            H78.LIZJ("revertImageMode");
            model.creationMode = 1;
            model.setImageAlbumData(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(VideoPublishEditModel model, AbstractC143185je videoSizeProvider) {
        List<String> sourceInfo;
        String str;
        boolean z;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(videoSizeProvider, "videoSizeProvider");
        CanvasVideoData canvasVideoData = model.canvasVideoData;
        if (canvasVideoData == null || (sourceInfo = canvasVideoData.getSourceInfo()) == null || (str = (String) ORZ.LJLLLL(sourceInfo)) == null) {
            return;
        }
        int LIZLLL = videoSizeProvider.LIZLLL();
        int LJI = videoSizeProvider.LJI();
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        String str2 = null;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        ImageAlbumData imageAlbumData = new ImageAlbumData(null, false, new ImageSurfaceData(LIZLLL, LJI), 0, 0, null, null, 123, null);
        ArrayList arrayList = new ArrayList();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(model.getCreationId());
        LIZ2.append('_');
        LIZ2.append(System.currentTimeMillis());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        SrcImageInfo srcImageInfo = new SrcImageInfo(str, LJI, LIZLLL);
        float f = 0.0f;
        if (LIZLLL / LJI <= ((Number) C151105wQ.LJIILIIL.getValue()).floatValue()) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(new SingleImageData(LIZIZ, srcImageInfo, objArr13 == true ? 1 : 0, new EditImageInfo(str2, i, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, f, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, z, 2047, objArr14 == true ? 1 : 0), objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr == true ? 1 : 0, objArr7 == true ? 1 : 0, 2032, objArr6 == true ? 1 : 0));
        imageAlbumData.setImageList(arrayList);
        model.setImageAlbumData(imageAlbumData);
        model.creationMode = 2;
    }

    public static boolean LIZ(VideoPublishEditModel model, C122034qd c122034qd, InterfaceC150315v9 stickerScene) {
        CanvasVideoData canvasVideoData;
        String str;
        List<CanvasVideoData> externalTracks;
        List<EditVideoSegment> videoList;
        List<StickerItemModel> list;
        int i;
        List<EditVideoSegment> videoList2;
        List<StickerItemModel> list2;
        String str2;
        Boolean bool;
        C5WG LJIIIIZZ;
        InterfaceC153095zd LIZ2;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(stickerScene, "stickerScene");
        if (!C6H4.LJFF(model.creativeModel.stickerModel)) {
            InfoStickerModel infoStickerModel = model.infoStickerModel;
            if (infoStickerModel != null && (list2 = infoStickerModel.stickers) != null && !list2.isEmpty()) {
                for (StickerItemModel stickerItemModel : list2) {
                    if (stickerItemModel != null && (str2 = stickerItemModel.uuid) != null) {
                        if (c122034qd != null && (LJIIIIZZ = c122034qd.LJIIIIZZ()) != null && (LIZ2 = LJIIIIZZ.LIZ()) != null) {
                            bool = Boolean.valueOf(LIZ2.LJIIJ(str2));
                        } else {
                            bool = null;
                        }
                        if (o.LJ(bool, Boolean.TRUE)) {
                            break;
                        }
                    }
                }
            }
            if (!stickerScene.LJIJ() && !stickerScene.LJL()) {
                EditPreviewInfo previewInfo = model.getPreviewInfo();
                if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null && !videoList.isEmpty()) {
                    EditPreviewInfo previewInfo2 = model.getPreviewInfo();
                    long j = 0;
                    if (previewInfo2 != null && (videoList2 = previewInfo2.getVideoList()) != null) {
                        Iterator<EditVideoSegment> it = videoList2.iterator();
                        while (it.hasNext()) {
                            j += it.next().getVideoFileInfo().getDuration();
                        }
                    }
                    InfoStickerModel infoStickerModel2 = model.infoStickerModel;
                    if (infoStickerModel2 != null && (list = infoStickerModel2.stickers) != null && !list.isEmpty()) {
                        for (StickerItemModel stickerItemModel2 : list) {
                            if (stickerItemModel2 != null && ((i = stickerItemModel2.type) == 2 || i == 0 || i == 11 || i == 10 || stickerItemModel2.isNowSmallWindowSticker())) {
                                if (stickerItemModel2.startTime != 0 || stickerItemModel2.endTime < j) {
                                    break;
                                }
                            }
                        }
                    }
                    List<TextStickerData> LJLLLL = stickerScene.LJLLLL();
                    if (!(LJLLLL instanceof Collection) || !LJLLLL.isEmpty()) {
                        for (TextStickerData textStickerData : LJLLLL) {
                            if (textStickerData.getStartTime() != 0) {
                                break;
                            }
                            long endTime = textStickerData.getEndTime();
                            if (1 <= endTime && endTime < j) {
                                break;
                            }
                        }
                    }
                }
                if (!model.hasSubtitle() && model.creativeModel.inlineCaptionModel == null && !model.hasRecord() && model.veAudioEffectParam == null) {
                    o.LJIIIIZZ(model.getEffectList(), "model.effectList");
                    if (!(!r1.isEmpty()) && model.getTimeEffect() == null && ((canvasVideoData = model.canvasVideoData) == null || (externalTracks = canvasVideoData.getExternalTracks()) == null || !(!externalTracks.isEmpty()))) {
                        MusicBuzModel musicBuzModel = model.creativeModel.musicBuzModel;
                        if (musicBuzModel.soundSpeed != 1.0f || (((str = musicBuzModel.soundFilterId) != null && str.length() > 0) || (!model.creativeModel.magicCombineEffectModel.magicCombineEffectModelList.isEmpty()))) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean LIZIZ(VideoPublishEditModel model, C122034qd c122034qd, InterfaceC150315v9 stickerScene) {
        CanvasVideoData canvasVideoData;
        List<String> sourceInfo;
        CanvasVideoData canvasVideoData2;
        List<String> sourceInfo2;
        o.LJIIIZ(model, "model");
        o.LJIIIZ(stickerScene, "stickerScene");
        CanvasVideoData canvasVideoData3 = model.canvasVideoData;
        if ((!C79004UzY.LJJIIZI(canvasVideoData3) || !C79004UzY.LJJIJLIJ(canvasVideoData3)) && !C79004UzY.LJJIJL(model.canvasVideoData) && C150325vA.LIZ() && !H7R.LJJLIIIJJIZ(model) && !C151525x6.LIZLLL(model) && (canvasVideoData = model.canvasVideoData) != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && !sourceInfo.isEmpty() && (canvasVideoData2 = model.canvasVideoData) != null && (sourceInfo2 = canvasVideoData2.getSourceInfo()) != null && sourceInfo2.size() == 1 && !C41660GWq.LIZ && !LIZ(model, c122034qd, stickerScene)) {
            return true;
        }
        return false;
    }
}
