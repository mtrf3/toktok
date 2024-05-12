package X;

import Y.AfS55S0100000_3;
import Y.IDaS219S0100000_9;
import Y.IDhS70S0200000_9;
import Y.IDuS320S0100000_9;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MVs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56924MVs extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ HandlerC56918MVm LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56924MVs(HandlerC56918MVm handlerC56918MVm) {
        super(0);
        this.LJLIL = handlerC56918MVm;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        List LLJI;
        if (this.LJLIL.LJIIIIZZ().isEmpty()) {
            C221018lt.LJFF("NoticeVideoManager", "requestData but aid list empty");
        } else {
            List LLJILJILJ = ORZ.LLJILJILJ(this.LJLIL.LJIIIIZZ());
            List LLJILJILJ2 = ORZ.LLJILJILJ(LLJILJILJ);
            this.LJLIL.LJIIIIZZ().clear();
            this.LJLIL.LJFF().addAll(LLJILJILJ);
            ArrayList arrayList = new ArrayList();
            while (true) {
                ArrayList arrayList2 = (ArrayList) LLJILJILJ;
                if (!(!arrayList2.isEmpty())) {
                    break;
                }
                if (arrayList2.size() >= 10) {
                    LLJI = ORZ.LLJI(arrayList2.subList(0, 10));
                } else {
                    LLJI = ORZ.LLJI(LLJILJILJ);
                }
                arrayList2.removeAll(LLJI);
                this.LJLIL.getClass();
                arrayList.add(AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(LLJI, 2)).LJJL(T16.LIZ()).LJJIJL(new IDhS70S0200000_9(this.LJLIL, LLJI, 0)));
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("requestData, aids:");
            LIZ.append(LLJILJILJ2);
            LIZ.append(", requests:");
            LIZ.append(arrayList.size());
            C221018lt.LJFF("NoticeVideoManager", X1D.LIZIZ(LIZ));
            C73428Sro LJJL = AbstractC73672Svk.LJIIIZ(arrayList).LJJL(T16.LIZ());
            HandlerC56918MVm handlerC56918MVm = this.LJLIL;
            LJJL.LJJJLL(new AfS55S0100000_3(handlerC56918MVm, 33), new InterfaceC64592gB() { // from class: X.7an
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    C221018lt.LIZJ("NoticeVideoManager", "requestData un-expected error", (Throwable) obj);
                }
            }, new IDaS219S0100000_9(handlerC56918MVm, 2));
        }
        return C76800UCe.LIZ;
    }
}
