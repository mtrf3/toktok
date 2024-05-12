package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessageKt;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.42h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029542h {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(AbstractC89473fD event, List messageList, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        C109544Rq c109544Rq;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(messageList, "messageList");
        boolean LIZ2 = C1031943f.LIZ((C109544Rq) ORZ.LJLLLLLL(0, messageList));
        if (event instanceof C91233i3) {
            C91233i3 c91233i3 = (C91233i3) event;
            if (c91233i3.LIZIZ.getMsgStatus() != 2 && c91233i3.LIZIZ.getMsgStatus() != 3) {
                if (C93793mB.LJI(c91233i3.LIZIZ)) {
                    C109544Rq c109544Rq2 = c91233i3.LIZIZ;
                    o.LJIIIZ(c109544Rq2, "<this>");
                    if (o.LJ(c109544Rq2.getLocalExt().get("is_fast_send"), "1")) {
                        c109544Rq2.getLocalExt().remove("is_fast_send");
                    }
                }
            }
            if (!(!messageList.isEmpty()) || !C93793mB.LJIIL((C109544Rq) ORZ.LJLLLL(messageList)) || !((Boolean) interfaceC88472Yns.invoke(3)).booleanValue() || z || !LIZ2) {
                return false;
            }
        } else if (event instanceof C89463fC) {
            if (C117294iz.LIZ()) {
                return ((Boolean) interfaceC88472Yns.invoke(0)).booleanValue();
            }
        } else if (event instanceof C1032443k) {
            if (!((Boolean) interfaceC88472Yns.invoke(3)).booleanValue() || z) {
                return false;
            }
            if (!C93793mB.LJIIL((C109544Rq) ORZ.LJLLLL(messageList)) && !LIZ2) {
                return false;
            }
        } else {
            if (event instanceof C91603ie) {
                C91603ie c91603ie = (C91603ie) event;
                if (c91603ie.LIZ != AbstractC63551Owt.LIZ) {
                    return false;
                }
                C109544Rq c109544Rq3 = c91603ie.LIZIZ;
                if (c109544Rq3.getMsgType() == 4000) {
                    return true;
                }
                if (!FakeMessageKt.isFakeMessage(c109544Rq3) && !((Boolean) interfaceC88472Yns2.invoke(c109544Rq3)).booleanValue()) {
                    return true;
                }
                C89163ei LIZ3 = C96963rI.LIZ();
                C109544Rq c109544Rq4 = (C109544Rq) ORZ.LJLLLLLL(0, messageList);
                LIZ3.getClass();
                if (!C89163ei.LJ(c109544Rq4) && ((c109544Rq = (C109544Rq) ORZ.LJLLLLLL(0, messageList)) == null || !C93793mB.LJI(c109544Rq))) {
                    return false;
                }
                return true;
            }
            if (!(event instanceof C91583ic) || !(!((C91583ic) event).LIZ.isEmpty())) {
                return false;
            }
            return ((Boolean) interfaceC88472Yns.invoke(2)).booleanValue();
        }
        return true;
    }
}
