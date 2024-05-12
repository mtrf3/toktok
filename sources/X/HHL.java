package X;

import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public abstract class HHL {
    public final HHM LIZ;
    public int LIZIZ = -999;
    public int LIZJ = -999;

    public abstract HHW LIZJ(VideoPublishEditModel videoPublishEditModel);

    public abstract HHW LIZLLL(VideoPublishEditModel videoPublishEditModel);

    public HHL(HHM hhm) {
        this.LIZ = hhm;
    }

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        String audioUrl = videoPublishEditModel.veAudioRecorderParam.getAudioUrl();
        VoiceConversionModel voiceConversionModel = videoPublishEditModel.creativeModel.voiceConversionModel;
        if (voiceConversionModel.hasDubVoiceConversion && C44687HgJ.LIZIZ(voiceConversionModel.originalRecordPath)) {
            return videoPublishEditModel.creativeModel.voiceConversionModel.originalRecordPath;
        }
        return audioUrl;
    }

    public void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (this.LIZ.LJLJI.length() > 0 && !C44687HgJ.LIZIZ(this.LIZ.LJLJI)) {
            C44687HgJ.LJFF(this.LIZ.LJLJI, false);
        }
        if (this.LIZ.LJLILLLLZI.length() > 0 && !C44687HgJ.LIZIZ(this.LIZ.LJLILLLLZI)) {
            C44687HgJ.LJFF(this.LIZ.LJLILLLLZI, false);
        }
    }
}
