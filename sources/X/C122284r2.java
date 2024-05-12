package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import defpackage.t1;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122284r2 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEEditor nleEditor) {
        NLETrack nLETrack;
        String str;
        Object obj;
        VecNLEFilterSPtr LJIIIZ;
        o.LJIIIZ(nleEditor, "nleEditor");
        VecNLETrackSPtr tracks = nleEditor.LJ().getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null) {
            str = nLETrack2.getUUID();
        } else {
            str = null;
        }
        Iterator LIZJ = C141415gn.LIZJ(nleEditor, "nleEditor.model.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getUUID(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack3 = (NLETrack) obj;
        if (nLETrack3 != null && (LJIIIZ = nLETrack3.LJIIIZ()) != null && str != null) {
            Iterator<NLEFilter> it2 = LJIIIZ.iterator();
            while (it2.hasNext()) {
                String uuid = it2.next().getUUID();
                o.LJIIIIZZ(uuid, "filter.uuid");
                LIZIZ(nleEditor, str, uuid);
            }
            nleEditor.LIZIZ();
        }
    }

    public static String LIZJ(NLEEditor nleEditor) {
        NLETrack nLETrack;
        String uuid;
        Object obj;
        o.LJIIIZ(nleEditor, "nleEditor");
        VecNLETrackSPtr tracks = nleEditor.LJ().getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            if (it.hasNext()) {
                nLETrack = it.next();
                if (o.LJ(nLETrack.getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 == null || (uuid = nLETrack2.getUUID()) == null) {
            return null;
        }
        Iterator LIZJ = C141415gn.LIZJ(nleEditor, "nleEditor.model.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getUUID(), uuid)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLENode nLENode = (NLENode) obj;
        if (nLENode == null) {
            return null;
        }
        String extra = nLENode.getExtra("sound_filter_id");
        o.LJIIIIZZ(extra, "bgmTrack.getExtra(SoundF…tils.SOUND_FILTER_ID_KEY)");
        if (extra.length() > 0 && LIZLLL(nleEditor.LJ())) {
            return nLENode.getExtra("sound_filter_id");
        }
        nLENode.setExtra("sound_filter_id", "");
        return null;
    }

    public static boolean LIZLLL(NLEModel nLEModel) {
        Object obj;
        String str;
        Object obj2;
        if (nLEModel == null) {
            return false;
        }
        Iterator LIZJ = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLENode nLENode = (NLENode) obj;
        if (nLENode != null) {
            str = nLENode.getUUID();
        } else {
            str = null;
        }
        Iterator LIZJ2 = t1.LIZJ(nLEModel, "nleModel.tracks");
        while (true) {
            if (LIZJ2.hasNext()) {
                obj2 = LIZJ2.next();
                if (o.LJ(((NLENode) obj2).getUUID(), str)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj2;
        if (nLETrack == null) {
            return false;
        }
        nLETrack.LJIILL();
        if (nLETrack.LJIILL().size() > 1) {
            return false;
        }
        VecNLEFilterSPtr LJIIIZ = nLETrack.LJIIIZ();
        if (LJIIIZ.size() != 1 || LJIIIZ.get(0) == null) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(NLEEditor nleEditor, String str, String str2) {
        NLEFilter nLEFilter;
        NLETrack nLETrack;
        o.LJIIIZ(nleEditor, "nleEditor");
        VecNLETrackSPtr tracks = nleEditor.LJ().getTracks();
        o.LJIIIIZZ(tracks, "nleEditor.model.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (true) {
            nLEFilter = null;
            if (it.hasNext()) {
                nLETrack = it.next();
                if (o.LJ(nLETrack.getUUID(), str)) {
                    break;
                }
            } else {
                nLETrack = null;
                break;
            }
        }
        NLETrack nLETrack2 = nLETrack;
        if (nLETrack2 != null) {
            Iterator<NLEFilter> it2 = nLETrack2.LJIIIZ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                NLEFilter next = it2.next();
                if (o.LJ(next.getUUID(), str2)) {
                    nLEFilter = next;
                    break;
                }
            }
            NLEFilter nLEFilter2 = nLEFilter;
            if (nLEFilter2 != null) {
                nLETrack2.LJIJI(nLEFilter2);
                nLETrack2.setExtra("sound_filter_id", "");
            }
        }
    }
}
