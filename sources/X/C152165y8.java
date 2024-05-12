package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.5y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152165y8 {
    public static final int LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList = new ArrayList();
        ArrayList<EffectPointModel> effectList = videoPublishEditModel.getEffectList();
        o.LJIIIIZZ(effectList, "effectList");
        Iterator<EffectPointModel> it = effectList.iterator();
        while (it.hasNext()) {
            EffectPointModel next = it.next();
            String extra = next.getExtra();
            int i = 0;
            if (extra != null && extra.length() != 0) {
                if (new JSONObject(next.getExtra()).optBoolean("is_aigc_content")) {
                    i = 2;
                }
                arrayList.add(Integer.valueOf(i));
            }
        }
        return LIZIZ(arrayList);
    }

    public static final int LIZIZ(ArrayList<Integer> arrayList) {
        if (arrayList.contains(2)) {
            return 2;
        }
        if (arrayList.contains(1)) {
            return 1;
        }
        return 0;
    }

    public static final int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        ArrayList arrayList = new ArrayList();
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList) {
                int LIZ = C43134GwM.LIZ(singleImageData.getSrcImageInfo().getPath(), videoPublishEditModel.creativeModel.commonMobModel);
                singleImageData.setImageAIGCType(LIZ);
                arrayList.add(Integer.valueOf(LIZ));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AIGCManager -> hasAIGCForImageMode() = ");
        LIZ2.append(LIZIZ(arrayList));
        H78.LIZ(X1D.LIZIZ(LIZ2));
        return LIZIZ(arrayList);
    }

    public static final int LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String extra;
        String extra2;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        NowsShootModel nowsShootModel = creativeModel.nowsShootModel;
        if (nowsShootModel != null && nowsShootModel.type == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (nowsShootModel != null && nowsShootModel.type == 3)) {
            SimpleEffect simpleEffect = creativeModel.recordEffectModel.effectInfo;
            if (simpleEffect == null || (extra = simpleEffect.getExtra()) == null) {
                return 0;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AIGCManager -> effecInfo.extra = ");
            LIZ.append(extra);
            H78.LIZ(X1D.LIZIZ(LIZ));
            if (extra.length() <= 0 || !new JSONObject(extra).optBoolean("is_aigc_content")) {
                return 0;
            }
            return 2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList != null) {
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                SimpleEffect effectInfo = it.next().getEffectInfo();
                if (effectInfo != null && (extra2 = effectInfo.getExtra()) != null) {
                    if (extra2.length() > 0 && new JSONObject(extra2).optBoolean("is_aigc_content")) {
                        arrayList.add(2);
                    } else {
                        arrayList.add(0);
                    }
                }
            }
        }
        return LIZIZ(arrayList);
    }

    public static final int LJFF(VideoPublishEditModel videoPublishEditModel) {
        String extra;
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        if (finalVideoList != null) {
            Iterator<TimeSpeedModelExtension> it = finalVideoList.iterator();
            while (it.hasNext()) {
                SimpleEffect effectInfo = it.next().getEffectInfo();
                if (effectInfo != null && (extra = effectInfo.getExtra()) != null) {
                    if (extra.length() > 0 && new JSONObject(extra).optBoolean("is_aigc_content")) {
                        arrayList.add(2);
                    } else {
                        arrayList.add(0);
                    }
                }
            }
        }
        return LIZIZ(arrayList);
    }

    public static final void LJI(VideoPublishEditModel videoPublishEditModel) {
        int i;
        int LIZIZ;
        int LIZIZ2;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        List<String> sourceInfo;
        List<SingleImageData> imageList;
        String extra;
        int i2;
        int i3;
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!C40980G6m.LIZ()) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.draftInfoModel.isDraft) {
                AIGCInfo aIGCInfo = creativeModel.privacySettingModel.aigcInfo;
                if (aIGCInfo.AIGCLabelType == 2) {
                    aIGCInfo.AIGCLabelType = 0;
                    aIGCInfo.manualChangeSwitch = false;
                    return;
                }
                return;
            }
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList();
        videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.clear();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AIGCManager -> manualChangeSwitch -> manualChangeSwitch = ");
        C13860gY.LIZIZ(LIZ, videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.manualChangeSwitch, LIZ);
        AIGCInfo aIGCInfo2 = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
        if (aIGCInfo2.manualChangeSwitch) {
            i = aIGCInfo2.AIGCLabelType;
        } else {
            i = 0;
        }
        arrayList3.add(Integer.valueOf(i));
        if (!videoPublishEditModel.getEditorProModel().isPipUsed()) {
            LIZIZ = 0;
        } else {
            ArrayList arrayList4 = new ArrayList();
            Iterator it = new ArrayList(videoPublishEditModel.getEditorProModel().getPipResourcePaths()).iterator();
            while (it.hasNext()) {
                String it2 = (String) it.next();
                o.LJIIIIZZ(it2, "it");
                arrayList4.add(Integer.valueOf(C43134GwM.LIZIZ(it2, videoPublishEditModel.creativeModel.commonMobModel)));
            }
            LIZIZ = LIZIZ(arrayList4);
        }
        arrayList3.add(Integer.valueOf(LIZIZ));
        arrayList3.add(Integer.valueOf(LJFF(videoPublishEditModel)));
        arrayList3.add(Integer.valueOf(LIZ(videoPublishEditModel)));
        if (H7R.LJJJJI(videoPublishEditModel)) {
            LIZIZ2 = LIZLLL(videoPublishEditModel);
        } else if (videoPublishEditModel.isDuet()) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(Integer.valueOf(videoPublishEditModel.creativeModel.duetModel.duetVideoAIGCLabelType));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AIGCManager -> duet -> hasAIGC = ");
            LIZ2.append(LIZIZ(arrayList5));
            H78.LIZ(X1D.LIZIZ(LIZ2));
            LIZIZ2 = LIZIZ(arrayList5);
        } else if (videoPublishEditModel.isStitchMode()) {
            ArrayList arrayList6 = new ArrayList();
            StitchParams stitchParams = videoPublishEditModel.stitchParams;
            if (stitchParams != null) {
                i3 = stitchParams.getOriginVideoAIGCLabelType();
            } else {
                i3 = 0;
            }
            arrayList6.add(Integer.valueOf(i3));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AIGCManager -> stitch -> hasAIGC = ");
            LIZ3.append(LIZIZ(arrayList6));
            H78.LIZ(X1D.LIZIZ(LIZ3));
            LIZIZ2 = LIZIZ(arrayList6);
        } else {
            CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
            if (canvasVideoData != null && C79004UzY.LJJIII(canvasVideoData)) {
                ArrayList arrayList7 = new ArrayList();
                CanvasVideoData canvasVideoData2 = videoPublishEditModel.canvasVideoData;
                if (canvasVideoData2 != null) {
                    i2 = canvasVideoData2.getOriginVideoAIGCLabelType();
                } else {
                    i2 = 0;
                }
                arrayList7.add(Integer.valueOf(i2));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("AIGCManager -> forward2Story -> hasAIGC = ");
                LIZ4.append(LIZIZ(arrayList7));
                H78.LIZ(X1D.LIZIZ(LIZ4));
                LIZIZ2 = LIZIZ(arrayList7);
            } else if (H7R.LJJLI(videoPublishEditModel)) {
                ArrayList arrayList8 = new ArrayList();
                SimpleEffect simpleEffect = videoPublishEditModel.creativeModel.recordEffectModel.effectInfo;
                if (simpleEffect != null && (extra = simpleEffect.getExtra()) != null) {
                    if (extra.length() > 0 && new JSONObject(extra).optBoolean("is_aigc_content")) {
                        arrayList8.add(2);
                    } else {
                        arrayList8.add(0);
                    }
                }
                ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                    for (SingleImageData singleImageData : imageList) {
                        arrayList8.add(Integer.valueOf(C43134GwM.LIZ(singleImageData.getSrcImageInfo().getPath(), videoPublishEditModel.creativeModel.commonMobModel)));
                        singleImageData.setImageAIGCType(LIZIZ(arrayList8));
                    }
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("AIGCManager -> hasAIGCForSingleImageMode() = ");
                LIZ5.append(LIZIZ(arrayList8));
                H78.LIZ(X1D.LIZIZ(LIZ5));
                LIZIZ2 = LIZIZ(arrayList8);
            } else if (H7R.LJJJJL(videoPublishEditModel)) {
                LIZIZ2 = LIZJ(videoPublishEditModel);
            } else if (videoPublishEditModel.isPhotoMvMode) {
                ArrayList arrayList9 = new ArrayList();
                if (H7R.LJJIL(videoPublishEditModel)) {
                    CanvasVideoData canvasVideoData3 = videoPublishEditModel.canvasVideoData;
                    if (canvasVideoData3 != null && (sourceInfo = canvasVideoData3.getSourceInfo()) != null) {
                        Iterator<String> it3 = sourceInfo.iterator();
                        while (it3.hasNext()) {
                            arrayList9.add(Integer.valueOf(C43134GwM.LIZIZ(it3.next(), videoPublishEditModel.creativeModel.commonMobModel)));
                        }
                    }
                } else {
                    MvCreateVideoData mvCreateVideoData = videoPublishEditModel.mvCreateVideoData;
                    if (mvCreateVideoData != null && (arrayList2 = mvCreateVideoData.srcSelectMediaList) != null) {
                        Iterator<String> it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            String it5 = it4.next();
                            o.LJIIIIZZ(it5, "it");
                            arrayList9.add(Integer.valueOf(C43134GwM.LIZIZ(it5, videoPublishEditModel.creativeModel.commonMobModel)));
                        }
                    }
                }
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append("AIGCManager -> PhotoMV -> hasAIGC = ");
                LIZ6.append(LIZIZ(arrayList9));
                H78.LIZ(X1D.LIZIZ(LIZ6));
                LIZIZ2 = LIZIZ(arrayList9);
            } else if (videoPublishEditModel.isTemplateMv()) {
                ArrayList arrayList10 = new ArrayList();
                MvCreateVideoData mvCreateVideoData2 = videoPublishEditModel.mvCreateVideoData;
                if (mvCreateVideoData2 != null && (arrayList = mvCreateVideoData2.srcSelectMediaList) != null) {
                    Iterator<String> it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        String it7 = it6.next();
                        o.LJIIIIZZ(it7, "it");
                        arrayList10.add(Integer.valueOf(C43134GwM.LIZIZ(it7, videoPublishEditModel.creativeModel.commonMobModel)));
                    }
                }
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("AIGCManager -> TemplateMV -> srcSelectMediaList.size = ");
                LIZ7.append(videoPublishEditModel.mvCreateVideoData.srcSelectMediaList.size());
                H78.LIZJ(X1D.LIZIZ(LIZ7));
                StringBuilder LIZ8 = X1D.LIZ();
                LIZ8.append("AIGCManager -> TemplateMV -> hasAIGC = ");
                LIZ8.append(LIZIZ(arrayList10));
                H78.LIZ(X1D.LIZIZ(LIZ8));
                LIZIZ2 = LIZIZ(arrayList10);
            } else if (videoPublishEditModel.isUploadVideo()) {
                ArrayList arrayList11 = new ArrayList();
                Iterator it8 = new ArrayList(videoPublishEditModel.importInfoList).iterator();
                while (it8.hasNext()) {
                    String realImportPath = ((ImportVideoInfo) it8.next()).getRealImportPath();
                    if (realImportPath != null) {
                        arrayList11.add(Integer.valueOf(C43134GwM.LIZIZ(realImportPath, videoPublishEditModel.creativeModel.commonMobModel)));
                    }
                }
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("AIGCManager -> Upload -> hasAIGC = ");
                LIZ9.append(LIZIZ(arrayList11));
                H78.LIZ(X1D.LIZIZ(LIZ9));
                LIZIZ2 = LIZIZ(arrayList11);
            } else {
                ArrayList arrayList12 = new ArrayList();
                StringBuilder LIZ10 = X1D.LIZ();
                LIZ10.append("AIGCManager -> Record -> hasAIGC = ");
                LIZ10.append(LIZIZ(arrayList12));
                H78.LIZ(X1D.LIZIZ(LIZ10));
                LIZIZ2 = LIZIZ(arrayList12);
            }
        }
        arrayList3.add(Integer.valueOf(LIZIZ2));
        videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = LIZIZ(arrayList3);
        if (LIZIZ(arrayList3) > i) {
            videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.manualChangeSwitch = false;
        }
        if (LJFF(videoPublishEditModel) == 2) {
            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_prop");
        }
        if (LIZ(videoPublishEditModel) == 2) {
            videoPublishEditModel.creativeModel.commonMobModel.aigcCreationSource.add("tiktok_EFFCET");
        }
        LJ(currentTimeMillis, videoPublishEditModel);
    }

    public static final void LJ(long j, VideoPublishEditModel videoPublishEditModel) {
        Integer num;
        String str = videoPublishEditModel.mStickerID;
        if (str == null || str.length() == 0) {
            num = 0;
        } else {
            String str2 = videoPublishEditModel.mStickerID;
            if (str2 != null) {
                num = Integer.valueOf(s.LJLJJL(str2, new String[]{","}, 0, 6).size());
            } else {
                num = null;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJ(System.currentTimeMillis() - j, "read_duration");
        c188727au.LIZLLL(videoPublishEditModel.videoCount, "video_cnt");
        c188727au.LJFF(num, "record_effect_count");
        c188727au.LIZLLL(videoPublishEditModel.getEffectList().size(), "edit_effect_count");
        FMX.LJIIL("read_metadata", c188727au.LIZ);
    }

    public static final void LJII(VideoPublishEditModel model, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(model, "model");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C68582mc(interfaceC65784Pro, model, null), 3);
    }
}
