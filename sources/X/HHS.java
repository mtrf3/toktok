package X;

import android.util.Pair;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHS extends HHL {
    public VERecordData LIZLLL;

    public final VERecordData LJ() {
        VERecordData vERecordData = this.LIZLLL;
        if (vERecordData != null) {
            return vERecordData;
        }
        o.LJIJI("recordData");
        throw null;
    }

    public HHS(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        super.LIZIZ(videoPublishEditModel);
        MultiEditVideoRecordData multiEditVideoRecordData = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData;
        o.LJIIIIZZ(multiEditVideoRecordData, "model.multiEditVideoReco…rMultiEditVideoRecordData");
        this.LIZLLL = C46104I7o.LJIIJJI(multiEditVideoRecordData);
        Pair<Integer, Integer> playInOutTime = videoPublishEditModel.multiEditVideoRecordData.curMultiEditVideoRecordData.getPlayInOutTime();
        o.LJIIIIZZ(playInOutTime, "model.multiEditVideoReco…oRecordData.playInOutTime");
        LJ().setTimeRange(((Number) playInOutTime.first).longValue() * 1000, ((Number) playInOutTime.second).longValue() * 1000);
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        if (C44687HgJ.LIZIZ(LJ().concatAudio)) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        this.LIZIZ = VEUtils.getAudioFromRecordData(videoPublishEditModel.mEncodedAudioOutputFile, LJ(), 1, 88200, 44100);
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        return new HHW("RecordVideoSeparator", enumC43804HHc, EnumC43804HHc.NO_NEEDED, enumC43804HHc2, this.LIZIZ);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        boolean z;
        EnumC43804HHc enumC43804HHc2;
        EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.NO_NEEDED;
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z || !videoPublishEditModel.hasOriginalSound()) {
            this.LIZIZ = VEUtils.transCodeAudio(HHL.LIZ(videoPublishEditModel), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            if (C44687HgJ.LIZIZ(LJ().concatAudio)) {
                enumC43804HHc3 = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc3 = EnumC43804HHc.ABSENCE;
            }
            StringBuilder LIZ = X1D.LIZ();
            String LIZLLL = C72545SdZ.LIZLLL(LIZ, this.LIZ.LJLILLLLZI, "_a", LIZ);
            this.LIZIZ = VEUtils.getAudioFromRecordData(LIZLLL, LJ(), 1, 88200, 44100);
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
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("hasOriginalSound = ");
        LIZ2.append(videoPublishEditModel.hasOriginalSound());
        LIZ2.append(" \n voiceVolume: ");
        LIZ2.append(videoPublishEditModel.voiceVolume);
        return new HHW("RecordVideoSeparator", enumC43804HHc3, enumC43804HHc, enumC43804HHc2, i, X1D.LIZIZ(LIZ2));
    }
}
