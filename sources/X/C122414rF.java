package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4rF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122414rF extends AbstractC65781Prl implements InterfaceC88472Yns<C122034qd, C76800UCe> {
    public static final C122414rF LJLIL = new C122414rF();

    public C122414rF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C122034qd c122034qd) {
        C122034qd editorPro = c122034qd;
        o.LJIIIZ(editorPro, "editorPro");
        long currentTimeMillis = System.currentTimeMillis();
        C83964WxM c83964WxM = C83964WxM.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioFadeoutRefactor || clearNLEAudioFadeoutFilter start: ");
        LIZ.append(currentTimeMillis);
        c83964WxM.LIZ(X1D.LIZIZ(LIZ));
        C124454uX.LJI.getClass();
        NLEModel LJ = editorPro.LJIIJ.LJ();
        o.LJIIIIZZ(LJ, "editorPro.editor.model");
        VecNLETrackSPtr tracks = LJ.getTracks();
        o.LJIIIIZZ(tracks, "editorPro.editor.model.tracks");
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            NLETrack it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (it2.LJIIZILJ() == EnumC123864ta.VIDEO || it2.LJIIZILJ() == EnumC123864ta.AUDIO) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            NLETrack track = (NLETrack) it3.next();
            C124454uX.LJI.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) C124454uX.LIZLLL.getValue();
            o.LJIIIIZZ(track, "track");
            ArrayList arrayList2 = (ArrayList) linkedHashMap.get(track.getUUID());
            if (arrayList2 != null) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    track.LJIJI((NLEFilter) it4.next());
                }
            }
        }
        editorPro.LJIIJ.LIZIZ();
        C83964WxM c83964WxM2 = C83964WxM.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AudioFadeoutRefactor || clearNLEAudioFadeoutFilter cost: ");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ2.append("ms");
        c83964WxM2.LIZ(X1D.LIZIZ(LIZ2));
        return C76800UCe.LIZ;
    }
}
