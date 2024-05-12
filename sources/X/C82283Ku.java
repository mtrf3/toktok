package X;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.3Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82283Ku implements InterfaceC787037a, InterfaceC83423Pe, C4WS, C4WV, C3JJ {
    public final C3JH LJLIL = new C3JH();
    public final java.util.Map<String, C63120Opw> LJLILLLLZI = new ConcurrentHashMap();
    public volatile C3L2 LJLJI;
    public C3LG LJLJJI;

    @Override // X.InterfaceC120024nO
    public final void BH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void CN(C63120Opw c63120Opw) {
    }

    @Override // X.InterfaceC120024nO
    public final void DH(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final int JG() {
        return 0;
    }

    @Override // X.InterfaceC787037a
    public final void LIZIZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        this.LJLIL.getClass();
    }

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC787037a
    public final void LJ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        this.LJLIL.getClass();
    }

    @Override // X.C4WS
    public final void LJI() {
    }

    @Override // X.C4WS
    public final void LJII() {
    }

    @Override // X.InterfaceC787037a
    public final void LJIIIIZZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        this.LJLIL.getClass();
    }

    @Override // X.InterfaceC787037a
    public final void LJIIIZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        this.LJLIL.getClass();
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC120024nO
    public final void MO(List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(String str, List<C63089OpR> list) {
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
    }

    @Override // X.C4WP
    public final void dU(java.util.Map<String, C63120Opw> map) {
    }

    @Override // X.InterfaceC120024nO
    public final void hW(int i, String str) {
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(int i, String str, List list) {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        C81843Jc.LIZJ("SessionRefactor-MessageRequestDataSource", "finish working");
        EventBus.LIZJ().LJIJ(this);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        C4WC.LJIL(this);
        C75782yE.LIZ();
        c4wc.LJIIIZ(this);
        C82233Kp.LIZ();
        C106774Gz.LJI(this);
        this.LJLJJI = null;
        this.LJLJI = null;
        ((ConcurrentHashMap) this.LJLILLLLZI).clear();
    }

    public final void LJIIZILJ() {
        LJIILLIIL(new C82293Kv(this, null));
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        EventBus.LIZJ().LJIILJJIL(this);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        C4WC.LIZIZ(this);
        C75782yE.LIZ();
        c4wc.LJFF(this);
        C82233Kp.LIZ();
        C106774Gz.LIZLLL(this);
    }

    public final C63120Opw LJIILL() {
        if (C3U8.LIZ()) {
            return (C63120Opw) ORZ.LJLLLL(ORZ.LLILII(new Comparator() { // from class: X.3LN
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    C63120Opw c63120Opw = (C63120Opw) obj;
                    C63120Opw c63120Opw2 = (C63120Opw) obj2;
                    if (c63120Opw2.getUpdatedTime() - c63120Opw.getUpdatedTime() > 0) {
                        return 1;
                    }
                    if (c63120Opw2.getUpdatedTime() == c63120Opw.getUpdatedTime()) {
                        return 0;
                    }
                    return -1;
                }
            }, ((ConcurrentHashMap) this.LJLILLLLZI).values()));
        }
        return null;
    }

    @Override // X.InterfaceC787037a
    public final void LIZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        LJIILLIIL(new C3L6(this, null));
    }

    @Override // X.InterfaceC83423Pe
    public final void LIZJ(C3LB c3lb) {
        LJIILLIIL(new C82273Kt(c3lb, this, null));
    }

    @Override // X.InterfaceC787037a
    public final void LJFF(C3J5 c3j5) {
        C3JH c3jh = this.LJLIL;
        c3jh.getClass();
        c3jh.LJLIL = c3j5;
    }

    @Override // X.InterfaceC787037a
    public final void LJIILJJIL(C3J6 c3j6) {
        C3JH c3jh = this.LJLIL;
        c3jh.getClass();
        c3jh.LJLILLLLZI = c3j6;
    }

    public final XKQ LJIILLIIL(InterfaceC88471Ynr interfaceC88471Ynr) {
        return C771431a.LIZ().LJIIJJI(interfaceC88471Ynr);
    }

    @Override // X.InterfaceC120024nO
    public final void f3(C63120Opw c63120Opw) {
        LJIILLIIL(new C82333Kz(c63120Opw, this, null));
    }

    @QD3
    public final void onEvent(C31M event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RefreshStrangerEvent: ");
        LIZ.append(event);
        C81843Jc.LIZJ("SessionRefactor-MessageRequestDataSource", X1D.LIZIZ(LIZ));
        C31N.LIZ();
    }

    @Override // X.InterfaceC120024nO
    public final void we0(C63120Opw c63120Opw) {
        LJIILLIIL(new C82313Kx(c63120Opw, this, null));
    }

    @Override // X.C4WS
    public final void LJIIJJI(C81913Jj result, C4WE onFilterResult) {
        o.LJIIIZ(result, "result");
        o.LJIIIZ(onFilterResult, "onFilterResult");
        LJIILLIIL(new C82303Kw(result, this, null));
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
        LJIILLIIL(new C82323Ky(c63120Opw, this, null));
    }
}
