package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HgX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44701HgX {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        if (context == null) {
            return true;
        }
        Activity LJIILL = C78949Uyf.LJIILL(context);
        if (LJIILL != null && LJIILL.isFinishing()) {
            return true;
        }
        Activity LJIILL2 = C78949Uyf.LJIILL(context);
        if (LJIILL2 != null && LJIILL2.isDestroyed()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String str;
        int i = videoPublishEditModel.mOrigin;
        if ((i == 1 || i == 2) && !videoPublishEditModel.isDuet() && !videoPublishEditModel.isStitchMode()) {
            z = true;
        } else {
            z = false;
        }
        if (C00F.LIZ(31744, 0, "studio_record_support_autocut_strategy", true) == 0) {
            return false;
        }
        if (C00F.LIZ(31744, 0, "studio_record_support_autocut_strategy", true) == 1) {
            if (!z || ((str = videoPublishEditModel.mStickerID) != null && str.length() != 0)) {
                return false;
            }
            return true;
        }
        if (C00F.LIZ(31744, 0, "studio_record_support_autocut_strategy", true) != 2) {
            return false;
        }
        return z;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !e1.LIZ(31744, "studio_merge_sound_sync_autocut", true, false) || !LJIILIIL(videoPublishEditModel) || !C145805ns.LIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it.next();
                if (!z || !FileUtils.INSTANCE.checkFileExists(autoCutMediaModel.filePath)) {
                    z = false;
                }
            }
            return z;
        }
    }

    public static boolean LJIIIIZZ(AutoCutModel autoCutModel) {
        ArrayList arrayList;
        o.LJIIIZ(autoCutModel, "autoCutModel");
        if (C44707Hgd.LIZ()) {
            List<AutoCutThemeData> list = autoCutModel.templateList;
            arrayList = new ArrayList();
            for (AutoCutThemeData autoCutThemeData : list) {
                AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                if (autoCutThemeData2.LIZ() == C63A.AUTO_CUT && !autoCutThemeData2.isPreset) {
                    arrayList.add(autoCutThemeData);
                }
            }
        } else {
            List<AutoCutThemeData> list2 = autoCutModel.templateList;
            arrayList = new ArrayList();
            for (AutoCutThemeData autoCutThemeData3 : list2) {
                AutoCutThemeData autoCutThemeData4 = autoCutThemeData3;
                String str = autoCutThemeData4.musicId;
                if (str != null && str.length() > 0 && autoCutThemeData4.LIZ() == C63A.AUTO_CUT && !autoCutThemeData4.isPreset) {
                    arrayList.add(autoCutThemeData3);
                }
            }
        }
        return !arrayList.isEmpty();
    }

    public static final List<MediaModel> LJIIJ(C133765Mu veEditor) {
        NLEResourceAV LJ;
        o.LJIIIZ(veEditor, "veEditor");
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = veEditor.LJFF().getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                NLESegmentVideo LJJIZ = C78609UtB.LJJIZ(next);
                if (LJJIZ != null && (LJ = LJJIZ.LJ()) != null) {
                    MediaModel mediaModel = new MediaModel(-1L);
                    mediaModel.fileLocalUriPath = LJ.LIZJ();
                    mediaModel.width = (int) LJ.LJI();
                    mediaModel.height = (int) LJ.LIZIZ();
                    mediaModel.duration = LJ.getDuration();
                    mediaModel.startTime = (int) next.getStartTime();
                    mediaModel.endTime = (int) next.getEndTime();
                    mediaModel.speed = 1.0f;
                    arrayList.add(mediaModel);
                }
            }
        }
        return ORZ.LLJI(arrayList);
    }

    public static boolean LJIIJJI(CreativeModel creativeModel) {
        AutoCutModel autoCutModel;
        if (creativeModel != null && (autoCutModel = creativeModel.autoCutModel) != null && autoCutModel.backwardAutoCutProcess) {
            return true;
        }
        return false;
    }

    public static boolean LJIIL(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        if (!model.isFromAutoCutAnchor() || !HRX.LIZIZ() || !model.isFromAutoCutAnchor() || LJIIIIZZ(model.creativeModel.autoCutModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIILIIL(VideoPublishEditModel model) {
        ArrayList<ImportVideoInfo> arrayList;
        o.LJIIIZ(model, "model");
        if (!C45087Hml.LJ(model.isShoutout(), CommerceMediaServiceImpl.LIZJ().LIZ()) || !HRX.LIZJ() || H7R.LJJLIIIJL(model) || model.isCutSameVideoType() || C79004UzY.LJJIJL(model.canvasVideoData)) {
            return false;
        }
        if ((H7R.LJJJJL(model) || model.mOrigin != 0 || ((model.isMvThemeVideoType() && !model.isPhotoMvMode) || (arrayList = model.importInfoList) == null || arrayList.isEmpty())) && !LIZIZ(model)) {
            return false;
        }
        CreativeModel creativeModel = model.creativeModel;
        o.LJIIIIZZ(creativeModel, "model.creativeModel");
        if (creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (LIZJ(videoPublishEditModel) && ((Boolean) C126574xx.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0203, code lost:
    
        if (r30 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x021b, code lost:
    
        if (r4 != null) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C44704Hga LJ(android.content.Context r28, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r29, X.C82622Wbi r30) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44701HgX.LJ(android.content.Context, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.Wbi):X.Hga");
    }

    public static String LJI(Context context, String str, boolean z) {
        if (z && C44694HgQ.LJIL(str) && context != null) {
            return C00S.LIZIZ(context, C44694HgQ.LJIIIIZZ(str));
        }
        return str;
    }

    public static void LJIIIZ(AutoCutModel autoCutModel, AutoCutModel autoCutModel2, boolean z) {
        boolean z2 = autoCutModel.backwardAutoCutProcess;
        if (z2) {
            autoCutModel2.backwardAutoCutProcess = z2;
            autoCutModel2.clickFrom = autoCutModel.clickFrom;
        }
        if (z) {
            if (!autoCutModel.templateList.isEmpty()) {
                ListProtector.add(autoCutModel2.templateList, 0, ORZ.LJLLJ(autoCutModel.templateList));
            }
            autoCutModel2.curSource = autoCutModel.curSource;
            autoCutModel2.curIndexFromSource = autoCutModel.curIndexFromSource;
            AutoCutSoundSyncModel autoCutSoundSyncModel = autoCutModel.soundSyncModel;
            o.LJIIIZ(autoCutSoundSyncModel, "<set-?>");
            autoCutModel2.soundSyncModel = autoCutSoundSyncModel;
            autoCutModel2.curTemplateType = autoCutModel.curTemplateType;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AutoCutMediaModel> LJFF(Context context, VideoPublishEditModel model, C82622Wbi c82622Wbi, boolean z) {
        ArrayList<ImportVideoInfo> importInfoList;
        InterfaceC146755pP interfaceC146755pP;
        int i;
        CanvasExtra extra;
        CanvasExtra extra2;
        String str;
        boolean z2;
        boolean z3;
        o.LJIIIZ(model, "model");
        String str2 = null;
        int i2 = 0;
        if (model.isFromAutoCutAnchor()) {
            importInfoList = model.importInfoList;
        } else if (c82622Wbi == null || (interfaceC146755pP = (InterfaceC146755pP) ((C1EP) c82622Wbi.LJ(C1EP.class, null)).sO(InterfaceC146755pP.class)) == null || (importInfoList = interfaceC146755pP.Ti(false)) == null) {
            importInfoList = model.importInfoList;
        }
        boolean z4 = true;
        String str3 = "";
        if (model.mOrigin != 0 || ((model.isMvThemeVideoType() && !model.isPhotoMvMode) || importInfoList == null || importInfoList.isEmpty())) {
            if (!LIZIZ(model)) {
                return null;
            }
            if (model.getCurMultiEditVideoRecordData() != null) {
                o.LJIIIIZZ(model.getCurMultiEditVideoRecordData().segmentDataList, "model.curMultiEditVideoRecordData.segmentDataList");
                if (!r2.isEmpty()) {
                    List<MultiEditVideoSegmentRecordData> list = model.getCurMultiEditVideoRecordData().segmentDataList;
                    o.LJIIIIZZ(list, "model.curMultiEditVideoRecordData.segmentDataList");
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                        String LJI = LJI(context, multiEditVideoSegmentRecordData.videoPath, z);
                        if (LJI == null) {
                            str = "";
                        } else {
                            str = LJI;
                        }
                        String str4 = "";
                        int i3 = multiEditVideoSegmentRecordData.width;
                        int i4 = multiEditVideoSegmentRecordData.height;
                        if (z && !C44694HgQ.LJIJI(LJI, z4)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        long j = 0;
                        arrayList.add(new AutoCutMediaModel(str, str4, i3, i4, z2, multiEditVideoSegmentRecordData.videoLength / 1000, j, j, 0.0f, null, 960, 0 == true ? 1 : 0));
                        z4 = true;
                    }
                    return arrayList;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            CanvasVideoData canvasVideoData = model.canvasVideoData;
            if (canvasVideoData != null) {
                List<String> sourceInfo = canvasVideoData.getSourceInfo();
                if (sourceInfo != null) {
                    str2 = (String) ListProtector.get(sourceInfo, 0);
                }
                String LJI2 = LJI(context, str2, z);
                if (LJI2 != null) {
                    str3 = LJI2;
                }
                String str5 = "";
                CanvasVideoData canvasVideoData2 = model.canvasVideoData;
                if (canvasVideoData2 != null && (extra2 = canvasVideoData2.getExtra()) != null) {
                    i = extra2.getWidth();
                } else {
                    i = 0;
                }
                CanvasVideoData canvasVideoData3 = model.canvasVideoData;
                if (canvasVideoData3 != null && (extra = canvasVideoData3.getExtra()) != null) {
                    i2 = extra.getHeight();
                }
                long j2 = 0;
                AutoCutMediaModel autoCutMediaModel = new AutoCutMediaModel(str3, str5, i, i2, false, j2, j2, j2, 0.0f, null, 992, 0 == true ? 1 : 0);
                if (z) {
                    C45087Hml.LJJIZ(autoCutMediaModel);
                }
                arrayList2.add(autoCutMediaModel);
            }
            return arrayList2;
        }
        o.LJIIIIZZ(importInfoList, "importInfoList");
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(importInfoList, 10));
        Iterator<ImportVideoInfo> it = importInfoList.iterator();
        while (it.hasNext()) {
            ImportVideoInfo next = it.next();
            String LJI3 = LJI(context, next.getRealImportPath(), z);
            if (LJI3 == null) {
                LJI3 = "";
            }
            String originImportPath = next.getOriginImportPath();
            if (originImportPath == null) {
                originImportPath = "";
            }
            int videoWidth = next.getVideoWidth();
            int videoHeight = next.getVideoHeight();
            if (z && !C44694HgQ.LJIJI(next.getRealImportPath(), true)) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j3 = 0;
            AutoCutMediaModel autoCutMediaModel2 = new AutoCutMediaModel(LJI3, originImportPath, videoWidth, videoHeight, z3, next.getDuration(), j3, j3, 0.0f, null, 960, 0 == true ? 1 : 0);
            if (z) {
                C45087Hml.LJJIZ(autoCutMediaModel2);
            }
            arrayList3.add(autoCutMediaModel2);
        }
        return arrayList3;
    }

    public static boolean LJII(Context context, C82622Wbi c82622Wbi, C44704Hga c44704Hga, VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList;
        InterfaceC146755pP interfaceC146755pP;
        ArrayList<ImportVideoInfo> Ti;
        InterfaceC44717Hgn interfaceC44717Hgn;
        List<AutoCutMediaModel> qf0;
        if (videoPublishEditModel.isCurrentAutoCutMode()) {
            return true;
        }
        if (c82622Wbi != null && (interfaceC44717Hgn = (InterfaceC44717Hgn) c82622Wbi.LJIIIIZZ(null, InterfaceC44717Hgn.class)) != null && (qf0 = interfaceC44717Hgn.qf0()) != null) {
            arrayList = new ArrayList(C32I.LJJL(qf0, 10));
            Iterator<AutoCutMediaModel> it = qf0.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().filePath);
            }
        } else {
            arrayList = null;
        }
        if (c44704Hga != null && c44704Hga.LIZJ == EnumC44705Hgb.NLE) {
            List<AutoCutMediaModel> list = c44704Hga.LIZ;
            if (list == null) {
                return false;
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<AutoCutMediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().filePath);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size() && arrayList.containsAll(arrayList2)) {
                return true;
            }
            return false;
        }
        if (c82622Wbi == null || (interfaceC146755pP = (InterfaceC146755pP) ((C1EP) c82622Wbi.LJ(C1EP.class, null)).sO(InterfaceC146755pP.class)) == null || (Ti = interfaceC146755pP.Ti(false)) == null) {
            return true;
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(Ti, 10));
        Iterator<ImportVideoInfo> it3 = Ti.iterator();
        while (it3.hasNext()) {
            arrayList3.add(LJI(context, it3.next().getRealImportPath(), true));
        }
        if (arrayList != null && arrayList3.containsAll(arrayList) && arrayList.containsAll(arrayList3)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0370, code lost:
    
        if (r0.length() != 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x048e, code lost:
    
        if (r22 != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x049a, code lost:
    
        if (r14 == X.EnumC43998HOo.CUT_SAME.getValue()) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01f4, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r13, r12) != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL(android.content.Context r51, X.C82622Wbi r52, X.C44704Hga r53, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r54) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44701HgX.LJIILL(android.content.Context, X.Wbi, X.Hga, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):void");
    }
}
