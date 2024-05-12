package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99653vd implements InterfaceC99713vj {
    public final InterfaceC99713vj LIZIZ;
    public boolean LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C99663ve LJ;
    public final boolean LJFF;

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
        if (this.LJFF) {
            LJI(this.LJ);
        }
        this.LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC99713vj
    public final List<C109544Rq> LJ() {
        return LJIIIIZZ(ORZ.LLJILJILJ(this.LIZIZ.LJ()));
    }

    public C99653vd(InterfaceC99713vj major) {
        o.LJIIIZ(major, "major");
        this.LIZIZ = major;
        this.LIZJ = true;
        this.LIZLLL = C221108m2.LIZIZ(C99743vm.LJLIL);
        C99663ve c99663ve = new C99663ve(new InterfaceC99673vf() { // from class: X.3vg
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
            public final void M1(List<C109544Rq> list, boolean z) {
                int i;
                C99653vd c99653vd = C99653vd.this;
                boolean z2 = false;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i >= C99653vd.this.LIZIZ.LJII()) {
                    z2 = true;
                }
                c99653vd.LIZJ = z2;
                if (list != null) {
                    C99653vd.this.LJIIIIZZ(list);
                }
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void K7(int i, String str, List list) {
                int i2;
                C99653vd c99653vd = C99653vd.this;
                boolean z = false;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                if (i2 >= C99653vd.this.LIZIZ.LJII()) {
                    z = true;
                }
                c99653vd.LIZJ = z;
                if (list != null) {
                    C99653vd.this.LJIIIIZZ(list);
                }
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
                o.LJIIIZ(extra, "extra");
            }
        });
        this.LJ = c99663ve;
        this.LJFF = C114414eL.LIZ();
        major.LIZ(c99663ve);
    }

    @Override // X.InterfaceC99713vj
    public final void LIZ(InterfaceC99673vf interfaceC99673vf) {
        if (this.LJFF) {
            this.LIZIZ.LIZ(interfaceC99673vf);
        } else {
            this.LJ.LJLILLLLZI.add(interfaceC99673vf);
        }
    }

    @Override // X.InterfaceC99713vj
    public final void LJI(InterfaceC99673vf observer) {
        o.LJIIIZ(observer, "observer");
        this.LIZIZ.LJI(observer);
    }

    public final List<C109544Rq> LJIIIIZZ(List<C109544Rq> list) {
        if (!this.LIZJ) {
            Object value = this.LIZLLL.getValue();
            o.LJIIIIZZ(value, "<get-profileItemMsg>(...)");
            list = ORZ.LLIIIZ(C47261Igj.LJJIJ(value), list);
        }
        return ORZ.LLJILJILJ(list);
    }
}
