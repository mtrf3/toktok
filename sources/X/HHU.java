package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VEUtils;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHU extends HHL {
    public String LIZLLL;

    public HHU(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        super.LIZIZ(videoPublishEditModel);
        StitchParams stitchParams = videoPublishEditModel.stitchParams;
        String str2 = null;
        if (stitchParams != null) {
            str = stitchParams.getConcatAudioPath();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = videoPublishEditModel.audioPath();
        } else {
            StitchParams stitchParams2 = videoPublishEditModel.stitchParams;
            if (stitchParams2 != null) {
                str2 = stitchParams2.getConcatAudioPath();
            }
        }
        this.LIZLLL = str2;
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
        return new HHW("StitchSeparator", enumC43804HHc, EnumC43804HHc.NO_NEEDED, enumC43804HHc2, this.LIZIZ);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        EnumC43804HHc enumC43804HHc;
        Object obj;
        EnumC43804HHc enumC43804HHc2;
        int i;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        boolean z2 = false;
        if (videoPublishEditModel.stitchParams == null || this.LIZLLL == null) {
            EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.NO_NEEDED;
            int i2 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("model.stitchParams == null: ");
            if (videoPublishEditModel.stitchParams == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            LIZ.append("  mediaFile == null: ");
            if (this.LIZLLL == null) {
                z2 = true;
            }
            LIZ.append(z2);
            return new HHW("StitchSeparator", enumC43804HHc3, enumC43804HHc3, enumC43804HHc3, i2, X1D.LIZIZ(LIZ));
        }
        EnumC43804HHc enumC43804HHc4 = EnumC43804HHc.NO_NEEDED;
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        String str = videoPublishEditModel.nleData;
        if (str == null || str.length() == 0) {
            EnumC43804HHc enumC43804HHc5 = EnumC43804HHc.ABSENCE;
            return new HHW("StitchSeparator", enumC43804HHc5, enumC43804HHc5, enumC43804HHc5, -1, "nleModel is null or emtpy");
        }
        if (videoPublishEditModel.hasOriginalSound() && videoPublishEditModel.voiceVolume != 0.0f) {
            enumC43804HHc4 = C44687HgJ.LIZIZ(this.LIZLLL) ? EnumC43804HHc.EXIT : EnumC43804HHc.ABSENCE;
        }
        String outputPath = videoPublishEditModel.mEncodedAudioOutputFile;
        C43803HHb c43803HHb = C43803HHb.LJLIL;
        C43806HHe c43806HHe = C43806HHe.LJLIL;
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
        C126694y9.LIZ(outputPath, copyNLEModel, c43806HHe, c43803HHb, 0, 0, 16000, null, 432);
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        if (enumC43804HHc2 == EnumC43804HHc.EXIT) {
            i = 0;
        } else {
            i = -1;
        }
        this.LIZIZ = i;
        return new HHW("StitchSeparator", enumC43804HHc4, enumC43804HHc, enumC43804HHc2, i, "hasOriginalSound = " + videoPublishEditModel.hasOriginalSound() + " \n voiceVolume: " + videoPublishEditModel.voiceVolume);
    }
}
