package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHT extends HHL {
    public String LIZLLL;

    public HHT(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String audioPath;
        super.LIZIZ(videoPublishEditModel);
        if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
            audioPath = videoPublishEditModel.videoPath();
            audioPath.toString();
        } else {
            audioPath = videoPublishEditModel.audioPath();
        }
        this.LIZLLL = audioPath;
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        if (C44687HgJ.LIZIZ(this.LIZLLL)) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        String str = this.LIZLLL;
        if (str != null) {
            this.LIZIZ = VEUtils.transCodeAudio(str, videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        }
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        return new HHW("DefaultSeparator", enumC43804HHc, EnumC43804HHc.NO_NEEDED, enumC43804HHc2, this.LIZIZ);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        if (this.LIZLLL == null) {
            EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.NO_NEEDED;
            return new HHW("DefaultSeparator", enumC43804HHc3, enumC43804HHc3, enumC43804HHc3, this.LIZIZ, "mediaFile == null: true");
        }
        EnumC43804HHc enumC43804HHc4 = EnumC43804HHc.NO_NEEDED;
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        if (!videoPublishEditModel.hasOriginalSound() || videoPublishEditModel.voiceVolume == 0.0f) {
            this.LIZIZ = VEUtils.transCodeAudio(HHL.LIZ(videoPublishEditModel), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            if (C44687HgJ.LIZIZ(this.LIZLLL)) {
                enumC43804HHc4 = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc4 = EnumC43804HHc.ABSENCE;
            }
            this.LIZIZ = -999;
            ArrayList arrayList = new ArrayList();
            String str = this.LIZLLL;
            o.LJI(str);
            arrayList.add(str);
            arrayList.add(HHL.LIZ(videoPublishEditModel));
            this.LIZJ = VEUtils.mixAudio(arrayList, videoPublishEditModel.mEncodedAudioOutputFile, null);
        }
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        int i = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hasOriginalSound = ");
        LIZ.append(videoPublishEditModel.hasOriginalSound());
        LIZ.append(" \n voiceVolume: ");
        LIZ.append(videoPublishEditModel.voiceVolume);
        return new HHW("DefaultSeparator", enumC43804HHc4, enumC43804HHc, enumC43804HHc2, i, X1D.LIZIZ(LIZ));
    }
}
