package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHP extends HHL {
    public HHP(HHM hhm) {
        super(hhm);
    }

    @Override // X.HHL
    public final HHW LIZJ(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        StringBuilder sb = new StringBuilder("StartSimple \n");
        String str = videoPublishEditModel.mEncodedAudioOutputFile;
        o.LJIIIIZZ(str, "model.mEncodedAudioOutputFile");
        LJ(videoPublishEditModel, str, sb);
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        EnumC43804HHc enumC43804HHc2 = EnumC43804HHc.NO_NEEDED;
        int i = this.LIZIZ;
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "processExtra.toString()");
        return new HHW("LibraryGallerySeparator", enumC43804HHc2, enumC43804HHc2, enumC43804HHc, i, sb2);
    }

    @Override // X.HHL
    public final HHW LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        EnumC43804HHc enumC43804HHc;
        EnumC43804HHc enumC43804HHc2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceVolume: ");
        LIZ.append(videoPublishEditModel.voiceVolume);
        LIZ.append(" \n");
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        if (C44687HgJ.LIZIZ(HHL.LIZ(videoPublishEditModel))) {
            enumC43804HHc = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc = EnumC43804HHc.ABSENCE;
        }
        if (videoPublishEditModel.voiceVolume == 0.0f) {
            this.LIZIZ = VEUtils.transCodeAudio(HHL.LIZ(videoPublishEditModel), videoPublishEditModel.mEncodedAudioOutputFile, 1, 88200);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            String LIZLLL = C72545SdZ.LIZLLL(LIZ2, this.LIZ.LJLILLLLZI, "_a", LIZ2);
            LJ(videoPublishEditModel, LIZLLL, sb);
            int mixAudio = VEUtils.mixAudio(C47261Igj.LJII(LIZLLL, HHL.LIZ(videoPublishEditModel)), videoPublishEditModel.mEncodedAudioOutputFile, null);
            this.LIZJ = mixAudio;
            this.LIZIZ = mixAudio;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("MixResult: ");
            LIZ3.append(this.LIZJ);
            sb.append(X1D.LIZIZ(LIZ3));
            C39579Fg7.LJIL(LIZLLL);
        }
        if (C44687HgJ.LIZIZ(videoPublishEditModel.mEncodedAudioOutputFile)) {
            enumC43804HHc2 = EnumC43804HHc.EXIT;
        } else {
            enumC43804HHc2 = EnumC43804HHc.ABSENCE;
        }
        EnumC43804HHc enumC43804HHc3 = EnumC43804HHc.NO_NEEDED;
        int i = this.LIZIZ;
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "processExtra.toString()");
        return new HHW("LibraryGallerySeparator", enumC43804HHc, enumC43804HHc3, enumC43804HHc2, i, sb2);
    }

    public final void LJ(VideoPublishEditModel videoPublishEditModel, String str, StringBuilder sb) {
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        Integer materialProvider;
        LibraryMaterialInfoSv libraryMaterialInfoSv2;
        Integer materialType;
        MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
        o.LJIIIIZZ(curMultiEditVideoRecordData, "model.curMultiEditVideoRecordData");
        List LJJIJ = C46104I7o.LJJIJ(curMultiEditVideoRecordData);
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CurVideoRecordList size: ");
        ArrayList arrayList = (ArrayList) LJJIJ;
        LIZ.append(arrayList.size());
        LIZ.append('\n');
        sb.append(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("FinalVideoList size: ");
        LIZ2.append(finalVideoList.size());
        LIZ2.append('\n');
        sb.append(X1D.LIZIZ(LIZ2));
        ArrayList arrayList2 = new ArrayList();
        int size = finalVideoList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(finalVideoList, i);
            o.LJIIIIZZ(obj, "finalVideoList[index]");
            if (C76917UGr.LJJJJ((TimeSpeedModelExtension) obj)) {
                Object obj2 = ListProtector.get(finalVideoList, i);
                o.LJIIIIZZ(obj2, "finalVideoList[index]");
                if (!C76917UGr.LJJJIL((TimeSpeedModelExtension) obj2)) {
                }
            }
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(LJJIJ, i);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Record Data Audio Exit: ");
            LIZ3.append(C44687HgJ.LIZIZ(multiEditVideoSegmentRecordData.audioPath));
            sb.append(X1D.LIZIZ(LIZ3));
            arrayList2.add(C46104I7o.LJIIJ(multiEditVideoSegmentRecordData));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) it.next();
            if (multiEditVideoSegmentRecordData2.enable && (libraryMaterialInfoSv = multiEditVideoSegmentRecordData2.libraryMaterialInfo) != null && (materialProvider = libraryMaterialInfoSv.getMaterialProvider()) != null && materialProvider.intValue() == 3 && ((libraryMaterialInfoSv2 = multiEditVideoSegmentRecordData2.libraryMaterialInfo) == null || (materialType = libraryMaterialInfoSv2.getMaterialType()) == null || materialType.intValue() != 3)) {
                if (C44687HgJ.LIZIZ(multiEditVideoSegmentRecordData2.audioPath)) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("Record Data Audio Exit: ");
                    LIZ4.append(C44687HgJ.LIZIZ(multiEditVideoSegmentRecordData2.audioPath));
                    sb.append(X1D.LIZIZ(LIZ4));
                    arrayList2.add(C46104I7o.LJIIJ(multiEditVideoSegmentRecordData2));
                }
            }
        }
        this.LIZIZ = VEUtils.getAudioFromRecordData(str, new VERecordData(arrayList2, videoPublishEditModel.getCurMultiEditVideoRecordData().useMusic), 1, 88200, 44100);
    }
}
