package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5RQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEModel nLEModel, final WM7 scene) {
        o.LJIIIZ(scene, "scene");
        final ArrayList arrayList = new ArrayList();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList LIZ2 = C07080Po.LIZ(tracks, "nleModel.tracks");
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            NLETrack next = it.next();
            if (C124574uj.LJJL(next)) {
                LIZ2.add(next);
            }
        }
        Iterator it2 = LIZ2.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
            while (it3.hasNext()) {
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(it3.next().LJI());
                if (LJJ != null) {
                    String path = LJJ.LJ().LIZJ();
                    if (!arrayList.contains(path)) {
                        o.LJIIIIZZ(path, "path");
                        arrayList.add(path);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!(scene instanceof VideoEditContainerScene) && !(scene instanceof EditorProScene)) {
            return;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            final String str = (String) it4.next();
            if (C5RS.LIZ()) {
                C44687HgJ.LIZ(str, new InterfaceC44688HgK() { // from class: X.5RR
                    @Override // X.InterfaceC44688HgK
                    public final void LIZ(Object obj) {
                        if (obj != null && (obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
                            C5RQ.LIZIZ(WM7.this, str, arrayList);
                        }
                    }
                });
            } else if (!C44687HgJ.LIZIZ(str)) {
                LIZIZ(scene, str, arrayList);
            }
        }
    }

    public static void LIZIZ(WM7 wm7, String str, List list) {
        Activity activity = wm7.mActivity;
        if (activity == null) {
            return;
        }
        C24540xm.LIZ(R.string.s9d, activity, 1040);
        C5HW c5hw = C5HW.LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("video/pip file not exist: ");
        LIZ2.append(str);
        LIZ2.append("; total files: ");
        LIZ2.append(list);
        H7C.LIZLLL(c5hw, "video", X1D.LIZIZ(LIZ2), null, 8);
    }
}
