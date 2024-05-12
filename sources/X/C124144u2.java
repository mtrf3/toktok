package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124144u2 {
    public static final C124144u2 LIZ = new C124144u2();
    public static boolean LIZIZ;

    public static void LIZ(NLEResourceNode nLEResourceNode) {
        String LIZJ;
        if (nLEResourceNode == null || !C47261Igj.LJJIJIIJI(EnumC123874tb.VIDEO, EnumC123874tb.IMAGE).contains(nLEResourceNode.LJFF()) || (LIZJ = nLEResourceNode.LIZJ()) == null || LIZJ.length() == 0 || C44687HgJ.LIZIZ(nLEResourceNode.LIZJ())) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("NLEModel resource file ");
        LIZ2.append(nLEResourceNode.LIZJ());
        LIZ2.append(" not exists");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static final void LIZIZ(NLEModel nleModel) {
        int i;
        o.LJIIIZ(nleModel, "nleModel");
        if (LIZIZ) {
            return;
        }
        if (nleModel.getMainTrack() != null) {
            VecNLEResourceNodeSPtr allResources = nleModel.getAllResources();
            o.LJIIIIZZ(allResources, "nleModel.allResources");
            Iterator<NLEResourceNode> it = allResources.iterator();
            while (it.hasNext()) {
                NLEResourceNode next = it.next();
                LIZ.getClass();
                if (next != null) {
                    if (C126204xM.LIZ()) {
                        LIZ(next);
                    }
                    EnumC123874tb LJFF = next.LJFF();
                    if (LJFF == null) {
                        i = -1;
                    } else {
                        i = C124134u1.LIZ[LJFF.ordinal()];
                    }
                    if (i != 1) {
                        if (i == 2 && C44687HgJ.LIZIZ(next.LIZJ()) && !C44687HgJ.LJIIJJI(next.LIZJ())) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("File path is ");
                            LIZ2.append(next.LIZJ());
                            LIZ2.append(" but NLEResType is image");
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
                        }
                    } else if (C44687HgJ.LIZIZ(next.LIZJ()) && C44687HgJ.LJIIJJI(next.LIZJ())) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("File path is ");
                        LIZ3.append(next.LIZJ());
                        LIZ3.append(" but NLEResType is video");
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ3));
                    }
                    C60903NvH.LJIIJJI().LJJIIJ();
                }
            }
            return;
        }
        throw new IllegalArgumentException("nleModel must have mainTrack.");
    }
}
