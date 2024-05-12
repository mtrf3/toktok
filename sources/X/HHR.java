package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHR extends HHL {
    public HHR(HHM hhm) {
        super(hhm);
    }

    public static List LJFF(VideoPublishEditModel videoPublishEditModel) {
        List<AutoCutMediaModel> LJIIZILJ = C45087Hml.LJIIZILJ(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJIIZILJ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AutoCutMediaModel) next).isVideoType) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startSimple");
        StringBuilder sb = new StringBuilder("AutoCutSoundSeparator StartSimple \n");
        if (!C45087Hml.LIZ(videoPublishEditModel)) {
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startSimple not needUploadAudio");
            this.LIZIZ = 0;
            EnumC43804HHc enumC43804HHc2 = EnumC43804HHc.NO_NEEDED;
            return new HHW("AutoCutSoundSeparator", enumC43804HHc2, enumC43804HHc2, enumC43804HHc2, 0);
        }
        List LJFF = LJFF(videoPublishEditModel);
        int size = ((ArrayList) LJFF).size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[2];
        float[] fArr = new float[size];
        StringBuilder LJI = JBR.LJI("AutoCutSoundSeparator startSimple needUploadAudio: fileListExist = ", LJ(LJFF, strArr, jArr, jArr2, fArr, jArr3, sb), "\nvideoList = ");
        C45243HpH.LIZIZ(LJI, ORZ.LLD(LJFF, null, null, null, HHX.LJLIL, 31), LJI);
        this.LIZIZ = VEUtils.detachAudioFromVideos(videoPublishEditModel.mEncodedAudioOutputFile, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutSoundSeparator startSimple needUploadAudio: encodeResult = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", file = ");
        LIZ.append(videoPublishEditModel.mEncodedAudioOutputFile);
        LIZ.append(", exist? ");
        LIZ.append(C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile));
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.NO_NEEDED;
        int i = this.LIZIZ;
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "processExtra.toString()");
        return new HHW("AutoCutSoundSeparator", enumC43804HHc3, enumC43804HHc3, enumC43804HHc, i, sb2);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        EnumC43804HHc enumC43804HHc3;
        EnumC43804HHc enumC43804HHc4;
        EnumC43804HHc enumC43804HHc5;
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startWithEditAudioRecord");
        if (C45087Hml.LIZ(videoPublishEditModel)) {
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutSoundSeparator startWithEditAudioRecord need upload original audio");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutSoundSeparator VoiceVolume: ");
            LIZ.append(videoPublishEditModel.voiceVolume);
            LIZ.append(" \n");
            StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
            List LJFF = LJFF(videoPublishEditModel);
            int size = ((ArrayList) LJFF).size();
            String[] strArr = new String[size];
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            long[] jArr3 = new long[2];
            float[] fArr = new float[size];
            StringBuilder LJI = JBR.LJI("AutoCutSoundSeparator startWithEditAudioRecord need upload original audio: fileListExist = ", LJ(LJFF, strArr, jArr, jArr2, fArr, jArr3, sb), "\nvideoList = ");
            LJI.append(ORZ.LLD(LJFF, null, null, null, HHY.LJLIL, 31));
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LJI));
            StringBuilder LIZ2 = X1D.LIZ();
            String LIZLLL = C72545SdZ.LIZLLL(LIZ2, this.LIZ.LJLILLLLZI, "_autocut", LIZ2);
            if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
                enumC43804HHc = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc = EnumC43804HHc.ABSENCE;
            }
            this.LIZIZ = VEUtils.detachAudioFromVideos(LIZLLL, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AutoCutSoundSeparator startWithEditAudioRecord need upload original audio: detachAudioFromVideos: encodeResult = ");
            LIZ3.append(this.LIZIZ);
            LIZ3.append(", file = ");
            LIZ3.append(LIZLLL);
            LIZ3.append(", exist? ");
            LIZ3.append(C44687HgJ.LIZIZ(LIZLLL));
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ3));
            if (C44687HgJ.LIZIZ(LIZLLL)) {
                enumC43804HHc2 = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc2 = EnumC43804HHc.ABSENCE;
            }
            ArrayList LIZIZ = C05040Hs.LIZIZ(LIZLLL);
            LIZIZ.add(HHL.LIZ(videoPublishEditModel));
            this.LIZJ = VEUtils.mixAudio(LIZIZ, videoPublishEditModel.mEncodedAudioOutputFile, null);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("AutoCutSoundSeparator startWithEditAudioRecord need upload original audio: mixAudio: mixResult = ");
            LIZ4.append(this.LIZJ);
            LIZ4.append(", file = ");
            LIZ4.append(videoPublishEditModel.mEncodedAudioOutputFile);
            LIZ4.append(", exist? ");
            LIZ4.append(C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile));
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ4));
            C39579Fg7.LJIL(LIZLLL);
            if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
                enumC43804HHc3 = EnumC43804HHc.EXIT;
            } else {
                enumC43804HHc3 = EnumC43804HHc.ABSENCE;
            }
            int i = this.LIZIZ;
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "processExtra.toString()");
            return new HHW("AutoCutSoundSeparator", enumC43804HHc2, enumC43804HHc, enumC43804HHc3, i, sb2);
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("AutoCutSoundSeparator startWithEditAudioRecord need not upload original audio: audio record = ");
        LIZ5.append(HHL.LIZ(videoPublishEditModel));
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ5));
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc4 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc4 = EnumC43804HHc.ABSENCE;
        }
        this.LIZIZ = VEUtils.transCodeAudio(HHL.LIZ(videoPublishEditModel), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("AutoCutSoundSeparator startWithEditAudioRecord need not upload original audio: encodeResult = ");
        LIZ6.append(this.LIZIZ);
        LIZ6.append(", file = ");
        LIZ6.append(videoPublishEditModel.mEncodedAudioOutputFile);
        LIZ6.append(", exist? ");
        LIZ6.append(C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile));
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ6));
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc5 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc5 = EnumC43804HHc.ABSENCE;
        }
        return new HHW("AutoCutSoundSeparator", EnumC43804HHc.NO_NEEDED, enumC43804HHc4, enumC43804HHc5, this.LIZIZ);
    }

    public static boolean LJ(List list, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3, StringBuilder sb) {
        int size = ((ArrayList) list).size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) ListProtector.get(list, i);
            boolean LIZIZ = C44687HgJ.LIZIZ(autoCutMediaModel.filePath);
            if (LIZIZ && z) {
                z = true;
            } else {
                z = false;
            }
            StringBuilder LJ = C7MY.LJ("index = ", i, ", path = ");
            LJ.append(autoCutMediaModel.filePath);
            LJ.append(", file status: ");
            LJ.append(LIZIZ);
            LJ.append(" \n");
            sb.append(X1D.LIZIZ(LJ));
            strArr[i] = autoCutMediaModel.filePath;
            long j = autoCutMediaModel.cutStartTime;
            jArr[i] = j;
            jArr2[i] = j + autoCutMediaModel.cutDuration;
            fArr[i] = autoCutMediaModel.speed;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
        return z;
    }
}
