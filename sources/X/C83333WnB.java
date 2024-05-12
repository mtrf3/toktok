package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WnB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83333WnB implements InterfaceC83334WnC {
    public final /* synthetic */ C83332WnA LIZ;
    public final /* synthetic */ InterfaceC83334WnC LIZIZ;

    public C83333WnB(InterfaceC83334WnC interfaceC83334WnC, C83332WnA c83332WnA) {
        this.LIZ = c83332WnA;
        this.LIZIZ = interfaceC83334WnC;
    }

    @Override // X.InterfaceC83334WnC
    public final void LIZ(EnumC83339WnH clickType, int i) {
        Object obj;
        List<? extends AbstractC83320Wmy> list;
        o.LJIIIZ(clickType, "clickType");
        C83351WnT c83351WnT = this.LIZ.LJLLLL;
        if (c83351WnT != null && c83351WnT.LJIIIIZZ) {
            if (i >= 0) {
                if (c83351WnT != null && (list = c83351WnT.LJI) != null) {
                    obj = ORZ.LJLLLL(list);
                } else {
                    obj = null;
                }
                if (obj instanceof C83326Wn4) {
                    this.LIZ.P(i);
                }
            }
            this.LIZIZ.LIZ(clickType, i);
        }
    }
}
