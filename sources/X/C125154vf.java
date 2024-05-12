package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125154vf {
    public final ActivityC45651qj LIZ;
    public final boolean LIZIZ;
    public final C62822Ol8 LIZJ;

    public final EditorProContext LIZIZ() {
        return (EditorProContext) this.LIZJ.getValue();
    }

    public final C125974wz LIZJ() {
        long LJIJJLI = C79057V0z.LJIJJLI(LIZIZ()) * 1000;
        List LJJIII = C17J.LJJIII(LIZLLL());
        ArrayList arrayList = new ArrayList();
        Iterator it = LJJIII.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((NLETrack) it.next()).LJIILLIIL(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) it2.next();
                if (Math.abs(nLETimeSpaceNode.getEndTime() - LJIJJLI) < 100 * 1000 && LJIJJLI > nLETimeSpaceNode.getStartTime()) {
                    LJIJJLI = nLETimeSpaceNode.getEndTime();
                    break;
                }
            } else if (LJIJJLI == 1000) {
                LJIJJLI = 0;
            }
        }
        if (LJFF(LJIJJLI)) {
            return null;
        }
        long LJ = LJ(LJIJJLI);
        if (LJ < 0) {
            return null;
        }
        return new C125974wz(EnumC126774yH.ADD, LJIJJLI, LJ, 2);
    }

    public final NLEModel LIZLLL() {
        return C79057V0z.LJJI(LIZIZ());
    }

    public final long LJ(long j) {
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            long LIZLLL = C124574uj.LIZLLL(LIZLLL()) - j;
            if (LIZLLL / 1000 < ((Number) C5BA.LIZ(EnumC127484zQ.VIDEO_CLIP_MIN_DURATION, 100L)).longValue()) {
                C78920UyC.LIZLLL(R.string.ca4, this.LIZ, 6007);
                return -1L;
            }
            return LIZLLL;
        }
        return Long.MAX_VALUE;
    }

    public final boolean LJFF(long j) {
        int i;
        List<NLETrack> LJIILIIL = C124574uj.LJIILIIL(LIZLLL());
        if (!(LJIILIIL instanceof Collection) || !LJIILIIL.isEmpty()) {
            for (NLETrack nLETrack : LJIILIIL) {
                if (!nLETrack.LJIILL().isEmpty()) {
                    VecNLETrackSlotSPtr LJIILL = nLETrack.LJIILL();
                    if (!LJIILL.isEmpty()) {
                        Iterator<NLETrackSlot> it = LJIILL.iterator();
                        while (it.hasNext()) {
                            if (it.next().getEndTime() > j) {
                                break;
                            }
                        }
                    }
                }
                return false;
            }
        }
        if (!LJIILIIL.isEmpty()) {
            i = ((NLETimeSpaceNode) ORZ.LLFF(LJIILIIL)).getLayer() + 1;
        } else {
            i = 0;
        }
        if (i >= C123254sb.LIZ) {
            C78920UyC.LIZLLL(R.string.flf, this.LIZ, 1059);
            return true;
        }
        return false;
    }

    public C125154vf(C29S activity, boolean z) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = activity;
        this.LIZIZ = z;
        this.LIZJ = C221108m2.LIZIZ(C123514t1.LJLIL);
    }

    public final OSZ LIZ(NLETrackSlot nLETrackSlot, boolean z) {
        OSZ<NLETrack, NLETrackSlot> LJJIII = LIZIZ().getEditor().LJJIII(nLETrackSlot, EnumC124724uy.NONE);
        C124614un.LIZLLL(LIZLLL(), EnumC123864ta.EFFECT);
        if (!z) {
            C79057V0z.LJIILL(LIZIZ(), C6YK.LIZ(new C139795eB(EnumC126814yL.DELETE.getNameId(), null, null, null, null, 30)));
        } else {
            C79057V0z.LJIIL(LIZIZ());
        }
        LIZIZ().getPlayer().pause();
        return LJJIII;
    }
}
