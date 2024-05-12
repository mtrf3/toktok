package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GuG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43004GuG {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (e1.LIZ(31744, "enable_ai_recommend_sticker", true, false) && !model.isStoryEditMode && ((model.mShootMode != 15 || model.mOrigin == 0) && C1B8.LIZJ() && !C1DG.LJIIIIZZ())) {
            return true;
        }
        return false;
    }

    public static C43016GuS LIZIZ(AbstractC43007GuJ abstractC43007GuJ) {
        String str = "";
        if (abstractC43007GuJ instanceof C43006GuI) {
            C43006GuI c43006GuI = (C43006GuI) abstractC43007GuJ;
            C41932Gcy c41932Gcy = new C41932Gcy(c43006GuI.LJ, c43006GuI.LJI);
            String str2 = abstractC43007GuJ.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = abstractC43007GuJ.LIZJ;
            if (str3 != null) {
                str = str3;
            }
            return new C43016GuS(c41932Gcy, c43006GuI.LJFF, str2, str, false, null, false, 240);
        }
        if (abstractC43007GuJ instanceof C43009GuL) {
            C43009GuL c43009GuL = (C43009GuL) abstractC43007GuJ;
            C41931Gcx c41931Gcx = new C41931Gcx(c43009GuL.LJ, 0L, c43009GuL.LJFF);
            String str4 = abstractC43007GuJ.LIZIZ;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = abstractC43007GuJ.LIZJ;
            if (str5 != null) {
                str = str5;
            }
            return new C43016GuS(c41931Gcx, 0L, str4, str, false, null, false, 242);
        }
        if (abstractC43007GuJ instanceof C43010GuM) {
            C43010GuM c43010GuM = (C43010GuM) abstractC43007GuJ;
            C42362Gju c42362Gju = new C42362Gju(c43010GuM.LJ);
            String str6 = abstractC43007GuJ.LIZIZ;
            if (str6 != null) {
                str = str6;
            }
            return new C43016GuS(c42362Gju, 0L, str, null, c43010GuM.LJI, null, false, 234);
        }
        if (abstractC43007GuJ instanceof C43008GuK) {
            C42362Gju c42362Gju2 = new C42362Gju(((C43008GuK) abstractC43007GuJ).LJ);
            String str7 = abstractC43007GuJ.LIZIZ;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = abstractC43007GuJ.LIZJ;
            if (str8 != null) {
                str = str8;
            }
            return new C43016GuS(c42362Gju2, 0L, str7, str, false, null, false, 242);
        }
        if (abstractC43007GuJ instanceof C43011GuN) {
            C42361Gjt c42361Gjt = new C42361Gjt(((C43011GuN) abstractC43007GuJ).LJ);
            String str9 = abstractC43007GuJ.LIZIZ;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = abstractC43007GuJ.LIZJ;
            if (str10 != null) {
                str = str10;
            }
            return new C43016GuS(c42361Gjt, 0L, str9, str, false, null, false, 242);
        }
        throw new C162476Zf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    public static AbstractC43007GuJ LIZJ(VideoPublishEditModel model) {
        ArrayList<String> arrayList;
        MultiEditVideoRecordData multiEditVideoRecordData;
        String str;
        long j;
        CanvasExtra extra;
        List<String> sourceInfo;
        o.LJIIIZ(model, "model");
        List<MultiEditVideoSegmentRecordData> list = null;
        if (model.mFromCut || model.mFromMultiCut) {
            if (model.getPreviewInfo() == null || !(!model.getPreviewInfo().getVideoList().isEmpty())) {
                return null;
            }
            return new C43009GuL(((EditVideoSegment) ListProtector.get(model.getPreviewInfo().getVideoList(), 0)).getVideoPath(), model.getVideoLength(), model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), null, 138);
        }
        if (model.isMvThemeVideoType()) {
            o.LJIIIIZZ(model.mvCreateVideoData.srcSelectMediaList, "model.mvCreateVideoData.srcSelectMediaList");
            if (!(!r0.isEmpty())) {
                return null;
            }
            ArrayList<String> arrayList2 = model.mvCreateVideoData.srcSelectMediaList;
            o.LJIIIIZZ(arrayList2, "model.mvCreateVideoData.srcSelectMediaList");
            return new C43008GuK(arrayList2, model.mShootWay, model.getCreationId(), model.microAppId, null, 0L, 48);
        }
        if (model.isPhotoMvMode || C79004UzY.LJJIIZI(model.canvasVideoData) || H7R.LJJJJL(model)) {
            if (H7R.LJJIL(model)) {
                CanvasVideoData canvasVideoData = model.canvasVideoData;
                if (canvasVideoData == null) {
                    return null;
                }
                arrayList = canvasVideoData.getSourceInfo();
            } else {
                MvCreateVideoData mvCreateVideoData = model.mvCreateVideoData;
                if (mvCreateVideoData != null) {
                    arrayList = mvCreateVideoData.srcSelectMediaList;
                } else {
                    List<SingleImageData> imageList = model.getImageAlbumData().getImageList();
                    arrayList = new ArrayList<>(C32I.LJJL(imageList, 10));
                    Iterator<SingleImageData> it = imageList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getSrcImageInfo().getPath());
                    }
                    return new C43010GuM(model.mShootWay, model.getCreationId(), arrayList, model.microAppId, "", true);
                }
            }
            if (arrayList == null) {
                return null;
            }
            return new C43010GuM(model.mShootWay, model.getCreationId(), arrayList, model.microAppId, "", true);
        }
        if (C79004UzY.LJJJI(model.canvasVideoData)) {
            CanvasVideoData canvasVideoData2 = model.canvasVideoData;
            if (canvasVideoData2 == null || (sourceInfo = canvasVideoData2.getSourceInfo()) == null || (str = (String) ORZ.LJLLJ(sourceInfo)) == null) {
                str = "";
            }
            if (C79004UzY.LJIJJLI(model.canvasVideoData)) {
                return new C43011GuN(str, model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), model.getMusicId());
            }
            if (!C44687HgJ.LIZIZ(str)) {
                return null;
            }
            CanvasVideoData canvasVideoData3 = model.canvasVideoData;
            if (canvasVideoData3 != null && (extra = canvasVideoData3.getExtra()) != null) {
                j = extra.getDuration();
            } else {
                j = -1;
            }
            return new C43009GuL(str, j, model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), model.getMusicId(), 10);
        }
        if (model.extractFramesModel == null || !(!r0.getAllFrames().isEmpty())) {
            return null;
        }
        ExtractFramesModel extractFramesModel = model.extractFramesModel;
        long videoLength = model.getVideoLength();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = model.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            list = multiEditVideoRecordData.segmentDataList;
        }
        return new C43006GuI(extractFramesModel, videoLength, list, model.mShootWay, model.getCreationId(), model.microAppId, C1JD.LJIIJJI(model), "");
    }

    public static final void LIZLLL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        AbstractC43007GuJ LIZJ = LIZJ(model);
        if (LIZJ != null) {
            if (LIZ(model) || ((Number) C42887GsN.LIZ.getValue()).intValue() != 0) {
                C43016GuS LIZIZ = LIZIZ(LIZJ);
                C78934UyQ.LJLIL.getMusicService().LJIILJJIL();
                C41930Gcw.LIZIZ(LIZIZ.LIZ);
                C41930Gcw.LJII();
            }
        }
    }
}
