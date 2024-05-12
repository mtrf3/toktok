package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3vc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99643vc implements InterfaceC99713vj {
    public final InterfaceC99713vj LIZIZ;
    public C91613if LIZJ;
    public final C99663ve LIZLLL;
    public final boolean LJ;

    @Override // X.InterfaceC99713vj
    public final void LIZIZ(int i) {
        this.LIZIZ.LIZIZ(i);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZJ(C109544Rq msg, boolean z, C102033zT c102033zT) {
        o.LJIIIZ(msg, "msg");
        this.LIZIZ.LIZJ(msg, z, c102033zT);
    }

    @Override // X.InterfaceC99713vj
    public final List<C109544Rq> LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC99713vj
    public final void LJFF() {
        this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC99713vj
    public final int LJII() {
        return this.LIZIZ.LJII();
    }

    @Override // X.InterfaceC99713vj
    public final String getConversationId() {
        return this.LIZIZ.getConversationId();
    }

    @Override // X.InterfaceC99713vj
    public final void refresh() {
        this.LIZIZ.refresh();
    }

    @Override // X.InterfaceC99713vj
    public final void resume() {
        this.LIZIZ.resume();
    }

    @Override // X.InterfaceC99713vj
    public final void stop() {
        this.LIZIZ.stop();
    }

    @Override // X.InterfaceC99713vj
    public final void LIZLLL() {
        if (this.LJ) {
            LJI(this.LIZLLL);
        }
        this.LIZIZ.LIZLLL();
    }

    public C99643vc(InterfaceC99713vj major) {
        o.LJIIIZ(major, "major");
        this.LIZIZ = major;
        C99663ve c99663ve = new C99663ve(new InterfaceC99673vf() { // from class: X.3vb
            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void M1(List<C109544Rq> list, boolean z) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void T1(C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void X8(java.util.Map map, int i, List list) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void ea(C109544Rq c109544Rq, boolean z) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void u7(int i, C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void v0(List<C109544Rq> list, boolean z) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void v6(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void y(C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void y5(int i, C63219OrX c63219OrX) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void K7(int i, String str, List list) {
                C99643vc c99643vc = C99643vc.this;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                c99643vc.LIZJ = new C91613if(list, i, str);
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
                o.LJIIIZ(extra, "extra");
            }
        });
        this.LIZLLL = c99663ve;
        this.LJ = C114414eL.LIZ();
        major.LIZ(c99663ve);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        if (this.LJ) {
            this.LIZIZ.LIZ(interfaceC99673vf);
        } else {
            this.LIZLLL.LJLILLLLZI.add(interfaceC99673vf);
        }
        C91613if c91613if = this.LIZJ;
        if (c91613if != null) {
            interfaceC99673vf.K7(c91613if.LIZIZ, c91613if.LIZJ, ORZ.LLJILJILJ(c91613if.LIZ));
        }
    }

    @Override // X.InterfaceC99713vj
    public final void LJI(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZIZ.LJI(observer);
    }
}
