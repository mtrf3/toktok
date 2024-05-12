package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7jC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193867jC {
    public static void LIZ(InterfaceC193877jD interfaceC193877jD, AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        if (cellState instanceof C193837j9) {
            interfaceC193877jD.LLLZIL(nowPostCellState);
            return;
        }
        if (cellState instanceof C193907jG) {
            interfaceC193877jD.y1(nowPostCellState);
            return;
        }
        if (cellState instanceof C193847jA) {
            interfaceC193877jD.LLLLLLLZIL(nowPostCellState);
            return;
        }
        if (cellState instanceof C193857jB) {
            interfaceC193877jD.LLZL(nowPostCellState);
        } else if (cellState instanceof C193887jE) {
            interfaceC193877jD.t1(nowPostCellState);
        } else {
            if (!(cellState instanceof C193897jF)) {
                return;
            }
            interfaceC193877jD.x1(nowPostCellState);
        }
    }
}
