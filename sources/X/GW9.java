package X;

import Y.ARunnableS13S0300000_2;
import Y.ARunnableS26S0200000_7;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.common.BaseShareContext;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.splash.SplashActivity;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GW9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel, String str, String str2) {
        H8E.LJIIIIZZ(new H8E(), activityC45651qj, videoPublishEditModel, false, null, false, null, null, 480);
        if (C78685UuP.LJJJZ(str2)) {
            C44172HVg.LIZJ.getClass();
            Intent intent = new Intent(activityC45651qj, (Class<?>) SplashActivity.class);
            intent.addFlags(603979776);
            Publish.isNeedProcessPublish = true;
            intent.putExtra("extra_cc_failed_draft_key", str);
            intent.putExtra("extra_publish_failed_message", new PublishFailMsg(str2, true, true));
            H7R.LJJLIIJ(intent, videoPublishEditModel);
            C16880lQ.LIZLLL(activityC45651qj, intent);
            return;
        }
        C41359GLb c41359GLb = new C41359GLb("CC publish", false, null, 6);
        GUQ guq = GUH.LJI;
        if (guq != null) {
            GUH.LIZLLL.execute(new ARunnableS26S0200000_7(c41359GLb, guq, 19));
        }
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("extra_stick_point_type", 0);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate());
        Publish.PublishBundle = bundle;
        GI3.LJII(new G8R(activityC45651qj, bundle, null));
        activityC45651qj.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(final ActivityC45651qj activityC45651qj, String str, BaseShareContext baseShareContext, String str2, String str3) {
        String str4;
        boolean z;
        final AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(activityC45651qj, 226);
        final VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.mShootWay = str2;
        videoPublishEditModel.setMusicOrigin(str3);
        C164846dU c164846dU = new C164846dU();
        o.LJII(baseShareContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
        c164846dU.setShareContext((C43722HDy) baseShareContext);
        videoPublishEditModel.creativeFlowData.setExtraShareOptions(c164846dU.getShareContext().mExtraShareOptions);
        videoPublishEditModel.setMainBusinessContext(c164846dU);
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = videoPublishEditModel.creativeFlowData.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos != null) {
            autoSelectedAnchorInfos.setOpenPlatformClientKey(baseShareContext.mClientKey);
            autoSelectedAnchorInfos.setOpenPlatFormExtra(baseShareContext.mOpenPlatformExtra);
            autoSelectedAnchorInfos.setAnchorSourceType(baseShareContext.mAnchorSourceType);
        }
        C42000Ge4.LIZ(videoPublishEditModel, baseShareContext.mPublishSettings);
        videoPublishEditModel.openPlatformExtra = baseShareContext.mOpenPlatformExtra;
        videoPublishEditModel.openPlatformClientKey = baseShareContext.mClientKey;
        videoPublishEditModel.creativeFlowData.setExtraShareOptions(baseShareContext.mExtraShareOptions);
        videoPublishEditModel.creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        int i = 0;
        videoPublishEditModel.mOrigin = 0;
        videoPublishEditModel.mFromCut = true;
        videoPublishEditModel.isFastImport = true;
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return;
        }
        boolean z2 = false;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, new VideoFileInfo(iArr[0], iArr[1], iArr[3], iArr[7], iArr[6], i, i, i, 0.0f, 480, 0 == true ? 1 : 0));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(0L, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0));
        HashMap<String, String> metaData = TEVideoUtils.getMetaData(editVideoSegment.getVideoPath());
        if (metaData.get("LvMetaInfo") != null) {
            str4 = metaData.get("LvMetaInfo");
        } else {
            str4 = "";
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(editVideoSegment);
        videoPublishEditModel.setPreviewInfo(new C6NR(C60903NvH.LJIIJJI().LJJIJLIJ().getVideoWidth(), C60903NvH.LJIIJJI().LJJIJLIJ().getVideoHeight(), 28).LIZ(arrayList));
        videoPublishEditModel.videoWidth();
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[6];
        int i5 = iArr[8];
        long j = iArr[3];
        arrayList2.add(new ImportVideoInfo(i2, i3, i4, i5, str, j, j, str4, objArr3 == true ? 1 : 0, iArr[7], 1.0f, str, str, z2, objArr2 == true ? 1 : 0, 16384, objArr == true ? 1 : 0));
        videoPublishEditModel.importInfoList = arrayList2;
        Workspace LIZ2 = C41727GZf.LIZ(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = LIZ2.LLLLLLLLLL().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = LIZ2.LLLLLLLLL().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = LIZ2.LLJJJIL().getPath();
        videoPublishEditModel.videoCount = 1;
        videoPublishEditModel.voiceVolume = 1.0f;
        videoPublishEditModel.mShootMode = -1;
        videoPublishEditModel.mDuetFrom = null;
        videoPublishEditModel.musicVolume = 1.0f;
        videoPublishEditModel.setNewVersion(3);
        videoPublishEditModel.generateVideoCoverPath();
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        o.LJIIIIZZ(previewInfo, "model.previewInfo");
        MultiEditVideoRecordData LJIIIZ = C46104I7o.LJIIIZ(previewInfo.getVideoList());
        if (LJIIIZ != null) {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                i6 += (int) ((EditVideoSegment) it.next()).getVideoFileInfo().getDuration();
            }
            LJIIIZ.endTime = Math.min(i6, HEL.LIZ());
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (LJIIIZ.segmentDataList.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                LJIIIZ.isSingleVideo = z;
                multiEditVideoStatusRecordData.originMultiEditRecordData = LJIIIZ.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = LJIIIZ;
        }
        videoPublishEditModel.multiEditVideoRecordData = multiEditVideoStatusRecordData;
        C42000Ge4.LJFF(videoPublishEditModel);
        new C140945g2(videoPublishEditModel).LIZJ(false, false);
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        o.LJIIIIZZ(curMultiEditVideoRecordData, "model.curMultiEditVideoRecordData");
        VEUtils.getVideoThumb(C46104I7o.LJIIJJI(curMultiEditVideoRecordData), (int) ((videoPublishEditModel.mVideoCoverStartTm * 1000) + 1), -1, -1, false, new P5A() { // from class: X.6ZF
            @Override // X.P5A
            public final boolean processFrame(ByteBuffer frame, int i7, int i8, int i9) {
                o.LJIIIZ(frame, "frame");
                if (ActivityC45651qj.this == null) {
                    return false;
                }
                Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(frame.position(0));
                Bitmap LIZJ = OUR.LIZJ(videoPublishEditModel, createBitmap);
                new C1M5(ActivityC45651qj.this.getResources(), LIZJ).LIZJ(KL2.LIZJ(ActivityC45651qj.this, 4.0f));
                ExecutorC149205tM.LJLILLLLZI.execute(new ARunnableS13S0300000_2(videoPublishEditModel, LIZJ, aqS173S0100000_7, 15));
                return false;
            }
        });
    }
}
