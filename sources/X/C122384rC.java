package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4rC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122384rC {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrackSlot LIZIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        Iterator<NLETrackSlot> it = nLEModel.getMainTrack().LJIILLIIL().iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            if (next.getStartTime() == nLETrackSlot.getStartTime()) {
                return next;
            }
        }
        return null;
    }

    public static NLETrackSlot LIZJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        NLETrack LIZIZ = C141335gf.LIZIZ(nLEModel);
        if (LIZIZ != null) {
            Iterator<NLETrackSlot> it = LIZIZ.LJIILLIIL().iterator();
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                if (next.getStartTime() == nLETrackSlot.getStartTime()) {
                    return next;
                }
            }
            return null;
        }
        return null;
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, NLEModel nLEModel, boolean z) {
        NLETrackSlot nLETrackSlot2;
        Object obj;
        float f;
        NLETrackSlot LIZJ;
        NLESegment LJI;
        String associatedId = nLETrackSlot.getExtra("extra_associated_vc_slot_id");
        o.LJIIIIZZ(associatedId, "associatedId");
        if (associatedId.length() == 0) {
            return;
        }
        Iterator LIZJ2 = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (true) {
            nLETrackSlot2 = null;
            if (LIZJ2.hasNext()) {
                obj = LIZJ2.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack == null) {
            return;
        }
        Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            NLETrackSlot next = it.next();
            if (o.LJ(next.getUUID(), associatedId)) {
                nLETrackSlot2 = next;
                break;
            }
        }
        NLETrackSlot nLETrackSlot3 = nLETrackSlot2;
        if (nLETrackSlot3 == null) {
            return;
        }
        nLETrackSlot.removeExtraWithKey("extra_associated_vc_slot_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_effect_name");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_anchor_name");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_icon_url");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_resource_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_creator_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_creator_username");
        nLETrack.LJIJJLI(nLETrackSlot3);
        if (nLETrack.LJIILL().isEmpty()) {
            nLEModel.removeTrack(nLETrack);
        }
        if (z) {
            NLESegmentVideo.LJJ(nLETrackSlot.LJI()).LJJIIJZLJL(true);
        } else {
            NLESegment LJI2 = nLETrackSlot3.LJI();
            if (LJI2 != null) {
                f = C124574uj.LJJIIZI(LJI2);
            } else {
                f = 0.0f;
            }
            NLESegment LJI3 = nLETrackSlot.LJI();
            if (LJI3 != null) {
                C124574uj.LJJLIIIJJI(LJI3, f);
            }
        }
        if (C124574uj.LJJIJIIJIL(nLETrackSlot) && (LIZJ = LIZJ(nLEModel, nLETrackSlot)) != null && (LJI = LIZJ.LJI()) != null) {
            NLESegment LJI4 = nLETrackSlot.LJI();
            o.LJIIIIZZ(LJI4, "slot.mainSegment");
            C124574uj.LJJLIIIJJI(LJI, C124574uj.LJJIIZI(LJI4));
        }
    }
}
