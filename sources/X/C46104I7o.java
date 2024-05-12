package X;

import android.content.Context;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.util.Base64;
import android.view.animation.Interpolator;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.gift.model.CpcTime;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveGurdPatternsSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAnimationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AdvancedFeatureInfo;
import com.ss.android.ugc.aweme.profile.model.AudienceSubInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.SubscriptionInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MusicSyncData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.sticker.model.LibraryVideo;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusinessHelper;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.I7o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46104I7o implements InterfaceC54848Lfo, ORL, InterfaceC40178Fpm, InterfaceC46111I7v {
    public static final C46104I7o LJLIL = new C46104I7o();

    @Override // X.ORL
    public Object[] LJFF(Object obj, ArrayList arrayList, File file, ArrayList arrayList2) {
        return (Object[]) C40654FxS.LIZIZ(obj, "makeDexElements", Object[].class, ArrayList.class, arrayList, File.class, file, ArrayList.class, arrayList2);
    }

    public static final CpcPromptResponse LJJ() {
        try {
            CpcPromptResponse LIZJ = InterfaceC30442Bx8.J0.LIZJ();
            if (LIZJ == null) {
                return new CpcPromptResponse(null, null, 0L, 0L, 0L, false, 63, null);
            }
            return LIZJ;
        } catch (IllegalArgumentException unused) {
            return new CpcPromptResponse(null, null, 0L, 0L, 0L, false, 63, null);
        }
    }

    public static final CpcTime LJJI() {
        try {
            String LIZJ = InterfaceC30442Bx8.I0.LIZJ();
            if (LIZJ != null && C29306Beo.LJIJJLI(LIZJ)) {
                new CpcTime(0L, 0L, 0L, 0L, 0L, 31, null);
                CpcTime cpcTime = (CpcTime) LJIJJ(CpcTime.class, LIZJ);
                if (cpcTime != null) {
                    return cpcTime;
                }
            }
            return new CpcTime(0L, 0L, 0L, 0L, 0L, 31, null);
        } catch (IllegalArgumentException unused) {
            return new CpcTime(0L, 0L, 0L, 0L, 0L, 31, null);
        }
    }

    public static List LJJIIJ() {
        ArrayList arrayList = new ArrayList();
        for (String str : LiveGurdPatternsSetting.INSTANCE.getValue()) {
            arrayList.add(PatternProtector.compile(str));
        }
        return arrayList;
    }

    @Override // X.InterfaceC46111I7v
    public void LIZ() {
        TTLSPreInitBusinessHelper.preInitLiveCore(RunnableC30505By9.LJLIL);
    }

    public static final IRetrofitFactory LJJII() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "get().getService(IRetrofitFactory::class.java)");
        return LIZLLL;
    }

    public static final boolean LJJIJIIJI() {
        return C29306Beo.LJIJJLI(LJJ().prompt);
    }

    public static boolean LJJIJIIJIL() {
        if (!C60903NvH.LJIIJJI().LJJIL().getWatermarkHardcode(false) || C19N.LJ("forbid_local_watermark", false) || C40983G6p.LIZ == 1) {
            return false;
        }
        if (C40983G6p.LIZ() && !C40944G5c.LIZ.getBoolean("has_water_mark", false)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJ() {
        long j;
        CpcTime LJJI = LJJI();
        Long valueOf = Long.valueOf(LJJ().timeIntervalForNextRequest * 1000);
        if (valueOf.longValue() > 0) {
            j = valueOf.longValue();
        } else {
            j = 86400000;
        }
        boolean LJJIJIIJI = LJJIJIIJI();
        if (LJJI.apiCallLastTime == 0 || System.currentTimeMillis() - LJJI.apiCallLastTime > j || !LJJIJIIJI) {
            InterfaceC30442Bx8.I0.LIZ(LJJJJZI(CpcTime.L(LJJI, 0L, System.currentTimeMillis(), 15)));
            return true;
        }
        return false;
    }

    public static final boolean LJJJJI() {
        long j;
        CpcTime LJJI = LJJI();
        Long valueOf = Long.valueOf(LJJ().timeIntervalForNextPrompt * 1000);
        if (valueOf.longValue() > 0) {
            j = valueOf.longValue();
        } else {
            j = 86400000;
        }
        boolean LJJIJIIJI = LJJIJIIJI();
        if (LJJI.lastShowingTime == 0 || System.currentTimeMillis() - LJJI.lastShowingTime > j || !LJJIJIIJI) {
            InterfaceC30442Bx8.I0.LIZ(LJJJJZI(CpcTime.L(LJJI, System.currentTimeMillis(), 0L, 30)));
            return true;
        }
        return false;
    }

    public static final MediaModel LJII(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int[] iArr = new int[10];
        if (C62819Ol5.LJIJI(str, iArr) != 0) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1L);
        mediaModel.fileLocalUriPath = str;
        mediaModel.width = iArr[0];
        mediaModel.height = iArr[1];
        mediaModel.duration = iArr[3];
        return mediaModel;
    }

    public static final MultiEditVideoRecordData LJIIIZ(List list) {
        int i;
        long j;
        long duration;
        float f;
        long duration2;
        String audioPath;
        if (list == null) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = true;
        multiEditVideoRecordData.concatAudio = "";
        multiEditVideoRecordData.concatVideo = "";
        multiEditVideoRecordData.curRecordingDir = "";
        multiEditVideoRecordData.startTime = 0L;
        multiEditVideoRecordData.segmentDataList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            EditVideoSegment videoSegment = (EditVideoSegment) it.next();
            List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
            o.LJIIIZ(videoSegment, "videoSegment");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
            multiEditVideoSegmentRecordData.videoPath = videoSegment.getVideoPath();
            if (!o.LJ(videoSegment.getVideoPath(), videoSegment.getAudioPath()) && (audioPath = videoSegment.getAudioPath()) != null && audioPath.length() != 0) {
                multiEditVideoSegmentRecordData.audioPath = videoSegment.getAudioPath();
            }
            VideoCutInfo videoCutInfo = videoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                j = videoCutInfo.getStart();
            } else {
                j = 0;
            }
            multiEditVideoSegmentRecordData.setStartTime(j);
            VideoCutInfo videoCutInfo2 = videoSegment.getVideoCutInfo();
            if (videoCutInfo2 != null) {
                duration = videoCutInfo2.getEnd();
            } else {
                duration = videoSegment.getVideoFileInfo().getDuration();
            }
            multiEditVideoSegmentRecordData.setEndTime(duration);
            if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                multiEditVideoSegmentRecordData.draftVideoPath = videoSegment.getVideoPath();
            }
            if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.fastImportOriginVideoPath)) {
                multiEditVideoSegmentRecordData.fastImportOriginVideoPath = videoSegment.getVideoPath();
            }
            multiEditVideoSegmentRecordData.videoLength = videoSegment.getVideoFileInfo().getDuration() * 1000;
            VideoCutInfo videoCutInfo3 = videoSegment.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                f = videoCutInfo3.getSpeed();
            } else {
                f = 1.0f;
            }
            multiEditVideoSegmentRecordData.setVideoSpeed(f);
            VideoCutInfo videoCutInfo4 = videoSegment.getVideoCutInfo();
            if (videoCutInfo4 != null) {
                i = videoCutInfo4.getRotate();
            }
            multiEditVideoSegmentRecordData.rotate = i;
            multiEditVideoSegmentRecordData.width = videoSegment.getVideoFileInfo().getWidth();
            multiEditVideoSegmentRecordData.height = videoSegment.getVideoFileInfo().getHeight();
            list2.add(multiEditVideoSegmentRecordData);
            long j2 = multiEditVideoRecordData.endTime;
            VideoCutInfo videoCutInfo5 = videoSegment.getVideoCutInfo();
            if (videoCutInfo5 != null) {
                duration2 = videoCutInfo5.getEnd() - videoCutInfo5.getStart();
            } else {
                duration2 = videoSegment.getVideoFileInfo().getDuration();
            }
            multiEditVideoRecordData.endTime = j2 + duration2;
        }
        List<MultiEditVideoSegmentRecordData> list3 = multiEditVideoRecordData.segmentDataList;
        if (list3 != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    multiEditVideoSegmentRecordData2.videoKey = i;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return multiEditVideoRecordData;
    }

    public static final VERecordData.VERecordSegmentData LJIIJ(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        o.LJIIIZ(multiEditVideoSegmentRecordData, "<this>");
        long j = 1000;
        VERecordData.VERecordSegmentData vERecordSegmentData = new VERecordData.VERecordSegmentData(LJIJJLI(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.draftVideoPath), multiEditVideoSegmentRecordData.videoLength, LJIJJLI(multiEditVideoSegmentRecordData.audioPath, multiEditVideoSegmentRecordData.draftAudioPath), multiEditVideoSegmentRecordData.audioLength, multiEditVideoSegmentRecordData.audioSpeed, multiEditVideoSegmentRecordData.getStartTime() * j, multiEditVideoSegmentRecordData.getEndTime() * j, multiEditVideoSegmentRecordData.enable);
        vERecordSegmentData.mRotate = C44513HdV.LIZJ(multiEditVideoSegmentRecordData.rotate);
        vERecordSegmentData.mVideoSpeed = multiEditVideoSegmentRecordData.getVideoSpeed();
        return vERecordSegmentData;
    }

    public static final VERecordData LJIIJJI(MultiEditVideoRecordData multiEditVideoRecordData) {
        o.LJIIIZ(multiEditVideoRecordData, "<this>");
        ArrayList arrayList = new ArrayList();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        ArrayList LIZIZ = s1.LIZIZ(list, "this.segmentDataList");
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                LIZIZ.add(multiEditVideoSegmentRecordData);
            }
        }
        Iterator it = LIZIZ.iterator();
        while (it.hasNext()) {
            MultiEditVideoSegmentRecordData segmentRecordData = (MultiEditVideoSegmentRecordData) it.next();
            o.LJIIIIZZ(segmentRecordData, "segmentRecordData");
            arrayList.add(LJIIJ(segmentRecordData));
        }
        VERecordData vERecordData = new VERecordData(arrayList, multiEditVideoRecordData.useMusic);
        vERecordData.concatVideo = multiEditVideoRecordData.concatVideo;
        vERecordData.concatAudio = multiEditVideoRecordData.concatAudio;
        return vERecordData;
    }

    public static final VETimelineParams LJIIL(MultiEditVideoRecordData multiEditVideoRecordData) {
        int size = multiEditVideoRecordData.segmentDataList.size();
        String[] strArr = new String[size];
        double[] dArr = new double[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        boolean[] zArr = new boolean[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zArr[i2] = true;
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        List<MultiEditVideoSegmentRecordData> segmentDataList = multiEditVideoRecordData.segmentDataList;
        o.LJIIIIZZ(segmentDataList, "segmentDataList");
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : segmentDataList) {
            int i3 = i + 1;
            if (i >= 0) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                String str = multiEditVideoSegmentRecordData2.videoPath;
                str.toString();
                strArr[i] = str;
                dArr[i] = multiEditVideoSegmentRecordData2.getVideoSpeed();
                rotate_degreeArr[i] = C44513HdV.LIZJ(multiEditVideoSegmentRecordData2.rotate);
                zArr[i] = multiEditVideoSegmentRecordData2.enable;
                iArr[i] = (int) multiEditVideoSegmentRecordData2.getStartTime();
                iArr2[i] = (int) multiEditVideoSegmentRecordData2.getEndTime();
                i = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        VETimelineParams vETimelineParams = new VETimelineParams(strArr);
        vETimelineParams.speed = dArr;
        vETimelineParams.rotate = rotate_degreeArr;
        vETimelineParams.enable = zArr;
        vETimelineParams.vTrimIn = iArr;
        vETimelineParams.vTrimOut = iArr2;
        return vETimelineParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List LJIILIIL(MultiEditVideoRecordData multiEditVideoRecordData) {
        long originStartTime;
        long originEndTime;
        boolean z;
        boolean z2;
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        int i = 0;
        if (list == null || list.isEmpty()) {
            return C61878OQg.INSTANCE;
        }
        List<MultiEditVideoSegmentRecordData> segmentDataList = multiEditVideoRecordData.segmentDataList;
        o.LJIIIIZZ(segmentDataList, "segmentDataList");
        ArrayList arrayList = new ArrayList(C32I.LJJL(segmentDataList, 10));
        for (MultiEditVideoSegmentRecordData it : segmentDataList) {
            o.LJIIIIZZ(it, "it");
            long j = 1000;
            VideoSegment videoSegment = new VideoSegment(it.videoPath, it.width, it.height, (int) (it.videoLength / j));
            videoSegment.LJIILIIL(it.getVideoSpeed());
            videoSegment.rotate = it.rotate;
            MultiEditTrimState multiEditTrimState = it.multiEditTrimState;
            if (multiEditTrimState != null) {
                originStartTime = multiEditTrimState.getStartTime();
            } else {
                originStartTime = it.getOriginStartTime();
            }
            if (videoSegment.LJIIJ()) {
                videoSegment.stickPointVideoSegment.setVideoStart(originStartTime);
            } else {
                videoSegment.start = originStartTime;
            }
            MultiEditTrimState multiEditTrimState2 = it.multiEditTrimState;
            if (multiEditTrimState2 != null) {
                originEndTime = multiEditTrimState2.getEndTime();
            } else {
                originEndTime = it.getOriginEndTime();
            }
            videoSegment.LJIIJJI(originEndTime);
            MultiEditTrimState multiEditTrimState3 = it.multiEditTrimState;
            if (multiEditTrimState3 != null) {
                z = multiEditTrimState3.getEnable();
            } else {
                z = it.enable;
            }
            videoSegment.isDeleted = !z;
            int i2 = it.videoKey;
            videoSegment.videoIndex = i2;
            MusicSyncData musicSyncData = it.musicSyncData;
            if (musicSyncData != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoSegment.isStickPointMode = z2;
            if (musicSyncData != null) {
                videoSegment.stickPointVideoSegment = new C5UB(i2, musicSyncData.getVideoStart(), musicSyncData.getVideoEnd() - musicSyncData.getVideoStart(), it.videoLength / j);
            }
            LibraryMaterialInfoSv libraryMaterialInfoSv = it.libraryMaterialInfo;
            if (libraryMaterialInfoSv != null) {
                String splitAudioPath = libraryMaterialInfoSv.getSplitAudioPath();
                String splitVideoPath = libraryMaterialInfoSv.getSplitVideoPath();
                videoSegment.libraryVideoSegment = new LibraryVideo(libraryMaterialInfoSv.getId(), splitVideoPath, splitAudioPath, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, libraryMaterialInfoSv.getRawFilePath(), libraryMaterialInfoSv.getMaterialProvider(), libraryMaterialInfoSv.getMaterialType(), 56, 0 == true ? 1 : 0);
            }
            arrayList.add(videoSegment);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i + 1;
            if (i >= 0) {
                ((VideoSegment) next).videoIndex = i;
                i = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    public static final InterfaceC789838c LJIILL(String str) {
        o.LJIIIZ(str, "<this>");
        InterfaceC789838c create = LJJII().create(str);
        o.LJI(create);
        return create;
    }

    public static final InterfaceC790538j LJIILLIIL(String str) {
        o.LJIIIZ(str, "<this>");
        C65087PgZ LIZ = LJJII().LIZ(str);
        o.LJI(LIZ);
        return LIZ;
    }

    public static final C8T5 LJIL(String str) {
        if (str == null) {
            return null;
        }
        if (o.LJ(str, EnumC46105I7p.ANOLE_ALL_INTERACT.getInteractName())) {
            return C8T5.ALL;
        }
        if (o.LJ(str, EnumC46105I7p.ANOLE_LEFT_INTERACT.getInteractName())) {
            return C8T5.LEFT_AREA;
        }
        if (!o.LJ(str, EnumC46105I7p.ANOLE_RIGHT_INTERACT.getInteractName())) {
            return null;
        }
        return C8T5.RIGHT_AREA;
    }

    public static final int LJJIII(RecUser recUser) {
        C57377MfV c57377MfV;
        o.LJIIIZ(recUser, "<this>");
        AbstractC57378MfW from = recUser.getFrom();
        if ((from instanceof C57377MfV) && (c57377MfV = (C57377MfV) from) != null) {
            return c57377MfV.getIterateCnt();
        }
        return 0;
    }

    public static final String LJJIIJZLJL(User user) {
        o.LJIIIZ(user, "<this>");
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr == null) {
            return null;
        }
        for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
            if (advancedFeatureInfo.getFeatureId() == C9JT.SHOP.getId()) {
                return advancedFeatureInfo.getShopSchema();
            }
        }
        return null;
    }

    public static final String LJJIIZ(User user) {
        o.LJIIIZ(user, "<this>");
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr == null) {
            return null;
        }
        for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
            if (advancedFeatureInfo.getFeatureId() == C9JT.SHOWCASE.getId()) {
                return advancedFeatureInfo.getShopSchema();
            }
        }
        return null;
    }

    public static final String LJJIIZI(User user) {
        AudienceSubInfo audienceSubInfo;
        Integer valueOf;
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr != null) {
            int length = advancedFeatureInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AdvancedFeatureInfo advancedFeatureInfo = advancedFeatureInfoArr[i];
                if (advancedFeatureInfo.getFeatureId() == C9JT.SUBSCRIBE.getId()) {
                    SubscriptionInfo subInfo = advancedFeatureInfo.getSubInfo();
                    if (subInfo != null && (audienceSubInfo = subInfo.getAudienceSubInfo()) != null && (valueOf = Integer.valueOf(audienceSubInfo.getSubStatus())) != null && valueOf.intValue() != 0 && valueOf.intValue() != 3) {
                        if (valueOf.intValue() == 1) {
                            return "subscribed_not_expired";
                        }
                        if (valueOf.intValue() == 2) {
                            return "subscribed_expired_grace_period";
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        return "not_subscribed";
    }

    public static final List LJJIJ(MultiEditVideoRecordData multiEditVideoRecordData) {
        o.LJIIIZ(multiEditVideoRecordData, "<this>");
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        ArrayList LIZIZ = s1.LIZIZ(list, "segmentDataList");
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                LIZIZ.add(multiEditVideoSegmentRecordData);
            }
        }
        return LIZIZ;
    }

    public static final boolean LJJIJIL(RecUser recUser) {
        boolean z;
        C57377MfV c57377MfV;
        o.LJIIIZ(recUser, "<this>");
        MatchedFriendStruct matchedFriendStruct = recUser.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            z = o.LJ(matchedFriendStruct.isNewMaF(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (!z) {
            AbstractC57378MfW from = recUser.getFrom();
            if (!(from instanceof C57377MfV) || (c57377MfV = (C57377MfV) from) == null || !c57377MfV.getFromNewMaf()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJIJL(RoomSticker roomSticker) {
        o.LJIIIZ(roomSticker, "<this>");
        int i = roomSticker.reviewStatus;
        if (i == 2 || i == 5 || i == 0) {
            return true;
        }
        return false;
    }

    public static final void LJJIJLIJ(long j) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_highlight_click");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJJIIJZLJL();
    }

    public static final boolean LJJJJIZL(User user) {
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr != null && advancedFeatureInfoArr.length != 0) {
            for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
                if (advancedFeatureInfo.getFeatureId() == C9JT.COLLECTIONS.getId()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJJJJ(User user) {
        Integer displayQnaOnProfile;
        if (!QnaService.LIZ().enablePublicQna() || (displayQnaOnProfile = user.getDisplayQnaOnProfile()) == null || displayQnaOnProfile.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJLI(User user) {
        AdvancedFeatureInfo[] advancedFeatureInfoArr = user.advancedFeatureInfo;
        if (advancedFeatureInfoArr == null) {
            return false;
        }
        for (AdvancedFeatureInfo advancedFeatureInfo : advancedFeatureInfoArr) {
            if (advancedFeatureInfo.getFeatureId() == C9JT.SUBSCRIBE.getId()) {
                return true;
            }
        }
        return false;
    }

    public static final void LJJJJLL(CpcPromptResponse cpcData) {
        o.LJIIIZ(cpcData, "cpcData");
        if (C29306Beo.LJIJJLI(cpcData.prompt)) {
            InterfaceC30442Bx8.J0.LIZ(cpcData);
        }
    }

    public static final String LJJJJZ(Object obj) {
        o.LJIIIZ(obj, "<this>");
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, obj);
        o.LJIIIIZZ(json, "get().toJson(this)");
        return json;
    }

    public static final String LJJJJZI(Object obj) {
        o.LJIIIZ(obj, "<this>");
        byte[] bytes = LJJJJZ(obj).getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64.encodeToString(bytes, 2);
    }

    public static final List LJJJLIIL(ExtraMentionUserModel extraMentionUserModel) {
        o.LJIIIZ(extraMentionUserModel, "<this>");
        List<OSZ<String, String>> userList = extraMentionUserModel.getUserList();
        boolean z = !extraMentionUserModel.getUserList().isEmpty();
        ArrayList arrayList = null;
        if (z && userList != null) {
            arrayList = new ArrayList(C32I.LJJL(userList, 10));
            for (OSZ<String, String> osz : userList) {
                User user = new User();
                user.setUid(osz.getFirst());
                user.setNickname(osz.getSecond());
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC40178Fpm
    public InterfaceC60614Nqc LIZIZ(C60737Nsb hybridContext) {
        o.LJIIJ(hybridContext, "hybridContext");
        C61483OBb.LIZJ.getClass();
        InterfaceC39933Flp interfaceC39933Flp = (InterfaceC39933Flp) C61484OBc.LIZIZ().LIZIZ(InterfaceC39933Flp.class, hybridContext.bidFrom);
        if (interfaceC39933Flp != null) {
            return interfaceC39933Flp.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC54848Lfo
    public void LJ(JSONObject jSONObject) {
        AppLogNewUtils.onEventV3("ug_sdk_action_check", jSONObject);
    }

    public static final MultiEditVideoRecordData LJIIIIZZ(VERecordData vERecordData, String dir) {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData;
        int i;
        o.LJIIIZ(dir, "dir");
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = vERecordData.isUseMusic();
        multiEditVideoRecordData.concatAudio = vERecordData.concatAudio;
        multiEditVideoRecordData.concatVideo = vERecordData.concatVideo;
        multiEditVideoRecordData.startTime = 0L;
        if (vERecordData.getSegmentData() != null && !vERecordData.getSegmentData().isEmpty()) {
            multiEditVideoRecordData.segmentDataList = new ArrayList(vERecordData.getSegmentData().size());
            for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.getSegmentData()) {
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                if (vERecordSegmentData == null) {
                    multiEditVideoSegmentRecordData = null;
                } else {
                    multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                    multiEditVideoSegmentRecordData.videoPath = vERecordSegmentData.mVideo;
                    multiEditVideoSegmentRecordData.audioPath = vERecordSegmentData.mAudio;
                    long j = 1000;
                    multiEditVideoSegmentRecordData.setStartTime(vERecordSegmentData.mTrimIn / j);
                    multiEditVideoSegmentRecordData.setEndTime(vERecordSegmentData.mTrimOut / j);
                    if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                        multiEditVideoSegmentRecordData.draftVideoPath = vERecordSegmentData.mVideo;
                    }
                    if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
                        multiEditVideoSegmentRecordData.draftAudioPath = vERecordSegmentData.mAudio;
                    }
                    multiEditVideoSegmentRecordData.videoLength = vERecordSegmentData.mVideoLength;
                    multiEditVideoSegmentRecordData.audioLength = vERecordSegmentData.mAudioLength;
                    multiEditVideoSegmentRecordData.setVideoSpeed(vERecordSegmentData.mVideoSpeed);
                    multiEditVideoSegmentRecordData.audioSpeed = vERecordSegmentData.mSpeed;
                    ROTATE_DEGREE rotate_degree = vERecordSegmentData.mRotate;
                    if (rotate_degree != null) {
                        int i2 = C44515HdX.LIZ[rotate_degree.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    i = 270;
                                }
                            } else {
                                i = 180;
                            }
                        } else {
                            i = 90;
                        }
                        multiEditVideoSegmentRecordData.rotate = i;
                    }
                    i = 0;
                    multiEditVideoSegmentRecordData.rotate = i;
                }
                list.add(multiEditVideoSegmentRecordData);
                multiEditVideoRecordData.endTime = (vERecordSegmentData.mVideoLength / 1000) + multiEditVideoRecordData.endTime;
            }
        }
        multiEditVideoRecordData.curRecordingDir = dir;
        return multiEditVideoRecordData;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.mediachoose.helper.MediaModel LJIILJJIL(com.ss.ugc.effectplatform.model.ProviderEffect r6, X.C45495HtL r7) {
        /*
            r3 = 0
            if (r6 != 0) goto L4
            return r3
        L4:
            com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r2 = new com.ss.android.ugc.aweme.mediachoose.helper.MediaModel
            java.lang.String r0 = r6.getId()
            r2.<init>(r0)
            java.lang.Integer r5 = r6.getLibrary_material_type()
            r4 = 1
            if (r5 != 0) goto Lb8
        L14:
            java.lang.Integer r0 = r6.getLibrary_material_type()
            if (r0 == 0) goto Lb5
            int r0 = r0.intValue()
        L1e:
            r2.type = r0
            java.lang.String r0 = r6.getPath()
            r2.fileLocalUriPath = r0
            java.lang.String r0 = r6.getHeight()
            if (r0 == 0) goto Lb2
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
        L30:
            r2.height = r0
            java.lang.String r0 = r6.getWidth()
            if (r0 == 0) goto Lb0
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
        L3c:
            r2.width = r0
            java.lang.String r0 = r6.getTitle()
            r2.fileName = r0
            java.lang.Integer r0 = r6.getLibrary_material_type()
            if (r0 == 0) goto La3
            java.lang.Integer r0 = r6.getLibrary_material_type()
            if (r0 != 0) goto L9d
        L50:
            java.lang.String r0 = r6.getPreview_webp()
        L54:
            r2.thumbnail = r0
            if (r7 == 0) goto L64
            java.lang.String r0 = r6.getPath()
            if (r0 == 0) goto L64
            int r0 = r0.length()
            if (r0 != 0) goto L8a
        L64:
            r0 = 10
        L66:
            r2.duration = r0
            com.ss.ugc.effectplatform.model.ProviderEffect$AuthorBean r0 = r6.getAuthor()
            if (r0 == 0) goto L72
            java.lang.String r3 = r0.getUsername()
        L72:
            r2.userName = r3
            r2.libraryState = r7
            java.lang.String r1 = r6.getMedia_source()
            java.lang.String r0 = "2"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L87
            java.lang.String r0 = "toptiktok"
        L84:
            r2.mediaSource = r0
            return r2
        L87:
            java.lang.String r0 = "giphy"
            goto L84
        L8a:
            java.lang.String r0 = r6.getPath()
            if (r0 != 0) goto L93
            java.lang.String r0 = ""
        L93:
            X.5yG r0 = X.C152235yF.LIZ(r0)
            if (r0 == 0) goto L64
            int r0 = r0.LIZLLL
            long r0 = (long) r0
            goto L66
        L9d:
            int r0 = r0.intValue()
            if (r0 != 0) goto L50
        La3:
            com.ss.ugc.effectplatform.model.ProviderEffect$StickerBean r0 = r6.getSticker_info()
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.getUrl()
            goto L54
        Lae:
            r0 = r3
            goto L54
        Lb0:
            r0 = 0
            goto L3c
        Lb2:
            r0 = 0
            goto L30
        Lb5:
            r0 = 0
            goto L1e
        Lb8:
            int r1 = r5.intValue()
            r0 = 3
            if (r1 != r0) goto Lc2
            r0 = 1
            goto L1e
        Lc2:
            int r0 = r5.intValue()
            if (r0 != r4) goto Lcb
            r0 = 4
            goto L1e
        Lcb:
            int r1 = r5.intValue()
            r0 = 2
            if (r1 != r0) goto L14
            r0 = 2
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46104I7o.LJIILJJIL(com.ss.ugc.effectplatform.model.ProviderEffect, X.HtL):com.ss.android.ugc.aweme.mediachoose.helper.MediaModel");
    }

    public static final Object LJIIZILJ(String str, Class cls) {
        Object obj;
        o.LJIIIZ(str, "<this>");
        InterfaceC789838c create = LJJII().create(str);
        if (create != null) {
            obj = create.create(cls);
        } else {
            obj = null;
        }
        o.LJI(obj);
        return obj;
    }

    public static final Object LJIJ(String baseUrl, C65776Prg c65776Prg) {
        Object obj;
        o.LJIIIZ(baseUrl, "baseUrl");
        InterfaceC789838c create = LJJII().create(baseUrl);
        if (create != null) {
            obj = create.create(C39557Ffl.LIZ(c65776Prg));
        } else {
            obj = null;
        }
        o.LJI(obj);
        return obj;
    }

    public static final Object LJIJJ(Class cls, String str) {
        try {
            byte[] decode = Base64.decode(str, 2);
            o.LJIIIIZZ(decode, "decode(str, NO_WRAP)");
            try {
                return C09650Zl.LIZIZ.LJI(new String(decode, PVC.LIZ), cls);
            } catch (Exception e) {
                C0NB.LJII(e);
                return null;
            }
        } catch (IllegalArgumentException e2) {
            C0NB.LJII(e2);
            return null;
        }
    }

    public static final String LJIJJLI(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getCompleteFilePath -> record path:");
        LIZ.append(str);
        LIZ.append(", draft path:");
        LIZ.append(str2);
        H78.LIZ(X1D.LIZIZ(LIZ));
        if (C5RS.LIZ() && o.LJ(str, str2)) {
            return str;
        }
        if (!C44687HgJ.LIZIZ(str2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getCompleteFilePath -> draft video path:");
            LIZ2.append(str2);
            H78.LIZJ(X1D.LIZIZ(LIZ2));
            return str;
        }
        long LIZ3 = C78496UrM.LIZ(str2);
        long LIZ4 = C78496UrM.LIZ(str);
        StringBuilder LIZJ = V10.LIZJ("record length:", LIZ4, ", draft length");
        LIZJ.append(LIZ3);
        H78.LIZ(X1D.LIZIZ(LIZJ));
        if (LIZ4 < LIZ3) {
            return str2;
        }
        return str;
    }

    public static final String LJJIFFI(long j, Context context) {
        if (j < 0) {
            return "";
        }
        if (j == 0) {
            return "00:00:00";
        }
        if (j >= 86400000) {
            int i = (int) (((float) (j / 86400000)) * 1.0f);
            String quantityString = context.getResources().getQuantityString(R.plurals.e2, i, Integer.valueOf(i));
            o.LJIIIIZZ(quantityString, "{\n            val day = …y\n            )\n        }");
            return quantityString;
        }
        float f = ((float) j) - ((3600000 * r3) * 1.0f);
        StringBuilder LIZ = X1D.LIZ();
        String LLLZ = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (((float) (j / 3600000)) * 1.0f))}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        LIZ.append(LLLZ);
        LIZ.append(':');
        String LLLZ2 = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f / 60000))}, 1));
        o.LJIIIIZZ(LLLZ2, "format(format, *args)");
        LIZ.append(LLLZ2);
        LIZ.append(':');
        String LLLZ3 = C16880lQ.LLLZ("%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((f - ((60000 * r8) * 1.0f)) / 1000))}, 1));
        o.LJIIIIZZ(LLLZ3, "format(format, *args)");
        LIZ.append(LLLZ3);
        return X1D.LIZIZ(LIZ);
    }

    public static final void LJJIZ(long j, String str) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_highlight_save_click");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        C06490Nh.LIZLLL(LIZ, "screen_share", "live_type", str, "item_id");
    }

    public static final void LJJJ(Matrix matrix, float[] setFrom) {
        o.LJIIIZ(setFrom, "$this$setFrom");
        o.LJIIIZ(matrix, "matrix");
        matrix.getValues(setFrom);
        float f = setFrom[0];
        float f2 = setFrom[1];
        float f3 = setFrom[2];
        float f4 = setFrom[3];
        float f5 = setFrom[4];
        float f6 = setFrom[5];
        float f7 = setFrom[6];
        float f8 = setFrom[7];
        float f9 = setFrom[8];
        setFrom[0] = f;
        setFrom[1] = f4;
        setFrom[2] = 0.0f;
        setFrom[3] = f7;
        setFrom[4] = f2;
        setFrom[5] = f5;
        setFrom[6] = 0.0f;
        setFrom[7] = f8;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f3;
        setFrom[13] = f6;
        setFrom[14] = 0.0f;
        setFrom[15] = f9;
    }

    public static final void LJJJI(String str, int i) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            ICrashReportService provideErrorReporter = AVExternalServiceImpl.LIZ().provideErrorReporter();
            switch (i) {
                case 1:
                    provideErrorReporter.setCustomTag("last_sticker_id", str);
                    break;
                case 2:
                    provideErrorReporter.setCustomTag("last_mv_id", str);
                    break;
                case 3:
                    provideErrorReporter.setCustomTag("last_filter_id", str);
                    break;
                case 4:
                    provideErrorReporter.setCustomTag("last_beauty_id", str);
                    break;
                case 5:
                    provideErrorReporter.setCustomTag("last_infosticker_id", str);
                    break;
                case 6:
                    provideErrorReporter.setCustomTag("last_resource_id", str);
                    break;
                case 7:
                    provideErrorReporter.setCustomTag("last_effect_id", str);
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    public static final boolean LJJJJJL(User user, boolean z) {
        if (C243799hX.LIZJ(user).size() <= 0 || user.isBlock()) {
            return false;
        }
        if ((!z && user.isSecret() && (user.getFollowStatus() == 0 || user.getFollowStatus() == 4)) || C234589Io.LIZ()) {
            return false;
        }
        if (!z && C00F.LIZ(31744, 0, "is_hide_social_button", true) == 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJL(User user, boolean z) {
        if (LJJJJJL(user, z) && (C9H6.LIZJ() || L12.LIZLLL())) {
            return true;
        }
        return false;
    }

    public static final void LJJJLL(MultiEditVideoRecordData multiEditVideoRecordData, List segments) {
        o.LJIIIZ(segments, "segments");
        List<MultiEditVideoSegmentRecordData> segmentDataList = multiEditVideoRecordData.segmentDataList;
        o.LJIIIIZZ(segmentDataList, "segmentDataList");
        int i = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : segmentDataList) {
            int i2 = i + 1;
            if (i >= 0) {
                MultiEditVideoSegmentRecordData it = multiEditVideoSegmentRecordData;
                VideoSegment videoSegment = (VideoSegment) ListProtector.get(segments, i);
                o.LJIIIIZZ(it, "it");
                LJJJLZIJ(it, videoSegment);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static final void LJJJLZIJ(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, VideoSegment videoSegment) {
        MusicSyncData musicSyncData;
        C5UB c5ub;
        o.LJIIIZ(videoSegment, "videoSegment");
        if (videoSegment.LJIIJ() && (c5ub = videoSegment.stickPointVideoSegment) != null) {
            musicSyncData = new MusicSyncData(c5ub.getVideoStart(), c5ub.getVideoEnd(), c5ub.getVideoDuration());
        } else {
            musicSyncData = null;
        }
        multiEditVideoSegmentRecordData.musicSyncData = musicSyncData;
        multiEditVideoSegmentRecordData.enable = !videoSegment.isDeleted;
        multiEditVideoSegmentRecordData.setStartTime(videoSegment.LJIIIZ());
        multiEditVideoSegmentRecordData.setEndTime(videoSegment.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(MultiEditVideoRecordData multiEditVideoRecordData, List list, boolean z) {
        o.LJIIIZ(list, "list");
        if (list.isEmpty()) {
            return;
        }
        if (multiEditVideoRecordData.segmentDataList == null) {
            multiEditVideoRecordData.segmentDataList = new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoSegment videoSegment = (VideoSegment) it.next();
            if (z && videoSegment.libraryVideoSegment != null) {
                List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                multiEditVideoSegmentRecordData.videoPath = videoSegment.LJII(false);
                multiEditVideoSegmentRecordData.audioPath = null;
                multiEditVideoSegmentRecordData.width = videoSegment.width;
                multiEditVideoSegmentRecordData.height = videoSegment.height;
                multiEditVideoSegmentRecordData.setVideoSpeed(videoSegment.LJIIIIZZ());
                multiEditVideoSegmentRecordData.audioSpeed = videoSegment.LJIIIIZZ();
                multiEditVideoSegmentRecordData.rotate = videoSegment.rotate;
                long j = videoSegment.duration * 1000;
                multiEditVideoSegmentRecordData.videoLength = j;
                multiEditVideoSegmentRecordData.audioLength = j;
                multiEditVideoSegmentRecordData.setStartTime(videoSegment.LJIIIZ());
                multiEditVideoSegmentRecordData.setEndTime(videoSegment.LJ());
                multiEditVideoSegmentRecordData.enable = !videoSegment.isDeleted;
                multiEditVideoSegmentRecordData.videoKey = videoSegment.videoIndex;
                if (videoSegment.libraryVideoSegment != null) {
                    boolean z2 = false;
                    multiEditVideoSegmentRecordData.libraryMaterialInfo = new LibraryMaterialInfoSv(videoSegment.libraryVideoSegment.getId(), null, videoSegment.libraryVideoSegment.getMaterialProvider(), videoSegment.libraryVideoSegment.getMaterialType(), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, videoSegment.libraryVideoSegment.getRawFilePath(), videoSegment.libraryVideoSegment.getAudioPath(), videoSegment.libraryVideoSegment.getVideoPath(), z2, z2, Integer.valueOf(videoSegment.width), Integer.valueOf(videoSegment.height), 25586, 0 == true ? 1 : 0);
                }
                list2.add(multiEditVideoSegmentRecordData);
            } else {
                List<MultiEditVideoSegmentRecordData> list3 = multiEditVideoRecordData.segmentDataList;
                o.LJIIIZ(videoSegment, "<this>");
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = new MultiEditVideoSegmentRecordData();
                multiEditVideoSegmentRecordData2.videoPath = videoSegment.LJII(false);
                multiEditVideoSegmentRecordData2.width = videoSegment.width;
                multiEditVideoSegmentRecordData2.height = videoSegment.height;
                multiEditVideoSegmentRecordData2.setVideoSpeed(videoSegment.LJIIIIZZ());
                multiEditVideoSegmentRecordData2.rotate = videoSegment.rotate;
                multiEditVideoSegmentRecordData2.videoLength = videoSegment.duration * 1000;
                multiEditVideoSegmentRecordData2.setStartTime(videoSegment.LJIIIZ());
                multiEditVideoSegmentRecordData2.setEndTime(videoSegment.LJ());
                multiEditVideoSegmentRecordData2.enable = !videoSegment.isDeleted;
                multiEditVideoSegmentRecordData2.videoKey = videoSegment.videoIndex;
                list3.add(multiEditVideoSegmentRecordData2);
            }
        }
    }

    public static final C46108I7s LIZLLL(InterfaceC88472Yns interfaceC88472Yns, Object obj, C46108I7s c46108I7s) {
        try {
            interfaceC88472Yns.invoke(obj);
        } catch (Throwable th) {
            if (c46108I7s != null && c46108I7s.getCause() != th) {
                V0N.LJFF(c46108I7s, th);
            } else {
                return new C46108I7s(o.LJIILLIIL(obj, "Exception in undelivered element handler for "), th);
            }
        }
        return c46108I7s;
    }

    public static final void LJI(AnoleComponentBusinessAppearModel anoleInteractBusiness, List list, boolean z) {
        C211668Sk c211668Sk;
        o.LJIIIZ(anoleInteractBusiness, "anoleInteractBusiness");
        List<String> businessComponents = anoleInteractBusiness.getBusinessComponents();
        if (businessComponents != null) {
            for (String name : businessComponents) {
                o.LJIIIZ(name, "name");
                EnumC46105I7p[] values = EnumC46105I7p.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (o.LJ(values[i].getInteractName(), name)) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("isAnoleContainerFlag name = ");
                            LIZ.append(name);
                            C242549fW.LIZ(X1D.LIZIZ(LIZ));
                            AnoleComponentAnimationModel animationModels = anoleInteractBusiness.getAnimationModels();
                            if (animationModels != null) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("generateValueAnimator,duration = ");
                                LIZ2.append(animationModels.getDuration());
                                LIZ2.append(",interpolator = ");
                                LIZ2.append(animationModels.getCurve());
                                C242549fW.LIZ(X1D.LIZIZ(LIZ2));
                                Interpolator LIZ3 = C78950Uyg.LIZ(animationModels.getCurve());
                                if (LIZ3 != null) {
                                    c211668Sk = new C211668Sk(animationModels.getDuration(), LIZ3);
                                } else {
                                    c211668Sk = null;
                                }
                                ((ArrayList) list).add(new C46106I7q(name, c211668Sk, z));
                            }
                        } else {
                            i++;
                        }
                    } else {
                        C242549fW.LIZ("error component config , please check!");
                        break;
                    }
                }
            }
        }
    }

    public static final void LJJJIL(MultiEditVideoRecordData multiEditVideoRecordData, long j, long j2) {
        if (j2 <= j) {
            return;
        }
        long j3 = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
            if (multiEditVideoSegmentRecordData.enable) {
                multiEditVideoSegmentRecordData.multiEditTrimState = new MultiEditTrimState(multiEditVideoSegmentRecordData.enable, multiEditVideoSegmentRecordData.getOriginStartTime(), multiEditVideoSegmentRecordData.getOriginEndTime());
                long endTime = multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                if (j3 < j || j3 + endTime > j2) {
                    if (j3 + endTime <= j || j3 >= j2) {
                        multiEditVideoSegmentRecordData.enable = false;
                    } else {
                        long startTime = multiEditVideoSegmentRecordData.getStartTime() + (j - j3);
                        long startTime2 = multiEditVideoSegmentRecordData.getStartTime() + (j2 - j3);
                        if (startTime <= multiEditVideoSegmentRecordData.getStartTime()) {
                            startTime = multiEditVideoSegmentRecordData.getStartTime();
                        }
                        multiEditVideoSegmentRecordData.setStartTime(startTime);
                        if (startTime2 > multiEditVideoSegmentRecordData.getEndTime()) {
                            startTime2 = multiEditVideoSegmentRecordData.getEndTime();
                        }
                        multiEditVideoSegmentRecordData.setEndTime(startTime2);
                    }
                }
                j3 += endTime;
            }
        }
    }

    public static final void LJJIL(int i, long j, String str, boolean z) {
        String str2;
        if (z) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_highlight_result_show");
        LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j), "room_id");
        LIZ.LJIJJ("screen_share", "live_type");
        LIZ.LJIJJ(str2, "status");
        LIZ.LJIJJ(str, "item_id");
        if (!z) {
            LIZ.LJIJJ(Integer.valueOf(i), "fail_type");
        }
        LIZ.LJJIIJZLJL();
    }

    public static AVUploadSaveModel LJIJI(CreativeInfo creativeInfo, AVUploadSaveModel aVUploadSaveModel, int i, boolean z, InterfaceC46109I7t interfaceC46109I7t, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        if (!C44739Hh9.LIZIZ() && !z3) {
            return null;
        }
        if (aVUploadSaveModel == null) {
            aVUploadSaveModel = new AVUploadSaveModel();
        }
        if (TextUtils.isEmpty(aVUploadSaveModel.getLocalTempPath())) {
            aVUploadSaveModel.setLocalTempPath(C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJIIIZ(creativeInfo));
        }
        aVUploadSaveModel.setWaterMark(LJJIJIIJIL());
        boolean z6 = false;
        if (z) {
            if (i != 0 || interfaceC46109I7t.LJIIIZ() || (interfaceC46109I7t.isEnabled() && SaveLocalHelper.LIZ(z2))) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVUploadSaveModel.setSaveLocal(z5);
        } else {
            if (i != 0 || SaveLocalHelper.LIZ(z2)) {
                z4 = true;
            } else {
                z4 = false;
            }
            aVUploadSaveModel.setSaveLocal(z4);
        }
        aVUploadSaveModel.setSaveType(i);
        if (interfaceC46109I7t.isEnabled() && SaveLocalHelper.LIZIZ(z2) == 2) {
            z6 = true;
        }
        aVUploadSaveModel.setSaveWithCaption(z6);
        return aVUploadSaveModel;
    }
}
