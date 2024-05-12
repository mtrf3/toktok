package com.ss.android.ugc.aweme.services.duet;

import X.C142615ij;
import X.C149505tq;
import X.C278817o;
import X.C32I;
import X.C43075GvP;
import X.C43722HDy;
import X.C43832HIe;
import X.C47261Igj;
import X.C60903NvH;
import X.C74275TDb;
import X.C78966Uyw;
import X.C78996UzQ;
import X.HZV;
import X.InterfaceC43676HCe;
import X.ORY;
import X.OSZ;
import X.V16;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.duetupload.DuetUploadModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.DuetLayoutInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetUploadServiceImpl implements InterfaceC43676HCe {
    public static final Companion Companion = new Companion();

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final long getMinDuration(boolean z, VEUtils.VEVideoFileInfo videoInfo, DuetUploadModel duetUploadModel) {
            o.LJIIIZ(videoInfo, "videoInfo");
            o.LJIIIZ(duetUploadModel, "duetUploadModel");
            if (!z) {
                return Math.min(videoInfo.duration, duetUploadModel.duration);
            }
            return videoInfo.duration;
        }
    }

    @Override // X.InterfaceC43676HCe
    public void callDuetVideoPublish(Activity activity, Intent data) {
        DuetUploadModel duetUploadModel;
        DuetContext duetContext;
        ShortVideoContext shortVideoContext;
        String str;
        int i;
        String str2;
        String creationId;
        DuetLayoutInfo duetLayoutInfo;
        float f;
        DuetLayoutInfo duetLayoutInfo2;
        DuetLayoutInfo duetLayoutInfo3;
        float f2;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(data, "data");
        ArrayList parcelableArrayListExtra = data.getParcelableArrayListExtra("key_choose_media_data");
        if (parcelableArrayListExtra == null || data.getParcelableExtra("key_upload_video_context") == null || (duetUploadModel = (DuetUploadModel) data.getParcelableExtra("key_duet_upload_model")) == null || (duetContext = (DuetContext) data.getParcelableExtra("key_upload_video_context")) == null || (shortVideoContext = (ShortVideoContext) data.getParcelableExtra("key_short_video_context")) == null) {
            return;
        }
        String str3 = duetContext.duetVideoPath;
        if (str3 != null) {
            VEUtils.VEVideoFileInfo vEVideoFileInfo = VEUtils.getVEVideoFileInfo(str3);
            if (vEVideoFileInfo == null) {
                return;
            }
            boolean z = duetUploadModel.isImageType;
            long minDuration = Companion.getMinDuration(z, vEVideoFileInfo, duetUploadModel);
            String str4 = duetContext.duetVideoPath;
            boolean z2 = true;
            if (str4 == null || str4.length() == 0 || (str = duetContext.duetLayout) == null || str.length() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List LJJIJLIJ = ORY.LJJIJLIJ(new String[]{((MediaModel) ListProtector.get(parcelableArrayListExtra, 0)).fileLocalUriPath, duetContext.duetVideoPath});
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) LJJIJLIJ).iterator();
            while (it.hasNext()) {
                VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo((String) it.next());
                if (videoFileInfo != null) {
                    arrayList2.add(videoFileInfo);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                VEUtils.VEVideoFileInfo vEVideoFileInfo2 = (VEUtils.VEVideoFileInfo) it2.next();
                arrayList.add(new OSZ(Integer.valueOf(vEVideoFileInfo2.width), Integer.valueOf(vEVideoFileInfo2.height)));
                arrayList3.add(Integer.valueOf(vEVideoFileInfo2.duration));
                z2 = true;
            }
            duetContext.isDuetUpload = z2;
            if (z) {
                duetContext.duetUploadType = DuetContext.DUET_UPLOAD_TYPE_PICTURE;
                C47261Igj.LJJIJ(duetUploadModel.fileLocalUriPath);
                i = 2;
            } else {
                duetContext.duetUploadType = DuetContext.DUET_UPLOAD_TYPE_VIDEO;
                i = 1;
            }
            String[] strArr = new String[1];
            String str5 = duetUploadModel.fileLocalUriPath;
            if (str5 != null) {
                strArr[0] = str5;
                List LJJIJIL = C47261Igj.LJJIJIL(strArr);
                CanvasBackground.Companion.getClass();
                int i2 = (int) minDuration;
                CanvasVideoData canvasVideoData = new CanvasVideoData(LJJIJIL, null, C142615ij.LIZ(-16777216), new CanvasExtra(0, i, 0, i2, 0.0f, 0.0f, false, new CanvasGestureConfig(false, false, false, false, 0, false, 48, null), null, null, duetUploadModel.speed, duetUploadModel.startTime, 0, 4980, null), 1, null, 0, 98, null);
                String[] strArr2 = new String[1];
                String str6 = duetContext.duetVideoPath;
                if (str6 != null) {
                    strArr2[0] = str6;
                    CanvasVideoData canvasVideoData2 = new CanvasVideoData(C47261Igj.LJJIJIL(strArr2), null, C142615ij.LIZ(-16777216), new CanvasExtra(0, i, 0, i2, 0.0f, 0.0f, false, new CanvasGestureConfig(false, false, false, false, 0, false, 48, null), null, null, 0.0f, 0L, 0, 8052, null), 1, null, 0, 98, null);
                    String str7 = duetContext.duetLayout;
                    if (str7 != null) {
                        switch (str7.hashCode()) {
                            case -1048844902:
                                if (str7.equals("new_up")) {
                                    if (!TextUtils.isEmpty(duetContext.duetLayoutInfoJson)) {
                                        duetLayoutInfo3 = (DuetLayoutInfo) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), duetContext.duetLayoutInfoJson, DuetLayoutInfo.class);
                                    } else {
                                        duetLayoutInfo3 = new DuetLayoutInfo(1, 0.0f, 0.0f, 1.0f, 1.0f, 6, null);
                                    }
                                    Object obj = ListProtector.get(arrayList, 0);
                                    o.LJIIIIZZ(obj, "veSize[0]");
                                    OSZ osz = (OSZ) obj;
                                    if (((Number) osz.getFirst()).floatValue() / ((Number) osz.getSecond()).intValue() < 1.125f) {
                                        f2 = ((((Number) osz.getFirst()).floatValue() / 1.125f) / ((Number) osz.getSecond()).floatValue()) / 2;
                                    } else {
                                        f2 = 0.5f;
                                    }
                                    CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
                                    canvasFilterParam.setClipIndex(0);
                                    canvasFilterParam.setLeftTopPoint(new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.5f - f2)));
                                    canvasFilterParam.setRightBottomPoint(new OSZ<>(Float.valueOf(1.0f), Float.valueOf(f2 + 0.5f)));
                                    canvasFilterParam.setTransY(-0.25f);
                                    canvasFilterParam.setVolume(1.0f);
                                    canvasFilterParam.setDegree(duetUploadModel.rotation);
                                    canvasVideoData.putTransform(canvasFilterParam);
                                    CanvasFilterParam canvasFilterParam2 = new CanvasFilterParam();
                                    canvasFilterParam2.setClipIndex(0);
                                    canvasFilterParam2.setLeftTopPoint(new OSZ<>(Float.valueOf(duetLayoutInfo3.getX1()), Float.valueOf(duetLayoutInfo3.getY1())));
                                    canvasFilterParam2.setRightBottomPoint(new OSZ<>(Float.valueOf(duetLayoutInfo3.getX2()), Float.valueOf(duetLayoutInfo3.getY2())));
                                    canvasFilterParam2.setTransY(0.25f);
                                    canvasFilterParam2.setVolume(1.0f);
                                    canvasVideoData2.putTransform(canvasFilterParam2);
                                    break;
                                }
                                break;
                            case -254273859:
                                if (str7.equals("new_right")) {
                                    CanvasFilterParam canvasFilterParam3 = new CanvasFilterParam();
                                    canvasFilterParam3.setClipIndex(0);
                                    canvasFilterParam3.setScaleFactor(0.5f);
                                    canvasFilterParam3.setTransX(0.25f);
                                    canvasFilterParam3.setVolume(1.0f);
                                    canvasFilterParam3.setDegree(duetUploadModel.rotation);
                                    canvasVideoData.putTransform(canvasFilterParam3);
                                    CanvasFilterParam canvasFilterParam4 = new CanvasFilterParam();
                                    canvasFilterParam4.setClipIndex(0);
                                    canvasFilterParam4.setScaleFactor(0.5f);
                                    canvasFilterParam4.setTransX(-0.25f);
                                    canvasFilterParam4.setVolume(1.0f);
                                    canvasVideoData2.putTransform(canvasFilterParam4);
                                    break;
                                }
                                break;
                            case 346401221:
                                if (str7.equals("picture_in_picture")) {
                                    if (!TextUtils.isEmpty(duetContext.duetLayoutInfoJson)) {
                                        duetLayoutInfo2 = (DuetLayoutInfo) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), duetContext.duetLayoutInfoJson, DuetLayoutInfo.class);
                                    } else {
                                        duetLayoutInfo2 = new DuetLayoutInfo(2, 0.0f, 0.0f, 0.4f, 0.4f, 6, null);
                                    }
                                    CanvasFilterParam canvasFilterParam5 = new CanvasFilterParam();
                                    canvasFilterParam5.setVolume(1.0f);
                                    canvasFilterParam5.setDegree(duetUploadModel.rotation);
                                    canvasVideoData.putTransform(canvasFilterParam5);
                                    CanvasFilterParam canvasFilterParam6 = new CanvasFilterParam();
                                    canvasFilterParam6.setClipIndex(0);
                                    float f3 = 2;
                                    canvasFilterParam6.setTransX(((duetLayoutInfo2.getX1() + duetLayoutInfo2.getX2()) / f3) - 0.5f);
                                    canvasFilterParam6.setTransY(((duetLayoutInfo2.getY1() + duetLayoutInfo2.getY2()) / f3) - 0.5f);
                                    canvasFilterParam6.setScaleFactor(duetLayoutInfo2.getX2() - duetLayoutInfo2.getX1());
                                    canvasFilterParam6.setBorderWidthPx((int) C74275TDb.LIZ(4.0f));
                                    canvasFilterParam6.setBorderColor(-1);
                                    canvasFilterParam6.setVolume(1.0f);
                                    canvasVideoData2.putTransform(canvasFilterParam6);
                                    break;
                                }
                                break;
                            case 1376860129:
                                if (str7.equals("new_down")) {
                                    if (!TextUtils.isEmpty(duetContext.duetLayoutInfoJson)) {
                                        duetLayoutInfo = (DuetLayoutInfo) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), duetContext.duetLayoutInfoJson, DuetLayoutInfo.class);
                                    } else {
                                        duetLayoutInfo = new DuetLayoutInfo(1, 0.0f, 0.0f, 1.0f, 1.0f, 6, null);
                                    }
                                    Object obj2 = ListProtector.get(arrayList, 0);
                                    o.LJIIIIZZ(obj2, "veSize[0]");
                                    OSZ osz2 = (OSZ) obj2;
                                    if (((Number) osz2.getFirst()).floatValue() / ((Number) osz2.getSecond()).intValue() < 1.125f) {
                                        f = ((((Number) osz2.getFirst()).floatValue() / 1.125f) / ((Number) osz2.getSecond()).floatValue()) / 2;
                                    } else {
                                        f = 0.5f;
                                    }
                                    CanvasFilterParam canvasFilterParam7 = new CanvasFilterParam();
                                    canvasFilterParam7.setClipIndex(0);
                                    canvasFilterParam7.setLeftTopPoint(new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.5f - f)));
                                    canvasFilterParam7.setRightBottomPoint(new OSZ<>(Float.valueOf(1.0f), Float.valueOf(f + 0.5f)));
                                    canvasFilterParam7.setTransY(0.25f);
                                    canvasFilterParam7.setVolume(1.0f);
                                    canvasFilterParam7.setDegree(duetUploadModel.rotation);
                                    canvasVideoData.putTransform(canvasFilterParam7);
                                    CanvasFilterParam canvasFilterParam8 = new CanvasFilterParam();
                                    canvasFilterParam8.setClipIndex(0);
                                    canvasFilterParam8.setLeftTopPoint(new OSZ<>(Float.valueOf(duetLayoutInfo.getX1()), Float.valueOf(duetLayoutInfo.getY1())));
                                    canvasFilterParam8.setRightBottomPoint(new OSZ<>(Float.valueOf(duetLayoutInfo.getX2()), Float.valueOf(duetLayoutInfo.getY2())));
                                    canvasFilterParam8.setTransY(-0.25f);
                                    canvasFilterParam8.setVolume(1.0f);
                                    canvasVideoData2.putTransform(canvasFilterParam8);
                                    break;
                                }
                                break;
                            case 1377088326:
                                if (str7.equals("new_left")) {
                                    CanvasFilterParam canvasFilterParam9 = new CanvasFilterParam();
                                    canvasFilterParam9.setClipIndex(0);
                                    canvasFilterParam9.setScaleFactor(0.5f);
                                    canvasFilterParam9.setTransX(-0.25f);
                                    canvasFilterParam9.setVolume(1.0f);
                                    canvasFilterParam9.setDegree(duetUploadModel.rotation);
                                    canvasVideoData.putTransform(canvasFilterParam9);
                                    CanvasFilterParam canvasFilterParam10 = new CanvasFilterParam();
                                    canvasFilterParam10.setClipIndex(0);
                                    canvasFilterParam10.setScaleFactor(0.5f);
                                    canvasFilterParam10.setTransX(0.25f);
                                    canvasFilterParam10.setVolume(1.0f);
                                    canvasVideoData2.putTransform(canvasFilterParam10);
                                    break;
                                }
                                break;
                        }
                    }
                    canvasVideoData.setExternalTracks(C47261Igj.LJJIJ(canvasVideoData2));
                    createIntent(activity, data, shortVideoContext);
                    if (z) {
                        data.putExtra("is_muted", true);
                    } else {
                        data.putExtra("is_muted", false);
                    }
                    VideoFileInfo videoFileInfo2 = new VideoFileInfo(720, 1280, minDuration, 30, 0, 0, 0, 0, 0.0f, 496, null);
                    CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
                    if (creativeInfo != null && (creationId = creativeInfo.getCreationId()) != null) {
                        str2 = AVExternalServiceImpl.LIZ().configService().cacheConfig().duetCreativeDir(creationId);
                    } else {
                        str2 = null;
                    }
                    StringBuilder LIZJ = C278817o.LIZJ(str2);
                    LIZJ.append(C43075GvP.LIZ(".mp4"));
                    String sb = LIZJ.toString();
                    C78966Uyw.LJJJJZ(new File(sb));
                    data.putExtra("extra_edit_preview_info", new C149505tq(720, 1280, 12).LIZ(new EditVideoSegment(sb, null, videoFileInfo2)));
                    data.putExtra("photo_canvas_data", canvasVideoData);
                    data.putExtra("voice_volume", 1.0f);
                    CreativeModel creativeModel = shortVideoContext.creativeModel;
                    o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
                    C78996UzQ.LJJIZ(data, creativeModel);
                    HZV.LIZ().LJJ(activity, data);
                    activity.overridePendingTransition(R.anim.t, R.anim.t);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Intent createIntent(Activity activity, Intent intent, ShortVideoContext shortVideoContext) {
        Serializable serializable;
        C43832HIe.LIZLLL(activity, shortVideoContext);
        intent.putExtra("extract_model", shortVideoContext.cameraComponentModel.extractFramesModel);
        intent.putExtra("extra_is_sound_loop", shortVideoContext.cameraComponentModel.isLoopSwitchOn);
        C43722HDy c43722HDy = shortVideoContext.shareContext;
        if (c43722HDy != null) {
            intent.putExtra("extra_share_context", c43722HDy);
        }
        intent.putExtra("extra_is_simple_shoot_mode", shortVideoContext.isSimpleShootMode);
        SingleImageCoverBitmapData singleImageCoverBitmapData = shortVideoContext.singleImageCoverBitmapData;
        if (singleImageCoverBitmapData != null) {
            o.LJII(singleImageCoverBitmapData, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("key_choose_media_item_cover_bitmap_data", (Parcelable) singleImageCoverBitmapData);
        }
        intent.putExtra("content_type", "video");
        intent.putExtra("content_source", "upload");
        intent.putExtra("creation_id", shortVideoContext.LJI());
        intent.putExtra("shoot_mode", shortVideoContext.shootMode);
        intent.putExtra("origin", 0);
        intent.putExtra("comment_video_model", shortVideoContext.commentVideoModel);
        intent.putExtra("workspace", shortVideoContext.cameraComponentModel.mWorkspace);
        intent.putExtra("commerce_data_in_tools_line", shortVideoContext.extraSession.commerceData);
        intent.putExtra("extra_request_code", 12346);
        intent.putExtra("micro_app_info", shortVideoContext.microAppModel);
        intent.putExtra("shoot_way", shortVideoContext.shootWay);
        intent.putExtra("video_title_chain", shortVideoContext.chain);
        intent.putExtra("video_title", shortVideoContext.chain);
        List<AVTextExtraStruct> list = shortVideoContext.structList;
        if (list instanceof Serializable) {
            serializable = (Serializable) list;
        } else {
            serializable = null;
        }
        intent.putExtra("struct_list", serializable);
        if (shortVideoContext.LJJJI()) {
            DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
            o.LJIIIIZZ(duetContext, "shortVideoContext.duetContext");
            String str = duetContext.duetVideoPath;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = duetContext.duetAudioPath;
            if (str3 != null) {
                str2 = str3;
            }
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) new DuetExtraInfo(str, str2, duetContext.duetVideoWidth, duetContext.duetVideoHeight, duetContext.duetLayoutMode, duetContext.layoutDirection));
            intent.putExtra("duet_from", duetContext.duetFromAwemeId);
        }
        DraftEditTransferModel draftEditTransferModel = shortVideoContext.draftEditTransferModel;
        if (draftEditTransferModel != null) {
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        intent.putExtra("duet_author", shortVideoContext.duetFromUser);
        intent.putExtra("duet_hash_tag", shortVideoContext.cameraComponentModel.duetContext.duetFromChallengeName);
        intent.putExtra("question_answer_video_model", shortVideoContext.qaStruct);
        V16.LJJJLL(intent, shortVideoContext);
        return intent;
    }
}
