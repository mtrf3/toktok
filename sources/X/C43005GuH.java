package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GuH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43005GuH {
    public static final String LIZ(AbstractC43007GuJ abstractC43007GuJ) {
        boolean z;
        Boolean bool;
        String str = abstractC43007GuJ.LIZ;
        if ((!C1DG.LJIIIIZZ()) && !ORZ.LJLJJI(str, C43012GuO.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (!z || C00F.LIZ(31744, 0, "reverse_ai_music_panel_type", true) != 0) {
            return "";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("is_login", String.valueOf(C60903NvH.LJIIJJI().getAccountService().isLogin()));
        FMX.LJIIL("tool_performance_ai_music_start_frames", c145995oB.LIZ);
        if (abstractC43007GuJ instanceof C43006GuI) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43006GuI c43006GuI = (C43006GuI) abstractC43007GuJ;
            str2 = C43014GuQ.LIZ.LJIILL(c43006GuI.LJ, c43006GuI.LJI, abstractC43007GuJ.LIZIZ, abstractC43007GuJ.LIZJ, c43006GuI.LJFF);
        } else if (abstractC43007GuJ instanceof C43009GuL) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43009GuL c43009GuL = (C43009GuL) abstractC43007GuJ;
            str2 = C43014GuQ.LIZ.LJIIL(c43009GuL.LJ, 0L, abstractC43007GuJ.LIZIZ, c43009GuL.LJFF, abstractC43007GuJ.LIZJ, abstractC43007GuJ.LIZLLL);
        } else if (abstractC43007GuJ instanceof C43010GuM) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43010GuM c43010GuM = (C43010GuM) abstractC43007GuJ;
            str2 = C43014GuQ.LIZ.LJIILJJIL(abstractC43007GuJ.LIZIZ, abstractC43007GuJ.LIZLLL, c43010GuM.LJ, c43010GuM.LJI);
        } else if (abstractC43007GuJ instanceof C43008GuK) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C43014GuQ c43014GuQ = C43014GuQ.LIZ;
            C43008GuK c43008GuK = (C43008GuK) abstractC43007GuJ;
            List<String> list = c43008GuK.LJ;
            String str3 = abstractC43007GuJ.LIZIZ;
            String str4 = abstractC43007GuJ.LIZJ;
            String str5 = abstractC43007GuJ.LIZ;
            if (str5 != null) {
                bool = Boolean.valueOf(str5.equals("l8_import_music_edit"));
            } else {
                bool = null;
            }
            long j = c43008GuK.LJFF;
            if (j <= 0) {
                j = -1;
            }
            str2 = c43014GuQ.LJIILIIL(list, str3, str4, bool, Long.valueOf(j));
        } else if (abstractC43007GuJ instanceof C43011GuN) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            C42361Gjt c42361Gjt = new C42361Gjt(((C43011GuN) abstractC43007GuJ).LJ);
            String str6 = abstractC43007GuJ.LIZIZ;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = abstractC43007GuJ.LIZJ;
            if (str7 != null) {
                str2 = str7;
            }
            str2 = C43014GuQ.LJIIJJI(new C43016GuS(c42361Gjt, 0L, str6, str2, false, abstractC43007GuJ.LIZLLL, false, 178));
        }
        C78934UyQ.LJLIL.getMusicService().LJJI();
        return str2;
    }

    public static final void LIZIZ(VideoPublishEditModel model) {
        AbstractC43007GuJ c43009GuL;
        MultiEditVideoRecordData multiEditVideoRecordData;
        String str;
        long j;
        CanvasExtra extra;
        List<String> sourceInfo;
        String str2;
        List<String> sourceInfo2;
        o.LJIIIZ(model, "model");
        List<MultiEditVideoSegmentRecordData> list = null;
        if (model.mFromCut || model.mFromMultiCut || model.isCutSameVideoType() || model.isLibraryMaterialOnly()) {
            if (model.getPreviewInfo() != null && (!model.getPreviewInfo().getVideoList().isEmpty())) {
                c43009GuL = new C43009GuL(((EditVideoSegment) ListProtector.get(model.getPreviewInfo().getVideoList(), 0)).getVideoPath(), model.getVideoLength(), model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), model.creativeModel.musicBuzModel.replaceMusicId, 10);
            } else {
                return;
            }
        } else if (model.isMvThemeVideoType()) {
            o.LJIIIIZZ(model.mvCreateVideoData.srcSelectMediaList, "model.mvCreateVideoData.srcSelectMediaList");
            if (!(!r0.isEmpty())) {
                return;
            }
            ArrayList<String> arrayList = model.mvCreateVideoData.srcSelectMediaList;
            o.LJIIIIZZ(arrayList, "model.mvCreateVideoData.srcSelectMediaList");
            c43009GuL = new C43008GuK(arrayList, model.mShootWay, model.getCreationId(), model.microAppId, null, model.getVideoLength(), 16);
        } else if (model.isPhotoMvMode) {
            ArrayList<String> arrayList2 = model.mvCreateVideoData.srcSelectMediaList;
            o.LJIIIIZZ(arrayList2, "model.mvCreateVideoData.srcSelectMediaList");
            c43009GuL = new C43010GuM(model.mShootWay, model.getCreationId(), arrayList2, model.microAppId, model.creativeModel.musicBuzModel.replaceMusicId, true);
        } else if (H7R.LJJJJL(model) && model.getImageAlbumData() != null) {
            List<SingleImageData> imageList = model.getImageAlbumData().getImageList();
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(imageList, 10));
            Iterator<SingleImageData> it = imageList.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().getSrcImageInfo().getPath());
            }
            c43009GuL = new C43010GuM(model.mShootWay, model.getCreationId(), arrayList3, model.microAppId, model.creativeModel.musicBuzModel.replaceMusicId, true);
        } else if (C79004UzY.LJJJI(model.canvasVideoData)) {
            CanvasVideoData canvasVideoData = model.canvasVideoData;
            String str3 = "";
            if (canvasVideoData == null || (sourceInfo2 = canvasVideoData.getSourceInfo()) == null || (str = (String) ORZ.LJLLJ(sourceInfo2)) == null) {
                str = "";
            }
            if (!C44687HgJ.LIZIZ(str)) {
                return;
            }
            CanvasVideoData canvasVideoData2 = model.canvasVideoData;
            if (canvasVideoData2 != null && (sourceInfo = canvasVideoData2.getSourceInfo()) != null && (str2 = (String) ORZ.LJLLJ(sourceInfo)) != null) {
                str3 = str2;
            }
            CanvasVideoData canvasVideoData3 = model.canvasVideoData;
            if (canvasVideoData3 != null && (extra = canvasVideoData3.getExtra()) != null) {
                j = extra.getDuration();
            } else {
                j = -1;
            }
            c43009GuL = new C43009GuL(str3, j, model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), model.creativeModel.musicBuzModel.replaceMusicId, 10);
        } else {
            if (model.extractFramesModel == null || !(!r0.getAllFrames().isEmpty())) {
                return;
            }
            ExtractFramesModel extractFramesModel = model.extractFramesModel;
            long videoLength = model.getVideoLength();
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
                list = multiEditVideoRecordData.segmentDataList;
            }
            c43009GuL = new C43006GuI(extractFramesModel, videoLength, list, model.mShootWay, model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), model.getMusicId());
        }
        LIZ(c43009GuL);
    }
}
