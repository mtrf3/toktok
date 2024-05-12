package X;

import Y.ACallableS29S1100000_1;
import Y.IDcS364S0100000_1;
import Y.IDhS94S0100000_1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4Hk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106884Hk implements C44L {
    public final InterfaceC106914Hn LIZ = new InterfaceC106914Hn() { // from class: X.44C
        public final C3Q9 LIZ;

        {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            this.LIZ = C4WC.LIZIZ;
        }

        @Override // X.InterfaceC106914Hn
        public final boolean LIZ(String str) {
            return this.LIZ.LJIIIIZZ(str);
        }

        @Override // X.InterfaceC106914Hn
        public final CallableC73655SvT LIZIZ(String str) {
            C3Q9 c3q9 = this.LIZ;
            o.LJIIIZ(c3q9, "<this>");
            return new CallableC73655SvT(new ACallableS29S1100000_1(c3q9, str, 1));
        }

        @Override // X.InterfaceC106914Hn
        public final void LIZJ(String str) {
            this.LIZ.LIZJ(str);
        }

        @Override // X.InterfaceC106914Hn
        public final C73579SuF LJ(final String conversationId) {
            o.LJIIIZ(conversationId, "conversationId");
            final C3Q9 c3q9 = this.LIZ;
            o.LJIIIZ(c3q9, "<this>");
            return AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.3eQ
                @Override // X.InterfaceC66992k3
                public final void subscribe(InterfaceC65052gv<C63120Opw> interfaceC65052gv) {
                    long LIZLLL = C81273Gx.LIZLLL(conversationId);
                    int LJ = C96413qP.LIZ.LJ(conversationId);
                    if (LIZLLL > 0 && LJ >= 0) {
                        c3q9.LJI(LJ, new IDcS364S0100000_1((C73578SuE) interfaceC65052gv, 20), String.valueOf(LIZLLL));
                    } else {
                        ((C73578SuE) interfaceC65052gv).tryOnError(new IllegalArgumentException(C61845OOz.LIZ("createSingleConversation() uid invalid: uid = ", LIZLLL)));
                    }
                }
            });
        }

        @Override // X.InterfaceC106914Hn
        public final CallableC73655SvT LJFF(String conversationId) {
            o.LJIIIZ(conversationId, "conversationId");
            C3Q9 c3q9 = this.LIZ;
            o.LJIIIZ(c3q9, "<this>");
            return new CallableC73655SvT(new ACallableS29S1100000_1(c3q9, conversationId, 2));
        }

        @Override // X.InterfaceC106914Hn
        public final AbstractC90763hI create(String conversationId) {
            o.LJIIIZ(conversationId, "conversationId");
            return C81273Gx.LIZ(conversationId);
        }

        @Override // X.InterfaceC106914Hn
        public final C73653SvR LIZLLL(String conversationId, final java.util.Map map) {
            o.LJIIIZ(conversationId, "conversationId");
            final AbstractC90763hI create = create(conversationId);
            o.LJIIIZ(create, "<this>");
            return new C73653SvR(AbstractC73635Sv9.LJ(new InterfaceC73518StG() { // from class: X.452
                @Override // X.InterfaceC73518StG
                public final void LIZ(C73516StE c73516StE) {
                    AbstractC90763hI.this.LJIJJ(map, new IDcS364S0100000_1(c73516StE, 21));
                }
            }));
        }
    };
    public final ConcurrentHashMap<String, AbstractC90763hI> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.C44L
    public final boolean LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // X.C44L
    public final AbstractC73635Sv9<C63120Opw> LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // X.C44L
    public final C73540Stc LIZJ(final String str) {
        CallableC73655SvT LJFF = this.LIZ.LJFF(str);
        InterfaceC48038ItG interfaceC48038ItG = new InterfaceC48038ItG() { // from class: X.4Hl
            public final /* synthetic */ String LJLIL = "awe:greet_emoji";

            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                C63120Opw it = (C63120Opw) obj;
                o.LJIIIZ(it, "it");
                java.util.Map<String, String> localExt = it.getLocalExt();
                if (localExt != null && localExt.containsKey(this.LJLIL)) {
                    localExt.remove(this.LJLIL);
                    return C106884Hk.this.LIZ.LIZLLL(str, localExt);
                }
                return C115724gS.LJLIL;
            }
        };
        LJFF.getClass();
        return new C73540Stc(LJFF, interfaceC48038ItG);
    }

    @Override // X.C44L
    public final C73429Srp LIZLLL(final String conversationId) {
        AbstractC90763hI putIfAbsent;
        o.LJIIIZ(conversationId, "conversationId");
        ConcurrentHashMap<String, AbstractC90763hI> concurrentHashMap = this.LIZIZ;
        AbstractC90763hI abstractC90763hI = concurrentHashMap.get(conversationId);
        if (abstractC90763hI == null && (putIfAbsent = concurrentHashMap.putIfAbsent(conversationId, (abstractC90763hI = this.LIZ.create(conversationId)))) != null) {
            abstractC90763hI = putIfAbsent;
        }
        o.LJIIIIZZ(abstractC90763hI, "activeConv.getOrPut(conv….create(conversationId) }");
        final AbstractC90763hI abstractC90763hI2 = abstractC90763hI;
        return new AbstractC73672Svk<C40S>(abstractC90763hI2) { // from class: X.44S
            public final AbstractC90763hI LJLIL;

            {
                this.LJLIL = abstractC90763hI2;
            }

            @Override // X.AbstractC73672Svk
            public final void LJJJZ(InterfaceC116954iR<? super C40S> observer) {
                o.LJIIIZ(observer, "observer");
                C44Q c44q = new C44Q(this.LJLIL, observer);
                observer.onSubscribe(c44q);
                this.LJLIL.LJIIL(c44q);
            }
        }.LJIILLIIL(new InterfaceC29937Boz() { // from class: X.4Ho
            @Override // X.InterfaceC29937Boz
            public final void run() {
                C106884Hk.this.LIZIZ.remove(conversationId);
            }
        });
    }

    @Override // X.C44L
    public final C73634Sv8 LJ(final String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        CallableC73655SvT LJFF = this.LIZ.LJFF(conversationId);
        C73579SuF LJ = this.LIZ.LJ(conversationId);
        LJFF.getClass();
        C73320Sq4.LIZ(LJ, "other is null");
        return new C73503St1(LJFF, LJ).LJIILL(new InterfaceC48038ItG() { // from class: X.4Hm
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                C63120Opw it = (C63120Opw) obj;
                o.LJIIIZ(it, "it");
                if (it.isTemp()) {
                    return C106884Hk.this.LIZ.LJ(conversationId);
                }
                return AbstractC73638SvC.LJIJ(it);
            }
        }).LJIJI(new IDhS94S0100000_1(this, 13));
    }
}
