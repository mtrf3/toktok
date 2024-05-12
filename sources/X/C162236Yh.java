package X;

import Y.ACallableS105S0100000_2;
import Y.ARunnableS0S0500000_2;
import Y.ARunnableS13S0300000_2;
import Y.ARunnableS2S1300000_2;
import Y.AgS120S0100000_2;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162236Yh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC142865j8 interfaceC142865j8, Runnable runnable) {
        if (interfaceC142865j8.LIZLLL()) {
            runnable.run();
        } else {
            C10K.LIZJ(new ACallableS105S0100000_2(interfaceC142865j8, 2)).LJ(new AgS120S0100000_2(runnable, 4), C10K.LJIIIIZZ, null);
        }
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        String str2;
        String contentSource;
        C145995oB LIZ2 = C279017q.LIZ(videoPublishEditModel, "model");
        LIZ2.LJI("creation_id", videoPublishEditModel.getCreationId());
        LIZ2.LJI("enter_from", str);
        LIZ2.LJI("shoot_way", videoPublishEditModel.mShootWay);
        AVETParameter avetParameter = videoPublishEditModel.getAvetParameter();
        String str3 = "";
        if (avetParameter == null || (str2 = avetParameter.getStoryShootEntrance()) == null) {
            str2 = "";
        }
        LIZ2.LJI("shoot_entrance", str2);
        LIZ2.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        AVETParameter avetParameter2 = videoPublishEditModel.getAvetParameter();
        if (avetParameter2 != null && (contentSource = avetParameter2.getContentSource()) != null) {
            str3 = contentSource;
        }
        LIZ2.LJI("content_source", str3);
        LIZ2.LJI("after_post", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("click_cover_entrance", LIZ2.LIZ);
        videoPublishEditModel.creativeModel.postPageModel.clickCover = System.currentTimeMillis();
        PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
        postPageModel.getClass();
        postPageModel.coverEnterFrom = str;
    }

    public static void LIZJ(VideoPublishEditModel model, String str) {
        o.LJIIIZ(model, "model");
        model.creativeModel.transientPostPageModel.LIZ = System.currentTimeMillis();
        PostPageModel postPageModel = model.creativeModel.postPageModel;
        postPageModel.getClass();
        postPageModel.previewEnterFrom = str;
        C145995oB c145995oB = new C145995oB();
        Q8U.LIZJ(c145995oB, "original_resolution", C44384HbQ.LJJLIIIJLJLI(model), model, "creation_id");
        c145995oB.LJI("enter_from", str);
        c145995oB.LJI("shoot_way", model.mShootWay);
        c145995oB.LJI("shoot_entrance", model.getAvetParameter().getStoryShootEntrance());
        c145995oB.LJI("content_source", H7R.LJJIFFI(model));
        c145995oB.LJI("content_type", H7R.LJIIIZ(model));
        c145995oB.LJI("route", "1");
        c145995oB.LJI("after_post", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("click_preview_entrance", c145995oB.LIZ);
    }

    public static void LIZLLL(final ActivityC45651qj activityC45651qj, final W5G w5g, final VideoPublishEditModel videoPublishEditModel) {
        List<String> sourceInfo;
        if (activityC45651qj == null) {
            return;
        }
        if (H7R.LJJJJL(videoPublishEditModel)) {
            if (C39579Fg7.LIZIZ(videoPublishEditModel.getVideoCoverPath())) {
                String videoCoverPath = videoPublishEditModel.getVideoCoverPath();
                if (videoCoverPath != null) {
                    C78764Uvg.LJIIIZ(w5g, android.net.Uri.fromFile(new File(videoCoverPath)).toString(), -1, -1);
                    return;
                }
                return;
            }
            C152915zL.LIZIZ(videoPublishEditModel, new AqS133S0200000_2(w5g, videoPublishEditModel, 8));
            return;
        }
        boolean z = false;
        if (C79004UzY.LJJIIZI(videoPublishEditModel.canvasVideoData) || C79004UzY.LJJIL(videoPublishEditModel.canvasVideoData)) {
            String videoCoverPath2 = videoPublishEditModel.getVideoCoverPath();
            if (videoCoverPath2 == null) {
                return;
            }
            if (!C44687HgJ.LIZIZ(videoCoverPath2)) {
                CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
                if (canvasVideoData != null && (sourceInfo = canvasVideoData.getSourceInfo()) != null && !sourceInfo.isEmpty()) {
                    videoCoverPath2 = (String) ListProtector.get(sourceInfo, 0);
                }
                PublishPreviewModel publishPreviewModel = videoPublishEditModel.creativeModel.publishPreviewModel;
                publishPreviewModel.getClass();
                o.LJIIIZ(videoCoverPath2, "<set-?>");
                publishPreviewModel.firstFramePath = videoCoverPath2;
            }
            if (GWL.LIZ()) {
                C78764Uvg.LIZJ(w5g, C44694HgQ.LJIIIIZZ(videoCoverPath2), -1, -1);
                return;
            }
            Bitmap decodeBitmap = BitmapUtils.decodeBitmap(new File(videoCoverPath2));
            if (decodeBitmap == null || decodeBitmap.isRecycled()) {
                return;
            }
            w5g.setImageBitmap(decodeBitmap);
            return;
        }
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            if (str == null) {
                str = "";
            }
            PublishPreviewModel publishPreviewModel2 = videoPublishEditModel.creativeModel.publishPreviewModel;
            publishPreviewModel2.getClass();
            publishPreviewModel2.firstFramePath = str;
            if (C39579Fg7.LIZIZ(str)) {
                w5g.post(new ARunnableS2S1300000_2(activityC45651qj, w5g, videoPublishEditModel, str, 0));
                return;
            }
            return;
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            if (H7R.LJJJJLI(videoPublishEditModel) || videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() || videoPublishEditModel.getOriginal() == 2 || videoPublishEditModel.isSoundSyncFromAnchor() || H7R.LJJLIIIJL(videoPublishEditModel) || H7R.LJJJIL(videoPublishEditModel) || videoPublishEditModel.getEditorProModel().getFromEditorProAnchor()) {
                if (TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.coverImagePath)) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
                    CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                    multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
                }
                String str2 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
                o.LJIIIIZZ(str2, "model.multiEditVideoRecordData.coverImagePath");
                if (C39579Fg7.LIZIZ(str2)) {
                    w5g.post(new ARunnableS2S1300000_2(activityC45651qj, w5g, videoPublishEditModel, str2, 0));
                    PublishPreviewModel publishPreviewModel3 = videoPublishEditModel.creativeModel.publishPreviewModel;
                    publishPreviewModel3.getClass();
                    publishPreviewModel3.firstFramePath = str2;
                    return;
                }
                return;
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            o.LJIIIIZZ(curMultiEditVideoRecordData, "model.curMultiEditVideoRecordData");
            VERecordData LJIIJJI = C46104I7o.LJIIJJI(curMultiEditVideoRecordData);
            Pair<Integer, Integer> playInOutTime = videoPublishEditModel.getCurMultiEditVideoRecordData().getPlayInOutTime();
            o.LJIIIIZZ(playInOutTime, "model.curMultiEditVideoRecordData.playInOutTime");
            LJIIJJI.setTimeRange(((Number) playInOutTime.first).intValue() * 1000, ((Number) playInOutTime.second).intValue() * 1000);
            w5g.post(new ARunnableS0S0500000_2(LJIIJJI, playInOutTime, videoPublishEditModel, w5g, activityC45651qj, 0));
            return;
        }
        if (videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.isUploadDuetMode()) {
            String videoCoverPath3 = videoPublishEditModel.getVideoCoverPath();
            if (videoCoverPath3 != null && C39579Fg7.LIZIZ(videoCoverPath3)) {
                w5g.post(new ARunnableS2S1300000_2(activityC45651qj, w5g, videoPublishEditModel, videoCoverPath3, 0));
                PublishPreviewModel publishPreviewModel4 = videoPublishEditModel.creativeModel.publishPreviewModel;
                publishPreviewModel4.getClass();
                publishPreviewModel4.firstFramePath = videoCoverPath3;
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(videoPublishEditModel.getEffectList());
        EffectPointModel timeEffect = videoPublishEditModel.getTimeEffect();
        if (timeEffect != null) {
            arrayList.add(timeEffect);
            z = o.LJ(timeEffect.getKey(), "1");
        }
        C43679HCh.LIZ(arrayList, H7R.LIZLLL(videoPublishEditModel, C44172HVg.LJJ.LJIILL().LJI()).getFilterFolder(), videoPublishEditModel.mSelectedFilterIntensity, (int) (videoPublishEditModel.mVideoCoverStartTm * 1000), z, videoPublishEditModel.getPreviewInfo(), videoPublishEditModel.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() { // from class: X.6YV
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
                C78920UyC.LIZLLL(R.string.jei, activityC45651qj, 2008);
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                o.LJIIIZ(bitmap, "bitmap");
                Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel, bitmap);
                C1M5 c1m5 = new C1M5(activityC45651qj.getResources(), LIZJ);
                c1m5.LIZJ(KL2.LIZJ(C44172HVg.LIZ, 4.0f));
                w5g.setImageDrawable(c1m5);
                C43679HCh.LIZIZ(LIZJ, null, videoPublishEditModel.getVideoCoverPath());
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                PublishPreviewModel publishPreviewModel5 = videoPublishEditModel2.creativeModel.publishPreviewModel;
                String videoCoverPath4 = videoPublishEditModel2.getVideoCoverPath();
                if (videoCoverPath4 == null) {
                    videoCoverPath4 = "";
                }
                publishPreviewModel5.getClass();
                publishPreviewModel5.firstFramePath = videoCoverPath4;
            }
        });
    }

    public static final void LJFF(ActivityC45651qj activityC45651qj, C164096cH iv, VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(iv, "iv");
        LIZ(C60903NvH.LJIIJJI().getPublishService().LJFF().LIZIZ(), new ARunnableS13S0300000_2(activityC45651qj, iv, model, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if ((!r8.mIsFromDraft) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(X.ActivityC45651qj r7, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r8, boolean r9, X.C164096cH r10, X.InterfaceC162316Yp r11) {
        /*
            java.lang.String r0 = "callback"
            r6 = r11
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            r3 = r10
            if (r3 != 0) goto La
            return
        La:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.6aW r0 = r0.getPublishService()
            X.6Yj r2 = r0.LJFF()
            r4 = r8
            if (r4 != 0) goto L28
            boolean r0 = X.C142975jJ.LIZ()
            if (r0 == 0) goto L27
            android.app.Application r1 = X.C44172HVg.LIZ
            r0 = 2131834436(0x7f113644, float:1.9301982E38)
            X.KL2.LIZLLL(r0, r1)
        L27:
            return
        L28:
            if (r9 == 0) goto L4d
            r2.getClass()
            boolean r0 = r4.mIsFromDraft
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L4d
        L34:
            boolean r0 = X.C142975jJ.LIZ()
            r5 = r7
            if (r0 != 0) goto L49
            boolean r0 = X.H7R.LJJLIIIJJIZ(r4)
            if (r0 != 0) goto L49
            boolean r0 = r4.isCurrentAutoCutMode()
            if (r0 == 0) goto L4f
            if (r1 != 0) goto L4f
        L49:
            X.C44729Hgz.LJJJ(r5, r3, r4, r6)
            goto L27
        L4d:
            r1 = 0
            goto L34
        L4f:
            boolean r0 = r4.isCurrentAutoCutMode()
            if (r0 == 0) goto L65
            if (r1 == 0) goto L75
            X.5jA r0 = r2.LIZIZ()
            Y.ARunnableS6S0400000_2 r2 = new Y.ARunnableS6S0400000_2
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            LIZ(r0, r2)
            goto L27
        L65:
            if (r1 == 0) goto L75
            X.5jA r2 = r2.LIZIZ()
            Y.ARunnableS13S0300000_2 r1 = new Y.ARunnableS13S0300000_2
            r0 = 1
            r1.<init>(r5, r3, r4, r0)
            LIZ(r2, r1)
            goto L27
        L75:
            LIZLLL(r5, r3, r4)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162236Yh.LJ(X.1qj, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, X.6cH, X.6Yp):void");
    }
}
