package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.569, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass569 {
    public static MultiEditVideoRecordData LIZ;
    public static EditorProContext LIZIZ;
    public static VideoPublishEditModel LIZJ;
    public static MultiEditVideoRecordData LIZLLL;
    public static MultiEditVideoRecordData LJ;
    public static ArrayList<TimeSpeedModelExtension> LJFF;
    public static ArrayList<TimeSpeedModelExtension> LJI;
    public static ArrayList<TimeSpeedModelExtension> LJII;
    public static ArrayList<LibraryMaterialInfoSv> LJIIIIZZ = new ArrayList<>();
    public static AVMusic LJIIIZ;
    public static int LJIIJ;
    public static String LJIIJJI;
    public static boolean LJIIL;

    public static ArrayList LIZIZ() {
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        EditorProContext editorProContext = LIZIZ;
        if (editorProContext == null) {
            return null;
        }
        VecNLETrackSPtr sortedTracks = C79057V0z.LJJI(editorProContext).getSortedTracks();
        o.LJIIIIZZ(sortedTracks, "nleModel.sortedTracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = sortedTracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (next.LJIIZILJ() == EnumC123864ta.VIDEO) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it2.next()).LJIILLIIL(), arrayList2);
        }
        List LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(82), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : LLILII) {
            if (((NLENode) obj).hasExtra("library_id")) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it3.next();
            Iterator<LibraryMaterialInfoSv> it4 = LJIIIIZZ.iterator();
            while (true) {
                if (it4.hasNext()) {
                    libraryMaterialInfoSv = it4.next();
                    if (o.LJ(libraryMaterialInfoSv.getId(), nLETrackSlot.getExtra("library_id"))) {
                        break;
                    }
                } else {
                    libraryMaterialInfoSv = null;
                    break;
                }
            }
            LibraryMaterialInfoSv libraryMaterialInfoSv2 = libraryMaterialInfoSv;
            if (libraryMaterialInfoSv2 != null) {
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot.LJI());
                if (LJJ != null) {
                    libraryMaterialInfoSv2.setStartTime(Long.valueOf(LJJ.LJIILIIL()));
                    libraryMaterialInfoSv2.setEndTime(Long.valueOf(LJJ.LJIIL()));
                }
                Integer materialType = libraryMaterialInfoSv2.getMaterialType();
                if (materialType == null || materialType.intValue() != 1) {
                    arrayList5.add(libraryMaterialInfoSv2);
                } else {
                    arrayList4.add(libraryMaterialInfoSv2);
                }
            }
        }
        arrayList4.addAll(arrayList5);
        return C125694wX.LIZ(arrayList4);
    }

    public static String LIZJ(NLEModel nLEModel) {
        NLETrackSlot nLETrackSlot;
        NLESegment nLESegment;
        NLEResourceNode LIZIZ2;
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                LIZ2.add(next);
            }
        }
        NLETrack nLETrack2 = (NLETrack) ORZ.LJLLLL(LIZ2);
        if (nLETrack2 == null || (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILL())) == null || (nLESegment = (NLESegment) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot.LJI())) == null || (LIZIZ2 = nLESegment.LIZIZ()) == null) {
            return null;
        }
        return LIZIZ2.LIZJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r2 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList LIZ(java.util.List r24, com.bytedance.ies.nle.editor_jni.NLETrack r25) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass569.LIZ(java.util.List, com.bytedance.ies.nle.editor_jni.NLETrack):java.util.ArrayList");
    }

    public static void LIZLLL(MultiEditVideoRecordData multiEditVideoRecordData, NLEModel nLEModel) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        int i;
        String LIZJ2;
        MultiEditVideoRecordData multiEditVideoRecordData2 = LIZ;
        String str4 = null;
        if (multiEditVideoRecordData2 != null) {
            str = multiEditVideoRecordData2.concatVideo;
        } else {
            str = null;
        }
        multiEditVideoRecordData.concatVideo = str;
        if (multiEditVideoRecordData2 != null) {
            str2 = multiEditVideoRecordData2.concatAudio;
        } else {
            str2 = null;
        }
        multiEditVideoRecordData.concatAudio = str2;
        if (multiEditVideoRecordData2 != null) {
            str3 = multiEditVideoRecordData2.curRecordingDir;
        } else {
            str3 = null;
        }
        multiEditVideoRecordData.curRecordingDir = str3;
        int i2 = 0;
        if (multiEditVideoRecordData2 != null) {
            z = multiEditVideoRecordData2.hasRetake;
        } else {
            z = false;
        }
        multiEditVideoRecordData.hasRetake = z;
        if (multiEditVideoRecordData2 != null) {
            str4 = multiEditVideoRecordData2.coverPath;
        }
        multiEditVideoRecordData.coverPath = str4;
        if (multiEditVideoRecordData2 != null) {
            z2 = multiEditVideoRecordData2.isSoundLoop;
        } else {
            z2 = false;
        }
        multiEditVideoRecordData.isSoundLoop = z2;
        if (multiEditVideoRecordData2 != null) {
            z3 = multiEditVideoRecordData2.useMusic;
        } else {
            z3 = false;
        }
        multiEditVideoRecordData.useMusic = z3;
        multiEditVideoRecordData.musicPath = LIZJ(nLEModel);
        MultiEditVideoRecordData multiEditVideoRecordData3 = LIZ;
        float f3 = 0.0f;
        if (multiEditVideoRecordData3 != null) {
            f = multiEditVideoRecordData3.leftSlideX;
        } else {
            f = 0.0f;
        }
        multiEditVideoRecordData.leftSlideX = f;
        if (multiEditVideoRecordData3 != null) {
            f3 = multiEditVideoRecordData3.rightSlideX;
        }
        multiEditVideoRecordData.rightSlideX = f3;
        float f4 = 1.0f;
        if (multiEditVideoRecordData3 != null) {
            f2 = multiEditVideoRecordData3.originVolume;
        } else {
            f2 = 1.0f;
        }
        multiEditVideoRecordData.originVolume = f2;
        if (multiEditVideoRecordData3 != null) {
            f4 = multiEditVideoRecordData3.musicVolume;
        }
        multiEditVideoRecordData.musicVolume = f4;
        if (multiEditVideoRecordData3 != null) {
            i = multiEditVideoRecordData3.preVideoDuration;
        } else {
            i = 0;
        }
        multiEditVideoRecordData.preVideoDuration = i;
        if ((multiEditVideoRecordData3 == null || (i2 = multiEditVideoRecordData3.musicDuration) <= 0) && (LIZJ2 = LIZJ(nLEModel)) != null) {
            i2 = HOH.LIZIZ(6, LIZJ2);
        }
        multiEditVideoRecordData.musicDuration = i2;
    }
}
