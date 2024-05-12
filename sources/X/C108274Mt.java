package X;

import Y.IDcS133S0200000_1;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108274Mt extends AbstractC108314Mx {
    public final EnumC97443s4 LJLJJI;
    public final int LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C81963Jo LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public final C64962gm LJLLI;
    public AbstractC108324My LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final C108224Mo LJLLLL;
    public final C108244Mq LJLLLLLL;

    @Override // X.AbstractC108304Mw
    public final boolean LJ() {
        AbstractC108324My abstractC108324My = this.LJLLILLLL;
        if (abstractC108324My != null) {
            if (abstractC108324My.LJ() || this.LJLJLJ) {
                return true;
            }
            return false;
        }
        o.LJIJI("strangerProvider");
        throw null;
    }

    @Override // X.AbstractC108304Mw
    public final void LJFF() {
        if (this.LJLLJ) {
            AbstractC108324My abstractC108324My = this.LJLLILLLL;
            if (abstractC108324My != null) {
                abstractC108324My.LJFF();
            } else {
                o.LJIJI("strangerProvider");
                throw null;
            }
        }
        if (!this.LJLJLLL) {
            return;
        }
        C63322OtC.LJI("FilteredListModelImpl", "begin loadMore", null);
        this.LJLJLJ = true;
        try {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C4WC.LJIJJLI(this.LJLL, this.LJLJJL, this.LJLJL);
        } catch (Exception e) {
            C63322OtC.LJI("FilteredListModelImpl", "Exception during loadMore", e);
            this.LJLJLJ = false;
            C4W6 c4w6 = this.LJLILLLLZI;
            if (c4w6 != null) {
                C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
                c63623Oy3.LIZJ = "load more failed";
                c4w6.ZS(c63623Oy3);
            }
        }
    }

    @Override // X.AbstractC108304Mw
    public final void LJI() {
        if (this.LJLLJ) {
            AbstractC108324My abstractC108324My = this.LJLLILLLL;
            if (abstractC108324My != null) {
                abstractC108324My.LJI();
            } else {
                o.LJIJI("strangerProvider");
                throw null;
            }
        }
        this.LJLJLJ = true;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LJIJJLI(this.LJLL, this.LJLJJL, this.LJLJL);
    }

    @Override // X.AbstractC108304Mw
    public final void LJII() {
        if (this.LJLLJ) {
            AbstractC108324My abstractC108324My = this.LJLLILLLL;
            if (abstractC108324My != null) {
                abstractC108324My.LJII();
            } else {
                o.LJIJI("strangerProvider");
                throw null;
            }
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJIIIZ(this.LJLLLLLL);
        C75782yE.LIZ();
        C4WC.LJIL(this.LJLLLL);
        C48841JEv.LIZJ(this.LJLLI, null);
    }

    public final ConcurrentHashMap<String, C63120Opw> LJIIIZ() {
        return (ConcurrentHashMap) this.LJLJJLL.getValue();
    }

    public final void LJIIJ() {
        XKX.LIZLLL(this.LJLLI, null, null, new C108264Ms(this, null), 3);
    }

    @Override // X.AbstractC108304Mw
    public final void LIZLLL() {
        C115394fv LJII = C115394fv.LJII();
        EnumC97443s4 enumC97443s4 = this.LJLJJI;
        LJII.getClass();
        C63322OtC.LJFF("StrangerManager deleteAllConversation");
        RunnableC63345OtZ.LJ(new IDcS133S0200000_1(LJII, enumC97443s4, 3), null, false);
        XKX.LIZLLL(this.LJLLI, null, null, new C108284Mu(this, null), 3);
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void Gy() {
        LJIIJ();
    }

    @Override // X.AbstractC108304Mw
    public final void LIZ(List<? extends C63120Opw> list) {
        C115394fv.LJII().LIZ(list, this.LJLJJI);
    }

    @Override // X.AbstractC108304Mw
    public final void LIZIZ(List<? extends C63120Opw> list) {
        C115394fv.LJII().LIZIZ(list, this.LJLJJI);
    }

    @Override // X.AbstractC108304Mw
    public final void LIZJ(C4W9... c4w9Arr) {
        super.LIZJ((C4W9[]) Arrays.copyOf(c4w9Arr, c4w9Arr.length));
        C63322OtC.LJI("FilteredListModelImpl", "bind observer", null);
        if (this.LJLLJ) {
            AbstractC108324My abstractC108324My = this.LJLLILLLL;
            if (abstractC108324My != null) {
                abstractC108324My.LIZJ((C4W9[]) Arrays.copyOf(c4w9Arr, c4w9Arr.length));
            } else {
                o.LJIJI("strangerProvider");
                throw null;
            }
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC.LIZIZ.LJFF(this.LJLLLLLL);
        C75782yE.LIZ();
        C4WC.LIZIZ(this.LJLLLL);
        C75782yE.LIZ();
        LJIIJJI(this, C4WC.LJIILIIL());
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void ZS(C63623Oy3 c63623Oy3) {
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.ZS(c63623Oy3);
        }
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void f3(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        LJIIJ();
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void nS(List<? extends C63120Opw> list) {
        o.LJIIIZ(list, "list");
        LJIIJ();
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void ri(C63623Oy3 error) {
        o.LJIIIZ(error, "error");
        C4W6 c4w6 = this.LJLILLLLZI;
        if (c4w6 != null) {
            c4w6.ri(error);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.4Mo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.4Mq] */
    public C108274Mt(int i, EnumC97443s4 type) {
        o.LJIIIZ(type, "type");
        this.LJLJJI = type;
        this.LJLJJL = i;
        this.LJLJJLL = C221108m2.LIZIZ(C108334Mz.LJLIL);
        this.LJLJL = new C81963Jo("FilteredList", 0);
        this.LJLJLLL = true;
        this.LJLL = Long.MAX_VALUE;
        this.LJLLI = C48841JEv.LIZ(C78613UtF.LIZ);
        this.LJLLL = true;
        this.LJLLLL = new C4WS() { // from class: X.4Mo
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
                if (!o.LJ(result.LJLIL.LJLIL, C108274Mt.this.LJLJL.LJLIL)) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("conversation page list loaded, hasMore ");
                LIZ.append(result.LJLJI);
                C63322OtC.LJI("FilteredListModelImpl", X1D.LIZIZ(LIZ), null);
                C108274Mt c108274Mt = C108274Mt.this;
                c108274Mt.LJLJLLL = result.LJLJI;
                c108274Mt.LJLL = result.LJLJJI;
                c108274Mt.LJLJLJ = false;
                C108274Mt.LJIIJJI(c108274Mt, result.LJLILLLLZI);
            }
        };
        this.LJLLLLLL = new C4WV() { // from class: X.4Mq
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

            @Override // X.InterfaceC120024nO
            public final void hW(int i2, String str) {
            }

            @Override // X.InterfaceC120024nO
            public final void tq0(int i2, String str, List list) {
            }

            @Override // X.InterfaceC120024nO
            public final void we0(C63120Opw c63120Opw) {
            }

            @Override // X.C4WP
            public final void dU(java.util.Map<String, C63120Opw> map) {
                List list;
                Collection values;
                C108274Mt c108274Mt = C108274Mt.this;
                c108274Mt.LJLJLJ = false;
                c108274Mt.LJIIIZ().clear();
                C108274Mt c108274Mt2 = C108274Mt.this;
                if (map != null && (values = ((ConcurrentHashMap) map).values()) != null) {
                    list = ORZ.LLJI(values);
                } else {
                    list = null;
                }
                C108274Mt.LJIIJJI(c108274Mt2, list);
            }

            @Override // X.InterfaceC120024nO
            public final void f3(C63120Opw c63120Opw) {
                String str;
                java.util.Set<String> keySet = C108274Mt.this.LJIIIZ().keySet();
                o.LJIIIIZZ(keySet, "filteredNormalConversationMap.keys");
                String str2 = null;
                if (c63120Opw != null) {
                    str = c63120Opw.getConversationId();
                } else {
                    str = null;
                }
                if (ORZ.LJLJJI(str, keySet)) {
                    ConcurrentHashMap<String, C63120Opw> LJIIIZ = C108274Mt.this.LJIIIZ();
                    if (c63120Opw != null) {
                        str2 = c63120Opw.getConversationId();
                    }
                    C65777Prh.LIZJ(LJIIIZ).remove(str2);
                    C108274Mt.this.LJIIJ();
                }
            }

            @Override // X.InterfaceC120024nO
            public final void y9(int i2, C63120Opw c63120Opw) {
                String str;
                ConcurrentHashMap<String, C63120Opw> LJIIIZ = C108274Mt.this.LJIIIZ();
                if (c63120Opw != null) {
                    str = c63120Opw.getConversationId();
                } else {
                    str = null;
                }
                o.LJI(str);
                LJIIIZ.put(str, c63120Opw);
                C108274Mt.this.LJIIJ();
            }
        };
    }

    public static void LJIIJJI(C108274Mt c108274Mt, List list) {
        XKX.LIZLLL(c108274Mt.LJLLI, null, null, new C108254Mr(list, null, c108274Mt, null), 3);
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void FA(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLLL = z;
        LJIIJ();
    }

    @Override // X.AbstractC108314Mx
    public final void LJIIIIZZ(AbstractC108324My abstractC108324My, boolean z) {
        this.LJLLILLLL = abstractC108324My;
        this.LJLLJ = z;
        abstractC108324My.LJIIIIZZ(this, z);
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void kc(List<? extends C63120Opw> list, boolean z) {
        o.LJIIIZ(list, "list");
        this.LJLLL = z;
        LJIIJ();
    }

    @Override // X.AbstractC108314Mx, X.C4W9
    public final void y9(int i, C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        LJIIJ();
    }
}
