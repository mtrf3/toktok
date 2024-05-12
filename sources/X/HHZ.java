package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;

/* loaded from: classes8.dex */
public final class HHZ extends HHL {
    public HHZ(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        this.LIZIZ = 0;
        EnumC43804HHc enumC43804HHc = EnumC43804HHc.NO_NEEDED;
        return new HHW("MVSeparator", enumC43804HHc, enumC43804HHc, enumC43804HHc, 0);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        this.LIZIZ = VEUtils.transCodeAudio(HHL.LIZ(videoPublishEditModel), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        return new HHW("MVSeparator", EnumC43804HHc.NO_NEEDED, enumC43804HHc, enumC43804HHc2, this.LIZIZ);
    }
}
