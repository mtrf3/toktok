package X;

import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;

/* renamed from: X.Xa4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85068Xa4 implements XOL {
    public final C85099XaZ LIZ;
    public final C85069Xa5 LIZIZ;
    public final C85080XaG LIZJ;

    public C85068Xa4() {
        C85099XaZ c85099XaZ = new C85099XaZ();
        C85069Xa5 c85069Xa5 = new C85069Xa5(c85099XaZ);
        C85080XaG c85080XaG = new C85080XaG();
        this.LIZ = c85099XaZ;
        this.LIZIZ = c85069Xa5;
        this.LIZJ = c85080XaG;
    }

    public final XOX LIZIZ() {
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (c85069Xa5.LIZ()) {
            int i = c85069Xa5.LIZIZ().LIZIZ().LIZ.LJIIL;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return XOX.PLAYBACK_STATE_STOPPED;
                        }
                        return XOX.PLAYBACK_STATE_ERROR;
                    }
                    return XOX.PLAYBACK_STATE_PAUSED;
                }
                return XOX.PLAYBACK_STATE_PLAYING;
            }
            return XOX.PLAYBACK_STATE_STOPPED;
        }
        return XOX.PLAYBACK_STATE_STOPPED;
    }

    public final long LIZJ() {
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (!c85069Xa5.LIZ()) {
            return 0L;
        }
        if (!c85069Xa5.LIZIZ().LIZIZ) {
            return 0L;
        }
        return r3.LIZIZ().LJIJ();
    }

    public final long LIZLLL() {
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (c85069Xa5.LIZ()) {
            return c85069Xa5.LIZIZ().LIZ();
        }
        return 0L;
    }

    @Override // X.XOL
    public final void LIZ(C84735XNj c84735XNj) {
        C85080XaG c85080XaG = this.LIZJ;
        c85080XaG.getClass();
        C34K c34k = new C34K();
        c85080XaG.LIZ.LIZ(new AqS181S0100000_15(c34k, c84735XNj, 243));
        if (c34k.element) {
            return;
        }
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (c85069Xa5.LIZ()) {
            C85089XaP LIZIZ = c85069Xa5.LIZIZ();
            LIZIZ.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZIZ);
            LIZ.append("  -> resume");
            X1D.LIZIZ(LIZ);
            LIZIZ.LIZJ();
        }
    }

    public final void LJ(C84735XNj c84735XNj) {
        C85080XaG c85080XaG = this.LIZJ;
        c85080XaG.getClass();
        C34K c34k = new C34K();
        c85080XaG.LIZ.LIZ(new AqS181S0100000_15(c34k, c84735XNj, 242));
        if (c34k.element) {
            return;
        }
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (c85069Xa5.LIZ()) {
            C85089XaP LIZIZ = c85069Xa5.LIZIZ();
            LIZIZ.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZIZ);
            LIZ.append("  -> pause");
            X1D.LIZIZ(LIZ);
            LIZIZ.LIZIZ().LJJL();
        }
    }

    public final void LJI(long j) {
        XOX xox;
        C85080XaG c85080XaG = this.LIZJ;
        c85080XaG.getClass();
        C34K c34k = new C34K();
        c85080XaG.LIZ.LIZ(new AqS181S0100000_15(j, c34k, 244));
        if (c34k.element) {
            return;
        }
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (c85069Xa5.LIZ()) {
            int i = c85069Xa5.LIZIZ().LIZIZ().LIZ.LJIIL;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xox = XOX.PLAYBACK_STATE_STOPPED;
                        } else {
                            xox = XOX.PLAYBACK_STATE_ERROR;
                        }
                    } else {
                        xox = XOX.PLAYBACK_STATE_PAUSED;
                    }
                } else {
                    xox = XOX.PLAYBACK_STATE_PLAYING;
                }
            } else {
                xox = XOX.PLAYBACK_STATE_STOPPED;
            }
            if (xox != XOX.PLAYBACK_STATE_STOPPED) {
                c85069Xa5.LIZ.LIZLLL(EnumC80000VaW.SEEKING, j);
                C85089XaP LIZIZ = c85069Xa5.LIZIZ();
                C85075XaB c85075XaB = new C85075XaB(c85069Xa5);
                LIZIZ.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LIZIZ);
                LIZ.append("  -> seekToTime: -> ");
                LIZ.append(j);
                X1D.LIZIZ(LIZ);
                if (!LIZIZ.LJ) {
                    long j2 = 0;
                    if (j >= 0) {
                        LIZIZ.LJ = true;
                        long LIZ2 = LIZIZ.LIZ() - 0;
                        if (0 < LIZ2) {
                            j2 = LIZ2;
                        }
                        if (j > j2) {
                            j = j2;
                        }
                        LIZIZ.LIZIZ().LJJLIIIJLJLI((int) j, new C85073Xa9(LIZIZ, c85075XaB, j));
                        return;
                    }
                }
                c85075XaB.LIZ(j, false);
                return;
            }
            c85069Xa5.LIZIZ().LJFF((int) j);
        }
    }

    public final void LJII(C84735XNj c84735XNj) {
        C85080XaG c85080XaG = this.LIZJ;
        c85080XaG.getClass();
        C34K c34k = new C34K();
        c85080XaG.LIZ.LIZ(new AqS181S0100000_15(c34k, c84735XNj, 245));
        if (c34k.element) {
            return;
        }
        this.LIZIZ.LIZJ();
    }

    public final void LJFF(C84735XNj c84735XNj, int i) {
        InterfaceC85087XaN interfaceC85087XaN;
        C85080XaG c85080XaG = this.LIZJ;
        InterfaceC85083XaJ interfaceC85083XaJ = this.LIZIZ.LIZLLL;
        c85080XaG.getClass();
        C34K c34k = new C34K();
        c85080XaG.LIZ.LIZ(new AqS146S0200000_15(c34k, c84735XNj, interfaceC85083XaJ, 41));
        YBK.LIZ.getClass();
        YBK.LIZJ();
        if (c34k.element) {
            return;
        }
        C85069Xa5 c85069Xa5 = this.LIZIZ;
        if (c85069Xa5.LIZ()) {
            boolean z = c85069Xa5.LJFF;
            if (!c85069Xa5.LJFF) {
                c85069Xa5.LJFF = true;
                c85069Xa5.LIZ.LJ(XOX.PLAYBACK_STATE_START);
            }
            if (i > 0) {
                c85069Xa5.LIZIZ().LJFF(i);
            }
            InterfaceC85083XaJ interfaceC85083XaJ2 = c85069Xa5.LIZLLL;
            if (interfaceC85083XaJ2 != null) {
                interfaceC85087XaN = interfaceC85083XaJ2.LIZ();
            } else {
                interfaceC85087XaN = null;
            }
            if (z || interfaceC85083XaJ2 == null || !(interfaceC85087XaN instanceof C85086XaM)) {
                c85069Xa5.LIZIZ().LIZJ();
            } else {
                interfaceC85087XaN.getClass();
                throw null;
            }
        }
    }
}
