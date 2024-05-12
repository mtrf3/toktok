package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHV extends HHL {
    public HHV(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        return LJ(videoPublishEditModel);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        return LJ(videoPublishEditModel);
    }

    public final HHW LJ(VideoPublishEditModel videoPublishEditModel) {
        Object obj;
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        String str = videoPublishEditModel.nleData;
        if (str == null || str.length() == 0) {
            EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.ABSENCE;
            return new HHW("AdvanceEditorSeparator", enumC43804HHc3, enumC43804HHc3, enumC43804HHc3, -1, "nleModel is null or emtpy");
        }
        String outputPath = videoPublishEditModel.mEncodedAudioOutputFile;
        C43802HHa c43802HHa = C43802HHa.LJLIL;
        C43805HHd c43805HHd = C43805HHd.LJLIL;
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(videoPublishEditModel.nleData);
        NLEModel copyNLEModel = NLEModel.dynamicCast(nLEEditor.LJ().getStage().deepClone());
        o.LJIIIIZZ(copyNLEModel, "copyNLEModel");
        C38891fp.LJJIIZ(copyNLEModel);
        Iterator LIZJ = t1.LIZJ(copyNLEModel, "copyNLEModel.tracks");
        do {
            obj = null;
            if (!LIZJ.hasNext()) {
                break;
            }
            obj = LIZJ.next();
        } while (!o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name()));
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null) {
            Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                if (next.hasExtra("extra_origin_voice_file_path") && (LJI = next.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    LIZIZ.LJIIIZ(next.getExtra("extra_origin_voice_file_path"));
                }
            }
        }
        o.LJIIIIZZ(outputPath, "outputPath");
        C126694y9.LIZ(outputPath, copyNLEModel, null, c43802HHa, 1, 88200, 44100, c43805HHd, 256);
        AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
        if (audioRecorderParam != null && audioRecorderParam.hasRecord() && H8T.LIZ()) {
            if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
                enumC43804HHc = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc = EnumC43804HHc.ABSENCE;
            }
        } else {
            enumC43804HHc = EnumC43804HHc.NO_NEEDED;
        }
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        EnumC43804HHc enumC43804HHc4 = EnumC43804HHc.EXIT;
        if (enumC43804HHc2 == enumC43804HHc4) {
            this.LIZIZ = 0;
        } else {
            this.LIZIZ = -1;
        }
        return new HHW("AdvanceEditorSeparator", enumC43804HHc4, enumC43804HHc, enumC43804HHc2, this.LIZIZ, "");
    }
}
