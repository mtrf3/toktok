package com.ss.android.ugc.aweme.shortvideo.model;

import X.C38354F3m;
import X.C60903NvH;
import X.C77413UZt;
import X.C78857UxB;
import X.C79004UzY;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class RecordScene {
    public UrlModel audioTrack;
    public String challengeStr;
    public ClientCherEffectParam cherEffectParam;
    public CommentVideoModel commentVideoModel;
    public CreativeInfo creativeInfo;
    public String duetAudioPath;
    public String duetVideoPath;
    public boolean enterRecordFromFeed;
    public ExtractFramesModel extractFramesModel;
    public int faceBeauty;
    public String filterIds;
    public String filterLabels;
    public String filterValues;
    public int hardEncode;
    public boolean isShoutout;
    public long maxDuration;
    public MobileEffectsModel mobileEffectsModel;
    public MobileEffectsModel2 mobileEffectsModel2;
    public String mp4Path;
    public int musicEnd;
    public AVMusic musicModel;
    public String musicPath;
    public int musicStart;
    public int recordBGMDelay;
    public boolean recordIsMuted;
    public int recordMode;
    public boolean recordOriginalSoundWithBGM;
    public SharedARModel sharedARModel;
    public int shootMode;
    public String shootWay;
    public int shootedShootMode;
    public StitchParams stitchParams;
    public Map<String, Object> videoRecordMetadata;
    public ArrayList<TimeSpeedModelExtension> videoSegments;
    public String fromItemId = "";
    public String followUpFirstItemId = "";
    public String followUpItemIdGroups = "";
    public LoudnessBalanceParam loudnessBalanceParam = new LoudnessBalanceParam();

    public AVChallenge getChallengeFromStr() {
        SimpleAVChallenge deserializeFromJson;
        if (TextUtils.isEmpty(this.challengeStr) || (deserializeFromJson = SimpleAVChallenge.deserializeFromJson(this.challengeStr)) == null) {
            return null;
        }
        return deserializeFromJson.parse2AVChallenge();
    }

    public String getCreationId() {
        CreativeInfo creativeInfo = this.creativeInfo;
        if (creativeInfo == null) {
            return "";
        }
        return creativeInfo.getCreationId();
    }

    public boolean isDuetMode() {
        if (!C38354F3m.LJ(this.duetVideoPath) || !C38354F3m.LJ(this.duetAudioPath)) {
            return true;
        }
        return false;
    }

    public boolean isSegmentsNotValid() {
        return C79004UzY.LJJIFFI(this.videoSegments);
    }

    public boolean isStitchMode() {
        if (this.stitchParams != null) {
            return true;
        }
        return false;
    }

    public static String challenge2str(AVChallenge aVChallenge) {
        if (aVChallenge == null) {
            return "";
        }
        return SimpleAVChallenge.serializeToStr(SimpleAVChallenge.fromAVChallenge(aVChallenge));
    }

    public static ArrayList<BeautyMetadata> getBeautyMetadatas(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<BeautyMetadata> arrayList2 = new ArrayList<>();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getBeautyMetadata());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static String getCameraIdsStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C79004UzY.LJJIFFI(arrayList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(next.getCameraId());
            LIZ.append(",");
            sb.append(X1D.LIZIZ(LIZ));
        }
        return sb.toString().substring(0, r2.length() - 1);
    }

    public static ArrayList<String> getCameraLensInfoList(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getCameraLensInfo());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static ClientCherEffectParam getCherEffectParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (ClientCherEffectParam) C60903NvH.LJIIJJI().LIZ().LJI(str, ClientCherEffectParam.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getFirstStickerMusicIds(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C79004UzY.LJJIFFI(arrayList)) {
            return null;
        }
        List<String> stickerMusicIds = ((TimeSpeedModelExtension) ListProtector.get(arrayList, 0)).getStickerMusicIds();
        if (C79004UzY.LJJIFFI(stickerMusicIds)) {
            return null;
        }
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), stickerMusicIds);
    }

    public static ArrayList<GreenScreenMaterial> getGreenScreenMaterials(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<GreenScreenMaterial> arrayList2 = new ArrayList<>();
        if (C77413UZt.LJIILL(arrayList)) {
            return arrayList2;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (GreenScreenMaterialKt.isGreenScreenClip(next)) {
                arrayList2.add(new GreenScreenMaterial(GreenScreenMaterialKt.getType(next).intValue(), GreenScreenMaterialKt.getStartTime(next).longValue(), GreenScreenMaterialKt.getEndTime(next).longValue(), GreenScreenMaterialKt.getResId(next), GreenScreenMaterialKt.getAuthorName(next), GreenScreenMaterialKt.getEffectId(next), GreenScreenMaterialKt.getLocalPath(next), GreenScreenMaterialKt.getMediasource(next)));
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static String getSpeedStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C79004UzY.LJJIFFI(arrayList)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (next.getSpeed() > 0.2d && next.getSpeed() < 0.4d) {
                sb.append("0.33,");
            } else if (next.getSpeed() > 0.4d && next.getSpeed() < 0.6d) {
                sb.append("0.5,");
            } else if ((0.6d < next.getSpeed() && next.getSpeed() < 1.5d) || next.getSpeed() == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                sb.append("1.0,");
            } else if (next.getSpeed() == 1.5d) {
                sb.append("6,");
            } else if (1.5d < next.getSpeed() && next.getSpeed() < 2.5d) {
                sb.append("2.0,");
            } else if (2.5d < next.getSpeed() && next.getSpeed() < 3.5d) {
                sb.append("3.0,");
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        return sb2.substring(0, sb2.length() - 1);
    }

    public static String getStickerIdsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().getStickerId());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static StickerInfo getStickerInfo(ArrayList<TimeSpeedModelExtension> arrayList) {
        String LJJIII;
        StickerInfo stickerInfo = new StickerInfo();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (!TextUtils.isEmpty(next.getPropRec())) {
                arrayList4.add(next.getPropRec());
            }
            StickerInfo stickerInfo2 = next.getStickerInfo();
            String str = "";
            if (stickerInfo2 == null) {
                LJJIII = "";
            } else {
                LJJIII = C78857UxB.LJJIII(stickerInfo2.getPropSource(), stickerInfo2.getNeedFilter());
            }
            if (!LJJIII.isEmpty()) {
                arrayList2.add(LJJIII);
            }
            if (!next.getGradeKey().isEmpty()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(next.getStickerId());
                LIZ.append(":");
                LIZ.append(next.getGradeKey());
                arrayList3.add(X1D.LIZIZ(LIZ));
            }
            if (!TextUtils.isEmpty(next.getTabOrder())) {
                arrayList5.add(next.getTabOrder());
            }
            if (next.getStickerId() != null) {
                if (!TextUtils.isEmpty(next.getImprPosition())) {
                    str = next.getImprPosition();
                }
                arrayList6.add(str);
            }
            if (!stickerInfo.isMusicBeatSticker() && next.getStickerInfo() != null && next.getStickerInfo().isMusicBeatSticker()) {
                stickerInfo.setMusicBeatSticker(true);
            }
            if (!TextUtils.isEmpty(next.getTabIds())) {
                arrayList7.add(next.getTabIds());
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        arrayList3.removeAll(Collections.singleton(null));
        stickerInfo.setPropSource(join(arrayList2, ","));
        stickerInfo.setGradeKey(join(arrayList3, ","));
        stickerInfo.setRecId(join(arrayList4, ","));
        stickerInfo.setTabOrder(join(arrayList5, ","));
        stickerInfo.setImprPosition(join(arrayList6, ","));
        stickerInfo.setPropTabId(join(arrayList7, ","));
        return stickerInfo;
    }

    public static boolean isChangeSpeed(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C79004UzY.LJJIFFI(arrayList)) {
            return false;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            if (0.6d > next.getSpeed() || next.getSpeed() > 1.5d) {
                return true;
            }
        }
        return false;
    }

    public static CommentVideoModel string2CommentVideoModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (CommentVideoModel) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), str, CommentVideoModel.class);
    }

    public static SharedARModel string2SharedARModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (SharedARModel) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), str, SharedARModel.class);
    }

    public static StitchParams string2StitchParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (StitchParams) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), str, StitchParams.class);
    }

    public RecordScene audioTrack(UrlModel urlModel) {
        this.audioTrack = urlModel;
        return this;
    }

    public RecordScene creativeInfo(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
        return this;
    }

    public RecordScene faceBeauty(int i) {
        this.faceBeauty = i;
        return this;
    }

    public RecordScene hardEncode(int i) {
        this.hardEncode = i;
        return this;
    }

    public RecordScene maxDuration(long j) {
        this.maxDuration = j;
        return this;
    }

    public RecordScene mp4Path(String str) {
        this.mp4Path = str;
        return this;
    }

    public RecordScene musicEnd(int i) {
        this.musicEnd = i;
        return this;
    }

    public RecordScene musicModel(AVMusic aVMusic) {
        this.musicModel = aVMusic;
        return this;
    }

    public RecordScene musicPath(String str) {
        this.musicPath = str;
        return this;
    }

    public RecordScene musicStart(int i) {
        this.musicStart = i;
        return this;
    }

    public RecordScene recordMode(int i) {
        this.recordMode = i;
        return this;
    }

    public RecordScene recordOriginalSoundWithBGM(boolean z) {
        this.recordOriginalSoundWithBGM = z;
        return this;
    }

    public RecordScene stitchParams(StitchParams stitchParams) {
        this.stitchParams = stitchParams;
        return this;
    }

    public RecordScene videoSegment(String str) {
        this.videoSegments = CameraComponentModel.LJIIJJI(str);
        return this;
    }

    public static Boolean isDefaultProp(ArrayList<TimeSpeedModelExtension> arrayList, String str) {
        if (str == null || str.isEmpty() || arrayList == null || arrayList.isEmpty()) {
            return Boolean.FALSE;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().getStickerId())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public static String join(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
