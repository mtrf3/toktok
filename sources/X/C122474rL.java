package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.VecNLEResourceNodeSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122474rL {
    public static void LIZ(NLEModel nLEModel) {
        VecNLEResourceNodeSPtr allResources = nLEModel.getAllResources();
        o.LJIIIIZZ(allResources, "nleModel.allResources");
        Iterator<NLEResourceNode> it = allResources.iterator();
        while (it.hasNext()) {
            NLEResourceNode next = it.next();
            String LIZJ = next.LIZJ();
            if (LIZJ != null && LIZJ.length() != 0) {
                EnumC123874tb enumC123874tb = EnumC123874tb.VIDEO;
                EnumC123874tb enumC123874tb2 = EnumC123874tb.IMAGE;
                if (C47261Igj.LJJIJIIJI(enumC123874tb, enumC123874tb2).contains(next.LJFF()) && C44687HgJ.LIZIZ(next.LIZJ())) {
                    if (C44687HgJ.LJIIJJI(next.LIZJ())) {
                        next.LJIILIIL(enumC123874tb2);
                    } else {
                        next.LJIILIIL(enumC123874tb);
                    }
                }
            }
        }
    }
}
