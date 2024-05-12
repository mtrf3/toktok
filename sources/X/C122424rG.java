package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4rG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122424rG {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILLIIL().iterator();
            while (it.hasNext()) {
                NLETrackSlot mainTrackSlot = it.next();
                o.LJIIIIZZ(mainTrackSlot, "mainTrackSlot");
                if (C124574uj.LJJIJIIJI(mainTrackSlot)) {
                    if (C124574uj.LJJIJIIJIL(mainTrackSlot)) {
                        NLETrackSlot LIZIZ = LIZIZ(nLEModel, mainTrackSlot);
                        if (LIZIZ != null) {
                            arrayList.add(LJFF(LIZIZ));
                        }
                    } else {
                        arrayList.add(LJI(mainTrackSlot));
                    }
                }
            }
        }
        return arrayList;
    }

    public static List LIZJ(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack nLETrack = next;
            if (nLETrack.LJIIZILJ() == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
            while (it3.hasNext()) {
                NLETrackSlot slot = it3.next();
                o.LJIIIIZZ(slot, "slot");
                arrayList.add(slot);
            }
        }
        return arrayList;
    }

    public static List LIZLLL(NLEModel nLEModel) {
        NLEResourceNode LIZIZ;
        String LIZJ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
            while (it3.hasNext()) {
                NLESegment LJI = it3.next().LJI();
                if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null && (LIZJ = LIZIZ.LIZJ()) != null) {
                    linkedHashSet.add(LIZJ);
                }
            }
        }
        return ORZ.LLJI(linkedHashSet);
    }

    public static String LJ(NLETrackSlot slot) {
        NLEResourceNode LIZIZ;
        String extra;
        o.LJIIIZ(slot, "slot");
        String str = null;
        if (!slot.hasExtra("extra_origin_voice_file_path") || (extra = slot.getExtra("extra_origin_voice_file_path")) == null || extra.length() == 0) {
            NLESegment LJI = slot.LJI();
            if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
                str = LIZIZ.LIZJ();
            }
            return str;
        }
        return extra;
    }

    public static NLEModel LJFF(NLETrackSlot slot) {
        o.LJIIIZ(slot, "slot");
        NLEModel nLEModel = new NLEModel();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setEnable(true);
        nLETrack.LJJ(false);
        nLETrack.LJIL(EnumC123864ta.AUDIO);
        nLETrack.setExtra("AudioTrackType", "ORIGIN");
        nLEModel.addTrack(nLETrack);
        nLETrack.LIZIZ(slot);
        return nLEModel;
    }

    public static NLEModel LJI(NLETrackSlot nLETrackSlot) {
        NLEModel nLEModel = new NLEModel();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setExtra("__DEFAULT__", "__DEFAULT__");
        nLETrack.LJJ(true);
        nLETrack.LJIL(EnumC123864ta.VIDEO);
        nLEModel.addTrack(nLETrack);
        nLETrack.LIZIZ(nLETrackSlot);
        return nLEModel;
    }

    public static NLETrackSlot LIZIZ(NLEModel nleModel, NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(nleModel, "nleModel");
        VecNLETrackSPtr tracks = nleModel.getTracks();
        o.LJIIIIZZ(tracks, "nleModel.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJJIZL(it2)) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Iterator<NLETrackSlot> it4 = ((NLETrack) it3.next()).LJIILL().iterator();
            while (it4.hasNext()) {
                NLETrackSlot next2 = it4.next();
                if (next2.getStartTime() == nLETrackSlot.getStartTime() && next2.getEndTime() == nLETrackSlot.getEndTime()) {
                    return next2;
                }
            }
        }
        return null;
    }
}
