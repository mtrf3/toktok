package X;

import Y.IDComparatorS30S0000000_2;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.components.base.model.SelectedMusicInfo;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124604um {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJIJIL(it2)) {
                LIZ2.add(next);
            }
        }
        return LIZ2;
    }

    public static List LIZJ(NLEModel nleModel) {
        o.LJIIIZ(nleModel, "nleModel");
        VecNLETrackSPtr tracks = nleModel.getTracks();
        o.LJIIIIZZ(tracks, "nleModel.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJJLI(true, it2)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static List LIZLLL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJJLL(it2)) {
                LIZ2.add(next);
            }
        }
        return LIZ2;
    }

    public static boolean LJ(NLETrackSlot nLETrackSlot) {
        EnumC123874tb enumC123874tb;
        NLEResourceNode LIZIZ;
        o.LJIIIZ(nLETrackSlot, "<this>");
        NLESegment LJI = nLETrackSlot.LJI();
        if (LJI != null && (LIZIZ = LJI.LIZIZ()) != null) {
            enumC123874tb = LIZIZ.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.RECORD) {
            return true;
        }
        return false;
    }

    public static void LJIIIIZZ(NLEModel nleModel) {
        boolean z;
        o.LJIIIZ(nleModel, "nleModel");
        NLETrack nLETrack = (NLETrack) ORZ.LJLLLL(C32151Nz.LJIL(nleModel));
        if (nLETrack != null && nLETrack.LJIILL().size() == 0) {
            nleModel.removeTrack(nLETrack);
            z = true;
        } else {
            z = false;
        }
        VecNLETrackSPtr tracks = nleModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJJLI(true, it2)) {
                LIZ2.add(next);
            }
        }
        List<NLETimeSpaceNode> LLILII = ORZ.LLILII(new IDComparatorS30S0000000_2(74), LIZ2);
        if (z) {
            for (NLETimeSpaceNode nLETimeSpaceNode : LLILII) {
                nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() - 1);
            }
        }
        Iterator it3 = LLILII.iterator();
        while (it3.hasNext()) {
            NLETrack nLETrack2 = (NLETrack) it3.next();
            if (nLETrack2.LJIILL().size() == 0) {
                nleModel.removeTrack(nLETrack2);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIZ(com.ss.ugc.android.editor.core.EditorProContext r6) {
        /*
            java.lang.String r0 = "editorContext"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            boolean r0 = X.AnonymousClass515.LIZ()
            java.lang.String r3 = "it"
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L99
            java.util.List r0 = X.C32151Nz.LJIJJLI(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L74
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r6)
            int r0 = X.C124574uj.LJIL(r0)
            if (r0 > 0) goto L74
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r6)
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r1 = r0.getTracks()
            java.lang.String r0 = "tracks"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r1.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            boolean r0 = X.C124574uj.LJJIJIL(r0)
            if (r0 == 0) goto L3d
            r4.add(r1)
            goto L3d
        L57:
            java.util.Iterator r2 = r4.iterator()
            r1 = 0
        L5c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r0 = r0.LJIILL()
            int r0 = r0.size()
            int r1 = r1 + r0
            goto L5c
        L72:
            if (r1 <= 0) goto L97
        L74:
            r2 = 1
        L75:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r6)
            int r0 = X.C124574uj.LJIIL(r0)
            if (r0 <= 0) goto L95
            r1 = 1
        L80:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r6)
            int r0 = X.C124574uj.LJJIII(r0)
            if (r0 <= 0) goto L93
            r0 = 1
        L8b:
            if (r2 != 0) goto L91
            if (r1 != 0) goto L91
            if (r0 == 0) goto L92
        L91:
            r5 = 0
        L92:
            return r5
        L93:
            r0 = 0
            goto L8b
        L95:
            r1 = 0
            goto L80
        L97:
            r2 = 0
            goto L75
        L99:
            java.util.List r0 = X.C32151Nz.LJIJJLI(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto La8
            return r4
        La8:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r6)
            java.util.List r0 = LIZLLL(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lbb
            return r4
        Lbb:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C79057V0z.LJJI(r6)
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r1 = r0.getTracks()
            java.lang.String r0 = "nleModel.tracks"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.Iterator r2 = r1.iterator()
        Lcc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le5
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            boolean r0 = X.C124574uj.LJJIJIL(r0)
            if (r0 == 0) goto Lcc
            if (r1 == 0) goto Le5
            return r4
        Le5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124604um.LJIIIZ(com.ss.ugc.android.editor.core.EditorProContext):boolean");
    }

    public static boolean LJFF(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel) {
        int size = videoPublishEditModel.creativeModel.soundEffectInfoModel.soundEffectList.size();
        List LIZLLL = LIZLLL(nLEModel);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LIZLLL, 10));
        Iterator it = ((ArrayList) LIZLLL).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NLETrack) it.next()).LJIILLIIL().size()));
        }
        if (size == ORZ.LLILLIZIL(arrayList)) {
            return true;
        }
        return false;
    }

    public static boolean LJI(NLETrackSlot slot, EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        o.LJIIIZ(slot, "slot");
        NLETrack trackBySlot = C79057V0z.LJJI(editorContext).getTrackBySlot(slot);
        if (trackBySlot != null && (C124574uj.LJJIL(trackBySlot) || C124574uj.LJJJ(trackBySlot))) {
            return true;
        }
        return false;
    }

    public static boolean LJII(NLETrackSlot slot, EditorProContext editorContext) {
        String str;
        o.LJIIIZ(editorContext, "editorContext");
        o.LJIIIZ(slot, "slot");
        NLETrack trackBySlot = C79057V0z.LJJI(editorContext).getTrackBySlot(slot);
        if (trackBySlot != null) {
            str = trackBySlot.getExtra("AudioTrackType");
        } else {
            str = null;
        }
        return o.LJ(str, "SOUND_EFFECT");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SelectedMusicInfo LIZ(String str, String musicLocalPath, String musicId) {
        o.LJIIIZ(musicLocalPath, "musicLocalPath");
        o.LJIIIZ(musicId, "musicId");
        return new SelectedMusicInfo(str, musicLocalPath, musicId, null, 8, 0 == true ? 1 : 0);
    }
}
