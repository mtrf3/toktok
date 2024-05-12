package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3JQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JQ implements C3JJ, InterfaceC787037a {
    public static final /* synthetic */ int LJLJJL = 0;
    public final C3JH LJLIL = new C3JH();
    public final java.util.Map<C81983Jq, C3JS> LJLILLLLZI = new ConcurrentHashMap();
    public final C3JZ LJLJI = new C4WS() { // from class: X.3JZ
        @Override // X.C4WS
        public final void LJI() {
        }

        @Override // X.C4WS
        public final void LJII() {
        }

        @Override // X.C4WS
        public final void LJIIJJI(C81913Jj result, C4WE onFilterResult) {
            o.LJIIIZ(result, "result");
            o.LJIIIZ(onFilterResult, "onFilterResult");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onQueryConversation, isFastMode=");
            LIZ.append(result.LJLJJLL);
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
            if (o.LJ(result.LJLIL.LJLIL, "legacy")) {
                C34B.LIZJ("SessionRefactor-SessionListDataSource", "this query is legacy, should now happen");
            }
            if (o.LJ(result.LJLIL.LJLIL, "preload")) {
                C3JQ c3jq = C3JQ.this;
                c3jq.LJII(new C3JV(result, c3jq, onFilterResult, null));
            } else {
                C3JQ c3jq2 = C3JQ.this;
                c3jq2.LJII(new C3JW(result, c3jq2, onFilterResult, null));
            }
        }
    };
    public final C81673Il LJLJJI = new C4WV() { // from class: X.3Il
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

        @Override // X.InterfaceC120024nO
        public final void f3(C63120Opw c63120Opw) {
            if (c63120Opw == null) {
                return;
            }
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", "onDeleteConversation");
            C3JQ c3jq = C3JQ.this;
            c3jq.LJII(new C81643Ii(c63120Opw, c3jq, null));
        }

        @Override // X.InterfaceC120024nO
        public final void we0(C63120Opw c63120Opw) {
            if (c63120Opw == null) {
                return;
            }
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", "onCreateConversation");
            C3JQ c3jq = C3JQ.this;
            c3jq.LJII(new C81663Ik(c63120Opw, c3jq, null));
        }

        @Override // X.InterfaceC120024nO
        public final void y9(int i, C63120Opw c63120Opw) {
            if (c63120Opw == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUpdateConversation : ");
            LIZ.append(c63120Opw.getConversationId());
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
            C3JQ c3jq = C3JQ.this;
            c3jq.LJII(new C81653Ij(c63120Opw, i, c3jq, null));
        }
    };

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        Iterator it = ((ConcurrentHashMap) this.LJLILLLLZI).values().iterator();
        while (it.hasNext()) {
            ((C3JS) it.next()).LIZLLL.clear();
        }
        ((ConcurrentHashMap) this.LJLILLLLZI).clear();
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJFF(this.LJLJJI);
        C75782yE.LIZ();
        C4WC.LIZIZ(this.LJLJI);
    }

    public static C81833Jb LIZJ(C81983Jq c81983Jq) {
        if (c81983Jq != null) {
            return C81843Jc.LIZLLL(c81983Jq);
        }
        return C81843Jc.LJ();
    }

    @Override // X.InterfaceC787037a
    public final void LIZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        C3JS c3js = (C3JS) ((ConcurrentHashMap) this.LJLILLLLZI).get(sessionPage);
        if (c3js == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("did not find the page: ");
            LIZ.append(sessionPage);
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
            return;
        }
        if (c3js.LJII) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(sessionPage);
            LIZ2.append(" is refreshing");
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ2));
            return;
        }
        c3js.LJII = true;
        LIZJ(sessionPage).LIZLLL(EnumC81823Ja.DATA_SOURCE, C3JU.REFRESH);
        synchronized (C3K5.LJLIL) {
            C3K5.LIZJ("refresh_start", null);
        }
        LJII(new C3JR(this, sessionPage, null));
    }

    @Override // X.InterfaceC787037a
    public final void LIZIZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        C3JS c3js = (C3JS) ((ConcurrentHashMap) this.LJLILLLLZI).get(sessionPage);
        if (c3js == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadMore did not find the sessionPage: ");
            LIZ.append(sessionPage);
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
            return;
        }
        c3js.LJIIIIZZ = false;
        if (c3js.LJI) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(sessionPage);
            LIZ2.append(" is loading more");
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ2));
            return;
        }
        c3js.LJI = true;
        C81833Jb LIZJ = LIZJ(sessionPage);
        java.util.Map<String, Long> map = LIZJ.LIZIZ;
        EnumC81823Ja enumC81823Ja = EnumC81823Ja.DATA_SOURCE;
        C3JU c3ju = C3JU.LOAD_MORE;
        if (!map.containsKey(C81843Jc.LIZ(enumC81823Ja, c3ju))) {
            LIZJ.LIZLLL(enumC81823Ja, c3ju);
        }
        LJII(new C3JX(this, sessionPage, null));
    }

    @Override // X.InterfaceC787037a
    public final void LJ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        C3JS c3js = (C3JS) ((ConcurrentHashMap) this.LJLILLLLZI).get(sessionPage);
        if (c3js == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stopLoadMore not found the target page: ");
            LIZ.append(sessionPage);
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
            return;
        }
        if (c3js.LJI) {
            c3js.LJIIIIZZ = true;
        }
    }

    @Override // X.InterfaceC787037a
    public final void LJFF(C3J5 c3j5) {
        C3JH c3jh = this.LJLIL;
        c3jh.getClass();
        c3jh.LJLIL = c3j5;
    }

    public final void LJI(final C81983Jq c81983Jq) {
        final C3JS c3js = (C3JS) ((ConcurrentHashMap) this.LJLILLLLZI).get(c81983Jq);
        if (c3js == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyTheLatestData: ");
        LIZ.append(c81983Jq);
        LIZ.append(' ');
        LIZ.append(c3js);
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
        InterfaceC88472Yns<? super InterfaceC81793Ix, C76800UCe> interfaceC88472Yns = this.LJLIL.LJLIL;
        if (interfaceC88472Yns != null) {
            final List LLJI = ORZ.LLJI(c3js.LIZLLL.values());
            interfaceC88472Yns.invoke(new InterfaceC81793Ix(LLJI, c3js, c81983Jq) { // from class: X.3JA
                public final List<C3L4> LIZ;
                public final C3JS LIZIZ;
                public final C81983Jq LIZJ;
                public final String LIZLLL;

                @Override // X.InterfaceC81793Ix
                public final String LIZ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC81793Ix
                public final C81983Jq LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC81793Ix
                public final C3J9 LIZJ(C3J9 oldSessionSourceData) {
                    o.LJIIIZ(oldSessionSourceData, "oldSessionSourceData");
                    C3JS c3js2 = this.LIZIZ;
                    if (c3js2 == null) {
                        return C3J9.LIZJ(oldSessionSourceData, this.LIZ, null, false, true, 6);
                    }
                    return C3J9.LIZJ(oldSessionSourceData, this.LIZ, null, c3js2.LIZJ, true, 2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    o.LJIIIZ(LLJI, "sessionList");
                    o.LJIIIZ(c81983Jq, "sessionPage");
                    this.LIZ = LLJI;
                    this.LIZIZ = c3js;
                    this.LIZJ = c81983Jq;
                    this.LIZLLL = "SessionListDataSource-BatchOperation";
                }
            });
        }
    }

    public final XKQ LJII(InterfaceC88471Ynr interfaceC88471Ynr) {
        return C771431a.LIZ().LJIIJJI(interfaceC88471Ynr);
    }

    @Override // X.InterfaceC787037a
    public final void LJIIIIZZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register: ");
        LIZ.append(sessionPage);
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
        ((ConcurrentHashMap) this.LJLILLLLZI).put(sessionPage, new C3JS(sessionPage));
    }

    @Override // X.InterfaceC787037a
    public final void LJIIIZ(C81983Jq sessionPage) {
        o.LJIIIZ(sessionPage, "sessionPage");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unregister: ");
        LIZ.append(sessionPage);
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
        ((ConcurrentHashMap) this.LJLILLLLZI).remove(sessionPage);
    }

    @Override // X.InterfaceC787037a
    public final void LJIILJJIL(C3J6 c3j6) {
        C3JH c3jh = this.LJLIL;
        c3jh.getClass();
        c3jh.LJLILLLLZI = c3j6;
    }
}
