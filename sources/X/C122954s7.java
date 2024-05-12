package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4s7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122954s7 {
    public static final /* synthetic */ int LIZ = 0;

    public static final OSZ<Boolean, Integer> LIZ(int i, String str, boolean z) {
        C126344xa.LIZ("begin processNLEDraftFile");
        if (i >= 0 && i < 1) {
            if (z) {
                C126344xa.LIZ("upgradeNLEDraftFrom0To1 is advance draft");
            } else if (!C44687HgJ.LIZIZ(str)) {
                C126344xa.LIZ("upgradeNLEDraftFrom0To1 file not exists");
            } else {
                C5K0.LIZIZ();
                NLEEditor nLEEditor = new NLEEditor();
                String LJIJI = C39579Fg7.LJIJI(str);
                if (LJIJI == null) {
                    LJIJI = "";
                }
                nLEEditor.LJI(LJIJI);
                C122964s8 log = C122964s8.LJLIL;
                o.LJIIIZ(log, "log");
                ArrayList arrayList = new ArrayList();
                NLEModel LJ = nLEEditor.LJ();
                o.LJIIIIZZ(LJ, "nleEditor.model");
                VecNLEResourceNodeSPtr allResources = LJ.getAllResources();
                o.LJIIIIZZ(allResources, "nleEditor.model.allResources");
                Iterator<NLEResourceNode> it = allResources.iterator();
                while (it.hasNext()) {
                    NLEResourceNode next = it.next();
                    NLEResourceAV LJIILL = NLEResourceAV.LJIILL(next);
                    if (LJIILL != null) {
                        if (NLEEditorJniJNI.NLEResourceAV_hasFileInfo(LJIILL.LIZJ, LJIILL) && !TextUtils.isEmpty(LJIILL.LJIILLIIL()) && !C44687HgJ.LIZIZ(LJIILL.LJIILLIIL())) {
                            String LJIILLIIL = LJIILL.LJIILLIIL();
                            o.LJIIIIZZ(LJIILLIIL, "it.fileInfo");
                            arrayList.add(LJIILLIIL);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("lost file ");
                            LIZ2.append(LJIILL.LJIILLIIL());
                            log.invoke(X1D.LIZIZ(LIZ2));
                        }
                        if (NLEEditorJniJNI.NLEResourceAV_hasReverseResourceFile(LJIILL.LIZJ, LJIILL) && !TextUtils.isEmpty(LJIILL.LJIJ()) && !C44687HgJ.LIZIZ(LJIILL.LJIJ())) {
                            String LJIJ = LJIILL.LJIJ();
                            o.LJIIIIZZ(LJIJ, "it.reverseResourceFile");
                            arrayList.add(LJIJ);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("lost file ");
                            LIZ3.append(LJIILL.LJIJ());
                            log.invoke(X1D.LIZIZ(LIZ3));
                        }
                    }
                    if (next.LJII() && !TextUtils.isEmpty(next.LIZJ()) && !C44687HgJ.LIZIZ(next.LIZJ())) {
                        String LIZJ = next.LIZJ();
                        o.LJIIIIZZ(LIZJ, "nleResourceNode.resourceFile");
                        arrayList.add(LIZJ);
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("lost file ");
                        LIZ4.append(next.LIZJ());
                        log.invoke(X1D.LIZIZ(LIZ4));
                    }
                }
                if (!arrayList.isEmpty()) {
                    C126344xa.LIZ("upgradeNLEDraftFrom0To1 nleData has lost file, remove nleData");
                    C44687HgJ.LJIILJJIL(str);
                }
            }
            i = 1;
        }
        return new OSZ<>(Boolean.TRUE, Integer.valueOf(i));
    }
}
