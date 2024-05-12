package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4rB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122374rB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String changedPath, NLEEditor nleEditor) {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        VecNLETrackSlotSPtr LJIILL;
        Object obj;
        long j;
        NLETrackSlot nLETrackSlot;
        NLEResourceNode LIZIZ;
        o.LJIIIZ(changedPath, "changedPath");
        o.LJIIIZ(nleEditor, "nleEditor");
        if (changedPath.length() == 0 || !C30581Hy.LJII(changedPath) || (tracks = nleEditor.LJ().getTracks()) == null || (nLETrack = (NLETrack) ORZ.LJLLLLLL(0, tracks)) == null || (LJIILL = nLETrack.LJIILL()) == null) {
            return;
        }
        Iterator LIZJ = C141415gn.LIZJ(nleEditor, "nleEditor.model.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack2 = (NLETrack) obj;
        if (nLETrack2 == null) {
            nLETrack2 = new NLETrack();
            nLETrack2.setExtra("AudioTrackType", EnumC122254qz.ORIGIN_VOICE_CONVERSION.name());
            nLETrack2.setStartTime(0L);
            nLETrack2.setEndTime(-2L);
            nleEditor.LJ().addTrack(nLETrack2);
        }
        Iterator<NLETrackSlot> it = LJIILL.iterator();
        while (it.hasNext()) {
            NLETrackSlot targetSlot = it.next();
            o.LJIIIIZZ(targetSlot, "targetSlot");
            NLESegment LJI = targetSlot.LJI();
            if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                j = LIZIZ.getDuration();
            } else {
                j = 0;
            }
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(targetSlot.LJI());
            if (LJJ == null) {
                nLETrackSlot = null;
            } else {
                nLETrackSlot = new NLETrackSlot();
                NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                nLEResourceAV.LJIILIIL(EnumC123874tb.AUDIO);
                nLEResourceAV.setDuration(j);
                nLEResourceAV.LJIIIZ(changedPath);
                nLESegmentAudio.LJIILL(nLEResourceAV);
                nLESegmentAudio.LJIJJLI(LJJ.LJIILIIL());
                nLESegmentAudio.LJIJJ(LJJ.LJIIL());
                nLESegmentAudio.LJIL(LJJ.LJIILJJIL());
                nLESegmentAudio.LJIJI(true);
                nLESegmentAudio.setSpeed(LJJ.getSpeed());
                nLETrackSlot.LJIIL(nLESegmentAudio);
                nLETrackSlot.setStartTime(targetSlot.getStartTime());
                nLETrackSlot.setEndTime(targetSlot.getEndTime());
                targetSlot.setExtra("extra_associated_vc_slot_id", nLETrackSlot.getUUID());
            }
            nLETrack2.LIZIZ(nLETrackSlot);
            NLESegmentVideo.LJJ(targetSlot.LJI()).LJJIIJZLJL(false);
            NLESegment LJI2 = targetSlot.LJI();
            if (LJI2 != null) {
                C124574uj.LJJLIIIJJI(LJI2, 0.0f);
            }
            targetSlot.removeExtraWithKey("extra_voice_change_effect_name");
            targetSlot.removeExtraWithKey("extra_voice_chang_effect_id");
            targetSlot.removeExtraWithKey("extra_voice_chang_effect_anchor_name");
            targetSlot.removeExtraWithKey("extra_voice_chang_effect_icon_url");
            targetSlot.removeExtraWithKey("extra_voice_chang_effect_resource_id");
            targetSlot.removeExtraWithKey("extra_voice_change_creator_id");
            targetSlot.removeExtraWithKey("extra_voice_change_creator_username");
        }
        nleEditor.LIZIZ();
    }
}
