package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.discover.model.TrendingTopic;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ol5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C62819Ol5 implements InterfaceC54858Lfy, OBG, InterfaceC47109IeH {
    public static Gson LJLIL;

    @Override // X.InterfaceC47109IeH
    public void LIZ() {
    }

    @Override // X.InterfaceC47109IeH
    public void LIZIZ() {
    }

    @Override // X.InterfaceC47109IeH
    public /* synthetic */ void LIZJ() {
    }

    public /* synthetic */ C62819Ol5() {
    }

    public /* synthetic */ C62819Ol5(int i) {
    }

    public static boolean LJII(Aweme aweme) {
        if (!C63081OpJ.LJJLIIIJJI(aweme) || aweme.getAwemeRawAd().getOmVast() == null || C59252NNg.LIZIZ(aweme) == null || C59252NNg.LIZIZ(aweme) == null) {
            return false;
        }
        return true;
    }

    public static final List LJIIIIZZ(PhotoModeImageInfo photoModeImageInfo) {
        UrlModel displayImageNoWatermark;
        List<PhotoModeImageUrlModel> imageList = photoModeImageInfo.getImageList();
        if (imageList != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(imageList, 10));
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                o.LJIIIZ(photoModeImageUrlModel, "<this>");
                if (((Boolean) C52296Kfk.LIZ.getValue()).booleanValue()) {
                    displayImageNoWatermark = photoModeImageUrlModel.getTargetMultiRateImageUrl();
                    if (displayImageNoWatermark == null) {
                        displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark();
                    } else {
                        arrayList.add(new PhotoModeImage(displayImageNoWatermark, displayImageNoWatermark.getWidth(), displayImageNoWatermark.getHeight()));
                    }
                } else {
                    displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark();
                }
                if (displayImageNoWatermark == null) {
                    displayImageNoWatermark = new UrlModel();
                }
                arrayList.add(new PhotoModeImage(displayImageNoWatermark, displayImageNoWatermark.getWidth(), displayImageNoWatermark.getHeight()));
            }
            return ORZ.LLJILJILJ(arrayList);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AddYoursStickerModel LJIIIZ(AddYoursStickerStruct addYoursStickerStruct) {
        Long topicId = addYoursStickerStruct.getTopicId();
        List<AddYoursAvatar> userAvatars = addYoursStickerStruct.getUserAvatars();
        if (userAvatars == null) {
            userAvatars = C61878OQg.INSTANCE;
        }
        String text = addYoursStickerStruct.getText();
        List<Long> addYoursInvitees = addYoursStickerStruct.getAddYoursInvitees();
        float f = 0.0f;
        return new AddYoursStickerModel(new BaseStickerModel(0, 0 == true ? 1 : 0, EnumC157656Gr.ADD_YOURS, 0 == true ? 1 : 0, 0 == true ? 1 : 0, f, f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, f, f, f, f, f, f, f, f, f, f, 0 == true ? 1 : 0, f, f, 0 == true ? 1 : 0, f, -5, 0 == true ? 1 : 0), userAvatars, topicId, text, null, addYoursStickerStruct.getVideoCount(), false, false, false, addYoursInvitees, null, null, 3536, null);
    }

    public static final void LJIIJ(String str) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            return;
        }
        String LJ = a1.LJ("Method ", str, " must be called on the main thread");
        LJ.toString();
        throw new IllegalStateException(LJ);
    }

    public static void LJIIJJI(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (!jSONObject.has("opening") && !jSONObject.has("ending")) {
            if (jSONObject.has("Ending") || jSONObject.has("Opening")) {
                try {
                    jSONObject.optDouble("Opening");
                    jSONObject.optDouble("Ending");
                    return;
                } catch (Exception e) {
                    TTVideoEngineLog.d(e);
                    return;
                }
            }
            return;
        }
        try {
            jSONObject.optDouble("opening");
            jSONObject.optDouble("ending");
        } catch (Exception e2) {
            TTVideoEngineLog.d(e2);
        }
    }

    public static String LJIILL(Aweme aweme) {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        String str3 = "";
        if (!LJII(aweme)) {
            str = "";
        } else {
            str = C59252NNg.LIZIZ(aweme).javascriptResource;
        }
        LIZ.append(str);
        if (!LJII(aweme)) {
            str2 = "";
        } else {
            str2 = C59252NNg.LIZIZ(aweme).vender;
        }
        LIZ.append(str2);
        if (LJII(aweme)) {
            str3 = C59252NNg.LIZIZ(aweme).verificationParameters;
        }
        LIZ.append(str3);
        return MD5Utils.getMD5String(X1D.LIZIZ(LIZ));
    }

    public static final List LJIILLIIL(PhotoModeImageInfo photoModeImageInfo) {
        synchronized (photoModeImageInfo) {
            List<PhotoModeImage> photoModeImageList = photoModeImageInfo.getPhotoModeImageList();
            if (photoModeImageList != null) {
                return photoModeImageList;
            }
            photoModeImageInfo.setPhotoModeImageList(LJIIIIZZ(photoModeImageInfo));
            List<PhotoModeImage> photoModeImageList2 = photoModeImageInfo.getPhotoModeImageList();
            if (photoModeImageList2 == null) {
                photoModeImageList2 = new ArrayList<>();
            }
            return photoModeImageList2;
        }
    }

    public static final List LJIIZILJ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UrlModel userAvatar = ((AddYoursAvatar) it.next()).getUserAvatar();
            if (userAvatar != null) {
                LJ.add(userAvatar);
            }
        }
        return LJ;
    }

    public static final int LJIJ(Context context) {
        ContentResolver contentResolver;
        if (context == null) {
            contentResolver = null;
        } else {
            try {
                contentResolver = context.getContentResolver();
            } catch (Exception unused) {
                return -1;
            }
        }
        return Settings.System.getInt(contentResolver, "screen_brightness");
    }

    public static final VEUtils.VEVideoFileInfo LJIJJ(String strInVideo) {
        o.LJIIIZ(strInVideo, "strInVideo");
        C60903NvH.LJIIJJI().LJIJ();
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(strInVideo);
        if (videoFileInfo != null && videoFileInfo.rotation % 180 != 0) {
            int i = videoFileInfo.height;
            videoFileInfo.height = videoFileInfo.width;
            videoFileInfo.width = i;
        }
        return videoFileInfo;
    }

    public static final boolean LJIJJLI(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        if (aweme.isPhotoMode() && aweme.getMusic() == null) {
            return true;
        }
        return false;
    }

    public static final C36784Ec8 LJJ(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        return new C36784Ec8(initializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BaseRequestComponent LJJIIJZLJL(RU2 ru2) {
        QueryDataComponent queryDataComponent;
        RU0 ru0 = ru2.query_data;
        if (ru0 != null) {
            String str = ru0.resource_id;
            if (str == null) {
                str = "";
            }
            java.util.Map map = ru0.extra;
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            queryDataComponent = new QueryDataComponent(str, map);
        } else {
            queryDataComponent = new QueryDataComponent(null, 0 == true ? 1 : 0, 3);
        }
        return new BaseRequestComponent(queryDataComponent);
    }

    public static final VECameraSettings.CAMERA_FACING_ID LJJIIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return VECameraSettings.CAMERA_FACING_ID.FACING_3RD;
                    }
                    throw new IllegalStateException();
                }
                return VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
            }
            return VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        }
        return VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
    }

    public static final WebResourceResponse LJJIIZI(InterfaceC37464En6 toWebResourceResponse) {
        o.LJIIJ(toWebResourceResponse, "$this$toWebResourceResponse");
        return new WebResourceResponse(toWebResourceResponse.getMimeType(), toWebResourceResponse.LJI(), toWebResourceResponse.LJII(), toWebResourceResponse.LJIIIIZZ(), toWebResourceResponse.LJFF(), toWebResourceResponse.getData());
    }

    public static final CommentListPageFragment LJJIJIIJI(ActivityC45651qj activityC45651qj) {
        return (CommentListPageFragment) activityC45651qj.getSupportFragmentManager().LJJJIL("comment_page");
    }

    public static G0D LJJIJIL(Object obj) {
        return new G0D(C16880lQ.LJLLJ(obj.getClass()));
    }

    @Override // X.InterfaceC54858Lfy
    public /* bridge */ /* synthetic */ void run(Object obj) {
    }

    public static final void LIZLLL(VETimelineParams vETimelineParams, List list) {
        o.LJIIIZ(vETimelineParams, "<this>");
        if (list == null || list.isEmpty()) {
            return;
        }
        int length = vETimelineParams.vTrimIn.length;
        int size = list.size() + length;
        vETimelineParams.vTrimIn = Arrays.copyOf(vETimelineParams.vTrimIn, size);
        vETimelineParams.vTrimOut = Arrays.copyOf(vETimelineParams.vTrimOut, size);
        vETimelineParams.speed = Arrays.copyOf(vETimelineParams.speed, size);
        vETimelineParams.enable = Arrays.copyOf(vETimelineParams.enable, size);
        vETimelineParams.rotate = (ROTATE_DEGREE[]) Arrays.copyOf(vETimelineParams.rotate, size);
        vETimelineParams.videoFilePaths = (String[]) Arrays.copyOf(vETimelineParams.videoFilePaths, size);
        vETimelineParams.videoFileIndex = Arrays.copyOf(vETimelineParams.videoFileIndex, size);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                VideoSegment videoSegment = (VideoSegment) obj;
                int i3 = i + length;
                vETimelineParams.vTrimIn[i3] = (int) videoSegment.LJIIIZ();
                vETimelineParams.vTrimOut[i3] = (int) videoSegment.LJ();
                vETimelineParams.speed[i3] = EnumC82528WaC.NORMAL.value();
                vETimelineParams.enable[i3] = true;
                vETimelineParams.rotate[i3] = ROTATE_DEGREE.ROTATE_NONE;
                String[] strArr = vETimelineParams.videoFilePaths;
                String LJII = videoSegment.LJII(false);
                LJII.toString();
                strArr[i3] = LJII;
                vETimelineParams.videoFileIndex[i3] = videoSegment.videoIndex;
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    public static void LJFF(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        float f;
        if (videoPublishEditModel == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            EnumC123864ta LJIIZILJ = nLETrack.LJIIZILJ();
            EnumC123864ta enumC123864ta = EnumC123864ta.AUDIO;
            if ((LJIIZILJ == enumC123864ta && o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.AUDIO_RECORD.name())) || (nLETrack.LJIIZILJ() == enumC123864ta && o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.DUB.name()))) {
                LIZ.add(next);
            }
        }
        Iterator it2 = LIZ.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
            while (it3.hasNext()) {
                NLETrackSlot slot = it3.next();
                o.LJIIIIZZ(slot, "slot");
                arrayList.add(slot);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it4 = arrayList.iterator();
        float f2 = 0.0f;
        while (it4.hasNext()) {
            NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(((NLETrackSlot) it4.next()).LJI());
            if (LIZLLL != null) {
                float LJIILJJIL = LIZLLL.LJIILJJIL();
                if (LJIILJJIL > f2) {
                    f2 = LJIILJJIL;
                }
            }
        }
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null) {
            audioRecorderParam.setRecordVolume(f2);
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it5.next();
            NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
            if (LIZLLL2 != null) {
                float LJIILJJIL2 = LIZLLL2.LJIILJJIL();
                if (f2 == 0.0f) {
                    f = 1.0f;
                } else {
                    f = LJIILJJIL2 / f2;
                }
                nLETrackSlot.setExtra("multi_record_voice_rate", String.valueOf(f));
            }
        }
    }

    public static Object LJIIL(String str, Class cls) {
        if (LJLIL == null) {
            LJLIL = new Gson();
        }
        return GsonProtectorUtils.fromJson(LJLIL, str, cls);
    }

    public static final int LJIJI(String strInVideo, int[] iArr) {
        o.LJIIIZ(strInVideo, "strInVideo");
        H78.LJI("start getVideoFileInfoWithRotation");
        if (C19N.LJ("enable_convert_uri_path", false) && ujb.o.LJJJLIIL(strInVideo, "content://", false)) {
            strInVideo = C00S.LIZIZ(C60903NvH.LJ, C44694HgQ.LJIIIIZZ(strInVideo));
            o.LJIIIIZZ(strInVideo, "convertUriToPath(CameraC…s.getFileUri(strInVideo))");
        }
        C60903NvH.LJIIJJI().LJIJ();
        int videoFileInfo = VEUtils.getVideoFileInfo(strInVideo, iArr);
        if (videoFileInfo == 0 && iArr[2] % 180 != 0) {
            int i = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i;
        }
        H78.LJI("end getVideoFileInfoWithRotation");
        return videoFileInfo;
    }

    public static final boolean LJIL(List list, List list2) {
        if (list == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!o.LJ(((TranslatedRegion) ListProtector.get(list, i)).getCode(), ((TranslatedRegion) ListProtector.get(list2, i)).getCode())) {
                return false;
            }
        }
        return true;
    }

    public static void LJJI(Context context, TrendingTopic trendingTopic) {
        OJY LJIL = C73340SqO.LJIL();
        long creativeId = trendingTopic.getCreativeId();
        String logExtra = trendingTopic.getLogExtra();
        UrlModel trackUrlList = trendingTopic.getTrackUrlList();
        LJIL.getClass();
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZIZ = "show";
        LIZ.LJII(logExtra);
        LIZ.LIZ = "discovery_ad";
        LIZ.LJIIIIZZ("hashtag");
        LIZ.LIZLLL(Long.valueOf(creativeId));
        LIZ.LJIIIZ(context);
        C58655N0h LJ = C58704N2e.LJ("discovery_ad", "show", String.valueOf(creativeId), logExtra, CardStruct.IStatusCode.DEFAULT);
        LJ.LIZJ("hashtag", "refer");
        LJ.LJII();
        O8Z.LIZ("show", trackUrlList, Long.valueOf(creativeId), logExtra);
    }

    public static final void LJJIFFI(BZI bzi, TimerDetail timerDetail) {
        bzi.LJIJJ(C29232Bdc.LIZLLL(timerDetail), "subathon_status");
    }

    public static final PhotoModeImage LJJIII(int i, Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        o.LJIIIZ(aweme, "<this>");
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 == null || i > C47261Igj.LJJ(LJIILLIIL(photoModeImageInfo2)).LJLILLLLZI || i < 0 || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null) {
            return null;
        }
        return (PhotoModeImage) ListProtector.get(LJIILLIIL(photoModeImageInfo), i);
    }

    public static final C27513Aqz LJJIJ(PromotionEntrance promotionEntrance, boolean z) {
        return new C27513Aqz(promotionEntrance.bannerInfo, promotionEntrance.buttonText, promotionEntrance.schema, promotionEntrance.entranceStyle, z);
    }

    public static boolean LJI(int i, int i2, View view) {
        if (view.getHeight() > i * 0.8f && view.getWidth() > i2 * 0.8f) {
            return true;
        }
        return false;
    }

    public static String LJIILIIL(int i, String str, boolean z) {
        if (TextUtils.equals(str, "following_window")) {
            return "following_window";
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    String str2 = "personal_homepage";
                    if (i != 1000 && i != 1001) {
                        str2 = "others_homepage";
                        if (i != 2000 && i != 2001) {
                            if (i != 3002) {
                                if (i != 3003) {
                                    if (i != 4000) {
                                        if (i != 4001) {
                                            if (i != 9000) {
                                                if (i != 9001) {
                                                    if (i != 21000) {
                                                        if (TextUtils.equals(str, "upload")) {
                                                            return "release";
                                                        }
                                                        return str;
                                                    }
                                                    return "mall_racun_channel";
                                                }
                                                return "playlist";
                                            }
                                            return "discovery";
                                        }
                                        return "single_Msong_fresh";
                                    }
                                    if (z) {
                                        return "single_song";
                                    }
                                    return "single_song_hot";
                                }
                                return "challenge_fresh";
                            }
                            return "challenge";
                        }
                    }
                    return str2;
                }
                return "homepage_fresh";
            }
            return "homepage_follow";
        }
        return "homepage_hot";
    }

    public static List LJIILJJIL(int i, int i2, View view) {
        ArrayList arrayList = new ArrayList();
        if (LJI(i, i2, view)) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (LJI(i, i2, view)) {
                    arrayList.add(childAt);
                }
                arrayList.addAll(LJIILJJIL(i, i2, childAt));
            }
        }
        return arrayList;
    }

    public static final void LJJII(BZI bzi, DataChannel dataChannel, boolean z) {
        Room room;
        boolean z2;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
            Boolean bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
            if (bool != null) {
                z2 = bool.booleanValue();
                bzi.LJJIFFI(C29232Bdc.LJIJJLI(z2, z, room));
            }
        } else {
            room = null;
        }
        z2 = false;
        bzi.LJJIFFI(C29232Bdc.LJIJJLI(z2, z, room));
    }

    public static final void LJJIIJ(VETimelineParams vETimelineParams, int i, VideoSegment segment) {
        boolean z;
        o.LJIIIZ(vETimelineParams, "<this>");
        o.LJIIIZ(segment, "segment");
        boolean[] enable = vETimelineParams.enable;
        o.LJIIIIZZ(enable, "enable");
        int length = enable.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            boolean[] zArr = vETimelineParams.enable;
            if (i == i3) {
                z = true;
            } else {
                z = false;
            }
            zArr[i3] = z;
            i2++;
            i3 = i4;
        }
        vETimelineParams.speed[i] = segment.LJIIIIZZ();
        vETimelineParams.vTrimIn[i] = 0;
        vETimelineParams.vTrimOut[i] = (int) segment.duration;
        vETimelineParams.rotate[i] = C44513HdV.LIZJ(segment.rotate);
    }

    public static final void LJJIJIIJIL(VETimelineParams vETimelineParams, List list, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        if (list != null && (!list.isEmpty())) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    vETimelineParams.enable[i] = !((VideoSegment) obj).isDeleted;
                    vETimelineParams.vTrimIn[i] = iArr[i];
                    vETimelineParams.vTrimOut[i] = iArr2[i];
                    vETimelineParams.speed[i] = fArr[i];
                    vETimelineParams.rotate[i] = C44513HdV.LIZJ(iArr3[i]);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public static void LJ(C29929Bor c29929Bor, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, String str14, int i) {
        String str15 = str7;
        String str16 = str6;
        String str17 = str4;
        String str18 = str5;
        String str19 = str14;
        String str20 = str9;
        String str21 = str8;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        String str25 = str13;
        if ((i & 8) != 0) {
            str17 = null;
        }
        if ((i & 16) != 0) {
            str18 = null;
        }
        if ((i & 32) != 0) {
            str16 = null;
        }
        if ((i & 64) != 0) {
            str15 = null;
        }
        if ((i & 128) != 0) {
            str21 = null;
        }
        if ((i & 256) != 0) {
            str20 = null;
        }
        if ((i & 512) != 0) {
            list = null;
        }
        if ((i & 4096) != 0) {
            str22 = null;
        }
        if ((i & 16384) != 0) {
            str23 = null;
        }
        if ((65536 & i) != 0) {
            str24 = null;
        }
        if ((262144 & i) != 0) {
            str25 = null;
        }
        if ((i & 524288) != 0) {
            str19 = null;
        }
        HH1.LIZ(str, "imageUrl", str2, "innerUrl", str3, "outerUrl");
        c29929Bor.LJIIJ = str3;
        c29929Bor.LJIIJJI = str17;
        c29929Bor.LJIIL = str18;
        c29929Bor.LIZLLL = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        c29929Bor.LJJJ = str2;
        c29929Bor.LJIILIIL = str;
        c29929Bor.LIZIZ("third_party_title", str25);
        c29929Bor.LIZIZ("third_party_desc", str19);
        c29929Bor.LIZIZ("sender_preview_text", str16);
        c29929Bor.LIZIZ("receiver_preview_text", str15);
        c29929Bor.LIZIZ("quote_preview_text", str21);
        c29929Bor.LIZIZ("title_key", str20);
        if (list != null) {
            c29929Bor.LIZJ("title_key_args", C61328O5c.LJ(list));
        }
        c29929Bor.LIZIZ("desc_key", null);
        c29929Bor.LIZIZ("sender_preview_text_key", str22);
        c29929Bor.LIZIZ("receiver_preview_text_key", str23);
        c29929Bor.LIZIZ("quote_preview_text_key", str24);
    }
}
