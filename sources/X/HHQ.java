package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHQ extends HHL {
    public HHQ(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        EnumC43804HHc enumC43804HHc;
        StringBuilder sb = new StringBuilder("StartSimple \n");
        if (H7R.LJJJJLI(videoPublishEditModel)) {
            sb.append("Resource from : mediaListExcludeImage \n");
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            o.LJIIIIZZ(previewInfo, "model.previewInfo");
            videoList = C78687UuR.LIZLLL(previewInfo);
        } else {
            sb.append("Resource from : videoList \n");
            videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        }
        int size = videoList.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        o.LJIIIIZZ(previewInfo2, "model.previewInfo");
        boolean LJ = LJ(previewInfo2, videoList, strArr, jArr, jArr2, fArr, jArr3, sb);
        this.LIZIZ = VEUtils.detachAudioFromVideos(videoPublishEditModel.mEncodedAudioOutputFile, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
        String LJJJJLL = ORY.LJJJJLL(strArr, ", ", null, null, null, 62);
        String LJJJJLI = ORY.LJJJJLI(jArr);
        String LJJJJLI2 = ORY.LJJJJLI(jArr2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("outputAudio: ");
        YE1.LIZLLL(LIZ, videoPublishEditModel.mEncodedAudioOutputFile, ", inputVideos: ", LJJJJLL, ", trimIns: ");
        YE1.LIZLLL(LIZ, LJJJJLI, ", trimOuts: ", LJJJJLI2, ", trimIn: ");
        LIZ.append(jArr3[0]);
        LIZ.append(", trimOut: ");
        LIZ.append(jArr3[1]);
        LIZ.append(", ratio: ");
        LIZ.append(fArr);
        LIZ.append(", channels: 1, bitRate: 88200, sampleRate: 44100");
        String LIZIZ = X1D.LIZIZ(LIZ);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(1, "method");
        c145995oB.LIZLLL("scenario", "AudioAudit");
        c145995oB.LIZ(this.LIZIZ, "status");
        c145995oB.LJ("frame_exist", LJ);
        c145995oB.LIZLLL("params", LIZIZ);
        FMX.LJIIL("ve_audio_frame", c145995oB.LIZ);
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        EnumC43804HHc enumC43804HHc2 = EnumC43804HHc.NO_NEEDED;
        int i = this.LIZIZ;
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "processExtra.toString()");
        return new HHW("FastImportSeparator", enumC43804HHc2, enumC43804HHc2, enumC43804HHc, i, sb2);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceVolume: ");
        LIZ.append(videoPublishEditModel.voiceVolume);
        LIZ.append(" \n");
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        if (H7R.LJJJJLI(videoPublishEditModel)) {
            sb.append("Resource from : mediaListExcludeImage \n");
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            o.LJIIIIZZ(previewInfo, "model.previewInfo");
            videoList = C78687UuR.LIZLLL(previewInfo);
        } else {
            sb.append("Resource from : videoList \n");
            videoList = videoPublishEditModel.getPreviewInfo().getVideoList();
        }
        int size = videoList.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
        o.LJIIIIZZ(previewInfo2, "model.previewInfo");
        LJ(previewInfo2, videoList, strArr, jArr, jArr2, fArr, jArr3, sb);
        StringBuilder LIZ2 = X1D.LIZ();
        String LIZLLL = C72545SdZ.LIZLLL(LIZ2, this.LIZ.LJLILLLLZI, "_a", LIZ2);
        EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.NO_NEEDED;
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f) {
            this.LIZIZ = VEUtils.transCodeAudio(HHL.LIZ(videoPublishEditModel), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            this.LIZIZ = VEUtils.detachAudioFromVideos(LIZLLL, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
            if (C44687HgJ.LIZIZ(LIZLLL)) {
                enumC43804HHc3 = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc3 = EnumC43804HHc.ABSENCE;
            }
            ArrayList LIZIZ = C05040Hs.LIZIZ(LIZLLL);
            LIZIZ.add(HHL.LIZ(videoPublishEditModel));
            this.LIZJ = VEUtils.mixAudio(LIZIZ, videoPublishEditModel.mEncodedAudioOutputFile, null);
            C39579Fg7.LJIL(LIZLLL);
        }
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        int i = this.LIZIZ;
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "processExtra.toString()");
        return new HHW("FastImportSeparator", enumC43804HHc3, enumC43804HHc, enumC43804HHc2, i, sb2);
    }

    public static boolean LJ(EditPreviewInfo editPreviewInfo, List list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3, StringBuilder sb) {
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(list, i);
            boolean LIZIZ = C44687HgJ.LIZIZ(editVideoSegment.getVideoPath());
            if (LIZIZ && z) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LJ = C7MY.LJ("index = ", i, ", path = ");
            LJ.append(editVideoSegment.getVideoPath());
            LJ.append(", file status: ");
            LJ.append(LIZIZ);
            LJ.append(" \n");
            sb.append(X1D.LIZIZ(LJ));
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                o.LJI(videoCutInfo);
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() <= 0 && editPreviewInfo.getSceneOut() <= 0) {
            jArr3[0] = -1;
            jArr3[1] = -1;
        } else {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
        }
        return z;
    }
}
