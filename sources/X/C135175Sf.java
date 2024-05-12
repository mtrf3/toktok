package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.5Sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135175Sf {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(VideoPublishEditModel args) {
        VecNLETrackSPtr tracks;
        o.LJIIIZ(args, "args");
        String str = args.nleData;
        if (str == null || str.length() == 0) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(args.nleData);
        NLEModel LJ = nLEEditor.LJ();
        if (LJ == null || (tracks = LJ.getTracks()) == null || tracks.isEmpty()) {
            return;
        }
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
            while (it2.hasNext()) {
                NLETrackSlot next = it2.next();
                if (next != null && next.hasExtra("extra_voice_chang_effect_id")) {
                    String extra = next.getExtra("extra_voice_chang_effect_id");
                    o.LJIIIIZZ(extra, "nleTrackSlot.getExtra(EXTRA_VC_EFFECT_ID)");
                    if (extra.length() > 0 && !linkedHashSet.contains(next.getExtra("extra_voice_chang_effect_id"))) {
                        String voiceId = next.getExtra("extra_voice_chang_effect_id");
                        String creatorId = next.getExtra("extra_voice_change_creator_id");
                        o.LJIIIIZZ(voiceId, "voiceId");
                        linkedHashSet.add(voiceId);
                        o.LJIIIIZZ(creatorId, "creatorId");
                        if (creatorId.length() > 0) {
                            linkedHashSet2.add(creatorId);
                        }
                    }
                }
            }
        }
        args.creativeModel.voiceConversionModel.vcVoiceIDs.clear();
        args.creativeModel.voiceConversionModel.vcCreatorIDs.clear();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            args.creativeModel.voiceConversionModel.vcVoiceIDs.add(it3.next());
        }
        Iterator it4 = linkedHashSet2.iterator();
        while (it4.hasNext()) {
            args.creativeModel.voiceConversionModel.vcCreatorIDs.add(it4.next());
        }
    }
}
