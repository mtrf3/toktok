package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Rtg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70996Rtg {
    public static final void LIZ(InterfaceC71003Rtn interfaceC71003Rtn, C70858RrS c70858RrS, boolean z, InterfaceC88472Yns<? super InterfaceC71003Rtn, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC71003Rtn, "<this>");
        Stack stack = new Stack();
        while (interfaceC71003Rtn != null && (!z || !(interfaceC71003Rtn instanceof C68212m1))) {
            stack.push(interfaceC71003Rtn);
            interfaceC71003Rtn = interfaceC71003Rtn.preTrackNode();
        }
        while (!stack.isEmpty()) {
            InterfaceC71003Rtn node = (InterfaceC71003Rtn) stack.pop();
            if (interfaceC88472Yns != null) {
                o.LJIIIIZZ(node, "node");
                interfaceC88472Yns.invoke(node);
            }
            o.LJIIIIZZ(node, "node");
            if (C70859RrT.LIZ && c70858RrS.LIZ != null) {
                LaneParams laneParams = new LaneParams();
                AbstractC70995Rtf abstractC70995Rtf = c70858RrS.LIZ;
                o.LJI(abstractC70995Rtf);
                LaneParams LIZIZ = c70858RrS.LIZIZ(abstractC70995Rtf.LIZIZ);
                if (LIZIZ != null) {
                    laneParams.putAll(LIZIZ);
                }
                node.fillNodeParams(c70858RrS);
                AbstractC70995Rtf abstractC70995Rtf2 = c70858RrS.LIZ;
                o.LJI(abstractC70995Rtf2);
                LaneParams LIZIZ2 = c70858RrS.LIZIZ(abstractC70995Rtf2.LIZIZ);
                if (LIZIZ2 != null) {
                    LaneParams laneParams2 = new LaneParams();
                    for (Map.Entry<String, Object> entry : LIZIZ2.entrySet()) {
                        if (laneParams.get((Object) entry.getKey()) == null || !o.LJ(laneParams.get((Object) entry.getKey()), LIZIZ2.get((Object) entry.getKey()))) {
                            laneParams2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    StringBuilder sb = AbstractC70995Rtf.LJII.get(c70858RrS.LIZ);
                    if (sb != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("node ");
                        LIZ.append(node);
                        LIZ.append(" supply params:\n");
                        LIZ.append(C87277YNd.LJJIL(laneParams2));
                        LIZ.append('\n');
                        sb.append(X1D.LIZIZ(LIZ));
                    }
                }
            } else {
                node.fillNodeParams(c70858RrS);
            }
            if (node instanceof InterfaceC37828Esy) {
                Iterator<String> it = node.getRegisteredLane().iterator();
                while (it.hasNext()) {
                    C78915Uy7.LJJIZ(c70858RrS, it.next(), new AqS178S0100000_12(node, 187));
                }
                if (z) {
                    c70858RrS.LIZ(new AqS188S0100000_6(((InterfaceC37828Esy) node).getMapRule(), (java.util.Map<String, String>) 3));
                }
            }
        }
    }
}
