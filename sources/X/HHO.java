package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHO extends HHL {
    public HHO(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        String LJ = LJ(videoPublishEditModel);
        if (LJ == null || LJ.length() == 0) {
            EnumC43804HHc enumC43804HHc = EnumC43804HHc.ABSENCE;
            return new HHW("UploadDuetSeparator", enumC43804HHc, EnumC43804HHc.NO_NEEDED, enumC43804HHc, this.LIZIZ);
        }
        if (o.LJ(LJ, "TYPE_IMG")) {
            EnumC43804HHc enumC43804HHc2 = EnumC43804HHc.NO_NEEDED;
            return new HHW("UploadDuetSeparator", enumC43804HHc2, enumC43804HHc2, enumC43804HHc2, this.LIZIZ);
        }
        C44687HgJ.LIZLLL(LJ, videoPublishEditModel.mEncodedAudioOutputFile);
        EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.EXIT;
        return new HHW("UploadDuetSeparator", enumC43804HHc3, EnumC43804HHc.NO_NEEDED, enumC43804HHc3, this.LIZIZ);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        String LIZ = HHL.LIZ(videoPublishEditModel);
        if (LIZ.length() == 0) {
            EnumC43804HHc enumC43804HHc2 = EnumC43804HHc.ABSENCE;
            return new HHW("UploadDuetSeparator", enumC43804HHc2, enumC43804HHc2, enumC43804HHc2, this.LIZIZ);
        }
        String LJ = LJ(videoPublishEditModel);
        if (LJ == null || LJ.length() == 0) {
            EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.EXIT;
            EnumC43804HHc enumC43804HHc4 = EnumC43804HHc.ABSENCE;
            return new HHW("UploadDuetSeparator", enumC43804HHc3, enumC43804HHc4, enumC43804HHc4, this.LIZIZ);
        }
        if (o.LJ(LJ, "TYPE_IMG")) {
            C44687HgJ.LIZLLL(LIZ, videoPublishEditModel.mEncodedAudioOutputFile);
        } else {
            this.LIZIZ = VEUtils.mixAudio(C47261Igj.LJII(LIZ, LJ), videoPublishEditModel.mEncodedAudioOutputFile, null);
        }
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        EnumC43804HHc enumC43804HHc5 = EnumC43804HHc.EXIT;
        return new HHW("UploadDuetSeparator", enumC43804HHc5, enumC43804HHc5, enumC43804HHc, this.LIZIZ);
    }

    public final String LJ(VideoPublishEditModel videoPublishEditModel) {
        List<String> sourceInfo;
        String str;
        long j;
        float f;
        CanvasExtra extra;
        CanvasExtra extra2;
        CanvasExtra extra3;
        CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData == null || (sourceInfo = canvasVideoData.getSourceInfo()) == null || (str = (String) ListProtector.get(sourceInfo, 0)) == null || str.length() == 0 || !C44687HgJ.LIZIZ(str)) {
            return null;
        }
        C43117Gw5.LIZ.getClass();
        if (C43117Gw5.LJIIIZ(str)) {
            return "TYPE_IMG";
        }
        CanvasVideoData canvasVideoData2 = videoPublishEditModel.canvasVideoData;
        long j2 = 0;
        if (canvasVideoData2 != null && (extra3 = canvasVideoData2.getExtra()) != null) {
            j = extra3.getStartTime();
        } else {
            j = 0;
        }
        CanvasVideoData canvasVideoData3 = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData3 != null && (extra2 = canvasVideoData3.getExtra()) != null) {
            j2 = extra2.getEndTime();
        }
        CanvasVideoData canvasVideoData4 = videoPublishEditModel.canvasVideoData;
        if (canvasVideoData4 != null && (extra = canvasVideoData4.getExtra()) != null) {
            f = extra.getSpeed();
        } else {
            f = 1.0f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJLJI);
        LIZ.append("main_audio_");
        LIZ.append(System.currentTimeMillis());
        String LIZIZ = X1D.LIZIZ(LIZ);
        this.LIZIZ = VEUtils.detachAudioFromVideos(LIZIZ, new String[]{str}, new long[]{Long.valueOf(j).longValue()}, new long[]{Long.valueOf(j2).longValue()}, -1L, -1L, ORY.LJJLIIJ(new Float[]{Float.valueOf(f)}), 1, 88200, 44100);
        if (!C44687HgJ.LIZIZ(LIZIZ)) {
            return null;
        }
        return LIZIZ;
    }
}
