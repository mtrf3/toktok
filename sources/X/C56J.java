package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.audiorecord.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.56J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56J {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrack LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                LIZ2.add(next);
            }
        }
        NLETrack nLETrack = (NLETrack) ORZ.LJLLLLLL(0, ORZ.LLILII(new IDComparatorS30S0000000_2(7), LIZ2));
        if (nLETrack == null) {
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            ArrayList LIZ3 = C07080Po.LIZ(tracks2, "model.tracks");
            Iterator<NLETrack> it3 = tracks2.iterator();
            while (it3.hasNext()) {
                NLETrack next2 = it3.next();
                NLETrack it4 = next2;
                o.LJIIIIZZ(it4, "it");
                if (C124574uj.LJJJJLI(true, it4)) {
                    LIZ3.add(next2);
                }
            }
            Iterator it5 = LIZ3.iterator();
            int i = -1;
            while (it5.hasNext()) {
                i = Math.max(((NLETimeSpaceNode) it5.next()).getLayer(), i);
            }
            NLETrack nLETrack2 = new NLETrack();
            nLETrack2.setEnable(false);
            nLETrack2.LJJ(false);
            nLETrack2.setLayer(i + 1);
            nLETrack2.LJIL(EnumC123864ta.AUDIO);
            nLETrack2.setExtra("AudioTrackType", "AUDIO_RECORD");
            nLEModel.addTrack(nLETrack2);
            return nLETrack2;
        }
        return nLETrack;
    }

    public static NLETrackSlot LIZ(C5D4 c5d4, int i) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        int y = ((Point) c5d4.LJLJI).getY() - ((Point) c5d4.LJLJI).getX();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.LJIIJJI("Record");
        nLEResourceAV.LJIILIIL(EnumC123874tb.RECORD);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = y;
        nLEResourceAV.setDuration(timeUnit.toMicros(j));
        nLEResourceAV.LJIIIZ(c5d4.LJLILLLLZI);
        nLESegmentAudio.LJIILL(nLEResourceAV);
        nLESegmentAudio.LJIJJLI(0L);
        nLESegmentAudio.LJIJJ(timeUnit.toMicros(j));
        nLESegmentAudio.LJIJI(false);
        nLETrackSlot.LJIIL(nLESegmentAudio);
        nLETrackSlot.setStartTime(((Point) c5d4.LJLJI).getX() * 1000);
        nLETrackSlot.setExtra("audio_record_order", String.valueOf(i));
        return nLETrackSlot;
    }

    public static String LIZJ(String audioPath, Point point, C56Q fileManager) {
        o.LJIIIZ(audioPath, "audioPath");
        o.LJIIIZ(fileManager, "fileManager");
        String LIZ2 = fileManager.LIZ("split1");
        String LIZ3 = fileManager.LIZ("split2");
        String[] strArr = {LIZ2, LIZ3, fileManager.LIZ("split3")};
        int[] iArr = {point.getX(), point.getY()};
        long currentTimeMillis = System.currentTimeMillis();
        int nativeSplitVideo = TEVideoUtils.nativeSplitVideo(audioPath, strArr, iArr, true);
        long currentTimeMillis2 = System.currentTimeMillis();
        C5HV c5hv = C5HV.LIZIZ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("split audio cost: ");
        LIZ4.append(currentTimeMillis2 - currentTimeMillis);
        LIZ4.append("ms  VEUtils.splitVideo res:");
        LIZ4.append(nativeSplitVideo);
        H7C.LJI(4, "music", null, X1D.LIZIZ(LIZ4));
        if (nativeSplitVideo == 0) {
            return LIZ3;
        }
        H7C.LIZLLL(c5hv, KMP.LJ("VEUtils.splitVideo error, return:", nativeSplitVideo), null, null, 12);
        return "";
    }
}
