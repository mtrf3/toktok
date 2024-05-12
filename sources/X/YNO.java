package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YNO extends AbstractC65781Prl implements InterfaceC88474Ynu<C87612Ya0, java.util.Set<C87612Ya0>, Boolean, InterfaceC88472Yns<? super C87612Ya0, ? extends C76800UCe>, C76800UCe> {
    public static final YNO LJLIL = new YNO();

    public YNO() {
        super(4);
    }

    public static void LIZ(C87612Ya0 startNode, java.util.Set traveled, boolean z, InterfaceC88472Yns action) {
        o.LJIIIZ(startNode, "startNode");
        o.LJIIIZ(traveled, "traveled");
        o.LJIIIZ(action, "action");
        if (!traveled.contains(startNode)) {
            if (z || startNode.LIZJ().LIZIZ) {
                traveled.add(startNode);
                action.invoke(startNode);
                if (z || (startNode.LIZJ() instanceof C87595YZj)) {
                    Iterator<C87612Ya0> it = startNode.LIZ.LIZIZ.iterator();
                    while (it.hasNext()) {
                        LIZ(it.next(), traveled, z, action);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC88474Ynu
    public final /* bridge */ /* synthetic */ C76800UCe invoke(C87612Ya0 c87612Ya0, java.util.Set<C87612Ya0> set, Boolean bool, InterfaceC88472Yns<? super C87612Ya0, ? extends C76800UCe> interfaceC88472Yns) {
        LIZ(c87612Ya0, set, bool.booleanValue(), interfaceC88472Yns);
        return C76800UCe.LIZ;
    }
}
